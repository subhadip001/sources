package e.e.c;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawable.java */
/* loaded from: classes.dex */
public class d extends Drawable {
    public float a;
    public final RectF c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f1959d;

    /* renamed from: e  reason: collision with root package name */
    public float f1960e;

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f1963h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuffColorFilter f1964i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f1965j;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1961f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1962g = true;

    /* renamed from: k  reason: collision with root package name */
    public PorterDuff.Mode f1966k = PorterDuff.Mode.SRC_IN;
    public final Paint b = new Paint(5);

    public d(ColorStateList colorStateList, float f2) {
        this.a = f2;
        b(colorStateList);
        this.c = new RectF();
        this.f1959d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1963h = colorStateList;
        this.b.setColor(colorStateList.getColorForState(getState(), this.f1963h.getDefaultColor()));
    }

    public final void c(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f1959d.set(rect);
        if (this.f1961f) {
            float b = e.b(this.f1960e, this.a, this.f1962g);
            this.f1959d.inset((int) Math.ceil(e.a(this.f1960e, this.a, this.f1962g)), (int) Math.ceil(b));
            this.c.set(this.f1959d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.b;
        if (this.f1964i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f1964i);
            z = true;
        }
        RectF rectF = this.c;
        float f2 = this.a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1959d, this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1965j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f1963h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1963h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.b.getColor();
        if (z) {
            this.b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1965j;
        if (colorStateList2 == null || (mode = this.f1966k) == null) {
            return z;
        }
        this.f1964i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.b.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1965j = colorStateList;
        this.f1964i = a(colorStateList, this.f1966k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f1966k = mode;
        this.f1964i = a(this.f1965j, mode);
        invalidateSelf();
    }
}
