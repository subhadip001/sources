package f.h.b.c.y;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import f.h.b.c.y.k;
import f.h.b.c.y.m;
import java.util.BitSet;
import java.util.Objects;

/* compiled from: MaterialShapeDrawable.java */
/* loaded from: classes.dex */
public class g extends Drawable implements e.i.d.m.a, n {
    public static final String C = g.class.getSimpleName();
    public static final Paint D;
    public final RectF A;
    public boolean B;

    /* renamed from: f  reason: collision with root package name */
    public b f5480f;

    /* renamed from: g  reason: collision with root package name */
    public final m.f[] f5481g;

    /* renamed from: h  reason: collision with root package name */
    public final m.f[] f5482h;

    /* renamed from: i  reason: collision with root package name */
    public final BitSet f5483i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5484j;

    /* renamed from: k  reason: collision with root package name */
    public final Matrix f5485k;

    /* renamed from: l  reason: collision with root package name */
    public final Path f5486l;

    /* renamed from: m  reason: collision with root package name */
    public final Path f5487m;
    public final RectF n;
    public final RectF o;
    public final Region p;
    public final Region q;
    public j r;
    public final Paint s;
    public final Paint t;
    public final f.h.b.c.x.a u;
    public final k.b v;
    public final k w;
    public PorterDuffColorFilter x;
    public PorterDuffColorFilter y;
    public int z;

    /* compiled from: MaterialShapeDrawable.java */
    /* loaded from: classes.dex */
    public class a implements k.b {
        public a() {
        }
    }

