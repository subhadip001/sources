package f.k.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.jaygoo.widget.RangeSeekBar;
import com.video_converter.video_compressor.R;
import f.j.a.e;
import java.text.DecimalFormat;

/* compiled from: SeekBar.java */
/* loaded from: classes2.dex */
public class c {
    public boolean A;
    public Bitmap B;
    public Bitmap C;
    public Bitmap D;
    public ValueAnimator E;
    public String F;
    public RangeSeekBar I;
    public String J;
    public DecimalFormat O;
    public int P;
    public int Q;
    public int a;
    public int b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f6597d;

    /* renamed from: e  reason: collision with root package name */
    public int f6598e;

    /* renamed from: f  reason: collision with root package name */
    public int f6599f;

    /* renamed from: g  reason: collision with root package name */
    public int f6600g;

    /* renamed from: h  reason: collision with root package name */
    public int f6601h;

    /* renamed from: i  reason: collision with root package name */
    public float f6602i;

    /* renamed from: j  reason: collision with root package name */
    public int f6603j;

    /* renamed from: k  reason: collision with root package name */
    public int f6604k;

    /* renamed from: l  reason: collision with root package name */
    public int f6605l;

    /* renamed from: m  reason: collision with root package name */
    public int f6606m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public float s;
    public int t;
    public int u;
    public int v;
    public int w;
    public float x;
    public boolean z;
    public float y = 0.0f;
    public boolean G = false;
    public boolean H = true;
    public Path K = new Path();
    public Rect L = new Rect();
    public Rect M = new Rect();
    public Paint N = new Paint(1);

    /* compiled from: SeekBar.java */
    /* loaded from: classes2.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            c.this.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            RangeSeekBar rangeSeekBar = c.this.I;
            if (rangeSeekBar != null) {
                rangeSeekBar.invalidate();
            }
        }
    }

    /* compiled from: SeekBar.java */
    /* loaded from: classes2.dex */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c cVar = c.this;
            cVar.y = 0.0f;
            RangeSeekBar rangeSeekBar = cVar.I;
            if (rangeSeekBar != null) {
                rangeSeekBar.invalidate();
            }
        }
    }

    public c(RangeSeekBar rangeSeekBar, AttributeSet attributeSet, boolean z) {
        this.I = rangeSeekBar;
        this.A = z;
        TypedArray obtainStyledAttributes = c().obtainStyledAttributes(attributeSet, f.k.a.b.a);
        if (obtainStyledAttributes != null) {
            this.f6597d = (int) obtainStyledAttributes.getDimension(5, 0.0f);
            this.f6598e = obtainStyledAttributes.getResourceId(3, 0);
            this.a = obtainStyledAttributes.getInt(11, 1);
            this.b = obtainStyledAttributes.getLayoutDimension(4, -1);
            this.c = obtainStyledAttributes.getLayoutDimension(14, -1);
            this.f6600g = (int) obtainStyledAttributes.getDimension(13, e.b(c(), 14.0f));
            this.f6601h = obtainStyledAttributes.getColor(12, -1);
            this.f6603j = obtainStyledAttributes.getColor(2, e.i.c.a.getColor(c(), R.color.colorAccent));
            this.f6604k = (int) obtainStyledAttributes.getDimension(7, 0.0f);
            this.f6605l = (int) obtainStyledAttributes.getDimension(8, 0.0f);
            this.f6606m = (int) obtainStyledAttributes.getDimension(9, 0.0f);
            this.n = (int) obtainStyledAttributes.getDimension(6, 0.0f);
            this.f6599f = (int) obtainStyledAttributes.getDimension(1, 0.0f);
            this.o = obtainStyledAttributes.getResourceId(32, R.drawable.rsb_default_thumb);
            this.p = obtainStyledAttributes.getResourceId(34, 0);
            this.q = (int) obtainStyledAttributes.getDimension(36, e.b(c(), 26.0f));
            this.r = (int) obtainStyledAttributes.getDimension(33, e.b(c(), 26.0f));
            this.s = obtainStyledAttributes.getFloat(35, 1.0f);
            this.f6602i = obtainStyledAttributes.getDimension(10, 0.0f);
            obtainStyledAttributes.recycle();
        }
        j();
        k();
    }

    public boolean a(float f2, float f3) {
        int progressWidth = (int) (this.I.getProgressWidth() * this.x);
        return f2 > ((float) (this.t + progressWidth)) && f2 < ((float) (this.u + progressWidth)) && f3 > ((float) this.v) && f3 < ((float) this.w);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(android.graphics.Canvas r15) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.k.a.c.b(android.graphics.Canvas):void");
    }

    public Context c() {
        return this.I.getContext();
    }

    public int d() {
        int i2;
        int i3 = this.b;
        if (i3 > 0) {
            if (this.D != null) {
                i2 = this.f6597d;
            } else {
                i3 += this.f6599f;
                i2 = this.f6597d;
            }
        } else if (this.D != null) {
            i3 = e.e("8", this.f6600g).height() + this.f6606m + this.n;
            i2 = this.f6597d;
        } else {
            i3 = e.e("8", this.f6600g).height() + this.f6606m + this.n + this.f6597d;
            i2 = this.f6599f;
        }
        return i3 + i2;
    }

    public float e() {
        float maxProgress = this.I.getMaxProgress() - this.I.getMinProgress();
        return (maxProgress * this.x) + this.I.getMinProgress();
    }

    public float f() {
        return h() + this.b + this.f6599f + this.f6597d;
    }

    public Resources g() {
        if (c() != null) {
            return c().getResources();
        }
        return null;
    }

    public float h() {
        return this.r * this.s;
    }

    public float i() {
        return this.q * this.s;
    }

    public final void j() {
        int i2 = this.f6598e;
        if (i2 != 0) {
            this.f6598e = i2;
            this.D = BitmapFactory.decodeResource(g(), i2);
        }
        o(this.o, this.q, this.r);
        int i3 = this.p;
        int i4 = this.q;
        int i5 = this.r;
        if (i3 == 0 || g() == null) {
            return;
        }
        this.p = i3;
        this.C = e.c(i4, i5, g().getDrawable(i3, null));
    }

    public void k() {
        this.P = this.q;
        this.Q = this.r;
        if (this.b == -1) {
            this.b = e.e("8", this.f6600g).height() + this.f6606m + this.n;
        }
        if (this.f6599f <= 0) {
            this.f6599f = this.q / 4;
        }
    }

    public void l() {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, 0.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new a());
        this.E.addListener(new b());
        this.E.start();
    }

    public void m(int i2, int i3) {
        k();
        j();
        float f2 = i2;
        this.t = (int) (f2 - (i() / 2.0f));
        this.u = (int) ((i() / 2.0f) + f2);
        int i4 = this.r;
        this.v = i3 - (i4 / 2);
        this.w = (i4 / 2) + i3;
    }

    public void n(boolean z) {
        int i2 = this.a;
        if (i2 == 0) {
            this.z = z;
        } else if (i2 == 1) {
            this.z = false;
        } else if (i2 == 2 || i2 == 3) {
            this.z = true;
        }
    }

    public void o(int i2, int i3, int i4) {
        if (i2 == 0 || g() == null || i3 <= 0 || i4 <= 0) {
            return;
        }
        this.o = i2;
        this.B = e.c(i3, i4, g().getDrawable(i2, null));
    }

    public void p(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        this.x = f2;
    }
}
