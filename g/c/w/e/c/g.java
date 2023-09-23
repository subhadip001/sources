package g.c.w.e.c;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeFlatMapCompletable.java */
/* loaded from: classes2.dex */
public final class g<T> extends g.c.a {
    public final g.c.k<T> a;
    public final g.c.v.d<? super T, ? extends g.c.c> b;

    /* compiled from: MaybeFlatMapCompletable.java */
    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicReference<g.c.t.b> implements g.c.j<T>, g.c.b, g.c.t.b {

        /* renamed from: f  reason: collision with root package name */
        public final g.c.b f8352f;

        /* renamed from: g  reason: collision with root package name */
        public final g.c.v.d<? super T, ? extends g.c.c> f8353g;

        public a(g.c.b bVar, g.c.v.d<? super T, ? extends g.c.c> dVar) {
            this.f8352f = bVar;
            this.f8353g = dVar;
        }

        public boolean a() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // g.c.t.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // g.c.j
        public void onComplete() {
            this.f8352f.onComplete();
        }

        @Override // g.c.j
        public void onError(Throwable th) {
            this.f8352f.onError(th);
        }

        @Override // g.c.j
        public void onSubscribe(g.c.t.b bVar) {
            DisposableHelper.replace(this, bVar);
        }

        @Override // g.c.j
        public void onSuccess(T t) {
            try {
                g.c.c apply = this.f8353g.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                g.c.c cVar = apply;
                if (a()) {
                    return;
                }
                cVar.b(this);
            } catch (Throwable th) {
                f.n.a.n.i.d0(th);
                onError(th);
            }
        }
    }

    public g(g.c.k<T> kVar, g.c.v.d<? super T, ? extends g.c.c> dVar) {
        this.a = kVar;
        this.b = dVar;
    }

    @Override // g.c.a
    public void h(g.c.b bVar) {
        a aVar = new a(bVar, this.b);
        bVar.onSubscribe(aVar);
        this.a.a(aVar);
    }
}
