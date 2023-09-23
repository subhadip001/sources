package e.g0.t.t;

import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;

/* compiled from: StopWorkRunnable.java */
/* loaded from: classes.dex */
public class l implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public static final String f2372i = e.g0.k.e("StopWorkRunnable");

    /* renamed from: f  reason: collision with root package name */
    public final e.g0.t.l f2373f;

    /* renamed from: g  reason: collision with root package name */
    public final String f2374g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f2375h;

    public l(e.g0.t.l lVar, String str, boolean z) {
        this.f2373f = lVar;
        this.f2374g = str;
        this.f2375h = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean containsKey;
        boolean j2;
        e.g0.t.l lVar = this.f2373f;
        WorkDatabase workDatabase = lVar.c;
        e.g0.t.d dVar = lVar.f2230f;
        e.g0.t.s.q r = workDatabase.r();
        workDatabase.c();
        try {
            String str = this.f2374g;
            synchronized (dVar.p) {
                containsKey = dVar.f2208k.containsKey(str);
            }
            if (this.f2375h) {
                j2 = this.f2373f.f2230f.i(this.f2374g);
            } else {
                if (!containsKey) {
                    e.g0.t.s.r rVar = (e.g0.t.s.r) r;
                    if (rVar.f(this.f2374g) == WorkInfo$State.RUNNING) {
                        rVar.p(WorkInfo$State.ENQUEUED, this.f2374g);
                    }
                }
                j2 = this.f2373f.f2230f.j(this.f2374g);
            }
            e.g0.k.c().a(f2372i, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f2374g, Boolean.valueOf(j2)), new Throwable[0]);
            workDatabase.l();
        } finally {
            workDatabase.g();
        }
    }
}
