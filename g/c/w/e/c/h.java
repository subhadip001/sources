package g.c.w.e.c;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeFlatten.java */
/* loaded from: classes2.dex */
public final class h<T, R> extends g.c.w.e.c.a<T, R> {

    /* renamed from: g  reason: collision with root package name */
    public final g.c.v.d<? super T, ? extends g.c.k<? extends R>> f8354g;

    /* compiled from: MaybeFlatten.java */
    /* loaded from: classes2.dex */
    public static final class a<T, R> extends AtomicReference<g.c.t.b> implements g.c.j<T>, g.c.t.b {

        /* renamed from: f  reason: collision with root package name */
        public final g.c.j<? super R> f8355f;

        /* renamed from: g  reason: collision with root package name */
        public final g.c.v.d<? super T, ? extends g.c.k<? extends R>> f8356g;

        /* renamed from: h  reason: collision with root package name */
        public g.c.t.b f8357h;

        /* compiled from: MaybeFlatten.java */
        /* renamed from: g.c.w.e.c.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public final class C0212a implements g.c.j<R> {
            public C0212a() {
            }

            @Override // g.c.j
            public void onComplete() {
                a.this.f8355f.onComplete();
            }

            @Override // g.c.j
            public void onError(Throwable th) {
                a.this.f8355f.onError(th);
            }

            @Override // g.c.j
            public void onSubscribe(g.c.t.b bVar) {
                DisposableHelper.setOnce(a.this, bVar);
            }

            @Override // g.c.j
            public void onSuccess(R r) {
                a.this.f8355f.onSuccess(r);
            }
        }

        public a(g.c.j<? super R> jVar, g.c.v.d<? super T, ? extends g.c.k<? extends R>> dVar) {
            this.f8355f = jVar;
            this.f8356g = dVar;
        }

        public boolean a() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // g.c.t.b
        public void dispose() {
            DisposableHelper.dispose(this);
            this.f8357h.dispose();
        }

        @Override // g.c.j
        public void onComplete() {
            this.f8355f.onComplete();
        }

        @Override // g.c.j
        public void onError(Throwable th) {
            this.f8355f.onError(th);
        }

        @Override // g.c.j
        public void onSubscribe(g.c.t.b bVar) {
            if (DisposableHelper.validate(this.f8357h, bVar)) {
                this.f8357h = bVar;
                this.f8355f.onSubscribe(this);
            }
        }

        @Override // g.c.j
        public void onSuccess(T t) {
            try {
                g.c.k<? extends R> apply = this.f8356g.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                g.c.k<? extends R> kVar = apply;
                if (a()) {
                    return;
                }
                kVar.a(new C0212a());
            } catch (Exception e2) {
                f.n.a.n.i.d0(e2);
                this.f8355f.onError(e2);
            }
        }
    }

    public h(g.c.k<T> kVar, g.c.v.d<? super T, ? extends g.c.k<? extends R>> dVar) {
        super(kVar);
        this.f8354g = dVar;
    }

    @Override // g.c.h
    public void l(g.c.j<? super R> jVar) {
        this.f8336f.a(new a(jVar, this.f8354g));
    }
}
