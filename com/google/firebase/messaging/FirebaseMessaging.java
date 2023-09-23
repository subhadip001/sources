package com.google.firebase.messaging;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.RequestDeduplicator;
import com.google.firebase.messaging.Store;
import com.google.firebase.messaging.TopicsSubscriber;
import com.google.firebase.platforminfo.UserAgentPublisher;
import f.a.b.a.a;
import f.h.b.a.f;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class FirebaseMessaging {
    private static final String EXTRA_DUMMY_P_INTENT = "app";
    public static final String GMS_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final String INSTANCE_ID_SCOPE = "FCM";
    private static final long MAX_DELAY_SEC = TimeUnit.HOURS.toSeconds(8);
    private static final long MIN_DELAY_SEC = 30;
    private static final String SEND_INTENT_ACTION = "com.google.android.gcm.intent.SEND";
    private static final String SUBTYPE_DEFAULT = "";
    public static final String TAG = "FirebaseMessaging";
    private static Store store;
    public static ScheduledExecutorService syncExecutor;
    public static f transportFactory;
    private final AutoInit autoInit;
    private final Context context;
    private final Executor fileExecutor;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi fis;
    private final GmsRpc gmsRpc;
    private final FirebaseInstanceIdInternal iid;
    private final Executor initExecutor;
    private final Application.ActivityLifecycleCallbacks lifecycleCallbacks;
    private final Metadata metadata;
    private final RequestDeduplicator requestDeduplicator;
    private boolean syncScheduledOrRunning;
    private final Executor taskExecutor;
    private final Task<TopicsSubscriber> topicsSubscriberTask;

    /* loaded from: classes2.dex */
    public class AutoInit {
        private static final String AUTO_INIT_PREF = "auto_init";
        private static final String FCM_PREFERENCES = "com.google.firebase.messaging";
        private static final String MANIFEST_METADATA_AUTO_INIT_ENABLED = "firebase_messaging_auto_init_enabled";
        private Boolean autoInitEnabled;
        private EventHandler<DataCollectionDefaultChange> dataCollectionDefaultChangeEventHandler;
        private boolean initialized;
        private final Subscriber subscriber;

        public AutoInit(Subscriber subscriber) {
            FirebaseMessaging.this = r1;
            this.subscriber = subscriber;
        }

        private Boolean readEnabled() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context applicationContext = FirebaseMessaging.this.firebaseApp.getApplicationContext();
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = applicationContext.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(MANIFEST_METADATA_AUTO_INIT_ENABLED)) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean(MANIFEST_METADATA_AUTO_INIT_ENABLED));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        public synchronized void initialize() {
            if (this.initialized) {
                return;
            }
            Boolean readEnabled = readEnabled();
            this.autoInitEnabled = readEnabled;
            if (readEnabled == null) {
                EventHandler<DataCollectionDefaultChange> eventHandler = new EventHandler() { // from class: f.h.e.p.k
                    @Override // com.google.firebase.events.EventHandler
                    public final void handle(Event event) {
                        FirebaseMessaging.AutoInit autoInit = FirebaseMessaging.AutoInit.this;
                        if (autoInit.isEnabled()) {
                            FirebaseMessaging.access$100(FirebaseMessaging.this);
                        }
                    }
                };
                this.dataCollectionDefaultChangeEventHandler = eventHandler;
                this.subscriber.subscribe(DataCollectionDefaultChange.class, eventHandler);
            }
            this.initialized = true;
        }

        public synchronized boolean isEnabled() {
            boolean isDataCollectionDefaultEnabled;
            initialize();
            Boolean bool = this.autoInitEnabled;
            if (bool == null) {
                isDataCollectionDefaultEnabled = FirebaseMessaging.this.firebaseApp.isDataCollectionDefaultEnabled();
            } else {
                isDataCollectionDefaultEnabled = bool.booleanValue();
            }
            return isDataCollectionDefaultEnabled;
        }

        public synchronized void setEnabled(boolean z) {
            initialize();
            EventHandler<DataCollectionDefaultChange> eventHandler = this.dataCollectionDefaultChangeEventHandler;
            if (eventHandler != null) {
                this.subscriber.unsubscribe(DataCollectionDefaultChange.class, eventHandler);
                this.dataCollectionDefaultChangeEventHandler = null;
            }
            SharedPreferences.Editor edit = FirebaseMessaging.this.firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z);
            edit.apply();
            if (z) {
                FirebaseMessaging.this.startSyncIfNecessary();
            }
            this.autoInitEnabled = Boolean.valueOf(z);
        }
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi, f fVar, Subscriber subscriber) {
        this(firebaseApp, firebaseInstanceIdInternal, provider, provider2, firebaseInstallationsApi, fVar, subscriber, new Metadata(firebaseApp.getApplicationContext()));
    }

    public static /* synthetic */ void access$100(FirebaseMessaging firebaseMessaging) {
        firebaseMessaging.startSyncIfNecessary();
    }

    public static synchronized void clearStoreForTest() {
        synchronized (FirebaseMessaging.class) {
            store = null;
        }
    }

    public static void clearTransportFactoryForTest() {
        transportFactory = null;
    }

    public static synchronized FirebaseMessaging getInstance() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(FirebaseApp.getInstance());
        }
        return firebaseMessaging;
    }

    private static synchronized Store getStore(Context context) {
        Store store2;
        synchronized (FirebaseMessaging.class) {
            if (store == null) {
                store = new Store(context);
            }
            store2 = store;
        }
        return store2;
    }

    private String getSubtype() {
        return FirebaseApp.DEFAULT_APP_NAME.equals(this.firebaseApp.getName()) ? "" : this.firebaseApp.getPersistenceKey();
    }

    public static f getTransportFactory() {
        return transportFactory;
    }

    /* renamed from: invokeOnTokenRefresh */
    public void e(String str) {
        if (FirebaseApp.DEFAULT_APP_NAME.equals(this.firebaseApp.getName())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder A = a.A("Invoking onNewToken for app: ");
                A.append(this.firebaseApp.getName());
                Log.d("FirebaseMessaging", A.toString());
            }
            Intent intent = new Intent(FirebaseMessagingService.ACTION_NEW_TOKEN);
            intent.putExtra(FirebaseMessagingService.EXTRA_TOKEN, str);
            new FcmBroadcastProcessor(this.context).process(intent);
        }
    }

    private synchronized void startSync() {
        if (!this.syncScheduledOrRunning) {
            syncWithDelaySecondsInternal(0L);
        }
    }

    public void startSyncIfNecessary() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.getToken();
        } else if (tokenNeedsRefresh(getTokenWithoutTriggeringSync())) {
            startSync();
        }
    }

    public /* synthetic */ Task a(final String str, final Store.Token token) {
        return this.gmsRpc.getToken().onSuccessTask(this.fileExecutor, new SuccessContinuation() { // from class: f.h.e.p.i
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return FirebaseMessaging.this.b(str, token, (String) obj);
            }
        });
    }

    public /* synthetic */ Task b(String str, Store.Token token, String str2) {
        getStore(this.context).saveToken(getSubtype(), str, str2, this.metadata.getAppVersionCode());
        if (token == null || !str2.equals(token.token)) {
            e(str2);
        }
        return Tasks.forResult(str2);
    }

    public String blockingGetToken() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            try {
                return (String) Tasks.await(firebaseInstanceIdInternal.getTokenTask());
            } catch (InterruptedException | ExecutionException e2) {
                throw new IOException(e2);
            }
        }
        final Store.Token tokenWithoutTriggeringSync = getTokenWithoutTriggeringSync();
        if (!tokenNeedsRefresh(tokenWithoutTriggeringSync)) {
            return tokenWithoutTriggeringSync.token;
        }
        final String defaultSenderId = Metadata.getDefaultSenderId(this.firebaseApp);
        try {
            return (String) Tasks.await(this.requestDeduplicator.getOrStartGetTokenRequest(defaultSenderId, new RequestDeduplicator.GetTokenRequest() { // from class: f.h.e.p.h
                @Override // com.google.firebase.messaging.RequestDeduplicator.GetTokenRequest
                public final Task start() {
                    return FirebaseMessaging.this.a(defaultSenderId, tokenWithoutTriggeringSync);
                }
            }));
        } catch (InterruptedException | ExecutionException e3) {
            throw new IOException(e3);
        }
    }

    public /* synthetic */ void c(TaskCompletionSource taskCompletionSource) {
        try {
            this.iid.deleteToken(Metadata.getDefaultSenderId(this.firebaseApp), INSTANCE_ID_SCOPE);
            taskCompletionSource.setResult(null);
        } catch (Exception e2) {
            taskCompletionSource.setException(e2);
        }
    }

    public /* synthetic */ void d(TaskCompletionSource taskCompletionSource) {
        try {
            Tasks.await(this.gmsRpc.deleteToken());
            getStore(this.context).deleteToken(getSubtype(), Metadata.getDefaultSenderId(this.firebaseApp));
            taskCompletionSource.setResult(null);
        } catch (Exception e2) {
            taskCompletionSource.setException(e2);
        }
    }

    public Task<Void> deleteToken() {
        if (this.iid != null) {
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.initExecutor.execute(new Runnable() { // from class: f.h.e.p.m
                @Override // java.lang.Runnable
                public final void run() {
                    FirebaseMessaging.this.c(taskCompletionSource);
                }
            });
            return taskCompletionSource.getTask();
        } else if (getTokenWithoutTriggeringSync() == null) {
            return Tasks.forResult(null);
        } else {
            final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            FcmExecutors.newNetworkIOExecutor().execute(new Runnable() { // from class: f.h.e.p.r
                @Override // java.lang.Runnable
                public final void run() {
                    FirebaseMessaging.this.d(taskCompletionSource2);
                }
            });
            return taskCompletionSource2.getTask();
        }
    }

    public boolean deliveryMetricsExportToBigQueryEnabled() {
        return MessagingAnalytics.deliveryMetricsExportToBigQueryEnabled();
    }

    public void enqueueTaskWithDelaySeconds(Runnable runnable, long j2) {
        synchronized (FirebaseMessaging.class) {
            if (syncExecutor == null) {
                syncExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            syncExecutor.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    public /* synthetic */ void f() {
        if (isAutoInitEnabled()) {
            startSyncIfNecessary();
        }
    }

    public /* synthetic */ void g() {
        ProxyNotificationInitializer.initialize(this.context);
    }

    public Context getApplicationContext() {
        return this.context;
    }

    public Task<String> getToken() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            return firebaseInstanceIdInternal.getTokenTask();
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.initExecutor.execute(new Runnable() { // from class: f.h.e.p.q
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging firebaseMessaging = FirebaseMessaging.this;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                Objects.requireNonNull(firebaseMessaging);
                try {
                    taskCompletionSource2.setResult(firebaseMessaging.blockingGetToken());
                } catch (Exception e2) {
                    taskCompletionSource2.setException(e2);
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    public Store.Token getTokenWithoutTriggeringSync() {
        return getStore(this.context).getToken(getSubtype(), Metadata.getDefaultSenderId(this.firebaseApp));
    }

    public Task<TopicsSubscriber> getTopicsSubscriberTask() {
        return this.topicsSubscriberTask;
    }

    public boolean isAutoInitEnabled() {
        return this.autoInit.isEnabled();
    }

    public boolean isGmsCorePresent() {
        return this.metadata.isGmscorePresent();
    }

    public boolean isNotificationDelegationEnabled() {
        return ProxyNotificationInitializer.isProxyNotificationEnabled(this.context);
    }

    public void send(RemoteMessage remoteMessage) {
        if (!TextUtils.isEmpty(remoteMessage.getTo())) {
            Intent intent = new Intent(SEND_INTENT_ACTION);
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            intent.putExtra(EXTRA_DUMMY_P_INTENT, PendingIntent.getBroadcast(this.context, 0, intent2, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0));
            intent.setPackage("com.google.android.gms");
            remoteMessage.populateSendMessageIntent(intent);
            this.context.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        throw new IllegalArgumentException("Missing 'to'");
    }

    public void setAutoInitEnabled(boolean z) {
        this.autoInit.setEnabled(z);
    }

    public void setDeliveryMetricsExportToBigQuery(boolean z) {
        MessagingAnalytics.setDeliveryMetricsExportToBigQuery(z);
    }

    public Task<Void> setNotificationDelegationEnabled(boolean z) {
        return ProxyNotificationInitializer.setEnableProxyNotification(this.initExecutor, this.context, z);
    }

    public synchronized void setSyncScheduledOrRunning(boolean z) {
        this.syncScheduledOrRunning = z;
    }

    public Task<Void> subscribeToTopic(final String str) {
        return this.topicsSubscriberTask.onSuccessTask(new SuccessContinuation() { // from class: f.h.e.p.s
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                String str2 = str;
                String str3 = FirebaseMessaging.TAG;
                return ((TopicsSubscriber) obj).subscribeToTopic(str2);
            }
        });
    }

    public synchronized void syncWithDelaySecondsInternal(long j2) {
        enqueueTaskWithDelaySeconds(new SyncTask(this, Math.min(Math.max((long) MIN_DELAY_SEC, 2 * j2), MAX_DELAY_SEC)), j2);
        this.syncScheduledOrRunning = true;
    }

    public boolean tokenNeedsRefresh(Store.Token token) {
        return token == null || token.needsRefresh(this.metadata.getAppVersionCode());
    }

    public Task<Void> unsubscribeFromTopic(final String str) {
        return this.topicsSubscriberTask.onSuccessTask(new SuccessContinuation() { // from class: f.h.e.p.l
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                String str2 = str;
                String str3 = FirebaseMessaging.TAG;
                return ((TopicsSubscriber) obj).unsubscribeFromTopic(str2);
            }
        });
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(FirebaseApp firebaseApp) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) firebaseApp.get(FirebaseMessaging.class);
            Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi, f fVar, Subscriber subscriber, Metadata metadata) {
        this(firebaseApp, firebaseInstanceIdInternal, firebaseInstallationsApi, fVar, subscriber, metadata, new GmsRpc(firebaseApp, metadata, provider, provider2, firebaseInstallationsApi), FcmExecutors.newTaskExecutor(), FcmExecutors.newInitExecutor(), FcmExecutors.newFileIOExecutor());
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, FirebaseInstallationsApi firebaseInstallationsApi, f fVar, Subscriber subscriber, Metadata metadata, GmsRpc gmsRpc, Executor executor, Executor executor2, Executor executor3) {
        this.syncScheduledOrRunning = false;
        transportFactory = fVar;
        this.firebaseApp = firebaseApp;
        this.iid = firebaseInstanceIdInternal;
        this.fis = firebaseInstallationsApi;
        this.autoInit = new AutoInit(subscriber);
        Context applicationContext = firebaseApp.getApplicationContext();
        this.context = applicationContext;
        FcmLifecycleCallbacks fcmLifecycleCallbacks = new FcmLifecycleCallbacks();
        this.lifecycleCallbacks = fcmLifecycleCallbacks;
        this.metadata = metadata;
        this.taskExecutor = executor;
        this.gmsRpc = gmsRpc;
        this.requestDeduplicator = new RequestDeduplicator(executor);
        this.initExecutor = executor2;
        this.fileExecutor = executor3;
        Context applicationContext2 = firebaseApp.getApplicationContext();
        if (applicationContext2 instanceof Application) {
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(fcmLifecycleCallbacks);
        } else {
            Log.w("FirebaseMessaging", "Context " + applicationContext2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.addNewTokenListener(new FirebaseInstanceIdInternal.NewTokenListener() { // from class: f.h.e.p.n
                @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener
                public final void onNewToken(String str) {
                    FirebaseMessaging.this.e(str);
                }
            });
        }
        executor2.execute(new Runnable() { // from class: f.h.e.p.p
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.f();
            }
        });
        Task<TopicsSubscriber> createInstance = TopicsSubscriber.createInstance(this, metadata, gmsRpc, applicationContext, FcmExecutors.newTopicsSyncExecutor());
        this.topicsSubscriberTask = createInstance;
        createInstance.addOnSuccessListener(executor2, new OnSuccessListener() { // from class: f.h.e.p.o
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                TopicsSubscriber topicsSubscriber = (TopicsSubscriber) obj;
                if (FirebaseMessaging.this.isAutoInitEnabled()) {
                    topicsSubscriber.startTopicsSyncIfNecessary();
                }
            }
        });
        executor2.execute(new Runnable() { // from class: f.h.e.p.j
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.g();
            }
        });
    }
}
