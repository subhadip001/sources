package e.g.a.h;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* compiled from: Optimizer.java */
/* loaded from: classes.dex */
public class g {
    public static boolean[] a = new boolean[3];

    public static void a(c cVar, e.g.a.d dVar, ConstraintWidget constraintWidget) {
        constraintWidget.o = -1;
        constraintWidget.p = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = cVar.U[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour != dimensionBehaviour2 && constraintWidget.U[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i2 = constraintWidget.J.f264g;
            int u = cVar.u() - constraintWidget.L.f264g;
            ConstraintAnchor constraintAnchor = constraintWidget.J;
            constraintAnchor.f266i = dVar.l(constraintAnchor);
            ConstraintAnchor constraintAnchor2 = constraintWidget.L;
            constraintAnchor2.f266i = dVar.l(constraintAnchor2);
            dVar.e(constraintWidget.J.f266i, i2);
            dVar.e(constraintWidget.L.f266i, u);
            constraintWidget.o = 2;
            constraintWidget.a0 = i2;
            int i3 = u - i2;
            constraintWidget.W = i3;
            int i4 = constraintWidget.d0;
            if (i3 < i4) {
                constraintWidget.W = i4;
            }
        }
        if (cVar.U[1] == dimensionBehaviour2 || constraintWidget.U[1] != ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            return;
        }
        int i5 = constraintWidget.K.f264g;
        int l2 = cVar.l() - constraintWidget.M.f264g;
        ConstraintAnchor constraintAnchor3 = constraintWidget.K;
        constraintAnchor3.f266i = dVar.l(constraintAnchor3);
        ConstraintAnchor constraintAnchor4 = constraintWidget.M;
        constraintAnchor4.f266i = dVar.l(constraintAnchor4);
        dVar.e(constraintWidget.K.f266i, i5);
        dVar.e(constraintWidget.M.f266i, l2);
        if (constraintWidget.c0 > 0 || constraintWidget.i0 == 8) {
            ConstraintAnchor constraintAnchor5 = constraintWidget.N;
            constraintAnchor5.f266i = dVar.l(constraintAnchor5);
            dVar.e(constraintWidget.N.f266i, constraintWidget.c0 + i5);
        }
        constraintWidget.p = 2;
        constraintWidget.b0 = i5;
        int i6 = l2 - i5;
        constraintWidget.X = i6;
        int i7 = constraintWidget.e0;
        if (i6 < i7) {
            constraintWidget.X = i7;
        }
    }

    public static final boolean b(int i2, int i3) {
        return (i2 & i3) == i3;
    }
}
