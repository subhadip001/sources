package g.c;

import java.util.Objects;

/* compiled from: Completable.java */
/* loaded from: classes2.dex */
public abstract class a implements c {
    @Override // g.c.c
    public final void b(b bVar) {
        Objects.requireNonNull(bVar, "s is null");
        try {
            h(bVar);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            f.n.a.n.i.d0(th);
            f.n.a.n.i.L(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final a c(c cVar) {
        Objects.requireNonNull(cVar, "other is null");
        return new g.c.w.e.a.a(new c[]{this, cVar});
    }

    public final a d(g.c.v.a aVar) {
        g.c.v.c<? super g.c.t.b> cVar = g.c.w.b.a.f8141d;
        g.c.v.a aVar2 = g.c.w.b.a.c;
        return f(cVar, cVar, aVar, aVar2, aVar2, aVar2);
    }

    public final a e(g.c.v.c<? super Throwable> cVar) {
        g.c.v.c<? super g.c.t.b> cVar2 = g.c.w.b.a.f8141d;
        g.c.v.a aVar = g.c.w.b.a.c;
        return f(cVar2, cVar, aVar, aVar, aVar, aVar);
    }

    public final a f(g.c.v.c<? super g.c.t.b> cVar, g.c.v.c<? super Throwable> cVar2, g.c.v.a aVar, g.c.v.a aVar2, g.c.v.a aVar3, g.c.v.a aVar4) {
        Objects.requireNonNull(cVar2, "onError is null");
        Objects.requireNonNull(aVar, "onComplete is null");
        return new g.c.w.e.a.f(this, cVar, cVar2, aVar, aVar2, aVar3, aVar4);
    }

    public final g.c.t.b g() {
        g.c.w.d.e eVar = new g.c.w.d.e();
        b(eVar);
        return eVar;
    }

    public abstract void h(b bVar);

    public final <T> h<T> i() {
        if (this instanceof g.c.w.c.c) {
            return ((g.c.w.c.c) this).c();
        }
        return new g.c.w.e.c.j(this);
    }
}
