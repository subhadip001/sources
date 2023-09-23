package g.c.w.e.a;

import f.n.a.n.i;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;

/* compiled from: CompletablePeek.java */
/* loaded from: classes2.dex */
public final class f extends g.c.a {
    public final g.c.c a;
    public final g.c.v.c<? super g.c.t.b> b;
    public final g.c.v.c<? super Throwable> c;

    /* renamed from: d  reason: collision with root package name */
    public final g.c.v.a f8163d;

    /* renamed from: e  reason: collision with root package name */
    public final g.c.v.a f8164e;

    /* renamed from: f  reason: collision with root package name */
    public final g.c.v.a f8165f;

    /* renamed from: g  reason: collision with root package name */
    public final g.c.v.a f8166g;

    /* compiled from: CompletablePeek.java */
    /* loaded from: classes2.dex */
    public final class a implements g.c.b, g.c.t.b {

        /* renamed from: f  reason: collision with root package name */
        public final g.c.b f8167f;

        /* renamed from: g  reason: collision with root package name */
        public g.c.t.b f8168g;

        public a(g.c.b bVar) {
            this.f8167f = bVar;
        }

        @Override // g.c.t.b
        public void dispose() {
            try {
                f.this.f8166g.run();
            } catch (Throwable th) {
                i.d0(th);
                i.L(th);
            }
            this.f8168g.dispose();
        }

        @Override // g.c.b
        public void onComplete() {
            if (this.f8168g == DisposableHelper.DISPOSED) {
                return;
            }
            try {
                f.this.f8163d.run();
                f.this.f8164e.run();
                this.f8167f.onComplete();
                try {
                    f.this.f8165f.run();
                } catch (Throwable th) {
                    i.d0(th);
                    i.L(th);
                }
            } catch (Throwable th2) {
                i.d0(th2);
                this.f8167f.onError(th2);
            }
        }

        @Override // g.c.b
        public void onError(Throwable th) {
            if (this.f8168g == DisposableHelper.DISPOSED) {
                i.L(th);
                return;
            }
            try {
                f.this.c.accept(th);
                f.this.f8164e.run();
            } catch (Throwable th2) {
                i.d0(th2);
                th = new CompositeException(th, th2);
            }
            this.f8167f.onError(th);
            try {
                f.this.f8165f.run();
            } catch (Throwable th3) {
                i.d0(th3);
                i.L(th3);
            }
        }

        @Override // g.c.b
        public void onSubscribe(g.c.t.b bVar) {
            try {
                f.this.b.accept(bVar);
                if (DisposableHelper.validate(this.f8168g, bVar)) {
                    this.f8168g = bVar;
                    this.f8167f.onSubscribe(this);
                }
            } catch (Throwable th) {
                i.d0(th);
                bVar.dispose();
                this.f8168g = DisposableHelper.DISPOSED;
                EmptyDisposable.error(th, this.f8167f);
            }
        }
    }

    public f(g.c.c cVar, g.c.v.c<? super g.c.t.b> cVar2, g.c.v.c<? super Throwable> cVar3, g.c.v.a aVar, g.c.v.a aVar2, g.c.v.a aVar3, g.c.v.a aVar4) {
        this.a = cVar;
        this.b = cVar2;
        this.c = cVar3;
        this.f8163d = aVar;
        this.f8164e = aVar2;
        this.f8165f = aVar3;
        this.f8166g = aVar4;
    }

    @Override // g.c.a
    public void h(g.c.b bVar) {
        this.a.b(new a(bVar));
    }
}
