package g.c.w.e.c;

import io.reactivex.internal.disposables.DisposableHelper;

/* compiled from: MaybeFromCompletable.java */
/* loaded from: classes2.dex */
public final class j<T> extends g.c.h<T> {

    /* renamed from: f  reason: collision with root package name */
    public final g.c.c f8360f;

    /* compiled from: MaybeFromCompletable.java */
    /* loaded from: classes2.dex */
    public static final class a<T> implements g.c.b, g.c.t.b {

        /* renamed from: f  reason: collision with root package name */
        public final g.c.j<? super T> f8361f;

        /* renamed from: g  reason: collision with root package name */
        public g.c.t.b f8362g;

        public a(g.c.j<? super T> jVar) {
            this.f8361f = jVar;
        }

        @Override // g.c.t.b
        public void dispose() {
            this.f8362g.dispose();
            this.f8362g = DisposableHelper.DISPOSED;
        }

        @Override // g.c.b
        public void onComplete() {
            this.f8362g = DisposableHelper.DISPOSED;
            this.f8361f.onComplete();
        }

        @Override // g.c.b
        public void onError(Throwable th) {
            this.f8362g = DisposableHelper.DISPOSED;
            this.f8361f.onError(th);
        }

        @Override // g.c.b
        public void onSubscribe(g.c.t.b bVar) {
            if (DisposableHelper.validate(this.f8362g, bVar)) {
                this.f8362g = bVar;
                this.f8361f.onSubscribe(this);
            }
        }
    }

    public j(g.c.c cVar) {
        this.f8360f = cVar;
    }

    @Override // g.c.h
    public void l(g.c.j<? super T> jVar) {
        this.f8360f.b(new a(jVar));
    }
}
