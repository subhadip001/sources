package g.c.w.e.d;

import io.reactivex.internal.disposables.DisposableHelper;

/* compiled from: ObservableAny.java */
/* loaded from: classes2.dex */
public final class b<T> extends g.c.w.e.d.a<T, Boolean> {

    /* renamed from: g  reason: collision with root package name */
    public final g.c.v.e<? super T> f8412g;

    /* compiled from: ObservableAny.java */
    /* loaded from: classes2.dex */
    public static final class a<T> implements g.c.n<T>, g.c.t.b {

        /* renamed from: f  reason: collision with root package name */
        public final g.c.n<? super Boolean> f8413f;

        /* renamed from: g  reason: collision with root package name */
        public final g.c.v.e<? super T> f8414g;

        /* renamed from: h  reason: collision with root package name */
        public g.c.t.b f8415h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f8416i;

        public a(g.c.n<? super Boolean> nVar, g.c.v.e<? super T> eVar) {
            this.f8413f = nVar;
            this.f8414g = eVar;
        }

        @Override // g.c.t.b
        public void dispose() {
            this.f8415h.dispose();
        }

        @Override // g.c.n
        public void onComplete() {
            if (this.f8416i) {
                return;
            }
            this.f8416i = true;
            this.f8413f.onNext(Boolean.FALSE);
            this.f8413f.onComplete();
        }

        @Override // g.c.n
        public void onError(Throwable th) {
            if (this.f8416i) {
                f.n.a.n.i.L(th);
                return;
            }
            this.f8416i = true;
            this.f8413f.onError(th);
        }

        @Override // g.c.n
        public void onNext(T t) {
            if (this.f8416i) {
                return;
            }
            try {
                if (this.f8414g.a(t)) {
                    this.f8416i = true;
                    this.f8415h.dispose();
                    this.f8413f.onNext(Boolean.TRUE);
                    this.f8413f.onComplete();
                }
            } catch (Throwable th) {
                f.n.a.n.i.d0(th);
                this.f8415h.dispose();
                onError(th);
            }
        }

        @Override // g.c.n
        public void onSubscribe(g.c.t.b bVar) {
            if (DisposableHelper.validate(this.f8415h, bVar)) {
                this.f8415h = bVar;
                this.f8413f.onSubscribe(this);
            }
        }
    }

    public b(g.c.m<T> mVar, g.c.v.e<? super T> eVar) {
        super(mVar);
        this.f8412g = eVar;
    }

    @Override // g.c.l
    public void b(g.c.n<? super Boolean> nVar) {
        this.f8411f.a(new a(nVar, this.f8412g));
    }
}
