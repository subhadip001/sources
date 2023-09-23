package com.google.firebase.database.core;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.android.AndroidPlatform;
import com.google.firebase.database.connection.ConnectionContext;
import com.google.firebase.database.connection.ConnectionTokenProvider;
import com.google.firebase.database.connection.HostInfo;
import com.google.firebase.database.connection.PersistentConnection;
import com.google.firebase.database.core.TokenProvider;
import com.google.firebase.database.core.persistence.NoopPersistenceManager;
import com.google.firebase.database.core.persistence.PersistenceManager;
import com.google.firebase.database.core.utilities.DefaultRunLoop;
import com.google.firebase.database.logging.LogWrapper;
import com.google.firebase.database.logging.Logger;
import f.a.b.a.a;
import java.io.File;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public class Context {
    private static final long DEFAULT_CACHE_SIZE = 10485760;
    public TokenProvider appCheckTokenProvider;
    public TokenProvider authTokenProvider;
    public EventTarget eventTarget;
    public FirebaseApp firebaseApp;
    private PersistenceManager forcedPersistenceManager;
    public List<String> loggedComponents;
    public Logger logger;
    public boolean persistenceEnabled;
    public String persistenceKey;
    private Platform platform;
    public RunLoop runLoop;
    public String userAgent;
    public Logger.Level logLevel = Logger.Level.INFO;
    public long cacheSize = DEFAULT_CACHE_SIZE;
    private boolean frozen = false;
    private boolean stopped = false;

    private String buildUserAgent(String str) {
        StringBuilder E = a.E("Firebase/", "5", "/");
        E.append(FirebaseDatabase.getSdkVersion());
        E.append("/");
        E.append(str);
        return E.toString();
    }

    private void ensureAppTokenProvider() {
        Preconditions.checkNotNull(this.appCheckTokenProvider, "You must register an appCheckTokenProvider before initializing Context.");
    }

    private void ensureAuthTokenProvider() {
        Preconditions.checkNotNull(this.authTokenProvider, "You must register an authTokenProvider before initializing Context.");
    }

    private void ensureEventTarget() {
        if (this.eventTarget == null) {
            this.eventTarget = getPlatform().newEventTarget(this);
        }
    }

    private void ensureLogger() {
        if (this.logger == null) {
            this.logger = getPlatform().newLogger(this, this.logLevel, this.loggedComponents);
        }
    }

    private void ensureRunLoop() {
        if (this.runLoop == null) {
            this.runLoop = this.platform.newRunLoop(this);
        }
    }

    private void ensureSessionIdentifier() {
        if (this.persistenceKey == null) {
            this.persistenceKey = "default";
        }
    }

    private void ensureUserAgent() {
        if (this.userAgent == null) {
            this.userAgent = buildUserAgent(getPlatform().getUserAgent(this));
        }
    }

    private ScheduledExecutorService getExecutorService() {
        RunLoop runLoop = getRunLoop();
        if (runLoop instanceof DefaultRunLoop) {
            return ((DefaultRunLoop) runLoop).getExecutorService();
        }
        throw new RuntimeException("Custom run loops are not supported!");
    }

    private Platform getPlatform() {
        if (this.platform == null) {
            initializeAndroidPlatform();
        }
        return this.platform;
    }

    private void initServices() {
        ensureLogger();
        getPlatform();
        ensureUserAgent();
        ensureEventTarget();
        ensureRunLoop();
        ensureSessionIdentifier();
        ensureAuthTokenProvider();
        ensureAppTokenProvider();
    }

    private synchronized void initializeAndroidPlatform() {
        this.platform = new AndroidPlatform(this.firebaseApp);
    }

    private void restartServices() {
        this.eventTarget.restart();
        this.runLoop.restart();
    }

    private static ConnectionTokenProvider wrapTokenProvider(final TokenProvider tokenProvider, final ScheduledExecutorService scheduledExecutorService) {
        return new ConnectionTokenProvider() { // from class: f.h.e.j.e.c
            @Override // com.google.firebase.database.connection.ConnectionTokenProvider
            public final void getToken(boolean z, final ConnectionTokenProvider.GetTokenCallback getTokenCallback) {
                TokenProvider tokenProvider2 = TokenProvider.this;
                final ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
                tokenProvider2.getToken(z, new TokenProvider.GetTokenCompletionListener() { // from class: com.google.firebase.database.core.Context.1
                    @Override // com.google.firebase.database.core.TokenProvider.GetTokenCompletionListener
                    public void onError(final String str) {
                        ScheduledExecutorService scheduledExecutorService3 = scheduledExecutorService2;
                        final ConnectionTokenProvider.GetTokenCallback getTokenCallback2 = getTokenCallback;
                        scheduledExecutorService3.execute(new Runnable() { // from class: f.h.e.j.e.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                ConnectionTokenProvider.GetTokenCallback.this.onError(str);
                            }
                        });
                    }

                    @Override // com.google.firebase.database.core.TokenProvider.GetTokenCompletionListener
                    public void onSuccess(final String str) {
                        ScheduledExecutorService scheduledExecutorService3 = scheduledExecutorService2;
                        final ConnectionTokenProvider.GetTokenCallback getTokenCallback2 = getTokenCallback;
                        scheduledExecutorService3.execute(new Runnable() { // from class: f.h.e.j.e.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                ConnectionTokenProvider.GetTokenCallback.this.onSuccess(str);
                            }
                        });
                    }
                });
            }
        };
    }

    public void assertUnfrozen() {
        if (isFrozen()) {
            throw new DatabaseException("Modifications to DatabaseConfig objects must occur before they are in use");
        }
    }

    public void forcePersistenceManager(PersistenceManager persistenceManager) {
        this.forcedPersistenceManager = persistenceManager;
    }

    public synchronized void freeze() {
        if (!this.frozen) {
            this.frozen = true;
            initServices();
        }
    }

    public TokenProvider getAppCheckTokenProvider() {
        return this.appCheckTokenProvider;
    }

    public TokenProvider getAuthTokenProvider() {
        return this.authTokenProvider;
    }

    public ConnectionContext getConnectionContext() {
        return new ConnectionContext(getLogger(), wrapTokenProvider(getAuthTokenProvider(), getExecutorService()), wrapTokenProvider(getAppCheckTokenProvider(), getExecutorService()), getExecutorService(), isPersistenceEnabled(), FirebaseDatabase.getSdkVersion(), getUserAgent(), this.firebaseApp.getOptions().getApplicationId(), getSSLCacheDirectory().getAbsolutePath());
    }

    public EventTarget getEventTarget() {
        return this.eventTarget;
    }

    public Logger.Level getLogLevel() {
        return this.logLevel;
    }

    public Logger getLogger() {
        return this.logger;
    }

    public List<String> getOptDebugLogComponents() {
        return this.loggedComponents;
    }

    public long getPersistenceCacheSizeBytes() {
        return this.cacheSize;
    }

    public PersistenceManager getPersistenceManager(String str) {
        PersistenceManager persistenceManager = this.forcedPersistenceManager;
        if (persistenceManager != null) {
            return persistenceManager;
        }
        if (this.persistenceEnabled) {
            PersistenceManager createPersistenceManager = this.platform.createPersistenceManager(this, str);
            if (createPersistenceManager != null) {
                return createPersistenceManager;
            }
            throw new IllegalArgumentException("You have enabled persistence, but persistence is not supported on this platform.");
        }
        return new NoopPersistenceManager();
    }

    public String getPlatformVersion() {
        return getPlatform().getPlatformVersion();
    }

    public RunLoop getRunLoop() {
        return this.runLoop;
    }

    public File getSSLCacheDirectory() {
        return getPlatform().getSSLCacheDirectory();
    }

    public String getSessionPersistenceKey() {
        return this.persistenceKey;
    }

    public String getUserAgent() {
        return this.userAgent;
    }

    public boolean isFrozen() {
        return this.frozen;
    }

    public boolean isPersistenceEnabled() {
        return this.persistenceEnabled;
    }

    public boolean isStopped() {
        return this.stopped;
    }

    public PersistentConnection newPersistentConnection(HostInfo hostInfo, PersistentConnection.Delegate delegate) {
        return getPlatform().newPersistentConnection(this, getConnectionContext(), hostInfo, delegate);
    }

    public void requireStarted() {
        if (this.stopped) {
            restartServices();
            this.stopped = false;
        }
    }

    public void stop() {
        this.stopped = true;
        this.eventTarget.shutdown();
        this.runLoop.shutdown();
    }

    public LogWrapper getLogger(String str) {
        return new LogWrapper(this.logger, str);
    }

    public LogWrapper getLogger(String str, String str2) {
        return new LogWrapper(this.logger, str, str2);
    }
}
