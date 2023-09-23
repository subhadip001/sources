package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import e.f0.c.f;
import e.i.j.h0.d;
import e.i.j.h0.f;
import e.i.j.z;
import e.u.b.x;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: f  reason: collision with root package name */
    public final Rect f616f;

    /* renamed from: g  reason: collision with root package name */
    public final Rect f617g;

    /* renamed from: h  reason: collision with root package name */
    public e.f0.c.c f618h;

    /* renamed from: i  reason: collision with root package name */
    public int f619i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f620j;

    /* renamed from: k  reason: collision with root package name */
    public RecyclerView.g f621k;

    /* renamed from: l  reason: collision with root package name */
    public LinearLayoutManager f622l;

    /* renamed from: m  reason: collision with root package name */
    public int f623m;
    public Parcelable n;
    public RecyclerView o;
    public x p;
    public e.f0.c.f q;
    public e.f0.c.c r;
    public e.f0.c.d s;
    public e.f0.c.e t;
    public RecyclerView.j u;
    public boolean v;
    public boolean w;
    public int x;
    public b y;

    /* loaded from: classes.dex */
    public class a extends c {
        public a() {
            super(null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f620j = true;
            viewPager2.q.f2018l = true;
        }
    }

    /* loaded from: classes.dex */
    public abstract class b {
        public b(ViewPager2 viewPager2, a aVar) {
        }

        public abstract void a(e.f0.c.c cVar, RecyclerView recyclerView);

        public abstract void b();
    }

    /* loaded from: classes.dex */
    public static abstract class c extends RecyclerView.g {
        public c(a aVar) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void b(int i2, int i3) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void c(int i2, int i3, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void d(int i2, int i3) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void e(int i2, int i3, int i4) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void f(int i2, int i3) {
            a();
        }
    }

    /* loaded from: classes.dex */
    public class d extends LinearLayoutManager {
        public d(Context context) {
            super(1, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public boolean E0(RecyclerView.t tVar, RecyclerView.x xVar, int i2, Bundle bundle) {
            Objects.requireNonNull(ViewPager2.this.y);
            return super.E0(tVar, xVar, i2, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public boolean L0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void b1(RecyclerView.x xVar, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.b1(xVar, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public void m0(RecyclerView.t tVar, RecyclerView.x xVar, e.i.j.h0.d dVar) {
            super.m0(tVar, xVar, dVar);
            Objects.requireNonNull(ViewPager2.this.y);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public void a(int i2) {
        }

        public void b(int i2, float f2, int i3) {
        }

        public void c(int i2) {
        }
    }

    /* loaded from: classes.dex */
    public class f extends b {
        public final e.i.j.h0.f a;
        public final e.i.j.h0.f b;
        public RecyclerView.g c;

        /* loaded from: classes.dex */
        public class a implements e.i.j.h0.f {
            public a() {
            }

            @Override // e.i.j.h0.f
            public boolean a(View view, f.a aVar) {
                f.this.c(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* loaded from: classes.dex */
        public class b implements e.i.j.h0.f {
            public b() {
            }

            @Override // e.i.j.h0.f
            public boolean a(View view, f.a aVar) {
                f.this.c(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* loaded from: classes.dex */
        public class c extends c {
            public c() {
                super(null);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.g
            public void a() {
                f.this.d();
            }
        }

        public f() {
            super(ViewPager2.this, null);
            this.a = new a();
            this.b = new b();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.b
        public void a(e.f0.c.c cVar, RecyclerView recyclerView) {
            AtomicInteger atomicInteger = z.a;
            z.d.s(recyclerView, 2);
            this.c = new c();
            if (z.d.c(ViewPager2.this) == 0) {
                z.d.s(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.b
        public void b() {
            d();
        }

        public void c(int i2) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.w) {
                viewPager2.d(i2, true);
            }
        }

        public void d() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            z.s(viewPager2, 16908360);
            z.s(viewPager2, 16908361);
            z.s(viewPager2, 16908358);
            z.s(viewPager2, 16908359);
            if (ViewPager2.this.getAdapter() == null || (itemCount = ViewPager2.this.getAdapter().getItemCount()) == 0) {
                return;
            }
            ViewPager2 viewPager22 = ViewPager2.this;
            if (viewPager22.w) {
                if (viewPager22.getOrientation() == 0) {
                    boolean a2 = ViewPager2.this.a();
                    int i2 = a2 ? 16908360 : 16908361;
                    int i3 = a2 ? 16908361 : 16908360;
                    if (ViewPager2.this.f619i < itemCount - 1) {
                        z.u(viewPager2, new d.a(i2, null), null, this.a);
                    }
                    if (ViewPager2.this.f619i > 0) {
                        z.u(viewPager2, new d.a(i3, null), null, this.b);
                        return;
                    }
                    return;
                }
                if (ViewPager2.this.f619i < itemCount - 1) {
                    z.u(viewPager2, new d.a(16908359, null), null, this.a);
                }
                if (ViewPager2.this.f619i > 0) {
                    z.u(viewPager2, new d.a(16908358, null), null, this.b);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(View view, float f2);
    }

    /* loaded from: classes.dex */
    public class h extends x {
        public h() {
        }

        @Override // e.u.b.x, e.u.b.c0
        public View c(RecyclerView.m mVar) {
            if (ViewPager2.this.s.a.f2019m) {
                return null;
            }
            return super.c(mVar);
        }
    }

    /* loaded from: classes.dex */
    public class i extends RecyclerView {
        public i(Context context) {
            super(context, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            Objects.requireNonNull(ViewPager2.this.y);
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f619i);
            accessibilityEvent.setToIndex(ViewPager2.this.f619i);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.w && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.w && super.onTouchEvent(motionEvent);
        }
    }

    /* loaded from: classes.dex */
    public static class j implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final int f629f;

        /* renamed from: g  reason: collision with root package name */
        public final RecyclerView f630g;

        public j(int i2, RecyclerView recyclerView) {
            this.f629f = i2;
            this.f630g = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f630g.q0(this.f629f);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f616f = new Rect();
        this.f617g = new Rect();
        this.f618h = new e.f0.c.c(3);
        this.f620j = false;
        this.f621k = new a();
        this.f623m = -1;
        this.u = null;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = new f();
        i iVar = new i(context);
        this.o = iVar;
        AtomicInteger atomicInteger = z.a;
        iVar.setId(z.e.a());
        this.o.setDescendantFocusability(131072);
        d dVar = new d(context);
        this.f622l = dVar;
        this.o.setLayoutManager(dVar);
        this.o.setScrollingTouchSlop(1);
        int[] iArr = e.f0.a.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            this.o.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            RecyclerView recyclerView = this.o;
            e.f0.c.i iVar2 = new e.f0.c.i(this);
            if (recyclerView.H == null) {
                recyclerView.H = new ArrayList();
            }
            recyclerView.H.add(iVar2);
            e.f0.c.f fVar = new e.f0.c.f(this);
            this.q = fVar;
            this.s = new e.f0.c.d(this, fVar, this.o);
            h hVar = new h();
            this.p = hVar;
            hVar.a(this.o);
            this.o.h(this.q);
            e.f0.c.c cVar = new e.f0.c.c(3);
            this.r = cVar;
            this.q.a = cVar;
            e.f0.c.g gVar = new e.f0.c.g(this);
            e.f0.c.h hVar2 = new e.f0.c.h(this);
            cVar.a.add(gVar);
            this.r.a.add(hVar2);
            this.y.a(this.r, this.o);
            e.f0.c.c cVar2 = this.r;
            cVar2.a.add(this.f618h);
            e.f0.c.e eVar = new e.f0.c.e(this.f622l);
            this.t = eVar;
            this.r.a.add(eVar);
            RecyclerView recyclerView2 = this.o;
            attachViewToParent(recyclerView2, 0, recyclerView2.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public boolean a() {
        return this.f622l.L() == 1;
    }

    public final void b() {
        RecyclerView.e adapter;
        if (this.f623m == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.n;
        if (parcelable != null) {
            if (adapter instanceof e.f0.b.g) {
                ((e.f0.b.g) adapter).f(parcelable);
            }
            this.n = null;
        }
        int max = Math.max(0, Math.min(this.f623m, adapter.getItemCount() - 1));
        this.f619i = max;
        this.f623m = -1;
        this.o.m0(max);
        ((f) this.y).d();
    }

    public void c(int i2, boolean z) {
        if (!this.s.a.f2019m) {
            d(i2, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        return this.o.canScrollHorizontally(i2);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i2) {
        return this.o.canScrollVertically(i2);
    }

    public void d(int i2, boolean z) {
        RecyclerView.e adapter = getAdapter();
        if (adapter == null) {
            if (this.f623m != -1) {
                this.f623m = Math.max(i2, 0);
            }
        } else if (adapter.getItemCount() <= 0) {
        } else {
            int min = Math.min(Math.max(i2, 0), adapter.getItemCount() - 1);
            int i3 = this.f619i;
            if (min == i3) {
                if (this.q.f2012f == 0) {
                    return;
                }
            }
            if (min == i3 && z) {
                return;
            }
            double d2 = i3;
            this.f619i = min;
            ((f) this.y).d();
            e.f0.c.f fVar = this.q;
            if (!(fVar.f2012f == 0)) {
                fVar.f();
                f.a aVar = fVar.f2013g;
                d2 = aVar.a + aVar.b;
            }
            e.f0.c.f fVar2 = this.q;
            fVar2.f2011e = z ? 2 : 3;
            fVar2.f2019m = false;
            boolean z2 = fVar2.f2015i != min;
            fVar2.f2015i = min;
            fVar2.d(2);
            if (z2) {
                fVar2.c(min);
            }
            if (!z) {
                this.o.m0(min);
                return;
            }
            double d3 = min;
            if (Math.abs(d3 - d2) > 3.0d) {
                this.o.m0(d3 > d2 ? min - 3 : min + 3);
                RecyclerView recyclerView = this.o;
                recyclerView.post(new j(min, recyclerView));
                return;
            }
            this.o.q0(min);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i2 = ((SavedState) parcelable).f624f;
            sparseArray.put(this.o.getId(), sparseArray.get(i2));
            sparseArray.remove(i2);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        b();
    }

    public void e() {
        x xVar = this.p;
        if (xVar != null) {
            View c2 = xVar.c(this.f622l);
            if (c2 == null) {
                return;
            }
            int S = this.f622l.S(c2);
            if (S != this.f619i && getScrollState() == 0) {
                this.r.c(S);
            }
            this.f620j = false;
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        Objects.requireNonNull(this.y);
        Objects.requireNonNull(this.y);
        return "androidx.viewpager.widget.ViewPager";
    }

    public RecyclerView.e getAdapter() {
        return this.o.getAdapter();
    }

    public int getCurrentItem() {
        return this.f619i;
    }

    public int getItemDecorationCount() {
        return this.o.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.x;
    }

    public int getOrientation() {
        return this.f622l.r;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.o;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.q.f2012f;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r6) {
        /*
            r5 = this;
            super.onInitializeAccessibilityNodeInfo(r6)
            androidx.viewpager2.widget.ViewPager2$b r0 = r5.y
            androidx.viewpager2.widget.ViewPager2$f r0 = (androidx.viewpager2.widget.ViewPager2.f) r0
            androidx.viewpager2.widget.ViewPager2 r1 = androidx.viewpager2.widget.ViewPager2.this
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L31
            androidx.viewpager2.widget.ViewPager2 r1 = androidx.viewpager2.widget.ViewPager2.this
            int r1 = r1.getOrientation()
            if (r1 != r2) goto L24
            androidx.viewpager2.widget.ViewPager2 r1 = androidx.viewpager2.widget.ViewPager2.this
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            int r1 = r1.getItemCount()
            goto L32
        L24:
            androidx.viewpager2.widget.ViewPager2 r1 = androidx.viewpager2.widget.ViewPager2.this
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            int r1 = r1.getItemCount()
            r4 = r1
            r1 = 0
            goto L33
        L31:
            r1 = 0
        L32:
            r4 = 0
        L33:
            e.i.j.h0.d$b r1 = e.i.j.h0.d.b.a(r1, r4, r3, r3)
            java.lang.Object r1 = r1.a
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r1 = (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) r1
            r6.setCollectionInfo(r1)
            androidx.viewpager2.widget.ViewPager2 r1 = androidx.viewpager2.widget.ViewPager2.this
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            if (r1 != 0) goto L47
            goto L6c
        L47:
            int r1 = r1.getItemCount()
            if (r1 == 0) goto L6c
            androidx.viewpager2.widget.ViewPager2 r3 = androidx.viewpager2.widget.ViewPager2.this
            boolean r4 = r3.w
            if (r4 != 0) goto L54
            goto L6c
        L54:
            int r3 = r3.f619i
            if (r3 <= 0) goto L5d
            r3 = 8192(0x2000, float:1.148E-41)
            r6.addAction(r3)
        L5d:
            androidx.viewpager2.widget.ViewPager2 r0 = androidx.viewpager2.widget.ViewPager2.this
            int r0 = r0.f619i
            int r1 = r1 - r2
            if (r0 >= r1) goto L69
            r0 = 4096(0x1000, float:5.74E-42)
            r6.addAction(r0)
        L69:
            r6.setScrollable(r2)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.ViewPager2.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int measuredWidth = this.o.getMeasuredWidth();
        int measuredHeight = this.o.getMeasuredHeight();
        this.f616f.left = getPaddingLeft();
        this.f616f.right = (i4 - i2) - getPaddingRight();
        this.f616f.top = getPaddingTop();
        this.f616f.bottom = (i5 - i3) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f616f, this.f617g);
        RecyclerView recyclerView = this.o;
        Rect rect = this.f617g;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f620j) {
            e();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        measureChild(this.o, i2, i3);
        int measuredWidth = this.o.getMeasuredWidth();
        int measuredHeight = this.o.getMeasuredHeight();
        int measuredState = this.o.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingTop = getPaddingTop();
        setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i2, measuredState), ViewGroup.resolveSizeAndState(Math.max(getPaddingBottom() + paddingTop + measuredHeight, getSuggestedMinimumHeight()), i3, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f623m = savedState.f625g;
        this.n = savedState.f626h;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f624f = this.o.getId();
        int i2 = this.f623m;
        if (i2 == -1) {
            i2 = this.f619i;
        }
        savedState.f625g = i2;
        Parcelable parcelable = this.n;
        if (parcelable != null) {
            savedState.f626h = parcelable;
        } else {
            RecyclerView.e adapter = this.o.getAdapter();
            if (adapter instanceof e.f0.b.g) {
                savedState.f626h = ((e.f0.b.g) adapter).b();
            }
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i2, Bundle bundle) {
        int currentItem;
        Objects.requireNonNull((f) this.y);
        boolean z = false;
        if (i2 == 8192 || i2 == 4096) {
            f fVar = (f) this.y;
            Objects.requireNonNull(fVar);
            if ((i2 == 8192 || i2 == 4096) ? true : true) {
                if (i2 == 8192) {
                    currentItem = ViewPager2.this.getCurrentItem() - 1;
                } else {
                    currentItem = ViewPager2.this.getCurrentItem() + 1;
                }
                fVar.c(currentItem);
                return true;
            }
            throw new IllegalStateException();
        }
        return super.performAccessibilityAction(i2, bundle);
    }

    public void setAdapter(RecyclerView.e eVar) {
        RecyclerView.e adapter = this.o.getAdapter();
        f fVar = (f) this.y;
        Objects.requireNonNull(fVar);
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(fVar.c);
        }
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.f621k);
        }
        this.o.setAdapter(eVar);
        this.f619i = 0;
        b();
        f fVar2 = (f) this.y;
        fVar2.d();
        if (eVar != null) {
            eVar.registerAdapterDataObserver(fVar2.c);
        }
        if (eVar != null) {
            eVar.registerAdapterDataObserver(this.f621k);
        }
    }

    public void setCurrentItem(int i2) {
        c(i2, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
        super.setLayoutDirection(i2);
        ((f) this.y).d();
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1 && i2 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.x = i2;
        this.o.requestLayout();
    }

    public void setOrientation(int i2) {
        this.f622l.F1(i2);
        ((f) this.y).d();
    }

    public void setPageTransformer(g gVar) {
        if (gVar != null) {
            if (!this.v) {
                this.u = this.o.getItemAnimator();
                this.v = true;
            }
            this.o.setItemAnimator(null);
        } else if (this.v) {
            this.o.setItemAnimator(this.u);
            this.u = null;
            this.v = false;
        }
        e.f0.c.e eVar = this.t;
        if (gVar == eVar.b) {
            return;
        }
        eVar.b = gVar;
        if (gVar == null) {
            return;
        }
        e.f0.c.f fVar = this.q;
        fVar.f();
        f.a aVar = fVar.f2013g;
        double d2 = aVar.a + aVar.b;
        int i2 = (int) d2;
        float f2 = (float) (d2 - i2);
        this.t.b(i2, f2, Math.round(getPageSize() * f2));
    }

    public void setUserInputEnabled(boolean z) {
        this.w = z;
        ((f) this.y).d();
    }

    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        public int f624f;

        /* renamed from: g  reason: collision with root package name */
        public int f625g;

        /* renamed from: h  reason: collision with root package name */
        public Parcelable f626h;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return Build.VERSION.SDK_INT >= 24 ? new SavedState(parcel, null) : new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new SavedState(parcel, classLoader) : new SavedState(parcel);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f624f = parcel.readInt();
            this.f625g = parcel.readInt();
            this.f626h = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f624f);
            parcel.writeInt(this.f625g);
            parcel.writeParcelable(this.f626h, i2);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f624f = parcel.readInt();
            this.f625g = parcel.readInt();
            this.f626h = parcel.readParcelable(null);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
