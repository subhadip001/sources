package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.heartbeatinfo.HeartBeatInfoStorage;
import com.google.firebase.inject.Provider;
import com.google.firebase.platforminfo.UserAgentPublisher;
import e.i.a;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DefaultHeartBeatController implements HeartBeatController, HeartBeatInfo {
    private static final ThreadFactory THREAD_FACTORY = new ThreadFactory() { // from class: f.h.e.m.d
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i2 = DefaultHeartBeatController.a;
            return new Thread(runnable, "heartbeat-information-executor");
        }
    };
    public static final /* synthetic */ int a = 0;
    private final Context applicationContext;
    private final Executor backgroundExecutor;
    private final Set<HeartBeatConsumer> consumers;
    private final Provider<HeartBeatInfoStorage> storageProvider;
    private final Provider<UserAgentPublisher> userAgentProvider;

    private DefaultHeartBeatController(final Context context, final String str, Set<HeartBeatConsumer> set, Provider<UserAgentPublisher> provider) {
        this(new Provider() { // from class: f.h.e.m.a
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                Context context2 = context;
                String str2 = str;
                int i2 = DefaultHeartBeatController.a;
                return new HeartBeatInfoStorage(context2, str2);
            }
        }, set, new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), THREAD_FACTORY), provider, context);
    }

    public static /* synthetic */ DefaultHeartBeatController a(ComponentContainer componentContainer) {
        return new DefaultHeartBeatController((Context) componentContainer.get(Context.class), ((FirebaseApp) componentContainer.get(FirebaseApp.class)).getPersistenceKey(), componentContainer.setOf(HeartBeatConsumer.class), componentContainer.getProvider(UserAgentPublisher.class));
    }

    public static Component<DefaultHeartBeatController> component() {
        return Component.builder(DefaultHeartBeatController.class, HeartBeatController.class, HeartBeatInfo.class).add(Dependency.required(Context.class)).add(Dependency.required(FirebaseApp.class)).add(Dependency.setOf(HeartBeatConsumer.class)).add(Dependency.requiredProvider(UserAgentPublisher.class)).factory(new ComponentFactory() { // from class: f.h.e.m.b
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return DefaultHeartBeatController.a(componentContainer);
            }
        }).build();
    }

    public /* synthetic */ String b() {
        String byteArrayOutputStream;
        synchronized (this) {
            HeartBeatInfoStorage heartBeatInfoStorage = this.storageProvider.get();
            List<HeartBeatResult> allHeartBeats = heartBeatInfoStorage.getAllHeartBeats();
            heartBeatInfoStorage.deleteAllHeartBeats();
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < allHeartBeats.size(); i2++) {
                HeartBeatResult heartBeatResult = allHeartBeats.get(i2);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", heartBeatResult.getUserAgent());
                jSONObject.put("dates", new JSONArray((Collection) heartBeatResult.getUsedDates()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
            try {
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return byteArrayOutputStream;
    }

    public /* synthetic */ Void c() {
        synchronized (this) {
            this.storageProvider.get().storeHeartBeat(System.currentTimeMillis(), this.userAgentProvider.get().getUserAgent());
        }
        return null;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    public synchronized HeartBeatInfo.HeartBeat getHeartBeatCode(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        HeartBeatInfoStorage heartBeatInfoStorage = this.storageProvider.get();
        if (heartBeatInfoStorage.shouldSendGlobalHeartBeat(currentTimeMillis)) {
            heartBeatInfoStorage.postHeartBeatCleanUp();
            return HeartBeatInfo.HeartBeat.GLOBAL;
        }
        return HeartBeatInfo.HeartBeat.NONE;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatController
    public Task<String> getHeartBeatsHeader() {
        if (!a.K(this.applicationContext)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.backgroundExecutor, new Callable() { // from class: f.h.e.m.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return DefaultHeartBeatController.this.b();
            }
        });
    }

    public Task<Void> registerHeartBeat() {
        if (this.consumers.size() <= 0) {
            return Tasks.forResult(null);
        }
        if (!a.K(this.applicationContext)) {
            return Tasks.forResult(null);
        }
        return Tasks.call(this.backgroundExecutor, new Callable() { // from class: f.h.e.m.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                DefaultHeartBeatController.this.c();
                return null;
            }
        });
    }

    public DefaultHeartBeatController(Provider<HeartBeatInfoStorage> provider, Set<HeartBeatConsumer> set, Executor executor, Provider<UserAgentPublisher> provider2, Context context) {
        this.storageProvider = provider;
        this.consumers = set;
        this.backgroundExecutor = executor;
        this.userAgentProvider = provider2;
        this.applicationContext = context;
    }
}
