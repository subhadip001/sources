package f.h.b.c.s;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import e.i.h.d;
import e.i.j.z;
import f.h.b.c.s.o;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CollapsingTextHelper.java */
/* loaded from: classes.dex */
public final class e {
    public f.h.b.c.v.a A;
    public CharSequence B;
    public CharSequence C;
    public boolean D;
    public Bitmap E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int[] L;
    public boolean M;
    public final TextPaint N;
    public final TextPaint O;
    public TimeInterpolator P;
    public TimeInterpolator Q;
    public float R;
    public float S;
    public float T;
    public ColorStateList U;
    public float V;
    public float W;
    public float X;
    public StaticLayout Y;
    public float Z;
    public final View a;
    public float a0;
    public boolean b;
    public float b0;
    public float c;
    public CharSequence c0;

    /* renamed from: d  reason: collision with root package name */
    public float f5399d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f5400e;

    /* renamed from: f  reason: collision with root package name */
    public final Rect f5401f;

    /* renamed from: g  reason: collision with root package name */
    public final RectF f5402g;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f5407l;

    /* renamed from: m  reason: collision with root package name */
    public ColorStateList f5408m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public Typeface t;
    public Typeface u;
    public Typeface v;
    public Typeface w;
    public Typeface x;
    public Typeface y;
    public Typeface z;

    /* renamed from: h  reason: collision with root package name */
    public int f5403h = 16;

    /* renamed from: i  reason: collision with root package name */
    public int f5404i = 16;

    /* renamed from: j  reason: collision with root package name */
    public float f5405j = 15.0f;

    /* renamed from: k  reason: collision with root package name */
    public float f5406k = 15.0f;
    public int d0 = o.f5430m;

    public e(View view) {
        this.a = view;
        TextPaint textPaint = new TextPaint(129);
        this.N = textPaint;
        this.O = new TextPaint(textPaint);
        this.f5401f = new Rect();
        this.f5400e = new Rect();
        this.f5402g = new RectF();
        this.f5399d = 0.5f;
        i(view.getContext().getResources().getConfiguration());
    }

    public static int a(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb(Math.round((Color.alpha(i3) * f2) + (Color.alpha(i2) * f3)), Math.round((Color.red(i3) * f2) + (Color.red(i2) * f3)), Math.round((Color.green(i3) * f2) + (Color.green(i2) * f3)), Math.round((Color.blue(i3) * f2) + (Color.blue(i2) * f3)));
    }

    public static float h(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return f.h.b.c.c.a.a(f2, f3, f4);
    }

    public static boolean l(Rect rect, int i2, int i3, int i4, int i5) {
        return rect.left == i2 && rect.top == i3 && rect.right == i4 && rect.bottom == i5;
    }

    public final boolean b(CharSequence charSequence) {
        e.i.h.c cVar;
        View view = this.a;
        AtomicInteger atomicInteger = z.a;
        if (z.e.d(view) == 1) {
            cVar = e.i.h.d.f2507d;
        } else {
            cVar = e.i.h.d.c;
        }
        return ((d.c) cVar).b(charSequence, 0, charSequence.length());
    }

    public final void c(float f2) {
        this.f5402g.left = h(this.f5400e.left, this.f5401f.left, f2, this.P);
        this.f5402g.top = h(this.n, this.o, f2, this.P);
        this.f5402g.right = h(this.f5400e.right, this.f5401f.right, f2, this.P);
        this.f5402g.bottom = h(this.f5400e.bottom, this.f5401f.bottom, f2, this.P);
        this.r = h(this.p, this.q, f2, this.P);
        this.s = h(this.n, this.o, f2, this.P);
        q(f2);
        TimeInterpolator timeInterpolator = f.h.b.c.c.a.b;
        this.a0 = 1.0f - h(0.0f, 1.0f, 1.0f - f2, timeInterpolator);
        View view = this.a;
        AtomicInteger atomicInteger = z.a;
        z.d.k(view);
        this.b0 = h(1.0f, 0.0f, f2, timeInterpolator);
        z.d.k(this.a);
        ColorStateList colorStateList = this.f5408m;
        ColorStateList colorStateList2 = this.f5407l;
        if (colorStateList != colorStateList2) {
            this.N.setColor(a(g(colorStateList2), f(), f2));
        } else {
            this.N.setColor(f());
        }
        float f3 = this.V;
        float f4 = this.W;
        if (f3 != f4) {
            this.N.setLetterSpacing(h(f4, f3, f2, timeInterpolator));
        } else {
            this.N.setLetterSpacing(f3);
        }
        this.H = h(0.0f, this.R, f2, null);
        this.I = h(0.0f, this.S, f2, null);
        this.J = h(0.0f, this.T, f2, null);
        int a = a(g(null), g(this.U), f2);
        this.K = a;
        this.N.setShadowLayer(this.H, this.I, this.J, a);
        z.d.k(this.a);
    }

