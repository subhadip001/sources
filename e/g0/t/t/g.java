package e.g0.t.t;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: PackageManagerHelper.java */
/* loaded from: classes.dex */
public class g {
    public static final String a = e.g0.k.e("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            e.g0.k c = e.g0.k.c();
            String str = a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z ? "enabled" : "disabled";
            c.a(str, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e2) {
            e.g0.k c2 = e.g0.k.c();
            String str2 = a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            objArr2[1] = z ? "enabled" : "disabled";
            c2.a(str2, String.format("%s could not be %s", objArr2), e2);
        }
    }
}
