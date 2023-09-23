package g.c.w.e.c;

import io.reactivex.internal.disposables.DisposableHelper;

/* compiled from: MaybeFilter.java */
/* loaded from: classes2.dex */
public final class e<T> extends g.c.w.e.c.a<T, T> {

    /* renamed from: g  reason: collision with root package name */
    public final g.c.v.e<? super T> f8343g;

    /* compiled from: MaybeFilter.java */
    /* loaded from: classes2.dex */
    public static final class a<T> implements g.c.j<T>, g.c.t.b {

        /* renamed from: f  reason: collision with root package name */
        public final g.c.j<? super T> f8344f;

        /* renamed from: g  reason: collision with root package name */
        public final g.c.v.e<? super T> f8345g;

        /* renamed from: h  reason: collision with root package name */
        public g.c.t.b f8346h;

        public a(g.c.j<? super T> jVar, g.c.v.e<? super T> eVar) {
            this.f8344f = jVar;
            this.f8345g = eVar;
        }

        @Override // g.c.t.b
        public void dispose() {
            g.c.t.b bVar = this.f8346h;
            this.f8346h = DisposableHelper.DISPOSED;
            bVar.dispose();
        }

        @Override // g.c.j
        public void onComplete() {
            this.f8344f.onComplete();
        }

        @Override // g.c.j
        public void onError(Throwable th) {
            this.f8344f.onError(th);
        }

        @Override // g.c.j
        public void onSubscribe(g.c.t.b bVar) {
            if (DisposableHelper.validate(this.f8346h, bVar)) {
                this.f8346h = bVar;
                this.f8344f.onSubscribe(this);
            }
        }

        @Override // g.c.j
        public void onSuccess(T t) {
            try {
                if (this.f8345g.a(t)) {
                    this.f8344f.onSuccess(t);
                } else {
                    this.f8344f.onComplete();
                }
            } catch (Throwable th) {
                f.n.a.n.i.d0(th);
                this.f8344f.onError(th);
            }
        }
    }

    public e(g.c.k<T> kVar, g.c.v.e<? super T> eVar) {
        super(kVar);
        this.f8343g = eVar;
    }

    @Override // g.c.h
    public void l(g.c.j<? super T> jVar) {
        this.f8336f.a(new a(jVar, this.f8343g));
    }
}
