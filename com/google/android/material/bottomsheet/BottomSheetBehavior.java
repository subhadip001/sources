package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.video_converter.video_compressor.R;
import e.i.j.h0.d;
import e.i.j.z;
import e.k.a.e;
import f.h.b.c.s.u;
import f.h.b.c.s.v;
import f.h.b.c.s.x;
import f.h.b.c.y.g;
import f.h.b.c.y.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public int A;
    public int B;
    public int C;
    public float D;
    public int E;
    public float F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public e K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public WeakReference<V> R;
    public WeakReference<View> S;
    public final ArrayList<c> T;
    public VelocityTracker U;
    public int V;
    public int W;
    public boolean X;
    public Map<View, Integer> Y;
    public int Z;
    public int a;
    public final e.c a0;
    public boolean b;
    public float c;

    /* renamed from: d  reason: collision with root package name */
    public int f1087d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1088e;

    /* renamed from: f  reason: collision with root package name */
    public int f1089f;

    /* renamed from: g  reason: collision with root package name */
    public int f1090g;

    /* renamed from: h  reason: collision with root package name */
    public g f1091h;

    /* renamed from: i  reason: collision with root package name */
    public ColorStateList f1092i;

    /* renamed from: j  reason: collision with root package name */
    public int f1093j;

    /* renamed from: k  reason: collision with root package name */
    public int f1094k;

    /* renamed from: l  reason: collision with root package name */
    public int f1095l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1096m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public j w;
    public boolean x;
    public final BottomSheetBehavior<V>.d y;
    public ValueAnimator z;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ View f1102f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ int f1103g;

        public a(View view, int i2) {
            this.f1102f = view;
            this.f1103g = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.Q(this.f1102f, this.f1103g, false);
        }
    }

    /* loaded from: classes.dex */
    public class b extends e.c {
        public long a;

        public b() {
        }

        @Override // e.k.a.e.c
        public int a(View view, int i2, int i3) {
            return view.getLeft();
        }

        @Override // e.k.a.e.c
        public int b(View view, int i2, int i3) {
            int I = BottomSheetBehavior.this.I();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return e.i.a.l(i2, I, bottomSheetBehavior.G ? bottomSheetBehavior.Q : bottomSheetBehavior.E);
        }

        @Override // e.k.a.e.c
        public int d(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.G) {
                return bottomSheetBehavior.Q;
            }
            return bottomSheetBehavior.E;
        }

        @Override // e.k.a.e.c
        public void i(int i2) {
            if (i2 == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.I) {
                    bottomSheetBehavior.O(1);
                }
            }
        }

        @Override // e.k.a.e.c
        public void j(View view, int i2, int i3, int i4, int i5) {
            BottomSheetBehavior.this.E(i3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
            if (java.lang.Math.abs(r5.getTop() - r4.b.I()) < java.lang.Math.abs(r5.getTop() - r4.b.C)) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00d2, code lost:
            if (java.lang.Math.abs(r6 - r7.B) < java.lang.Math.abs(r6 - r4.b.E)) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
            if (r6 > r4.b.C) goto L7;
         */
        @Override // e.k.a.e.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void k(android.view.View r5, float r6, float r7) {
            /*
                Method dump skipped, instructions count: 269
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.b.k(android.view.View, float, float):void");
        }

        @Override // e.k.a.e.c
        public boolean l(View view, int i2) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i3 = bottomSheetBehavior.J;
            if (i3 == 1 || bottomSheetBehavior.X) {
                return false;
            }
            if (i3 == 3 && bottomSheetBehavior.V == i2) {
                WeakReference<View> weakReference = bottomSheetBehavior.S;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.R;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public void a(View view) {
        }

        public abstract void b(View view, float f2);

        public abstract void c(View view, int i2);
    }

    /* loaded from: classes.dex */
    public class d {
        public int a;
        public boolean b;
        public final Runnable c = new a();

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = d.this;
                dVar.b = false;
                e eVar = BottomSheetBehavior.this.K;
                if (eVar != null && eVar.i(true)) {
                    d dVar2 = d.this;
                    dVar2.a(dVar2.a);
                    return;
                }
                d dVar3 = d.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.J == 2) {
                    bottomSheetBehavior.O(dVar3.a);
                }
            }
        }

        public d(a aVar) {
        }

        public void a(int i2) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.R;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.a = i2;
            if (this.b) {
                return;
            }
            Runnable runnable = this.c;
            AtomicInteger atomicInteger = z.a;
            z.d.m(BottomSheetBehavior.this.R.get(), runnable);
            this.b = true;
        }
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.f1093j = -1;
        this.f1094k = -1;
        this.y = new d(null);
        this.D = 0.5f;
        this.F = -1.0f;
        this.I = true;
        this.J = 4;
        this.T = new ArrayList<>();
        this.Z = -1;
        this.a0 = new b();
    }

    public static <V extends View> BottomSheetBehavior<V> G(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).a;
            if (cVar instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) cVar;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = false;
        if (v.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            int i2 = this.J;
            if (i2 == 1 && actionMasked == 0) {
                return true;
            }
            e eVar = this.K;
            if (eVar != null && (this.I || i2 == 1)) {
                eVar.p(motionEvent);
            }
            if (actionMasked == 0) {
                this.V = -1;
                VelocityTracker velocityTracker = this.U;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.U = null;
                }
            }
            if (this.U == null) {
                this.U = VelocityTracker.obtain();
            }
            this.U.addMovement(motionEvent);
            if (this.K != null && (this.I || this.J == 1)) {
                z = true;
            }
            if (z && actionMasked == 2 && !this.L) {
                float abs = Math.abs(this.W - motionEvent.getY());
                e eVar2 = this.K;
                if (abs > eVar2.b) {
                    eVar2.b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
                }
            }
            return !this.L;
        }
        return false;
    }

    public void B(c cVar) {
        if (this.T.contains(cVar)) {
            return;
        }
        this.T.add(cVar);
    }

    public final void C() {
        int D = D();
        if (this.b) {
            this.E = Math.max(this.Q - D, this.B);
        } else {
            this.E = this.Q - D;
        }
    }

    public final int D() {
        int i2;
        if (this.f1088e) {
            return Math.min(Math.max(this.f1089f, this.Q - ((this.P * 9) / 16)), this.O) + this.u;
        }
        if (!this.f1096m && !this.n && (i2 = this.f1095l) > 0) {
            return Math.max(this.f1087d, i2 + this.f1090g);
        }
        return this.f1087d + this.u;
    }

    public void E(int i2) {
        float f2;
        float f3;
        V v = this.R.get();
        if (v == null || this.T.isEmpty()) {
            return;
        }
        int i3 = this.E;
        if (i2 <= i3 && i3 != I()) {
            int i4 = this.E;
            f2 = i4 - i2;
            f3 = i4 - I();
        } else {
            int i5 = this.E;
            f2 = i5 - i2;
            f3 = this.Q - i5;
        }
        float f4 = f2 / f3;
        for (int i6 = 0; i6 < this.T.size(); i6++) {
            this.T.get(i6).b(v, f4);
        }
    }

    public View F(View view) {
        AtomicInteger atomicInteger = z.a;
        if (z.i.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View F = F(viewGroup.getChildAt(i2));
                if (F != null) {
                    return F;
                }
            }
            return null;
        }
        return null;
    }

    public final int H(int i2, int i3, int i4, int i5) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, i3, i5);
        if (i4 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i4 = Math.min(size, i4);
            }
            return View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i4), CommonUtils.BYTES_IN_A_GIGABYTE);
    }

    public int I() {
        if (this.b) {
            return this.B;
        }
        return Math.max(this.A, this.q ? 0 : this.v);
    }

    public final int J(int i2) {
        if (i2 != 3) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return this.C;
                    }
                    throw new IllegalArgumentException(f.a.b.a.a.i("Invalid state to get top offset: ", i2));
                }
                return this.Q;
            }
            return this.E;
        }
        return I();
    }

    public final void K(V v, d.a aVar, int i2) {
        z.u(v, aVar, null, new f.h.b.c.h.c(this, i2));
    }

    public void L(boolean z) {
        if (this.G != z) {
            this.G = z;
            if (!z && this.J == 5) {
                N(4);
            }
            R();
        }
    }

    public void M(int i2) {
        boolean z = true;
        if (i2 == -1) {
            if (!this.f1088e) {
                this.f1088e = true;
            }
            z = false;
        } else {
            if (this.f1088e || this.f1087d != i2) {
                this.f1088e = false;
                this.f1087d = Math.max(0, i2);
            }
            z = false;
        }
        if (z) {
            U(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
        if (e.i.j.z.g.b(r4) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void N(int r4) {
        /*
            r3 = this;
            r0 = 1
            if (r4 == r0) goto L64
            r1 = 2
            if (r4 != r1) goto L7
            goto L64
        L7:
            boolean r1 = r3.G
            if (r1 != 0) goto L16
            r1 = 5
            if (r4 != r1) goto L16
            java.lang.String r0 = "Cannot set state: "
            java.lang.String r1 = "BottomSheetBehavior"
            f.a.b.a.a.O(r0, r4, r1)
            return
        L16:
            r1 = 6
            if (r4 != r1) goto L27
            boolean r1 = r3.b
            if (r1 == 0) goto L27
            int r1 = r3.J(r4)
            int r2 = r3.B
            if (r1 > r2) goto L27
            r1 = 3
            goto L28
        L27:
            r1 = r4
        L28:
            java.lang.ref.WeakReference<V extends android.view.View> r2 = r3.R
            if (r2 == 0) goto L60
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L33
            goto L60
        L33:
            java.lang.ref.WeakReference<V extends android.view.View> r4 = r3.R
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            com.google.android.material.bottomsheet.BottomSheetBehavior$a r2 = new com.google.android.material.bottomsheet.BottomSheetBehavior$a
            r2.<init>(r4, r1)
            android.view.ViewParent r1 = r4.getParent()
            if (r1 == 0) goto L55
            boolean r1 = r1.isLayoutRequested()
            if (r1 == 0) goto L55
            java.util.concurrent.atomic.AtomicInteger r1 = e.i.j.z.a
            boolean r1 = e.i.j.z.g.b(r4)
            if (r1 == 0) goto L55
            goto L56
        L55:
            r0 = 0
        L56:
            if (r0 == 0) goto L5c
            r4.post(r2)
            goto L63
        L5c:
            r2.run()
            goto L63
        L60:
            r3.O(r4)
        L63:
            return
        L64:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "STATE_"
            java.lang.StringBuilder r2 = f.a.b.a.a.A(r2)
            if (r4 != r0) goto L71
            java.lang.String r4 = "DRAGGING"
            goto L73
        L71:
            java.lang.String r4 = "SETTLING"
        L73:
            java.lang.String r0 = " should not be set externally."
            java.lang.String r4 = f.a.b.a.a.u(r2, r4, r0)
            r1.<init>(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.N(int):void");
    }

    public void O(int i2) {
        V v;
        if (this.J == i2) {
            return;
        }
        this.J = i2;
        if (i2 != 4 && i2 != 3 && i2 != 6) {
            boolean z = this.G;
        }
        WeakReference<V> weakReference = this.R;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i2 == 3) {
            T(true);
        } else if (i2 == 6 || i2 == 5 || i2 == 4) {
            T(false);
        }
        S(i2);
        for (int i3 = 0; i3 < this.T.size(); i3++) {
            this.T.get(i3).c(v, i2);
        }
        R();
    }

    public boolean P(View view, float f2) {
        if (this.H) {
            return true;
        }
        if (view.getTop() < this.E) {
            return false;
        }
        return Math.abs(((f2 * 0.1f) + ((float) view.getTop())) - ((float) this.E)) / ((float) D()) > 0.5f;
    }

    public final void Q(View view, int i2, boolean z) {
        int J = J(i2);
        e eVar = this.K;
        if (eVar != null && (!z ? !eVar.x(view, view.getLeft(), J) : !eVar.v(view.getLeft(), J))) {
            O(2);
            S(i2);
            this.y.a(i2);
            return;
        }
        O(i2);
    }

    public final void R() {
        V v;
        int i2;
        WeakReference<V> weakReference = this.R;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        z.t(524288, v);
        z.n(v, 0);
        z.t(262144, v);
        z.n(v, 0);
        z.t(CommonUtils.BYTES_IN_A_MEGABYTE, v);
        z.n(v, 0);
        int i3 = this.Z;
        if (i3 != -1) {
            z.t(i3, v);
            z.n(v, 0);
        }
        if (!this.b && this.J != 6) {
            String string = v.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            f.h.b.c.h.c cVar = new f.h.b.c.h.c(this, 6);
            List<d.a> j2 = z.j(v);
            int i4 = 0;
            while (true) {
                if (i4 >= j2.size()) {
                    int i5 = -1;
                    int i6 = 0;
                    while (true) {
                        int[] iArr = z.f2550f;
                        if (i6 >= iArr.length || i5 != -1) {
                            break;
                        }
                        int i7 = iArr[i6];
                        boolean z = true;
                        for (int i8 = 0; i8 < j2.size(); i8++) {
                            z &= j2.get(i8).a() != i7;
                        }
                        if (z) {
                            i5 = i7;
                        }
                        i6++;
                    }
                    i2 = i5;
                } else if (TextUtils.equals(string, j2.get(i4).b())) {
                    i2 = j2.get(i4).a();
                    break;
                } else {
                    i4++;
                }
            }
            if (i2 != -1) {
                z.a(v, new d.a(null, i2, string, cVar, null));
            }
            this.Z = i2;
        }
        if (this.G && this.J != 5) {
            K(v, d.a.f2539l, 5);
        }
        int i9 = this.J;
        if (i9 == 3) {
            K(v, d.a.f2538k, this.b ? 4 : 6);
        } else if (i9 == 4) {
            K(v, d.a.f2537j, this.b ? 3 : 6);
        } else if (i9 == 6) {
            K(v, d.a.f2538k, 4);
            K(v, d.a.f2537j, 3);
        }
    }

    public final void S(int i2) {
        ValueAnimator valueAnimator;
        if (i2 == 2) {
            return;
        }
        boolean z = i2 == 3;
        if (this.x != z) {
            this.x = z;
            if (this.f1091h == null || (valueAnimator = this.z) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.z.reverse();
                return;
            }
            float f2 = z ? 0.0f : 1.0f;
            this.z.setFloatValues(1.0f - f2, f2);
            this.z.start();
        }
    }

    public final void T(boolean z) {
        WeakReference<V> weakReference = this.R;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.Y != null) {
                    return;
                }
                this.Y = new HashMap(childCount);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (childAt != this.R.get() && z) {
                    this.Y.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.Y = null;
        }
    }

    public final void U(boolean z) {
        V v;
        if (this.R != null) {
            C();
            if (this.J != 4 || (v = this.R.get()) == null) {
                return;
            }
            if (z) {
                N(4);
            } else {
                v.requestLayout();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void f(CoordinatorLayout.f fVar) {
        this.R = null;
        this.K = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void i() {
        this.R = null;
        this.K = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        e eVar;
        if (v.isShown() && this.I) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.V = -1;
                VelocityTracker velocityTracker = this.U;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.U = null;
                }
            }
            if (this.U == null) {
                this.U = VelocityTracker.obtain();
            }
            this.U.addMovement(motionEvent);
            if (actionMasked == 0) {
                int x = (int) motionEvent.getX();
                this.W = (int) motionEvent.getY();
                if (this.J != 2) {
                    WeakReference<View> weakReference = this.S;
                    View view = weakReference != null ? weakReference.get() : null;
                    if (view != null && coordinatorLayout.q(view, x, this.W)) {
                        this.V = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.X = true;
                    }
                }
                this.L = this.V == -1 && !coordinatorLayout.q(v, x, this.W);
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.X = false;
                this.V = -1;
                if (this.L) {
                    this.L = false;
                    return false;
                }
            }
            if (this.L || (eVar = this.K) == null || !eVar.w(motionEvent)) {
                WeakReference<View> weakReference2 = this.S;
                View view2 = weakReference2 != null ? weakReference2.get() : null;
                return (actionMasked != 2 || view2 == null || this.L || this.J == 1 || coordinatorLayout.q(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.K == null || Math.abs(((float) this.W) - motionEvent.getY()) <= ((float) this.K.b)) ? false : true;
            }
            return true;
        }
        this.L = true;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, int i2) {
        AtomicInteger atomicInteger = z.a;
        if (z.d.b(coordinatorLayout) && !z.d.b(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.R == null) {
            this.f1089f = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.f1096m || this.f1088e) ? false : true;
            if (this.n || this.o || this.p || this.r || this.s || this.t || z) {
                z.i.u(v, new u(new f.h.b.c.h.b(this, z), new x(z.e.f(v), v.getPaddingTop(), z.e.e(v), v.getPaddingBottom())));
                if (z.g.b(v)) {
                    z.h.c(v);
                } else {
                    v.addOnAttachStateChangeListener(new v());
                }
            }
            this.R = new WeakReference<>(v);
            g gVar = this.f1091h;
            if (gVar != null) {
                z.d.q(v, gVar);
                g gVar2 = this.f1091h;
                float f2 = this.F;
                if (f2 == -1.0f) {
                    f2 = z.i.i(v);
                }
                gVar2.q(f2);
                boolean z2 = this.J == 3;
                this.x = z2;
                this.f1091h.s(z2 ? 0.0f : 1.0f);
            } else {
                ColorStateList colorStateList = this.f1092i;
                if (colorStateList != null) {
                    z.y(v, colorStateList);
                }
            }
            R();
            if (z.d.c(v) == 0) {
                z.d.s(v, 1);
            }
        }
        if (this.K == null) {
            this.K = new e(coordinatorLayout.getContext(), coordinatorLayout, this.a0);
        }
        int top = v.getTop();
        coordinatorLayout.s(v, i2);
        this.P = coordinatorLayout.getWidth();
        this.Q = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.O = height;
        int i3 = this.Q;
        int i4 = i3 - height;
        int i5 = this.v;
        if (i4 < i5) {
            if (this.q) {
                this.O = i3;
            } else {
                this.O = i3 - i5;
            }
        }
        this.B = Math.max(0, i3 - this.O);
        this.C = (int) ((1.0f - this.D) * this.Q);
        C();
        int i6 = this.J;
        if (i6 == 3) {
            z.p(v, I());
        } else if (i6 == 6) {
            z.p(v, this.C);
        } else if (this.G && i6 == 5) {
            z.p(v, this.Q);
        } else if (i6 == 4) {
            z.p(v, this.E);
        } else if (i6 == 1 || i6 == 2) {
            z.p(v, top - v.getTop());
        }
        this.S = new WeakReference<>(F(v));
        for (int i7 = 0; i7 < this.T.size(); i7++) {
            this.T.get(i7).a(v);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(H(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, this.f1093j, marginLayoutParams.width), H(i4, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, this.f1094k, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean n(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3) {
        WeakReference<View> weakReference = this.S;
        return (weakReference == null || view != weakReference.get() || this.J == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void p(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.S;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i5 = top - i3;
        if (i3 > 0) {
            if (i5 < I()) {
                iArr[1] = top - I();
                z.p(v, -iArr[1]);
                O(3);
            } else if (!this.I) {
                return;
            } else {
                iArr[1] = i3;
                z.p(v, -i3);
                O(1);
            }
        } else if (i3 < 0 && !view.canScrollVertically(-1)) {
            int i6 = this.E;
            if (i5 > i6 && !this.G) {
                iArr[1] = top - i6;
                z.p(v, -iArr[1]);
                O(4);
            } else if (!this.I) {
                return;
            } else {
                iArr[1] = i3;
                z.p(v, -i3);
                O(1);
            }
        }
        E(v.getTop());
        this.M = i3;
        this.N = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void r(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void u(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.f1087d = savedState.f1098i;
            }
            if (i2 == -1 || (i2 & 2) == 2) {
                this.b = savedState.f1099j;
            }
            if (i2 == -1 || (i2 & 4) == 4) {
                this.G = savedState.f1100k;
            }
            if (i2 == -1 || (i2 & 8) == 8) {
                this.H = savedState.f1101l;
            }
        }
        int i3 = savedState.f1097h;
        if (i3 != 1 && i3 != 2) {
            this.J = i3;
        } else {
            this.J = 4;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable v(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState((Parcelable) View.BaseSavedState.EMPTY_STATE, (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean x(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
        this.M = 0;
        this.N = false;
        return (i2 & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
        if (r3.getTop() <= r1.C) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006f, code lost:
        if (java.lang.Math.abs(r2 - r1.B) < java.lang.Math.abs(r2 - r1.E)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
        if (r2 < java.lang.Math.abs(r2 - r1.E)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
        if (java.lang.Math.abs(r2 - r4) < java.lang.Math.abs(r2 - r1.E)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a9, code lost:
        if (java.lang.Math.abs(r2 - r1.C) < java.lang.Math.abs(r2 - r1.E)) goto L18;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void z(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.view.View r4, int r5) {
        /*
            r1 = this;
            int r2 = r3.getTop()
            int r5 = r1.I()
            r0 = 3
            if (r2 != r5) goto Lf
            r1.O(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r2 = r1.S
            if (r2 == 0) goto Lb4
            java.lang.Object r2 = r2.get()
            if (r4 != r2) goto Lb4
            boolean r2 = r1.N
            if (r2 != 0) goto L1f
            goto Lb4
        L1f:
            int r2 = r1.M
            if (r2 <= 0) goto L33
            boolean r2 = r1.b
            if (r2 == 0) goto L29
            goto Lae
        L29:
            int r2 = r3.getTop()
            int r4 = r1.C
            if (r2 <= r4) goto Lae
            goto Lab
        L33:
            boolean r2 = r1.G
            if (r2 == 0) goto L54
            android.view.VelocityTracker r2 = r1.U
            if (r2 != 0) goto L3d
            r2 = 0
            goto L4c
        L3d:
            r4 = 1000(0x3e8, float:1.401E-42)
            float r5 = r1.c
            r2.computeCurrentVelocity(r4, r5)
            android.view.VelocityTracker r2 = r1.U
            int r4 = r1.V
            float r2 = r2.getYVelocity(r4)
        L4c:
            boolean r2 = r1.P(r3, r2)
            if (r2 == 0) goto L54
            r0 = 5
            goto Lae
        L54:
            int r2 = r1.M
            if (r2 != 0) goto L91
            int r2 = r3.getTop()
            boolean r4 = r1.b
            if (r4 == 0) goto L72
            int r4 = r1.B
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.E
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
            goto Lae
        L72:
            int r4 = r1.C
            if (r2 >= r4) goto L81
            int r4 = r1.E
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            if (r2 >= r4) goto Lab
            goto Lae
        L81:
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.E
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
            goto Lab
        L91:
            boolean r2 = r1.b
            if (r2 == 0) goto L96
            goto Lad
        L96:
            int r2 = r3.getTop()
            int r4 = r1.C
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.E
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
        Lab:
            r0 = 6
            goto Lae
        Lad:
            r0 = 4
        Lae:
            r2 = 0
            r1.Q(r3, r0, r2)
            r1.N = r2
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.z(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public final int f1097h;

        /* renamed from: i  reason: collision with root package name */
        public int f1098i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f1099j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f1100k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f1101l;

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
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1097h = parcel.readInt();
            this.f1098i = parcel.readInt();
            this.f1099j = parcel.readInt() == 1;
            this.f1100k = parcel.readInt() == 1;
            this.f1101l = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f348f, i2);
            parcel.writeInt(this.f1097h);
            parcel.writeInt(this.f1098i);
            parcel.writeInt(this.f1099j ? 1 : 0);
            parcel.writeInt(this.f1100k ? 1 : 0);
            parcel.writeInt(this.f1101l ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f1097h = bottomSheetBehavior.J;
            this.f1098i = bottomSheetBehavior.f1087d;
            this.f1099j = bottomSheetBehavior.b;
            this.f1100k = bottomSheetBehavior.G;
            this.f1101l = bottomSheetBehavior.H;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i2;
        this.a = 0;
        this.b = true;
        this.f1093j = -1;
        this.f1094k = -1;
        this.y = new d(null);
        this.D = 0.5f;
        this.F = -1.0f;
        this.I = true;
        this.J = 4;
        this.T = new ArrayList<>();
        this.Z = -1;
        this.a0 = new b();
        this.f1090g = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.h.b.c.b.f5151d);
        int i3 = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.f1092i = f.h.b.c.a.n0(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(20)) {
            this.w = j.b(context, attributeSet, R.attr.bottomSheetStyle, com.arthenica.ffmpegkit.R.style.Widget_Design_BottomSheet_Modal, new f.h.b.c.y.a(0)).a();
        }
        if (this.w != null) {
            g gVar = new g(this.w);
            this.f1091h = gVar;
            gVar.f5480f.b = new f.h.b.c.p.a(context);
            gVar.z();
            ColorStateList colorStateList = this.f1092i;
            if (colorStateList != null) {
                this.f1091h.r(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f1091h.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.z = ofFloat;
        ofFloat.setDuration(500L);
        this.z.addUpdateListener(new f.h.b.c.h.a(this));
        this.F = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f1093j = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f1094k = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i2 = peekValue.data) == -1) {
            M(i2);
        } else {
            M(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        L(obtainStyledAttributes.getBoolean(8, false));
        this.f1096m = obtainStyledAttributes.getBoolean(12, false);
        boolean z = obtainStyledAttributes.getBoolean(6, true);
        if (this.b != z) {
            this.b = z;
            if (this.R != null) {
                C();
            }
            O((this.b && this.J == 6) ? i3 : this.J);
            R();
        }
        this.H = obtainStyledAttributes.getBoolean(11, false);
        this.I = obtainStyledAttributes.getBoolean(4, true);
        this.a = obtainStyledAttributes.getInt(10, 0);
        float f2 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f2 > 0.0f && f2 < 1.0f) {
            this.D = f2;
            if (this.R != null) {
                this.C = (int) ((1.0f - f2) * this.Q);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i4 = peekValue2.data;
                if (i4 >= 0) {
                    this.A = i4;
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.A = dimensionPixelOffset;
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.n = obtainStyledAttributes.getBoolean(16, false);
            this.o = obtainStyledAttributes.getBoolean(17, false);
            this.p = obtainStyledAttributes.getBoolean(18, false);
            this.q = obtainStyledAttributes.getBoolean(19, true);
            this.r = obtainStyledAttributes.getBoolean(13, false);
            this.s = obtainStyledAttributes.getBoolean(14, false);
            this.t = obtainStyledAttributes.getBoolean(15, false);
            obtainStyledAttributes.recycle();
            this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
