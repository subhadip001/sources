package e.g0.t.q.f;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.analytics.FirebaseAnalytics;
import e.g0.k;

/* compiled from: BatteryNotLowTracker.java */
/* loaded from: classes.dex */
public class b extends c<Boolean> {

    /* renamed from: i  reason: collision with root package name */
    public static final String f2304i = k.e("BatteryNotLowTracker");

    public b(Context context, e.g0.t.t.t.a aVar) {
        super(context, aVar);
    }

    @Override // e.g0.t.q.f.d
    public Object a() {
        Intent registerReceiver = this.b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            k.c().b(f2304i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        return Boolean.valueOf((registerReceiver.getIntExtra("status", -1) == 1 || ((float) registerReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1)) / ((float) registerReceiver.getIntExtra("scale", -1)) > 0.15f) ? true : true);
    }

    @Override // e.g0.t.q.f.c
    public IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // e.g0.t.q.f.c
    public void g(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        k.c().a(f2304i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            c(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            c(Boolean.FALSE);
        }
    }
}
