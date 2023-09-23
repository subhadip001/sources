package g.c.w.e.c;

import io.reactivex.internal.disposables.DisposableHelper;

/* compiled from: MaybeIsEmptySingle.java */
/* loaded from: classes2.dex */
public final class l<T> extends g.c.p<Boolean> implements Object<T> {
    public final g.c.k<T> a;

    /* compiled from: MaybeIsEmptySingle.java */
    /* loaded from: classes2.dex */
    public static final class a<T> implements g.c.j<T>, g.c.t.b {

        /* renamed from: f  reason: collision with root package name */
        public final g.c.q<? super Boolean> f8365f;

        /* renamed from: g  reason: collision with root package name */
        public g.c.t.b f8366g;

        public a(g.c.q<? super Boolean> qVar) {
            this.f8365f = qVar;
        }

        @Override // g.c.t.b
        public void dispose() {
            this.f8366g.dispose();
            this.f8366g = DisposableHelper.DISPOSED;
        }

        @Override // g.c.j
        public void onComplete() {
            this.f8366g = DisposableHelper.DISPOSED;
            this.f8365f.onSuccess(Boolean.TRUE);
        }

        @Override // g.c.j
        public void onError(Throwable th) {
            this.f8366g = DisposableHelper.DISPOSED;
            this.f8365f.onError(th);
        }

        @Override // g.c.j
        public void onSubscribe(g.c.t.b bVar) {
            if (DisposableHelper.validate(this.f8366g, bVar)) {
                this.f8366g = bVar;
                this.f8365f.onSubscribe(this);
            }
        }

        @Override // g.c.j
        public void onSuccess(T t) {
            this.f8366g = DisposableHelper.DISPOSED;
            this.f8365f.onSuccess(Boolean.FALSE);
        }
    }

    public l(g.c.k<T> kVar) {
        this.a = kVar;
    }

    public g.c.h<Boolean> c() {
        return new k(this.a);
    }

    @Override // g.c.p
    public void d(g.c.q<? super Boolean> qVar) {
        this.a.a(new a(qVar));
    }
}
