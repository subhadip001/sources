package f.h.b.c.n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.video_converter.video_compressor.R;

/* compiled from: CalendarStyle.java */
/* loaded from: classes.dex */
public final class b {
    public final a a;
    public final a b;
    public final a c;

    /* renamed from: d  reason: collision with root package name */
    public final a f5303d;

    /* renamed from: e  reason: collision with root package name */
    public final a f5304e;

    /* renamed from: f  reason: collision with root package name */
    public final a f5305f;

    /* renamed from: g  reason: collision with root package name */
    public final a f5306g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f5307h;

    public b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f.h.b.c.a.R0(context, R.attr.materialCalendarStyle, d.class.getCanonicalName()), f.h.b.c.b.r);
        this.a = a.a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f5306g = a.a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.b = a.a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.c = a.a(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList n0 = f.h.b.c.a.n0(context, obtainStyledAttributes, 6);
        this.f5303d = a.a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f5304e = a.a(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f5305f = a.a(context, obtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.f5307h = paint;
        paint.setColor(n0.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
