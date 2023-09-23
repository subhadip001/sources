package g.a.v0;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: Rescheduler.java */
/* loaded from: classes2.dex */
public final class g2 {
    public final ScheduledExecutorService a;
    public final Executor b;
    public final Runnable c;

    /* renamed from: d  reason: collision with root package name */
    public final f.h.c.a.o f7739d;

    /* renamed from: e  reason: collision with root package name */
    public long f7740e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7741f;

    /* renamed from: g  reason: collision with root package name */
    public ScheduledFuture<?> f7742g;

    /* compiled from: Rescheduler.java */
    /* loaded from: classes2.dex */
    public final class b implements Runnable {
        public b(a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            g2 g2Var = g2.this;
            if (!g2Var.f7741f) {
                g2Var.f7742g = null;
                return;
            }
            f.h.c.a.o oVar = g2Var.f7739d;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long a = oVar.a(timeUnit);
            g2 g2Var2 = g2.this;
            long j2 = g2Var2.f7740e - a;
            if (j2 > 0) {
                g2Var2.f7742g = g2Var2.a.schedule(new c(null), j2, timeUnit);
                return;
            }
            g2Var2.f7741f = false;
            g2Var2.f7742g = null;
            g2Var2.c.run();
        }
    }

    /* compiled from: Rescheduler.java */
    /* loaded from: classes2.dex */
    public final class c implements Runnable {
        public c(a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            g2 g2Var = g2.this;
            g2Var.b.execute(new b(null));
        }
    }

    public g2(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, f.h.c.a.o oVar) {
        this.c = runnable;
        this.b = executor;
        this.a = scheduledExecutorService;
        this.f7739d = oVar;
        oVar.c();
    }
}
