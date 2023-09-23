package g.c.w.e.c;

import io.reactivex.internal.disposables.DisposableHelper;

/* compiled from: MaybeToFlowable.java */
/* loaded from: classes2.dex */
public final class u<T> extends g.c.d<T> {

    /* renamed from: g  reason: collision with root package name */
    public final g.c.k<T> f8398g;

    /* compiled from: MaybeToFlowable.java */
    /* loaded from: classes2.dex */
    public static final class a<T> extends g.c.w.i.c<T> implements g.c.j<T> {

        /* renamed from: h  reason: collision with root package name */
        public g.c.t.b f8399h;

        public a(m.c.b<? super T> bVar) {
            super(bVar);
        }

        @Override // g.c.w.i.c, m.c.c
        public void cancel() {
            super.cancel();
            this.f8399h.dispose();
        }

        @Override // g.c.j
        public void onComplete() {
            this.f8572f.onComplete();
        }

        @Override // g.c.j
        public void onError(Throwable th) {
            this.f8572f.onError(th);
        }

        @Override // g.c.j
        public void onSubscribe(g.c.t.b bVar) {
            if (DisposableHelper.validate(this.f8399h, bVar)) {
                this.f8399h = bVar;
                this.f8572f.onSubscribe(this);
            }
        }

        @Override // g.c.j
        public void onSuccess(T t) {
            b(t);
        }
    }

    public u(g.c.k<T> kVar) {
        this.f8398g = kVar;
    }

    @Override // g.c.d
    public void e(m.c.b<? super T> bVar) {
        this.f8398g.a(new a(bVar));
    }
}
