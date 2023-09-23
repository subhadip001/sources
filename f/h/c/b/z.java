package f.h.c.b;

import f.h.c.b.a0;

/* compiled from: MapMaker.java */
/* loaded from: classes.dex */
public final class z {
    public boolean a;
    public a0.n b;

    public a0.n a() {
        return (a0.n) f.h.b.c.a.k0(this.b, a0.n.f5882f);
    }

    public a0.n b() {
        return (a0.n) f.h.b.c.a.k0(null, a0.n.f5882f);
    }

    public String toString() {
        f.h.c.a.i c1 = f.h.b.c.a.c1(this);
        a0.n nVar = this.b;
        if (nVar != null) {
            c1.c("keyStrength", f.h.b.c.a.b1(nVar.toString()));
        }
        return c1.toString();
    }
}
