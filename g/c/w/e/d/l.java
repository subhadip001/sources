package g.c.w.e.d;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableScalarXMap.java */
/* loaded from: classes2.dex */
public final class l<T> extends AtomicInteger implements g.c.w.c.e<T>, Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final g.c.n<? super T> f8469f;

    /* renamed from: g  reason: collision with root package name */
    public final T f8470g;

    public l(g.c.n<? super T> nVar, T t) {
        this.f8469f = nVar;
        this.f8470g = t;
    }

    @Override // g.c.w.c.j
    public void clear() {
        lazySet(3);
    }

    @Override // g.c.t.b
    public void dispose() {
        set(3);
    }

    @Override // g.c.w.c.j
    public boolean isEmpty() {
        return get() != 1;
    }

    @Override // g.c.w.c.j
    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // g.c.w.c.j
    public T poll() {
        if (get() == 1) {
            lazySet(3);
            return this.f8470g;
        }
        return null;
    }

    @Override // g.c.w.c.f
    public int requestFusion(int i2) {
        if ((i2 & 1) != 0) {
            lazySet(1);
            return 1;
        }
        return 0;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            this.f8469f.onNext((T) this.f8470g);
            if (get() == 2) {
                lazySet(3);
                this.f8469f.onComplete();
            }
        }
    }
}
