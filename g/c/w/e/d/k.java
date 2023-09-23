package g.c.w.e.d;

import java.util.Objects;

/* compiled from: ObservableMap.java */
/* loaded from: classes2.dex */
public final class k<T, U> extends g.c.w.e.d.a<T, U> {

    /* renamed from: g  reason: collision with root package name */
    public final g.c.v.d<? super T, ? extends U> f8467g;

    /* compiled from: ObservableMap.java */
    /* loaded from: classes2.dex */
    public static final class a<T, U> extends g.c.w.d.a<T, U> {

        /* renamed from: k  reason: collision with root package name */
        public final g.c.v.d<? super T, ? extends U> f8468k;

        public a(g.c.n<? super U> nVar, g.c.v.d<? super T, ? extends U> dVar) {
            super(nVar);
            this.f8468k = dVar;
        }

        @Override // g.c.n
        public void onNext(T t) {
            if (this.f8151i) {
                return;
            }
            if (this.f8152j != 0) {
                this.f8148f.onNext(null);
                return;
            }
            try {
                U apply = this.f8468k.apply(t);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                this.f8148f.onNext(apply);
            } catch (Throwable th) {
                f.n.a.n.i.d0(th);
                this.f8149g.dispose();
                onError(th);
            }
        }

        @Override // g.c.w.c.j
        public U poll() {
            T poll = this.f8150h.poll();
            if (poll != null) {
                U apply = this.f8468k.apply(poll);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                return apply;
            }
            return null;
        }

        @Override // g.c.w.c.f
        public int requestFusion(int i2) {
            return a(i2);
        }
    }

    public k(g.c.m<T> mVar, g.c.v.d<? super T, ? extends U> dVar) {
        super(mVar);
        this.f8467g = dVar;
    }

    @Override // g.c.l
    public void b(g.c.n<? super U> nVar) {
        this.f8411f.a(new a(nVar, this.f8467g));
    }
}
