package e.a0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import e.a0.h;

/* compiled from: Visibility.java */
/* loaded from: classes.dex */
public abstract class a0 extends h {
    public static final String[] D = {"android:visibility:visibility", "android:visibility:parent"};
    public int C = 3;

    /* compiled from: Visibility.java */
    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter implements h.d {
        public final View a;
        public final int b;
        public final ViewGroup c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f1419d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1420e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1421f = false;

        public a(View view, int i2, boolean z) {
            this.a = view;
            this.b = i2;
            this.c = (ViewGroup) view.getParent();
            this.f1419d = z;
            g(true);
        }

        @Override // e.a0.h.d
        public void a(h hVar) {
        }

        @Override // e.a0.h.d
        public void b(h hVar) {
            g(false);
        }

        @Override // e.a0.h.d
        public void c(h hVar) {
            f();
            hVar.v(this);
        }

        @Override // e.a0.h.d
        public void d(h hVar) {
        }

        @Override // e.a0.h.d
        public void e(h hVar) {
            g(true);
        }

        public final void f() {
            if (!this.f1421f) {
                s.a.f(this.a, this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        public final void g(boolean z) {
            ViewGroup viewGroup;
            if (!this.f1419d || this.f1420e == z || (viewGroup = this.c) == null) {
                return;
            }
            this.f1420e = z;
            r.a(viewGroup, z);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1421f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f1421f) {
                return;
            }
            s.a.f(this.a, this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f1421f) {
                return;
            }
            s.a.f(this.a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* compiled from: Visibility.java */
    /* loaded from: classes.dex */
    public static class b {
        public boolean a;
        public boolean b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f1422d;

        /* renamed from: e  reason: collision with root package name */
        public ViewGroup f1423e;

        /* renamed from: f  reason: collision with root package name */
        public ViewGroup f1424f;
    }

    public final void H(p pVar) {
        pVar.a.put("android:visibility:visibility", Integer.valueOf(pVar.b.getVisibility()));
        pVar.a.put("android:visibility:parent", pVar.b.getParent());
        int[] iArr = new int[2];
        pVar.b.getLocationOnScreen(iArr);
        pVar.a.put("android:visibility:screenLocation", iArr);
    }

    public final b I(p pVar, p pVar2) {
        b bVar = new b();
        bVar.a = false;
        bVar.b = false;
        if (pVar != null && pVar.a.containsKey("android:visibility:visibility")) {
            bVar.c = ((Integer) pVar.a.get("android:visibility:visibility")).intValue();
            bVar.f1423e = (ViewGroup) pVar.a.get("android:visibility:parent");
        } else {
            bVar.c = -1;
            bVar.f1423e = null;
        }
        if (pVar2 != null && pVar2.a.containsKey("android:visibility:visibility")) {
            bVar.f1422d = ((Integer) pVar2.a.get("android:visibility:visibility")).intValue();
            bVar.f1424f = (ViewGroup) pVar2.a.get("android:visibility:parent");
        } else {
            bVar.f1422d = -1;
            bVar.f1424f = null;
        }
        if (pVar != null && pVar2 != null) {
            int i2 = bVar.c;
            int i3 = bVar.f1422d;
            if (i2 == i3 && bVar.f1423e == bVar.f1424f) {
                return bVar;
            }
            if (i2 != i3) {
                if (i2 == 0) {
                    bVar.b = false;
                    bVar.a = true;
                } else if (i3 == 0) {
                    bVar.b = true;
                    bVar.a = true;
                }
            } else if (bVar.f1424f == null) {
                bVar.b = false;
                bVar.a = true;
            } else if (bVar.f1423e == null) {
                bVar.b = true;
                bVar.a = true;
            }
        } else if (pVar == null && bVar.f1422d == 0) {
            bVar.b = true;
            bVar.a = true;
        } else if (pVar2 == null && bVar.c == 0) {
            bVar.b = false;
            bVar.a = true;
        }
        return bVar;
    }

    public abstract Animator J(ViewGroup viewGroup, View view, p pVar, p pVar2);

    @Override // e.a0.h
    public void d(p pVar) {
        H(pVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (I(n(r1, false), q(r1, false)).a != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ed  */
    @Override // e.a0.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator k(android.view.ViewGroup r22, e.a0.p r23, e.a0.p r24) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a0.a0.k(android.view.ViewGroup, e.a0.p, e.a0.p):android.animation.Animator");
    }

    @Override // e.a0.h
    public String[] p() {
        return D;
    }

    @Override // e.a0.h
    public boolean r(p pVar, p pVar2) {
        if (pVar == null && pVar2 == null) {
            return false;
        }
        if (pVar == null || pVar2 == null || pVar2.a.containsKey("android:visibility:visibility") == pVar.a.containsKey("android:visibility:visibility")) {
            b I = I(pVar, pVar2);
            if (I.a) {
                return I.c == 0 || I.f1422d == 0;
            }
            return false;
        }
        return false;
    }
}
