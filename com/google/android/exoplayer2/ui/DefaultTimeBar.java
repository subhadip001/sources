package com.google.android.exoplayer2.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import f.h.b.b.e2.j;
import f.h.b.b.e2.k;
import f.h.b.b.e2.n;
import f.h.b.b.g2.b0;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public class DefaultTimeBar extends View implements n {
    public final Formatter A;
    public final Runnable B;
    public final CopyOnWriteArraySet<n.a> C;
    public final Point D;
    public final float E;
    public int F;
    public long G;
    public int H;
    public Rect I;
    public ValueAnimator J;
    public float K;
    public boolean L;
    public long M;
    public long N;
    public long O;
    public long P;
    public int Q;
    public long[] R;
    public boolean[] S;

    /* renamed from: f  reason: collision with root package name */
    public final Rect f943f;

    /* renamed from: g  reason: collision with root package name */
    public final Rect f944g;

    /* renamed from: h  reason: collision with root package name */
    public final Rect f945h;

    /* renamed from: i  reason: collision with root package name */
    public final Rect f946i;

    /* renamed from: j  reason: collision with root package name */
    public final Paint f947j;

    /* renamed from: k  reason: collision with root package name */
    public final Paint f948k;

    /* renamed from: l  reason: collision with root package name */
    public final Paint f949l;

    /* renamed from: m  reason: collision with root package name */
    public final Paint f950m;
    public final Paint n;
    public final Paint o;
    public final Drawable p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final StringBuilder z;

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, attributeSet);
    }

    public static int c(float f2, int i2) {
        return (int) ((i2 * f2) + 0.5f);
    }

    private long getPositionIncrement() {
        long j2 = this.G;
        if (j2 == -9223372036854775807L) {
            long j3 = this.N;
            if (j3 == -9223372036854775807L) {
                return 0L;
            }
            return j3 / this.F;
        }
        return j2;
    }

    private String getProgressText() {
        return b0.t(this.z, this.A, this.O);
    }

    private long getScrubberPosition() {
        if (this.f944g.width() <= 0 || this.N == -9223372036854775807L) {
            return 0L;
        }
        return (this.f946i.width() * this.N) / this.f944g.width();
    }

    @Override // f.h.b.b.e2.n
    public void a(long[] jArr, boolean[] zArr, int i2) {
        j.c(i2 == 0 || !(jArr == null || zArr == null));
        this.Q = i2;
        this.R = jArr;
        this.S = zArr;
        h();
    }

    @Override // f.h.b.b.e2.n
    public void b(n.a aVar) {
        this.C.add(aVar);
    }

    public final void d(float f2) {
        Rect rect = this.f946i;
        Rect rect2 = this.f944g;
        rect.right = b0.h((int) f2, rect2.left, rect2.right);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        i();
    }

    public final boolean e(long j2) {
        long j3 = this.N;
        if (j3 <= 0) {
            return false;
        }
        long j4 = this.L ? this.M : this.O;
        long i2 = b0.i(j4 + j2, 0L, j3);
        if (i2 == j4) {
            return false;
        }
        if (!this.L) {
            f(i2);
        } else {
            j(i2);
        }
        h();
        return true;
    }

    public final void f(long j2) {
        this.M = j2;
        this.L = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<n.a> it = this.C.iterator();
        while (it.hasNext()) {
            it.next().f(this, j2);
        }
    }

    public final void g(boolean z) {
        removeCallbacks(this.B);
        this.L = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<n.a> it = this.C.iterator();
        while (it.hasNext()) {
            it.next().c(this, this.M, z);
        }
    }

    @Override // f.h.b.b.e2.n
    public long getPreferredUpdateDelay() {
        int width = (int) (this.f944g.width() / this.E);
        if (width != 0) {
            long j2 = this.N;
            if (j2 != 0 && j2 != -9223372036854775807L) {
                return j2 / width;
            }
        }
        return Long.MAX_VALUE;
    }

    public final void h() {
        this.f945h.set(this.f944g);
        this.f946i.set(this.f944g);
        long j2 = this.L ? this.M : this.O;
        if (this.N > 0) {
            int width = (int) ((this.f944g.width() * this.P) / this.N);
            Rect rect = this.f945h;
            Rect rect2 = this.f944g;
            rect.right = Math.min(rect2.left + width, rect2.right);
            int width2 = (int) ((this.f944g.width() * j2) / this.N);
            Rect rect3 = this.f946i;
            Rect rect4 = this.f944g;
            rect3.right = Math.min(rect4.left + width2, rect4.right);
        } else {
            Rect rect5 = this.f945h;
            int i2 = this.f944g.left;
            rect5.right = i2;
            this.f946i.right = i2;
        }
        invalidate(this.f943f);
    }

    public final void i() {
        Drawable drawable = this.p;
        if (drawable != null && drawable.isStateful() && this.p.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void j(long j2) {
        if (this.M == j2) {
            return;
        }
        this.M = j2;
        Iterator<n.a> it = this.C.iterator();
        while (it.hasNext()) {
            it.next().b(this, j2);
        }
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i2;
        canvas.save();
        int height = this.f944g.height();
        int centerY = this.f944g.centerY() - (height / 2);
        int i3 = height + centerY;
        if (this.N <= 0) {
            Rect rect = this.f944g;
            canvas.drawRect(rect.left, centerY, rect.right, i3, this.f949l);
        } else {
            Rect rect2 = this.f945h;
            int i4 = rect2.left;
            int i5 = rect2.right;
            int max = Math.max(Math.max(this.f944g.left, i5), this.f946i.right);
            int i6 = this.f944g.right;
            if (max < i6) {
                canvas.drawRect(max, centerY, i6, i3, this.f949l);
            }
            int max2 = Math.max(i4, this.f946i.right);
            if (i5 > max2) {
                canvas.drawRect(max2, centerY, i5, i3, this.f948k);
            }
            if (this.f946i.width() > 0) {
                Rect rect3 = this.f946i;
                canvas.drawRect(rect3.left, centerY, rect3.right, i3, this.f947j);
            }
            if (this.Q != 0) {
                long[] jArr = this.R;
                Objects.requireNonNull(jArr);
                boolean[] zArr = this.S;
                Objects.requireNonNull(zArr);
                int i7 = this.t / 2;
                for (int i8 = 0; i8 < this.Q; i8++) {
                    long i9 = b0.i(jArr[i8], 0L, this.N);
                    Rect rect4 = this.f944g;
                    int min = Math.min(rect4.width() - this.t, Math.max(0, ((int) ((this.f944g.width() * i9) / this.N)) - i7)) + rect4.left;
                    canvas.drawRect(min, centerY, min + this.t, i3, zArr[i8] ? this.n : this.f950m);
                }
            }
        }
        if (this.N > 0) {
            Rect rect5 = this.f946i;
            int h2 = b0.h(rect5.right, rect5.left, this.f944g.right);
            int centerY2 = this.f946i.centerY();
            Drawable drawable = this.p;
            if (drawable == null) {
                if (!this.L && !isFocused()) {
                    i2 = isEnabled() ? this.u : this.v;
                } else {
                    i2 = this.w;
                }
                canvas.drawCircle(h2, centerY2, (int) ((i2 * this.K) / 2.0f), this.o);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.K)) / 2;
                int intrinsicHeight = ((int) (this.p.getIntrinsicHeight() * this.K)) / 2;
                this.p.setBounds(h2 - intrinsicWidth, centerY2 - intrinsicHeight, h2 + intrinsicWidth, centerY2 + intrinsicHeight);
                this.p.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        if (!this.L || z) {
            return;
        }
        g(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.N <= 0) {
            return;
        }
        if (b0.a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            return;
        }
        accessibilityNodeInfo.addAction(4096);
        accessibilityNodeInfo.addAction(8192);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L30
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L27
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L27;
                default: goto L12;
            }
        L12:
            goto L30
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.e(r0)
            if (r0 == 0) goto L30
            java.lang.Runnable r5 = r4.B
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.B
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.L
            if (r0 == 0) goto L30
            r5 = 0
            r4.g(r5)
            return r3
        L30:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        Rect rect;
        int i8 = i4 - i2;
        int i9 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i8 - getPaddingRight();
        int i10 = this.x;
        if (this.s == 1) {
            i6 = (i9 - getPaddingBottom()) - this.r;
            int i11 = this.q;
            i7 = ((i9 - getPaddingBottom()) - i11) - Math.max(i10 - (i11 / 2), 0);
        } else {
            i6 = (i9 - this.r) / 2;
            i7 = (i9 - this.q) / 2;
        }
        this.f943f.set(paddingLeft, i6, paddingRight, this.r + i6);
        Rect rect2 = this.f944g;
        Rect rect3 = this.f943f;
        rect2.set(rect3.left + i10, i7, rect3.right - i10, this.q + i7);
        if (b0.a >= 29 && ((rect = this.I) == null || rect.width() != i8 || this.I.height() != i9)) {
            Rect rect4 = new Rect(0, 0, i8, i9);
            this.I = rect4;
            setSystemGestureExclusionRects(Collections.singletonList(rect4));
        }
        h();
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == 0) {
            size = this.r;
        } else if (mode != 1073741824) {
            size = Math.min(this.r, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i2), size);
        i();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        Drawable drawable = this.p;
        if (drawable != null) {
            if (b0.a >= 23 && drawable.setLayoutDirection(i2)) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r3 != 3) goto L32;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L88
            long r2 = r7.N
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto L88
        L11:
            android.graphics.Point r0 = r7.D
            float r2 = r8.getX()
            int r2 = (int) r2
            float r3 = r8.getY()
            int r3 = (int) r3
            r0.set(r2, r3)
            android.graphics.Point r0 = r7.D
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L6b
            r5 = 3
            if (r3 == r4) goto L5c
            r6 = 2
            if (r3 == r6) goto L36
            if (r3 == r5) goto L5c
            goto L88
        L36:
            boolean r8 = r7.L
            if (r8 == 0) goto L88
            int r8 = r7.y
            if (r0 >= r8) goto L48
            int r8 = r7.H
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r2 = r2 + r8
            float r8 = (float) r2
            r7.d(r8)
            goto L4e
        L48:
            r7.H = r2
            float r8 = (float) r2
            r7.d(r8)
        L4e:
            long r0 = r7.getScrubberPosition()
            r7.j(r0)
            r7.h()
            r7.invalidate()
            return r4
        L5c:
            boolean r0 = r7.L
            if (r0 == 0) goto L88
            int r8 = r8.getAction()
            if (r8 != r5) goto L67
            r1 = 1
        L67:
            r7.g(r1)
            return r4
        L6b:
            float r8 = (float) r2
            float r0 = (float) r0
            android.graphics.Rect r2 = r7.f943f
            int r3 = (int) r8
            int r0 = (int) r0
            boolean r0 = r2.contains(r3, r0)
            if (r0 == 0) goto L88
            r7.d(r8)
            long r0 = r7.getScrubberPosition()
            r7.f(r0)
            r7.h()
            r7.invalidate()
            return r4
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i2, Bundle bundle) {
        if (super.performAccessibilityAction(i2, bundle)) {
            return true;
        }
        if (this.N <= 0) {
            return false;
        }
        if (i2 == 8192) {
            if (e(-getPositionIncrement())) {
                g(false);
            }
        } else if (i2 != 4096) {
            return false;
        } else {
            if (e(getPositionIncrement())) {
                g(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i2) {
        this.f950m.setColor(i2);
        invalidate(this.f943f);
    }

    public void setBufferedColor(int i2) {
        this.f948k.setColor(i2);
        invalidate(this.f943f);
    }

    @Override // f.h.b.b.e2.n
    public void setBufferedPosition(long j2) {
        this.P = j2;
        h();
    }

    @Override // f.h.b.b.e2.n
    public void setDuration(long j2) {
        this.N = j2;
        if (this.L && j2 == -9223372036854775807L) {
            g(true);
        }
        h();
    }

    @Override // android.view.View, f.h.b.b.e2.n
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.L || z) {
            return;
        }
        g(true);
    }

    public void setKeyCountIncrement(int i2) {
        j.c(i2 > 0);
        this.F = i2;
        this.G = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j2) {
        j.c(j2 > 0);
        this.F = -1;
        this.G = j2;
    }

    public void setPlayedAdMarkerColor(int i2) {
        this.n.setColor(i2);
        invalidate(this.f943f);
    }

    public void setPlayedColor(int i2) {
        this.f947j.setColor(i2);
        invalidate(this.f943f);
    }

    @Override // f.h.b.b.e2.n
    public void setPosition(long j2) {
        this.O = j2;
        setContentDescription(getProgressText());
        h();
    }

    public void setScrubberColor(int i2) {
        this.o.setColor(i2);
        invalidate(this.f943f);
    }

    public void setUnplayedColor(int i2) {
        this.f949l.setColor(i2);
        invalidate(this.f943f);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i2, AttributeSet attributeSet2) {
        super(context, attributeSet, i2);
        this.f943f = new Rect();
        this.f944g = new Rect();
        this.f945h = new Rect();
        this.f946i = new Rect();
        Paint paint = new Paint();
        this.f947j = paint;
        Paint paint2 = new Paint();
        this.f948k = paint2;
        Paint paint3 = new Paint();
        this.f949l = paint3;
        Paint paint4 = new Paint();
        this.f950m = paint4;
        Paint paint5 = new Paint();
        this.n = paint5;
        Paint paint6 = new Paint();
        this.o = paint6;
        paint6.setAntiAlias(true);
        this.C = new CopyOnWriteArraySet<>();
        this.D = new Point();
        float f2 = context.getResources().getDisplayMetrics().density;
        this.E = f2;
        this.y = c(f2, -50);
        int c = c(f2, 4);
        int c2 = c(f2, 26);
        int c3 = c(f2, 4);
        int c4 = c(f2, 12);
        int c5 = c(f2, 0);
        int c6 = c(f2, 16);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, k.b, i2, 0);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(10);
                this.p = drawable;
                if (drawable != null) {
                    int i3 = b0.a;
                    if (i3 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i3 >= 23) {
                            drawable.setLayoutDirection(layoutDirection);
                        }
                    }
                    c2 = Math.max(drawable.getMinimumHeight(), c2);
                }
                this.q = obtainStyledAttributes.getDimensionPixelSize(3, c);
                this.r = obtainStyledAttributes.getDimensionPixelSize(12, c2);
                this.s = obtainStyledAttributes.getInt(2, 0);
                this.t = obtainStyledAttributes.getDimensionPixelSize(1, c3);
                this.u = obtainStyledAttributes.getDimensionPixelSize(11, c4);
                this.v = obtainStyledAttributes.getDimensionPixelSize(8, c5);
                this.w = obtainStyledAttributes.getDimensionPixelSize(9, c6);
                int i4 = obtainStyledAttributes.getInt(6, -1);
                int i5 = obtainStyledAttributes.getInt(7, -1);
                int i6 = obtainStyledAttributes.getInt(4, -855638017);
                int i7 = obtainStyledAttributes.getInt(13, 872415231);
                int i8 = obtainStyledAttributes.getInt(0, -1291845888);
                int i9 = obtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i4);
                paint6.setColor(i5);
                paint2.setColor(i6);
                paint3.setColor(i7);
                paint4.setColor(i8);
                paint5.setColor(i9);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.q = c;
            this.r = c2;
            this.s = 0;
            this.t = c3;
            this.u = c4;
            this.v = c5;
            this.w = c6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.p = null;
        }
        StringBuilder sb = new StringBuilder();
        this.z = sb;
        this.A = new Formatter(sb, Locale.getDefault());
        this.B = new Runnable() { // from class: f.h.b.b.e2.b
            @Override // java.lang.Runnable
            public final void run() {
                DefaultTimeBar.this.g(false);
            }
        };
        Drawable drawable2 = this.p;
        if (drawable2 != null) {
            this.x = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.x = (Math.max(this.v, Math.max(this.u, this.w)) + 1) / 2;
        }
        this.K = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.J = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: f.h.b.b.e2.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                DefaultTimeBar defaultTimeBar = DefaultTimeBar.this;
                Objects.requireNonNull(defaultTimeBar);
                defaultTimeBar.K = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                defaultTimeBar.invalidate(defaultTimeBar.f943f);
            }
        });
        this.N = -9223372036854775807L;
        this.G = -9223372036854775807L;
        this.F = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
