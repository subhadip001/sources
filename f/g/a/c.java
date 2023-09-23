package f.g.a;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: ShimmerDrawable.java */
/* loaded from: classes.dex */
public final class c extends Drawable {
    public final ValueAnimator.AnimatorUpdateListener a = new a();
    public final Paint b;
    public final Rect c;

    /* renamed from: d  reason: collision with root package name */
    public final Matrix f3636d;

    /* renamed from: e  reason: collision with root package name */
    public ValueAnimator f3637e;

    /* renamed from: f  reason: collision with root package name */
    public b f3638f;

    /* compiled from: ShimmerDrawable.java */
    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            c.this.invalidateSelf();
        }
    }

    public c() {
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Rect();
        this.f3636d = new Matrix();
        paint.setAntiAlias(true);
    }

    public void a() {
        b bVar;
        ValueAnimator valueAnimator = this.f3637e;
        if (valueAnimator == null || valueAnimator.isStarted() || (bVar = this.f3638f) == null || !bVar.o || getCallback() == null) {
            return;
        }
        this.f3637e.start();
    }

    public final float b(float f2, float f3, float f4) {
        return f.a.b.a.a.a(f3, f2, f4, f2);
    }

    public final void c() {
        b bVar;
        Shader radialGradient;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width == 0 || height == 0 || (bVar = this.f3638f) == null) {
            return;
        }
        int i2 = bVar.f3629g;
        if (i2 <= 0) {
            i2 = Math.round(bVar.f3631i * width);
        }
        b bVar2 = this.f3638f;
        int i3 = bVar2.f3630h;
        if (i3 <= 0) {
            i3 = Math.round(bVar2.f3632j * height);
        }
        b bVar3 = this.f3638f;
        boolean z = true;
        if (bVar3.f3628f != 1) {
            int i4 = bVar3.c;
            if (i4 != 1 && i4 != 3) {
                z = false;
            }
            if (z) {
                i2 = 0;
            }
            if (!z) {
                i3 = 0;
            }
            b bVar4 = this.f3638f;
            radialGradient = new LinearGradient(0.0f, 0.0f, i2, i3, bVar4.b, bVar4.a, Shader.TileMode.CLAMP);
        } else {
            b bVar5 = this.f3638f;
            radialGradient = new RadialGradient(i2 / 2.0f, i3 / 2.0f, (float) (Math.max(i2, i3) / Math.sqrt(2.0d)), bVar5.b, bVar5.a, Shader.TileMode.CLAMP);
        }
        this.b.setShader(radialGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float b;
        float b2;
        if (this.f3638f == null || this.b.getShader() == null) {
            return;
        }
        float tan = (float) Math.tan(Math.toRadians(this.f3638f.f3635m));
        float width = (this.c.width() * tan) + this.c.height();
        float height = (tan * this.c.height()) + this.c.width();
        ValueAnimator valueAnimator = this.f3637e;
        float f2 = 0.0f;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        int i2 = this.f3638f.c;
        if (i2 != 1) {
            if (i2 == 2) {
                b2 = b(height, -height, animatedFraction);
            } else if (i2 != 3) {
                b2 = b(-height, height, animatedFraction);
            } else {
                b = b(width, -width, animatedFraction);
            }
            f2 = b2;
            b = 0.0f;
        } else {
            b = b(-width, width, animatedFraction);
        }
        this.f3636d.reset();
        this.f3636d.setRotate(this.f3638f.f3635m, this.c.width() / 2.0f, this.c.height() / 2.0f);
        this.f3636d.postTranslate(f2, b);
        this.b.getShader().setLocalMatrix(this.f3636d);
        canvas.drawRect(this.c, this.b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        b bVar = this.f3638f;
        return (bVar == null || !(bVar.n || bVar.p)) ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.c.set(0, 0, rect.width(), rect.height());
        c();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
