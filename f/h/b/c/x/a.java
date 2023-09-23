package f.h.b.c.x;

import android.graphics.Paint;
import android.graphics.Path;

/* compiled from: ShadowRenderer.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f5471i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    public static final float[] f5472j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f5473k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f5474l = {0.0f, 0.0f, 0.5f, 1.0f};
    public final Paint b;
    public final Paint c;

    /* renamed from: d  reason: collision with root package name */
    public int f5475d;

    /* renamed from: e  reason: collision with root package name */
    public int f5476e;

    /* renamed from: f  reason: collision with root package name */
    public int f5477f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f5478g = new Path();

    /* renamed from: h  reason: collision with root package name */
    public Paint f5479h = new Paint();
    public final Paint a = new Paint();

    public a() {
        a(-16777216);
        this.f5479h.setColor(0);
        Paint paint = new Paint(4);
        this.b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.c = new Paint(paint);
    }

    public void a(int i2) {
        this.f5475d = e.i.d.a.e(i2, 68);
        this.f5476e = e.i.d.a.e(i2, 20);
        this.f5477f = e.i.d.a.e(i2, 0);
        this.a.setColor(this.f5475d);
    }
}
