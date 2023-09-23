package g.c;

import g.c.w.b.a;
import g.c.w.e.c.t;
import java.util.Objects;

/* compiled from: Maybe.java */
/* loaded from: classes2.dex */
public abstract class h<T> implements k<T> {
    public static <T> h<T> i(T t) {
        Objects.requireNonNull(t, "item is null");
        return new g.c.w.e.c.m(t);
    }

    @Override // g.c.k
    public final void a(j<? super T> jVar) {
        Objects.requireNonNull(jVar, "observer is null");
        try {
            l(jVar);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            f.n.a.n.i.d0(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final h<T> c(T t) {
        Objects.requireNonNull(t, "item is null");
        return m(new g.c.w.e.c.m(t));
    }

    public final h<T> d(g.c.v.c<? super Throwable> cVar) {
        g.c.v.c<Object> cVar2 = g.c.w.b.a.f8141d;
        g.c.v.a aVar = g.c.w.b.a.c;
        return new g.c.w.e.c.q(this, cVar2, cVar2, cVar, aVar, aVar, aVar);
    }

    public final h<T> e(g.c.v.c<? super T> cVar) {
        g.c.v.c<Object> cVar2 = g.c.w.b.a.f8141d;
        g.c.v.a aVar = g.c.w.b.a.c;
        return new g.c.w.e.c.q(this, cVar2, cVar, cVar2, aVar, aVar, aVar);
    }

    public final h<T> f(g.c.v.e<? super T> eVar) {
        return new g.c.w.e.c.e(this, eVar);
    }

    public final <R> h<R> g(g.c.v.d<? super T, ? extends k<? extends R>> dVar) {
        return new g.c.w.e.c.h(this, dVar);
    }

    public final a h(g.c.v.d<? super T, ? extends c> dVar) {
        return new g.c.w.e.c.g(this, dVar);
    }

    public final <R> h<R> j(g.c.v.d<? super T, ? extends R> dVar) {
        return new g.c.w.e.c.n(this, dVar);
    }

    public final h<T> k(k<? extends T> kVar) {
        return new g.c.w.e.c.p(this, new a.g(kVar), true);
    }

    public abstract void l(j<? super T> jVar);

    public final h<T> m(k<? extends T> kVar) {
        return new t(this, kVar);
    }
}
