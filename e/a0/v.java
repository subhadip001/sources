package e.a0;

import android.view.View;

/* compiled from: ViewUtilsApi22.java */
/* loaded from: classes.dex */
public class v extends u {

    /* renamed from: h  reason: collision with root package name */
    public static boolean f1449h = true;

    @Override // e.a0.y
    public void d(View view, int i2, int i3, int i4, int i5) {
        if (f1449h) {
            try {
                view.setLeftTopRightBottom(i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                f1449h = false;
            }
        }
    }
}
