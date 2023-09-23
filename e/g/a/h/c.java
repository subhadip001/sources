package e.g.a.h;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import e.g.a.h.j.b;
import e.g.a.h.j.o;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ConstraintWidgetContainer.java */
/* loaded from: classes.dex */
public class c extends i {
    public int u0;
    public int y0;
    public int z0;
    public e.g.a.h.j.b s0 = new e.g.a.h.j.b(this);
    public e.g.a.h.j.e t0 = new e.g.a.h.j.e(this);
    public b.InterfaceC0033b v0 = null;
    public boolean w0 = false;
    public e.g.a.d x0 = new e.g.a.d();
    public int A0 = 0;
    public int B0 = 0;
    public b[] C0 = new b[4];
    public b[] D0 = new b[4];
    public int E0 = 257;
    public boolean F0 = false;
    public boolean G0 = false;
    public WeakReference<ConstraintAnchor> H0 = null;
    public WeakReference<ConstraintAnchor> I0 = null;
    public WeakReference<ConstraintAnchor> J0 = null;
    public WeakReference<ConstraintAnchor> K0 = null;
    public HashSet<ConstraintWidget> L0 = new HashSet<>();
    public b.a M0 = new b.a();

    public static boolean f0(ConstraintWidget constraintWidget, b.InterfaceC0033b interfaceC0033b, b.a aVar, int i2) {
        int i3;
        int i4;
        if (interfaceC0033b == null) {
            return false;
        }
        if (constraintWidget.i0 != 8 && !(constraintWidget instanceof d) && !(constraintWidget instanceof a)) {
            aVar.a = constraintWidget.m();
            aVar.b = constraintWidget.t();
            aVar.c = constraintWidget.u();
            aVar.f2055d = constraintWidget.l();
            aVar.f2060i = false;
            aVar.f2061j = i2;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z = dimensionBehaviour == dimensionBehaviour2;
            boolean z2 = aVar.b == dimensionBehaviour2;
            boolean z3 = z && constraintWidget.Y > 0.0f;
            boolean z4 = z2 && constraintWidget.Y > 0.0f;
            if (z && constraintWidget.x(0) && constraintWidget.r == 0 && !z3) {
                aVar.a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (z2 && constraintWidget.s == 0) {
                    aVar.a = ConstraintWidget.DimensionBehaviour.FIXED;
                }
                z = false;
            }
            if (z2 && constraintWidget.x(1) && constraintWidget.s == 0 && !z4) {
                aVar.b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (z && constraintWidget.r == 0) {
                    aVar.b = ConstraintWidget.DimensionBehaviour.FIXED;
                }
                z2 = false;
            }
            if (constraintWidget.E()) {
                aVar.a = ConstraintWidget.DimensionBehaviour.FIXED;
                z = false;
            }
            if (constraintWidget.F()) {
                aVar.b = ConstraintWidget.DimensionBehaviour.FIXED;
                z2 = false;
            }
            if (z3) {
                if (constraintWidget.t[0] == 4) {
                    aVar.a = ConstraintWidget.DimensionBehaviour.FIXED;
                } else if (!z2) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = aVar.b;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    if (dimensionBehaviour3 == dimensionBehaviour4) {
                        i4 = aVar.f2055d;
                    } else {
                        aVar.a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        ((ConstraintLayout.b) interfaceC0033b).b(constraintWidget, aVar);
                        i4 = aVar.f2057f;
                    }
                    aVar.a = dimensionBehaviour4;
                    aVar.c = (int) (constraintWidget.Y * i4);
                }
            }
            if (z4) {
                if (constraintWidget.t[1] == 4) {
                    aVar.b = ConstraintWidget.DimensionBehaviour.FIXED;
                } else if (!z) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = aVar.a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
                    if (dimensionBehaviour5 == dimensionBehaviour6) {
                        i3 = aVar.c;
                    } else {
                        aVar.b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        ((ConstraintLayout.b) interfaceC0033b).b(constraintWidget, aVar);
                        i3 = aVar.f2056e;
                    }
                    aVar.b = dimensionBehaviour6;
                    if (constraintWidget.Z == -1) {
                        aVar.f2055d = (int) (i3 / constraintWidget.Y);
                    } else {
                        aVar.f2055d = (int) (constraintWidget.Y * i3);
                    }
                }
            }
            ((ConstraintLayout.b) interfaceC0033b).b(constraintWidget, aVar);
            constraintWidget.T(aVar.f2056e);
            constraintWidget.O(aVar.f2057f);
            constraintWidget.E = aVar.f2059h;
            constraintWidget.L(aVar.f2058g);
            aVar.f2061j = 0;
            return aVar.f2060i;
        }
        aVar.f2056e = 0;
        aVar.f2057f = 0;
        return false;
    }

    @Override // e.g.a.h.i, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void G() {
        this.x0.u();
        this.y0 = 0;
        this.z0 = 0;
        super.G();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void U(boolean z, boolean z2) {
        super.U(z, z2);
        int size = this.r0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.r0.get(i2).U(z, z2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:348:0x05d5, code lost:
        r2 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:333:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x05d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x07ea A[LOOP:14: B:463:0x07e8->B:464:0x07ea, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x08d0  */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // e.g.a.h.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void W() {
        /*
            Method dump skipped, instructions count: 2272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g.a.h.c.W():void");
    }

    public void X(ConstraintWidget constraintWidget, int i2) {
        if (i2 == 0) {
            int i3 = this.A0 + 1;
            b[] bVarArr = this.D0;
            if (i3 >= bVarArr.length) {
                this.D0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.D0;
            int i4 = this.A0;
            bVarArr2[i4] = new b(constraintWidget, 0, this.w0);
            this.A0 = i4 + 1;
        } else if (i2 == 1) {
            int i5 = this.B0 + 1;
            b[] bVarArr3 = this.C0;
            if (i5 >= bVarArr3.length) {
                this.C0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.C0;
            int i6 = this.B0;
            bVarArr4[i6] = new b(constraintWidget, 1, this.w0);
            this.B0 = i6 + 1;
        }
    }

    public boolean Y(e.g.a.d dVar) {
        boolean z;
        boolean g0 = g0(64);
        d(dVar, g0);
        int size = this.r0.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = this.r0.get(i2);
            boolean[] zArr = constraintWidget.T;
            zArr[0] = false;
            zArr[1] = false;
            if (constraintWidget instanceof a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i3 = 0; i3 < size; i3++) {
                ConstraintWidget constraintWidget2 = this.r0.get(i3);
                if (constraintWidget2 instanceof a) {
                    a aVar = (a) constraintWidget2;
                    for (int i4 = 0; i4 < aVar.s0; i4++) {
                        ConstraintWidget constraintWidget3 = aVar.r0[i4];
                        if (aVar.u0 || constraintWidget3.e()) {
                            int i5 = aVar.t0;
                            if (i5 == 0 || i5 == 1) {
                                constraintWidget3.T[0] = true;
                            } else if (i5 == 2 || i5 == 3) {
                                constraintWidget3.T[1] = true;
                            }
                        }
                    }
                }
            }
        }
        this.L0.clear();
        for (int i6 = 0; i6 < size; i6++) {
            ConstraintWidget constraintWidget4 = this.r0.get(i6);
            if (constraintWidget4.c()) {
                if (constraintWidget4 instanceof h) {
                    this.L0.add(constraintWidget4);
                } else {
                    constraintWidget4.d(dVar, g0);
                }
            }
        }
        while (this.L0.size() > 0) {
            int size2 = this.L0.size();
            Iterator<ConstraintWidget> it = this.L0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                h hVar = (h) it.next();
                HashSet<ConstraintWidget> hashSet = this.L0;
                int i7 = 0;
                while (true) {
                    if (i7 >= hVar.s0) {
                        z = false;
                        continue;
                        break;
                    } else if (hashSet.contains(hVar.r0[i7])) {
                        z = true;
                        continue;
                        break;
                    } else {
                        i7++;
                    }
                }
                if (z) {
                    hVar.d(dVar, g0);
                    this.L0.remove(hVar);
                    break;
                }
            }
            if (size2 == this.L0.size()) {
                Iterator<ConstraintWidget> it2 = this.L0.iterator();
                while (it2.hasNext()) {
                    it2.next().d(dVar, g0);
                }
                this.L0.clear();
            }
        }
        if (e.g.a.d.p) {
            HashSet<ConstraintWidget> hashSet2 = new HashSet<>();
            for (int i8 = 0; i8 < size; i8++) {
                ConstraintWidget constraintWidget5 = this.r0.get(i8);
                if (!constraintWidget5.c()) {
                    hashSet2.add(constraintWidget5);
                }
            }
            b(this, dVar, hashSet2, m() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT ? 0 : 1, false);
            Iterator<ConstraintWidget> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                ConstraintWidget next = it3.next();
                g.a(this, dVar, next);
                next.d(dVar, g0);
            }
        } else {
            for (int i9 = 0; i9 < size; i9++) {
                ConstraintWidget constraintWidget6 = this.r0.get(i9);
                if (constraintWidget6 instanceof c) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget6.U;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.P(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.S(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget6.d(dVar, g0);
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.P(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.S(dimensionBehaviour2);
                    }
                } else {
                    g.a(this, dVar, constraintWidget6);
                    if (!constraintWidget6.c()) {
                        constraintWidget6.d(dVar, g0);
                    }
                }
            }
        }
        if (this.A0 > 0) {
            e.e.a.a(this, dVar, null, 0);
        }
        if (this.B0 > 0) {
            e.e.a.a(this, dVar, null, 1);
        }
        return true;
    }

    public void Z(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.K0;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.c() > this.K0.get().c()) {
            this.K0 = new WeakReference<>(constraintAnchor);
        }
    }

    public void a0(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.I0;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.c() > this.I0.get().c()) {
            this.I0 = new WeakReference<>(constraintAnchor);
        }
    }

    public void b0(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.J0;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.c() > this.J0.get().c()) {
            this.J0 = new WeakReference<>(constraintAnchor);
        }
    }

    public void c0(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.H0;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.c() > this.H0.get().c()) {
            this.H0 = new WeakReference<>(constraintAnchor);
        }
    }

    public boolean d0(boolean z, int i2) {
        boolean z2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        e.g.a.h.j.e eVar = this.t0;
        boolean z3 = true;
        boolean z4 = z & true;
        ConstraintWidget.DimensionBehaviour k2 = eVar.a.k(0);
        ConstraintWidget.DimensionBehaviour k3 = eVar.a.k(1);
        int v = eVar.a.v();
        int w = eVar.a.w();
        if (z4 && (k2 == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || k3 == dimensionBehaviour)) {
            Iterator<o> it = eVar.f2065e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                o next = it.next();
                if (next.f2095f == i2 && !next.k()) {
                    z4 = false;
                    break;
                }
            }
            if (i2 == 0) {
                if (z4 && k2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    eVar.a.P(ConstraintWidget.DimensionBehaviour.FIXED);
                    c cVar = eVar.a;
                    cVar.T(eVar.d(cVar, 0));
                    c cVar2 = eVar.a;
                    cVar2.f267d.f2094e.c(cVar2.u());
                }
            } else if (z4 && k3 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                eVar.a.S(ConstraintWidget.DimensionBehaviour.FIXED);
                c cVar3 = eVar.a;
                cVar3.O(eVar.d(cVar3, 1));
                c cVar4 = eVar.a;
                cVar4.f268e.f2094e.c(cVar4.l());
            }
        }
        if (i2 == 0) {
            c cVar5 = eVar.a;
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = cVar5.U;
            if (dimensionBehaviourArr[0] == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviourArr[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int u = cVar5.u() + v;
                eVar.a.f267d.f2098i.c(u);
                eVar.a.f267d.f2094e.c(u - v);
                z2 = true;
            }
            z2 = false;
        } else {
            c cVar6 = eVar.a;
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = cVar6.U;
            if (dimensionBehaviourArr2[1] == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviourArr2[1] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int l2 = cVar6.l() + w;
                eVar.a.f268e.f2098i.c(l2);
                eVar.a.f268e.f2094e.c(l2 - w);
                z2 = true;
            }
            z2 = false;
        }
        eVar.g();
        Iterator<o> it2 = eVar.f2065e.iterator();
        while (it2.hasNext()) {
            o next2 = it2.next();
            if (next2.f2095f == i2 && (next2.b != eVar.a || next2.f2096g)) {
                next2.e();
            }
        }
        Iterator<o> it3 = eVar.f2065e.iterator();
        while (it3.hasNext()) {
            o next3 = it3.next();
            if (next3.f2095f == i2 && (z2 || next3.b != eVar.a)) {
                if (!next3.f2097h.f2075j || !next3.f2098i.f2075j || (!(next3 instanceof e.g.a.h.j.c) && !next3.f2094e.f2075j)) {
                    z3 = false;
                    break;
                }
            }
        }
        eVar.a.P(k2);
        eVar.a.S(k3);
        return z3;
    }

    public void e0() {
        this.t0.b = true;
    }

    public boolean g0(int i2) {
        return (this.E0 & i2) == i2;
    }

    public void h0(int i2) {
        this.E0 = i2;
        e.g.a.d.p = g0(512);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void q(StringBuilder sb) {
        sb.append(this.f273j + ":{\n");
        sb.append("  actualWidth:" + this.W);
        sb.append("\n");
        sb.append("  actualHeight:" + this.X);
        sb.append("\n");
        Iterator<ConstraintWidget> it = this.r0.iterator();
        while (it.hasNext()) {
            it.next().q(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
