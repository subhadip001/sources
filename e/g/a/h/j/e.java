package e.g.a.h.j;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import e.g.a.h.j.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: DependencyGraph.java */
/* loaded from: classes.dex */
public class e {
    public e.g.a.h.c a;

    /* renamed from: d  reason: collision with root package name */
    public e.g.a.h.c f2064d;

    /* renamed from: f  reason: collision with root package name */
    public b.InterfaceC0033b f2066f;

    /* renamed from: g  reason: collision with root package name */
    public b.a f2067g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<l> f2068h;
    public boolean b = true;
    public boolean c = true;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<o> f2065e = new ArrayList<>();

    public e(e.g.a.h.c cVar) {
        new ArrayList();
        this.f2066f = null;
        this.f2067g = new b.a();
        this.f2068h = new ArrayList<>();
        this.a = cVar;
        this.f2064d = cVar;
    }

    public final void a(f fVar, int i2, int i3, f fVar2, ArrayList<l> arrayList, l lVar) {
        o oVar = fVar.f2069d;
        if (oVar.c == null) {
            e.g.a.h.c cVar = this.a;
            if (oVar == cVar.f267d || oVar == cVar.f268e) {
                return;
            }
            if (lVar == null) {
                lVar = new l(oVar, i3);
                arrayList.add(lVar);
            }
            oVar.c = lVar;
            lVar.b.add(oVar);
            for (d dVar : oVar.f2097h.f2076k) {
                if (dVar instanceof f) {
                    a((f) dVar, i2, 0, fVar2, arrayList, lVar);
                }
            }
            for (d dVar2 : oVar.f2098i.f2076k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i2, 1, fVar2, arrayList, lVar);
                }
            }
            if (i2 == 1 && (oVar instanceof m)) {
                for (d dVar3 : ((m) oVar).f2088k.f2076k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i2, 2, fVar2, arrayList, lVar);
                    }
                }
            }
            for (f fVar3 : oVar.f2097h.f2077l) {
                a(fVar3, i2, 0, fVar2, arrayList, lVar);
            }
            for (f fVar4 : oVar.f2098i.f2077l) {
                a(fVar4, i2, 1, fVar2, arrayList, lVar);
            }
            if (i2 == 1 && (oVar instanceof m)) {
                for (f fVar5 : ((m) oVar).f2088k.f2077l) {
                    a(fVar5, i2, 2, fVar2, arrayList, lVar);
                }
            }
        }
    }

    public final boolean b(e.g.a.h.c cVar) {
        int i2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int i3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        Iterator<ConstraintWidget> it = cVar.r0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.U;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr[1];
            if (next.i0 == 8) {
                next.a = true;
            } else {
                float f2 = next.w;
                if (f2 < 1.0f && dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    next.r = 2;
                }
                float f3 = next.z;
                if (f3 < 1.0f && dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    next.s = 2;
                }
                if (next.Y > 0.0f) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour5 == dimensionBehaviour7 && (dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        next.r = 3;
                    } else if (dimensionBehaviour6 == dimensionBehaviour7 && (dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        next.s = 3;
                    } else if (dimensionBehaviour5 == dimensionBehaviour7 && dimensionBehaviour6 == dimensionBehaviour7) {
                        if (next.r == 0) {
                            next.r = 3;
                        }
                        if (next.s == 0) {
                            next.s = 3;
                        }
                    }
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour5 == dimensionBehaviour8 && next.r == 1 && (next.J.f263f == null || next.L.f263f == null)) {
                    dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = dimensionBehaviour5;
                if (dimensionBehaviour6 == dimensionBehaviour8 && next.s == 1 && (next.K.f263f == null || next.M.f263f == null)) {
                    dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = dimensionBehaviour6;
                k kVar = next.f267d;
                kVar.f2093d = dimensionBehaviour9;
                int i4 = next.r;
                kVar.a = i4;
                m mVar = next.f268e;
                mVar.f2093d = dimensionBehaviour10;
                int i5 = next.s;
                mVar.a = i5;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if ((dimensionBehaviour9 == dimensionBehaviour11 || dimensionBehaviour9 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour9 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour10 == dimensionBehaviour11 || dimensionBehaviour10 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour10 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
                    int u = next.u();
                    if (dimensionBehaviour9 == dimensionBehaviour11) {
                        i2 = (cVar.u() - next.J.f264g) - next.L.f264g;
                        dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
                    } else {
                        i2 = u;
                        dimensionBehaviour = dimensionBehaviour9;
                    }
                    int l2 = next.l();
                    if (dimensionBehaviour10 == dimensionBehaviour11) {
                        i3 = (cVar.l() - next.K.f264g) - next.M.f264g;
                        dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
                    } else {
                        i3 = l2;
                        dimensionBehaviour2 = dimensionBehaviour10;
                    }
                    f(next, dimensionBehaviour, i2, dimensionBehaviour2, i3);
                    next.f267d.f2094e.c(next.u());
                    next.f268e.f2094e.c(next.l());
                    next.a = true;
                } else {
                    if (dimensionBehaviour9 == dimensionBehaviour8 && (dimensionBehaviour10 == (dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour10 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        if (i4 == 3) {
                            if (dimensionBehaviour10 == dimensionBehaviour4) {
                                f(next, dimensionBehaviour4, 0, dimensionBehaviour4, 0);
                            }
                            int l3 = next.l();
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = ConstraintWidget.DimensionBehaviour.FIXED;
                            f(next, dimensionBehaviour12, (int) ((l3 * next.Y) + 0.5f), dimensionBehaviour12, l3);
                            next.f267d.f2094e.c(next.u());
                            next.f268e.f2094e.c(next.l());
                            next.a = true;
                        } else if (i4 == 1) {
                            f(next, dimensionBehaviour4, 0, dimensionBehaviour10, 0);
                            next.f267d.f2094e.f2086m = next.u();
                        } else if (i4 == 2) {
                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = cVar.U;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = dimensionBehaviourArr2[0];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour13 == dimensionBehaviour14 || dimensionBehaviourArr2[0] == dimensionBehaviour11) {
                                f(next, dimensionBehaviour14, (int) ((f2 * cVar.u()) + 0.5f), dimensionBehaviour10, next.l());
                                next.f267d.f2094e.c(next.u());
                                next.f268e.f2094e.c(next.l());
                                next.a = true;
                            }
                        } else {
                            ConstraintAnchor[] constraintAnchorArr = next.R;
                            if (constraintAnchorArr[0].f263f == null || constraintAnchorArr[1].f263f == null) {
                                f(next, dimensionBehaviour4, 0, dimensionBehaviour10, 0);
                                next.f267d.f2094e.c(next.u());
                                next.f268e.f2094e.c(next.l());
                                next.a = true;
                            }
                        }
                    }
                    if (dimensionBehaviour10 == dimensionBehaviour8 && (dimensionBehaviour9 == (dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour9 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        if (i5 == 3) {
                            if (dimensionBehaviour9 == dimensionBehaviour3) {
                                f(next, dimensionBehaviour3, 0, dimensionBehaviour3, 0);
                            }
                            int u2 = next.u();
                            float f4 = next.Y;
                            if (next.Z == -1) {
                                f4 = 1.0f / f4;
                            }
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = ConstraintWidget.DimensionBehaviour.FIXED;
                            f(next, dimensionBehaviour15, u2, dimensionBehaviour15, (int) ((u2 * f4) + 0.5f));
                            next.f267d.f2094e.c(next.u());
                            next.f268e.f2094e.c(next.l());
                            next.a = true;
                        } else if (i5 == 1) {
                            f(next, dimensionBehaviour9, 0, dimensionBehaviour3, 0);
                            next.f268e.f2094e.f2086m = next.l();
                        } else if (i5 == 2) {
                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr3 = cVar.U;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = dimensionBehaviourArr3[1];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour16 == dimensionBehaviour17 || dimensionBehaviourArr3[1] == dimensionBehaviour11) {
                                f(next, dimensionBehaviour9, next.u(), dimensionBehaviour17, (int) ((f3 * cVar.l()) + 0.5f));
                                next.f267d.f2094e.c(next.u());
                                next.f268e.f2094e.c(next.l());
                                next.a = true;
                            }
                        } else {
                            ConstraintAnchor[] constraintAnchorArr2 = next.R;
                            if (constraintAnchorArr2[2].f263f == null || constraintAnchorArr2[3].f263f == null) {
                                f(next, dimensionBehaviour3, 0, dimensionBehaviour10, 0);
                                next.f267d.f2094e.c(next.u());
                                next.f268e.f2094e.c(next.l());
                                next.a = true;
                            }
                        }
                    }
                    if (dimensionBehaviour9 == dimensionBehaviour8 && dimensionBehaviour10 == dimensionBehaviour8) {
                        if (i4 == 1 || i5 == 1) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour18 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                            f(next, dimensionBehaviour18, 0, dimensionBehaviour18, 0);
                            next.f267d.f2094e.f2086m = next.u();
                            next.f268e.f2094e.f2086m = next.l();
                        } else if (i5 == 2 && i4 == 2) {
                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr4 = cVar.U;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour19 = dimensionBehaviourArr4[0];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour20 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour19 == dimensionBehaviour20 && dimensionBehaviourArr4[1] == dimensionBehaviour20) {
                                f(next, dimensionBehaviour20, (int) ((f2 * cVar.u()) + 0.5f), dimensionBehaviour20, (int) ((f3 * cVar.l()) + 0.5f));
                                next.f267d.f2094e.c(next.u());
                                next.f268e.f2094e.c(next.l());
                                next.a = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public void c() {
        ArrayList<o> arrayList = this.f2065e;
        arrayList.clear();
        this.f2064d.f267d.f();
        this.f2064d.f268e.f();
        arrayList.add(this.f2064d.f267d);
        arrayList.add(this.f2064d.f268e);
        Iterator<ConstraintWidget> it = this.f2064d.r0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (next instanceof e.g.a.h.d) {
                arrayList.add(new i(next));
            } else {
                if (next.B()) {
                    if (next.b == null) {
                        next.b = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.b);
                } else {
                    arrayList.add(next.f267d);
                }
                if (next.C()) {
                    if (next.c == null) {
                        next.c = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.c);
                } else {
                    arrayList.add(next.f268e);
                }
                if (next instanceof e.g.a.h.f) {
                    arrayList.add(new j(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<o> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<o> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            o next2 = it3.next();
            if (next2.b != this.f2064d) {
                next2.d();
            }
        }
        this.f2068h.clear();
        l.c = 0;
        e(this.a.f267d, 0, this.f2068h);
        e(this.a.f268e, 1, this.f2068h);
        this.b = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(e.g.a.h.c r18, int r19) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g.a.h.j.e.d(e.g.a.h.c, int):int");
    }

    public final void e(o oVar, int i2, ArrayList<l> arrayList) {
        for (d dVar : oVar.f2097h.f2076k) {
            if (dVar instanceof f) {
                a((f) dVar, i2, 0, oVar.f2098i, arrayList, null);
            } else if (dVar instanceof o) {
                a(((o) dVar).f2097h, i2, 0, oVar.f2098i, arrayList, null);
            }
        }
        for (d dVar2 : oVar.f2098i.f2076k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i2, 1, oVar.f2097h, arrayList, null);
            } else if (dVar2 instanceof o) {
                a(((o) dVar2).f2098i, i2, 1, oVar.f2097h, arrayList, null);
            }
        }
        if (i2 == 1) {
            for (d dVar3 : ((m) oVar).f2088k.f2076k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i2, 2, null, arrayList, null);
                }
            }
        }
    }

    public final void f(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i2, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i3) {
        b.a aVar = this.f2067g;
        aVar.a = dimensionBehaviour;
        aVar.b = dimensionBehaviour2;
        aVar.c = i2;
        aVar.f2055d = i3;
        ((ConstraintLayout.b) this.f2066f).b(constraintWidget, aVar);
        constraintWidget.T(this.f2067g.f2056e);
        constraintWidget.O(this.f2067g.f2057f);
        b.a aVar2 = this.f2067g;
        constraintWidget.E = aVar2.f2059h;
        constraintWidget.L(aVar2.f2058g);
    }

    public void g() {
        g gVar;
        Iterator<ConstraintWidget> it = this.a.r0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (!next.a) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.U;
                boolean z = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i2 = next.r;
                int i3 = next.s;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z2 = dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i2 == 1);
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i3 == 1)) {
                    z = true;
                }
                g gVar2 = next.f267d.f2094e;
                boolean z3 = gVar2.f2075j;
                g gVar3 = next.f268e.f2094e;
                boolean z4 = gVar3.f2075j;
                if (z3 && z4) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    f(next, dimensionBehaviour4, gVar2.f2072g, dimensionBehaviour4, gVar3.f2072g);
                    next.a = true;
                } else if (z3 && z) {
                    f(next, ConstraintWidget.DimensionBehaviour.FIXED, gVar2.f2072g, dimensionBehaviour3, gVar3.f2072g);
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        next.f268e.f2094e.f2086m = next.l();
                    } else {
                        next.f268e.f2094e.c(next.l());
                        next.a = true;
                    }
                } else if (z4 && z2) {
                    f(next, dimensionBehaviour3, gVar2.f2072g, ConstraintWidget.DimensionBehaviour.FIXED, gVar3.f2072g);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        next.f267d.f2094e.f2086m = next.u();
                    } else {
                        next.f267d.f2094e.c(next.u());
                        next.a = true;
                    }
                }
                if (next.a && (gVar = next.f268e.f2089l) != null) {
                    gVar.c(next.c0);
                }
            }
        }
    }
}
