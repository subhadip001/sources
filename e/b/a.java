package e.b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import e.b.h.c1;
import e.b.h.g1;
import e.b.h.p0;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class a {
    public static Field a;
    public static boolean b;
    public static Class<?> c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f1453d;

    /* renamed from: e  reason: collision with root package name */
    public static Field f1454e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f1455f;

    /* renamed from: g  reason: collision with root package name */
    public static Field f1456g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f1457h;

    public static void a(Object obj) {
        if (!f1453d) {
            try {
                c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            f1453d = true;
        }
        Class<?> cls = c;
        if (cls == null) {
            return;
        }
        if (!f1455f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f1454e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            f1455f = true;
        }
        Field field = f1454e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e4) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    public static Drawable b(Context context, int i2) {
        return p0.d().f(context, i2);
    }

    public static InputConnection c(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (parent instanceof g1) {
                    editorInfo.hintText = ((g1) parent).a();
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        return inputConnection;
    }

    public static void d(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        c1 c1Var = c1.o;
        if (c1Var != null && c1Var.f1734f == view) {
            c1.c(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            c1 c1Var2 = c1.p;
            if (c1Var2 != null && c1Var2.f1734f == view) {
                c1Var2.b();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new c1(view, charSequence);
    }
}
