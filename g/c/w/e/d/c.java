package g.c.w.e.d;

import g.c.p;
import g.c.q;
import io.reactivex.internal.disposables.DisposableHelper;

/* compiled from: ObservableAnySingle.java */
/* loaded from: classes2.dex */
public final class c<T> extends p<Boolean> implements g.c.w.c.d<Boolean> {
    public final g.c.m<T> a;
    public final g.c.v.e<? super T> b;

    /* compiled from: ObservableAnySingle.java */
    /* loaded from: classes2.dex */
    public static final class a<T> implements g.c.n<T>, g.c.t.b {

        /* renamed from: f  reason: collision with root package name */
        public final q<? super Boolean> f8417f;

        /* renamed from: g  reason: collision with root package name */
        public final g.c.v.e<? super T> f8418g;

        /* renamed from: h  reason: collision with root package name */
        public g.c.t.b f8419h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f8420i;

        public a(q<? super Boolean> qVar, g.c.v.e<? super T> eVar) {
            this.f8417f = qVar;
            this.f8418g = eVar;
        }

        @Override // g.c.t.b
        public void dispose() {
            this.f8419h.dispose();
        }

        @Override // g.c.n
        public void onComplete() {
            if (this.f8420i) {
                return;
            }
            this.f8420i = true;
            this.f8417f.onSuccess(Boolean.FALSE);
        }

        @Override // g.c.n
        public void onError(Throwable th) {
            if (this.f8420i) {
                f.n.a.n.i.L(th);
                return;
            }
            this.f8420i = true;
            this.f8417f.onError(th);
        }

        @Override // g.c.n
        public void onNext(T t) {
            if (this.f8420i) {
                return;
            }
            try {
                if (this.f8418g.a(t)) {
                    this.f8420i = true;
                    this.f8419h.dispose();
                    this.f8417f.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th) {
                f.n.a.n.i.d0(th);
                this.f8419h.dispose();
                onError(th);
            }
        }

        @Override // g.c.n
        public void onSubscribe(g.c.t.b bVar) {
            if (DisposableHelper.validate(this.f8419h, bVar)) {
                this.f8419h = bVar;
                this.f8417f.onSubscribe(this);
            }
        }
    }

    public c(g.c.m<T> mVar, g.c.v.e<? super T> eVar) {
        this.a = mVar;
        this.b = eVar;
    }

    @Override // g.c.w.c.d
    public g.c.l<Boolean> a() {
        return new b(this.a, this.b);
    }

    @Override // g.c.p
    public void d(q<? super Boolean> qVar) {
        this.a.a(new a(qVar, this.b));
    }
}
