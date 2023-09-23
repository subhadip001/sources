package e.g.a.h.j;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import e.g.a.h.j.b;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: Direct.java */
/* loaded from: classes.dex */
public class h {
    public static b.a a = new b.a();
    public static int b;
    public static int c;

    public static boolean a(ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour m2 = constraintWidget.m();
        ConstraintWidget.DimensionBehaviour t = constraintWidget.t();
        ConstraintWidget constraintWidget2 = constraintWidget.V;
        e.g.a.h.c cVar = constraintWidget2 != null ? (e.g.a.h.c) constraintWidget2 : null;
        if (cVar != null) {
            cVar.m();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (cVar != null) {
            cVar.t();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
        boolean z = m2 == dimensionBehaviour5 || constraintWidget.E() || m2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (m2 == (dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.r == 0 && constraintWidget.Y == 0.0f && constraintWidget.x(0)) || (m2 == dimensionBehaviour2 && constraintWidget.r == 1 && constraintWidget.y(0, constraintWidget.u()));
        boolean z2 = t == dimensionBehaviour5 || constraintWidget.F() || t == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (t == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.s == 0 && constraintWidget.Y == 0.0f && constraintWidget.x(1)) || (t == dimensionBehaviour && constraintWidget.s == 1 && constraintWidget.y(1, constraintWidget.l()));
        if (constraintWidget.Y <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    public static void b(int i2, ConstraintWidget constraintWidget, b.InterfaceC0033b interfaceC0033b, boolean z) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.f276m) {
            return;
        }
        b++;
        int i3 = 0;
        if (!(constraintWidget instanceof e.g.a.h.c) && constraintWidget.D() && a(constraintWidget)) {
            e.g.a.h.c.f0(constraintWidget, interfaceC0033b, new b.a(), 0);
        }
        ConstraintAnchor i4 = constraintWidget.i(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor i5 = constraintWidget.i(ConstraintAnchor.Type.RIGHT);
        int c2 = i4.c();
        int c3 = i5.c();
        HashSet<ConstraintAnchor> hashSet = i4.a;
        if (hashSet != null && i4.c) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.f261d;
                int i6 = i2 + 1;
                boolean a2 = a(constraintWidget2);
                if (constraintWidget2.D() && a2) {
                    e.g.a.h.c.f0(constraintWidget2, interfaceC0033b, new b.a(), i3);
                }
                ConstraintAnchor constraintAnchor5 = constraintWidget2.J;
                boolean z2 = (next == constraintAnchor5 && (constraintAnchor4 = constraintWidget2.L.f263f) != null && constraintAnchor4.c) || (next == constraintWidget2.L && (constraintAnchor3 = constraintAnchor5.f263f) != null && constraintAnchor3.c);
                ConstraintWidget.DimensionBehaviour m2 = constraintWidget2.m();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (m2 == dimensionBehaviour && !a2) {
                    if (constraintWidget2.m() == dimensionBehaviour && constraintWidget2.v >= 0 && constraintWidget2.u >= 0 && ((constraintWidget2.i0 == 8 || (constraintWidget2.r == 0 && constraintWidget2.Y == 0.0f)) && !constraintWidget2.B() && !constraintWidget2.G && z2 && !constraintWidget2.B())) {
                        d(i6, constraintWidget, interfaceC0033b, constraintWidget2, z);
                    }
                } else if (!constraintWidget2.D()) {
                    ConstraintAnchor constraintAnchor6 = constraintWidget2.J;
                    if (next == constraintAnchor6 && constraintWidget2.L.f263f == null) {
                        int d2 = constraintAnchor6.d() + c2;
                        constraintWidget2.M(d2, constraintWidget2.u() + d2);
                        b(i6, constraintWidget2, interfaceC0033b, z);
                    } else {
                        ConstraintAnchor constraintAnchor7 = constraintWidget2.L;
                        if (next == constraintAnchor7 && constraintAnchor6.f263f == null) {
                            int d3 = c2 - constraintAnchor7.d();
                            constraintWidget2.M(d3 - constraintWidget2.u(), d3);
                            b(i6, constraintWidget2, interfaceC0033b, z);
                        } else if (z2 && !constraintWidget2.B()) {
                            c(i6, interfaceC0033b, constraintWidget2, z);
                        }
                    }
                }
                i3 = 0;
            }
        }
        if (constraintWidget instanceof e.g.a.h.d) {
            return;
        }
        HashSet<ConstraintAnchor> hashSet2 = i5.a;
        if (hashSet2 != null && i5.c) {
            Iterator<ConstraintAnchor> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.f261d;
                int i7 = i2 + 1;
                boolean a3 = a(constraintWidget3);
                if (constraintWidget3.D() && a3) {
                    e.g.a.h.c.f0(constraintWidget3, interfaceC0033b, new b.a(), 0);
                }
                ConstraintAnchor constraintAnchor8 = constraintWidget3.J;
                boolean z3 = (next2 == constraintAnchor8 && (constraintAnchor2 = constraintWidget3.L.f263f) != null && constraintAnchor2.c) || (next2 == constraintWidget3.L && (constraintAnchor = constraintAnchor8.f263f) != null && constraintAnchor.c);
                ConstraintWidget.DimensionBehaviour m3 = constraintWidget3.m();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (m3 == dimensionBehaviour2 && !a3) {
                    if (constraintWidget3.m() == dimensionBehaviour2 && constraintWidget3.v >= 0 && constraintWidget3.u >= 0 && (constraintWidget3.i0 == 8 || (constraintWidget3.r == 0 && constraintWidget3.Y == 0.0f))) {
                        if (!constraintWidget3.B() && !constraintWidget3.G && z3 && !constraintWidget3.B()) {
                            d(i7, constraintWidget, interfaceC0033b, constraintWidget3, z);
                        }
                    }
                } else if (!constraintWidget3.D()) {
                    ConstraintAnchor constraintAnchor9 = constraintWidget3.J;
                    if (next2 == constraintAnchor9 && constraintWidget3.L.f263f == null) {
                        int d4 = constraintAnchor9.d() + c3;
                        constraintWidget3.M(d4, constraintWidget3.u() + d4);
                        b(i7, constraintWidget3, interfaceC0033b, z);
                    } else {
                        ConstraintAnchor constraintAnchor10 = constraintWidget3.L;
                        if (next2 == constraintAnchor10 && constraintAnchor9.f263f == null) {
                            int d5 = c3 - constraintAnchor10.d();
                            constraintWidget3.M(d5 - constraintWidget3.u(), d5);
                            b(i7, constraintWidget3, interfaceC0033b, z);
                        } else if (z3 && !constraintWidget3.B()) {
                            c(i7, interfaceC0033b, constraintWidget3, z);
                        }
                    }
                }
            }
        }
        constraintWidget.f276m = true;
    }

    public static void c(int i2, b.InterfaceC0033b interfaceC0033b, ConstraintWidget constraintWidget, boolean z) {
        float f2 = constraintWidget.f0;
        int c2 = constraintWidget.J.f263f.c();
        int c3 = constraintWidget.L.f263f.c();
        int d2 = constraintWidget.J.d() + c2;
        int d3 = c3 - constraintWidget.L.d();
        if (c2 == c3) {
            f2 = 0.5f;
        } else {
            c2 = d2;
            c3 = d3;
        }
        int u = constraintWidget.u();
        int i3 = (c3 - c2) - u;
        if (c2 > c3) {
            i3 = (c2 - c3) - u;
        }
        int i4 = ((int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3)) + c2;
        int i5 = i4 + u;
        if (c2 > c3) {
            i5 = i4 - u;
        }
        constraintWidget.M(i4, i5);
        b(i2 + 1, constraintWidget, interfaceC0033b, z);
    }

    public static void d(int i2, ConstraintWidget constraintWidget, b.InterfaceC0033b interfaceC0033b, ConstraintWidget constraintWidget2, boolean z) {
        int u;
        float f2 = constraintWidget2.f0;
        int d2 = constraintWidget2.J.d() + constraintWidget2.J.f263f.c();
        int c2 = constraintWidget2.L.f263f.c() - constraintWidget2.L.d();
        if (c2 >= d2) {
            int u2 = constraintWidget2.u();
            if (constraintWidget2.i0 != 8) {
                int i3 = constraintWidget2.r;
                if (i3 == 2) {
                    if (constraintWidget instanceof e.g.a.h.c) {
                        u = constraintWidget.u();
                    } else {
                        u = constraintWidget.V.u();
                    }
                    u2 = (int) (constraintWidget2.f0 * 0.5f * u);
                } else if (i3 == 0) {
                    u2 = c2 - d2;
                }
                u2 = Math.max(constraintWidget2.u, u2);
                int i4 = constraintWidget2.v;
                if (i4 > 0) {
                    u2 = Math.min(i4, u2);
                }
            }
            int i5 = d2 + ((int) ((f2 * ((c2 - d2) - u2)) + 0.5f));
            constraintWidget2.M(i5, u2 + i5);
            b(i2 + 1, constraintWidget2, interfaceC0033b, z);
        }
    }

    public static void e(int i2, b.InterfaceC0033b interfaceC0033b, ConstraintWidget constraintWidget) {
        float f2 = constraintWidget.g0;
        int c2 = constraintWidget.K.f263f.c();
        int c3 = constraintWidget.M.f263f.c();
        int d2 = constraintWidget.K.d() + c2;
        int d3 = c3 - constraintWidget.M.d();
        if (c2 == c3) {
            f2 = 0.5f;
        } else {
            c2 = d2;
            c3 = d3;
        }
        int l2 = constraintWidget.l();
        int i3 = (c3 - c2) - l2;
        if (c2 > c3) {
            i3 = (c2 - c3) - l2;
        }
        int i4 = (int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3);
        int i5 = c2 + i4;
        int i6 = i5 + l2;
        if (c2 > c3) {
            i5 = c2 - i4;
            i6 = i5 - l2;
        }
        constraintWidget.N(i5, i6);
        g(i2 + 1, constraintWidget, interfaceC0033b);
    }

    public static void f(int i2, ConstraintWidget constraintWidget, b.InterfaceC0033b interfaceC0033b, ConstraintWidget constraintWidget2) {
        int l2;
        float f2 = constraintWidget2.g0;
        int d2 = constraintWidget2.K.d() + constraintWidget2.K.f263f.c();
        int c2 = constraintWidget2.M.f263f.c() - constraintWidget2.M.d();
        if (c2 >= d2) {
            int l3 = constraintWidget2.l();
            if (constraintWidget2.i0 != 8) {
                int i3 = constraintWidget2.s;
                if (i3 == 2) {
                    if (constraintWidget instanceof e.g.a.h.c) {
                        l2 = constraintWidget.l();
                    } else {
                        l2 = constraintWidget.V.l();
                    }
                    l3 = (int) (f2 * 0.5f * l2);
                } else if (i3 == 0) {
                    l3 = c2 - d2;
                }
                l3 = Math.max(constraintWidget2.x, l3);
                int i4 = constraintWidget2.y;
                if (i4 > 0) {
                    l3 = Math.min(i4, l3);
                }
            }
            int i5 = d2 + ((int) ((f2 * ((c2 - d2) - l3)) + 0.5f));
            constraintWidget2.N(i5, l3 + i5);
            g(i2 + 1, constraintWidget2, interfaceC0033b);
        }
    }

    public static void g(int i2, ConstraintWidget constraintWidget, b.InterfaceC0033b interfaceC0033b) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.n) {
            return;
        }
        c++;
        if (!(constraintWidget instanceof e.g.a.h.c) && constraintWidget.D() && a(constraintWidget)) {
            e.g.a.h.c.f0(constraintWidget, interfaceC0033b, new b.a(), 0);
        }
        ConstraintAnchor i3 = constraintWidget.i(ConstraintAnchor.Type.TOP);
        ConstraintAnchor i4 = constraintWidget.i(ConstraintAnchor.Type.BOTTOM);
        int c2 = i3.c();
        int c3 = i4.c();
        HashSet<ConstraintAnchor> hashSet = i3.a;
        if (hashSet != null && i3.c) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.f261d;
                int i5 = i2 + 1;
                boolean a2 = a(constraintWidget2);
                if (constraintWidget2.D() && a2) {
                    e.g.a.h.c.f0(constraintWidget2, interfaceC0033b, new b.a(), 0);
                }
                ConstraintAnchor constraintAnchor5 = constraintWidget2.K;
                boolean z = (next == constraintAnchor5 && (constraintAnchor4 = constraintWidget2.M.f263f) != null && constraintAnchor4.c) || (next == constraintWidget2.M && (constraintAnchor3 = constraintAnchor5.f263f) != null && constraintAnchor3.c);
                ConstraintWidget.DimensionBehaviour t = constraintWidget2.t();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (t == dimensionBehaviour && !a2) {
                    if (constraintWidget2.t() == dimensionBehaviour && constraintWidget2.y >= 0 && constraintWidget2.x >= 0 && ((constraintWidget2.i0 == 8 || (constraintWidget2.s == 0 && constraintWidget2.Y == 0.0f)) && !constraintWidget2.C() && !constraintWidget2.G && z && !constraintWidget2.C())) {
                        f(i5, constraintWidget, interfaceC0033b, constraintWidget2);
                    }
                } else if (!constraintWidget2.D()) {
                    ConstraintAnchor constraintAnchor6 = constraintWidget2.K;
                    if (next == constraintAnchor6 && constraintWidget2.M.f263f == null) {
                        int d2 = constraintAnchor6.d() + c2;
                        constraintWidget2.N(d2, constraintWidget2.l() + d2);
                        g(i5, constraintWidget2, interfaceC0033b);
                    } else {
                        ConstraintAnchor constraintAnchor7 = constraintWidget2.M;
                        if (next == constraintAnchor7 && constraintAnchor6.f263f == null) {
                            int d3 = c2 - constraintAnchor7.d();
                            constraintWidget2.N(d3 - constraintWidget2.l(), d3);
                            g(i5, constraintWidget2, interfaceC0033b);
                        } else if (z && !constraintWidget2.C()) {
                            e(i5, interfaceC0033b, constraintWidget2);
                        }
                    }
                }
            }
        }
        if (constraintWidget instanceof e.g.a.h.d) {
            return;
        }
        HashSet<ConstraintAnchor> hashSet2 = i4.a;
        if (hashSet2 != null && i4.c) {
            Iterator<ConstraintAnchor> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.f261d;
                int i6 = i2 + 1;
                boolean a3 = a(constraintWidget3);
                if (constraintWidget3.D() && a3) {
                    e.g.a.h.c.f0(constraintWidget3, interfaceC0033b, new b.a(), 0);
                }
                ConstraintAnchor constraintAnchor8 = constraintWidget3.K;
                boolean z2 = (next2 == constraintAnchor8 && (constraintAnchor2 = constraintWidget3.M.f263f) != null && constraintAnchor2.c) || (next2 == constraintWidget3.M && (constraintAnchor = constraintAnchor8.f263f) != null && constraintAnchor.c);
                ConstraintWidget.DimensionBehaviour t2 = constraintWidget3.t();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (t2 == dimensionBehaviour2 && !a3) {
                    if (constraintWidget3.t() == dimensionBehaviour2 && constraintWidget3.y >= 0 && constraintWidget3.x >= 0 && (constraintWidget3.i0 == 8 || (constraintWidget3.s == 0 && constraintWidget3.Y == 0.0f))) {
                        if (!constraintWidget3.C() && !constraintWidget3.G && z2 && !constraintWidget3.C()) {
                            f(i6, constraintWidget, interfaceC0033b, constraintWidget3);
                        }
                    }
                } else if (!constraintWidget3.D()) {
                    ConstraintAnchor constraintAnchor9 = constraintWidget3.K;
                    if (next2 == constraintAnchor9 && constraintWidget3.M.f263f == null) {
                        int d4 = constraintAnchor9.d() + c3;
                        constraintWidget3.N(d4, constraintWidget3.l() + d4);
                        g(i6, constraintWidget3, interfaceC0033b);
                    } else {
                        ConstraintAnchor constraintAnchor10 = constraintWidget3.M;
                        if (next2 == constraintAnchor10 && constraintAnchor9.f263f == null) {
                            int d5 = c3 - constraintAnchor10.d();
                            constraintWidget3.N(d5 - constraintWidget3.l(), d5);
                            g(i6, constraintWidget3, interfaceC0033b);
                        } else if (z2 && !constraintWidget3.C()) {
                            e(i6, interfaceC0033b, constraintWidget3);
                        }
                    }
                }
            }
        }
        ConstraintAnchor i7 = constraintWidget.i(ConstraintAnchor.Type.BASELINE);
        if (i7.a != null && i7.c) {
            int c4 = i7.c();
            Iterator<ConstraintAnchor> it3 = i7.a.iterator();
            while (it3.hasNext()) {
                ConstraintAnchor next3 = it3.next();
                ConstraintWidget constraintWidget4 = next3.f261d;
                int i8 = i2 + 1;
                boolean a4 = a(constraintWidget4);
                if (constraintWidget4.D() && a4) {
                    e.g.a.h.c.f0(constraintWidget4, interfaceC0033b, new b.a(), 0);
                }
                if (constraintWidget4.t() != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || a4) {
                    if (!constraintWidget4.D() && next3 == constraintWidget4.N) {
                        int d6 = next3.d() + c4;
                        if (constraintWidget4.E) {
                            int i9 = d6 - constraintWidget4.c0;
                            int i10 = constraintWidget4.X + i9;
                            constraintWidget4.b0 = i9;
                            constraintWidget4.K.j(i9);
                            constraintWidget4.M.j(i10);
                            ConstraintAnchor constraintAnchor11 = constraintWidget4.N;
                            constraintAnchor11.b = d6;
                            constraintAnchor11.c = true;
                            constraintWidget4.f275l = true;
                        }
                        g(i8, constraintWidget4, interfaceC0033b);
                    }
                }
            }
        }
        constraintWidget.n = true;
    }
}
