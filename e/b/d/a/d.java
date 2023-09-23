package e.b.d.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.video_converter.video_compressor.R;

/* compiled from: DrawerArrowDrawable.java */
/* loaded from: classes.dex */
public class d extends Drawable {

    /* renamed from: m  reason: collision with root package name */
    public static final float f1566m = (float) Math.toRadians(45.0d);
    public final Paint a;
    public float b;
    public float c;

    /* renamed from: d  reason: collision with root package name */
    public float f1567d;

    /* renamed from: e  reason: collision with root package name */
    public float f1568e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1569f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f1570g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1571h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1572i;

    /* renamed from: j  reason: collision with root package name */
    public float f1573j;

    /* renamed from: k  reason: collision with root package name */
    public float f1574k;

    /* renamed from: l  reason: collision with root package name */
    public int f1575l;

    public d(Context context) {
        Paint paint = new Paint();
        this.a = paint;
        this.f1570g = new Path();
        this.f1572i = false;
        this.f1575l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, e.b.b.n, R.attr.drawerArrowStyle, 2131951822);
        int color = obtainStyledAttributes.getColor(3, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = obtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.f1574k = (float) (Math.cos(f1566m) * (dimension / 2.0f));
            invalidateSelf();
        }
        boolean z = obtainStyledAttributes.getBoolean(6, true);
        if (this.f1569f != z) {
            this.f1569f = z;
            invalidateSelf();
        }
        float round = Math.round(obtainStyledAttributes.getDimension(5, 0.0f));
        if (round != this.f1568e) {
            this.f1568e = round;
            invalidateSelf();
        }
        this.f1571h = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.c = Math.round(obtainStyledAttributes.getDimension(2, 0.0f));
        this.b = Math.round(obtainStyledAttributes.getDimension(0, 0.0f));
        this.f1567d = obtainStyledAttributes.getDimension(1, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public static float a(float f2, float f3, float f4) {
        return f.a.b.a.a.a(f3, f2, f4, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f2;
        Rect bounds = getBounds();
        int i2 = this.f1575l;
        boolean z = false;
        if (i2 != 0 && (i2 == 1 || (i2 == 3 ? e.i.a.A(this) == 0 : e.i.a.A(this) == 1))) {
            z = true;
        }
        float f3 = this.b;
        float a = a(this.c, (float) Math.sqrt(f3 * f3 * 2.0f), this.f1573j);
        float a2 = a(this.c, this.f1567d, this.f1573j);
        float round = Math.round(a(0.0f, this.f1574k, this.f1573j));
        float a3 = a(0.0f, f1566m, this.f1573j);
        float a4 = a(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.f1573j);
        double d2 = a;
        double d3 = a3;
        boolean z2 = z;
        float round2 = (float) Math.round(Math.cos(d3) * d2);
        float round3 = (float) Math.round(Math.sin(d3) * d2);
        this.f1570g.rewind();
        float a5 = a(this.a.getStrokeWidth() + this.f1568e, -this.f1574k, this.f1573j);
        float f4 = (-a2) / 2.0f;
        this.f1570g.moveTo(f4 + round, 0.0f);
        this.f1570g.rLineTo(a2 - (round * 2.0f), 0.0f);
        this.f1570g.moveTo(f4, a5);
        this.f1570g.rLineTo(round2, round3);
        this.f1570g.moveTo(f4, -a5);
        this.f1570g.rLineTo(round2, -round3);
        this.f1570g.close();
        canvas.save();
        float strokeWidth = this.a.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + this.f1568e + ((((int) (height - (2.0f * f2))) / 4) * 2));
        if (this.f1569f) {
            canvas.rotate(a4 * (this.f1572i ^ z2 ? -1 : 1));
        } else if (z2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f1570g, this.a);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f1571h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f1571h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (i2 != this.a.getAlpha()) {
            this.a.setAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
