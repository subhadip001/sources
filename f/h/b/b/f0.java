package f.h.b.b;

import f.h.b.b.q1;

/* compiled from: BasePlayer.java */
/* loaded from: classes.dex */
public abstract class f0 implements f1 {
    public final q1.c a = new q1.c();

    @Override // f.h.b.b.f1
    public final boolean hasNext() {
        return z() != -1;
    }

    @Override // f.h.b.b.f1
    public final boolean hasPrevious() {
        return u() != -1;
    }

    @Override // f.h.b.b.f1
    public final boolean l() {
        q1 D = D();
        return !D.q() && D.n(p(), this.a).f4472h;
    }

    @Override // f.h.b.b.f1
    public final int u() {
        q1 D = D();
        if (D.q()) {
            return -1;
        }
        int p = p();
        int C = C();
        if (C == 1) {
            C = 0;
        }
        return D.l(p, C, F());
    }

    @Override // f.h.b.b.f1
    public final boolean w() {
        return v() == 3 && h() && A() == 0;
    }

    @Override // f.h.b.b.f1
    public final int z() {
        q1 D = D();
        if (D.q()) {
            return -1;
        }
        int p = p();
        int C = C();
        if (C == 1) {
            C = 0;
        }
        return D.e(p, C, F());
    }
}
