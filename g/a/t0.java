package g.a;

import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SynchronizationContext.java */
/* loaded from: classes2.dex */
public final class t0 implements Executor {

    /* renamed from: f  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f7560f;

    /* renamed from: g  reason: collision with root package name */
    public final Queue<Runnable> f7561g = new ConcurrentLinkedQueue();

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReference<Thread> f7562h = new AtomicReference<>();

    /* compiled from: SynchronizationContext.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ b f7563f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Runnable f7564g;

        public a(b bVar, Runnable runnable) {
            this.f7563f = bVar;
            this.f7564g = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            t0.this.execute(this.f7563f);
        }

        public String toString() {
            return this.f7564g.toString() + "(scheduled in SynchronizationContext)";
        }
    }

    /* compiled from: SynchronizationContext.java */
    /* loaded from: classes2.dex */
    public static class b implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final Runnable f7566f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f7567g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f7568h;

        public b(Runnable runnable) {
            f.h.b.c.a.x(runnable, "task");
            this.f7566f = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f7567g) {
                return;
            }
            this.f7568h = true;
            this.f7566f.run();
        }
    }

    /* compiled from: SynchronizationContext.java */
    /* loaded from: classes2.dex */
    public static final class c {
        public final b a;
        public final ScheduledFuture<?> b;

        public c(b bVar, ScheduledFuture scheduledFuture, a aVar) {
            f.h.b.c.a.x(bVar, "runnable");
            this.a = bVar;
            f.h.b.c.a.x(scheduledFuture, "future");
            this.b = scheduledFuture;
        }

        public void a() {
            this.a.f7567g = true;
            this.b.cancel(false);
        }
    }

    public t0(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        f.h.b.c.a.x(uncaughtExceptionHandler, "uncaughtExceptionHandler");
        this.f7560f = uncaughtExceptionHandler;
    }

    public final void a() {
        while (this.f7562h.compareAndSet(null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable poll = this.f7561g.poll();
                    if (poll != null) {
                        poll.run();
                    } else {
                        this.f7562h.set(null);
                        if (this.f7561g.isEmpty()) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    this.f7562h.set(null);
                    throw th;
                }
            }
        }
    }

    public final void b(Runnable runnable) {
        Queue<Runnable> queue = this.f7561g;
        f.h.b.c.a.x(runnable, "runnable is null");
        queue.add(runnable);
    }

    public final c c(Runnable runnable, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        b bVar = new b(runnable);
        return new c(bVar, scheduledExecutorService.schedule(new a(bVar, runnable), j2, timeUnit), null);
    }

    public void d() {
        f.h.b.c.a.C(Thread.currentThread() == this.f7562h.get(), "Not called from the SynchronizationContext");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Queue<Runnable> queue = this.f7561g;
        f.h.b.c.a.x(runnable, "runnable is null");
        queue.add(runnable);
        a();
    }
}
