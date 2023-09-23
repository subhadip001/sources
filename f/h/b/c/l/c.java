package f.h.b.c.l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import f.h.b.c.s.p;
import f.h.b.c.y.g;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: ChipDrawable.java */
/* loaded from: classes.dex */
public class c extends g implements e.i.d.m.a, Drawable.Callback, p.b {
    public static final int[] N0 = {16842910};
    public static final ShapeDrawable O0 = new ShapeDrawable(new OvalShape());
    public int A0;
    public ColorFilter B0;
    public PorterDuffColorFilter C0;
    public ColorStateList D0;
    public ColorStateList E;
    public PorterDuff.Mode E0;
    public ColorStateList F;
    public int[] F0;
    public float G;
    public boolean G0;
    public float H;
    public ColorStateList H0;
    public ColorStateList I;
    public WeakReference<a> I0;
    public float J;
    public TextUtils.TruncateAt J0;
    public ColorStateList K;
    public boolean K0;
    public CharSequence L;
    public int L0;
    public boolean M;
    public boolean M0;
    public Drawable N;
    public ColorStateList O;
    public float P;
    public boolean Q;
    public boolean R;
    public Drawable S;
    public Drawable T;
    public ColorStateList U;
    public float V;
    public CharSequence W;
    public boolean X;
    public boolean Y;
    public Drawable Z;
    public ColorStateList a0;
    public f.h.b.c.c.g b0;
    public f.h.b.c.c.g c0;
    public float d0;
    public float e0;
    public float f0;
    public float g0;
    public float h0;
    public float i0;
    public float j0;
    public float k0;
    public final Context l0;
    public final Paint m0;
    public final Paint.FontMetrics n0;
    public final RectF o0;
    public final PointF p0;
    public final Path q0;
    public final p r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public boolean y0;
    public int z0;

    /* compiled from: ChipDrawable.java */
    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public c(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.H = -1.0f;
        this.m0 = new Paint(1);
        this.n0 = new Paint.FontMetrics();
        this.o0 = new RectF();
        this.p0 = new PointF();
        this.q0 = new Path();
        this.A0 = 255;
        this.E0 = PorterDuff.Mode.SRC_IN;
        this.I0 = new WeakReference<>(null);
        this.f5480f.b = new f.h.b.c.p.a(context);
        z();
        this.l0 = context;
        p pVar = new p(this);
        this.r0 = pVar;
        this.L = "";
        pVar.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = N0;
        setState(iArr);
        g0(iArr);
        this.K0 = true;
        int[] iArr2 = f.h.b.c.w.b.a;
        O0.setTint(-1);
    }

