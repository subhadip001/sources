package e.i.k;

import android.widget.PopupWindow;

/* compiled from: PopupWindowCompat.java */
/* loaded from: classes.dex */
public class f {
    public static boolean a(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    public static int b(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    public static void c(PopupWindow popupWindow, boolean z) {
        popupWindow.setOverlapAnchor(z);
    }

    public static void d(PopupWindow popupWindow, int i2) {
        popupWindow.setWindowLayoutType(i2);
    }
}
