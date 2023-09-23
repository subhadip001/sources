package e.g0.t.t.s;

import e.g0.t.t.s.a;
import java.util.Objects;

/* compiled from: SettableFuture.java */
/* loaded from: classes.dex */
public final class c<V> extends a<V> {
    public boolean j(V v) {
        if (v == null) {
            v = (V) a.f2405l;
        }
        if (a.f2404k.b(this, null, v)) {
            a.c(this);
            return true;
        }
        return false;
    }

    public boolean k(Throwable th) {
        Objects.requireNonNull(th);
        if (a.f2404k.b(this, null, new a.d(th))) {
            a.c(this);
            return true;
        }
        return false;
    }

    public boolean l(f.h.c.g.a.c<? extends V> cVar) {
        a.d dVar;
        Objects.requireNonNull(cVar);
        Object obj = this.f2406f;
        if (obj == null) {
            if (cVar.isDone()) {
                if (!a.f2404k.b(this, null, a.f(cVar))) {
                    return false;
                }
                a.c(this);
            } else {
                a.g gVar = new a.g(this, cVar);
                if (a.f2404k.b(this, null, gVar)) {
                    try {
                        cVar.a(gVar, b.INSTANCE);
                    } catch (Throwable th) {
                        try {
                            dVar = new a.d(th);
                        } catch (Throwable unused) {
                            dVar = a.d.b;
                        }
                        a.f2404k.b(this, gVar, dVar);
                    }
                } else {
                    obj = this.f2406f;
                }
            }
            return true;
        }
        if (obj instanceof a.c) {
            cVar.cancel(((a.c) obj).a);
            return false;
        }
        return false;
    }
}
