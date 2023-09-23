package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.messaging.ServiceStarter;
import f.h.e.p.w;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@KeepForSdk
/* loaded from: classes2.dex */
public class FcmBroadcastProcessor {
    private static final String EXTRA_BINARY_DATA = "rawData";
    private static final String EXTRA_BINARY_DATA_BASE_64 = "gcm.rawData64";
    public static final /* synthetic */ int a = 0;
    private static WithinAppServiceConnection fcmServiceConn;
    private static final Object lock = new Object();
    private final Context context;
    private final Executor executor;

    public FcmBroadcastProcessor(Context context) {
        this.context = context;
        this.executor = w.f6188f;
    }

    public static /* synthetic */ Task a(Context context, Intent intent, Task task) {
        return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? bindToMessagingService(context, intent).continueWith(w.f6188f, new Continuation() { // from class: f.h.e.p.e
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                int i2 = FcmBroadcastProcessor.a;
                return Integer.valueOf((int) ServiceStarter.ERROR_ILLEGAL_STATE_EXCEPTION_FALLBACK_TO_BIND);
            }
        }) : task;
    }

    private static Task<Integer> bindToMessagingService(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        if (ServiceStarter.getInstance().hasWakeLockPermission(context)) {
            WakeLockHolder.sendWakefulServiceIntent(context, getServiceConnection(context, ServiceStarter.ACTION_MESSAGING_EVENT), intent);
        } else {
            getServiceConnection(context, ServiceStarter.ACTION_MESSAGING_EVENT).sendIntent(intent);
        }
        return Tasks.forResult(-1);
    }

    private static WithinAppServiceConnection getServiceConnection(Context context, String str) {
        WithinAppServiceConnection withinAppServiceConnection;
        synchronized (lock) {
            if (fcmServiceConn == null) {
                fcmServiceConn = new WithinAppServiceConnection(context, str);
            }
            withinAppServiceConnection = fcmServiceConn;
        }
        return withinAppServiceConnection;
    }

    @VisibleForTesting
    public static void reset() {
        synchronized (lock) {
            fcmServiceConn = null;
        }
    }

    @KeepForSdk
    public Task<Integer> process(Intent intent) {
        String stringExtra = intent.getStringExtra(EXTRA_BINARY_DATA_BASE_64);
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra(EXTRA_BINARY_DATA_BASE_64);
        }
        return startMessagingService(this.context, intent);
    }

    public Task<Integer> startMessagingService(final Context context, final Intent intent) {
        boolean z = PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z2 = (intent.getFlags() & 268435456) != 0;
        if (z && !z2) {
            return bindToMessagingService(context, intent);
        }
        return Tasks.call(this.executor, new Callable() { // from class: f.h.e.p.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = context;
                Intent intent2 = intent;
                int i2 = FcmBroadcastProcessor.a;
                return Integer.valueOf(ServiceStarter.getInstance().startMessagingService(context2, intent2));
            }
        }).continueWithTask(this.executor, new Continuation() { // from class: f.h.e.p.f
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return FcmBroadcastProcessor.a(context, intent, task);
            }
        });
    }

    public FcmBroadcastProcessor(Context context, ExecutorService executorService) {
        this.context = context;
        this.executor = executorService;
    }
}
