package e.g.a.h.j;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* compiled from: WidgetRun.java */
/* loaded from: classes.dex */
public abstract class o implements d {
    public int a;
    public ConstraintWidget b;
    public l c;

    /* renamed from: d  reason: collision with root package name */
    public ConstraintWidget.DimensionBehaviour f2093d;

    /* renamed from: e  reason: collision with root package name */
    public g f2094e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f2095f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2096g = false;

    /* renamed from: h  reason: collision with root package name */
    public f f2097h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public f f2098i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    public a f2099j = a.NONE;

    /* compiled from: WidgetRun.java */
    /* loaded from: classes.dex */
    public enum a {
        NONE,
        START,
        END,
        CENTER
    }

    public o(ConstraintWidget constraintWidget) {
        this.b = constraintWidget;
    }

    @Override // e.g.a.h.j.d
    public void a(d dVar) {
    }

    public final void b(f fVar, f fVar2, int i2) {
        fVar.f2077l.add(fVar2);
        fVar.f2071f = i2;
        fVar2.f2076k.add(fVar);
    }

    public final void c(f fVar, f fVar2, int i2, g gVar) {
        fVar.f2077l.add(fVar2);
        fVar.f2077l.add(this.f2094e);
        fVar.f2073h = i2;
        fVar.f2074i = gVar;
        fVar2.f2076k.add(fVar);
        gVar.f2076k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i2, int i3) {
        int max;
        if (i3 == 0) {
            ConstraintWidget constraintWidget = this.b;
            int i4 = constraintWidget.v;
            max = Math.max(constraintWidget.u, i2);
            if (i4 > 0) {
                max = Math.min(i4, i2);
            }
            if (max == i2) {
                return i2;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.b;
            int i5 = constraintWidget2.y;
            max = Math.max(constraintWidget2.x, i2);
            if (i5 > 0) {
                max = Math.min(i5, i2);
            }
            if (max == i2) {
                return i2;
            }
        }
        return max;
    }

    public final f h(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f263f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f261d;
        int ordinal = constraintAnchor2.f262e.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            return null;
                        }
                        return constraintWidget.f268e.f2088k;
                    }
                    return constraintWidget.f268e.f2098i;
                }
                return constraintWidget.f267d.f2098i;
            }
            return constraintWidget.f268e.f2097h;
        }
        return constraintWidget.f267d.f2097h;
    }

    public final f i(ConstraintAnchor constraintAnchor, int i2) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f263f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f261d;
        o oVar = i2 == 0 ? constraintWidget.f267d : constraintWidget.f268e;
        int ordinal = constraintAnchor2.f262e.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return oVar.f2097h;
        }
        if (ordinal == 3 || ordinal == 4) {
            return oVar.f2098i;
        }
        return null;
    }

    public long j() {
        g gVar = this.f2094e;
        if (gVar.f2075j) {
            return gVar.f2072g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
        if (r10.a == 3) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(androidx.constraintlayout.core.widgets.ConstraintAnchor r13, androidx.constraintlayout.core.widgets.ConstraintAnchor r14, int r15) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g.a.h.j.o.l(androidx.constraintlayout.core.widgets.ConstraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor, int):void");
    }
}
