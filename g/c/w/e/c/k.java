package g.c.w.e.c;

import io.reactivex.internal.disposables.DisposableHelper;

/* compiled from: MaybeIsEmpty.java */
/* loaded from: classes2.dex */
public final class k<T> extends g.c.w.e.c.a<T, Boolean> {

    /* compiled from: MaybeIsEmpty.java */
    /* loaded from: classes2.dex */
    public static final class a<T> implements g.c.j<T>, g.c.t.b {

        /* renamed from: f  reason: collision with root package name */
        public final g.c.j<? super Boolean> f8363f;

        /* renamed from: g  reason: collision with root package name */
        public g.c.t.b f8364g;

        public a(g.c.j<? super Boolean> jVar) {
            this.f8363f = jVar;
        }

        @Override // g.c.t.b
        public void dispose() {
            this.f8364g.dispose();
        }

        @Override // g.c.j
        public void onComplete() {
            this.f8363f.onSuccess(Boolean.TRUE);
        }

        @Override // g.c.j
        public void onError(Throwable th) {
            this.f8363f.onError(th);
        }

        @Override // g.c.j
        public void onSubscribe(g.c.t.b bVar) {
            if (DisposableHelper.validate(this.f8364g, bVar)) {
                this.f8364g = bVar;
                this.f8363f.onSubscribe(this);
            }
        }

        @Override // g.c.j
        public void onSuccess(T t) {
            this.f8363f.onSuccess(Boolean.FALSE);
        }
    }

    public k(g.c.k<T> kVar) {
        super(kVar);
    }

    @Override // g.c.h
    public void l(g.c.j<? super Boolean> jVar) {
        this.f8336f.a(new a(jVar));
    }
}
