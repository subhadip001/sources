package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import e.i.j.h0.d;
import e.i.j.z;
import e.k.a.e;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public e a;
    public b b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public int f1072d = 2;

    /* renamed from: e  reason: collision with root package name */
    public float f1073e = 0.5f;

    /* renamed from: f  reason: collision with root package name */
    public float f1074f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    public float f1075g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    public final e.c f1076h = new a();

    /* loaded from: classes.dex */
    public class a extends e.c {
        public int a;
        public int b = -1;

        public a() {
        }

        @Override // e.k.a.e.c
        public int a(View view, int i2, int i3) {
            int width;
            int width2;
            int width3;
            AtomicInteger atomicInteger = z.a;
            boolean z = z.e.d(view) == 1;
            int i4 = SwipeDismissBehavior.this.f1072d;
            if (i4 == 0) {
                if (z) {
                    width = this.a - view.getWidth();
                    width2 = this.a;
                } else {
                    width = this.a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i4 != 1) {
                width = this.a - view.getWidth();
                width2 = view.getWidth() + this.a;
            } else if (z) {
                width = this.a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.a - view.getWidth();
                width2 = this.a;
            }
            return Math.min(Math.max(width, i2), width2);
        }

        @Override // e.k.a.e.c
        public int b(View view, int i2, int i3) {
            return view.getTop();
        }

        @Override // e.k.a.e.c
        public int c(View view) {
            return view.getWidth();
        }

        @Override // e.k.a.e.c
        public void h(View view, int i2) {
            this.b = i2;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // e.k.a.e.c
        public void i(int i2) {
            b bVar = SwipeDismissBehavior.this.b;
            if (bVar != null) {
                f.h.b.c.z.a aVar = (f.h.b.c.z.a) bVar;
                Objects.requireNonNull(aVar);
                if (i2 == 0) {
                    f.h.b.c.z.b a = f.h.b.c.z.b.a();
                    Objects.requireNonNull(aVar.a);
                    synchronized (a.a) {
                        a.b(null);
                    }
                } else if (i2 == 1 || i2 == 2) {
                    f.h.b.c.z.b a2 = f.h.b.c.z.b.a();
                    Objects.requireNonNull(aVar.a);
                    synchronized (a2.a) {
                        a2.b(null);
                    }
                }
            }
        }

        @Override // e.k.a.e.c
        public void j(View view, int i2, int i3, int i4, int i5) {
            float width = (view.getWidth() * SwipeDismissBehavior.this.f1074f) + this.a;
            float width2 = (view.getWidth() * SwipeDismissBehavior.this.f1075g) + this.a;
            float f2 = i2;
            if (f2 <= width) {
                view.setAlpha(1.0f);
            } else if (f2 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.C(0.0f, 1.0f - ((f2 - width) / (width2 - width)), 1.0f));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
            if (java.lang.Math.abs(r8.getLeft() - r7.a) >= java.lang.Math.round(r8.getWidth() * r7.c.f1073e)) goto L38;
         */
        @Override // e.k.a.e.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void k(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r10 = -1
                r7.b = r10
                int r10 = r8.getWidth()
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r3 == 0) goto L3c
                java.util.concurrent.atomic.AtomicInteger r4 = e.i.j.z.a
                int r4 = e.i.j.z.e.d(r8)
                if (r4 != r2) goto L18
                r4 = 1
                goto L19
            L18:
                r4 = 0
            L19:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.f1072d
                r6 = 2
                if (r5 != r6) goto L21
                goto L2c
            L21:
                if (r5 != 0) goto L30
                if (r4 == 0) goto L2a
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L2e
                goto L2c
            L2a:
                if (r3 <= 0) goto L2e
            L2c:
                r9 = 1
                goto L59
            L2e:
                r9 = 0
                goto L59
            L30:
                if (r5 != r2) goto L2e
                if (r4 == 0) goto L37
                if (r3 <= 0) goto L2e
                goto L3b
            L37:
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L2e
            L3b:
                goto L2c
            L3c:
                int r9 = r8.getLeft()
                int r0 = r7.a
                int r9 = r9 - r0
                int r0 = r8.getWidth()
                float r0 = (float) r0
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r3 = r3.f1073e
                float r0 = r0 * r3
                int r0 = java.lang.Math.round(r0)
                int r9 = java.lang.Math.abs(r9)
                if (r9 < r0) goto L2e
                goto L2c
            L59:
                if (r9 == 0) goto L68
                int r9 = r8.getLeft()
                int r0 = r7.a
                if (r9 >= r0) goto L65
                int r0 = r0 - r10
                goto L66
            L65:
                int r0 = r0 + r10
            L66:
                r1 = 1
                goto L6a
            L68:
                int r0 = r7.a
            L6a:
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                e.k.a.e r9 = r9.a
                int r10 = r8.getTop()
                boolean r9 = r9.v(r0, r10)
                if (r9 == 0) goto L85
                com.google.android.material.behavior.SwipeDismissBehavior$c r9 = new com.google.android.material.behavior.SwipeDismissBehavior$c
                com.google.android.material.behavior.SwipeDismissBehavior r10 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r9.<init>(r8, r1)
                java.util.concurrent.atomic.AtomicInteger r10 = e.i.j.z.a
                e.i.j.z.d.m(r8, r9)
                goto L92
            L85:
                if (r1 == 0) goto L92
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$b r9 = r9.b
                if (r9 == 0) goto L92
                f.h.b.c.z.a r9 = (f.h.b.c.z.a) r9
                r9.a(r8)
            L92:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.k(android.view.View, float, float):void");
        }

        @Override // e.k.a.e.c
        public boolean l(View view, int i2) {
            int i3 = this.b;
            return (i3 == -1 || i3 == i2) && SwipeDismissBehavior.this.B(view);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final View f1077f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f1078g;

        public c(View view, boolean z) {
            this.f1077f = view;
            this.f1078g = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar;
            e eVar = SwipeDismissBehavior.this.a;
            if (eVar != null && eVar.i(true)) {
                View view = this.f1077f;
                AtomicInteger atomicInteger = z.a;
                z.d.m(view, this);
            } else if (!this.f1078g || (bVar = SwipeDismissBehavior.this.b) == null) {
            } else {
                ((f.h.b.c.z.a) bVar).a(this.f1077f);
            }
        }
    }

    public static float C(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        e eVar = this.a;
        if (eVar != null) {
            eVar.p(motionEvent);
            return true;
        }
        return false;
    }

    public boolean B(View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.q(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (z) {
            if (this.a == null) {
                this.a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f1076h);
            }
            return this.a.w(motionEvent);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, int i2) {
        AtomicInteger atomicInteger = z.a;
        if (z.d.c(v) == 0) {
            z.d.s(v, 1);
            z.t(CommonUtils.BYTES_IN_A_MEGABYTE, v);
            z.n(v, 0);
            if (B(v)) {
                z.u(v, d.a.f2539l, null, new f.h.b.c.f.a(this));
            }
        }
        return false;
    }
}
