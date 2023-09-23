package e.g.a.h.j;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import e.g.a.h.j.f;
import e.g.a.h.j.o;

/* compiled from: HorizontalWidgetRun.java */
/* loaded from: classes.dex */
public class k extends o {

    /* renamed from: k  reason: collision with root package name */
    public static int[] f2087k = new int[2];

    public k(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f2097h.f2070e = f.a.LEFT;
        this.f2098i.f2070e = f.a.RIGHT;
        this.f2095f = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x028a, code lost:
        if (r14 != 1) goto L131;
     */
    @Override // e.g.a.h.j.o, e.g.a.h.j.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(e.g.a.h.j.d r17) {
        /*
            Method dump skipped, instructions count: 1034
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g.a.h.j.k.a(e.g.a.h.j.d):void");
    }

    @Override // e.g.a.h.j.o
    public void d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4 = this.b;
        if (constraintWidget4.a) {
            this.f2094e.c(constraintWidget4.u());
        }
        if (!this.f2094e.f2075j) {
            ConstraintWidget.DimensionBehaviour m2 = this.b.m();
            this.f2093d = m2;
            if (m2 != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (m2 == dimensionBehaviour && (constraintWidget3 = this.b.V) != null && (constraintWidget3.m() == ConstraintWidget.DimensionBehaviour.FIXED || constraintWidget3.m() == dimensionBehaviour)) {
                    int u = (constraintWidget3.u() - this.b.J.d()) - this.b.L.d();
                    b(this.f2097h, constraintWidget3.f267d.f2097h, this.b.J.d());
                    b(this.f2098i, constraintWidget3.f267d.f2098i, -this.b.L.d());
                    this.f2094e.c(u);
                    return;
                } else if (this.f2093d == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.f2094e.c(this.b.u());
                }
            }
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.f2093d;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour2 == dimensionBehaviour3 && (constraintWidget = this.b.V) != null && (constraintWidget.m() == ConstraintWidget.DimensionBehaviour.FIXED || constraintWidget.m() == dimensionBehaviour3)) {
                b(this.f2097h, constraintWidget.f267d.f2097h, this.b.J.d());
                b(this.f2098i, constraintWidget.f267d.f2098i, -this.b.L.d());
                return;
            }
        }
        g gVar = this.f2094e;
        if (gVar.f2075j) {
            ConstraintWidget constraintWidget5 = this.b;
            if (constraintWidget5.a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget5.R;
                if (constraintAnchorArr[0].f263f != null && constraintAnchorArr[1].f263f != null) {
                    if (constraintWidget5.B()) {
                        this.f2097h.f2071f = this.b.R[0].d();
                        this.f2098i.f2071f = -this.b.R[1].d();
                        return;
                    }
                    f h2 = h(this.b.R[0]);
                    if (h2 != null) {
                        f fVar = this.f2097h;
                        int d2 = this.b.R[0].d();
                        fVar.f2077l.add(h2);
                        fVar.f2071f = d2;
                        h2.f2076k.add(fVar);
                    }
                    f h3 = h(this.b.R[1]);
                    if (h3 != null) {
                        f fVar2 = this.f2098i;
                        fVar2.f2077l.add(h3);
                        fVar2.f2071f = -this.b.R[1].d();
                        h3.f2076k.add(fVar2);
                    }
                    this.f2097h.b = true;
                    this.f2098i.b = true;
                    return;
                } else if (constraintAnchorArr[0].f263f != null) {
                    f h4 = h(constraintAnchorArr[0]);
                    if (h4 != null) {
                        f fVar3 = this.f2097h;
                        int d3 = this.b.R[0].d();
                        fVar3.f2077l.add(h4);
                        fVar3.f2071f = d3;
                        h4.f2076k.add(fVar3);
                        b(this.f2098i, this.f2097h, this.f2094e.f2072g);
                        return;
                    }
                    return;
                } else if (constraintAnchorArr[1].f263f != null) {
                    f h5 = h(constraintAnchorArr[1]);
                    if (h5 != null) {
                        f fVar4 = this.f2098i;
                        fVar4.f2077l.add(h5);
                        fVar4.f2071f = -this.b.R[1].d();
                        h5.f2076k.add(fVar4);
                        b(this.f2097h, this.f2098i, -this.f2094e.f2072g);
                        return;
                    }
                    return;
                } else if ((constraintWidget5 instanceof e.g.a.h.e) || constraintWidget5.V == null || constraintWidget5.i(ConstraintAnchor.Type.CENTER).f263f != null) {
                    return;
                } else {
                    ConstraintWidget constraintWidget6 = this.b;
                    b(this.f2097h, constraintWidget6.V.f267d.f2097h, constraintWidget6.v());
                    b(this.f2098i, this.f2097h, this.f2094e.f2072g);
                    return;
                }
            }
        }
        if (this.f2093d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget7 = this.b;
            int i2 = constraintWidget7.r;
            if (i2 == 2) {
                ConstraintWidget constraintWidget8 = constraintWidget7.V;
                if (constraintWidget8 != null) {
                    g gVar2 = constraintWidget8.f268e.f2094e;
                    gVar.f2077l.add(gVar2);
                    gVar2.f2076k.add(this.f2094e);
                    g gVar3 = this.f2094e;
                    gVar3.b = true;
                    gVar3.f2076k.add(this.f2097h);
                    this.f2094e.f2076k.add(this.f2098i);
                }
            } else if (i2 == 3) {
                if (constraintWidget7.s == 3) {
                    this.f2097h.a = this;
                    this.f2098i.a = this;
                    m mVar = constraintWidget7.f268e;
                    mVar.f2097h.a = this;
                    mVar.f2098i.a = this;
                    gVar.a = this;
                    if (constraintWidget7.C()) {
                        this.f2094e.f2077l.add(this.b.f268e.f2094e);
                        this.b.f268e.f2094e.f2076k.add(this.f2094e);
                        m mVar2 = this.b.f268e;
                        mVar2.f2094e.a = this;
                        this.f2094e.f2077l.add(mVar2.f2097h);
                        this.f2094e.f2077l.add(this.b.f268e.f2098i);
                        this.b.f268e.f2097h.f2076k.add(this.f2094e);
                        this.b.f268e.f2098i.f2076k.add(this.f2094e);
                    } else if (this.b.B()) {
                        this.b.f268e.f2094e.f2077l.add(this.f2094e);
                        this.f2094e.f2076k.add(this.b.f268e.f2094e);
                    } else {
                        this.b.f268e.f2094e.f2077l.add(this.f2094e);
                    }
                } else {
                    g gVar4 = constraintWidget7.f268e.f2094e;
                    gVar.f2077l.add(gVar4);
                    gVar4.f2076k.add(this.f2094e);
                    this.b.f268e.f2097h.f2076k.add(this.f2094e);
                    this.b.f268e.f2098i.f2076k.add(this.f2094e);
                    g gVar5 = this.f2094e;
                    gVar5.b = true;
                    gVar5.f2076k.add(this.f2097h);
                    this.f2094e.f2076k.add(this.f2098i);
                    this.f2097h.f2077l.add(this.f2094e);
                    this.f2098i.f2077l.add(this.f2094e);
                }
            }
        }
        ConstraintWidget constraintWidget9 = this.b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget9.R;
        if (constraintAnchorArr2[0].f263f != null && constraintAnchorArr2[1].f263f != null) {
            if (constraintWidget9.B()) {
                this.f2097h.f2071f = this.b.R[0].d();
                this.f2098i.f2071f = -this.b.R[1].d();
                return;
            }
            f h6 = h(this.b.R[0]);
            f h7 = h(this.b.R[1]);
            if (h6 != null) {
                h6.f2076k.add(this);
                if (h6.f2075j) {
                    a(this);
                }
            }
            if (h7 != null) {
                h7.f2076k.add(this);
                if (h7.f2075j) {
                    a(this);
                }
            }
            this.f2099j = o.a.CENTER;
        } else if (constraintAnchorArr2[0].f263f != null) {
            f h8 = h(constraintAnchorArr2[0]);
            if (h8 != null) {
                f fVar5 = this.f2097h;
                int d4 = this.b.R[0].d();
                fVar5.f2077l.add(h8);
                fVar5.f2071f = d4;
                h8.f2076k.add(fVar5);
                c(this.f2098i, this.f2097h, 1, this.f2094e);
            }
        } else if (constraintAnchorArr2[1].f263f != null) {
            f h9 = h(constraintAnchorArr2[1]);
            if (h9 != null) {
                f fVar6 = this.f2098i;
                fVar6.f2077l.add(h9);
                fVar6.f2071f = -this.b.R[1].d();
                h9.f2076k.add(fVar6);
                c(this.f2097h, this.f2098i, -1, this.f2094e);
            }
        } else if ((constraintWidget9 instanceof e.g.a.h.e) || (constraintWidget2 = constraintWidget9.V) == null) {
        } else {
            b(this.f2097h, constraintWidget2.f267d.f2097h, constraintWidget9.v());
            c(this.f2098i, this.f2097h, 1, this.f2094e);
        }
    }

    @Override // e.g.a.h.j.o
    public void e() {
        f fVar = this.f2097h;
        if (fVar.f2075j) {
            this.b.a0 = fVar.f2072g;
        }
    }

    @Override // e.g.a.h.j.o
    public void f() {
        this.c = null;
        this.f2097h.b();
        this.f2098i.b();
        this.f2094e.b();
        this.f2096g = false;
    }

    @Override // e.g.a.h.j.o
    public boolean k() {
        return this.f2093d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.b.r == 0;
    }

    public final void m(int[] iArr, int i2, int i3, int i4, int i5, float f2, int i6) {
        int i7 = i3 - i2;
        int i8 = i5 - i4;
        if (i6 != -1) {
            if (i6 == 0) {
                iArr[0] = (int) ((i8 * f2) + 0.5f);
                iArr[1] = i8;
                return;
            } else if (i6 != 1) {
                return;
            } else {
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f2) + 0.5f);
                return;
            }
        }
        int i9 = (int) ((i8 * f2) + 0.5f);
        int i10 = (int) ((i7 / f2) + 0.5f);
        if (i9 <= i7 && i8 <= i8) {
            iArr[0] = i9;
            iArr[1] = i8;
        } else if (i7 > i7 || i10 > i8) {
        } else {
            iArr[0] = i7;
            iArr[1] = i10;
        }
    }

    public void n() {
        this.f2096g = false;
        this.f2097h.b();
        this.f2097h.f2075j = false;
        this.f2098i.b();
        this.f2098i.f2075j = false;
        this.f2094e.f2075j = false;
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("HorizontalRun ");
        A.append(this.b.j0);
        return A.toString();
    }
}
