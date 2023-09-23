package e.b0.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: VectorDrawableCompat.java */
/* loaded from: classes.dex */
public class f extends e.b0.a.a.e {
    public static final PorterDuff.Mode o = PorterDuff.Mode.SRC_IN;

    /* renamed from: g  reason: collision with root package name */
    public h f1888g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuffColorFilter f1889h;

    /* renamed from: i  reason: collision with root package name */
    public ColorFilter f1890i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1891j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1892k;

    /* renamed from: l  reason: collision with root package name */
    public final float[] f1893l;

    /* renamed from: m  reason: collision with root package name */
    public final Matrix f1894m;
    public final Rect n;

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class b extends AbstractC0029f {
        public b() {
        }

        @Override // e.b0.a.a.f.AbstractC0029f
        public boolean c() {
            return true;
        }

        public b(b bVar) {
            super(bVar);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static abstract class e {
        public e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }

        public e(a aVar) {
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class h extends Drawable.ConstantState {
        public int a;
        public g b;
        public ColorStateList c;

        /* renamed from: d  reason: collision with root package name */
        public PorterDuff.Mode f1925d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1926e;

        /* renamed from: f  reason: collision with root package name */
        public Bitmap f1927f;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f1928g;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f1929h;

        /* renamed from: i  reason: collision with root package name */
        public int f1930i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f1931j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f1932k;

        /* renamed from: l  reason: collision with root package name */
        public Paint f1933l;

        public h(h hVar) {
            this.c = null;
            this.f1925d = f.o;
            if (hVar != null) {
                this.a = hVar.a;
                g gVar = new g(hVar.b);
                this.b = gVar;
                if (hVar.b.f1916e != null) {
                    gVar.f1916e = new Paint(hVar.b.f1916e);
                }
                if (hVar.b.f1915d != null) {
                    this.b.f1915d = new Paint(hVar.b.f1915d);
                }
                this.c = hVar.c;
                this.f1925d = hVar.f1925d;
                this.f1926e = hVar.f1926e;
            }
        }

        public boolean a() {
            g gVar = this.b;
            if (gVar.o == null) {
                gVar.o = Boolean.valueOf(gVar.f1919h.a());
            }
            return gVar.o.booleanValue();
        }

        public void b(int i2, int i3) {
            this.f1927f.eraseColor(0);
            Canvas canvas = new Canvas(this.f1927f);
            g gVar = this.b;
            gVar.a(gVar.f1919h, g.q, canvas, i2, i3, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new f(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new f(this);
        }

        public h() {
            this.c = null;
            this.f1925d = f.o;
            this.b = new g();
        }
    }

    public f() {
        this.f1892k = true;
        this.f1893l = new float[9];
        this.f1894m = new Matrix();
        this.n = new Rect();
        this.f1888g = new h();
    }

    public static f a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        f fVar = new f();
        fVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return fVar;
    }

    public PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            drawable.canApplyTheme();
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d3, code lost:
        if ((r1 == r7.getWidth() && r3 == r6.f1927f.getHeight()) == false) goto L66;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r11) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b0.a.a.f.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f1888g.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f1888g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f1890i;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f1887f != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f1887f.getConstantState());
        }
        this.f1888g.a = getChangingConfigurations();
        return this.f1888g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f1888g.b.f1921j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f1888g.b.f1920i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f1888g.f1926e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((hVar = this.f1888g) != null && (hVar.a() || ((colorStateList = this.f1888g.c) != null && colorStateList.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f1891j && super.mutate() == this) {
            this.f1888g = new h(this.f1888g);
            this.f1891j = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        h hVar = this.f1888g;
        ColorStateList colorStateList = hVar.c;
        if (colorStateList != null && (mode = hVar.f1925d) != null) {
            this.f1889h = b(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (hVar.a()) {
            boolean b2 = hVar.b.f1919h.b(iArr);
            hVar.f1932k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f1888g.b.getRootAlpha() != i2) {
            this.f1888g.b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f1888g.f1926e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f1890i = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i2) {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            e.i.a.c0(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            e.i.a.d0(drawable, colorStateList);
            return;
        }
        h hVar = this.f1888g;
        if (hVar.c != colorStateList) {
            hVar.c = colorStateList;
            this.f1889h = b(colorStateList, hVar.f1925d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            e.i.a.e0(drawable, mode);
            return;
        }
        h hVar = this.f1888g;
        if (hVar.f1925d != mode) {
            hVar.f1925d = mode;
            this.f1889h = b(hVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class i extends Drawable.ConstantState {
        public final Drawable.ConstantState a;

        public i(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            f fVar = new f();
            fVar.f1887f = (VectorDrawable) this.a.newDrawable();
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            f fVar = new f();
            fVar.f1887f = (VectorDrawable) this.a.newDrawable(resources);
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            f fVar = new f();
            fVar.f1887f = (VectorDrawable) this.a.newDrawable(resources, theme);
            return fVar;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: e.b0.a.a.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0029f extends e {
        public e.i.d.d[] a;
        public String b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f1914d;

        public AbstractC0029f() {
            super(null);
            this.a = null;
            this.c = 0;
        }

        public boolean c() {
            return false;
        }

        public e.i.d.d[] getPathData() {
            return this.a;
        }

        public String getPathName() {
            return this.b;
        }

        public void setPathData(e.i.d.d[] dVarArr) {
            if (!e.i.a.e(this.a, dVarArr)) {
                this.a = e.i.a.w(dVarArr);
                return;
            }
            e.i.d.d[] dVarArr2 = this.a;
            for (int i2 = 0; i2 < dVarArr.length; i2++) {
                dVarArr2[i2].a = dVarArr[i2].a;
                for (int i3 = 0; i3 < dVarArr[i2].b.length; i3++) {
                    dVarArr2[i2].b[i3] = dVarArr[i2].b[i3];
                }
            }
        }

        public AbstractC0029f(AbstractC0029f abstractC0029f) {
            super(null);
            this.a = null;
            this.c = 0;
            this.b = abstractC0029f.b;
            this.f1914d = abstractC0029f.f1914d;
            this.a = e.i.a.w(abstractC0029f.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:219:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void inflate(android.content.res.Resources r28, org.xmlpull.v1.XmlPullParser r29, android.util.AttributeSet r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b0.a.a.f.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public f(h hVar) {
        this.f1892k = true;
        this.f1893l = new float[9];
        this.f1894m = new Matrix();
        this.n = new Rect();
        this.f1888g = hVar;
        this.f1889h = b(hVar.c, hVar.f1925d);
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class c extends AbstractC0029f {

        /* renamed from: e  reason: collision with root package name */
        public int[] f1895e;

        /* renamed from: f  reason: collision with root package name */
        public e.i.c.d.d f1896f;

        /* renamed from: g  reason: collision with root package name */
        public float f1897g;

        /* renamed from: h  reason: collision with root package name */
        public e.i.c.d.d f1898h;

        /* renamed from: i  reason: collision with root package name */
        public float f1899i;

        /* renamed from: j  reason: collision with root package name */
        public float f1900j;

        /* renamed from: k  reason: collision with root package name */
        public float f1901k;

        /* renamed from: l  reason: collision with root package name */
        public float f1902l;

        /* renamed from: m  reason: collision with root package name */
        public float f1903m;
        public Paint.Cap n;
        public Paint.Join o;
        public float p;

        public c() {
            this.f1897g = 0.0f;
            this.f1899i = 1.0f;
            this.f1900j = 1.0f;
            this.f1901k = 0.0f;
            this.f1902l = 1.0f;
            this.f1903m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
        }

        @Override // e.b0.a.a.f.e
        public boolean a() {
            return this.f1898h.c() || this.f1896f.c();
        }

        @Override // e.b0.a.a.f.e
        public boolean b(int[] iArr) {
            return this.f1896f.d(iArr) | this.f1898h.d(iArr);
        }

        public float getFillAlpha() {
            return this.f1900j;
        }

        public int getFillColor() {
            return this.f1898h.c;
        }

        public float getStrokeAlpha() {
            return this.f1899i;
        }

        public int getStrokeColor() {
            return this.f1896f.c;
        }

        public float getStrokeWidth() {
            return this.f1897g;
        }

        public float getTrimPathEnd() {
            return this.f1902l;
        }

        public float getTrimPathOffset() {
            return this.f1903m;
        }

        public float getTrimPathStart() {
            return this.f1901k;
        }

        public void setFillAlpha(float f2) {
            this.f1900j = f2;
        }

        public void setFillColor(int i2) {
            this.f1898h.c = i2;
        }

        public void setStrokeAlpha(float f2) {
            this.f1899i = f2;
        }

        public void setStrokeColor(int i2) {
            this.f1896f.c = i2;
        }

        public void setStrokeWidth(float f2) {
            this.f1897g = f2;
        }

        public void setTrimPathEnd(float f2) {
            this.f1902l = f2;
        }

        public void setTrimPathOffset(float f2) {
            this.f1903m = f2;
        }

        public void setTrimPathStart(float f2) {
            this.f1901k = f2;
        }

        public c(c cVar) {
            super(cVar);
            this.f1897g = 0.0f;
            this.f1899i = 1.0f;
            this.f1900j = 1.0f;
            this.f1901k = 0.0f;
            this.f1902l = 1.0f;
            this.f1903m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
            this.f1895e = cVar.f1895e;
            this.f1896f = cVar.f1896f;
            this.f1897g = cVar.f1897g;
            this.f1899i = cVar.f1899i;
            this.f1898h = cVar.f1898h;
            this.c = cVar.c;
            this.f1900j = cVar.f1900j;
            this.f1901k = cVar.f1901k;
            this.f1902l = cVar.f1902l;
            this.f1903m = cVar.f1903m;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class g {
        public static final Matrix q = new Matrix();
        public final Path a;
        public final Path b;
        public final Matrix c;

        /* renamed from: d  reason: collision with root package name */
        public Paint f1915d;

        /* renamed from: e  reason: collision with root package name */
        public Paint f1916e;

        /* renamed from: f  reason: collision with root package name */
        public PathMeasure f1917f;

        /* renamed from: g  reason: collision with root package name */
        public int f1918g;

        /* renamed from: h  reason: collision with root package name */
        public final d f1919h;

        /* renamed from: i  reason: collision with root package name */
        public float f1920i;

        /* renamed from: j  reason: collision with root package name */
        public float f1921j;

        /* renamed from: k  reason: collision with root package name */
        public float f1922k;

        /* renamed from: l  reason: collision with root package name */
        public float f1923l;

        /* renamed from: m  reason: collision with root package name */
        public int f1924m;
        public String n;
        public Boolean o;
        public final e.f.a<String, Object> p;

        public g() {
            this.c = new Matrix();
            this.f1920i = 0.0f;
            this.f1921j = 0.0f;
            this.f1922k = 0.0f;
            this.f1923l = 0.0f;
            this.f1924m = 255;
            this.n = null;
            this.o = null;
            this.p = new e.f.a<>();
            this.f1919h = new d();
            this.a = new Path();
            this.b = new Path();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r11v18 */
        public final void a(d dVar, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            g gVar;
            g gVar2 = this;
            dVar.a.set(matrix);
            dVar.a.preConcat(dVar.f1910j);
            canvas.save();
            ?? r11 = 0;
            int i4 = 0;
            while (i4 < dVar.b.size()) {
                e eVar = dVar.b.get(i4);
                if (eVar instanceof d) {
                    a((d) eVar, dVar.a, canvas, i2, i3, colorFilter);
                } else if (eVar instanceof AbstractC0029f) {
                    AbstractC0029f abstractC0029f = (AbstractC0029f) eVar;
                    float f2 = i2 / gVar2.f1922k;
                    float f3 = i3 / gVar2.f1923l;
                    float min = Math.min(f2, f3);
                    Matrix matrix2 = dVar.a;
                    gVar2.c.set(matrix2);
                    gVar2.c.postScale(f2, f3);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float f4 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max((float) Math.hypot(fArr[r11], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
                    float abs = max > 0.0f ? Math.abs(f4) / max : 0.0f;
                    if (abs == 0.0f) {
                        gVar = this;
                    } else {
                        gVar = this;
                        Path path = gVar.a;
                        Objects.requireNonNull(abstractC0029f);
                        path.reset();
                        e.i.d.d[] dVarArr = abstractC0029f.a;
                        if (dVarArr != null) {
                            e.i.d.d.b(dVarArr, path);
                        }
                        Path path2 = gVar.a;
                        gVar.b.reset();
                        if (abstractC0029f.c()) {
                            gVar.b.setFillType(abstractC0029f.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            gVar.b.addPath(path2, gVar.c);
                            canvas.clipPath(gVar.b);
                        } else {
                            c cVar = (c) abstractC0029f;
                            float f5 = cVar.f1901k;
                            if (f5 != 0.0f || cVar.f1902l != 1.0f) {
                                float f6 = cVar.f1903m;
                                float f7 = (f5 + f6) % 1.0f;
                                float f8 = (cVar.f1902l + f6) % 1.0f;
                                if (gVar.f1917f == null) {
                                    gVar.f1917f = new PathMeasure();
                                }
                                gVar.f1917f.setPath(gVar.a, r11);
                                float length = gVar.f1917f.getLength();
                                float f9 = f7 * length;
                                float f10 = f8 * length;
                                path2.reset();
                                if (f9 > f10) {
                                    gVar.f1917f.getSegment(f9, length, path2, true);
                                    gVar.f1917f.getSegment(0.0f, f10, path2, true);
                                } else {
                                    gVar.f1917f.getSegment(f9, f10, path2, true);
                                }
                                path2.rLineTo(0.0f, 0.0f);
                            }
                            gVar.b.addPath(path2, gVar.c);
                            e.i.c.d.d dVar2 = cVar.f1898h;
                            if (dVar2.b() || dVar2.c != 0) {
                                e.i.c.d.d dVar3 = cVar.f1898h;
                                if (gVar.f1916e == null) {
                                    Paint paint = new Paint(1);
                                    gVar.f1916e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = gVar.f1916e;
                                if (dVar3.b()) {
                                    Shader shader = dVar3.a;
                                    shader.setLocalMatrix(gVar.c);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(cVar.f1900j * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i5 = dVar3.c;
                                    float f11 = cVar.f1900j;
                                    PorterDuff.Mode mode = f.o;
                                    paint2.setColor((i5 & 16777215) | (((int) (Color.alpha(i5) * f11)) << 24));
                                }
                                paint2.setColorFilter(colorFilter);
                                gVar.b.setFillType(cVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(gVar.b, paint2);
                            }
                            e.i.c.d.d dVar4 = cVar.f1896f;
                            if (dVar4.b() || dVar4.c != 0) {
                                e.i.c.d.d dVar5 = cVar.f1896f;
                                if (gVar.f1915d == null) {
                                    Paint paint3 = new Paint(1);
                                    gVar.f1915d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = gVar.f1915d;
                                Paint.Join join = cVar.o;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = cVar.n;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(cVar.p);
                                if (dVar5.b()) {
                                    Shader shader2 = dVar5.a;
                                    shader2.setLocalMatrix(gVar.c);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(cVar.f1899i * 255.0f));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i6 = dVar5.c;
                                    float f12 = cVar.f1899i;
                                    PorterDuff.Mode mode2 = f.o;
                                    paint4.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f12)) << 24));
                                }
                                paint4.setColorFilter(colorFilter);
                                paint4.setStrokeWidth(cVar.f1897g * abs * min);
                                canvas.drawPath(gVar.b, paint4);
                            }
                        }
                    }
                    i4++;
                    gVar2 = gVar;
                    r11 = 0;
                }
                gVar = gVar2;
                i4++;
                gVar2 = gVar;
                r11 = 0;
            }
            canvas.restore();
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f1924m;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.f1924m = i2;
        }

        public g(g gVar) {
            this.c = new Matrix();
            this.f1920i = 0.0f;
            this.f1921j = 0.0f;
            this.f1922k = 0.0f;
            this.f1923l = 0.0f;
            this.f1924m = 255;
            this.n = null;
            this.o = null;
            e.f.a<String, Object> aVar = new e.f.a<>();
            this.p = aVar;
            this.f1919h = new d(gVar.f1919h, aVar);
            this.a = new Path(gVar.a);
            this.b = new Path(gVar.b);
            this.f1920i = gVar.f1920i;
            this.f1921j = gVar.f1921j;
            this.f1922k = gVar.f1922k;
            this.f1923l = gVar.f1923l;
            this.f1918g = gVar.f1918g;
            this.f1924m = gVar.f1924m;
            this.n = gVar.n;
            String str = gVar.n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.o = gVar.o;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class d extends e {
        public final Matrix a;
        public final ArrayList<e> b;
        public float c;

        /* renamed from: d  reason: collision with root package name */
        public float f1904d;

        /* renamed from: e  reason: collision with root package name */
        public float f1905e;

        /* renamed from: f  reason: collision with root package name */
        public float f1906f;

        /* renamed from: g  reason: collision with root package name */
        public float f1907g;

        /* renamed from: h  reason: collision with root package name */
        public float f1908h;

        /* renamed from: i  reason: collision with root package name */
        public float f1909i;

        /* renamed from: j  reason: collision with root package name */
        public final Matrix f1910j;

        /* renamed from: k  reason: collision with root package name */
        public int f1911k;

        /* renamed from: l  reason: collision with root package name */
        public int[] f1912l;

        /* renamed from: m  reason: collision with root package name */
        public String f1913m;

        public d(d dVar, e.f.a<String, Object> aVar) {
            super(null);
            AbstractC0029f bVar;
            this.a = new Matrix();
            this.b = new ArrayList<>();
            this.c = 0.0f;
            this.f1904d = 0.0f;
            this.f1905e = 0.0f;
            this.f1906f = 1.0f;
            this.f1907g = 1.0f;
            this.f1908h = 0.0f;
            this.f1909i = 0.0f;
            Matrix matrix = new Matrix();
            this.f1910j = matrix;
            this.f1913m = null;
            this.c = dVar.c;
            this.f1904d = dVar.f1904d;
            this.f1905e = dVar.f1905e;
            this.f1906f = dVar.f1906f;
            this.f1907g = dVar.f1907g;
            this.f1908h = dVar.f1908h;
            this.f1909i = dVar.f1909i;
            this.f1912l = dVar.f1912l;
            String str = dVar.f1913m;
            this.f1913m = str;
            this.f1911k = dVar.f1911k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f1910j);
            ArrayList<e> arrayList = dVar.b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                e eVar = arrayList.get(i2);
                if (eVar instanceof d) {
                    this.b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        bVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.b.add(bVar);
                    String str2 = bVar.b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        @Override // e.b0.a.a.f.e
        public boolean a() {
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                if (this.b.get(i2).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // e.b0.a.a.f.e
        public boolean b(int[] iArr) {
            boolean z = false;
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                z |= this.b.get(i2).b(iArr);
            }
            return z;
        }

        public final void c() {
            this.f1910j.reset();
            this.f1910j.postTranslate(-this.f1904d, -this.f1905e);
            this.f1910j.postScale(this.f1906f, this.f1907g);
            this.f1910j.postRotate(this.c, 0.0f, 0.0f);
            this.f1910j.postTranslate(this.f1908h + this.f1904d, this.f1909i + this.f1905e);
        }

        public String getGroupName() {
            return this.f1913m;
        }

        public Matrix getLocalMatrix() {
            return this.f1910j;
        }

        public float getPivotX() {
            return this.f1904d;
        }

        public float getPivotY() {
            return this.f1905e;
        }

        public float getRotation() {
            return this.c;
        }

        public float getScaleX() {
            return this.f1906f;
        }

        public float getScaleY() {
            return this.f1907g;
        }

        public float getTranslateX() {
            return this.f1908h;
        }

        public float getTranslateY() {
            return this.f1909i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.f1904d) {
                this.f1904d = f2;
                c();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.f1905e) {
                this.f1905e = f2;
                c();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.c) {
                this.c = f2;
                c();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f1906f) {
                this.f1906f = f2;
                c();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.f1907g) {
                this.f1907g = f2;
                c();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.f1908h) {
                this.f1908h = f2;
                c();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.f1909i) {
                this.f1909i = f2;
                c();
            }
        }

        public d() {
            super(null);
            this.a = new Matrix();
            this.b = new ArrayList<>();
            this.c = 0.0f;
            this.f1904d = 0.0f;
            this.f1905e = 0.0f;
            this.f1906f = 1.0f;
            this.f1907g = 1.0f;
            this.f1908h = 0.0f;
            this.f1909i = 0.0f;
            this.f1910j = new Matrix();
            this.f1913m = null;
        }
    }
}
