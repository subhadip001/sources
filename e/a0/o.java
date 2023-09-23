package e.a0;

import android.os.Build;

/* compiled from: TransitionUtils.java */
/* loaded from: classes.dex */
public class o {
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;

    static {
        int i2 = Build.VERSION.SDK_INT;
        a = true;
        b = true;
        c = i2 >= 28;
    }
}
