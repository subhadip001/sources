package g.c.w.g;

import g.c.o;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: IoScheduler.java */
/* loaded from: classes2.dex */
public final class b extends o {
    public static final e c;

    /* renamed from: d  reason: collision with root package name */
    public static final e f8506d;

    /* renamed from: e  reason: collision with root package name */
    public static final TimeUnit f8507e = TimeUnit.SECONDS;

    /* renamed from: f  reason: collision with root package name */
    public static final c f8508f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f8509g;
    public final ThreadFactory a;
    public final AtomicReference<a> b;

    /* compiled from: IoScheduler.java */
    /* loaded from: classes2.dex */
    public static final class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final long f8510f;

        /* renamed from: g  reason: collision with root package name */
        public final ConcurrentLinkedQueue<c> f8511g;

        /* renamed from: h  reason: collision with root package name */
        public final g.c.t.a f8512h;

        /* renamed from: i  reason: collision with root package name */
        public final ScheduledExecutorService f8513i;

        /* renamed from: j  reason: collision with root package name */
        public final Future<?> f8514j;

        /* renamed from: k  reason: collision with root package name */
        public final ThreadFactory f8515k;

        public a(long j2, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledFuture<?> scheduledFuture;
            long nanos = timeUnit != null ? timeUnit.toNanos(j2) : 0L;
            this.f8510f = nanos;
            this.f8511g = new ConcurrentLinkedQueue<>();
            this.f8512h = new g.c.t.a();
            this.f8515k = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, b.f8506d);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.f8513i = scheduledExecutorService;
            this.f8514j = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8511g.isEmpty()) {
                return;
            }
            long nanoTime = System.nanoTime();
            Iterator<c> it = this.f8511g.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next.f8520h > nanoTime) {
                    return;
                }
                if (this.f8511g.remove(next) && this.f8512h.c(next)) {
                    next.dispose();
                }
            }
        }
    }

    /* compiled from: IoScheduler.java */
    /* renamed from: g.c.w.g.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0219b extends o.b {

        /* renamed from: g  reason: collision with root package name */
        public final a f8517g;

        /* renamed from: h  reason: collision with root package name */
        public final c f8518h;

        /* renamed from: i  reason: collision with root package name */
        public final AtomicBoolean f8519i = new AtomicBoolean();

        /* renamed from: f  reason: collision with root package name */
        public final g.c.t.a f8516f = new g.c.t.a();

        public C0219b(a aVar) {
            c cVar;
            c cVar2;
            this.f8517g = aVar;
            if (aVar.f8512h.f8138g) {
                cVar2 = b.f8508f;
            } else {
                while (true) {
                    if (!aVar.f8511g.isEmpty()) {
                        cVar = aVar.f8511g.poll();
                        if (cVar != null) {
                            break;
                        }
                    } else {
                        cVar = new c(aVar.f8515k);
                        aVar.f8512h.b(cVar);
                        break;
                    }
                }
                cVar2 = cVar;
            }
            this.f8518h = cVar2;
        }

        @Override // g.c.o.b
        public g.c.t.b c(Runnable runnable, long j2, TimeUnit timeUnit) {
            if (this.f8516f.f8138g) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f8518h.d(runnable, j2, timeUnit, this.f8516f);
        }

        @Override // g.c.t.b
        public void dispose() {
            if (this.f8519i.compareAndSet(false, true)) {
                this.f8516f.dispose();
                a aVar = this.f8517g;
                c cVar = this.f8518h;
                Objects.requireNonNull(aVar);
                cVar.f8520h = System.nanoTime() + aVar.f8510f;
                aVar.f8511g.offer(cVar);
            }
        }
    }

    /* compiled from: IoScheduler.java */
    /* loaded from: classes2.dex */
    public static final class c extends d {

        /* renamed from: h  reason: collision with root package name */
        public long f8520h;

        public c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f8520h = 0L;
        }
    }

    static {
        c cVar = new c(new e("RxCachedThreadSchedulerShutdown"));
        f8508f = cVar;
        cVar.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        e eVar = new e("RxCachedThreadScheduler", max);
        c = eVar;
        f8506d = new e("RxCachedWorkerPoolEvictor", max);
        a aVar = new a(0L, null, eVar);
        f8509g = aVar;
        aVar.f8512h.dispose();
        Future<?> future = aVar.f8514j;
        if (future != null) {
            future.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = aVar.f8513i;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public b() {
        e eVar = c;
        this.a = eVar;
        a aVar = f8509g;
        AtomicReference<a> atomicReference = new AtomicReference<>(aVar);
        this.b = atomicReference;
        a aVar2 = new a(60L, f8507e, eVar);
        if (atomicReference.compareAndSet(aVar, aVar2)) {
            return;
        }
        aVar2.f8512h.dispose();
        Future<?> future = aVar2.f8514j;
        if (future != null) {
            future.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = aVar2.f8513i;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // g.c.o
    public o.b a() {
        return new C0219b(this.b.get());
    }
}
