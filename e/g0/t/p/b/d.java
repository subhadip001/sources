package e.g0.t.p.b;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import e.g0.k;
import e.g0.t.p.b.e;
import e.g0.t.s.p;
import e.g0.t.t.m;
import e.g0.t.t.r;
import java.util.Collections;
import java.util.List;

/* compiled from: DelayMetCommandHandler.java */
/* loaded from: classes.dex */
public class d implements e.g0.t.q.c, e.g0.t.b, r.b {
    public static final String o = k.e("DelayMetCommandHandler");

    /* renamed from: f  reason: collision with root package name */
    public final Context f2270f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2271g;

    /* renamed from: h  reason: collision with root package name */
    public final String f2272h;

    /* renamed from: i  reason: collision with root package name */
    public final e f2273i;

    /* renamed from: j  reason: collision with root package name */
    public final e.g0.t.q.d f2274j;

    /* renamed from: m  reason: collision with root package name */
    public PowerManager.WakeLock f2277m;
    public boolean n = false;

    /* renamed from: l  reason: collision with root package name */
    public int f2276l = 0;

    /* renamed from: k  reason: collision with root package name */
    public final Object f2275k = new Object();

    public d(Context context, int i2, String str, e eVar) {
        this.f2270f = context;
        this.f2271g = i2;
        this.f2273i = eVar;
        this.f2272h = str;
        this.f2274j = new e.g0.t.q.d(context, eVar.f2279g, this);
    }

    @Override // e.g0.t.t.r.b
    public void a(String str) {
        k.c().a(o, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        g();
    }

    @Override // e.g0.t.q.c
    public void b(List<String> list) {
        g();
    }

    public final void c() {
        synchronized (this.f2275k) {
            this.f2274j.c();
            this.f2273i.f2280h.b(this.f2272h);
            PowerManager.WakeLock wakeLock = this.f2277m;
            if (wakeLock != null && wakeLock.isHeld()) {
                k.c().a(o, String.format("Releasing wakelock %s for WorkSpec %s", this.f2277m, this.f2272h), new Throwable[0]);
                this.f2277m.release();
            }
        }
    }

    @Override // e.g0.t.b
    public void d(String str, boolean z) {
        k.c().a(o, String.format("onExecuted %s, %s", str, Boolean.valueOf(z)), new Throwable[0]);
        c();
        if (z) {
            Intent c = b.c(this.f2270f, this.f2272h);
            e eVar = this.f2273i;
            eVar.f2284l.post(new e.b(eVar, c, this.f2271g));
        }
        if (this.n) {
            Intent a = b.a(this.f2270f);
            e eVar2 = this.f2273i;
            eVar2.f2284l.post(new e.b(eVar2, a, this.f2271g));
        }
    }

    public void e() {
        this.f2277m = m.a(this.f2270f, String.format("%s (%s)", this.f2272h, Integer.valueOf(this.f2271g)));
        k c = k.c();
        String str = o;
        c.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f2277m, this.f2272h), new Throwable[0]);
        this.f2277m.acquire();
        p i2 = ((e.g0.t.s.r) this.f2273i.f2282j.c.r()).i(this.f2272h);
        if (i2 == null) {
            g();
            return;
        }
        boolean b = i2.b();
        this.n = b;
        if (!b) {
            k.c().a(str, String.format("No constraints for %s", this.f2272h), new Throwable[0]);
            f(Collections.singletonList(this.f2272h));
            return;
        }
        this.f2274j.b(Collections.singletonList(i2));
    }

    @Override // e.g0.t.q.c
    public void f(List<String> list) {
        if (list.contains(this.f2272h)) {
            synchronized (this.f2275k) {
                if (this.f2276l == 0) {
                    this.f2276l = 1;
                    k.c().a(o, String.format("onAllConstraintsMet for %s", this.f2272h), new Throwable[0]);
                    if (this.f2273i.f2281i.g(this.f2272h, null)) {
                        this.f2273i.f2280h.a(this.f2272h, 600000L, this);
                    } else {
                        c();
                    }
                } else {
                    k.c().a(o, String.format("Already started work for %s", this.f2272h), new Throwable[0]);
                }
            }
        }
    }

    public final void g() {
        synchronized (this.f2275k) {
            if (this.f2276l < 2) {
                this.f2276l = 2;
                k c = k.c();
                String str = o;
                c.a(str, String.format("Stopping work for WorkSpec %s", this.f2272h), new Throwable[0]);
                Context context = this.f2270f;
                String str2 = this.f2272h;
                Intent intent = new Intent(context, SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", str2);
                e eVar = this.f2273i;
                eVar.f2284l.post(new e.b(eVar, intent, this.f2271g));
                if (this.f2273i.f2281i.c(this.f2272h)) {
                    k.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.f2272h), new Throwable[0]);
                    Intent c2 = b.c(this.f2270f, this.f2272h);
                    e eVar2 = this.f2273i;
                    eVar2.f2284l.post(new e.b(eVar2, c2, this.f2271g));
                } else {
                    k.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f2272h), new Throwable[0]);
                }
            } else {
                k.c().a(o, String.format("Already stopped work for %s", this.f2272h), new Throwable[0]);
            }
        }
    }
}
