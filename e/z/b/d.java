package e.z.b;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.Objects;

/* compiled from: CircularProgressDrawable.java */
/* loaded from: classes.dex */
public class d extends Drawable implements Animatable {

    /* renamed from: l  reason: collision with root package name */
    public static final Interpolator f3017l = new LinearInterpolator();

    /* renamed from: m  reason: collision with root package name */
    public static final Interpolator f3018m = new e.q.a.a.b();
    public static final int[] n = {-16777216};

    /* renamed from: f  reason: collision with root package name */
    public final a f3019f;

    /* renamed from: g  reason: collision with root package name */
    public float f3020g;

    /* renamed from: h  reason: collision with root package name */
    public Resources f3021h;

    /* renamed from: i  reason: collision with root package name */
    public Animator f3022i;

    /* renamed from: j  reason: collision with root package name */
    public float f3023j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3024k;

    /* compiled from: CircularProgressDrawable.java */
    /* loaded from: classes.dex */
    public static class a {
        public final RectF a = new RectF();
        public final Paint b;
        public final Paint c;

        /* renamed from: d  reason: collision with root package name */
        public final Paint f3025d;

        /* renamed from: e  reason: collision with root package name */
        public float f3026e;

        /* renamed from: f  reason: collision with root package name */
        public float f3027f;

        /* renamed from: g  reason: collision with root package name */
        public float f3028g;

        /* renamed from: h  reason: collision with root package name */
        public float f3029h;

        /* renamed from: i  reason: collision with root package name */
        public int[] f3030i;

        /* renamed from: j  reason: collision with root package name */
        public int f3031j;

        /* renamed from: k  reason: collision with root package name */
        public float f3032k;

        /* renamed from: l  reason: collision with root package name */
        public float f3033l;

        /* renamed from: m  reason: collision with root package name */
        public float f3034m;
        public boolean n;
        public Path o;
        public float p;
        public float q;
        public int r;
        public int s;
        public int t;
        public int u;

        public a() {
            Paint paint = new Paint();
            this.b = paint;
            Paint paint2 = new Paint();
            this.c = paint2;
            Paint paint3 = new Paint();
            this.f3025d = paint3;
            this.f3026e = 0.0f;
            this.f3027f = 0.0f;
            this.f3028g = 0.0f;
            this.f3029h = 5.0f;
            this.p = 1.0f;
            this.t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public void a(int i2) {
            this.f3031j = i2;
            this.u = this.f3030i[i2];
        }

        public void b(boolean z) {
            if (this.n != z) {
                this.n = z;
            }
        }
    }

    public d(Context context) {
        Objects.requireNonNull(context);
        this.f3021h = context.getResources();
        a aVar = new a();
        this.f3019f = aVar;
        aVar.f3030i = n;
        aVar.a(0);
        aVar.f3029h = 2.5f;
        aVar.b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b(this, aVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f3017l);
        ofFloat.addListener(new c(this, aVar));
        this.f3022i = ofFloat;
    }