    public static boolean J(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean K(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        e.i.a.X(drawable, e.i.a.A(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.S) {
            if (drawable.isStateful()) {
                drawable.setState(this.F0);
            }
            drawable.setTintList(this.U);
            return;
        }
        Drawable drawable2 = this.N;
        if (drawable == drawable2 && this.Q) {
            drawable2.setTintList(this.O);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void B(Rect rect, RectF rectF) {
        float f2;
        rectF.setEmpty();
        if (r0() || q0()) {
            float f3 = this.d0 + this.e0;
            float I = I();
            if (e.i.a.A(this) == 0) {
                float f4 = rect.left + f3;
                rectF.left = f4;
                rectF.right = f4 + I;
            } else {
                float f5 = rect.right - f3;
                rectF.right = f5;
                rectF.left = f5 - I;
            }
            Drawable drawable = this.y0 ? this.Z : this.N;
            float f6 = this.P;
            if (f6 <= 0.0f && drawable != null) {
                f6 = (float) Math.ceil(f.h.b.c.a.h0(this.l0, 24));
                if (drawable.getIntrinsicHeight() <= f6) {
                    f2 = drawable.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f2 / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f2;
                }
            }
            f2 = f6;
            float exactCenterY2 = rect.exactCenterY() - (f2 / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f2;
        }
    }

    public float C() {
        if (r0() || q0()) {
            return I() + this.e0 + this.f0;
        }
        return 0.0f;
    }

    public final void D(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (s0()) {
            float f2 = this.k0 + this.j0;
            if (e.i.a.A(this) == 0) {
                float f3 = rect.right - f2;
                rectF.right = f3;
                rectF.left = f3 - this.V;
            } else {
                float f4 = rect.left + f2;
                rectF.left = f4;
                rectF.right = f4 + this.V;
            }
            float exactCenterY = rect.exactCenterY();
            float f5 = this.V;
            float f6 = exactCenterY - (f5 / 2.0f);
            rectF.top = f6;
            rectF.bottom = f6 + f5;
        }
    }

    public final void E(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (s0()) {
            float f2 = this.k0 + this.j0 + this.V + this.i0 + this.h0;
            if (e.i.a.A(this) == 0) {
                float f3 = rect.right;
                rectF.right = f3;
                rectF.left = f3 - f2;
            } else {
                int i2 = rect.left;
                rectF.left = i2;
                rectF.right = i2 + f2;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public float F() {
        if (s0()) {
            return this.i0 + this.V + this.j0;
        }
        return 0.0f;
    }

    public float G() {
        return this.M0 ? m() : this.H;
    }

    public Drawable H() {
        Drawable drawable = this.S;
        if (drawable != null) {
            return e.i.a.j0(drawable);
        }
        return null;
    }

    public final float I() {
        Drawable drawable = this.y0 ? this.Z : this.N;
        float f2 = this.P;
        return (f2 > 0.0f || drawable == null) ? f2 : drawable.getIntrinsicWidth();
    }

    public void L() {
        a aVar = this.I0.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean M(int[] r9, int[] r10) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.c.l.c.M(int[], int[]):boolean");
    }

    public void N(boolean z) {
        if (this.X != z) {
            this.X = z;
            float C = C();
            if (!z && this.y0) {
                this.y0 = false;
            }
            float C2 = C();
            invalidateSelf();
            if (C != C2) {
                L();
            }
        }
    }

    public void O(Drawable drawable) {
        if (this.Z != drawable) {
            float C = C();
            this.Z = drawable;
            float C2 = C();
            t0(this.Z);
            A(this.Z);
            invalidateSelf();
            if (C != C2) {
                L();
            }
        }
    }

    public void P(ColorStateList colorStateList) {
        if (this.a0 != colorStateList) {
            this.a0 = colorStateList;
            if (this.Y && this.Z != null && this.X) {
                this.Z.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void Q(boolean z) {
        if (this.Y != z) {
            boolean q0 = q0();
            this.Y = z;
            boolean q02 = q0();
            if (q0 != q02) {
                if (q02) {
                    A(this.Z);
                } else {
                    t0(this.Z);
                }
                invalidateSelf();
                L();
            }
        }
    }

    public void R(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            onStateChange(getState());
        }
    }

    @Deprecated
    public void S(float f2) {
        if (this.H != f2) {
            this.H = f2;
            this.f5480f.a = this.f5480f.a.e(f2);
            invalidateSelf();
        }
    }

    public void T(float f2) {
        if (this.k0 != f2) {
            this.k0 = f2;
            invalidateSelf();
            L();
        }
    }

    public void U(Drawable drawable) {
        Drawable drawable2 = this.N;
        Drawable j0 = drawable2 != null ? e.i.a.j0(drawable2) : null;
        if (j0 != drawable) {
            float C = C();
            this.N = drawable != null ? e.i.a.l0(drawable).mutate() : null;
            float C2 = C();
            t0(j0);
            if (r0()) {
                A(this.N);
            }
            invalidateSelf();
            if (C != C2) {
                L();
            }
        }
    }

    public void V(float f2) {
        if (this.P != f2) {
            float C = C();
            this.P = f2;
            float C2 = C();
            invalidateSelf();
            if (C != C2) {
                L();
            }
        }
    }

    public void W(ColorStateList colorStateList) {
        this.Q = true;
        if (this.O != colorStateList) {
            this.O = colorStateList;
            if (r0()) {
                this.N.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void X(boolean z) {
        if (this.M != z) {
            boolean r0 = r0();
            this.M = z;
            boolean r02 = r0();
            if (r0 != r02) {
                if (r02) {
                    A(this.N);
                } else {
                    t0(this.N);
                }
                invalidateSelf();
                L();
            }
        }
    }

    public void Y(float f2) {
        if (this.G != f2) {
            this.G = f2;
            invalidateSelf();
            L();
        }
    }

    public void Z(float f2) {
        if (this.d0 != f2) {
            this.d0 = f2;
            invalidateSelf();
            L();
        }
    }

    @Override // f.h.b.c.s.p.b
    public void a() {
        L();
        invalidateSelf();
    }

    public void a0(ColorStateList colorStateList) {
        if (this.I != colorStateList) {
            this.I = colorStateList;
            if (this.M0) {
                w(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void b0(float f2) {
        if (this.J != f2) {
            this.J = f2;
            this.m0.setStrokeWidth(f2);
            if (this.M0) {
                this.f5480f.f5496l = f2;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public void c0(Drawable drawable) {
        Drawable H = H();
        if (H != drawable) {
            float F = F();
            this.S = drawable != null ? e.i.a.l0(drawable).mutate() : null;
            int[] iArr = f.h.b.c.w.b.a;
            this.T = new RippleDrawable(f.h.b.c.w.b.b(this.K), this.S, O0);
            float F2 = F();
            t0(H);
            if (s0()) {
                A(this.S);
            }
            invalidateSelf();
            if (F != F2) {
                L();
            }
        }
    }

    public void d0(float f2) {
        if (this.j0 != f2) {
            this.j0 = f2;
            invalidateSelf();
            if (s0()) {
                L();
            }
        }
    }

    @Override // f.h.b.c.y.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int saveLayerAlpha;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i2 = this.A0) == 0) {
            return;
        }
        if (i2 < 255) {
            float f2 = bounds.left;
            float f3 = bounds.top;
            float f4 = bounds.right;
            float f5 = bounds.bottom;
            if (Build.VERSION.SDK_INT > 21) {
                saveLayerAlpha = canvas.saveLayerAlpha(f2, f3, f4, f5, i2);
            } else {
                saveLayerAlpha = canvas.saveLayerAlpha(f2, f3, f4, f5, i2, 31);
            }
            i3 = saveLayerAlpha;
        } else {
            i3 = 0;
        }
        if (!this.M0) {
            this.m0.setColor(this.s0);
            this.m0.setStyle(Paint.Style.FILL);
            this.o0.set(bounds);
            canvas.drawRoundRect(this.o0, G(), G(), this.m0);
        }
        if (!this.M0) {
            this.m0.setColor(this.t0);
            this.m0.setStyle(Paint.Style.FILL);
            Paint paint = this.m0;
            ColorFilter colorFilter = this.B0;
            if (colorFilter == null) {
                colorFilter = this.C0;
            }
            paint.setColorFilter(colorFilter);
            this.o0.set(bounds);
            canvas.drawRoundRect(this.o0, G(), G(), this.m0);
        }
        if (this.M0) {
            super.draw(canvas);
        }
        if (this.J > 0.0f && !this.M0) {
            this.m0.setColor(this.v0);
            this.m0.setStyle(Paint.Style.STROKE);
            if (!this.M0) {
                Paint paint2 = this.m0;
                ColorFilter colorFilter2 = this.B0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.C0;
                }
                paint2.setColorFilter(colorFilter2);
            }
            RectF rectF = this.o0;
            float f6 = this.J / 2.0f;
            rectF.set(bounds.left + f6, bounds.top + f6, bounds.right - f6, bounds.bottom - f6);
            float f7 = this.H - (this.J / 2.0f);
            canvas.drawRoundRect(this.o0, f7, f7, this.m0);
        }
        this.m0.setColor(this.w0);
        this.m0.setStyle(Paint.Style.FILL);
        this.o0.set(bounds);
        if (!this.M0) {
            canvas.drawRoundRect(this.o0, G(), G(), this.m0);
            i4 = 0;
        } else {
            c(new RectF(bounds), this.q0);
            i4 = 0;
            g(canvas, this.m0, this.q0, this.f5480f.a, i());
        }
        if (r0()) {
            B(bounds, this.o0);
            RectF rectF2 = this.o0;
            float f8 = rectF2.left;
            float f9 = rectF2.top;
            canvas.translate(f8, f9);
            this.N.setBounds(i4, i4, (int) this.o0.width(), (int) this.o0.height());
            this.N.draw(canvas);
            canvas.translate(-f8, -f9);
        }
        if (q0()) {
            B(bounds, this.o0);
            RectF rectF3 = this.o0;
            float f10 = rectF3.left;
            float f11 = rectF3.top;
            canvas.translate(f10, f11);
            this.Z.setBounds(i4, i4, (int) this.o0.width(), (int) this.o0.height());
            this.Z.draw(canvas);
            canvas.translate(-f10, -f11);
        }
        if (!this.K0 || this.L == null) {
            i5 = i3;
            i6 = 255;
            i7 = 0;
        } else {
            PointF pointF = this.p0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            if (this.L != null) {
                float C = C() + this.d0 + this.g0;
                if (e.i.a.A(this) == 0) {
                    pointF.x = bounds.left + C;
                    align = Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - C;
                    align = Paint.Align.RIGHT;
                }
                this.r0.a.getFontMetrics(this.n0);
                Paint.FontMetrics fontMetrics = this.n0;
                pointF.y = bounds.centerY() - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            RectF rectF4 = this.o0;
            rectF4.setEmpty();
            if (this.L != null) {
                float C2 = C() + this.d0 + this.g0;
                float F = F() + this.k0 + this.h0;
                if (e.i.a.A(this) == 0) {
                    rectF4.left = bounds.left + C2;
                    rectF4.right = bounds.right - F;
                } else {
                    rectF4.left = bounds.left + F;
                    rectF4.right = bounds.right - C2;
                }
                rectF4.top = bounds.top;
                rectF4.bottom = bounds.bottom;
            }
            p pVar = this.r0;
            if (pVar.f5442f != null) {
                pVar.a.drawableState = getState();
                p pVar2 = this.r0;
                pVar2.f5442f.e(this.l0, pVar2.a, pVar2.b);
            }
            this.r0.a.setTextAlign(align);
            boolean z = Math.round(this.r0.a(this.L.toString())) > Math.round(this.o0.width());
            if (z) {
                i8 = canvas.save();
                canvas.clipRect(this.o0);
            } else {
                i8 = 0;
            }
            CharSequence charSequence = this.L;
            if (z && this.J0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.r0.a, this.o0.width(), this.J0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF2 = this.p0;
            i7 = 0;
            i6 = 255;
            i5 = i3;
            canvas.drawText(charSequence2, 0, length, pointF2.x, pointF2.y, this.r0.a);
            if (z) {
                canvas.restoreToCount(i8);
            }
        }
        if (s0()) {
            D(bounds, this.o0);
            RectF rectF5 = this.o0;
            float f12 = rectF5.left;
            float f13 = rectF5.top;
            canvas.translate(f12, f13);
            this.S.setBounds(i7, i7, (int) this.o0.width(), (int) this.o0.height());
            int[] iArr = f.h.b.c.w.b.a;
            this.T.setBounds(this.S.getBounds());
            this.T.jumpToCurrentState();
            this.T.draw(canvas);
            canvas.translate(-f12, -f13);
        }
        if (this.A0 < i6) {
            canvas.restoreToCount(i5);
        }
    }

    public void e0(float f2) {
        if (this.V != f2) {
            this.V = f2;
            invalidateSelf();
            if (s0()) {
                L();
            }
        }
    }

    public void f0(float f2) {
        if (this.i0 != f2) {
            this.i0 = f2;
            invalidateSelf();
            if (s0()) {
                L();
            }
        }
    }

    public boolean g0(int[] iArr) {
        if (Arrays.equals(this.F0, iArr)) {
            return false;
        }
        this.F0 = iArr;
        if (s0()) {
            return M(getState(), iArr);
        }
        return false;
    }

    @Override // f.h.b.c.y.g, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.A0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.B0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.G;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(F() + this.r0.a(this.L.toString()) + C() + this.d0 + this.g0 + this.h0 + this.k0), this.L0);
    }

    @Override // f.h.b.c.y.g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // f.h.b.c.y.g, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.M0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.H);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.G, this.H);
        }
        outline.setAlpha(this.A0 / 255.0f);
    }

    public void h0(ColorStateList colorStateList) {
        if (this.U != colorStateList) {
            this.U = colorStateList;
            if (s0()) {
                this.S.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void i0(boolean z) {
        if (this.R != z) {
            boolean s0 = s0();
            this.R = z;
            boolean s02 = s0();
            if (s0 != s02) {
                if (s02) {
                    A(this.S);
                } else {
                    t0(this.S);
                }
                invalidateSelf();
                L();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // f.h.b.c.y.g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        if (J(this.E) || J(this.F) || J(this.I)) {
            return true;
        }
        if (this.G0 && J(this.H0)) {
            return true;
        }
        f.h.b.c.v.b bVar = this.r0.f5442f;
        if ((bVar == null || (colorStateList = bVar.f5457j) == null || !colorStateList.isStateful()) ? false : true) {
            return true;
        }
        return (this.Y && this.Z != null && this.X) || K(this.N) || K(this.Z) || J(this.D0);
    }

    public void j0(float f2) {
        if (this.f0 != f2) {
            float C = C();
            this.f0 = f2;
            float C2 = C();
            invalidateSelf();
            if (C != C2) {
                L();
            }
        }
    }

    public void k0(float f2) {
        if (this.e0 != f2) {
            float C = C();
            this.e0 = f2;
            float C2 = C();
            invalidateSelf();
            if (C != C2) {
                L();
            }
        }
    }

    public void l0(ColorStateList colorStateList) {
        if (this.K != colorStateList) {
            this.K = colorStateList;
            this.H0 = this.G0 ? f.h.b.c.w.b.b(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public void m0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.L, charSequence)) {
            return;
        }
        this.L = charSequence;
        this.r0.f5440d = true;
        invalidateSelf();
        L();
    }

    public void n0(float f2) {
        if (this.h0 != f2) {
            this.h0 = f2;
            invalidateSelf();
            L();
        }
    }

    public void o0(float f2) {
        if (this.g0 != f2) {
            this.g0 = f2;
            invalidateSelf();
            L();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i2) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i2);
        if (r0()) {
            onLayoutDirectionChanged |= e.i.a.X(this.N, i2);
        }
        if (q0()) {
            onLayoutDirectionChanged |= e.i.a.X(this.Z, i2);
        }
        if (s0()) {
            onLayoutDirectionChanged |= e.i.a.X(this.S, i2);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i2) {
        boolean onLevelChange = super.onLevelChange(i2);
        if (r0()) {
            onLevelChange |= this.N.setLevel(i2);
        }
        if (q0()) {
            onLevelChange |= this.Z.setLevel(i2);
        }
        if (s0()) {
            onLevelChange |= this.S.setLevel(i2);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // f.h.b.c.y.g, android.graphics.drawable.Drawable, f.h.b.c.s.p.b
    public boolean onStateChange(int[] iArr) {
        if (this.M0) {
            super.onStateChange(iArr);
        }
        return M(iArr, this.F0);
    }

    public void p0(boolean z) {
        if (this.G0 != z) {
            this.G0 = z;
            this.H0 = z ? f.h.b.c.w.b.b(this.K) : null;
            onStateChange(getState());
        }
    }

    public final boolean q0() {
        return this.Y && this.Z != null && this.y0;
    }

    public final boolean r0() {
        return this.M && this.N != null;
    }

    public final boolean s0() {
        return this.R && this.S != null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // f.h.b.c.y.g, android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (this.A0 != i2) {
            this.A0 = i2;
            invalidateSelf();
        }
    }

    @Override // f.h.b.c.y.g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.B0 != colorFilter) {
            this.B0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // f.h.b.c.y.g, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.D0 != colorStateList) {
            this.D0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // f.h.b.c.y.g, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.E0 != mode) {
            this.E0 = mode;
            this.C0 = f.h.b.c.a.e1(this, this.D0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (r0()) {
            visible |= this.N.setVisible(z, z2);
        }
        if (q0()) {
            visible |= this.Z.setVisible(z, z2);
        }
        if (s0()) {
            visible |= this.S.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
