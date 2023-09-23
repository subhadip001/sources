package e.g.a.h.j;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* compiled from: GuidelineReference.java */
/* loaded from: classes.dex */
public class i extends o {
    public i(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.f267d.f();
        constraintWidget.f268e.f();
        this.f2095f = ((e.g.a.h.d) constraintWidget).v0;
    }

    @Override // e.g.a.h.j.o, e.g.a.h.j.d
    public void a(d dVar) {
        f fVar = this.f2097h;
        if (fVar.c && !fVar.f2075j) {
            this.f2097h.c((int) ((fVar.f2077l.get(0).f2072g * ((e.g.a.h.d) this.b).r0) + 0.5f));
        }
    }

    @Override // e.g.a.h.j.o
    public void d() {
        ConstraintWidget constraintWidget = this.b;
        e.g.a.h.d dVar = (e.g.a.h.d) constraintWidget;
        int i2 = dVar.s0;
        int i3 = dVar.t0;
        if (dVar.v0 == 1) {
            if (i2 != -1) {
                this.f2097h.f2077l.add(constraintWidget.V.f267d.f2097h);
                this.b.V.f267d.f2097h.f2076k.add(this.f2097h);
                this.f2097h.f2071f = i2;
            } else if (i3 != -1) {
                this.f2097h.f2077l.add(constraintWidget.V.f267d.f2098i);
                this.b.V.f267d.f2098i.f2076k.add(this.f2097h);
                this.f2097h.f2071f = -i3;
            } else {
                f fVar = this.f2097h;
                fVar.b = true;
                fVar.f2077l.add(constraintWidget.V.f267d.f2098i);
                this.b.V.f267d.f2098i.f2076k.add(this.f2097h);
            }
            m(this.b.f267d.f2097h);
            m(this.b.f267d.f2098i);
            return;
        }
        if (i2 != -1) {
            this.f2097h.f2077l.add(constraintWidget.V.f268e.f2097h);
            this.b.V.f268e.f2097h.f2076k.add(this.f2097h);
            this.f2097h.f2071f = i2;
        } else if (i3 != -1) {
            this.f2097h.f2077l.add(constraintWidget.V.f268e.f2098i);
            this.b.V.f268e.f2098i.f2076k.add(this.f2097h);
            this.f2097h.f2071f = -i3;
        } else {
            f fVar2 = this.f2097h;
            fVar2.b = true;
            fVar2.f2077l.add(constraintWidget.V.f268e.f2098i);
            this.b.V.f268e.f2098i.f2076k.add(this.f2097h);
        }
        m(this.b.f268e.f2097h);
        m(this.b.f268e.f2098i);
    }

    @Override // e.g.a.h.j.o
    public void e() {
        ConstraintWidget constraintWidget = this.b;
        if (((e.g.a.h.d) constraintWidget).v0 == 1) {
            constraintWidget.a0 = this.f2097h.f2072g;
        } else {
            constraintWidget.b0 = this.f2097h.f2072g;
        }
    }

    @Override // e.g.a.h.j.o
    public void f() {
        this.f2097h.b();
    }

    @Override // e.g.a.h.j.o
    public boolean k() {
        return false;
    }

    public final void m(f fVar) {
        this.f2097h.f2076k.add(fVar);
        fVar.f2077l.add(this.f2097h);
    }
}
