package e.g.a.h;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* compiled from: Barrier.java */
/* loaded from: classes.dex */
public class a extends f {
    public int t0 = 0;
    public boolean u0 = true;
    public int v0 = 0;
    public boolean w0 = false;

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean E() {
        return this.w0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean F() {
        return this.w0;
    }

    public boolean X() {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        boolean z = true;
        while (true) {
            i2 = this.s0;
            if (i5 >= i2) {
                break;
            }
            ConstraintWidget constraintWidget = this.r0[i5];
            if ((this.u0 || constraintWidget.e()) && ((((i3 = this.t0) == 0 || i3 == 1) && !constraintWidget.E()) || (((i4 = this.t0) == 2 || i4 == 3) && !constraintWidget.F()))) {
                z = false;
            }
            i5++;
        }
        if (!z || i2 <= 0) {
            return false;
        }
        int i6 = 0;
        boolean z2 = false;
        for (int i7 = 0; i7 < this.s0; i7++) {
            ConstraintWidget constraintWidget2 = this.r0[i7];
            if (this.u0 || constraintWidget2.e()) {
                if (!z2) {
                    int i8 = this.t0;
                    if (i8 == 0) {
                        i6 = constraintWidget2.i(ConstraintAnchor.Type.LEFT).c();
                    } else if (i8 == 1) {
                        i6 = constraintWidget2.i(ConstraintAnchor.Type.RIGHT).c();
                    } else if (i8 == 2) {
                        i6 = constraintWidget2.i(ConstraintAnchor.Type.TOP).c();
                    } else if (i8 == 3) {
                        i6 = constraintWidget2.i(ConstraintAnchor.Type.BOTTOM).c();
                    }
                    z2 = true;
                }
                int i9 = this.t0;
                if (i9 == 0) {
                    i6 = Math.min(i6, constraintWidget2.i(ConstraintAnchor.Type.LEFT).c());
                } else if (i9 == 1) {
                    i6 = Math.max(i6, constraintWidget2.i(ConstraintAnchor.Type.RIGHT).c());
                } else if (i9 == 2) {
                    i6 = Math.min(i6, constraintWidget2.i(ConstraintAnchor.Type.TOP).c());
                } else if (i9 == 3) {
                    i6 = Math.max(i6, constraintWidget2.i(ConstraintAnchor.Type.BOTTOM).c());
                }
            }
        }
        int i10 = i6 + this.v0;
        int i11 = this.t0;
        if (i11 != 0 && i11 != 1) {
            N(i10, i10);
        } else {
            M(i10, i10);
        }
        this.w0 = true;
        return true;
    }

    public int Y() {
        int i2 = this.t0;
        if (i2 == 0 || i2 == 1) {
            return 0;
        }
        return (i2 == 2 || i2 == 3) ? 1 : -1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void d(e.g.a.d dVar, boolean z) {
        Object[] objArr;
        boolean z2;
        int i2;
        int i3;
        int i4;
        ConstraintAnchor[] constraintAnchorArr = this.R;
        constraintAnchorArr[0] = this.J;
        constraintAnchorArr[2] = this.K;
        constraintAnchorArr[1] = this.L;
        constraintAnchorArr[3] = this.M;
        int i5 = 0;
        while (true) {
            objArr = this.R;
            if (i5 >= objArr.length) {
                break;
            }
            objArr[i5].f266i = dVar.l(objArr[i5]);
            i5++;
        }
        int i6 = this.t0;
        if (i6 < 0 || i6 >= 4) {
            return;
        }
        ConstraintAnchor constraintAnchor = objArr[i6];
        if (!this.w0) {
            X();
        }
        if (this.w0) {
            this.w0 = false;
            int i7 = this.t0;
            if (i7 == 0 || i7 == 1) {
                dVar.e(this.J.f266i, this.a0);
                dVar.e(this.L.f266i, this.a0);
                return;
            } else if (i7 == 2 || i7 == 3) {
                dVar.e(this.K.f266i, this.b0);
                dVar.e(this.M.f266i, this.b0);
                return;
            } else {
                return;
            }
        }
        for (int i8 = 0; i8 < this.s0; i8++) {
            ConstraintWidget constraintWidget = this.r0[i8];
            if ((this.u0 || constraintWidget.e()) && ((((i3 = this.t0) == 0 || i3 == 1) && constraintWidget.m() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.J.f263f != null && constraintWidget.L.f263f != null) || (((i4 = this.t0) == 2 || i4 == 3) && constraintWidget.t() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.K.f263f != null && constraintWidget.M.f263f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = this.J.e() || this.L.e();
        boolean z4 = this.K.e() || this.M.e();
        int i9 = !z2 && (((i2 = this.t0) == 0 && z3) || ((i2 == 2 && z4) || ((i2 == 1 && z3) || (i2 == 3 && z4)))) ? 5 : 4;
        for (int i10 = 0; i10 < this.s0; i10++) {
            ConstraintWidget constraintWidget2 = this.r0[i10];
            if (this.u0 || constraintWidget2.e()) {
                SolverVariable l2 = dVar.l(constraintWidget2.R[this.t0]);
                ConstraintAnchor[] constraintAnchorArr2 = constraintWidget2.R;
                int i11 = this.t0;
                constraintAnchorArr2[i11].f266i = l2;
                int i12 = (constraintAnchorArr2[i11].f263f == null || constraintAnchorArr2[i11].f263f.f261d != this) ? 0 : constraintAnchorArr2[i11].f264g + 0;
                if (i11 != 0 && i11 != 2) {
                    e.g.a.b m2 = dVar.m();
                    SolverVariable n = dVar.n();
                    n.f256i = 0;
                    m2.e(constraintAnchor.f266i, l2, n, this.v0 + i12);
                    dVar.c(m2);
                } else {
                    e.g.a.b m3 = dVar.m();
                    SolverVariable n2 = dVar.n();
                    n2.f256i = 0;
                    m3.f(constraintAnchor.f266i, l2, n2, this.v0 - i12);
                    dVar.c(m3);
                }
                dVar.d(constraintAnchor.f266i, l2, this.v0 + i12, i9);
            }
        }
        int i13 = this.t0;
        if (i13 == 0) {
            dVar.d(this.L.f266i, this.J.f266i, 0, 8);
            dVar.d(this.J.f266i, this.V.L.f266i, 0, 4);
            dVar.d(this.J.f266i, this.V.J.f266i, 0, 0);
        } else if (i13 == 1) {
            dVar.d(this.J.f266i, this.L.f266i, 0, 8);
            dVar.d(this.J.f266i, this.V.J.f266i, 0, 4);
            dVar.d(this.J.f266i, this.V.L.f266i, 0, 0);
        } else if (i13 == 2) {
            dVar.d(this.M.f266i, this.K.f266i, 0, 8);
            dVar.d(this.K.f266i, this.V.M.f266i, 0, 4);
            dVar.d(this.K.f266i, this.V.K.f266i, 0, 0);
        } else if (i13 == 3) {
            dVar.d(this.K.f266i, this.M.f266i, 0, 8);
            dVar.d(this.K.f266i, this.V.K.f266i, 0, 4);
            dVar.d(this.K.f266i, this.V.M.f266i, 0, 0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean e() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String toString() {
        String u = f.a.b.a.a.u(f.a.b.a.a.A("[Barrier] "), this.j0, " {");
        for (int i2 = 0; i2 < this.s0; i2++) {
            ConstraintWidget constraintWidget = this.r0[i2];
            if (i2 > 0) {
                u = f.a.b.a.a.p(u, ", ");
            }
            StringBuilder A = f.a.b.a.a.A(u);
            A.append(constraintWidget.j0);
            u = A.toString();
        }
        return f.a.b.a.a.p(u, "}");
    }
}
