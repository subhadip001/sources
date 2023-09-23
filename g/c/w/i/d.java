package g.c.w.i;

import g.c.w.c.g;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ScalarSubscription.java */
/* loaded from: classes2.dex */
public final class d<T> extends AtomicInteger implements g<T> {

    /* renamed from: f  reason: collision with root package name */
    public final T f8574f;

    /* renamed from: g  reason: collision with root package name */
    public final m.c.b<? super T> f8575g;

    public d(m.c.b<? super T> bVar, T t) {
        this.f8575g = bVar;
        this.f8574f = t;
    }

    @Override // m.c.c
    public void cancel() {
        lazySet(2);
    }

    @Override // g.c.w.c.j
    public void clear() {
        lazySet(1);
    }

    @Override // g.c.w.c.j
    public boolean isEmpty() {
        return get() != 0;
    }

    @Override // g.c.w.c.j
    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // g.c.w.c.j
    public T poll() {
        if (get() == 0) {
            lazySet(1);
            return this.f8574f;
        }
        return null;
    }

    @Override // m.c.c
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2) && compareAndSet(0, 1)) {
            m.c.b<? super T> bVar = this.f8575g;
            bVar.onNext((T) this.f8574f);
            if (get() != 2) {
                bVar.onComplete();
            }
        }
    }

    @Override // g.c.w.c.f
    public int requestFusion(int i2) {
        return i2 & 1;
    }
}
