package e.g.a.h.j;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import e.g.a.h.j.f;

/* compiled from: HelperReferences.java */
/* loaded from: classes.dex */
public class j extends o {
    public j(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    @Override // e.g.a.h.j.o, e.g.a.h.j.d
    public void a(d dVar) {
        e.g.a.h.a aVar = (e.g.a.h.a) this.b;
        int i2 = aVar.t0;
        int i3 = 0;
        int i4 = -1;
        for (f fVar : this.f2097h.f2077l) {
            int i5 = fVar.f2072g;
            if (i4 == -1 || i5 < i4) {
                i4 = i5;
            }
            if (i3 < i5) {
                i3 = i5;
            }
        }
        if (i2 != 0 && i2 != 2) {
            this.f2097h.c(i3 + aVar.v0);
        } else {
            this.f2097h.c(i4 + aVar.v0);
        }
    }

    @Override // e.g.a.h.j.o
    public void d() {
        ConstraintWidget constraintWidget = this.b;
        if (constraintWidget instanceof e.g.a.h.a) {
            f fVar = this.f2097h;
            fVar.b = true;
            e.g.a.h.a aVar = (e.g.a.h.a) constraintWidget;
            int i2 = aVar.t0;
            boolean z = aVar.u0;
            int i3 = 0;
            if (i2 == 0) {
                fVar.f2070e = f.a.LEFT;
                while (i3 < aVar.s0) {
                    ConstraintWidget constraintWidget2 = aVar.r0[i3];
                    if (z || constraintWidget2.i0 != 8) {
                        f fVar2 = constraintWidget2.f267d.f2097h;
                        fVar2.f2076k.add(this.f2097h);
                        this.f2097h.f2077l.add(fVar2);
                    }
                    i3++;
                }
                m(this.b.f267d.f2097h);
                m(this.b.f267d.f2098i);
            } else if (i2 == 1) {
                fVar.f2070e = f.a.RIGHT;
                while (i3 < aVar.s0) {
                    ConstraintWidget constraintWidget3 = aVar.r0[i3];
                    if (z || constraintWidget3.i0 != 8) {
                        f fVar3 = constraintWidget3.f267d.f2098i;
                        fVar3.f2076k.add(this.f2097h);
                        this.f2097h.f2077l.add(fVar3);
                    }
                    i3++;
                }
                m(this.b.f267d.f2097h);
                m(this.b.f267d.f2098i);
            } else if (i2 == 2) {
                fVar.f2070e = f.a.TOP;
                while (i3 < aVar.s0) {
                    ConstraintWidget constraintWidget4 = aVar.r0[i3];
                    if (z || constraintWidget4.i0 != 8) {
                        f fVar4 = constraintWidget4.f268e.f2097h;
                        fVar4.f2076k.add(this.f2097h);
                        this.f2097h.f2077l.add(fVar4);
                    }
                    i3++;
                }
                m(this.b.f268e.f2097h);
                m(this.b.f268e.f2098i);
            } else if (i2 != 3) {
            } else {
                fVar.f2070e = f.a.BOTTOM;
                while (i3 < aVar.s0) {
                    ConstraintWidget constraintWidget5 = aVar.r0[i3];
                    if (z || constraintWidget5.i0 != 8) {
                        f fVar5 = constraintWidget5.f268e.f2098i;
                        fVar5.f2076k.add(this.f2097h);
                        this.f2097h.f2077l.add(fVar5);
                    }
                    i3++;
                }
                m(this.b.f268e.f2097h);
                m(this.b.f268e.f2098i);
            }
        }
    }

    @Override // e.g.a.h.j.o
    public void e() {
        ConstraintWidget constraintWidget = this.b;
        if (constraintWidget instanceof e.g.a.h.a) {
            int i2 = ((e.g.a.h.a) constraintWidget).t0;
            if (i2 != 0 && i2 != 1) {
                constraintWidget.b0 = this.f2097h.f2072g;
            } else {
                constraintWidget.a0 = this.f2097h.f2072g;
            }
        }
    }

    @Override // e.g.a.h.j.o
    public void f() {
        this.c = null;
        this.f2097h.b();
    }

    @Override // e.g.a.h.j.o
    public boolean k() {
        return false;
    }

    public final void m(f fVar) {
        this.f2097h.f2076k.add(fVar);
        fVar.f2077l.add(this.f2097h);
    }
}
