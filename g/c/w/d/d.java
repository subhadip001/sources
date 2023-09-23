package g.c.w.d;

import g.c.n;

/* compiled from: DeferredScalarDisposable.java */
/* loaded from: classes2.dex */
public class d<T> extends b<T> {

    /* renamed from: f  reason: collision with root package name */
    public final n<? super T> f8153f;

    /* renamed from: g  reason: collision with root package name */
    public T f8154g;

    public d(n<? super T> nVar) {
        this.f8153f = nVar;
    }

    @Override // g.c.w.c.j
    public final void clear() {
        lazySet(32);
        this.f8154g = null;
    }

    @Override // g.c.w.c.j
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // g.c.w.c.j
    public final T poll() {
        if (get() == 16) {
            T t = this.f8154g;
            this.f8154g = null;
            lazySet(32);
            return t;
        }
        return null;
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
