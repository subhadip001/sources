package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.google.android.gms.common.api.Api;
import com.video_converter.video_compressor.R;
import e.b.c.y;
import e.b.g.g;
import e.b.g.i.m;
import e.b.h.c0;
import e.b.h.d0;
import e.i.j.f0;
import e.i.j.n;
import e.i.j.o;
import e.i.j.p;
import e.i.j.z;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements c0, n, o {
    public static final int[] K = {R.attr.actionBarSize, 16842841};
    public f0 A;
    public f0 B;
    public f0 C;
    public d D;
    public OverScroller E;
    public ViewPropertyAnimator F;
    public final AnimatorListenerAdapter G;
    public final Runnable H;
    public final Runnable I;
    public final p J;

    /* renamed from: f  reason: collision with root package name */
    public int f130f;

    /* renamed from: g  reason: collision with root package name */
    public int f131g;

    /* renamed from: h  reason: collision with root package name */
    public ContentFrameLayout f132h;

    /* renamed from: i  reason: collision with root package name */
    public ActionBarContainer f133i;

    /* renamed from: j  reason: collision with root package name */
    public d0 f134j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f135k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f136l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f137m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public final Rect s;
    public final Rect t;
    public final Rect u;
    public final Rect v;
    public final Rect w;
    public final Rect x;
    public final Rect y;
    public f0 z;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.F = null;
            actionBarOverlayLayout.p = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.F = null;
            actionBarOverlayLayout.p = false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.F = actionBarOverlayLayout.f133i.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.G);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.F = actionBarOverlayLayout.f133i.animate().translationY(-ActionBarOverlayLayout.this.f133i.getHeight()).setListener(ActionBarOverlayLayout.this.G);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i2, int i3) {
            super(i2, i3);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f131g = 0;
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.w = new Rect();
        this.x = new Rect();
        this.y = new Rect();
        f0 f0Var = f0.b;
        this.z = f0Var;
        this.A = f0Var;
        this.B = f0Var;
        this.C = f0Var;
        this.G = new a();
        this.H = new b();
        this.I = new c();
        r(context);
        this.J = new p();
    }

    @Override // e.b.h.c0
    public void a(Menu menu, m.a aVar) {
        s();
        this.f134j.a(menu, aVar);
    }

    @Override // e.b.h.c0
    public boolean b() {
        s();
        return this.f134j.b();
    }

    @Override // e.b.h.c0
    public void c() {
        s();
        this.f134j.c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // e.b.h.c0
    public boolean d() {
        s();
        return this.f134j.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f135k == null || this.f136l) {
            return;
        }
        if (this.f133i.getVisibility() == 0) {
            i2 = (int) (this.f133i.getTranslationY() + this.f133i.getBottom() + 0.5f);
        } else {
            i2 = 0;
        }
        this.f135k.setBounds(0, i2, getWidth(), this.f135k.getIntrinsicHeight() + i2);
        this.f135k.draw(canvas);
    }

    @Override // e.b.h.c0
    public boolean e() {
        s();
        return this.f134j.e();
    }

    @Override // e.b.h.c0
    public boolean f() {
        s();
        return this.f134j.f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // e.b.h.c0
    public boolean g() {
        s();
        return this.f134j.g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f133i;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.J.a();
    }

    public CharSequence getTitle() {
        s();
        return this.f134j.getTitle();
    }

    @Override // e.b.h.c0
    public void h(int i2) {
        s();
        if (i2 == 2) {
            this.f134j.v();
        } else if (i2 == 5) {
            this.f134j.w();
        } else if (i2 != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    @Override // e.b.h.c0
    public void i() {
        s();
        this.f134j.h();
    }

    @Override // e.i.j.o
    public void j(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // e.i.j.n
    public void k(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // e.i.j.n
    public boolean l(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
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

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        s();
        f0 k2 = f0.k(windowInsets, this);
        boolean p = p(this.f133i, new Rect(k2.d(), k2.f(), k2.e(), k2.c()), true, true, false, true);
        Rect rect = this.s;
        AtomicInteger atomicInteger = z.a;
        z.i.b(this, k2, rect);
        Rect rect2 = this.s;
        f0 l2 = k2.a.l(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.z = l2;
        boolean z = true;
        if (!this.A.equals(l2)) {
            this.A = this.z;
            p = true;
        }
        if (this.t.equals(this.s)) {
            z = p;
        } else {
            this.t.set(this.s);
        }
        if (z) {
            requestLayout();
        }
        return k2.a.a().a().a.b().i();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r(getContext());
        AtomicInteger atomicInteger = z.a;
        z.h.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int measuredHeight;
        f0.e bVar;
        s();
        measureChildWithMargins(this.f133i, i2, 0, i3, 0);
        e eVar = (e) this.f133i.getLayoutParams();
        int max = Math.max(0, this.f133i.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f133i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f133i.getMeasuredState());
        AtomicInteger atomicInteger = z.a;
        boolean z = (z.d.g(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f130f;
            if (this.n && this.f133i.getTabContainer() != null) {
                measuredHeight += this.f130f;
            }
        } else {
            measuredHeight = this.f133i.getVisibility() != 8 ? this.f133i.getMeasuredHeight() : 0;
        }
        this.u.set(this.s);
        f0 f0Var = this.z;
        this.B = f0Var;
        if (!this.f137m && !z) {
            Rect rect = this.u;
            rect.top += measuredHeight;
            rect.bottom += 0;
            this.B = f0Var.a.l(0, measuredHeight, 0, 0);
        } else {
            e.i.d.b b2 = e.i.d.b.b(f0Var.d(), this.B.f() + measuredHeight, this.B.e(), this.B.c() + 0);
            f0 f0Var2 = this.B;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                bVar = new f0.d(f0Var2);
            } else if (i4 >= 29) {
                bVar = new f0.c(f0Var2);
            } else {
                bVar = new f0.b(f0Var2);
            }
            bVar.c(b2);
            this.B = bVar.a();
        }
        p(this.f132h, this.u, true, true, true, true);
        if (!this.C.equals(this.B)) {
            f0 f0Var3 = this.B;
            this.C = f0Var3;
            z.e(this.f132h, f0Var3);
        }
        measureChildWithMargins(this.f132h, i2, 0, i3, 0);
        e eVar2 = (e) this.f132h.getLayoutParams();
        int max3 = Math.max(max, this.f132h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f132h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f132h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (this.o && z) {
            this.E.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            if (this.E.getFinalY() > this.f133i.getHeight()) {
                q();
                this.I.run();
            } else {
                q();
                this.H.run();
            }
            this.p = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.q + i3;
        this.q = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        y yVar;
        g gVar;
        this.J.a = i2;
        this.q = getActionBarHideOffset();
        q();
        d dVar = this.D;
        if (dVar == null || (gVar = (yVar = (y) dVar).t) == null) {
            return;
        }
        gVar.a();
        yVar.t = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f133i.getVisibility() != 0) {
            return false;
        }
        return this.o;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.o && !this.p) {
            if (this.q <= this.f133i.getHeight()) {
                q();
                postDelayed(this.H, 600L);
            } else {
                q();
                postDelayed(this.I, 600L);
            }
        }
        d dVar = this.D;
        if (dVar != null) {
            Objects.requireNonNull((y) dVar);
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        s();
        int i3 = this.r ^ i2;
        this.r = i2;
        boolean z = (i2 & 4) == 0;
        boolean z2 = (i2 & 256) != 0;
        d dVar = this.D;
        if (dVar != null) {
            ((y) dVar).p = !z2;
            if (!z && z2) {
                y yVar = (y) dVar;
                if (!yVar.q) {
                    yVar.q = true;
                    yVar.w(true);
                }
            } else {
                y yVar2 = (y) dVar;
                if (yVar2.q) {
                    yVar2.q = false;
                    yVar2.w(true);
                }
            }
        }
        if ((i3 & 256) == 0 || this.D == null) {
            return;
        }
        AtomicInteger atomicInteger = z.a;
        z.h.c(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f131g = i2;
        d dVar = this.D;
        if (dVar != null) {
            ((y) dVar).o = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.p(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    public void q() {
        removeCallbacks(this.H);
        removeCallbacks(this.I);
        ViewPropertyAnimator viewPropertyAnimator = this.F;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void r(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(K);
        this.f130f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f135k = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f136l = context.getApplicationInfo().targetSdkVersion < 19;
        this.E = new OverScroller(context);
    }

    public void s() {
        d0 wrapper;
        if (this.f132h == null) {
            this.f132h = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f133i = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof d0) {
                wrapper = (d0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                StringBuilder A = f.a.b.a.a.A("Can't make a decor toolbar out of ");
                A.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(A.toString());
            }
            this.f134j = wrapper;
        }
    }

    public void setActionBarHideOffset(int i2) {
        q();
        this.f133i.setTranslationY(-Math.max(0, Math.min(i2, this.f133i.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.D = dVar;
        if (getWindowToken() != null) {
            ((y) this.D).o = this.f131g;
            int i2 = this.r;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                AtomicInteger atomicInteger = z.a;
                z.h.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.n = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.o) {
            this.o = z;
            if (z) {
                return;
            }
            q();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        s();
        this.f134j.setIcon(i2);
    }

    public void setLogo(int i2) {
        s();
        this.f134j.m(i2);
    }

    public void setOverlayMode(boolean z) {
        this.f137m = z;
        this.f136l = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // e.b.h.c0
    public void setWindowCallback(Window.Callback callback) {
        s();
        this.f134j.setWindowCallback(callback);
    }

    @Override // e.b.h.c0
    public void setWindowTitle(CharSequence charSequence) {
        s();
        this.f134j.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        s();
        this.f134j.setIcon(drawable);
    }
}
