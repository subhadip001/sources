package f.h.b.c.n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import e.i.j.z;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CalendarItemStyle.java */
/* loaded from: classes.dex */
public final class a {
    public final Rect a;
    public final ColorStateList b;
    public final ColorStateList c;

    /* renamed from: d  reason: collision with root package name */
    public final ColorStateList f5300d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5301e;

    /* renamed from: f  reason: collision with root package name */
    public final f.h.b.c.y.j f5302f;

    public a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i2, f.h.b.c.y.j jVar, Rect rect) {
        e.i.a.g(rect.left);
        e.i.a.g(rect.top);
        e.i.a.g(rect.right);
        e.i.a.g(rect.bottom);
        this.a = rect;
        this.b = colorStateList2;
        this.c = colorStateList;
        this.f5300d = colorStateList3;
        this.f5301e = i2;
        this.f5302f = jVar;
    }

    public static a a(Context context, int i2) {
        e.i.a.f(i2 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, f.h.b.c.b.s);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList n0 = f.h.b.c.a.n0(context, obtainStyledAttributes, 4);
        ColorStateList n02 = f.h.b.c.a.n0(context, obtainStyledAttributes, 9);
        ColorStateList n03 = f.h.b.c.a.n0(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        f.h.b.c.y.j a = f.h.b.c.y.j.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new f.h.b.c.y.a(0)).a();
        obtainStyledAttributes.recycle();
        return new a(n0, n02, n03, dimensionPixelSize, a, rect);
    }

    public void b(TextView textView) {
        f.h.b.c.y.g gVar = new f.h.b.c.y.g();
        f.h.b.c.y.g gVar2 = new f.h.b.c.y.g();
        gVar.setShapeAppearanceModel(this.f5302f);
        gVar2.setShapeAppearanceModel(this.f5302f);
        gVar.r(this.c);
        gVar.v(this.f5301e, this.f5300d);
        textView.setTextColor(this.b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.b.withAlpha(30), gVar, gVar2);
        Rect rect = this.a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        AtomicInteger atomicInteger = e.i.j.z.a;
        z.d.q(textView, insetDrawable);
    }
}
