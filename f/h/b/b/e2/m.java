package f.h.b.b.e2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.Objects;

/* compiled from: SubtitlePainter.java */
/* loaded from: classes.dex */
public final class m {
    public int A;
    public int B;
    public int C;
    public int D;
    public StaticLayout E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;
    public Rect J;
    public final float a;
    public final float b;
    public final float c;

    /* renamed from: d  reason: collision with root package name */
    public final float f4130d;

    /* renamed from: e  reason: collision with root package name */
    public final float f4131e;

    /* renamed from: f  reason: collision with root package name */
    public final TextPaint f4132f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f4133g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f4134h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f4135i;

    /* renamed from: j  reason: collision with root package name */
    public Layout.Alignment f4136j;

    /* renamed from: k  reason: collision with root package name */
    public Bitmap f4137k;

    /* renamed from: l  reason: collision with root package name */
    public float f4138l;

    /* renamed from: m  reason: collision with root package name */
    public int f4139m;
    public int n;
    public float o;
    public int p;
    public float q;
    public float r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public float x;
    public float y;
    public float z;

    public m(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16843287, 16843288}, 0, 0);
        this.f4131e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f4130d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.a = round;
        this.b = round;
        this.c = round;
        TextPaint textPaint = new TextPaint();
        this.f4132f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f4133g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f4134h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, boolean z) {
        if (z) {
            StaticLayout staticLayout = this.E;
            StaticLayout staticLayout2 = this.F;
            if (staticLayout == null || staticLayout2 == null) {
                return;
            }
            int save = canvas.save();
            canvas.translate(this.G, this.H);
            if (Color.alpha(this.u) > 0) {
                this.f4133g.setColor(this.u);
                canvas.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), this.f4133g);
            }
            int i2 = this.w;
            if (i2 == 1) {
                this.f4132f.setStrokeJoin(Paint.Join.ROUND);
                this.f4132f.setStrokeWidth(this.a);
                this.f4132f.setColor(this.v);
                this.f4132f.setStyle(Paint.Style.FILL_AND_STROKE);
                staticLayout2.draw(canvas);
            } else if (i2 == 2) {
                TextPaint textPaint = this.f4132f;
                float f2 = this.b;
                float f3 = this.c;
                textPaint.setShadowLayer(f2, f3, f3, this.v);
            } else if (i2 == 3 || i2 == 4) {
                boolean z2 = i2 == 3;
                int i3 = z2 ? -1 : this.v;
                int i4 = z2 ? this.v : -1;
                float f4 = this.b / 2.0f;
                this.f4132f.setColor(this.s);
                this.f4132f.setStyle(Paint.Style.FILL);
                float f5 = -f4;
                this.f4132f.setShadowLayer(this.b, f5, f5, i3);
                staticLayout2.draw(canvas);
                this.f4132f.setShadowLayer(this.b, f4, f4, i4);
            }
            this.f4132f.setColor(this.s);
            this.f4132f.setStyle(Paint.Style.FILL);
            staticLayout.draw(canvas);
            this.f4132f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            canvas.restoreToCount(save);
            return;
        }
        Objects.requireNonNull(this.J);
        Objects.requireNonNull(this.f4137k);
        canvas.drawBitmap(this.f4137k, (Rect) null, this.J, this.f4134h);
    }
}
