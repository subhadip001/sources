package f.h.b.c.r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.PathInterpolator;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.video_converter.video_compressor.R;
import e.i.j.z;
import f.h.b.c.s.n;
import f.h.b.c.y.g;
import f.h.b.c.y.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes.dex */
public class e {
    public static final TimeInterpolator D = f.h.b.c.c.a.c;
    public static final int[] E = {16842919, 16842910};
    public static final int[] F = {16843623, 16842908, 16842910};
    public static final int[] G = {16842908, 16842910};
    public static final int[] H = {16843623, 16842910};
    public static final int[] I = {16842910};
    public static final int[] J = new int[0];
    public ViewTreeObserver.OnPreDrawListener C;
    public j a;
    public f.h.b.c.y.g b;
    public Drawable c;

    /* renamed from: d  reason: collision with root package name */
    public f.h.b.c.r.a f5374d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f5375e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5376f;

    /* renamed from: h  reason: collision with root package name */
    public float f5378h;

    /* renamed from: i  reason: collision with root package name */
    public float f5379i;

    /* renamed from: j  reason: collision with root package name */
    public float f5380j;

    /* renamed from: k  reason: collision with root package name */
    public int f5381k;

    /* renamed from: l  reason: collision with root package name */
    public final n f5382l;

    /* renamed from: m  reason: collision with root package name */
    public Animator f5383m;
    public f.h.b.c.c.g n;
    public f.h.b.c.c.g o;
    public float p;
    public int r;
    public ArrayList<Animator.AnimatorListener> t;
    public ArrayList<Animator.AnimatorListener> u;
    public ArrayList<f> v;
    public final FloatingActionButton w;
    public final f.h.b.c.x.b x;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5377g = true;
    public float q = 1.0f;
    public int s = 0;
    public final Rect y = new Rect();
    public final RectF z = new RectF();
    public final RectF A = new RectF();
    public final Matrix B = new Matrix();

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes.dex */
    public class a extends f.h.b.c.c.f {
        public a() {
        }

        @Override // android.animation.TypeEvaluator
        public Matrix evaluate(float f2, Matrix matrix, Matrix matrix2) {
            e.this.q = f2;
            matrix.getValues(this.a);
            matrix2.getValues(this.b);
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.b;
                float f3 = fArr[i2];
                float[] fArr2 = this.a;
                fArr[i2] = ((f3 - fArr2[i2]) * f2) + fArr2[i2];
            }
            this.c.setValues(this.b);
            return this.c;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ float a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ float f5385d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ float f5386e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ float f5387f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ float f5388g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Matrix f5389h;

