package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.WakeLockHolder;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class WakeLockHolder {
    private static final String EXTRA_WAKEFUL_INTENT = "com.google.firebase.iid.WakeLockHolder.wakefulintent";
    public static final long WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS = TimeUnit.MINUTES.toMillis(1);
    private static final Object syncObject = new Object();
    private static WakeLock wakeLock;

    public static void acquireWakeLock(Intent intent, long j2) {
        synchronized (syncObject) {
            if (wakeLock != null) {
                setAsWakefulIntent(intent, true);
                wakeLock.acquire(j2);
            }
        }
    }

    private static void checkAndInitWakeLock(Context context) {
        if (wakeLock == null) {
            WakeLock wakeLock2 = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            wakeLock = wakeLock2;
            wakeLock2.setReferenceCounted(true);
        }
    }

    public static void completeWakefulIntent(Intent intent) {
        synchronized (syncObject) {
            if (wakeLock != null && isWakefulIntent(intent)) {
                setAsWakefulIntent(intent, false);
                wakeLock.release();
            }
        }
    }

    public static void initWakeLock(Context context) {
        synchronized (syncObject) {
            checkAndInitWakeLock(context);
        }
    }

    public static boolean isWakefulIntent(Intent intent) {
        return intent.getBooleanExtra(EXTRA_WAKEFUL_INTENT, false);
    }

    public static void reset() {
        synchronized (syncObject) {
            wakeLock = null;
        }
    }

    public static void sendWakefulServiceIntent(Context context, WithinAppServiceConnection withinAppServiceConnection, final Intent intent) {
        synchronized (syncObject) {
            checkAndInitWakeLock(context);
            boolean isWakefulIntent = isWakefulIntent(intent);
            setAsWakefulIntent(intent, true);
            if (!isWakefulIntent) {
                wakeLock.acquire(WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS);
            }
            withinAppServiceConnection.sendIntent(intent).addOnCompleteListener(new OnCompleteListener() { // from class: f.h.e.p.b0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    WakeLockHolder.completeWakefulIntent(intent);
                }
            });
        }
    }

    private static void setAsWakefulIntent(Intent intent, boolean z) {
        intent.putExtra(EXTRA_WAKEFUL_INTENT, z);
    }

    public static ComponentName startWakefulService(Context context, Intent intent) {
        synchronized (syncObject) {
            checkAndInitWakeLock(context);
            boolean isWakefulIntent = isWakefulIntent(intent);
            setAsWakefulIntent(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!isWakefulIntent) {
                wakeLock.acquire(WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS);
            }
            return startService;
        }
    }
}
