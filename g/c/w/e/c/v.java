package g.c.w.e.c;

import io.reactivex.internal.disposables.DisposableHelper;

/* compiled from: MaybeToObservable.java */
/* loaded from: classes2.dex */
public final class v<T> extends g.c.l<T> {

    /* renamed from: f  reason: collision with root package name */
    public final g.c.k<T> f8400f;

    /* compiled from: MaybeToObservable.java */
    /* loaded from: classes2.dex */
    public static final class a<T> extends g.c.w.d.d<T> implements g.c.j<T> {

        /* renamed from: h  reason: collision with root package name */
        public g.c.t.b f8401h;

        public a(g.c.n<? super T> nVar) {
            super(nVar);
        }

        @Override // g.c.t.b
        public void dispose() {
            set(4);
            this.f8154g = null;
            this.f8401h.dispose();
        }

        @Override // g.c.j
        public void onComplete() {
            if ((get() & 54) != 0) {
                return;
            }
            lazySet(2);
            this.f8153f.onComplete();
        }

        @Override // g.c.j
        public void onError(Throwable th) {
            if ((get() & 54) != 0) {
                f.n.a.n.i.L(th);
                return;
            }
            lazySet(2);
            this.f8153f.onError(th);
        }

        @Override // g.c.j
        public void onSubscribe(g.c.t.b bVar) {
            if (DisposableHelper.validate(this.f8401h, bVar)) {
                this.f8401h = bVar;
                this.f8153f.onSubscribe(this);
            }
        }

        @Override // g.c.j
        public void onSuccess(T t) {
            int i2 = get();
            if ((i2 & 54) != 0) {
                return;
            }
            g.c.n<? super T> nVar = this.f8153f;
            if (i2 == 8) {
                this.f8154g = t;
                lazySet(16);
                nVar.onNext(null);
            } else {
                lazySet(2);
                nVar.onNext(t);
            }
            if (get() != 4) {
                nVar.onComplete();
            }
        }
    }

    public v(g.c.k<T> kVar) {
        this.f8400f = kVar;
    }

    @Override // g.c.l
    public void b(g.c.n<? super T> nVar) {
        this.f8400f.a(new a(nVar));
    }
}
