package e.g0.t.q.f;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import e.g0.k;

/* compiled from: BatteryChargingTracker.java */
/* loaded from: classes.dex */
public class a extends c<Boolean> {

    /* renamed from: i  reason: collision with root package name */
    public static final String f2303i = k.e("BatteryChrgTracker");

    public a(Context context, e.g0.t.t.t.a aVar) {
        super(context, aVar);
    }

    @Override // e.g0.t.q.f.d
    public Object a() {
        int intExtra;
        Intent registerReceiver = this.b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            k.c().b(f2303i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        if (Build.VERSION.SDK_INT < 23 ? registerReceiver.getIntExtra("plugged", 0) != 0 : !((intExtra = registerReceiver.getIntExtra("status", -1)) != 2 && intExtra != 5)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // e.g0.t.q.f.c
    public IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
        if (r6.equals("android.intent.action.ACTION_POWER_DISCONNECTED") == false) goto L31;
     */
    @Override // e.g0.t.q.f.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            java.lang.String r6 = r7.getAction()
            if (r6 != 0) goto L7
            return
        L7:
            e.g0.k r7 = e.g0.k.c()
            java.lang.String r0 = e.g0.t.q.f.a.f2303i
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r6
            java.lang.String r4 = "Received %s"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r7.a(r0, r2, r4)
            int r7 = r6.hashCode()
            r0 = 3
            r2 = 2
            switch(r7) {
                case -1886648615: goto L49;
                case -54942926: goto L3e;
                case 948344062: goto L33;
                case 1019184907: goto L28;
                default: goto L27;
            }
        L27:
            goto L51
        L28:
            java.lang.String r7 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L31
            goto L51
        L31:
            r3 = 3
            goto L52
        L33:
            java.lang.String r7 = "android.os.action.CHARGING"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L3c
            goto L51
        L3c:
            r3 = 2
            goto L52
        L3e:
            java.lang.String r7 = "android.os.action.DISCHARGING"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L47
            goto L51
        L47:
            r3 = 1
            goto L52
        L49:
            java.lang.String r7 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L52
        L51:
            r3 = -1
        L52:
            if (r3 == 0) goto L6d
            if (r3 == r1) goto L67
            if (r3 == r2) goto L61
            if (r3 == r0) goto L5b
            goto L72
        L5b:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.c(r6)
            goto L72
        L61:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.c(r6)
            goto L72
        L67:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.c(r6)
            goto L72
        L6d:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.c(r6)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g0.t.q.f.a.g(android.content.Context, android.content.Intent):void");
    }
}
