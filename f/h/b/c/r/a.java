package f.h.b.c.r;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import f.h.b.c.y.j;
import f.h.b.c.y.k;

/* compiled from: BorderDrawable.java */
/* loaded from: classes.dex */
public class a extends Drawable {
    public final Paint b;

    /* renamed from: h  reason: collision with root package name */
    public float f5367h;

    /* renamed from: i  reason: collision with root package name */
    public int f5368i;

    /* renamed from: j  reason: collision with root package name */
    public int f5369j;

    /* renamed from: k  reason: collision with root package name */
    public int f5370k;

    /* renamed from: l  reason: collision with root package name */
    public int f5371l;

    /* renamed from: m  reason: collision with root package name */
    public int f5372m;
    public j o;
    public ColorStateList p;
    public final k a = k.a.a;
    public final Path c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public final Rect f5363d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final RectF f5364e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    public final RectF f5365f = new RectF();

    /* renamed from: g  reason: collision with root package name */
    public final b f5366g = new b(null);
    public boolean n = true;

    /* compiled from: BorderDrawable.java */
    /* loaded from: classes.dex */
    public class b extends Drawable.ConstantState {
        public b(C0124a c0124a) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return a.this;
        }
    }

    public a(j jVar) {
        this.o = jVar;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public RectF a() {
        this.f5365f.set(getBounds());
        return this.f5365f;
    }

    public void b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f5372m = colorStateList.getColorForState(getState(), this.f5372m);
        }
        this.p = colorStateList;
        this.n = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.n) {
            Paint paint = this.b;
            Rect rect = this.f5363d;
            copyBounds(rect);
            float height = this.f5367h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{e.i.d.a.b(this.f5368i, this.f5372m), e.i.d.a.b(this.f5369j, this.f5372m), e.i.d.a.b(e.i.d.a.e(this.f5369j, 0), this.f5372m), e.i.d.a.b(e.i.d.a.e(this.f5371l, 0), this.f5372m), e.i.d.a.b(this.f5371l, this.f5372m), e.i.d.a.b(this.f5370k, this.f5372m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.n = false;
        }
        float strokeWidth = this.b.getStrokeWidth() / 2.0f;
        copyBounds(this.f5363d);
        this.f5364e.set(this.f5363d);
        float min = Math.min(this.o.f5500e.a(a()), this.f5364e.width() / 2.0f);
        if (this.o.d(a())) {
            this.f5364e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f5364e, min, min, this.b);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f5366g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f5367h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.o.d(a())) {
            outline.setRoundRect(getBounds(), this.o.f5500e.a(a()));
            return;
        }
        copyBounds(this.f5363d);
        this.f5364e.set(this.f5363d);
        this.a.a(this.o, 1.0f, this.f5364e, this.c);
        if (this.c.isConvex()) {
            outline.setConvexPath(this.c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (this.o.d(a())) {
            int round = Math.round(this.f5367h);
            rect.set(round, round, round, round);
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f5372m)) != this.f5372m) {
            this.n = true;
            this.f5372m = colorForState;
        }
        if (this.n) {
            invalidateSelf();
        }
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.b.setAlpha(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
