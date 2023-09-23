package e.a0;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi21.java */
/* loaded from: classes.dex */
public class u extends t {

    /* renamed from: f  reason: collision with root package name */
    public static boolean f1447f = true;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f1448g = true;

    @Override // e.a0.y
    public void g(View view, Matrix matrix) {
        if (f1447f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f1447f = false;
            }
        }
    }

    @Override // e.a0.y
    public void h(View view, Matrix matrix) {
        if (f1448g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f1448g = false;
            }
        }
    }
}
