package g.c.w.g;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Incorrect class signature, class is equals to this class: Lg/c/w/g/f;Ljava/util/concurrent/Callable<Ljava/lang/Void;>; */
/* compiled from: ScheduledDirectTask.java */
/* loaded from: classes2.dex */
public final class f extends AtomicReference implements Callable<Void>, g.c.t.b {

    /* renamed from: h  reason: collision with root package name */
    public static final FutureTask<Void> f8526h;

    /* renamed from: i  reason: collision with root package name */
    public static final FutureTask<Void> f8527i;

    /* renamed from: f  reason: collision with root package name */
    public final Runnable f8528f;

    /* renamed from: g  reason: collision with root package name */
    public Thread f8529g;

    static {
        Runnable runnable = g.c.w.b.a.b;
        f8526h = new FutureTask<>(runnable, null);
        f8527i = new FutureTask<>(runnable, null);
    }

    public f(Runnable runnable) {
        this.f8528f = runnable;
    }

    public final void a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == f8526h) {
                return;
            }
            if (future2 == f8527i) {
                future.cancel(this.f8529g != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // java.util.concurrent.Callable
    public Void call() {
        this.f8529g = Thread.currentThread();
        try {
            this.f8528f.run();
            return null;
        } finally {
            lazySet(f8526h);
            this.f8529g = null;
        }
    }

    @Override // g.c.t.b
    public final void dispose() {
        FutureTask<Void> futureTask;
        Future future = (Future) get();
        if (future == f8526h || future == (futureTask = f8527i) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f8529g != Thread.currentThread());
    }
}