        public b(float f2, float f3, float f4, float f5, float f6, float f7, float f8, Matrix matrix) {
            this.a = f2;
            this.b = f3;
            this.c = f4;
            this.f5385d = f5;
            this.f5386e = f6;
            this.f5387f = f7;
            this.f5388g = f8;
            this.f5389h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            e.this.w.setAlpha(f.h.b.c.c.a.b(this.a, this.b, 0.0f, 0.2f, floatValue));
            e.this.w.setScaleX(f.h.b.c.c.a.a(this.c, this.f5385d, floatValue));
            e.this.w.setScaleY(f.h.b.c.c.a.a(this.f5386e, this.f5385d, floatValue));
            e.this.q = f.h.b.c.c.a.a(this.f5387f, this.f5388g, floatValue);
            e.this.a(f.h.b.c.c.a.a(this.f5387f, this.f5388g, floatValue), this.f5389h);
            e.this.w.setImageMatrix(this.f5389h);
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes.dex */
    public class c extends i {
        public c(e eVar) {
            super(null);
        }

        @Override // f.h.b.c.r.e.i
        public float a() {
            return 0.0f;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes.dex */
    public class d extends i {
        public d() {
            super(null);
        }

        @Override // f.h.b.c.r.e.i
        public float a() {
            e eVar = e.this;
            return eVar.f5378h + eVar.f5379i;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: f.h.b.c.r.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0125e extends i {
        public C0125e() {
            super(null);
        }

        @Override // f.h.b.c.r.e.i
        public float a() {
            e eVar = e.this;
            return eVar.f5378h + eVar.f5380j;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes.dex */
    public interface f {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes.dex */
    public interface g {
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes.dex */
    public class h extends i {
        public h() {
            super(null);
        }

        @Override // f.h.b.c.r.e.i
        public float a() {
            return e.this.f5378h;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes.dex */
    public abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public boolean a;
        public float b;
        public float c;

        public i(f.h.b.c.r.c cVar) {
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            e.this.y((int) this.c);
            this.a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.a) {
                f.h.b.c.y.g gVar = e.this.b;
                this.b = gVar == null ? 0.0f : gVar.f5480f.o;
                this.c = a();
                this.a = true;
            }
            e eVar = e.this;
            float f2 = this.b;
            eVar.y((int) ((valueAnimator.getAnimatedFraction() * (this.c - f2)) + f2));
        }
    }

    public e(FloatingActionButton floatingActionButton, f.h.b.c.x.b bVar) {
        this.w = floatingActionButton;
        this.x = bVar;
        n nVar = new n();
        this.f5382l = nVar;
        nVar.a(E, d(new C0125e()));
        nVar.a(F, d(new d()));
        nVar.a(G, d(new d()));
        nVar.a(H, d(new d()));
        nVar.a(I, d(new h()));
        nVar.a(J, d(new c(this)));
        this.p = floatingActionButton.getRotation();
    }

    public final void a(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.w.getDrawable();
        if (drawable == null || this.r == 0) {
            return;
        }
        RectF rectF = this.z;
        RectF rectF2 = this.A;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i2 = this.r;
        rectF2.set(0.0f, 0.0f, i2, i2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i3 = this.r;
        matrix.postScale(f2, f2, i3 / 2.0f, i3 / 2.0f);
    }

    public final AnimatorSet b(f.h.b.c.c.g gVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.w, View.ALPHA, f2);
        gVar.d("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.w, View.SCALE_X, f3);
        gVar.d("scale").a(ofFloat2);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 26) {
            ofFloat2.setEvaluator(new f.h.b.c.r.f(this));
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.w, View.SCALE_Y, f3);
        gVar.d("scale").a(ofFloat3);
        if (i2 == 26) {
            ofFloat3.setEvaluator(new f.h.b.c.r.f(this));
        }
        arrayList.add(ofFloat3);
        a(f4, this.B);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.w, new f.h.b.c.c.e(), new a(), new Matrix(this.B));
        gVar.d("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        f.h.b.c.a.K0(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f2, float f3, float f4) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b(this.w.getAlpha(), f2, this.w.getScaleX(), f3, this.w.getScaleY(), this.q, f4, new Matrix(this.B)));
        arrayList.add(ofFloat);
        f.h.b.c.a.K0(animatorSet, arrayList);
        Context context = this.w.getContext();
        int integer = this.w.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1);
        TypedValue P0 = f.h.b.c.a.P0(context, R.attr.motionDurationLong1);
        if (P0 != null && P0.type == 16) {
            integer = P0.data;
        }
        animatorSet.setDuration(integer);
        Context context2 = this.w.getContext();
        TimeInterpolator timeInterpolator = f.h.b.c.c.a.b;
        TypedValue typedValue = new TypedValue();
        if (context2.getTheme().resolveAttribute(R.attr.motionEasingStandard, typedValue, true)) {
            if (typedValue.type == 3) {
                String valueOf = String.valueOf(typedValue.string);
                if (f.h.b.c.a.v0(valueOf, "cubic-bezier")) {
                    String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                    if (split.length == 4) {
                        timeInterpolator = new PathInterpolator(f.h.b.c.a.p0(split, 0), f.h.b.c.a.p0(split, 1), f.h.b.c.a.p0(split, 2), f.h.b.c.a.p0(split, 3));
                    } else {
                        StringBuilder A = f.a.b.a.a.A("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
                        A.append(split.length);
                        throw new IllegalArgumentException(A.toString());
                    }
                } else if (f.h.b.c.a.v0(valueOf, "path")) {
                    timeInterpolator = new PathInterpolator(e.i.a.v(valueOf.substring(5, valueOf.length() - 1)));
                } else {
                    throw new IllegalArgumentException(f.a.b.a.a.p("Invalid motion easing type: ", valueOf));
                }
            } else {
                throw new IllegalArgumentException("Motion easing theme attribute must be a string");
            }
        }
        animatorSet.setInterpolator(timeInterpolator);
        return animatorSet;
    }

    public final ValueAnimator d(i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(D);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public float e() {
        throw null;
    }

    public void f(Rect rect) {
        int sizeDimension = this.f5376f ? (this.f5381k - this.w.getSizeDimension()) / 2 : 0;
        float e2 = this.f5377g ? e() + this.f5380j : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil(e2));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(e2 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
        throw null;
    }

    public boolean h() {
        return this.w.getVisibility() == 0 ? this.s == 1 : this.s != 2;
    }

    public boolean i() {
        return this.w.getVisibility() != 0 ? this.s == 2 : this.s != 1;
    }

    public void j() {
        throw null;
    }

    public void k() {
        throw null;
    }

    public void l(int[] iArr) {
        throw null;
    }

    public void m(float f2, float f3, float f4) {
        throw null;
    }

    public void n() {
        ArrayList<f> arrayList = this.v;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void o() {
        ArrayList<f> arrayList = this.v;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public boolean p() {
        throw null;
    }

    public final void q(float f2) {
        this.q = f2;
        Matrix matrix = this.B;
        a(f2, matrix);
        this.w.setImageMatrix(matrix);
    }

    public void r(ColorStateList colorStateList) {
        throw null;
    }

    public final void s(j jVar) {
        this.a = jVar;
        f.h.b.c.y.g gVar = this.b;
        if (gVar != null) {
            gVar.f5480f.a = jVar;
            gVar.invalidateSelf();
        }
        Drawable drawable = this.c;
        if (drawable instanceof f.h.b.c.y.n) {
            ((f.h.b.c.y.n) drawable).setShapeAppearanceModel(jVar);
        }
        f.h.b.c.r.a aVar = this.f5374d;
        if (aVar != null) {
            aVar.o = jVar;
            aVar.invalidateSelf();
        }
    }

    public boolean t() {
        throw null;
    }

    public final boolean u() {
        FloatingActionButton floatingActionButton = this.w;
        AtomicInteger atomicInteger = z.a;
        return z.g.c(floatingActionButton) && !this.w.isInEditMode();
    }

    public final boolean v() {
        return !this.f5376f || this.w.getSizeDimension() >= this.f5381k;
    }

    public void w() {
        throw null;
    }

    public final void x() {
        Rect rect = this.y;
        f(rect);
        e.i.a.i(this.f5375e, "Didn't initialize content background");
        if (t()) {
            InsetDrawable insetDrawable = new InsetDrawable(this.f5375e, rect.left, rect.top, rect.right, rect.bottom);
            FloatingActionButton.b bVar = (FloatingActionButton.b) this.x;
            Objects.requireNonNull(bVar);
            super/*android.widget.ImageButton*/.setBackgroundDrawable(insetDrawable);
        } else {
            f.h.b.c.x.b bVar2 = this.x;
            Drawable drawable = this.f5375e;
            FloatingActionButton.b bVar3 = (FloatingActionButton.b) bVar2;
            Objects.requireNonNull(bVar3);
            if (drawable != null) {
                super/*android.widget.ImageButton*/.setBackgroundDrawable(drawable);
            }
        }
        f.h.b.c.x.b bVar4 = this.x;
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        FloatingActionButton.b bVar5 = (FloatingActionButton.b) bVar4;
        FloatingActionButton.this.r.set(i2, i3, i4, i5);
        FloatingActionButton floatingActionButton = FloatingActionButton.this;
        int i6 = floatingActionButton.o;
        floatingActionButton.setPadding(i2 + i6, i3 + i6, i4 + i6, i5 + i6);
    }

    public void y(float f2) {
        f.h.b.c.y.g gVar = this.b;
        if (gVar != null) {
            g.b bVar = gVar.f5480f;
            if (bVar.o != f2) {
                bVar.o = f2;
                gVar.z();
            }
        }
    }
}
