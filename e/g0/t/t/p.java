package e.g0.t.t;

import androidx.work.WorkInfo$State;
import java.util.UUID;

/* compiled from: WorkProgressUpdater.java */
/* loaded from: classes.dex */
public class p implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ UUID f2392f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ e.g0.e f2393g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ e.g0.t.t.s.c f2394h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ q f2395i;

    public p(q qVar, UUID uuid, e.g0.e eVar, e.g0.t.t.s.c cVar) {
        this.f2395i = qVar;
        this.f2392f = uuid;
        this.f2393g = eVar;
        this.f2394h = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        e.g0.t.s.p i2;
        String uuid = this.f2392f.toString();
        e.g0.k c = e.g0.k.c();
        String str = q.c;
        c.a(str, String.format("Updating progress for %s (%s)", this.f2392f, this.f2393g), new Throwable[0]);
        this.f2395i.a.c();
        try {
            i2 = ((e.g0.t.s.r) this.f2395i.a.r()).i(uuid);
        } finally {
            try {
                return;
            } finally {
            }
        }
        if (i2 != null) {
            if (i2.b == WorkInfo$State.RUNNING) {
                e.g0.t.s.m mVar = new e.g0.t.s.m(uuid, this.f2393g);
                e.g0.t.s.o oVar = (e.g0.t.s.o) this.f2395i.a.q();
                oVar.a.b();
                oVar.a.c();
                oVar.b.f(mVar);
                oVar.a.l();
                oVar.a.g();
            } else {
                e.g0.k.c().f(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", uuid), new Throwable[0]);
            }
            this.f2394h.j(null);
            this.f2395i.a.l();
            return;
        }
        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
    }
}
