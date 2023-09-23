package g.c.w.e.c;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;

/* compiled from: MaybeMap.java */
/* loaded from: classes2.dex */
public final class n<T, R> extends g.c.w.e.c.a<T, R> {

    /* renamed from: g  reason: collision with root package name */
    public final g.c.v.d<? super T, ? extends R> f8368g;

    /* compiled from: MaybeMap.java */
    /* loaded from: classes2.dex */
    public static final class a<T, R> implements g.c.j<T>, g.c.t.b {

        /* renamed from: f  reason: collision with root package name */
        public final g.c.j<? super R> f8369f;

        /* renamed from: g  reason: collision with root package name */
        public final g.c.v.d<? super T, ? extends R> f8370g;

        /* renamed from: h  reason: collision with root package name */
        public g.c.t.b f8371h;

        public a(g.c.j<? super R> jVar, g.c.v.d<? super T, ? extends R> dVar) {
            this.f8369f = jVar;
            this.f8370g = dVar;
        }

        @Override // g.c.t.b
        public void dispose() {
            g.c.t.b bVar = this.f8371h;
            this.f8371h = DisposableHelper.DISPOSED;
            bVar.dispose();
        }

        @Override // g.c.j
        public void onComplete() {
            this.f8369f.onComplete();
        }

        @Override // g.c.j
        public void onError(Throwable th) {
            this.f8369f.onError(th);
        }

        @Override // g.c.j
        public void onSubscribe(g.c.t.b bVar) {
            if (DisposableHelper.validate(this.f8371h, bVar)) {
                this.f8371h = bVar;
                this.f8369f.onSubscribe(this);
            }
        }

        @Override // g.c.j
        public void onSuccess(T t) {
            try {
                R apply = this.f8370g.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null item");
                this.f8369f.onSuccess(apply);
            } catch (Throwable th) {
                f.n.a.n.i.d0(th);
                this.f8369f.onError(th);
            }
        }
    }

    public n(g.c.k<T> kVar, g.c.v.d<? super T, ? extends R> dVar) {
        super(kVar);
        this.f8368g = dVar;
    }

    @Override // g.c.h
    public void l(g.c.j<? super R> jVar) {
        this.f8336f.a(new a(jVar, this.f8368g));
    }
}
