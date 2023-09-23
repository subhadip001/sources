package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.appcompat.app.AlertController;
import com.google.android.gms.common.api.Api;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.video_converter.video_compressor.R;
import e.i.j.c;
import e.i.j.h0.d;
import e.i.j.l;
import e.i.j.m;
import e.i.j.o;
import e.i.j.p;
import e.i.j.z;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements o, l {
    public static final a F = new a();
    public static final int[] G = {16843130};
    public SavedState A;
    public final p B;
    public final m C;
    public float D;
    public b E;

    /* renamed from: f  reason: collision with root package name */
    public long f338f;

    /* renamed from: g  reason: collision with root package name */
    public final Rect f339g;

    /* renamed from: h  reason: collision with root package name */
    public OverScroller f340h;

    /* renamed from: i  reason: collision with root package name */
    public EdgeEffect f341i;

    /* renamed from: j  reason: collision with root package name */
    public EdgeEffect f342j;

    /* renamed from: k  reason: collision with root package name */
    public int f343k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f344l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f345m;
    public View n;
    public boolean o;
    public VelocityTracker p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public int v;
    public final int[] w;
    public final int[] x;
    public int y;
    public int z;

    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        public int f346f;

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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder A = f.a.b.a.a.A("HorizontalScrollView.SavedState{");
            A.append(Integer.toHexString(System.identityHashCode(this)));
            A.append(" scrollPosition=");
            return f.a.b.a.a.t(A, this.f346f, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f346f);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f346f = parcel.readInt();
        }
    }

    /* loaded from: classes.dex */
    public static class a extends c {
        @Override // e.i.j.c
        public void c(View view, AccessibilityEvent accessibilityEvent) {
            this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }

        @Override // e.i.j.c
        public void d(View view, d dVar) {
            int scrollRange;
            this.a.onInitializeAccessibilityNodeInfo(view, dVar.a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            dVar.a.setClassName(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            dVar.a.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                dVar.a(d.a.f2536i);
                dVar.a(d.a.f2540m);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                dVar.a(d.a.f2535h);
                dVar.a(d.a.n);
            }
        }

        @Override // e.i.j.c
        public boolean g(View view, int i2, Bundle bundle) {
            if (super.g(view, i2, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (nestedScrollView.isEnabled()) {
                if (i2 != 4096) {
                    if (i2 == 8192 || i2 == 16908344) {
                        int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (max != nestedScrollView.getScrollY()) {
                            nestedScrollView.z(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), 250, true);
                            return true;
                        }
                        return false;
                    } else if (i2 != 16908346) {
                        return false;
                    }
                }
                int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min != nestedScrollView.getScrollY()) {
                    nestedScrollView.z(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), 250, true);
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.nestedScrollViewStyle);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.f339g = new Rect();
        this.f344l = true;
        this.f345m = false;
        this.n = null;
        this.o = false;
        this.r = true;
        this.v = -1;
        this.w = new int[2];
        this.x = new int[2];
        if (e.i.a.I()) {
            edgeEffect = e.i.k.c.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f341i = edgeEffect;
        if (e.i.a.I()) {
            edgeEffect2 = e.i.k.c.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f342j = edgeEffect2;
        this.f340h = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.s = viewConfiguration.getScaledTouchSlop();
        this.t = viewConfiguration.getScaledMinimumFlingVelocity();
        this.u = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, G, R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.B = new p();
        this.C = new m(this);
        setNestedScrollingEnabled(true);
        z.w(this, F);
    }

    public static int c(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i4 ? i4 - i3 : i2;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.D == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.D = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.D;
    }

    public static boolean q(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && q((View) parent, view2);
    }

    public boolean A(int i2, int i3) {
        return this.C.i(i2, i3);
    }

    public final boolean B(MotionEvent motionEvent) {
        boolean z;
        if (e.i.a.z(this.f341i) != 0.0f) {
            e.i.a.R(this.f341i, 0.0f, motionEvent.getY() / getHeight());
            z = true;
        } else {
            z = false;
        }
        if (e.i.a.z(this.f342j) != 0.0f) {
            e.i.a.R(this.f342j, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            return true;
        }
        return z;
    }

    public final void a() {
        this.f340h.abortAnimation();
        this.C.j(1);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean b(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && r(findNextFocus, maxScrollAmount, getHeight())) {
            findNextFocus.getDrawingRect(this.f339g);
            offsetDescendantRectToMyCoords(findNextFocus, this.f339g);
            f(d(this.f339g));
            findNextFocus.requestFocus(i2);
        } else {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            f(maxScrollAmount);
        }
        if (findFocus != null && findFocus.isFocused() && (!r(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f340h.isFinished()) {
            return;
        }
        this.f340h.computeScrollOffset();
        int currY = this.f340h.getCurrY();
        int i2 = currY - this.z;
        this.z = currY;
        int[] iArr = this.x;
        boolean z = false;
        iArr[1] = 0;
        e(0, i2, iArr, null, 1);
        int i3 = i2 - this.x[1];
        int scrollRange = getScrollRange();
        if (i3 != 0) {
            int scrollY = getScrollY();
            u(0, i3, getScrollX(), scrollY, 0, scrollRange, 0, 0);
            int scrollY2 = getScrollY() - scrollY;
            int i4 = i3 - scrollY2;
            int[] iArr2 = this.x;
            iArr2[1] = 0;
            this.C.f(0, scrollY2, 0, i4, this.w, 1, iArr2);
            i3 = i4 - this.x[1];
        }
        if (i3 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z = true;
            }
            if (z) {
                if (i3 < 0) {
                    if (this.f341i.isFinished()) {
                        this.f341i.onAbsorb((int) this.f340h.getCurrVelocity());
                    }
                } else if (this.f342j.isFinished()) {
                    this.f342j.onAbsorb((int) this.f340h.getCurrVelocity());
                }
            }
            a();
        }
        if (!this.f340h.isFinished()) {
            AtomicInteger atomicInteger = z.a;
            z.d.k(this);
            return;
        }
        this.C.j(1);
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public int d(Rect rect) {
        int i2;
        int i3;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i5 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i4 - verticalFadingEdgeLength : i4;
        int i6 = rect.bottom;
        if (i6 > i5 && rect.top > scrollY) {
            if (rect.height() > height) {
                i3 = rect.top - scrollY;
            } else {
                i3 = rect.bottom - i5;
            }
            return Math.min(i3 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        } else if (rect.top >= scrollY || i6 >= i5) {
            return 0;
        } else {
            if (rect.height() > height) {
                i2 = 0 - (i5 - rect.bottom);
            } else {
                i2 = 0 - (scrollY - rect.top);
            }
            return Math.max(i2, -getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || g(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return this.C.a(f2, f3, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.C.b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return e(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.C.e(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i3 = 0;
        if (!this.f341i.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i2 = getPaddingLeft() + 0;
            } else {
                i2 = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i2, min);
            this.f341i.setSize(width, height);
            if (this.f341i.draw(canvas)) {
                AtomicInteger atomicInteger = z.a;
                z.d.k(this);
            }
            canvas.restoreToCount(save);
        }
        if (this.f342j.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i3 = 0 + getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i3 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f342j.setSize(width2, height2);
        if (this.f342j.draw(canvas)) {
            AtomicInteger atomicInteger2 = z.a;
            z.d.k(this);
        }
        canvas.restoreToCount(save2);
    }

    public boolean e(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return this.C.c(i2, i3, iArr, iArr2, i4);
    }

    public final void f(int i2) {
        if (i2 != 0) {
            if (this.r) {
                z(0, i2, 250, false);
            } else {
                scrollBy(0, i2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean g(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.g(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.B.a();
    }

    public int getScrollRange() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public void h(int i2) {
        if (getChildCount() > 0) {
            this.f340h.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, 0);
            w(true);
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return p(0);
    }

    public boolean i(int i2) {
        int childCount;
        boolean z = i2 == 130;
        int height = getHeight();
        Rect rect = this.f339g;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f339g.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f339g;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f339g;
        return x(i2, rect3.top, rect3.bottom);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.C.f2543d;
    }

    @Override // e.i.j.o
    public void j(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        s(i5, i6, iArr);
    }

    @Override // e.i.j.n
    public void k(View view, int i2, int i3, int i4, int i5, int i6) {
        s(i5, i6, null);
    }

    @Override // e.i.j.n
    public boolean l(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    @Override // e.i.j.n
    public void m(View view, View view2, int i2, int i3) {
        p pVar = this.B;
        if (i3 == 1) {
            pVar.b = i2;
        } else {
            pVar.a = i2;
        }
        A(2, i3);
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // e.i.j.n
    public void n(View view, int i2) {
        p pVar = this.B;
        if (i2 == 1) {
            pVar.b = 0;
        } else {
            pVar.a = 0;
        }
        this.C.j(i2);
    }

    @Override // e.i.j.n
    public void o(View view, int i2, int i3, int[] iArr, int i4) {
        e(i2, i3, iArr, null, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f345m = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.o) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fc  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        int i6 = 0;
        this.f344l = false;
        View view = this.n;
        if (view != null && q(view, this)) {
            y(this.n);
        }
        this.n = null;
        if (!this.f345m) {
            if (this.A != null) {
                scrollTo(getScrollX(), this.A.f346f);
                this.A = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i6 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int c = c(scrollY, paddingTop, i6);
            if (c != scrollY) {
                scrollTo(getScrollX(), c);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f345m = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.q && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, CommonUtils.BYTES_IN_A_GIGABYTE));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        h((int) f3);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        e(i2, i3, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        s(i5, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.B.a = i2;
        A(2, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i2, int i3, boolean z, boolean z2) {
        super.scrollTo(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        View findNextFocusFromRect;
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i2);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        }
        if (findNextFocusFromRect == null || (true ^ r(findNextFocusFromRect, 0, getHeight()))) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i2, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.A = savedState;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f346f = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        b bVar = this.E;
        if (bVar != null) {
            e.b.c.c cVar = (e.b.c.c) bVar;
            AlertController.c(this, cVar.a, cVar.b);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !r(findFocus, 0, i5)) {
            return;
        }
        findFocus.getDrawingRect(this.f339g);
        offsetDescendantRectToMyCoords(findFocus, this.f339g);
        f(d(this.f339g));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return (i2 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.B.a = 0;
        this.C.j(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0256  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r31) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean p(int i2) {
        return this.C.g(i2) != null;
    }

    public final boolean r(View view, int i2, int i3) {
        view.getDrawingRect(this.f339g);
        offsetDescendantRectToMyCoords(view, this.f339g);
        return this.f339g.bottom + i2 >= getScrollY() && this.f339g.top - i2 <= getScrollY() + i3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f344l) {
            y(view2);
        } else {
            this.n = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int d2 = d(rect);
        boolean z2 = d2 != 0;
        if (z2) {
            if (z) {
                scrollBy(0, d2);
            } else {
                z(0, d2, 250, false);
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            v();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f344l = true;
        super.requestLayout();
    }

    public final void s(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.C.d(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int c = c(i2, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int c2 = c(i3, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (c == getScrollX() && c2 == getScrollY()) {
                return;
            }
            super.scrollTo(c, c2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.q) {
            this.q = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        m mVar = this.C;
        if (mVar.f2543d) {
            View view = mVar.c;
            AtomicInteger atomicInteger = z.a;
            z.i.z(view);
        }
        mVar.f2543d = z;
    }

    public void setOnScrollChangeListener(b bVar) {
        this.E = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.r = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return this.C.i(i2, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.C.j(0);
    }

    public final void t(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.v) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f343k = (int) motionEvent.getY(i2);
            this.v = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.p;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean u(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r1 == 0) goto L2a
            if (r1 != r5) goto L28
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            if (r1 == 0) goto L34
            if (r1 != r5) goto L32
            if (r3 == 0) goto L32
            goto L34
        L32:
            r1 = 0
            goto L35
        L34:
            r1 = 1
        L35:
            int r3 = r15 + r13
            if (r2 != 0) goto L3b
            r2 = 0
            goto L3d
        L3b:
            r2 = r19
        L3d:
            int r6 = r16 + r14
            if (r1 != 0) goto L43
            r1 = 0
            goto L45
        L43:
            r1 = r20
        L45:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L50
            r3 = r2
        L4e:
            r2 = 1
            goto L55
        L50:
            if (r3 >= r7) goto L54
            r3 = r7
            goto L4e
        L54:
            r2 = 0
        L55:
            if (r6 <= r1) goto L5a
            r6 = r1
        L58:
            r1 = 1
            goto L5f
        L5a:
            if (r6 >= r8) goto L5e
            r6 = r8
            goto L58
        L5e:
            r1 = 0
        L5f:
            if (r1 == 0) goto L7e
            boolean r7 = r12.p(r5)
            if (r7 != 0) goto L7e
            android.widget.OverScroller r7 = r0.f340h
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L7e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L85
            if (r1 == 0) goto L86
        L85:
            r4 = 1
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.u(int, int, int, int, int, int, int, int):boolean");
    }

    public final void v() {
        VelocityTracker velocityTracker = this.p;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.p = null;
        }
    }

    public final void w(boolean z) {
        if (z) {
            A(2, 1);
        } else {
            this.C.j(1);
        }
        this.z = getScrollY();
        AtomicInteger atomicInteger = z.a;
        z.d.k(this);
    }

    public final boolean x(int i2, int i3, int i4) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z2 = i2 == 33;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = (View) focusables.get(i6);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i3 < bottom && top < i4) {
                boolean z4 = i3 < top && bottom < i4;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4) {
                            if (!z5) {
                            }
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else {
                        if (!z5) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i3 < scrollY || i4 > i5) {
            f(z2 ? i3 - scrollY : i4 - i5);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i2);
        }
        return z;
    }

    public final void y(View view) {
        view.getDrawingRect(this.f339g);
        offsetDescendantRectToMyCoords(view, this.f339g);
        int d2 = d(this.f339g);
        if (d2 != 0) {
            scrollBy(0, d2);
        }
    }

    public final void z(int i2, int i3, int i4, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f338f > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int scrollY = getScrollY();
            OverScroller overScroller = this.f340h;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i4);
            w(z);
        } else {
            if (!this.f340h.isFinished()) {
                a();
            }
            scrollBy(i2, i3);
        }
        this.f338f = AnimationUtils.currentAnimationTimeMillis();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
