package g.c.w.e.e;

import f.n.a.n.i;
import g.c.p;
import g.c.q;
import g.c.r;

/* compiled from: SingleDoOnSuccess.java */
/* loaded from: classes2.dex */
public final class b<T> extends p<T> {
    public final r<T> a;
    public final g.c.v.c<? super T> b;

    /* compiled from: SingleDoOnSuccess.java */
    /* loaded from: classes2.dex */
    public final class a implements q<T> {

        /* renamed from: f  reason: collision with root package name */
        public final q<? super T> f8480f;

        public a(q<? super T> qVar) {
            this.f8480f = qVar;
        }

        @Override // g.c.q
        public void onError(Throwable th) {
            this.f8480f.onError(th);
        }

        @Override // g.c.q
        public void onSubscribe(g.c.t.b bVar) {
            this.f8480f.onSubscribe(bVar);
        }

        @Override // g.c.q
        public void onSuccess(T t) {
            try {
                b.this.b.accept(t);
                this.f8480f.onSuccess(t);
            } catch (Throwable th) {
                i.d0(th);
                this.f8480f.onError(th);
            }
        }
    }

    public b(r<T> rVar, g.c.v.c<? super T> cVar) {
        this.a = rVar;
        this.b = cVar;
    }

    @Override // g.c.p
    public void d(q<? super T> qVar) {
        this.a.b(new a(qVar));
    }
}
