package g.c.w.e.c;

import io.reactivex.internal.disposables.DisposableHelper;

/* compiled from: MaybeFilterSingle.java */
/* loaded from: classes2.dex */
public final class f<T> extends g.c.h<T> {

    /* renamed from: f  reason: collision with root package name */
    public final g.c.r<T> f8347f;

    /* renamed from: g  reason: collision with root package name */
    public final g.c.v.e<? super T> f8348g;

    /* compiled from: MaybeFilterSingle.java */
    /* loaded from: classes2.dex */
    public static final class a<T> implements g.c.q<T>, g.c.t.b {

        /* renamed from: f  reason: collision with root package name */
        public final g.c.j<? super T> f8349f;

        /* renamed from: g  reason: collision with root package name */
        public final g.c.v.e<? super T> f8350g;

        /* renamed from: h  reason: collision with root package name */
        public g.c.t.b f8351h;

        public a(g.c.j<? super T> jVar, g.c.v.e<? super T> eVar) {
            this.f8349f = jVar;
            this.f8350g = eVar;
        }

        @Override // g.c.t.b
        public void dispose() {
            g.c.t.b bVar = this.f8351h;
            this.f8351h = DisposableHelper.DISPOSED;
            bVar.dispose();
        }

        @Override // g.c.q
        public void onError(Throwable th) {
            this.f8349f.onError(th);
        }

        @Override // g.c.q
        public void onSubscribe(g.c.t.b bVar) {
            if (DisposableHelper.validate(this.f8351h, bVar)) {
                this.f8351h = bVar;
                this.f8349f.onSubscribe(this);
            }
        }

        @Override // g.c.q
        public void onSuccess(T t) {
            try {
                if (this.f8350g.a(t)) {
                    this.f8349f.onSuccess(t);
                } else {
                    this.f8349f.onComplete();
                }
            } catch (Throwable th) {
                f.n.a.n.i.d0(th);
                this.f8349f.onError(th);
            }
        }
    }

    public f(g.c.r<T> rVar, g.c.v.e<? super T> eVar) {
        this.f8347f = rVar;
        this.f8348g = eVar;
    }

    @Override // g.c.h
    public void l(g.c.j<? super T> jVar) {
        this.f8347f.b(new a(jVar, this.f8348g));
    }
}
