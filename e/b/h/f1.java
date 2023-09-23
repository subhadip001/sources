package e.b.h;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import e.i.j.z;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ViewUtils.java */
/* loaded from: classes.dex */
public class f1 {
    public static Method a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            a.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static void a(View view, Rect rect, Rect rect2) {
        Method method = a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e2) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
            }
        }
    }

    public static boolean b(View view) {
        AtomicInteger atomicInteger = e.i.j.z.a;
        return z.e.d(view) == 1;
    }
}
