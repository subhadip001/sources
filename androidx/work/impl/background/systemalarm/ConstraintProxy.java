package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import e.g0.k;
import e.g0.t.p.b.b;

/* loaded from: classes.dex */
public abstract class ConstraintProxy extends BroadcastReceiver {
    public static final String a = k.e("ConstraintProxy");

    /* loaded from: classes.dex */
    public static class BatteryChargingProxy extends ConstraintProxy {
    }

    /* loaded from: classes.dex */
    public static class BatteryNotLowProxy extends ConstraintProxy {
    }

    /* loaded from: classes.dex */
    public static class NetworkStateProxy extends ConstraintProxy {
    }

    /* loaded from: classes.dex */
    public static class StorageNotLowProxy extends ConstraintProxy {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        k.c().a(a, String.format("onReceive : %s", intent), new Throwable[0]);
        context.startService(b.a(context));
    }
}
