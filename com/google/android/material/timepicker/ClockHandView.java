package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.video_converter.video_compressor.R;
import e.i.j.z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ClockHandView extends View {
    public static final /* synthetic */ int u = 0;

    /* renamed from: f  reason: collision with root package name */
    public ValueAnimator f1244f;

    /* renamed from: g  reason: collision with root package name */
    public float f1245g;

    /* renamed from: h  reason: collision with root package name */
    public float f1246h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1247i;

    /* renamed from: j  reason: collision with root package name */
    public int f1248j;

    /* renamed from: k  reason: collision with root package name */
    public final List<c> f1249k;

    /* renamed from: l  reason: collision with root package name */
    public final int f1250l;

    /* renamed from: m  reason: collision with root package name */
    public final float f1251m;
    public final Paint n;
    public final RectF o;
    public final int p;
    public float q;
    public boolean r;
    public double s;
    public int t;

    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ClockHandView clockHandView = ClockHandView.this;
            int i2 = ClockHandView.u;
            clockHandView.c(floatValue, true);
        }
    }

    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {
        public b(ClockHandView clockHandView) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(float f2, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f1249k = new ArrayList();
        Paint paint = new Paint();
        this.n = paint;
        this.o = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.h.b.c.b.f5156i, R.attr.materialClockStyle, com.arthenica.ffmpegkit.R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.t = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f1250l = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.p = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f1251m = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f, false);
        this.f1248j = ViewConfiguration.get(context).getScaledTouchSlop();
        AtomicInteger atomicInteger = z.a;
        z.d.s(this, 2);
        obtainStyledAttributes.recycle();
    }

    public final int a(float f2, float f3) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f3 - (getHeight() / 2), f2 - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    public void b(float f2, boolean z) {
        ValueAnimator valueAnimator = this.f1244f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            c(f2, false);
            return;
        }
        float f3 = this.q;
        if (Math.abs(f3 - f2) > 180.0f) {
            if (f3 > 180.0f && f2 < 180.0f) {
                f2 += 360.0f;
            }
            if (f3 < 180.0f && f2 > 180.0f) {
                f3 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f3), Float.valueOf(f2));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
        this.f1244f = ofFloat;
        ofFloat.setDuration(200L);
        this.f1244f.addUpdateListener(new a());
        this.f1244f.addListener(new b(this));
        this.f1244f.start();
    }

    public final void c(float f2, boolean z) {
        float f3 = f2 % 360.0f;
        this.q = f3;
        this.s = Math.toRadians(f3 - 90.0f);
        float cos = (this.t * ((float) Math.cos(this.s))) + (getWidth() / 2);
        float sin = (this.t * ((float) Math.sin(this.s))) + (getHeight() / 2);
        RectF rectF = this.o;
        int i2 = this.f1250l;
        rectF.set(cos - i2, sin - i2, cos + i2, sin + i2);
        for (c cVar : this.f1249k) {
            cVar.a(f3, z);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        int height = getHeight() / 2;
        float width2 = getWidth() / 2;
        float f2 = height;
        this.n.setStrokeWidth(0.0f);
        canvas.drawCircle((this.t * ((float) Math.cos(this.s))) + width2, (this.t * ((float) Math.sin(this.s))) + f2, this.f1250l, this.n);
        double sin = Math.sin(this.s);
        double cos = Math.cos(this.s);
        this.n.setStrokeWidth(this.p);
        canvas.drawLine(width2, f2, width + ((int) (cos * r6)), height + ((int) (r6 * sin)), this.n);
        canvas.drawCircle(width2, f2, this.f1251m, this.n);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        b(this.q, false);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i2 = (int) (x - this.f1245g);
                int i3 = (int) (y - this.f1246h);
                this.f1247i = (i3 * i3) + (i2 * i2) > this.f1248j;
                z = this.r;
                if (actionMasked == 1) {
                }
            } else {
                z = false;
            }
            z2 = false;
        } else {
            this.f1245g = x;
            this.f1246h = y;
            this.f1247i = true;
            this.r = false;
            z = false;
            z2 = true;
        }
        boolean z4 = this.r;
        float a2 = a(x, y);
        boolean z5 = this.q != a2;
        if (!z2 || !z5) {
            if (z5 || z) {
                b(a2, false);
            }
            this.r = z4 | z3;
            return true;
        }
        z3 = true;
        this.r = z4 | z3;
        return true;
    }
}
