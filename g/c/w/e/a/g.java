package g.c.w.e.a;

import f.n.a.n.i;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;

/* compiled from: CompletableResumeNext.java */
/* loaded from: classes2.dex */
public final class g extends g.c.a {
    public final g.c.c a;
    public final g.c.v.d<? super Throwable, ? extends g.c.c> b;

    /* compiled from: CompletableResumeNext.java */
    /* loaded from: classes2.dex */
    public final class a implements g.c.b {

        /* renamed from: f  reason: collision with root package name */
        public final g.c.b f8170f;

        /* renamed from: g  reason: collision with root package name */
        public final g.c.w.a.c f8171g;

        /* compiled from: CompletableResumeNext.java */
        /* renamed from: g.c.w.e.a.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public final class C0208a implements g.c.b {
            public C0208a() {
            }

            @Override // g.c.b
            public void onComplete() {
                a.this.f8170f.onComplete();
            }

            @Override // g.c.b
            public void onError(Throwable th) {
                a.this.f8170f.onError(th);
            }

            @Override // g.c.b
            public void onSubscribe(g.c.t.b bVar) {
                g.c.w.a.c cVar = a.this.f8171g;
                Objects.requireNonNull(cVar);
                DisposableHelper.set(cVar, bVar);
            }
        }

        public a(g.c.b bVar, g.c.w.a.c cVar) {
            this.f8170f = bVar;
            this.f8171g = cVar;
        }

        @Override // g.c.b
        public void onComplete() {
            this.f8170f.onComplete();
        }

        @Override // g.c.b
        public void onError(Throwable th) {
            try {
                g.c.c apply = g.this.b.apply(th);
                if (apply == null) {
                    NullPointerException nullPointerException = new NullPointerException("The CompletableConsumable returned is null");
                    nullPointerException.initCause(th);
                    this.f8170f.onError(nullPointerException);
                    return;
                }
                apply.b(new C0208a());
            } catch (Throwable th2) {
                i.d0(th2);
                this.f8170f.onError(new CompositeException(th2, th));
            }
        }

        @Override // g.c.b
        public void onSubscribe(g.c.t.b bVar) {
            g.c.w.a.c cVar = this.f8171g;
            Objects.requireNonNull(cVar);
            DisposableHelper.set(cVar, bVar);
        }
    }

    public g(g.c.c cVar, g.c.v.d<? super Throwable, ? extends g.c.c> dVar) {
        this.a = cVar;
        this.b = dVar;
    }

    @Override // g.c.a
    public void h(g.c.b bVar) {
        g.c.w.a.c cVar = new g.c.w.a.c();
        bVar.onSubscribe(cVar);
        this.a.b(new a(bVar, cVar));
    }
}
