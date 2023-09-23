package e.a0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import e.i.j.z;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ViewUtils.java */
/* loaded from: classes.dex */
public class s {
    public static final y a;
    public static final Property<View, Float> b;

    /* compiled from: ViewUtils.java */
    /* loaded from: classes.dex */
    public static class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(s.a(view));
        }

        @Override // android.util.Property
        public void set(View view, Float f2) {
            float floatValue = f2.floatValue();
            s.a.e(view, floatValue);
        }
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: classes.dex */
    public static class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Rect get(View view) {
            AtomicInteger atomicInteger = e.i.j.z.a;
            return z.f.a(view);
        }

        @Override // android.util.Property
        public void set(View view, Rect rect) {
            AtomicInteger atomicInteger = e.i.j.z.a;
            z.f.c(view, rect);
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            a = new x();
        } else if (i2 >= 23) {
            a = new w();
        } else if (i2 >= 22) {
            a = new v();
        } else {
            a = new u();
        }
        b = new a(Float.class, "translationAlpha");
        new b(Rect.class, "clipBounds");
    }

    public static float a(View view) {
        return a.b(view);
    }

    public static void b(View view, int i2, int i3, int i4, int i5) {
        a.d(view, i2, i3, i4, i5);
    }
}