    static {
        Paint paint = new Paint(1);
        D = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new j());
    }

    public final void b(RectF rectF, Path path) {
        c(rectF, path);
        if (this.f5480f.f5494j != 1.0f) {
            this.f5485k.reset();
            Matrix matrix = this.f5485k;
            float f2 = this.f5480f.f5494j;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f5485k);
        }
        path.computeBounds(this.A, true);
    }

    public final void c(RectF rectF, Path path) {
        k kVar = this.w;
        b bVar = this.f5480f;
        kVar.b(bVar.a, bVar.f5495k, rectF, this.v, path);
    }

    public final PorterDuffColorFilter d(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = e(colorForState);
            }
            this.z = colorForState;
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z) {
            int color = paint.getColor();
            int e2 = e(color);
            this.z = e2;
            if (e2 != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(e2, PorterDuff.Mode.SRC_IN);
                return porterDuffColorFilter;
            }
        }
        porterDuffColorFilter = null;
        return porterDuffColorFilter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ea, code lost:
        if (((p() || r10.f5486l.isConvex() || android.os.Build.VERSION.SDK_INT >= 29) ? false : true) != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ae  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r11) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.c.y.g.draw(android.graphics.Canvas):void");
    }

    public int e(int i2) {
        b bVar = this.f5480f;
        float f2 = bVar.o + bVar.p + bVar.n;
        f.h.b.c.p.a aVar = bVar.b;
        if (aVar == null || !aVar.a) {
            return i2;
        }
        return e.i.d.a.e(i2, 255) == aVar.f5361d ? aVar.a(i2, f2) : i2;
    }

    public final void f(Canvas canvas) {
        if (this.f5483i.cardinality() > 0) {
            Log.w(C, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f5480f.s != 0) {
            canvas.drawPath(this.f5486l, this.u.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m.f fVar = this.f5481g[i2];
            f.h.b.c.x.a aVar = this.u;
            int i3 = this.f5480f.r;
            Matrix matrix = m.f.a;
            fVar.a(matrix, aVar, i3, canvas);
            this.f5482h[i2].a(matrix, this.u, this.f5480f.r, canvas);
        }
        if (this.B) {
            int j2 = j();
            int k2 = k();
            canvas.translate(-j2, -k2);
            canvas.drawPath(this.f5486l, D);
            canvas.translate(j2, k2);
        }
    }

    public final void g(Canvas canvas, Paint paint, Path path, j jVar, RectF rectF) {
        if (jVar.d(rectF)) {
            float a2 = jVar.f5501f.a(rectF) * this.f5480f.f5495k;
            canvas.drawRoundRect(rectF, a2, a2, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f5480f.f5497m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f5480f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f5480f.q == 2) {
            return;
        }
        if (p()) {
            outline.setRoundRect(getBounds(), m() * this.f5480f.f5495k);
            return;
        }
        b(i(), this.f5486l);
        if (this.f5486l.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f5486l);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f5480f.f5493i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.p.set(getBounds());
        b(i(), this.f5486l);
        this.q.setPath(this.f5486l, this.p);
        this.p.op(this.q, Region.Op.DIFFERENCE);
        return this.p;
    }

    public void h(Canvas canvas) {
        Paint paint = this.t;
        Path path = this.f5487m;
        j jVar = this.r;
        this.o.set(i());
        float l2 = l();
        this.o.inset(l2, l2);
        g(canvas, paint, path, jVar, this.o);
    }

    public RectF i() {
        this.n.set(getBounds());
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f5484j = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f5480f.f5491g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f5480f.f5490f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f5480f.f5489e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f5480f.f5488d) != null && colorStateList4.isStateful())));
    }

    public int j() {
        b bVar = this.f5480f;
        return (int) (Math.sin(Math.toRadians(bVar.t)) * bVar.s);
    }

    public int k() {
        b bVar = this.f5480f;
        return (int) (Math.cos(Math.toRadians(bVar.t)) * bVar.s);
    }

    public final float l() {
        if (n()) {
            return this.t.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public float m() {
        return this.f5480f.a.f5500e.a(i());
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f5480f = new b(this.f5480f);
        return this;
    }

    public final boolean n() {
        Paint.Style style = this.f5480f.v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.t.getStrokeWidth() > 0.0f;
    }

    public void o(Context context) {
        this.f5480f.b = new f.h.b.c.p.a(context);
        z();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f5484j = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, f.h.b.c.s.p.b
    public boolean onStateChange(int[] iArr) {
        boolean z = x(iArr) || y();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public boolean p() {
        return this.f5480f.a.d(i());
    }

    public void q(float f2) {
        b bVar = this.f5480f;
        if (bVar.o != f2) {
            bVar.o = f2;
            z();
        }
    }

    public void r(ColorStateList colorStateList) {
        b bVar = this.f5480f;
        if (bVar.f5488d != colorStateList) {
            bVar.f5488d = colorStateList;
            onStateChange(getState());
        }
    }

    public void s(float f2) {
        b bVar = this.f5480f;
        if (bVar.f5495k != f2) {
            bVar.f5495k = f2;
            this.f5484j = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        b bVar = this.f5480f;
        if (bVar.f5497m != i2) {
            bVar.f5497m = i2;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5480f.c = colorFilter;
        super.invalidateSelf();
    }

    @Override // f.h.b.c.y.n
    public void setShapeAppearanceModel(j jVar) {
        this.f5480f.a = jVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f5480f.f5491g = colorStateList;
        y();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f5480f;
        if (bVar.f5492h != mode) {
            bVar.f5492h = mode;
            y();
            super.invalidateSelf();
        }
    }

    public void t(int i2) {
        this.u.a(i2);
        this.f5480f.u = false;
        super.invalidateSelf();
    }

    public void u(float f2, int i2) {
        this.f5480f.f5496l = f2;
        invalidateSelf();
        w(ColorStateList.valueOf(i2));
    }

    public void v(float f2, ColorStateList colorStateList) {
        this.f5480f.f5496l = f2;
        invalidateSelf();
        w(colorStateList);
    }

    public void w(ColorStateList colorStateList) {
        b bVar = this.f5480f;
        if (bVar.f5489e != colorStateList) {
            bVar.f5489e = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean x(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f5480f.f5488d == null || color2 == (colorForState2 = this.f5480f.f5488d.getColorForState(iArr, (color2 = this.s.getColor())))) {
            z = false;
        } else {
            this.s.setColor(colorForState2);
            z = true;
        }
        if (this.f5480f.f5489e == null || color == (colorForState = this.f5480f.f5489e.getColorForState(iArr, (color = this.t.getColor())))) {
            return z;
        }
        this.t.setColor(colorForState);
        return true;
    }

    public final boolean y() {
        PorterDuffColorFilter porterDuffColorFilter = this.x;
        PorterDuffColorFilter porterDuffColorFilter2 = this.y;
        b bVar = this.f5480f;
        this.x = d(bVar.f5491g, bVar.f5492h, this.s, true);
        b bVar2 = this.f5480f;
        this.y = d(bVar2.f5490f, bVar2.f5492h, this.t, false);
        b bVar3 = this.f5480f;
        if (bVar3.u) {
            this.u.a(bVar3.f5491g.getColorForState(getState(), 0));
        }
        return (Objects.equals(porterDuffColorFilter, this.x) && Objects.equals(porterDuffColorFilter2, this.y)) ? false : true;
    }

    public final void z() {
        b bVar = this.f5480f;
        float f2 = bVar.o + bVar.p;
        bVar.r = (int) Math.ceil(0.75f * f2);
        this.f5480f.s = (int) Math.ceil(f2 * 0.25f);
        y();
        super.invalidateSelf();
    }

    public g(j jVar) {
        this(new b(jVar, null));
    }

    public g(b bVar) {
        k kVar;
        this.f5481g = new m.f[4];
        this.f5482h = new m.f[4];
        this.f5483i = new BitSet(8);
        this.f5485k = new Matrix();
        this.f5486l = new Path();
        this.f5487m = new Path();
        this.n = new RectF();
        this.o = new RectF();
        this.p = new Region();
        this.q = new Region();
        Paint paint = new Paint(1);
        this.s = paint;
        Paint paint2 = new Paint(1);
        this.t = paint2;
        this.u = new f.h.b.c.x.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            kVar = k.a.a;
        } else {
            kVar = new k();
        }
        this.w = kVar;
        this.A = new RectF();
        this.B = true;
        this.f5480f = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        y();
        x(getState());
        this.v = new a();
    }

    /* compiled from: MaterialShapeDrawable.java */
    /* loaded from: classes.dex */
    public static final class b extends Drawable.ConstantState {
        public j a;
        public f.h.b.c.p.a b;
        public ColorFilter c;

        /* renamed from: d  reason: collision with root package name */
        public ColorStateList f5488d;

        /* renamed from: e  reason: collision with root package name */
        public ColorStateList f5489e;

        /* renamed from: f  reason: collision with root package name */
        public ColorStateList f5490f;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f5491g;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f5492h;

        /* renamed from: i  reason: collision with root package name */
        public Rect f5493i;

        /* renamed from: j  reason: collision with root package name */
        public float f5494j;

        /* renamed from: k  reason: collision with root package name */
        public float f5495k;

        /* renamed from: l  reason: collision with root package name */
        public float f5496l;

        /* renamed from: m  reason: collision with root package name */
        public int f5497m;
        public float n;
        public float o;
        public float p;
        public int q;
        public int r;
        public int s;
        public int t;
        public boolean u;
        public Paint.Style v;

        public b(j jVar, f.h.b.c.p.a aVar) {
            this.f5488d = null;
            this.f5489e = null;
            this.f5490f = null;
            this.f5491g = null;
            this.f5492h = PorterDuff.Mode.SRC_IN;
            this.f5493i = null;
            this.f5494j = 1.0f;
            this.f5495k = 1.0f;
            this.f5497m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.a = jVar;
            this.b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g(this);
            gVar.f5484j = true;
            return gVar;
        }

        public b(b bVar) {
            this.f5488d = null;
            this.f5489e = null;
            this.f5490f = null;
            this.f5491g = null;
            this.f5492h = PorterDuff.Mode.SRC_IN;
            this.f5493i = null;
            this.f5494j = 1.0f;
            this.f5495k = 1.0f;
            this.f5497m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.a = bVar.a;
            this.b = bVar.b;
            this.f5496l = bVar.f5496l;
            this.c = bVar.c;
            this.f5488d = bVar.f5488d;
            this.f5489e = bVar.f5489e;
            this.f5492h = bVar.f5492h;
            this.f5491g = bVar.f5491g;
            this.f5497m = bVar.f5497m;
            this.f5494j = bVar.f5494j;
            this.s = bVar.s;
            this.q = bVar.q;
            this.u = bVar.u;
            this.f5495k = bVar.f5495k;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
            this.r = bVar.r;
            this.t = bVar.t;
            this.f5490f = bVar.f5490f;
            this.v = bVar.v;
            if (bVar.f5493i != null) {
                this.f5493i = new Rect(bVar.f5493i);
            }
        }
    }

    public g(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(j.b(context, attributeSet, i2, i3, new f.h.b.c.y.a(0)).a());
    }
}