    public final void d(float f2, boolean z) {
        boolean z2;
        float f3;
        float f4;
        StaticLayout staticLayout;
        if (this.B == null) {
            return;
        }
        float width = this.f5401f.width();
        float width2 = this.f5400e.width();
        if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
            f3 = this.f5406k;
            f4 = this.V;
            this.F = 1.0f;
            Typeface typeface = this.z;
            Typeface typeface2 = this.t;
            if (typeface != typeface2) {
                this.z = typeface2;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            float f5 = this.f5405j;
            float f6 = this.W;
            Typeface typeface3 = this.z;
            Typeface typeface4 = this.w;
            if (typeface3 != typeface4) {
                this.z = typeface4;
                z2 = true;
            } else {
                z2 = false;
            }
            if (Math.abs(f2 - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = h(this.f5405j, this.f5406k, f2, this.Q) / this.f5405j;
            }
            float f7 = this.f5406k / this.f5405j;
            width = (!z && width2 * f7 > width) ? Math.min(width / f7, width2) : width2;
            f3 = f5;
            f4 = f6;
        }
        if (width > 0.0f) {
            z2 = ((this.G > f3 ? 1 : (this.G == f3 ? 0 : -1)) != 0) || ((this.X > f4 ? 1 : (this.X == f4 ? 0 : -1)) != 0) || this.M || z2;
            this.G = f3;
            this.X = f4;
            this.M = false;
        }
        if (this.C == null || z2) {
            this.N.setTextSize(this.G);
            this.N.setTypeface(this.z);
            this.N.setLetterSpacing(this.X);
            this.N.setLinearText(this.F != 1.0f);
            this.D = b(this.B);
            boolean z3 = this.D;
            try {
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                o oVar = new o(this.B, this.N, (int) width);
                oVar.f5439l = TextUtils.TruncateAt.END;
                oVar.f5438k = z3;
                oVar.f5432e = alignment;
                oVar.f5437j = false;
                oVar.f5433f = 1;
                oVar.f5434g = 0.0f;
                oVar.f5435h = 1.0f;
                oVar.f5436i = this.d0;
                staticLayout = oVar.a();
            } catch (o.a e2) {
                Log.e("CollapsingTextHelper", e2.getCause().getMessage(), e2);
                staticLayout = null;
            }
            Objects.requireNonNull(staticLayout);
            this.Y = staticLayout;
            this.C = staticLayout.getText();
        }
    }

    public float e() {
        TextPaint textPaint = this.O;
        textPaint.setTextSize(this.f5406k);
        textPaint.setTypeface(this.t);
        textPaint.setLetterSpacing(this.V);
        return -this.O.ascent();
    }

    public int f() {
        return g(this.f5408m);
    }

    public final int g(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.L;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public void i(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.v;
            if (typeface != null) {
                this.u = f.h.b.c.a.H0(configuration, typeface);
            }
            Typeface typeface2 = this.y;
            if (typeface2 != null) {
                this.x = f.h.b.c.a.H0(configuration, typeface2);
            }
            Typeface typeface3 = this.u;
            if (typeface3 == null) {
                typeface3 = this.v;
            }
            this.t = typeface3;
            Typeface typeface4 = this.x;
            if (typeface4 == null) {
                typeface4 = this.y;
            }
            this.w = typeface4;
            k(true);
        }
    }

    public void j() {
        this.b = this.f5401f.width() > 0 && this.f5401f.height() > 0 && this.f5400e.width() > 0 && this.f5400e.height() > 0;
    }

    public void k(boolean z) {
        StaticLayout staticLayout;
        if ((this.a.getHeight() <= 0 || this.a.getWidth() <= 0) && !z) {
            return;
        }
        d(1.0f, z);
        CharSequence charSequence = this.C;
        if (charSequence != null && (staticLayout = this.Y) != null) {
            this.c0 = TextUtils.ellipsize(charSequence, this.N, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.c0;
        if (charSequence2 != null) {
            this.Z = this.N.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f5404i, this.D ? 1 : 0);
        int i2 = absoluteGravity & 112;
        if (i2 == 48) {
            this.o = this.f5401f.top;
        } else if (i2 != 80) {
            this.o = this.f5401f.centerY() - ((this.N.descent() - this.N.ascent()) / 2.0f);
        } else {
            this.o = this.N.ascent() + this.f5401f.bottom;
        }
        int i3 = absoluteGravity & 8388615;
        if (i3 == 1) {
            this.q = this.f5401f.centerX() - (this.Z / 2.0f);
        } else if (i3 != 5) {
            this.q = this.f5401f.left;
        } else {
            this.q = this.f5401f.right - this.Z;
        }
        d(0.0f, z);
        StaticLayout staticLayout2 = this.Y;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.Y;
        CharSequence charSequence3 = this.C;
        float measureText = charSequence3 != null ? this.N.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout4 = this.Y;
        if (staticLayout4 != null) {
            staticLayout4.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f5403h, this.D ? 1 : 0);
        int i4 = absoluteGravity2 & 112;
        if (i4 == 48) {
            this.n = this.f5400e.top;
        } else if (i4 != 80) {
            this.n = this.f5400e.centerY() - (height / 2.0f);
        } else {
            this.n = this.N.descent() + (this.f5400e.bottom - height);
        }
        int i5 = absoluteGravity2 & 8388615;
        if (i5 == 1) {
            this.p = this.f5400e.centerX() - (measureText / 2.0f);
        } else if (i5 != 5) {
            this.p = this.f5400e.left;
        } else {
            this.p = this.f5400e.right - measureText;
        }
        Bitmap bitmap = this.E;
        if (bitmap != null) {
            bitmap.recycle();
            this.E = null;
        }
        q(this.c);
        c(this.c);
    }

    public void m(ColorStateList colorStateList) {
        if (this.f5408m != colorStateList) {
            this.f5408m = colorStateList;
            k(false);
        }
    }

    public void n(int i2) {
        if (this.f5404i != i2) {
            this.f5404i = i2;
            k(false);
        }
    }

    public final boolean o(Typeface typeface) {
        f.h.b.c.v.a aVar = this.A;
        if (aVar != null) {
            aVar.c = true;
        }
        if (this.v != typeface) {
            this.v = typeface;
            Typeface H0 = f.h.b.c.a.H0(this.a.getContext().getResources().getConfiguration(), typeface);
            this.u = H0;
            if (H0 == null) {
                H0 = this.v;
            }
            this.t = H0;
            return true;
        }
        return false;
    }

    public void p(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.c) {
            this.c = f2;
            c(f2);
        }
    }

    public final void q(float f2) {
        d(f2, false);
        View view = this.a;
        AtomicInteger atomicInteger = z.a;
        z.d.k(view);
    }

    public void r(Typeface typeface) {
        boolean z;
        boolean o = o(typeface);
        if (this.y != typeface) {
            this.y = typeface;
            Typeface H0 = f.h.b.c.a.H0(this.a.getContext().getResources().getConfiguration(), typeface);
            this.x = H0;
            if (H0 == null) {
                H0 = this.y;
            }
            this.w = H0;
            z = true;
        } else {
            z = false;
        }
        if (o || z) {
            k(false);
        }
    }

    public final boolean s() {
        return false;
    }
}
