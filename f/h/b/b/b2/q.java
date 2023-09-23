package f.h.b.b.b2;

import f.h.b.b.q1;

/* compiled from: ForwardingTimeline.java */
/* loaded from: classes.dex */
public abstract class q extends q1 {
    public final q1 b;

    public q(q1 q1Var) {
        this.b = q1Var;
    }

    @Override // f.h.b.b.q1
    public int a(boolean z) {
        return this.b.a(z);
    }

    @Override // f.h.b.b.q1
    public int b(Object obj) {
        return this.b.b(obj);
    }

    @Override // f.h.b.b.q1
    public int c(boolean z) {
        return this.b.c(z);
    }

    @Override // f.h.b.b.q1
    public int e(int i2, int i3, boolean z) {
        return this.b.e(i2, i3, z);
    }

    @Override // f.h.b.b.q1
    public q1.b g(int i2, q1.b bVar, boolean z) {
        return this.b.g(i2, bVar, z);
    }

    @Override // f.h.b.b.q1
    public int i() {
        return this.b.i();
    }

    @Override // f.h.b.b.q1
    public int l(int i2, int i3, boolean z) {
        return this.b.l(i2, i3, z);
    }

    @Override // f.h.b.b.q1
    public Object m(int i2) {
        return this.b.m(i2);
    }

    @Override // f.h.b.b.q1
    public int p() {
        return this.b.p();
    }
}
