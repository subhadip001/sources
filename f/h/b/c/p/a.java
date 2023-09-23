package f.h.b.c.p;

import android.content.Context;
import android.graphics.Color;
import com.video_converter.video_compressor.R;

/* compiled from: ElevationOverlayProvider.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: f  reason: collision with root package name */
    public static final int f5360f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5361d;

    /* renamed from: e  reason: collision with root package name */
    public final float f5362e;

    public a(Context context) {
        boolean Q0 = f.h.b.c.a.Q0(context, R.attr.elevationOverlayEnabled, false);
        int l0 = f.h.b.c.a.l0(context, R.attr.elevationOverlayColor, 0);
        int l02 = f.h.b.c.a.l0(context, R.attr.elevationOverlayAccentColor, 0);
        int l03 = f.h.b.c.a.l0(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = Q0;
        this.b = l0;
        this.c = l02;
        this.f5361d = l03;
        this.f5362e = f2;
    }

    public int a(int i2, float f2) {
        int i3;
        float f3 = this.f5362e;
        float min = (f3 <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / f3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i2);
        int D0 = f.h.b.c.a.D0(e.i.d.a.e(i2, 255), this.b, min);
        if (min > 0.0f && (i3 = this.c) != 0) {
            D0 = e.i.d.a.b(e.i.d.a.e(i3, f5360f), D0);
        }
        return e.i.d.a.e(D0, alpha);
    }
}
