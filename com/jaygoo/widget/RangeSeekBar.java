package com.jaygoo.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import f.j.a.e;
import f.k.a.a;
import f.k.a.b;
import f.k.a.c;
import f.k.a.d;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class RangeSeekBar extends View {
    public int A;
    public int B;
    public float C;
    public float D;
    public float E;
    public int F;
    public boolean G;
    public int H;
    public float I;
    public float J;
    public boolean K;
    public float L;
    public float M;
    public boolean N;
    public Paint O;
    public RectF P;
    public RectF Q;
    public Rect R;
    public RectF S;
    public Rect T;
    public c U;
    public c V;
    public c W;
    public Bitmap a0;
    public Bitmap b0;
    public List<Bitmap> c0;
    public int d0;
    public a e0;

    /* renamed from: f  reason: collision with root package name */
    public int f1309f;

    /* renamed from: g  reason: collision with root package name */
    public int f1310g;

    /* renamed from: h  reason: collision with root package name */
    public int f1311h;

    /* renamed from: i  reason: collision with root package name */
    public int f1312i;

    /* renamed from: j  reason: collision with root package name */
    public int f1313j;

    /* renamed from: k  reason: collision with root package name */
    public int f1314k;

    /* renamed from: l  reason: collision with root package name */
    public int f1315l;

    /* renamed from: m  reason: collision with root package name */
    public int f1316m;
    public int n;
    public int o;
    public int p;
    public int q;
    public CharSequence[] r;
    public float s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public float z;

    public RangeSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = true;
        this.N = false;
        this.O = new Paint();
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new Rect();
        this.S = new RectF();
        this.T = new Rect();
        this.c0 = new ArrayList();
        try {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b.a);
            this.f1313j = obtainStyledAttributes.getInt(18, 2);
            this.I = obtainStyledAttributes.getFloat(16, 0.0f);
            this.J = obtainStyledAttributes.getFloat(15, 100.0f);
            this.z = obtainStyledAttributes.getFloat(17, 0.0f);
            this.A = obtainStyledAttributes.getInt(0, 0);
            this.t = obtainStyledAttributes.getColor(19, -11806366);
            this.s = (int) obtainStyledAttributes.getDimension(24, -1.0f);
            this.u = obtainStyledAttributes.getColor(20, -2631721);
            this.v = obtainStyledAttributes.getResourceId(21, 0);
            this.w = obtainStyledAttributes.getResourceId(22, 0);
            this.x = (int) obtainStyledAttributes.getDimension(23, e.b(getContext(), 2.0f));
            this.f1314k = obtainStyledAttributes.getInt(40, 0);
            this.n = obtainStyledAttributes.getInt(37, 1);
            this.o = obtainStyledAttributes.getInt(39, 0);
            this.r = obtainStyledAttributes.getTextArray(42);
            this.f1315l = (int) obtainStyledAttributes.getDimension(44, e.b(getContext(), 7.0f));
            this.f1316m = (int) obtainStyledAttributes.getDimension(45, e.b(getContext(), 12.0f));
            this.p = obtainStyledAttributes.getColor(43, this.u);
            this.q = obtainStyledAttributes.getColor(43, this.t);
            this.F = obtainStyledAttributes.getInt(31, 0);
            this.B = obtainStyledAttributes.getColor(26, -6447715);
            this.E = obtainStyledAttributes.getDimension(29, 0.0f);
            this.C = obtainStyledAttributes.getDimension(30, 0.0f);
            this.D = obtainStyledAttributes.getDimension(28, 0.0f);
            this.H = obtainStyledAttributes.getResourceId(27, 0);
            this.G = obtainStyledAttributes.getBoolean(25, true);
            obtainStyledAttributes.recycle();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.O.setStyle(Paint.Style.FILL);
        this.O.setColor(this.u);
        this.O.setTextSize(this.f1316m);
        this.U = new c(this, attributeSet, true);
        c cVar = new c(this, attributeSet, false);
        this.V = cVar;
        cVar.H = this.f1313j != 1;
        d();
    }

    public float a(float f2) {
        float f3 = 0.0f;
        if (this.W == null) {
            return 0.0f;
        }
        float progressLeft = ((f2 - getProgressLeft()) * 1.0f) / this.y;
        if (f2 >= getProgressLeft()) {
            f3 = f2 > ((float) getProgressRight()) ? 1.0f : progressLeft;
        }
        if (this.f1313j == 2) {
            c cVar = this.W;
            c cVar2 = this.U;
            if (cVar == cVar2) {
                float f4 = this.V.x;
                float f5 = this.M;
                return f3 > f4 - f5 ? f4 - f5 : f3;
            } else if (cVar == this.V) {
                float f6 = cVar2.x;
                float f7 = this.M;
                return f3 < f6 + f7 ? f6 + f7 : f3;
            } else {
                return f3;
            }
        }
        return f3;
    }

    public final void b(boolean z) {
        c cVar;
        if (z && (cVar = this.W) != null) {
            c cVar2 = this.U;
            boolean z2 = cVar == cVar2;
            cVar2.G = z2;
            if (this.f1313j == 2) {
                this.V.G = !z2;
                return;
            }
            return;
        }
        this.U.G = false;
        if (this.f1313j == 2) {
            this.V.G = false;
        }
    }

    public final void c() {
        if (this.a0 == null) {
            this.a0 = e.d(getContext(), this.y, this.x, this.v);
        }
        if (this.b0 == null) {
            this.b0 = e.d(getContext(), this.y, this.x, this.w);
        }
    }

    public final void d() {
        if (i() && this.H != 0 && this.c0.isEmpty()) {
            Bitmap d2 = e.d(getContext(), (int) this.C, (int) this.D, this.H);
            for (int i2 = 0; i2 <= this.F; i2++) {
                this.c0.add(d2);
            }
        }
    }

    public final void e() {
        c cVar = this.W;
        if (cVar == null || cVar.s <= 1.0f || !this.N) {
            return;
        }
        this.N = false;
        cVar.P = cVar.q;
        cVar.Q = cVar.r;
        int progressBottom = cVar.I.getProgressBottom();
        int i2 = cVar.Q;
        int i3 = i2 / 2;
        cVar.v = progressBottom - i3;
        cVar.w = i3 + progressBottom;
        cVar.o(cVar.o, cVar.P, i2);
    }

    public final void f() {
        c cVar = this.W;
        if (cVar == null || cVar.s <= 1.0f || this.N) {
            return;
        }
        this.N = true;
        cVar.P = (int) cVar.i();
        cVar.Q = (int) cVar.h();
        int progressBottom = cVar.I.getProgressBottom();
        int i2 = cVar.Q;
        int i3 = i2 / 2;
        cVar.v = progressBottom - i3;
        cVar.w = i3 + progressBottom;
        cVar.o(cVar.o, cVar.P, i2);
    }

    public void g(float f2, float f3) {
        float min = Math.min(f2, f3);
        float max = Math.max(min, f3);
        float f4 = this.z;
        if (max - min < f4) {
            min = max - f4;
        }
        float f5 = this.I;
        if (min >= f5) {
            float f6 = this.J;
            if (max <= f6) {
                float f7 = f6 - f5;
                this.U.x = Math.abs(min - f5) / f7;
                if (this.f1313j == 2) {
                    this.V.x = Math.abs(max - this.I) / f7;
                }
                a aVar = this.e0;
                if (aVar != null) {
                    aVar.a(this, min, max, false);
                }
                invalidate();
                return;
            }
            throw new IllegalArgumentException("setProgress() max > (preset max - offsetValue) . #max:" + max + " #preset max:" + max);
        }
        throw new IllegalArgumentException("setProgress() min < (preset min - offsetValue) . #min:" + min + " #preset min:" + max);
    }

    public int getGravity() {
        return this.A;
    }

    public c getLeftSeekBar() {
        return this.U;
    }

    public float getMaxProgress() {
        return this.J;
    }

    public float getMinInterval() {
        return this.z;
    }

    public float getMinProgress() {
        return this.I;
    }

    public int getProgressBottom() {
        return this.f1310g;
    }

    public int getProgressColor() {
        return this.t;
    }

    public int getProgressDefaultColor() {
        return this.u;
    }

    public int getProgressDefaultDrawableId() {
        return this.w;
    }

    public int getProgressDrawableId() {
        return this.v;
    }

    public int getProgressHeight() {
        return this.x;
    }

    public int getProgressLeft() {
        return this.f1311h;
    }

    public int getProgressPaddingRight() {
        return this.d0;
    }

    public float getProgressRadius() {
        return this.s;
    }

    public int getProgressRight() {
        return this.f1312i;
    }

    public int getProgressTop() {
        return this.f1309f;
    }

    public int getProgressWidth() {
        return this.y;
    }

    public d[] getRangeSeekBarState() {
        d dVar = new d();
        float e2 = this.U.e();
        dVar.b = e2;
        dVar.a = String.valueOf(e2);
        if (e.a(dVar.b, this.I) == 0) {
            dVar.c = true;
        } else if (e.a(dVar.b, this.J) == 0) {
            dVar.f6607d = true;
        }
        d dVar2 = new d();
        if (this.f1313j == 2) {
            float e3 = this.V.e();
            dVar2.b = e3;
            dVar2.a = String.valueOf(e3);
            if (e.a(this.V.x, this.I) == 0) {
                dVar2.c = true;
            } else if (e.a(this.V.x, this.J) == 0) {
                dVar2.f6607d = true;
            }
        }
        return new d[]{dVar, dVar2};
    }

    public float getRawHeight() {
        if (this.f1313j == 1) {
            float f2 = this.U.f();
            if (this.o != 1 || this.r == null) {
                return f2;
            }
            return (this.x / 2.0f) + (f2 - (this.U.h() / 2.0f)) + Math.max((this.U.h() - this.x) / 2.0f, getTickMarkRawHeight());
        }
        float max = Math.max(this.U.f(), this.V.f());
        if (this.o != 1 || this.r == null) {
            return max;
        }
        float max2 = Math.max(this.U.h(), this.V.h());
        return (this.x / 2.0f) + (max - (max2 / 2.0f)) + Math.max((max2 - this.x) / 2.0f, getTickMarkRawHeight());
    }

    public c getRightSeekBar() {
        return this.V;
    }

    public int getSeekBarMode() {
        return this.f1313j;
    }

    public int getSteps() {
        return this.F;
    }

    public List<Bitmap> getStepsBitmaps() {
        return this.c0;
    }

    public int getStepsColor() {
        return this.B;
    }

    public int getStepsDrawableId() {
        return this.H;
    }

    public float getStepsHeight() {
        return this.D;
    }

    public float getStepsRadius() {
        return this.E;
    }

    public float getStepsWidth() {
        return this.C;
    }

    public int getTickMarkGravity() {
        return this.n;
    }

    public int getTickMarkInRangeTextColor() {
        return this.q;
    }

    public int getTickMarkLayoutGravity() {
        return this.o;
    }

    public int getTickMarkMode() {
        return this.f1314k;
    }

    public int getTickMarkRawHeight() {
        CharSequence[] charSequenceArr = this.r;
        if (charSequenceArr == null || charSequenceArr.length <= 0) {
            return 0;
        }
        return e.e(String.valueOf(charSequenceArr[0]), this.f1316m).height() + this.f1315l + 3;
    }

    public CharSequence[] getTickMarkTextArray() {
        return this.r;
    }

    public int getTickMarkTextColor() {
        return this.p;
    }

    public int getTickMarkTextMargin() {
        return this.f1315l;
    }

    public int getTickMarkTextSize() {
        return this.f1316m;
    }

    public void h(float f2, float f3, float f4) {
        if (f3 <= f2) {
            throw new IllegalArgumentException("setRange() max must be greater than min ! #max:" + f3 + " #min:" + f2);
        } else if (f4 < 0.0f) {
            throw new IllegalArgumentException("setRange() interval must be greater than zero ! #minInterval:" + f4);
        } else {
            float f5 = f3 - f2;
            if (f4 < f5) {
                this.J = f3;
                this.I = f2;
                this.z = f4;
                float f6 = f4 / f5;
                this.M = f6;
                if (this.f1313j == 2) {
                    c cVar = this.U;
                    float f7 = cVar.x;
                    if (f7 + f6 <= 1.0f) {
                        c cVar2 = this.V;
                        if (f7 + f6 > cVar2.x) {
                            cVar2.x = f7 + f6;
                        }
                    }
                    float f8 = this.V.x;
                    if (f8 - f6 >= 0.0f && f8 - f6 < f7) {
                        cVar.x = f8 - f6;
                    }
                }
                invalidate();
                return;
            }
            throw new IllegalArgumentException("setRange() interval must be less than (max - min) ! #minInterval:" + f4 + " #max - min:" + f5);
        }
    }

    public final boolean i() {
        return this.F >= 1 && this.D > 0.0f && this.C > 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDraw(android.graphics.Canvas r14) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jaygoo.widget.RangeSeekBar.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        float rawHeight;
        int makeMeasureSpec;
        float rawHeight2;
        float max;
        int size = View.MeasureSpec.getSize(i3);
        int mode = View.MeasureSpec.getMode(i3);
        if (mode == 1073741824) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, CommonUtils.BYTES_IN_A_GIGABYTE);
        } else if (mode == Integer.MIN_VALUE && (getParent() instanceof ViewGroup) && size == -1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((ViewGroup) getParent()).getMeasuredHeight(), Integer.MIN_VALUE);
        } else {
            if (this.A == 2) {
                if (this.r != null && this.o == 1) {
                    rawHeight2 = getRawHeight();
                    max = getTickMarkRawHeight();
                } else {
                    rawHeight2 = getRawHeight();
                    max = Math.max(this.U.h(), this.V.h()) / 2.0f;
                }
                rawHeight = (rawHeight2 - max) * 2.0f;
            } else {
                rawHeight = getRawHeight();
            }
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) rawHeight, CommonUtils.BYTES_IN_A_GIGABYTE);
        }
        super.onMeasure(i2, makeMeasureSpec);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        try {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            h(savedState.f1317f, savedState.f1318g, savedState.f1319h);
            g(savedState.f1321j, savedState.f1322k);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1317f = this.I;
        savedState.f1318g = this.J;
        savedState.f1319h = this.z;
        d[] rangeSeekBarState = getRangeSeekBarState();
        savedState.f1321j = rangeSeekBarState[0].b;
        savedState.f1322k = rangeSeekBarState[1].b;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        c cVar;
        super.onSizeChanged(i2, i3, i4, i5);
        int paddingBottom = (i3 - getPaddingBottom()) - getPaddingTop();
        if (i3 > 0) {
            int i6 = this.A;
            if (i6 == 0) {
                float max = (this.U.a == 1 && this.V.a == 1) ? 0.0f : Math.max(cVar.d(), this.V.d());
                float max2 = Math.max(this.U.h(), this.V.h());
                float f2 = this.x;
                float f3 = max2 - (f2 / 2.0f);
                this.f1309f = (int) f.a.b.a.a.b(f3, f2, 2.0f, max);
                if (this.r != null && this.o == 0) {
                    this.f1309f = (int) Math.max(getTickMarkRawHeight(), ((f3 - this.x) / 2.0f) + max);
                }
                this.f1310g = this.f1309f + this.x;
            } else if (i6 == 1) {
                if (this.r == null || this.o != 1) {
                    this.f1310g = (int) ((this.x / 2.0f) + (paddingBottom - (Math.max(this.U.h(), this.V.h()) / 2.0f)));
                } else {
                    this.f1310g = paddingBottom - getTickMarkRawHeight();
                }
                this.f1309f = this.f1310g - this.x;
            } else {
                int i7 = this.x;
                int i8 = (paddingBottom - i7) / 2;
                this.f1309f = i8;
                this.f1310g = i8 + i7;
            }
            int max3 = ((int) Math.max(this.U.i(), this.V.i())) / 2;
            this.f1311h = getPaddingLeft() + max3;
            int paddingRight = (i2 - max3) - getPaddingRight();
            this.f1312i = paddingRight;
            this.y = paddingRight - this.f1311h;
            this.P.set(getProgressLeft(), getProgressTop(), getProgressRight(), getProgressBottom());
            this.d0 = i2 - this.f1312i;
            if (this.s <= 0.0f) {
                this.s = (int) ((getProgressBottom() - getProgressTop()) * 0.45f);
            }
            c();
        }
        h(this.I, this.J, this.z);
        int progressTop = (getProgressTop() + getProgressBottom()) / 2;
        this.U.m(getProgressLeft(), progressTop);
        if (this.f1313j == 2) {
            this.V.m(getProgressLeft(), progressTop);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.K) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    if (i() && this.G) {
                        float a = a(motionEvent.getX());
                        float f2 = 1.0f / this.F;
                        this.W.p(new BigDecimal(a / f2).setScale(0, RoundingMode.HALF_UP).intValue() * f2);
                    }
                    if (this.f1313j == 2) {
                        this.V.n(false);
                    }
                    this.U.n(false);
                    this.W.l();
                    e();
                    if (this.e0 != null) {
                        d[] rangeSeekBarState = getRangeSeekBarState();
                        this.e0.a(this, rangeSeekBarState[0].b, rangeSeekBarState[1].b, false);
                    }
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    a aVar = this.e0;
                    if (aVar != null) {
                        aVar.c(this, this.W == this.U);
                    }
                    b(false);
                } else if (action == 2) {
                    float x = motionEvent.getX();
                    if (this.f1313j == 2 && this.U.x == this.V.x) {
                        this.W.l();
                        a aVar2 = this.e0;
                        if (aVar2 != null) {
                            aVar2.c(this, this.W == this.U);
                        }
                        if (x - this.L > 0.0f) {
                            c cVar = this.W;
                            if (cVar != this.V) {
                                cVar.n(false);
                                e();
                                this.W = this.V;
                            }
                        } else {
                            c cVar2 = this.W;
                            if (cVar2 != this.U) {
                                cVar2.n(false);
                                e();
                                this.W = this.U;
                            }
                        }
                        a aVar3 = this.e0;
                        if (aVar3 != null) {
                            aVar3.b(this, this.W == this.U);
                        }
                    }
                    f();
                    c cVar3 = this.W;
                    float f3 = cVar3.y;
                    cVar3.y = f3 < 1.0f ? 0.1f + f3 : 1.0f;
                    this.L = x;
                    cVar3.p(a(x));
                    this.W.n(true);
                    if (this.e0 != null) {
                        d[] rangeSeekBarState2 = getRangeSeekBarState();
                        this.e0.a(this, rangeSeekBarState2[0].b, rangeSeekBarState2[1].b, true);
                    }
                    invalidate();
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    b(true);
                } else if (action == 3) {
                    if (this.f1313j == 2) {
                        this.V.n(false);
                    }
                    c cVar4 = this.W;
                    if (cVar4 == this.U) {
                        e();
                    } else if (cVar4 == this.V) {
                        e();
                    }
                    this.U.n(false);
                    if (this.e0 != null) {
                        d[] rangeSeekBarState3 = getRangeSeekBarState();
                        this.e0.a(this, rangeSeekBarState3[0].b, rangeSeekBarState3[1].b, false);
                    }
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    b(false);
                }
                return super.onTouchEvent(motionEvent);
            }
            this.L = motionEvent.getX();
            motionEvent.getY();
            if (this.f1313j == 2) {
                if (this.V.x >= 1.0f && this.U.a(motionEvent.getX(), motionEvent.getY())) {
                    this.W = this.U;
                    f();
                } else if (this.V.a(motionEvent.getX(), motionEvent.getY())) {
                    this.W = this.V;
                    f();
                } else {
                    float progressLeft = ((this.L - getProgressLeft()) * 1.0f) / this.y;
                    if (Math.abs(this.U.x - progressLeft) < Math.abs(this.V.x - progressLeft)) {
                        this.W = this.U;
                    } else {
                        this.W = this.V;
                    }
                    this.W.p(a(this.L));
                }
            } else {
                this.W = this.U;
                f();
            }
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            a aVar4 = this.e0;
            if (aVar4 != null) {
                aVar4.b(this, this.W == this.U);
            }
            b(true);
            return true;
        }
        return true;
    }

    public void setEnableThumbOverlap(boolean z) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.K = z;
    }

    public void setGravity(int i2) {
        this.A = i2;
    }

    public void setIndicatorText(String str) {
        this.U.F = str;
        if (this.f1313j == 2) {
            this.V.F = str;
        }
    }

    public void setIndicatorTextDecimalFormat(String str) {
        c cVar = this.U;
        Objects.requireNonNull(cVar);
        cVar.O = new DecimalFormat(str);
        if (this.f1313j == 2) {
            c cVar2 = this.V;
            Objects.requireNonNull(cVar2);
            cVar2.O = new DecimalFormat(str);
        }
    }

    public void setIndicatorTextStringFormat(String str) {
        this.U.J = str;
        if (this.f1313j == 2) {
            this.V.J = str;
        }
    }

    public void setOnRangeChangedListener(a aVar) {
        this.e0 = aVar;
    }

    public void setProgress(float f2) {
        g(f2, this.J);
    }

    public void setProgressBottom(int i2) {
        this.f1310g = i2;
    }

    public void setProgressColor(int i2) {
        this.t = i2;
    }

    public void setProgressDefaultColor(int i2) {
        this.u = i2;
    }

    public void setProgressDefaultDrawableId(int i2) {
        this.w = i2;
        this.b0 = null;
        c();
    }

    public void setProgressDrawableId(int i2) {
        this.v = i2;
        this.a0 = null;
        c();
    }

    public void setProgressHeight(int i2) {
        this.x = i2;
    }

    public void setProgressLeft(int i2) {
        this.f1311h = i2;
    }

    public void setProgressRadius(float f2) {
        this.s = f2;
    }

    public void setProgressRight(int i2) {
        this.f1312i = i2;
    }

    public void setProgressTop(int i2) {
        this.f1309f = i2;
    }

    public void setProgressWidth(int i2) {
        this.y = i2;
    }

    public void setSeekBarMode(int i2) {
        this.f1313j = i2;
        this.V.H = i2 != 1;
    }

    public void setSteps(int i2) {
        this.F = i2;
    }

    public void setStepsAutoBonding(boolean z) {
        this.G = z;
    }

    public void setStepsBitmaps(List<Bitmap> list) {
        if (list != null && !list.isEmpty() && list.size() > this.F) {
            this.c0.clear();
            this.c0.addAll(list);
            return;
        }
        throw new IllegalArgumentException("stepsBitmaps must > steps !");
    }

    public void setStepsColor(int i2) {
        this.B = i2;
    }

    public void setStepsDrawable(List<Integer> list) {
        if (list != null && !list.isEmpty() && list.size() > this.F) {
            if (i()) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    arrayList.add(e.d(getContext(), (int) this.C, (int) this.D, list.get(i2).intValue()));
                }
                setStepsBitmaps(arrayList);
                return;
            }
            throw new IllegalArgumentException("stepsWidth must > 0, stepsHeight must > 0,steps must > 0 First!!");
        }
        throw new IllegalArgumentException("stepsDrawableIds must > steps !");
    }

    public void setStepsDrawableId(int i2) {
        this.c0.clear();
        this.H = i2;
        d();
    }

    public void setStepsHeight(float f2) {
        this.D = f2;
    }

    public void setStepsRadius(float f2) {
        this.E = f2;
    }

    public void setStepsWidth(float f2) {
        this.C = f2;
    }

    public void setTickMarkGravity(int i2) {
        this.n = i2;
    }

    public void setTickMarkInRangeTextColor(int i2) {
        this.q = i2;
    }

    public void setTickMarkLayoutGravity(int i2) {
        this.o = i2;
    }

    public void setTickMarkMode(int i2) {
        this.f1314k = i2;
    }

    public void setTickMarkTextArray(CharSequence[] charSequenceArr) {
        this.r = charSequenceArr;
    }

    public void setTickMarkTextColor(int i2) {
        this.p = i2;
    }

    public void setTickMarkTextMargin(int i2) {
        this.f1315l = i2;
    }

    public void setTickMarkTextSize(int i2) {
        this.f1316m = i2;
    }

    public void setTypeface(Typeface typeface) {
        this.O.setTypeface(typeface);
    }
}
