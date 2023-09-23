package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.customview.view.AbsSavedState;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public static final int[] G = {16842931};
    public static final Comparator<c> H = new a();
    public static final g I = new g();
    public boolean A;
    public int B;
    public List<f> C;
    public f D;
    public List<e> E;
    public int F;

    /* renamed from: f  reason: collision with root package name */
    public int f592f;

    /* renamed from: g  reason: collision with root package name */
    public Parcelable f593g;

    /* renamed from: h  reason: collision with root package name */
    public ClassLoader f594h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f595i;

    /* renamed from: j  reason: collision with root package name */
    public int f596j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f597k;

    /* renamed from: l  reason: collision with root package name */
    public int f598l;

    /* renamed from: m  reason: collision with root package name */
    public int f599m;
    public int n;
    public boolean o;
    public boolean p;
    public int q;
    public boolean r;
    public boolean s;
    public int t;
    public float u;
    public float v;
    public float w;
    public float x;
    public int y;
    public VelocityTracker z;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public int f600h;

        /* renamed from: i  reason: collision with root package name */
        public Parcelable f601i;

        /* renamed from: j  reason: collision with root package name */
        public ClassLoader f602j;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder A = f.a.b.a.a.A("FragmentPager.SavedState{");
            A.append(Integer.toHexString(System.identityHashCode(this)));
            A.append(" position=");
            return f.a.b.a.a.t(A, this.f600h, "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f348f, i2);
            parcel.writeInt(this.f600h);
            parcel.writeParcelable(this.f601i, i2);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? SavedState.class.getClassLoader() : classLoader;
            this.f600h = parcel.readInt();
            this.f601i = parcel.readParcelable(classLoader);
            this.f602j = classLoader;
        }
    }

    /* loaded from: classes.dex */
    public static class a implements Comparator<c> {
        @Override // java.util.Comparator
        public int compare(c cVar, c cVar2) {
            Objects.requireNonNull(cVar);
            Objects.requireNonNull(cVar2);
            return 0;
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface b {
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    /* loaded from: classes.dex */
    public static class d extends ViewGroup.LayoutParams {
        public boolean a;
        public int b;
        public boolean c;

        public d() {
            super(-1, -1);
        }

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.G);
            this.b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(ViewPager viewPager, e.e0.a.a aVar, e.e0.a.a aVar2);
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(int i2);
    }

    /* loaded from: classes.dex */
    public static class g implements Comparator<View> {
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            boolean z = ((d) view.getLayoutParams()).a;
            if (z != ((d) view2.getLayoutParams()).a) {
                return z ? 1 : -1;
            }
            return 0;
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.p != z) {
            this.p = z;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(int r8) {
        /*
            r7 = this;
            android.view.View r0 = r7.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r7) goto La
            goto L63
        La:
            if (r0 == 0) goto L64
            android.view.ViewParent r4 = r0.getParent()
        L10:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L1d
            if (r4 != r7) goto L18
            r4 = 1
            goto L1e
        L18:
            android.view.ViewParent r4 = r4.getParent()
            goto L10
        L1d:
            r4 = 0
        L1e:
            if (r4 != 0) goto L64
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L34:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L4d
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L34
        L4d:
            java.lang.String r0 = "arrowScroll tried to find focus based on non-child current focused view "
            java.lang.StringBuilder r0 = f.a.b.a.a.A(r0)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
        L63:
            r0 = r3
        L64:
            android.view.FocusFinder r4 = android.view.FocusFinder.getInstance()
            android.view.View r4 = r4.findNextFocus(r7, r0, r8)
            r5 = 66
            r6 = 17
            if (r4 == 0) goto La9
            if (r4 == r0) goto La9
            if (r8 != r6) goto L91
            android.graphics.Rect r1 = r7.c(r3, r4)
            int r1 = r1.left
            android.graphics.Rect r2 = r7.c(r3, r0)
            int r2 = r2.left
            if (r0 == 0) goto L8b
            if (r1 < r2) goto L8b
            boolean r0 = r7.e()
            goto L8f
        L8b:
            boolean r0 = r4.requestFocus()
        L8f:
            r2 = r0
            goto Lb1
        L91:
            if (r8 != r5) goto Lb1
            android.graphics.Rect r1 = r7.c(r3, r4)
            int r1 = r1.left
            android.graphics.Rect r3 = r7.c(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto La4
            if (r1 > r3) goto La4
            goto Lb1
        La4:
            boolean r0 = r4.requestFocus()
            goto L8f
        La9:
            if (r8 == r6) goto Lad
            if (r8 != r1) goto Lb1
        Lad:
            boolean r2 = r7.e()
        Lb1:
            if (r2 == 0) goto Lba
            int r8 = android.view.SoundEffectConstants.getContantForFocusDirection(r8)
            r7.playSoundEffect(r8)
        Lba:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.a(int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                if (getChildAt(i4).getVisibility() == 0) {
                    throw null;
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2).getVisibility() == 0) {
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        d dVar = (d) layoutParams;
        boolean z = dVar.a | (view.getClass().getAnnotation(b.class) != null);
        dVar.a = z;
        if (!this.o) {
            super.addView(view, i2, layoutParams);
        } else if (!z) {
            dVar.c = true;
            addViewInLayout(view, i2, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public boolean b(View view, boolean z, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && b(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i2);
    }

    public final Rect c(Rect rect, View view) {
        Rect rect2 = new Rect();
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect2.left = viewGroup.getLeft() + rect2.left;
            rect2.right = viewGroup.getRight() + rect2.right;
            rect2.top = viewGroup.getTop() + rect2.top;
            rect2.bottom = viewGroup.getBottom() + rect2.bottom;
            parent = viewGroup.getParent();
        }
        return rect2;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f595i = true;
        throw null;
    }

    public final void d(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.y) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.u = motionEvent.getX(i2);
            this.y = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.z;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L59
            int r0 = r6.getAction()
            if (r0 != 0) goto L56
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L44
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L56
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.a(r4)
            goto L57
        L2b:
            boolean r6 = r6.hasModifiers(r2)
            if (r6 == 0) goto L56
            boolean r6 = r5.a(r2)
            goto L57
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L3d
            goto L56
        L3d:
            r6 = 66
            boolean r6 = r5.a(r6)
            goto L57
        L44:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L4f
            boolean r6 = r5.e()
            goto L57
        L4f:
            r6 = 17
            boolean r6 = r5.a(r6)
            goto L57
        L56:
            r6 = 0
        L57:
            if (r6 == 0) goto L5a
        L59:
            r1 = 1
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (getChildAt(i2).getVisibility() == 0) {
                throw null;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (getOverScrollMode() != 0) {
            throw null;
        }
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f597k;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public boolean e() {
        return false;
    }

    public void f() {
    }

    public final void g(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public e.e0.a.a getAdapter() {
        return null;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        throw null;
    }

    public int getCurrentItem() {
        return 0;
    }

    public int getOffscreenPageLimit() {
        return this.q;
    }

    public int getPageMargin() {
        return this.f596j;
    }

    public final boolean h() {
        this.y = -1;
        this.r = false;
        this.s = false;
        VelocityTracker velocityTracker = this.z;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.z = null;
        }
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f596j > 0 && this.f597k != null) {
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            h();
            throw null;
        }
        if (action != 0) {
            if (this.r) {
                return true;
            }
            if (this.s) {
                return false;
            }
        }
        if (action != 0) {
            if (action == 2) {
                int i2 = this.y;
                if (i2 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i2);
                    float x = motionEvent.getX(findPointerIndex);
                    float f2 = x - this.u;
                    float abs = Math.abs(f2);
                    float y = motionEvent.getY(findPointerIndex);
                    float abs2 = Math.abs(y - this.x);
                    int i3 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                    if (i3 != 0) {
                        float f3 = this.u;
                        if (!((f3 < ((float) this.t) && i3 > 0) || (f3 > ((float) (getWidth() - this.t)) && f2 < 0.0f)) && b(this, false, (int) f2, (int) x, (int) y)) {
                            this.u = x;
                            this.v = y;
                            this.s = true;
                            return false;
                        }
                    }
                    float f4 = 0;
                    if (abs > f4 && abs * 0.5f > abs2) {
                        this.r = true;
                        g(true);
                        setScrollState(1);
                        float f5 = this.w;
                        this.u = i3 > 0 ? f5 + f4 : f5 - f4;
                        this.v = y;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > f4) {
                        this.s = true;
                    }
                    if (this.r) {
                        this.u = x;
                        getScrollX();
                        getClientWidth();
                        throw null;
                    }
                }
            } else if (action == 6) {
                d(motionEvent);
            }
            if (this.z == null) {
                this.z = VelocityTracker.obtain();
            }
            this.z.addMovement(motionEvent);
            return this.r;
        }
        float x2 = motionEvent.getX();
        this.w = x2;
        this.u = x2;
        float y2 = motionEvent.getY();
        this.x = y2;
        this.v = y2;
        this.y = motionEvent.getPointerId(0);
        this.s = false;
        this.f595i = true;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        d dVar;
        d dVar2;
        int i4;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i2), ViewGroup.getDefaultSize(0, i3));
        int measuredWidth = getMeasuredWidth();
        this.t = Math.min(measuredWidth / 10, 0);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            int i6 = CommonUtils.BYTES_IN_A_GIGABYTE;
            boolean z = true;
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8 && (dVar2 = (d) childAt.getLayoutParams()) != null && dVar2.a) {
                int i7 = dVar2.b;
                int i8 = i7 & 7;
                int i9 = i7 & 112;
                boolean z2 = i9 == 48 || i9 == 80;
                if (i8 != 3 && i8 != 5) {
                    z = false;
                }
                if (z2) {
                    i4 = CommonUtils.BYTES_IN_A_GIGABYTE;
                } else {
                    r8 = z ? CommonUtils.BYTES_IN_A_GIGABYTE : Integer.MIN_VALUE;
                    i4 = Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) dVar2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i4 = CommonUtils.BYTES_IN_A_GIGABYTE;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) dVar2).height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i6 = r8;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i4), View.MeasureSpec.makeMeasureSpec(i11, i6));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i5++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, CommonUtils.BYTES_IN_A_GIGABYTE);
        this.n = View.MeasureSpec.makeMeasureSpec(measuredHeight, CommonUtils.BYTES_IN_A_GIGABYTE);
        this.o = true;
        f();
        this.o = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((dVar = (d) childAt2.getLayoutParams()) == null || !dVar.a)) {
                Objects.requireNonNull(dVar);
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * 0.0f), CommonUtils.BYTES_IN_A_GIGABYTE), this.n);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i4 = 1;
            i3 = 0;
        } else {
            i3 = childCount - 1;
            i4 = -1;
        }
        while (i3 != i5) {
            if (getChildAt(i3).getVisibility() == 0) {
                throw null;
            }
            i3 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f348f);
        this.f592f = savedState.f600h;
        this.f593g = savedState.f601i;
        this.f594h = savedState.f602j;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f600h = 0;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            if (i4 > 0) {
                throw null;
            }
            throw null;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            motionEvent.getEdgeFlags();
            return false;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.o) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(e.e0.a.a aVar) {
        List<e> list = this.E;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.E.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.E.get(i2).a(this, null, aVar);
        }
    }

    public void setCurrentItem(int i2) {
        setScrollingCacheEnabled(false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to 1");
            i2 = 1;
        }
        if (i2 != this.q) {
            this.q = i2;
            f();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(f fVar) {
        this.D = fVar;
    }

    public void setPageMargin(int i2) {
        this.f596j = i2;
        if (getWidth() > 0) {
            throw null;
        }
        throw null;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f597k = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i2) {
        if (this.F == i2) {
            return;
        }
        this.F = i2;
        f fVar = this.D;
        if (fVar != null) {
            fVar.a(i2);
        }
        List<f> list = this.C;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                f fVar2 = this.C.get(i3);
                if (fVar2 != null) {
                    fVar2.a(i2);
                }
            }
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f597k;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(e.i.c.a.getDrawable(getContext(), i2));
    }
}
