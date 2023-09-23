package e.g.a.h;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* compiled from: Guideline.java */
/* loaded from: classes.dex */
public class d extends ConstraintWidget {
    public float r0 = -1.0f;
    public int s0 = -1;
    public int t0 = -1;
    public ConstraintAnchor u0 = this.K;
    public int v0 = 0;
    public boolean w0;

    public d() {
        this.S.clear();
        this.S.add(this.u0);
        int length = this.R.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.R[i2] = this.u0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean E() {
        return this.w0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean F() {
        return this.w0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void V(e.g.a.d dVar, boolean z) {
        if (this.V == null) {
            return;
        }
        int o = dVar.o(this.u0);
        if (this.v0 == 1) {
            this.a0 = o;
            this.b0 = 0;
            O(this.V.l());
            T(0);
            return;
        }
        this.a0 = 0;
        this.b0 = o;
        T(this.V.u());
        O(0);
    }

    public void W(int i2) {
        ConstraintAnchor constraintAnchor = this.u0;
        constraintAnchor.b = i2;
        constraintAnchor.c = true;
        this.w0 = true;
    }

    public void X(int i2) {
        if (this.v0 == i2) {
            return;
        }
        this.v0 = i2;
        this.S.clear();
        if (this.v0 == 1) {
            this.u0 = this.J;
        } else {
            this.u0 = this.K;
        }
        this.S.add(this.u0);
        int length = this.R.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.R[i3] = this.u0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void d(e.g.a.d dVar, boolean z) {
        c cVar = (c) this.V;
        if (cVar == null) {
            return;
        }
        Object i2 = cVar.i(ConstraintAnchor.Type.LEFT);
        Object i3 = cVar.i(ConstraintAnchor.Type.RIGHT);
        ConstraintWidget constraintWidget = this.V;
        boolean z2 = true;
        boolean z3 = constraintWidget != null && constraintWidget.U[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (this.v0 == 0) {
            i2 = cVar.i(ConstraintAnchor.Type.TOP);
            i3 = cVar.i(ConstraintAnchor.Type.BOTTOM);
            ConstraintWidget constraintWidget2 = this.V;
            z3 = (constraintWidget2 == null || constraintWidget2.U[1] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) ? false : false;
        }
        if (this.w0) {
            ConstraintAnchor constraintAnchor = this.u0;
            if (constraintAnchor.c) {
                SolverVariable l2 = dVar.l(constraintAnchor);
                dVar.e(l2, this.u0.c());
                if (this.s0 != -1) {
                    if (z3) {
                        dVar.f(dVar.l(i3), l2, 0, 5);
                    }
                } else if (this.t0 != -1 && z3) {
                    SolverVariable l3 = dVar.l(i3);
                    dVar.f(l2, dVar.l(i2), 0, 5);
                    dVar.f(l3, l2, 0, 5);
                }
                this.w0 = false;
                return;
            }
        }
        if (this.s0 != -1) {
            SolverVariable l4 = dVar.l(this.u0);
            dVar.d(l4, dVar.l(i2), this.s0, 8);
            if (z3) {
                dVar.f(dVar.l(i3), l4, 0, 5);
            }
        } else if (this.t0 != -1) {
            SolverVariable l5 = dVar.l(this.u0);
            SolverVariable l6 = dVar.l(i3);
            dVar.d(l5, l6, -this.t0, 8);
            if (z3) {
                dVar.f(l5, dVar.l(i2), 0, 5);
                dVar.f(l6, l5, 0, 5);
            }
        } else if (this.r0 != -1.0f) {
            SolverVariable l7 = dVar.l(this.u0);
            SolverVariable l8 = dVar.l(i3);
            float f2 = this.r0;
            e.g.a.b m2 = dVar.m();
            m2.f2027d.d(l7, -1.0f);
            m2.f2027d.d(l8, f2);
            dVar.c(m2);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean e() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public ConstraintAnchor i(ConstraintAnchor.Type type) {
        int ordinal = type.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return null;
                    }
                }
            }
            if (this.v0 == 0) {
                return this.u0;
            }
            return null;
        }
        if (this.v0 == 1) {
            return this.u0;
        }
        return null;
    }
}
