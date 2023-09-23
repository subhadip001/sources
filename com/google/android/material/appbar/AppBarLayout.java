package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.logging.type.LogSeverity;
import com.video_converter.video_compressor.R;
import e.i.j.f0;
import e.i.j.h0.d;
import e.i.j.l;
import e.i.j.z;
import f.h.b.c.d.e;
import f.h.b.c.d.f;
import f.h.b.c.d.g;
import f.h.b.c.d.j;
import f.h.b.c.s.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* renamed from: f  reason: collision with root package name */
    public int f1043f;

    /* renamed from: g  reason: collision with root package name */
    public int f1044g;

    /* renamed from: h  reason: collision with root package name */
    public int f1045h;

    /* renamed from: i  reason: collision with root package name */
    public int f1046i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1047j;

    /* renamed from: k  reason: collision with root package name */
    public int f1048k;

    /* renamed from: l  reason: collision with root package name */
    public f0 f1049l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1050m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public WeakReference<View> r;
    public ValueAnimator s;
    public final List<d> t;
    public int[] u;
    public Drawable v;
    public Behavior w;

    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends f<T> {

        /* renamed from: j  reason: collision with root package name */
        public int f1051j;

        /* renamed from: k  reason: collision with root package name */
        public int f1052k;

        /* renamed from: l  reason: collision with root package name */
        public ValueAnimator f1053l;

        /* renamed from: m  reason: collision with root package name */
        public SavedState f1054m;
        public WeakReference<View> n;
        public boolean o;

        /* loaded from: classes.dex */
        public class a extends e.i.j.c {
            public a() {
            }

            @Override // e.i.j.c
            public void d(View view, e.i.j.h0.d dVar) {
                this.a.onInitializeAccessibilityNodeInfo(view, dVar.a);
                dVar.a.setScrollable(BaseBehavior.this.o);
                dVar.a.setClassName(ScrollView.class.getName());
            }
        }

        public BaseBehavior() {
        }

        public static boolean J(int i2, int i3) {
            return (i2 & i3) == i3;
        }

        @Override // f.h.b.c.d.f
        public int E() {
            return B() + this.f1051j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.h.b.c.d.f
        public int H(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
            int i5;
            int i6;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int E = E();
            int i7 = 0;
            if (i3 != 0 && E >= i3 && E <= i4) {
                int l2 = e.i.a.l(i2, i3, i4);
                if (E != l2) {
                    if (appBarLayout.f1047j) {
                        int abs = Math.abs(l2);
                        int childCount = appBarLayout.getChildCount();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i8);
                            c cVar = (c) childAt.getLayoutParams();
                            Interpolator interpolator = cVar.c;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i8++;
                            } else if (interpolator != null) {
                                int i9 = cVar.a;
                                if ((i9 & 1) != 0) {
                                    i6 = childAt.getHeight() + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + 0;
                                    if ((i9 & 2) != 0) {
                                        AtomicInteger atomicInteger = z.a;
                                        i6 -= z.d.d(childAt);
                                    }
                                } else {
                                    i6 = 0;
                                }
                                AtomicInteger atomicInteger2 = z.a;
                                if (z.d.b(childAt)) {
                                    i6 -= appBarLayout.getTopInset();
                                }
                                if (i6 > 0) {
                                    float f2 = i6;
                                    i5 = (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f2) * f2)) * Integer.signum(l2);
                                }
                            }
                        }
                    }
                    i5 = l2;
                    boolean D = D(i5);
                    int i10 = E - l2;
                    this.f1051j = l2 - i5;
                    if (D) {
                        for (int i11 = 0; i11 < appBarLayout.getChildCount(); i11++) {
                            c cVar2 = (c) appBarLayout.getChildAt(i11).getLayoutParams();
                            a aVar = cVar2.b;
                            if (aVar != null && (cVar2.a & 1) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i11);
                                b bVar = (b) aVar;
                                Rect rect = bVar.a;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.getTopInset());
                                float abs2 = bVar.a.top - Math.abs(B());
                                if (abs2 <= 0.0f) {
                                    float abs3 = Math.abs(abs2 / bVar.a.height());
                                    float f3 = 1.0f - (abs3 >= 0.0f ? abs3 > 1.0f ? 1.0f : abs3 : 0.0f);
                                    float height = (-abs2) - ((bVar.a.height() * 0.3f) * (1.0f - (f3 * f3)));
                                    childAt2.setTranslationY(height);
                                    childAt2.getDrawingRect(bVar.b);
                                    bVar.b.offset(0, (int) (-height));
                                    Rect rect2 = bVar.b;
                                    AtomicInteger atomicInteger3 = z.a;
                                    z.f.c(childAt2, rect2);
                                } else {
                                    AtomicInteger atomicInteger4 = z.a;
                                    z.f.c(childAt2, null);
                                    childAt2.setTranslationY(0.0f);
                                }
                            }
                        }
                    }
                    if (!D && appBarLayout.f1047j) {
                        coordinatorLayout.c(appBarLayout);
                    }
                    appBarLayout.f1043f = B();
                    if (!appBarLayout.willNotDraw()) {
                        AtomicInteger atomicInteger5 = z.a;
                        z.d.k(appBarLayout);
                    }
                    R(coordinatorLayout, appBarLayout, l2, l2 < E ? -1 : 1, false);
                    i7 = i10;
                }
            } else {
                this.f1051j = 0;
            }
            Q(coordinatorLayout, appBarLayout);
            return i7;
        }

        public final void I(CoordinatorLayout coordinatorLayout, T t, int i2, float f2) {
            int height;
            int abs = Math.abs(E() - i2);
            float abs2 = Math.abs(f2);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / t.getHeight()) + 1.0f) * 150.0f);
            }
            int E = E();
            if (E == i2) {
                ValueAnimator valueAnimator = this.f1053l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f1053l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f1053l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f1053l = valueAnimator3;
                valueAnimator3.setInterpolator(f.h.b.c.c.a.f5224e);
                this.f1053l.addUpdateListener(new f.h.b.c.d.c(this, coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f1053l.setDuration(Math.min(height, (int) LogSeverity.CRITICAL_VALUE));
            this.f1053l.setIntValues(E, i2);
            this.f1053l.start();
        }

        public final View K(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if ((childAt instanceof l) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public void L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2, int[] iArr) {
            int i3;
            int i4;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i5 = -appBarLayout.getTotalScrollRange();
                    i3 = i5;
                    i4 = appBarLayout.getDownNestedPreScrollRange() + i5;
                } else {
                    i3 = -appBarLayout.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i3 != i4) {
                    iArr[1] = F(coordinatorLayout, appBarLayout, i2, i3, i4);
                }
            }
            if (appBarLayout.p) {
                appBarLayout.d(appBarLayout.e(view));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void M(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i2, int[] iArr) {
            if (i2 < 0) {
                iArr[1] = F(coordinatorLayout, appBarLayout, i2, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i2 == 0) {
                Q(coordinatorLayout, appBarLayout);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
            if (((r4.getTotalScrollRange() != 0) && r3.getHeight() - r5.getHeight() <= r4.getHeight()) != false) goto L15;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean N(androidx.coordinatorlayout.widget.CoordinatorLayout r3, com.google.android.material.appbar.AppBarLayout r4, android.view.View r5, int r6, int r7) {
            /*
                r2 = this;
                r6 = r6 & 2
                r0 = 1
                r1 = 0
                if (r6 == 0) goto L2a
                boolean r6 = r4.p
                if (r6 != 0) goto L2b
                int r6 = r4.getTotalScrollRange()
                if (r6 == 0) goto L12
                r6 = 1
                goto L13
            L12:
                r6 = 0
            L13:
                if (r6 == 0) goto L26
                int r3 = r3.getHeight()
                int r5 = r5.getHeight()
                int r3 = r3 - r5
                int r4 = r4.getHeight()
                if (r3 > r4) goto L26
                r3 = 1
                goto L27
            L26:
                r3 = 0
            L27:
                if (r3 == 0) goto L2a
                goto L2b
            L2a:
                r0 = 0
            L2b:
                if (r0 == 0) goto L34
                android.animation.ValueAnimator r3 = r2.f1053l
                if (r3 == 0) goto L34
                r3.cancel()
            L34:
                r3 = 0
                r2.n = r3
                r2.f1052k = r7
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.N(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int):boolean");
        }

        public SavedState O(Parcelable parcelable, T t) {
            int B = B();
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int bottom = childAt.getBottom() + B;
                if (childAt.getTop() + B <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f347g;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z = B == 0;
                    savedState.f1056i = z;
                    savedState.f1055h = !z && (-B) >= t.getTotalScrollRange();
                    savedState.f1057j = i2;
                    AtomicInteger atomicInteger = z.a;
                    savedState.f1059l = bottom == t.getTopInset() + z.d.d(childAt);
                    savedState.f1058k = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        public final void P(CoordinatorLayout coordinatorLayout, T t) {
            int paddingTop = t.getPaddingTop() + t.getTopInset();
            int E = E() - paddingTop;
            int childCount = t.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    i2 = -1;
                    break;
                }
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                c cVar = (c) childAt.getLayoutParams();
                if (J(cVar.a, 32)) {
                    top -= ((LinearLayout.LayoutParams) cVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) cVar).bottomMargin;
                }
                int i3 = -E;
                if (top <= i3 && bottom >= i3) {
                    break;
                }
                i2++;
            }
            if (i2 >= 0) {
                View childAt2 = t.getChildAt(i2);
                c cVar2 = (c) childAt2.getLayoutParams();
                int i4 = cVar2.a;
                if ((i4 & 17) == 17) {
                    int i5 = -childAt2.getTop();
                    int i6 = -childAt2.getBottom();
                    if (i2 == 0) {
                        AtomicInteger atomicInteger = z.a;
                        if (z.d.b(t) && z.d.b(childAt2)) {
                            i5 -= t.getTopInset();
                        }
                    }
                    if (J(i4, 2)) {
                        AtomicInteger atomicInteger2 = z.a;
                        i6 += z.d.d(childAt2);
                    } else if (J(i4, 5)) {
                        AtomicInteger atomicInteger3 = z.a;
                        int d2 = z.d.d(childAt2) + i6;
                        if (E < d2) {
                            i5 = d2;
                        } else {
                            i6 = d2;
                        }
                    }
                    if (J(i4, 32)) {
                        i5 += ((LinearLayout.LayoutParams) cVar2).topMargin;
                        i6 -= ((LinearLayout.LayoutParams) cVar2).bottomMargin;
                    }
                    if (E < (i6 + i5) / 2) {
                        i5 = i6;
                    }
                    I(coordinatorLayout, t, e.i.a.l(i5 + paddingTop, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        public final void Q(CoordinatorLayout coordinatorLayout, T t) {
            View view;
            boolean z;
            boolean z2;
            z.t(d.a.f2535h.a(), coordinatorLayout);
            boolean z3 = false;
            z.n(coordinatorLayout, 0);
            z.t(d.a.f2536i.a(), coordinatorLayout);
            z.n(coordinatorLayout, 0);
            if (t.getTotalScrollRange() == 0) {
                return;
            }
            int childCount = coordinatorLayout.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    view = null;
                    break;
                }
                View childAt = coordinatorLayout.getChildAt(i2);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).a instanceof ScrollingViewBehavior) {
                    view = childAt;
                    break;
                }
                i2++;
            }
            if (view == null) {
                return;
            }
            int childCount2 = t.getChildCount();
            int i3 = 0;
            while (true) {
                z = true;
                if (i3 >= childCount2) {
                    z2 = false;
                    break;
                } else if (((c) t.getChildAt(i3).getLayoutParams()).a != 0) {
                    z2 = true;
                    break;
                } else {
                    i3++;
                }
            }
            if (z2) {
                if (!(z.h(coordinatorLayout) != null)) {
                    z.w(coordinatorLayout, new a());
                }
                if (E() != (-t.getTotalScrollRange())) {
                    z.u(coordinatorLayout, d.a.f2535h, null, new e(this, t, false));
                    z3 = true;
                }
                if (E() != 0) {
                    if (view.canScrollVertically(-1)) {
                        int i4 = -t.getDownNestedPreScrollRange();
                        if (i4 != 0) {
                            z.u(coordinatorLayout, d.a.f2536i, null, new f.h.b.c.d.d(this, coordinatorLayout, t, view, i4));
                        }
                    } else {
                        z.u(coordinatorLayout, d.a.f2536i, null, new e(this, t, true));
                    }
                    this.o = z;
                }
                z = z3;
                this.o = z;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void R(androidx.coordinatorlayout.widget.CoordinatorLayout r7, T r8, int r9, int r10, boolean r11) {
            /*
                r6 = this;
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = 0
            La:
                if (r3 >= r1) goto L20
                android.view.View r4 = r8.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L1d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L1d
                goto L21
            L1d:
                int r3 = r3 + 1
                goto La
            L20:
                r4 = 0
            L21:
                r0 = 1
                if (r4 == 0) goto L5d
                android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$c r1 = (com.google.android.material.appbar.AppBarLayout.c) r1
                int r1 = r1.a
                r3 = r1 & 1
                if (r3 == 0) goto L5d
                java.util.concurrent.atomic.AtomicInteger r3 = e.i.j.z.a
                int r3 = e.i.j.z.d.d(r4)
                if (r10 <= 0) goto L4a
                r10 = r1 & 12
                if (r10 == 0) goto L4a
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L5d
                goto L5b
            L4a:
                r10 = r1 & 2
                if (r10 == 0) goto L5d
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L5d
            L5b:
                r9 = 1
                goto L5e
            L5d:
                r9 = 0
            L5e:
                boolean r10 = r8.p
                if (r10 == 0) goto L6a
                android.view.View r9 = r6.K(r7)
                boolean r9 = r8.e(r9)
            L6a:
                boolean r9 = r8.d(r9)
                if (r11 != 0) goto L9c
                if (r9 == 0) goto L9f
                java.util.List r7 = r7.f(r8)
                int r9 = r7.size()
                r10 = 0
            L7b:
                if (r10 >= r9) goto L9a
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r11
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r11 = r11.a
                boolean r1 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r1 == 0) goto L97
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.f5240f
                if (r7 == 0) goto L9a
                r2 = 1
                goto L9a
            L97:
                int r10 = r10 + 1
                goto L7b
            L9a:
                if (r2 == 0) goto L9f
            L9c:
                r8.jumpDrawablesToCurrentState()
            L9f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.R(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.h.b.c.d.h, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean k(CoordinatorLayout coordinatorLayout, View view, int i2) {
            int round;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.k(coordinatorLayout, appBarLayout, i2);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.f1054m;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i3 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            I(coordinatorLayout, appBarLayout, i3, 0.0f);
                        } else {
                            G(coordinatorLayout, appBarLayout, i3);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            I(coordinatorLayout, appBarLayout, 0, 0.0f);
                        } else {
                            G(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.f1055h) {
                G(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.f1056i) {
                G(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.f1057j);
                int i4 = -childAt.getBottom();
                if (this.f1054m.f1059l) {
                    round = appBarLayout.getTopInset() + z.d.d(childAt) + i4;
                } else {
                    round = Math.round(childAt.getHeight() * this.f1054m.f1058k) + i4;
                }
                G(coordinatorLayout, appBarLayout, round);
            }
            appBarLayout.f1048k = 0;
            this.f1054m = null;
            D(e.i.a.l(B(), -appBarLayout.getTotalScrollRange(), 0));
            R(coordinatorLayout, appBarLayout, B(), 0, true);
            appBarLayout.f1043f = B();
            if (!appBarLayout.willNotDraw()) {
                AtomicInteger atomicInteger = z.a;
                z.d.k(appBarLayout);
            }
            Q(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean l(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int i5) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height == -2) {
                coordinatorLayout.t(appBarLayout, i2, i3, View.MeasureSpec.makeMeasureSpec(0, 0), i5);
                return true;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
            L(coordinatorLayout, (AppBarLayout) view, view2, i3, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
            M(coordinatorLayout, (AppBarLayout) view, i5, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void u(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof SavedState) {
                this.f1054m = (SavedState) parcelable;
            } else {
                this.f1054m = null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public Parcelable v(CoordinatorLayout coordinatorLayout, View view) {
            android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            SavedState O = O(absSavedState, (AppBarLayout) view);
            return O == null ? absSavedState : O;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean x(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
            return N(coordinatorLayout, (AppBarLayout) view, view2, i2, i3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void z(CoordinatorLayout coordinatorLayout, View view, View view2, int i2) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f1052k == 0 || i2 == 1) {
                P(coordinatorLayout, appBarLayout);
                if (appBarLayout.p) {
                    appBarLayout.d(appBarLayout.e(view2));
                }
            }
            this.n = new WeakReference<>(view2);
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* loaded from: classes.dex */
        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* renamed from: h  reason: collision with root package name */
            public boolean f1055h;

            /* renamed from: i  reason: collision with root package name */
            public boolean f1056i;

            /* renamed from: j  reason: collision with root package name */
            public int f1057j;

            /* renamed from: k  reason: collision with root package name */
            public float f1058k;

            /* renamed from: l  reason: collision with root package name */
            public boolean f1059l;

            /* loaded from: classes.dex */
            public class a implements Parcelable.ClassLoaderCreator<SavedState> {
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

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f1055h = parcel.readByte() != 0;
                this.f1056i = parcel.readByte() != 0;
                this.f1057j = parcel.readInt();
                this.f1058k = parcel.readFloat();
                this.f1059l = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i2) {
                parcel.writeParcelable(this.f348f, i2);
                parcel.writeByte(this.f1055h ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f1056i ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f1057j);
                parcel.writeFloat(this.f1058k);
                parcel.writeByte(this.f1059l ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends g {
        public ScrollingViewBehavior() {
        }

        public AppBarLayout F(List<View> list) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = list.get(i2);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean g(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).a;
            if (cVar instanceof BaseBehavior) {
                z.p(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).f1051j) + this.f5239e) - E(view2));
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.p) {
                    appBarLayout.d(appBarLayout.e(view));
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                z.t(d.a.f2535h.a(), coordinatorLayout);
                z.n(coordinatorLayout, 0);
                z.t(d.a.f2536i.a(), coordinatorLayout);
                z.n(coordinatorLayout, 0);
                z.w(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean t(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout F = F(coordinatorLayout.e(view));
            if (F != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.c;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    F.c(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.h.b.c.b.D);
            this.f5240f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a {
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        public final Rect a = new Rect();
        public final Rect b = new Rect();
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(float f2, int i2);
    }

    /* JADX WARN: Finally extract failed */
    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(f.h.b.c.c0.a.a.a(context, attributeSet, R.attr.appBarLayoutStyle, com.arthenica.ffmpegkit.R.style.Widget_Design_AppBarLayout), attributeSet, R.attr.appBarLayoutStyle);
        this.f1044g = -1;
        this.f1045h = -1;
        this.f1046i = -1;
        this.f1048k = 0;
        this.t = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i2 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray d2 = r.d(context3, attributeSet, j.a, R.attr.appBarLayoutStyle, com.arthenica.ffmpegkit.R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (d2.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, d2.getResourceId(0, 0)));
            }
            d2.recycle();
            TypedArray d3 = r.d(context2, attributeSet, f.h.b.c.b.a, R.attr.appBarLayoutStyle, com.arthenica.ffmpegkit.R.style.Widget_Design_AppBarLayout, new int[0]);
            Drawable drawable = d3.getDrawable(0);
            AtomicInteger atomicInteger = z.a;
            z.d.q(this, drawable);
            if (getBackground() instanceof ColorDrawable) {
                f.h.b.c.y.g gVar = new f.h.b.c.y.g();
                gVar.r(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
                gVar.f5480f.b = new f.h.b.c.p.a(context2);
                gVar.z();
                z.d.q(this, gVar);
            }
            if (d3.hasValue(4)) {
                c(d3.getBoolean(4, false), false, false);
            }
            if (d3.hasValue(3)) {
                j.a(this, d3.getDimensionPixelSize(3, 0));
            }
            if (i2 >= 26) {
                if (d3.hasValue(2)) {
                    setKeyboardNavigationCluster(d3.getBoolean(2, false));
                }
                if (d3.hasValue(1)) {
                    setTouchscreenBlocksFocus(d3.getBoolean(1, false));
                }
            }
            this.p = d3.getBoolean(5, false);
            this.q = d3.getResourceId(6, -1);
            setStatusBarForeground(d3.getDrawable(7));
            d3.recycle();
            z.i.u(this, new f.h.b.c.d.a(this));
        } catch (Throwable th) {
            d2.recycle();
            throw th;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new c((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    public final void b() {
        Behavior behavior = this.w;
        BaseBehavior.SavedState O = (behavior == null || this.f1044g == -1 || this.f1048k != 0) ? null : behavior.O(AbsSavedState.f347g, this);
        this.f1044g = -1;
        this.f1045h = -1;
        this.f1046i = -1;
        if (O != null) {
            Behavior behavior2 = this.w;
            if (behavior2.f1054m != null) {
                return;
            }
            behavior2.f1054m = O;
        }
    }

    public final void c(boolean z, boolean z2, boolean z3) {
        this.f1048k = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public boolean d(boolean z) {
        if (!(!this.f1050m) || this.o == z) {
            return false;
        }
        this.o = z;
        refreshDrawableState();
        if (this.p && (getBackground() instanceof f.h.b.c.y.g)) {
            f.h.b.c.y.g gVar = (f.h.b.c.y.g) getBackground();
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            float f2 = z ? 0.0f : dimension;
            if (!z) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, dimension);
            this.s = ofFloat;
            ofFloat.setDuration(getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.s.setInterpolator(f.h.b.c.c.a.a);
            this.s.addUpdateListener(new f.h.b.c.d.b(this, gVar));
            this.s.start();
            return true;
        }
        return true;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.v != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f1043f);
            this.v.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.v;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public boolean e(View view) {
        int i2;
        if (this.r == null && (i2 = this.q) != -1) {
            View findViewById = view != null ? view.findViewById(i2) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.q);
            }
            if (findViewById != null) {
                this.r = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.r;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public final boolean f() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8) {
                AtomicInteger atomicInteger = z.a;
                return !z.d.b(childAt);
            }
            return false;
        }
        return false;
    }

    public final void g() {
        setWillNotDraw(!(this.v != null && getTopInset() > 0));
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-1, -2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.w = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int i2;
        int i3 = this.f1045h;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = cVar.a;
            if ((i5 & 5) == 5) {
                int i6 = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                if ((i5 & 8) != 0) {
                    AtomicInteger atomicInteger = z.a;
                    i2 = i6 + z.d.d(childAt);
                } else if ((i5 & 2) != 0) {
                    AtomicInteger atomicInteger2 = z.a;
                    i2 = i6 + (measuredHeight - z.d.d(childAt));
                } else {
                    i2 = i6 + measuredHeight;
                }
                if (childCount == 0) {
                    AtomicInteger atomicInteger3 = z.a;
                    if (z.d.b(childAt)) {
                        i2 = Math.min(i2, measuredHeight - getTopInset());
                    }
                }
                i4 += i2;
            } else if (i4 > 0) {
                break;
            }
        }
        int max = Math.max(0, i4);
        this.f1045h = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i2 = this.f1046i;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + childAt.getMeasuredHeight();
            int i5 = cVar.a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight;
            if ((i5 & 2) != 0) {
                AtomicInteger atomicInteger = z.a;
                i4 -= z.d.d(childAt);
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.f1046i = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.q;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        AtomicInteger atomicInteger = z.a;
        int d2 = z.d.d(this);
        if (d2 == 0) {
            int childCount = getChildCount();
            d2 = childCount >= 1 ? z.d.d(getChildAt(childCount - 1)) : 0;
            if (d2 == 0) {
                return getHeight() / 3;
            }
        }
        return (d2 * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f1048k;
    }

    public Drawable getStatusBarForeground() {
        return this.v;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        f0 f0Var = this.f1049l;
        if (f0Var != null) {
            return f0Var.f();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i2 = this.f1044g;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = cVar.a;
            if ((i5 & 1) == 0) {
                break;
            }
            int i6 = measuredHeight + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + i4;
            if (i3 == 0) {
                AtomicInteger atomicInteger = z.a;
                if (z.d.b(childAt)) {
                    i6 -= getTopInset();
                }
            }
            i4 = i6;
            if ((i5 & 2) != 0) {
                AtomicInteger atomicInteger2 = z.a;
                i4 -= z.d.d(childAt);
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.f1044g = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof f.h.b.c.y.g) {
            f.h.b.c.a.V0(this, (f.h.b.c.y.g) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i2) {
        if (this.u == null) {
            this.u = new int[4];
        }
        int[] iArr = this.u;
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + iArr.length);
        boolean z = this.n;
        iArr[0] = z ? R.attr.state_liftable : -2130969577;
        iArr[1] = (z && this.o) ? R.attr.state_lifted : -2130969578;
        iArr[2] = z ? R.attr.state_collapsible : -2130969575;
        iArr[3] = (z && this.o) ? R.attr.state_collapsed : -2130969574;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.r;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.r = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean z2;
        super.onLayout(z, i2, i3, i4, i5);
        AtomicInteger atomicInteger = z.a;
        boolean z3 = true;
        if (z.d.b(this) && f()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                z.p(getChildAt(childCount), topInset);
            }
        }
        b();
        this.f1047j = false;
        int childCount2 = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount2) {
                break;
            } else if (((c) getChildAt(i6).getLayoutParams()).c != null) {
                this.f1047j = true;
                break;
            } else {
                i6++;
            }
        }
        Drawable drawable = this.v;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f1050m) {
            return;
        }
        if (!this.p) {
            int childCount3 = getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i8 = ((c) getChildAt(i7).getLayoutParams()).a;
                if ((i8 & 1) == 1 && (i8 & 10) != 0) {
                    z2 = true;
                    break;
                }
                i7++;
            }
            if (!z2) {
                z3 = false;
            }
        }
        if (this.n != z3) {
            this.n = z3;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != 1073741824) {
            AtomicInteger atomicInteger = z.a;
            if (z.d.b(this) && f()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = e.i.a.l(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i3));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        b();
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        f.h.b.c.a.T0(this, f2);
    }

    public void setExpanded(boolean z) {
        AtomicInteger atomicInteger = z.a;
        c(z, z.g.c(this), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.p = z;
    }

    public void setLiftOnScrollTargetViewId(int i2) {
        this.q = i2;
        WeakReference<View> weakReference = this.r;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.r = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.f1050m = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i2) {
        if (i2 == 1) {
            super.setOrientation(i2);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.v;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.v = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.v.setState(getDrawableState());
                }
                Drawable drawable3 = this.v;
                AtomicInteger atomicInteger = z.a;
                e.i.a.X(drawable3, z.e.d(this));
                this.v.setVisible(getVisibility() == 0, false);
                this.v.setCallback(this);
            }
            g();
            AtomicInteger atomicInteger2 = z.a;
            z.d.k(this);
        }
    }

    public void setStatusBarForegroundColor(int i2) {
        setStatusBarForeground(new ColorDrawable(i2));
    }

    public void setStatusBarForegroundResource(int i2) {
        setStatusBarForeground(e.b.a.b(getContext(), i2));
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        j.a(this, f2);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.v;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.v;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new c(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* loaded from: classes.dex */
    public static class c extends LinearLayout.LayoutParams {
        public int a;
        public a b;
        public Interpolator c;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.h.b.c.b.b);
            this.a = obtainStyledAttributes.getInt(1, 0);
            this.b = obtainStyledAttributes.getInt(0, 0) != 1 ? null : new b();
            if (obtainStyledAttributes.hasValue(2)) {
                this.c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public c(int i2, int i3) {
            super(i2, i3);
            this.a = 1;
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 1;
        }

        public c(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
        }
    }
}
