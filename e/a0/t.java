package e.a0;

import android.view.View;

/* compiled from: ViewUtilsApi19.java */
/* loaded from: classes.dex */
public class t extends y {

    /* renamed from: e  reason: collision with root package name */
    public static boolean f1446e = true;

    @Override // e.a0.y
    public void a(View view) {
    }

    @Override // e.a0.y
    public float b(View view) {
        if (f1446e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f1446e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // e.a0.y
    public void c(View view) {
    }

    @Override // e.a0.y
    public void e(View view, float f2) {
        if (f1446e) {
            try {
                view.setTransitionAlpha(f2);
                return;
            } catch (NoSuchMethodError unused) {
                f1446e = false;
            }
        }
        view.setAlpha(f2);
    }
}
