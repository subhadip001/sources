package g.c.w.i;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* compiled from: DeferredScalarSubscription.java */
/* loaded from: classes2.dex */
public class c<T> extends a<T> {

    /* renamed from: f  reason: collision with root package name */
    public final m.c.b<? super T> f8572f;

    /* renamed from: g  reason: collision with root package name */
    public T f8573g;

    public c(m.c.b<? super T> bVar) {
        this.f8572f = bVar;
    }

    public final void b(T t) {
        int i2 = get();
        while (i2 != 8) {
            if ((i2 & (-3)) != 0) {
                return;
            }
            if (i2 == 2) {
                lazySet(3);
                m.c.b<? super T> bVar = this.f8572f;
                bVar.onNext(t);
                if (get() != 4) {
                    bVar.onComplete();
                    return;
                }
                return;
            }
            this.f8573g = t;
            if (compareAndSet(0, 1)) {
                return;
            }
            i2 = get();
            if (i2 == 4) {
                this.f8573g = null;
                return;
            }
        }
        this.f8573g = t;
        lazySet(16);
        m.c.b<? super T> bVar2 = this.f8572f;
        bVar2.onNext(t);
        if (get() != 4) {
            bVar2.onComplete();
        }
    }

    public void cancel() {
        set(4);
        this.f8573g = null;
    }

    @Override // g.c.w.c.j
    public final void clear() {
        lazySet(32);
        this.f8573g = null;
    }

    @Override // g.c.w.c.j
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // g.c.w.c.j
    public final T poll() {
        if (get() == 16) {
            lazySet(32);
            T t = this.f8573g;
            this.f8573g = null;
            return t;
        }
        return null;
    }

    @Override // m.c.c
    public final void request(long j2) {
        T t;
        if (SubscriptionHelper.validate(j2)) {
            do {
                int i2 = get();
                if ((i2 & (-2)) != 0) {
                    return;
                }
                if (i2 == 1) {
                    if (!compareAndSet(1, 3) || (t = this.f8573g) == null) {
                        return;
                    }
                    this.f8573g = null;
                    m.c.b<? super T> bVar = this.f8572f;
                    bVar.onNext(t);
                    if (get() != 4) {
                        bVar.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    @Override // g.c.w.c.f
    public final int requestFusion(int i2) {
        if ((i2 & 2) != 0) {
            lazySet(8);
            return 2;
        }
        return 0;
    }
}