    public void a(float f2, a aVar, boolean z) {
        float interpolation;
        float f3;
        if (this.f3024k) {
            d(f2, aVar);
            float floor = (float) (Math.floor(aVar.f3034m / 0.8f) + 1.0d);
            float f4 = aVar.f3032k;
            float f5 = aVar.f3033l;
            aVar.f3026e = (((f5 - 0.01f) - f4) * f2) + f4;
            aVar.f3027f = f5;
            float f6 = aVar.f3034m;
            aVar.f3028g = f.a.b.a.a.a(floor, f6, f2, f6);
        } else if (f2 != 1.0f || z) {
            float f7 = aVar.f3034m;
            if (f2 < 0.5f) {
                interpolation = aVar.f3032k;
                f3 = (f3018m.getInterpolation(f2 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f8 = aVar.f3032k + 0.79f;
                interpolation = f8 - (((1.0f - f3018m.getInterpolation((f2 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f3 = f8;
            }
            aVar.f3026e = interpolation;
            aVar.f3027f = f3;
            aVar.f3028g = (0.20999998f * f2) + f7;
            this.f3020g = (f2 + this.f3023j) * 216.0f;
        }
    }

    public final void b(float f2, float f3, float f4, float f5) {
        a aVar = this.f3019f;
        float f6 = this.f3021h.getDisplayMetrics().density;
        float f7 = f3 * f6;
        aVar.f3029h = f7;
        aVar.b.setStrokeWidth(f7);
        aVar.q = f2 * f6;
        aVar.a(0);
        aVar.r = (int) (f4 * f6);
        aVar.s = (int) (f5 * f6);
    }

    public void c(int i2) {
        if (i2 == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public void d(float f2, a aVar) {
        if (f2 > 0.75f) {
            float f3 = (f2 - 0.75f) / 0.25f;
            int[] iArr = aVar.f3030i;
            int i2 = aVar.f3031j;
            int i3 = iArr[i2];
            int i4 = iArr[(i2 + 1) % iArr.length];
            int i5 = (i3 >> 24) & 255;
            int i6 = (i3 >> 16) & 255;
            int i7 = (i3 >> 8) & 255;
            int i8 = i3 & 255;
            aVar.u = ((i5 + ((int) ((((i4 >> 24) & 255) - i5) * f3))) << 24) | ((i6 + ((int) ((((i4 >> 16) & 255) - i6) * f3))) << 16) | ((i7 + ((int) ((((i4 >> 8) & 255) - i7) * f3))) << 8) | (i8 + ((int) (f3 * ((i4 & 255) - i8))));
            return;
        }
        aVar.u = aVar.f3030i[aVar.f3031j];
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f3020g, bounds.exactCenterX(), bounds.exactCenterY());
        a aVar = this.f3019f;
        RectF rectF = aVar.a;
        float f2 = aVar.q;
        float f3 = (aVar.f3029h / 2.0f) + f2;
        if (f2 <= 0.0f) {
            f3 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((aVar.r * aVar.p) / 2.0f, aVar.f3029h / 2.0f);
        }
        rectF.set(bounds.centerX() - f3, bounds.centerY() - f3, bounds.centerX() + f3, bounds.centerY() + f3);
        float f4 = aVar.f3026e;
        float f5 = aVar.f3028g;
        float f6 = (f4 + f5) * 360.0f;
        float f7 = ((aVar.f3027f + f5) * 360.0f) - f6;
        aVar.b.setColor(aVar.u);
        aVar.b.setAlpha(aVar.t);
        float f8 = aVar.f3029h / 2.0f;
        rectF.inset(f8, f8);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, aVar.f3025d);
        float f9 = -f8;
        rectF.inset(f9, f9);
        canvas.drawArc(rectF, f6, f7, false, aVar.b);
        if (aVar.n) {
            Path path = aVar.o;
            if (path == null) {
                Path path2 = new Path();
                aVar.o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            aVar.o.moveTo(0.0f, 0.0f);
            aVar.o.lineTo(aVar.r * aVar.p, 0.0f);
            Path path3 = aVar.o;
            float f10 = aVar.p;
            path3.lineTo((aVar.r * f10) / 2.0f, aVar.s * f10);
            aVar.o.offset((rectF.centerX() + (Math.min(rectF.width(), rectF.height()) / 2.0f)) - ((aVar.r * aVar.p) / 2.0f), (aVar.f3029h / 2.0f) + rectF.centerY());
            aVar.o.close();
            aVar.c.setColor(aVar.u);
            aVar.c.setAlpha(aVar.t);
            canvas.save();
            canvas.rotate(f6 + f7, rectF.centerX(), rectF.centerY());
            canvas.drawPath(aVar.o, aVar.c);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f3019f.t;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f3022i.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f3019f.t = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3019f.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f3022i.cancel();
        a aVar = this.f3019f;
        float f2 = aVar.f3026e;
        aVar.f3032k = f2;
        float f3 = aVar.f3027f;
        aVar.f3033l = f3;
        aVar.f3034m = aVar.f3028g;
        if (f3 != f2) {
            this.f3024k = true;
            this.f3022i.setDuration(666L);
            this.f3022i.start();
            return;
        }
        aVar.a(0);
        a aVar2 = this.f3019f;
        aVar2.f3032k = 0.0f;
        aVar2.f3033l = 0.0f;
        aVar2.f3034m = 0.0f;
        aVar2.f3026e = 0.0f;
        aVar2.f3027f = 0.0f;
        aVar2.f3028g = 0.0f;
        this.f3022i.setDuration(1332L);
        this.f3022i.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f3022i.cancel();
        this.f3020g = 0.0f;
        this.f3019f.b(false);
        this.f3019f.a(0);
        a aVar = this.f3019f;
        aVar.f3032k = 0.0f;
        aVar.f3033l = 0.0f;
        aVar.f3034m = 0.0f;
        aVar.f3026e = 0.0f;
        aVar.f3027f = 0.0f;
        aVar.f3028g = 0.0f;
        invalidateSelf();
    }
}
