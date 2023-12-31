package e.b.h;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: DrawableUtils.java */
/* loaded from: classes.dex */
public class e0 {
    public static final int[] a = {16842912};
    public static final int[] b = new int[0];
    public static final Rect c = new Rect();

    /* compiled from: DrawableUtils.java */
    /* loaded from: classes.dex */
    public static class a {
        public static final boolean a;
        public static final Method b;
        public static final Field c;

        /* renamed from: d  reason: collision with root package name */
        public static final Field f1755d;

        /* renamed from: e  reason: collision with root package name */
        public static final Field f1756e;

        /* renamed from: f  reason: collision with root package name */
        public static final Field f1757f;

        /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L35 java.lang.ClassNotFoundException -> L37 java.lang.NoSuchMethodException -> L39
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L2f java.lang.ClassNotFoundException -> L31 java.lang.NoSuchMethodException -> L33
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2d
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L47
                r8 = 1
                goto L49
            L2d:
                r7 = r2
                goto L47
            L2f:
                r6 = r2
                goto L46
            L31:
                r6 = r2
                goto L46
            L33:
                r6 = r2
                goto L46
            L35:
                r5 = r2
                goto L3d
            L37:
                r5 = r2
                goto L41
            L39:
                r5 = r2
                goto L45
            L3b:
                r4 = r2
                r5 = r4
            L3d:
                r6 = r5
                goto L46
            L3f:
                r4 = r2
                r5 = r4
            L41:
                r6 = r5
                goto L46
            L43:
                r4 = r2
                r5 = r4
            L45:
                r6 = r5
            L46:
                r7 = r6
            L47:
                r3 = r2
                r8 = 0
            L49:
                if (r8 == 0) goto L58
                e.b.h.e0.a.b = r4
                e.b.h.e0.a.c = r5
                e.b.h.e0.a.f1755d = r6
                e.b.h.e0.a.f1756e = r7
                e.b.h.e0.a.f1757f = r3
                e.b.h.e0.a.a = r0
                goto L64
            L58:
                e.b.h.e0.a.b = r2
                e.b.h.e0.a.c = r2
                e.b.h.e0.a.f1755d = r2
                e.b.h.e0.a.f1756e = r2
                e.b.h.e0.a.f1757f = r2
                e.b.h.e0.a.a = r1
            L64:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.b.h.e0.a.<clinit>():void");
        }
    }

    /* compiled from: DrawableUtils.java */
    /* loaded from: classes.dex */
    public static class b {
        public static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static boolean a(Drawable drawable) {
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState instanceof DrawableContainer.DrawableContainerState) {
                for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                    if (!a(drawable2)) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        } else if (drawable instanceof e.i.d.m.b) {
            return a(((e.i.d.m.b) drawable).b());
        } else {
            if (drawable instanceof e.b.d.a.c) {
                return a(((e.b.d.a.c) drawable).f1565f);
            }
            if (drawable instanceof ScaleDrawable) {
                return a(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
    }

    public static void b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
            c(drawable);
        } else if (i2 < 29 || i2 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
        } else {
            c(drawable);
        }
    }

    public static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state != null && state.length != 0) {
            drawable.setState(b);
        } else {
            drawable.setState(a);
        }
        drawable.setState(state);
    }

    public static Rect d(Drawable drawable) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            Insets a2 = b.a(drawable);
            return new Rect(a2.left, a2.top, a2.right, a2.bottom);
        }
        Drawable j0 = e.i.a.j0(drawable);
        boolean z = a.a;
        if (i2 < 29 && a.a) {
            try {
                Object invoke = a.b.invoke(j0, new Object[0]);
                if (invoke != null) {
                    return new Rect(a.c.getInt(invoke), a.f1755d.getInt(invoke), a.f1756e.getInt(invoke), a.f1757f.getInt(invoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return c;
    }

    public static PorterDuff.Mode e(int i2, PorterDuff.Mode mode) {
        if (i2 != 3) {
            if (i2 != 5) {
                if (i2 != 9) {
                    switch (i2) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
