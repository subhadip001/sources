package com.google.firebase.database.android;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.connection.ConnectionContext;
import com.google.firebase.database.connection.HostInfo;
import com.google.firebase.database.connection.PersistentConnection;
import com.google.firebase.database.connection.PersistentConnectionImpl;
import com.google.firebase.database.core.EventTarget;
import com.google.firebase.database.core.Platform;
import com.google.firebase.database.core.RunLoop;
import com.google.firebase.database.core.persistence.DefaultPersistenceManager;
import com.google.firebase.database.core.persistence.LRUCachePolicy;
import com.google.firebase.database.core.persistence.PersistenceManager;
import com.google.firebase.database.core.utilities.DefaultRunLoop;
import com.google.firebase.database.logging.AndroidLogger;
import com.google.firebase.database.logging.LogWrapper;
import com.google.firebase.database.logging.Logger;
import f.a.b.a.a;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class AndroidPlatform implements Platform {
    private static final String APP_IN_BACKGROUND_INTERRUPT_REASON = "app_in_background";
    private final Context applicationContext;
    private final Set<String> createdPersistenceCaches = new HashSet();
    private final FirebaseApp firebaseApp;

    public AndroidPlatform(FirebaseApp firebaseApp) {
        this.firebaseApp = firebaseApp;
        if (firebaseApp != null) {
            this.applicationContext = firebaseApp.getApplicationContext();
            return;
        }
        Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        Log.e("FirebaseDatabase", "ERROR: You must call FirebaseApp.initializeApp() before using Firebase Database.");
        Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        throw new RuntimeException("You need to call FirebaseApp.initializeApp() before using Firebase Database.");
    }

    @Override // com.google.firebase.database.core.Platform
    public PersistenceManager createPersistenceManager(com.google.firebase.database.core.Context context, String str) {
        String sessionPersistenceKey = context.getSessionPersistenceKey();
        String q = a.q(str, "_", sessionPersistenceKey);
        if (!this.createdPersistenceCaches.contains(q)) {
            this.createdPersistenceCaches.add(q);
            return new DefaultPersistenceManager(context, new SqlPersistenceStorageEngine(this.applicationContext, context, q), new LRUCachePolicy(context.getPersistenceCacheSizeBytes()));
        }
        throw new DatabaseException(a.q("SessionPersistenceKey '", sessionPersistenceKey, "' has already been used."));
    }

    @Override // com.google.firebase.database.core.Platform
    public String getPlatformVersion() {
        StringBuilder A = a.A("android-");
        A.append(FirebaseDatabase.getSdkVersion());
        return A.toString();
    }

    @Override // com.google.firebase.database.core.Platform
    public File getSSLCacheDirectory() {
        return this.applicationContext.getApplicationContext().getDir("sslcache", 0);
    }

    @Override // com.google.firebase.database.core.Platform
    public String getUserAgent(com.google.firebase.database.core.Context context) {
        return a.t(new StringBuilder(), Build.VERSION.SDK_INT, "/Android");
    }

    @Override // com.google.firebase.database.core.Platform
    public EventTarget newEventTarget(com.google.firebase.database.core.Context context) {
        return new AndroidEventTarget();
    }

    @Override // com.google.firebase.database.core.Platform
    public Logger newLogger(com.google.firebase.database.core.Context context, Logger.Level level, List<String> list) {
        return new AndroidLogger(level, list);
    }

    @Override // com.google.firebase.database.core.Platform
    public PersistentConnection newPersistentConnection(com.google.firebase.database.core.Context context, ConnectionContext connectionContext, HostInfo hostInfo, PersistentConnection.Delegate delegate) {
        final PersistentConnectionImpl persistentConnectionImpl = new PersistentConnectionImpl(connectionContext, hostInfo, delegate);
        this.firebaseApp.addBackgroundStateChangeListener(new FirebaseApp.BackgroundStateChangeListener() { // from class: com.google.firebase.database.android.AndroidPlatform.2
            @Override // com.google.firebase.FirebaseApp.BackgroundStateChangeListener
            public void onBackgroundStateChanged(boolean z) {
                if (z) {
                    persistentConnectionImpl.interrupt(AndroidPlatform.APP_IN_BACKGROUND_INTERRUPT_REASON);
                } else {
                    persistentConnectionImpl.resume(AndroidPlatform.APP_IN_BACKGROUND_INTERRUPT_REASON);
                }
            }
        });
        return persistentConnectionImpl;
    }

    @Override // com.google.firebase.database.core.Platform
    public RunLoop newRunLoop(com.google.firebase.database.core.Context context) {
        final LogWrapper logger = context.getLogger("RunLoop");
        return new DefaultRunLoop() { // from class: com.google.firebase.database.android.AndroidPlatform.1
            @Override // com.google.firebase.database.core.utilities.DefaultRunLoop
            public void handleException(final Throwable th) {
                final String messageForException = DefaultRunLoop.messageForException(th);
                logger.error(messageForException, th);
                new Handler(AndroidPlatform.this.applicationContext.getMainLooper()).post(new Runnable() { // from class: com.google.firebase.database.android.AndroidPlatform.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        throw new RuntimeException(messageForException, th);
                    }
                });
                getExecutorService().shutdownNow();
            }
        };
    }
}
