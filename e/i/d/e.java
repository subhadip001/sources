package e.i.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import e.i.c.d.j;
import e.i.g.m;
import java.lang.reflect.Method;

/* compiled from: TypefaceCompat.java */
/* loaded from: classes.dex */
public class e {
    public static final l a;
    public static final e.f.f<String, Typeface> b;

    /* compiled from: TypefaceCompat.java */
    /* loaded from: classes.dex */
    public static class a extends m {
        public j.c a;

        public a(j.c cVar) {
            this.a = cVar;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            a = new j();
        } else if (i2 >= 28) {
            a = new i();
        } else if (i2 >= 26) {
            a = new h();
        } else {
            if (i2 >= 24) {
                Method method = g.f2455d;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    a = new g();
                }
            }
            a = new f();
        }
        b = new e.f.f<>(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r0.equals(r4) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface a(android.content.Context r5, e.i.c.d.e r6, android.content.res.Resources r7, int r8, int r9, e.i.c.d.j.c r10, android.os.Handler r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.d.e.a(android.content.Context, e.i.c.d.e, android.content.res.Resources, int, int, e.i.c.d.j$c, android.os.Handler, boolean):android.graphics.Typeface");
    }

    public static Typeface b(Context context, Resources resources, int i2, String str, int i3) {
        Typeface d2 = a.d(context, resources, i2, str, i3);
        if (d2 != null) {
            b.put(c(resources, i2, i3), d2);
        }
        return d2;
    }

    public static String c(Resources resources, int i2, int i3) {
        return resources.getResourcePackageName(i2) + "-" + i2 + "-" + i3;
    }
}
