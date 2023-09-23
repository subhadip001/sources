package g.c.w.e.e;

import f.n.a.n.i;
import g.c.p;
import g.c.q;
import g.c.r;
import io.reactivex.exceptions.CompositeException;

/* compiled from: SingleDoOnError.java */
/* loaded from: classes2.dex */
public final class a<T> extends p<T> {
    public final r<T> a;
    public final g.c.v.c<? super Throwable> b;

    /* compiled from: SingleDoOnError.java */
    /* renamed from: g.c.w.e.e.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0217a implements q<T> {

        /* renamed from: f  reason: collision with root package name */
        public final q<? super T> f8478f;

        public C0217a(q<? super T> qVar) {
            this.f8478f = qVar;
        }

        @Override // g.c.q
        public void onError(Throwable th) {
            try {
                a.this.b.accept(th);
            } catch (Throwable th2) {
                i.d0(th2);
                th = new CompositeException(th, th2);
            }
            this.f8478f.onError(th);
        }

        @Override // g.c.q
        public void onSubscribe(g.c.t.b bVar) {
            this.f8478f.onSubscribe(bVar);
        }

        @Override // g.c.q
        public void onSuccess(T t) {
            this.f8478f.onSuccess(t);
        }
    }

    public a(r<T> rVar, g.c.v.c<? super Throwable> cVar) {
        this.a = rVar;
        this.b = cVar;
    }

    @Override // g.c.p
    public void d(q<? super T> qVar) {
        this.a.b(new C0217a(qVar));
    }
}
