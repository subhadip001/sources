package g.c.w.g;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: ScheduledRunnable.java */
/* loaded from: classes2.dex */
public final class g extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, g.c.t.b {

    /* renamed from: g  reason: collision with root package name */
    public static final Object f8530g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public static final Object f8531h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public static final Object f8532i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static final Object f8533j = new Object();

    /* renamed from: f  reason: collision with root package name */
    public final Runnable f8534f;

    public g(Runnable runnable, g.c.w.a.a aVar) {
        super(3);
        this.f8534f = runnable;
        lazySet(0, aVar);
    }

    public void a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f8533j) {
                return;
            }
            if (obj == f8531h) {
                future.cancel(false);
                return;
            } else if (obj == f8532i) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // g.c.t.b
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == f8533j || obj5 == (obj3 = f8531h) || obj5 == (obj4 = f8532i)) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (z) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 != null) {
                    ((Future) obj5).cancel(z);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == f8533j || obj == (obj2 = f8530g) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((g.c.w.a.a) obj).c(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        boolean compareAndSet;
        Object obj4;
        Object obj5;
        lazySet(2, Thread.currentThread());
        try {
            this.f8534f.run();
        } finally {
            try {
                lazySet(2, null);
                obj4 = get(0);
                if (obj4 != f8530g) {
                    ((g.c.w.a.a) obj4).c(this);
                }
                do {
                    obj5 = get(1);
                    if (obj5 != f8531h) {
                        return;
                    }
                    return;
                } while (!compareAndSet(1, obj5, f8533j));
            } catch (Throwable th) {
                do {
                    if (obj == obj2) {
                        break;
                    } else if (obj == obj3) {
                        break;
                    }
                } while (!compareAndSet);
            }
        }
        lazySet(2, null);
        obj4 = get(0);
        if (obj4 != f8530g && compareAndSet(0, obj4, f8533j) && obj4 != null) {
            ((g.c.w.a.a) obj4).c(this);
        }
        do {
            obj5 = get(1);
            if (obj5 != f8531h || obj5 == f8532i) {
                return;
            }
        } while (!compareAndSet(1, obj5, f8533j));
    }
}
