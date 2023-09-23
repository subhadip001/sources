package e.g0.t.p.b;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import e.g0.k;
import e.g0.t.s.p;

/* compiled from: SystemAlarmScheduler.java */
/* loaded from: classes.dex */
public class f implements e.g0.t.e {

    /* renamed from: g  reason: collision with root package name */
    public static final String f2291g = k.e("SystemAlarmScheduler");

    /* renamed from: f  reason: collision with root package name */
    public final Context f2292f;

    public f(Context context) {
        this.f2292f = context.getApplicationContext();
    }

    @Override // e.g0.t.e
    public void a(p... pVarArr) {
        for (p pVar : pVarArr) {
            k.c().a(f2291g, String.format("Scheduling work with workSpecId %s", pVar.a), new Throwable[0]);
            this.f2292f.startService(b.c(this.f2292f, pVar.a));
        }
    }

    @Override // e.g0.t.e
    public boolean c() {
        return true;
    }

    @Override // e.g0.t.e
    public void e(String str) {
        Context context = this.f2292f;
        String str2 = b.f2264i;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        this.f2292f.startService(intent);
    }
}
