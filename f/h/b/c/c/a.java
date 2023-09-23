package f.h.b.c.c;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: AnimationUtils.java */
/* loaded from: classes.dex */
public class a {
    public static final TimeInterpolator a = new LinearInterpolator();
    public static final TimeInterpolator b = new e.q.a.a.b();
    public static final TimeInterpolator c = new e.q.a.a.a();

    /* renamed from: d  reason: collision with root package name */
    public static final TimeInterpolator f5223d = new e.q.a.a.c();

    /* renamed from: e  reason: collision with root package name */
    public static final TimeInterpolator f5224e = new DecelerateInterpolator();

    public static float a(float f2, float f3, float f4) {
        return f.a.b.a.a.a(f3, f2, f4, f2);
    }

    public static float b(float f2, float f3, float f4, float f5, float f6) {
        return f6 < f4 ? f2 : f6 > f5 ? f3 : a(f2, f3, (f6 - f4) / (f5 - f4));
    }

    public static int c(int i2, int i3, float f2) {
        return Math.round(f2 * (i3 - i2)) + i2;
    }
}
