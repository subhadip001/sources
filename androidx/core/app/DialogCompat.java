package androidx.core.app;

import android.app.Dialog;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class DialogCompat {
    private DialogCompat() {
    }

    public static View requireViewById(Dialog dialog, int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            return dialog.requireViewById(i2);
        }
        View findViewById = dialog.findViewById(i2);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
    }
}
