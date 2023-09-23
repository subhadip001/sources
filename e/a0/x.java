package e.a0;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi29.java */
/* loaded from: classes.dex */
public class x extends w {
    @Override // e.a0.t, e.a0.y
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // e.a0.v, e.a0.y
    public void d(View view, int i2, int i3, int i4, int i5) {
        view.setLeftTopRightBottom(i2, i3, i4, i5);
    }

    @Override // e.a0.t, e.a0.y
    public void e(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // e.a0.w, e.a0.y
    public void f(View view, int i2) {
        view.setTransitionVisibility(i2);
    }

    @Override // e.a0.u, e.a0.y
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // e.a0.u, e.a0.y
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
