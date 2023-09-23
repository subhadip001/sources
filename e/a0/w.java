package e.a0;

import android.os.Build;
import android.view.View;

/* compiled from: ViewUtilsApi23.java */
/* loaded from: classes.dex */
public class w extends v {

    /* renamed from: i  reason: collision with root package name */
    public static boolean f1450i = true;

    @Override // e.a0.y
    public void f(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i2);
        } else if (f1450i) {
            try {
                view.setTransitionVisibility(i2);
            } catch (NoSuchMethodError unused) {
                f1450i = false;
            }
        }
    }
}
