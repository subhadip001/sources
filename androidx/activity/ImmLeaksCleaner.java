package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.Lifecycle;
import e.s.k;
import e.s.m;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements k {

    /* renamed from: g  reason: collision with root package name */
    public static int f58g;

    /* renamed from: h  reason: collision with root package name */
    public static Field f59h;

    /* renamed from: i  reason: collision with root package name */
    public static Field f60i;

    /* renamed from: j  reason: collision with root package name */
    public static Field f61j;

    /* renamed from: f  reason: collision with root package name */
    public Activity f62f;

    public ImmLeaksCleaner(Activity activity) {
        this.f62f = activity;
    }

    @Override // e.s.k
    public void d(m mVar, Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        if (f58g == 0) {
            try {
                f58g = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f60i = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f61j = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f59h = declaredField3;
                declaredField3.setAccessible(true);
                f58g = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f58g == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f62f.getSystemService("input_method");
            try {
                Object obj = f59h.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f60i.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f61j.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (ClassCastException unused3) {
                        } catch (IllegalAccessException unused4) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
