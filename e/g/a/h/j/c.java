package e.g.a.h.j;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ChainRun.java */
/* loaded from: classes.dex */
public class c extends o {

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<o> f2062k;

    /* renamed from: l  reason: collision with root package name */
    public int f2063l;

    public c(ConstraintWidget constraintWidget, int i2) {
        super(constraintWidget);
        ConstraintWidget constraintWidget2;
        o oVar;
        int i3;
        o oVar2;
        this.f2062k = new ArrayList<>();
        this.f2095f = i2;
        ConstraintWidget constraintWidget3 = this.b;
        ConstraintWidget o = constraintWidget3.o(i2);
        while (true) {
            ConstraintWidget constraintWidget4 = o;
            constraintWidget2 = constraintWidget3;
            constraintWidget3 = constraintWidget4;
            if (constraintWidget3 == null) {
                break;
            }
            o = constraintWidget3.o(this.f2095f);
        }
        this.b = constraintWidget2;
        ArrayList<o> arrayList = this.f2062k;
        int i4 = this.f2095f;
        if (i4 == 0) {
            oVar = constraintWidget2.f267d;
        } else {
            oVar = i4 == 1 ? constraintWidget2.f268e : null;
        }
        arrayList.add(oVar);
        ConstraintWidget n = constraintWidget2.n(this.f2095f);
        while (n != null) {
            ArrayList<o> arrayList2 = this.f2062k;
            int i5 = this.f2095f;
            if (i5 == 0) {
                oVar2 = n.f267d;
            } else {
                oVar2 = i5 == 1 ? n.f268e : null;
            }
            arrayList2.add(oVar2);
            n = n.n(this.f2095f);
        }
        Iterator<o> it = this.f2062k.iterator();
        while (it.hasNext()) {
            o next = it.next();
            int i6 = this.f2095f;
            if (i6 == 0) {
                next.b.b = this;
            } else if (i6 == 1) {
                next.b.c = this;
            }
        }
        if ((this.f2095f == 0 && ((e.g.a.h.c) this.b.V).w0) && this.f2062k.size() > 1) {
            ArrayList<o> arrayList3 = this.f2062k;
            this.b = arrayList3.get(arrayList3.size() - 1).b;
        }
        if (this.f2095f == 0) {
            i3 = this.b.k0;
        } else {
            i3 = this.b.l0;
        }
        this.f2063l = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:271:0x03d1, code lost:
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d8  */
    @Override // e.g.a.h.j.o, e.g.a.h.j.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(e.g.a.h.j.d r26) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g.a.h.j.c.a(e.g.a.h.j.d):void");
    }

    @Override // e.g.a.h.j.o
    public void d() {
        Iterator<o> it = this.f2062k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.f2062k.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = this.f2062k.get(0).b;
        ConstraintWidget constraintWidget2 = this.f2062k.get(size - 1).b;
        if (this.f2095f == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.J;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.L;
            f i2 = i(constraintAnchor, 0);
            int d2 = constraintAnchor.d();
            ConstraintWidget m2 = m();
            if (m2 != null) {
                d2 = m2.J.d();
            }
            if (i2 != null) {
                f fVar = this.f2097h;
                fVar.f2077l.add(i2);
                fVar.f2071f = d2;
                i2.f2076k.add(fVar);
            }
            f i3 = i(constraintAnchor2, 0);
            int d3 = constraintAnchor2.d();
            ConstraintWidget n = n();
            if (n != null) {
                d3 = n.L.d();
            }
            if (i3 != null) {
                f fVar2 = this.f2098i;
                fVar2.f2077l.add(i3);
                fVar2.f2071f = -d3;
                i3.f2076k.add(fVar2);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.K;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.M;
            f i4 = i(constraintAnchor3, 1);
            int d4 = constraintAnchor3.d();
            ConstraintWidget m3 = m();
            if (m3 != null) {
                d4 = m3.K.d();
            }
            if (i4 != null) {
                f fVar3 = this.f2097h;
                fVar3.f2077l.add(i4);
                fVar3.f2071f = d4;
                i4.f2076k.add(fVar3);
            }
            f i5 = i(constraintAnchor4, 1);
            int d5 = constraintAnchor4.d();
            ConstraintWidget n2 = n();
            if (n2 != null) {
                d5 = n2.M.d();
            }
            if (i5 != null) {
                f fVar4 = this.f2098i;
                fVar4.f2077l.add(i5);
                fVar4.f2071f = -d5;
                i5.f2076k.add(fVar4);
            }
        }
        this.f2097h.a = this;
        this.f2098i.a = this;
    }

    @Override // e.g.a.h.j.o
    public void e() {
        for (int i2 = 0; i2 < this.f2062k.size(); i2++) {
            this.f2062k.get(i2).e();
        }
    }

    @Override // e.g.a.h.j.o
    public void f() {
        this.c = null;
        Iterator<o> it = this.f2062k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // e.g.a.h.j.o
    public long j() {
        int size = this.f2062k.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            o oVar = this.f2062k.get(i2);
            j2 = oVar.f2098i.f2071f + oVar.j() + j2 + oVar.f2097h.f2071f;
        }
        return j2;
    }

    @Override // e.g.a.h.j.o
    public boolean k() {
        int size = this.f2062k.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!this.f2062k.get(i2).k()) {
                return false;
            }
        }
        return true;
    }

    public final ConstraintWidget m() {
        for (int i2 = 0; i2 < this.f2062k.size(); i2++) {
            ConstraintWidget constraintWidget = this.f2062k.get(i2).b;
            if (constraintWidget.i0 != 8) {
                return constraintWidget;
            }
        }
        return null;
    }

    public final ConstraintWidget n() {
        for (int size = this.f2062k.size() - 1; size >= 0; size--) {
            ConstraintWidget constraintWidget = this.f2062k.get(size).b;
            if (constraintWidget.i0 != 8) {
                return constraintWidget;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f2095f == 0 ? "horizontal : " : "vertical : ");
        Iterator<o> it = this.f2062k.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append(it.next());
            sb.append("> ");
        }
        return sb.toString();
    }
}
