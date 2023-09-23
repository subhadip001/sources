package g.c.w.g;

import g.c.o;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: NewThreadWorker.java */
/* loaded from: classes2.dex */
public class d extends o.b implements g.c.t.b {

    /* renamed from: f  reason: collision with root package name */
    public final ScheduledExecutorService f8521f;

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f8522g;

    public d(ThreadFactory threadFactory) {
        this.f8521f = h.a(threadFactory);
    }

    @Override // g.c.o.b
    public g.c.t.b b(Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // g.c.o.b
    public g.c.t.b c(Runnable runnable, long j2, TimeUnit timeUnit) {
        if (this.f8522g) {
            return EmptyDisposable.INSTANCE;
        }
        return d(runnable, j2, timeUnit, null);
    }

    public g d(Runnable runnable, long j2, TimeUnit timeUnit, g.c.w.a.a aVar) {
        Future<?> schedule;
        Objects.requireNonNull(runnable, "run is null");
        g gVar = new g(runnable, aVar);
        if (aVar == null || aVar.b(gVar)) {
            try {
                if (j2 <= 0) {
                    schedule = this.f8521f.submit((Callable) gVar);
                } else {
                    schedule = this.f8521f.schedule((Callable) gVar, j2, timeUnit);
                }
                gVar.a(schedule);
            } catch (RejectedExecutionException e2) {
                if (aVar != null) {
                    aVar.a(gVar);
                }
                f.n.a.n.i.L(e2);
            }
            return gVar;
        }
        return gVar;
    }

    @Override // g.c.t.b
    public void dispose() {
        if (this.f8522g) {
            return;
        }
        this.f8522g = true;
        this.f8521f.shutdownNow();
    }
}
