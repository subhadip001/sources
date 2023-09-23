package g.c.w.g;

import g.c.o;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleScheduler.java */
/* loaded from: classes2.dex */
public final class i extends o {
    public static final e b;
    public static final ScheduledExecutorService c;
    public final AtomicReference<ScheduledExecutorService> a;

    /* compiled from: SingleScheduler.java */
    /* loaded from: classes2.dex */
    public static final class a extends o.b {

        /* renamed from: f  reason: collision with root package name */
        public final ScheduledExecutorService f8536f;

        /* renamed from: g  reason: collision with root package name */
        public final g.c.t.a f8537g = new g.c.t.a();

        /* renamed from: h  reason: collision with root package name */
        public volatile boolean f8538h;

        public a(ScheduledExecutorService scheduledExecutorService) {
            this.f8536f = scheduledExecutorService;
        }

        @Override // g.c.o.b
        public g.c.t.b c(Runnable runnable, long j2, TimeUnit timeUnit) {
            Future<?> schedule;
            if (this.f8538h) {
                return EmptyDisposable.INSTANCE;
            }
            Objects.requireNonNull(runnable, "run is null");
            g gVar = new g(runnable, this.f8537g);
            this.f8537g.b(gVar);
            try {
                if (j2 <= 0) {
                    schedule = this.f8536f.submit((Callable) gVar);
                } else {
                    schedule = this.f8536f.schedule((Callable) gVar, j2, timeUnit);
                }
                gVar.a(schedule);
                return gVar;
            } catch (RejectedExecutionException e2) {
                dispose();
                f.n.a.n.i.L(e2);
                return EmptyDisposable.INSTANCE;
            }
        }

        @Override // g.c.t.b
        public void dispose() {
            if (this.f8538h) {
                return;
            }
            this.f8538h = true;
            this.f8537g.dispose();
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        c = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        b = new e("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public i() {
        e eVar = b;
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.a = atomicReference;
        atomicReference.lazySet(h.a(eVar));
    }

    @Override // g.c.o
    public o.b a() {
        return new a(this.a.get());
    }

    @Override // g.c.o
    public g.c.t.b c(Runnable runnable, long j2, TimeUnit timeUnit) {
        Future schedule;
        Objects.requireNonNull(runnable, "run is null");
        f fVar = new f(runnable);
        try {
            if (j2 <= 0) {
                schedule = this.a.get().submit(fVar);
            } else {
                schedule = this.a.get().schedule(fVar, j2, timeUnit);
            }
            fVar.a(schedule);
            return fVar;
        } catch (RejectedExecutionException e2) {
            f.n.a.n.i.L(e2);
            return EmptyDisposable.INSTANCE;
        }
    }
}
