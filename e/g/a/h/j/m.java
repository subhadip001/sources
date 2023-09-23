package e.g.a.h.j;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import e.g.a.h.j.f;
import e.g.a.h.j.o;

/* compiled from: VerticalWidgetRun.java */
/* loaded from: classes.dex */
public class m extends o {

    /* renamed from: k  reason: collision with root package name */
    public f f2088k;

    /* renamed from: l  reason: collision with root package name */
    public g f2089l;

    public m(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        f fVar = new f(this);
        this.f2088k = fVar;
        this.f2089l = null;
        this.f2097h.f2070e = f.a.TOP;
        this.f2098i.f2070e = f.a.BOTTOM;
        fVar.f2070e = f.a.BASELINE;
        this.f2095f = 1;
    }

    @Override // e.g.a.h.j.o, e.g.a.h.j.d
    public void a(d dVar) {
        g gVar;
        float f2;
        float f3;
        float f4;
        int i2;
        int ordinal = this.f2099j.ordinal();
        if (ordinal != 1 && ordinal != 2 && ordinal == 3) {
            ConstraintWidget constraintWidget = this.b;
            l(constraintWidget.K, constraintWidget.M, 1);
            return;
        }
        g gVar2 = this.f2094e;
        if (gVar2.c && !gVar2.f2075j && this.f2093d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.b;
            int i3 = constraintWidget2.s;
            if (i3 == 2) {
                ConstraintWidget constraintWidget3 = constraintWidget2.V;
                if (constraintWidget3 != null) {
                    if (constraintWidget3.f268e.f2094e.f2075j) {
                        gVar2.c((int) ((gVar.f2072g * constraintWidget2.z) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                g gVar3 = constraintWidget2.f267d.f2094e;
                if (gVar3.f2075j) {
                    int i4 = constraintWidget2.Z;
                    if (i4 == -1) {
                        f2 = gVar3.f2072g;
                        f3 = constraintWidget2.Y;
                    } else if (i4 == 0) {
                        f4 = gVar3.f2072g * constraintWidget2.Y;
                        i2 = (int) (f4 + 0.5f);
                        gVar2.c(i2);
                    } else if (i4 == 1) {
                        f2 = gVar3.f2072g;
                        f3 = constraintWidget2.Y;
                    } else {
                        i2 = 0;
                        gVar2.c(i2);
                    }
                    f4 = f2 / f3;
                    i2 = (int) (f4 + 0.5f);
                    gVar2.c(i2);
                }
            }
        }
        f fVar = this.f2097h;
        if (fVar.c) {
            f fVar2 = this.f2098i;
            if (fVar2.c) {
                if (fVar.f2075j && fVar2.f2075j && this.f2094e.f2075j) {
                    return;
                }
                if (!this.f2094e.f2075j && this.f2093d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    ConstraintWidget constraintWidget4 = this.b;
                    if (constraintWidget4.r == 0 && !constraintWidget4.C()) {
                        int i5 = this.f2097h.f2077l.get(0).f2072g;
                        f fVar3 = this.f2097h;
                        int i6 = i5 + fVar3.f2071f;
                        int i7 = this.f2098i.f2077l.get(0).f2072g + this.f2098i.f2071f;
                        fVar3.c(i6);
                        this.f2098i.c(i7);
                        this.f2094e.c(i7 - i6);
                        return;
                    }
                }
                if (!this.f2094e.f2075j && this.f2093d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.a == 1 && this.f2097h.f2077l.size() > 0 && this.f2098i.f2077l.size() > 0) {
                    int i8 = (this.f2098i.f2077l.get(0).f2072g + this.f2098i.f2071f) - (this.f2097h.f2077l.get(0).f2072g + this.f2097h.f2071f);
                    g gVar4 = this.f2094e;
                    int i9 = gVar4.f2086m;
                    if (i8 < i9) {
                        gVar4.c(i8);
                    } else {
                        gVar4.c(i9);
                    }
                }
                if (this.f2094e.f2075j && this.f2097h.f2077l.size() > 0 && this.f2098i.f2077l.size() > 0) {
                    f fVar4 = this.f2097h.f2077l.get(0);
                    f fVar5 = this.f2098i.f2077l.get(0);
                    int i10 = fVar4.f2072g;
                    f fVar6 = this.f2097h;
                    int i11 = fVar6.f2071f + i10;
                    int i12 = fVar5.f2072g;
                    int i13 = this.f2098i.f2071f + i12;
                    float f5 = this.b.g0;
                    if (fVar4 == fVar5) {
                        f5 = 0.5f;
                    } else {
                        i10 = i11;
                        i12 = i13;
                    }
                    fVar6.c((int) ((((i12 - i10) - this.f2094e.f2072g) * f5) + i10 + 0.5f));
                    this.f2098i.c(this.f2097h.f2072g + this.f2094e.f2072g);
                }
            }
        }
    }

    @Override // e.g.a.h.j.o
    public void d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4 = this.b;
        if (constraintWidget4.a) {
            this.f2094e.c(constraintWidget4.l());
        }
        if (!this.f2094e.f2075j) {
            this.f2093d = this.b.t();
            if (this.b.E) {
                this.f2089l = new a(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.f2093d;
            if (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (constraintWidget3 = this.b.V) != null && constraintWidget3.t() == ConstraintWidget.DimensionBehaviour.FIXED) {
                    int l2 = (constraintWidget3.l() - this.b.K.d()) - this.b.M.d();
                    b(this.f2097h, constraintWidget3.f268e.f2097h, this.b.K.d());
                    b(this.f2098i, constraintWidget3.f268e.f2098i, -this.b.M.d());
                    this.f2094e.c(l2);
                    return;
                } else if (this.f2093d == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.f2094e.c(this.b.l());
                }
            }
        } else if (this.f2093d == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (constraintWidget = this.b.V) != null && constraintWidget.t() == ConstraintWidget.DimensionBehaviour.FIXED) {
            b(this.f2097h, constraintWidget.f268e.f2097h, this.b.K.d());
            b(this.f2098i, constraintWidget.f268e.f2098i, -this.b.M.d());
            return;
        }
        g gVar = this.f2094e;
        boolean z = gVar.f2075j;
        if (z) {
            ConstraintWidget constraintWidget5 = this.b;
            if (constraintWidget5.a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget5.R;
                if (constraintAnchorArr[2].f263f != null && constraintAnchorArr[3].f263f != null) {
                    if (constraintWidget5.C()) {
                        this.f2097h.f2071f = this.b.R[2].d();
                        this.f2098i.f2071f = -this.b.R[3].d();
                    } else {
                        f h2 = h(this.b.R[2]);
                        if (h2 != null) {
                            f fVar = this.f2097h;
                            int d2 = this.b.R[2].d();
                            fVar.f2077l.add(h2);
                            fVar.f2071f = d2;
                            h2.f2076k.add(fVar);
                        }
                        f h3 = h(this.b.R[3]);
                        if (h3 != null) {
                            f fVar2 = this.f2098i;
                            fVar2.f2077l.add(h3);
                            fVar2.f2071f = -this.b.R[3].d();
                            h3.f2076k.add(fVar2);
                        }
                        this.f2097h.b = true;
                        this.f2098i.b = true;
                    }
                    ConstraintWidget constraintWidget6 = this.b;
                    if (constraintWidget6.E) {
                        b(this.f2088k, this.f2097h, constraintWidget6.c0);
                        return;
                    }
                    return;
                } else if (constraintAnchorArr[2].f263f != null) {
                    f h4 = h(constraintAnchorArr[2]);
                    if (h4 != null) {
                        f fVar3 = this.f2097h;
                        int d3 = this.b.R[2].d();
                        fVar3.f2077l.add(h4);
                        fVar3.f2071f = d3;
                        h4.f2076k.add(fVar3);
                        b(this.f2098i, this.f2097h, this.f2094e.f2072g);
                        ConstraintWidget constraintWidget7 = this.b;
                        if (constraintWidget7.E) {
                            b(this.f2088k, this.f2097h, constraintWidget7.c0);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (constraintAnchorArr[3].f263f != null) {
                    f h5 = h(constraintAnchorArr[3]);
                    if (h5 != null) {
                        f fVar4 = this.f2098i;
                        fVar4.f2077l.add(h5);
                        fVar4.f2071f = -this.b.R[3].d();
                        h5.f2076k.add(fVar4);
                        b(this.f2097h, this.f2098i, -this.f2094e.f2072g);
                    }
                    ConstraintWidget constraintWidget8 = this.b;
                    if (constraintWidget8.E) {
                        b(this.f2088k, this.f2097h, constraintWidget8.c0);
                        return;
                    }
                    return;
                } else if (constraintAnchorArr[4].f263f != null) {
                    f h6 = h(constraintAnchorArr[4]);
                    if (h6 != null) {
                        f fVar5 = this.f2088k;
                        fVar5.f2077l.add(h6);
                        fVar5.f2071f = 0;
                        h6.f2076k.add(fVar5);
                        b(this.f2097h, this.f2088k, -this.b.c0);
                        b(this.f2098i, this.f2097h, this.f2094e.f2072g);
                        return;
                    }
                    return;
                } else if ((constraintWidget5 instanceof e.g.a.h.e) || constraintWidget5.V == null || constraintWidget5.i(ConstraintAnchor.Type.CENTER).f263f != null) {
                    return;
                } else {
                    ConstraintWidget constraintWidget9 = this.b;
                    b(this.f2097h, constraintWidget9.V.f268e.f2097h, constraintWidget9.w());
                    b(this.f2098i, this.f2097h, this.f2094e.f2072g);
                    ConstraintWidget constraintWidget10 = this.b;
                    if (constraintWidget10.E) {
                        b(this.f2088k, this.f2097h, constraintWidget10.c0);
                        return;
                    }
                    return;
                }
            }
        }
        if (!z && this.f2093d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget11 = this.b;
            int i2 = constraintWidget11.s;
            if (i2 != 2) {
                if (i2 == 3 && !constraintWidget11.C()) {
                    ConstraintWidget constraintWidget12 = this.b;
                    if (constraintWidget12.r != 3) {
                        g gVar2 = constraintWidget12.f267d.f2094e;
                        this.f2094e.f2077l.add(gVar2);
                        gVar2.f2076k.add(this.f2094e);
                        g gVar3 = this.f2094e;
                        gVar3.b = true;
                        gVar3.f2076k.add(this.f2097h);
                        this.f2094e.f2076k.add(this.f2098i);
                    }
                }
            } else {
                ConstraintWidget constraintWidget13 = constraintWidget11.V;
                if (constraintWidget13 != null) {
                    g gVar4 = constraintWidget13.f268e.f2094e;
                    gVar.f2077l.add(gVar4);
                    gVar4.f2076k.add(this.f2094e);
                    g gVar5 = this.f2094e;
                    gVar5.b = true;
                    gVar5.f2076k.add(this.f2097h);
                    this.f2094e.f2076k.add(this.f2098i);
                }
            }
        } else {
            gVar.f2076k.add(this);
            if (gVar.f2075j) {
                a(this);
            }
        }
        ConstraintWidget constraintWidget14 = this.b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget14.R;
        if (constraintAnchorArr2[2].f263f != null && constraintAnchorArr2[3].f263f != null) {
            if (constraintWidget14.C()) {
                this.f2097h.f2071f = this.b.R[2].d();
                this.f2098i.f2071f = -this.b.R[3].d();
            } else {
                f h7 = h(this.b.R[2]);
                f h8 = h(this.b.R[3]);
                if (h7 != null) {
                    h7.f2076k.add(this);
                    if (h7.f2075j) {
                        a(this);
                    }
                }
                if (h8 != null) {
                    h8.f2076k.add(this);
                    if (h8.f2075j) {
                        a(this);
                    }
                }
                this.f2099j = o.a.CENTER;
            }
            if (this.b.E) {
                c(this.f2088k, this.f2097h, 1, this.f2089l);
            }
        } else if (constraintAnchorArr2[2].f263f != null) {
            f h9 = h(constraintAnchorArr2[2]);
            if (h9 != null) {
                f fVar6 = this.f2097h;
                int d4 = this.b.R[2].d();
                fVar6.f2077l.add(h9);
                fVar6.f2071f = d4;
                h9.f2076k.add(fVar6);
                c(this.f2098i, this.f2097h, 1, this.f2094e);
                if (this.b.E) {
                    c(this.f2088k, this.f2097h, 1, this.f2089l);
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.f2093d;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour2 == dimensionBehaviour3) {
                    ConstraintWidget constraintWidget15 = this.b;
                    if (constraintWidget15.Y > 0.0f) {
                        k kVar = constraintWidget15.f267d;
                        if (kVar.f2093d == dimensionBehaviour3) {
                            kVar.f2094e.f2076k.add(this.f2094e);
                            this.f2094e.f2077l.add(this.b.f267d.f2094e);
                            this.f2094e.a = this;
                        }
                    }
                }
            }
        } else if (constraintAnchorArr2[3].f263f != null) {
            f h10 = h(constraintAnchorArr2[3]);
            if (h10 != null) {
                f fVar7 = this.f2098i;
                fVar7.f2077l.add(h10);
                fVar7.f2071f = -this.b.R[3].d();
                h10.f2076k.add(fVar7);
                c(this.f2097h, this.f2098i, -1, this.f2094e);
                if (this.b.E) {
                    c(this.f2088k, this.f2097h, 1, this.f2089l);
                }
            }
        } else if (constraintAnchorArr2[4].f263f != null) {
            f h11 = h(constraintAnchorArr2[4]);
            if (h11 != null) {
                f fVar8 = this.f2088k;
                fVar8.f2077l.add(h11);
                fVar8.f2071f = 0;
                h11.f2076k.add(fVar8);
                c(this.f2097h, this.f2088k, -1, this.f2089l);
                c(this.f2098i, this.f2097h, 1, this.f2094e);
            }
        } else if (!(constraintWidget14 instanceof e.g.a.h.e) && (constraintWidget2 = constraintWidget14.V) != null) {
            b(this.f2097h, constraintWidget2.f268e.f2097h, constraintWidget14.w());
            c(this.f2098i, this.f2097h, 1, this.f2094e);
            if (this.b.E) {
                c(this.f2088k, this.f2097h, 1, this.f2089l);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.f2093d;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour4 == dimensionBehaviour5) {
                ConstraintWidget constraintWidget16 = this.b;
                if (constraintWidget16.Y > 0.0f) {
                    k kVar2 = constraintWidget16.f267d;
                    if (kVar2.f2093d == dimensionBehaviour5) {
                        kVar2.f2094e.f2076k.add(this.f2094e);
                        this.f2094e.f2077l.add(this.b.f267d.f2094e);
                        this.f2094e.a = this;
                    }
                }
            }
        }
        if (this.f2094e.f2077l.size() == 0) {
            this.f2094e.c = true;
        }
    }

    @Override // e.g.a.h.j.o
    public void e() {
        f fVar = this.f2097h;
        if (fVar.f2075j) {
            this.b.b0 = fVar.f2072g;
        }
    }

    @Override // e.g.a.h.j.o
    public void f() {
        this.c = null;
        this.f2097h.b();
        this.f2098i.b();
        this.f2088k.b();
        this.f2094e.b();
        this.f2096g = false;
    }

    @Override // e.g.a.h.j.o
    public boolean k() {
        return this.f2093d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.b.s == 0;
    }

    public void m() {
        this.f2096g = false;
        this.f2097h.b();
        this.f2097h.f2075j = false;
        this.f2098i.b();
        this.f2098i.f2075j = false;
        this.f2088k.b();
        this.f2088k.f2075j = false;
        this.f2094e.f2075j = false;
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("VerticalRun ");
        A.append(this.b.j0);
        return A.toString();
    }
}
