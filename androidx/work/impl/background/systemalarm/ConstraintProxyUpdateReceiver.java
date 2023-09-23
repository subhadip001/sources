package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import e.g0.k;
import e.g0.t.l;
import e.g0.t.t.g;
import e.g0.t.t.t.b;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String a = k.e("ConstrntProxyUpdtRecvr");

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Intent f642f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Context f643g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ BroadcastReceiver.PendingResult f644h;

        public a(ConstraintProxyUpdateReceiver constraintProxyUpdateReceiver, Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f642f = intent;
            this.f643g = context;
            this.f644h = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f642f.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f642f.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f642f.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f642f.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                k.c().a(ConstraintProxyUpdateReceiver.a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                g.a(this.f643g, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                g.a(this.f643g, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                g.a(this.f643g, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                g.a(this.f643g, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f644h.finish();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            k.c().a(a, String.format("Ignoring unknown action %s", action), new Throwable[0]);
            return;
        }
        ((b) l.b(context).f2228d).a.execute(new a(this, intent, context, goAsync()));
    }
}
