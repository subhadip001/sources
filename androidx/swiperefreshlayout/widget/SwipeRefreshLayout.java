package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import e.i.j.l;
import e.i.j.m;
import e.i.j.n;
import e.i.j.o;
import e.i.j.p;
import e.i.j.z;
import e.z.b.d;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements o, n, l {
    public static final String Q = SwipeRefreshLayout.class.getSimpleName();
    public static final int[] R = {16842766};
    public int A;
    public int B;
    public int C;
    public int D;
    public e.z.b.d E;
    public Animation F;
    public Animation G;
    public Animation H;
    public Animation I;
    public boolean J;
    public int K;
    public g L;
    public boolean M;
    public Animation.AnimationListener N;
    public final Animation O;
    public final Animation P;

    /* renamed from: f  reason: collision with root package name */
    public View f576f;

    /* renamed from: g  reason: collision with root package name */
    public h f577g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f578h;

    /* renamed from: i  reason: collision with root package name */
    public int f579i;

    /* renamed from: j  reason: collision with root package name */
    public float f580j;

    /* renamed from: k  reason: collision with root package name */
    public float f581k;

    /* renamed from: l  reason: collision with root package name */
    public final p f582l;

    /* renamed from: m  reason: collision with root package name */
    public final m f583m;
    public final int[] n;
    public final int[] o;
    public final int[] p;
    public boolean q;
    public int r;
    public int s;
    public float t;
    public float u;
    public boolean v;
    public int w;
    public final DecelerateInterpolator x;
    public e.z.b.a y;
    public int z;

    /* loaded from: classes.dex */
    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            h hVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f578h) {
                swipeRefreshLayout.E.setAlpha(255);
                SwipeRefreshLayout.this.E.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.J && (hVar = swipeRefreshLayout2.f577g) != null) {
                    hVar.a();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.s = swipeRefreshLayout3.y.getTop();
                return;
            }
            swipeRefreshLayout.h();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes.dex */
    public class b extends Animation {
        public b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f2, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f2);
        }
    }

    /* loaded from: classes.dex */
    public class c extends Animation {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f586f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ int f587g;

        public c(int i2, int i3) {
            this.f586f = i2;
            this.f587g = i3;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f2, Transformation transformation) {
            e.z.b.d dVar = SwipeRefreshLayout.this.E;
            int i2 = this.f586f;
            dVar.setAlpha((int) (((this.f587g - i2) * f2) + i2));
        }
    }

    /* loaded from: classes.dex */
    public class d implements Animation.AnimationListener {
        public d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Objects.requireNonNull(SwipeRefreshLayout.this);
            SwipeRefreshLayout.this.r(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes.dex */
    public class e extends Animation {
        public e() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f2, Transformation transformation) {
            Objects.requireNonNull(SwipeRefreshLayout.this);
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int abs = swipeRefreshLayout.C - Math.abs(swipeRefreshLayout.B);
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i2 = swipeRefreshLayout2.A;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i2 + ((int) ((abs - i2) * f2))) - swipeRefreshLayout2.y.getTop());
            e.z.b.d dVar = SwipeRefreshLayout.this.E;
            float f3 = 1.0f - f2;
            d.a aVar = dVar.f3019f;
            if (f3 != aVar.p) {
                aVar.p = f3;
            }
            dVar.invalidateSelf();
        }
    }

    /* loaded from: classes.dex */
    public class f extends Animation {
        public f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f2, Transformation transformation) {
            SwipeRefreshLayout.this.f(f2);
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        boolean a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    /* loaded from: classes.dex */
    public interface h {
        void a();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f578h = false;
        this.f580j = -1.0f;
        this.n = new int[2];
        this.o = new int[2];
        this.p = new int[2];
        this.w = -1;
        this.z = -1;
        this.N = new a();
        this.O = new e();
        this.P = new f();
        this.f579i = ViewConfiguration.get(context).getScaledTouchSlop();
        this.r = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.x = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.K = (int) (displayMetrics.density * 40.0f);
        this.y = new e.z.b.a(getContext());
        e.z.b.d dVar = new e.z.b.d(getContext());
        this.E = dVar;
        dVar.c(1);
        this.y.setImageDrawable(this.E);
        this.y.setVisibility(8);
        addView(this.y);
        setChildrenDrawingOrderEnabled(true);
        int i2 = (int) (displayMetrics.density * 64.0f);
        this.C = i2;
        this.f580j = i2;
        this.f582l = new p();
        this.f583m = new m(this);
        setNestedScrollingEnabled(true);
        int i3 = -this.K;
        this.s = i3;
        this.B = i3;
        f(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void setColorViewAlpha(int i2) {
        this.y.getBackground().setAlpha(i2);
        e.z.b.d dVar = this.E;
        dVar.f3019f.t = i2;
        dVar.invalidateSelf();
    }

    public boolean a() {
        g gVar = this.L;
        if (gVar != null) {
            return gVar.a(this, this.f576f);
        }
        View view = this.f576f;
        if (view instanceof ListView) {
            return ((ListView) view).canScrollList(-1);
        }
        return view.canScrollVertically(-1);
    }

    public final void b() {
        if (this.f576f == null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (!childAt.equals(this.y)) {
                    this.f576f = childAt;
                    return;
                }
            }
        }
    }

    public final void c(float f2) {
        if (f2 > this.f580j) {
            i(true, true);
            return;
        }
        this.f578h = false;
        e.z.b.d dVar = this.E;
        d.a aVar = dVar.f3019f;
        aVar.f3026e = 0.0f;
        aVar.f3027f = 0.0f;
        dVar.invalidateSelf();
        d dVar2 = new d();
        this.A = this.s;
        this.P.reset();
        this.P.setDuration(200L);
        this.P.setInterpolator(this.x);
        e.z.b.a aVar2 = this.y;
        aVar2.f3014f = dVar2;
        aVar2.clearAnimation();
        this.y.startAnimation(this.P);
        e.z.b.d dVar3 = this.E;
        d.a aVar3 = dVar3.f3019f;
        if (aVar3.n) {
            aVar3.n = false;
        }
        dVar3.invalidateSelf();
    }

    public final boolean d(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return this.f583m.a(f2, f3, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f583m.b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.f583m.c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.f583m.e(i2, i3, i4, i5, iArr);
    }

    public final void e(float f2) {
        e.z.b.d dVar = this.E;
        d.a aVar = dVar.f3019f;
        if (!aVar.n) {
            aVar.n = true;
        }
        dVar.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f2 / this.f580j));
        float max = (((float) Math.max(min - 0.4d, (double) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)) * 5.0f) / 3.0f;
        float abs = Math.abs(f2) - this.f580j;
        int i2 = this.D;
        if (i2 <= 0) {
            i2 = this.C;
        }
        float f3 = i2;
        double max2 = Math.max(0.0f, Math.min(abs, f3 * 2.0f) / f3) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i3 = this.B + ((int) ((f3 * min) + (f3 * pow * 2.0f)));
        if (this.y.getVisibility() != 0) {
            this.y.setVisibility(0);
        }
        this.y.setScaleX(1.0f);
        this.y.setScaleY(1.0f);
        if (f2 < this.f580j) {
            if (this.E.f3019f.t > 76 && !d(this.H)) {
                this.H = p(this.E.f3019f.t, 76);
            }
        } else if (this.E.f3019f.t < 255 && !d(this.I)) {
            this.I = p(this.E.f3019f.t, 255);
        }
        e.z.b.d dVar2 = this.E;
        float min2 = Math.min(0.8f, max * 0.8f);
        d.a aVar2 = dVar2.f3019f;
        aVar2.f3026e = 0.0f;
        aVar2.f3027f = min2;
        dVar2.invalidateSelf();
        e.z.b.d dVar3 = this.E;
        float min3 = Math.min(1.0f, max);
        d.a aVar3 = dVar3.f3019f;
        if (min3 != aVar3.p) {
            aVar3.p = min3;
        }
        dVar3.invalidateSelf();
        e.z.b.d dVar4 = this.E;
        dVar4.f3019f.f3028g = ((pow * 2.0f) + ((max * 0.4f) - 0.25f)) * 0.5f;
        dVar4.invalidateSelf();
        setTargetOffsetTopAndBottom(i3 - this.s);
    }

    public void f(float f2) {
        int i2 = this.A;
        setTargetOffsetTopAndBottom((i2 + ((int) ((this.B - i2) * f2))) - this.y.getTop());
    }

    public final void g(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.w) {
            this.w = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        int i4 = this.z;
        return i4 < 0 ? i3 : i3 == i2 + (-1) ? i4 : i3 >= i4 ? i3 + 1 : i3;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f582l.a();
    }

    public int getProgressCircleDiameter() {
        return this.K;
    }

    public int getProgressViewEndOffset() {
        return this.C;
    }

    public int getProgressViewStartOffset() {
        return this.B;
    }

    public void h() {
        this.y.clearAnimation();
        this.E.stop();
        this.y.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.B - this.s);
        this.s = this.y.getTop();
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f583m.h(0);
    }

    public final void i(boolean z, boolean z2) {
        if (this.f578h != z) {
            this.J = z2;
            b();
            this.f578h = z;
            if (z) {
                int i2 = this.s;
                Animation.AnimationListener animationListener = this.N;
                this.A = i2;
                this.O.reset();
                this.O.setDuration(200L);
                this.O.setInterpolator(this.x);
                if (animationListener != null) {
                    this.y.f3014f = animationListener;
                }
                this.y.clearAnimation();
                this.y.startAnimation(this.O);
                return;
            }
            r(this.N);
        }
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f583m.f2543d;
    }

    @Override // e.i.j.o
    public void j(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (i6 != 0) {
            return;
        }
        int i7 = iArr[1];
        int[] iArr2 = this.o;
        if (i6 == 0) {
            this.f583m.d(i2, i3, i4, i5, iArr2, i6, iArr);
        }
        int i8 = i5 - (iArr[1] - i7);
        int i9 = i8 == 0 ? i5 + this.o[1] : i8;
        if (i9 >= 0 || a()) {
            return;
        }
        float abs = this.f581k + Math.abs(i9);
        this.f581k = abs;
        e(abs);
        iArr[1] = iArr[1] + i8;
    }

    @Override // e.i.j.n
    public void k(View view, int i2, int i3, int i4, int i5, int i6) {
        j(view, i2, i3, i4, i5, i6, this.p);
    }

    @Override // e.i.j.n
    public boolean l(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            return onStartNestedScroll(view, view2, i2);
        }
        return false;
    }

    @Override // e.i.j.n
    public void m(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // e.i.j.n
    public void n(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // e.i.j.n
    public void o(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b();
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || a() || this.f578h || this.q) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.w;
                    if (i2 == -1) {
                        Log.e(Q, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i2);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    q(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        g(motionEvent);
                    }
                }
            }
            this.v = false;
            this.w = -1;
        } else {
            setTargetOffsetTopAndBottom(this.B - this.y.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.w = pointerId;
            this.v = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.u = motionEvent.getY(findPointerIndex2);
        }
        return this.v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f576f == null) {
            b();
        }
        View view = this.f576f;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.y.getMeasuredWidth();
        int measuredHeight2 = this.y.getMeasuredHeight();
        int i6 = measuredWidth / 2;
        int i7 = measuredWidth2 / 2;
        int i8 = this.s;
        this.y.layout(i6 - i7, i8, i6 + i7, measuredHeight2 + i8);
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f576f == null) {
            b();
        }
        View view = this.f576f;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), CommonUtils.BYTES_IN_A_GIGABYTE), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), CommonUtils.BYTES_IN_A_GIGABYTE));
        this.y.measure(View.MeasureSpec.makeMeasureSpec(this.K, CommonUtils.BYTES_IN_A_GIGABYTE), View.MeasureSpec.makeMeasureSpec(this.K, CommonUtils.BYTES_IN_A_GIGABYTE));
        this.z = -1;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if (getChildAt(i4) == this.y) {
                this.z = i4;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        return dispatchNestedFling(f2, f3, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        if (i3 > 0) {
            float f2 = this.f581k;
            if (f2 > 0.0f) {
                float f3 = i3;
                if (f3 > f2) {
                    iArr[1] = (int) f2;
                    this.f581k = 0.0f;
                } else {
                    this.f581k = f2 - f3;
                    iArr[1] = i3;
                }
                e(this.f581k);
            }
        }
        int[] iArr2 = this.n;
        if (dispatchNestedPreScroll(i2 - iArr[0], i3 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        j(view, i2, i3, i4, i5, 0, this.p);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.f582l.a = i2;
        startNestedScroll(i2 & 2);
        this.f581k = 0.0f;
        this.q = true;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.f584f);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f578h);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return (!isEnabled() || this.f578h || (i2 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f582l.b(0);
        this.q = false;
        float f2 = this.f581k;
        if (f2 > 0.0f) {
            c(f2);
            this.f581k = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || a() || this.f578h || this.q) {
            return false;
        }
        if (actionMasked == 0) {
            this.w = motionEvent.getPointerId(0);
            this.v = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.w);
            if (findPointerIndex < 0) {
                Log.e(Q, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.v) {
                this.v = false;
                c((motionEvent.getY(findPointerIndex) - this.t) * 0.5f);
            }
            this.w = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.w);
            if (findPointerIndex2 < 0) {
                Log.e(Q, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y = motionEvent.getY(findPointerIndex2);
            q(y);
            if (this.v) {
                float f2 = (y - this.t) * 0.5f;
                if (f2 <= 0.0f) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                e(f2);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(Q, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.w = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                g(motionEvent);
            }
        }
        return true;
    }

    public final Animation p(int i2, int i3) {
        c cVar = new c(i2, i3);
        cVar.setDuration(300L);
        e.z.b.a aVar = this.y;
        aVar.f3014f = null;
        aVar.clearAnimation();
        this.y.startAnimation(cVar);
        return cVar;
    }

    public final void q(float f2) {
        float f3 = this.u;
        int i2 = this.f579i;
        if (f2 - f3 <= i2 || this.v) {
            return;
        }
        this.t = f3 + i2;
        this.v = true;
        this.E.setAlpha(76);
    }

    public void r(Animation.AnimationListener animationListener) {
        b bVar = new b();
        this.G = bVar;
        bVar.setDuration(150L);
        e.z.b.a aVar = this.y;
        aVar.f3014f = animationListener;
        aVar.clearAnimation();
        this.y.startAnimation(this.G);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent;
        View view = this.f576f;
        if (view != null) {
            AtomicInteger atomicInteger = z.a;
            if (!z.i.p(view)) {
                if (this.M || (parent = getParent()) == null) {
                    return;
                }
                parent.requestDisallowInterceptTouchEvent(z);
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f2) {
        this.y.setScaleX(f2);
        this.y.setScaleY(f2);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        b();
        e.z.b.d dVar = this.E;
        d.a aVar = dVar.f3019f;
        aVar.f3030i = iArr;
        aVar.a(0);
        dVar.f3019f.a(0);
        dVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = e.i.c.a.getColor(context, iArr[i2]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i2) {
        this.f580j = i2;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        h();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.M = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        m mVar = this.f583m;
        if (mVar.f2543d) {
            View view = mVar.c;
            AtomicInteger atomicInteger = z.a;
            z.i.z(view);
        }
        mVar.f2543d = z;
    }

    public void setOnChildScrollUpCallback(g gVar) {
        this.L = gVar;
    }

    public void setOnRefreshListener(h hVar) {
        this.f577g = hVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i2) {
        setProgressBackgroundColorSchemeResource(i2);
    }

    public void setProgressBackgroundColorSchemeColor(int i2) {
        this.y.setBackgroundColor(i2);
    }

    public void setProgressBackgroundColorSchemeResource(int i2) {
        setProgressBackgroundColorSchemeColor(e.i.c.a.getColor(getContext(), i2));
    }

    public void setRefreshing(boolean z) {
        if (z && this.f578h != z) {
            this.f578h = z;
            setTargetOffsetTopAndBottom((this.C + this.B) - this.s);
            this.J = false;
            Animation.AnimationListener animationListener = this.N;
            this.y.setVisibility(0);
            this.E.setAlpha(255);
            e.z.b.e eVar = new e.z.b.e(this);
            this.F = eVar;
            eVar.setDuration(this.r);
            if (animationListener != null) {
                this.y.f3014f = animationListener;
            }
            this.y.clearAnimation();
            this.y.startAnimation(this.F);
            return;
        }
        i(z, false);
    }

    public void setSize(int i2) {
        if (i2 == 0 || i2 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i2 == 0) {
                this.K = (int) (displayMetrics.density * 56.0f);
            } else {
                this.K = (int) (displayMetrics.density * 40.0f);
            }
            this.y.setImageDrawable(null);
            this.E.c(i2);
            this.y.setImageDrawable(this.E);
        }
    }

    public void setSlingshotDistance(int i2) {
        this.D = i2;
    }

    public void setTargetOffsetTopAndBottom(int i2) {
        this.y.bringToFront();
        z.p(this.y, i2);
        this.s = this.y.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return this.f583m.i(i2, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f583m.j(0);
    }

    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        public final boolean f584f;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.f584f = z;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.f584f ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f584f = parcel.readByte() != 0;
        }
    }
}
