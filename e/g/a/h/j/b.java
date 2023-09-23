package e.g.a.h.j;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* compiled from: BasicMeasure.java */
/* loaded from: classes.dex */
public class b {
    public final ArrayList<ConstraintWidget> a = new ArrayList<>();
    public a b = new a();
    public e.g.a.h.c c;

    /* compiled from: BasicMeasure.java */
    /* loaded from: classes.dex */
    public static class a {
        public ConstraintWidget.DimensionBehaviour a;
        public ConstraintWidget.DimensionBehaviour b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f2055d;

        /* renamed from: e  reason: collision with root package name */
        public int f2056e;

        /* renamed from: f  reason: collision with root package name */
        public int f2057f;

        /* renamed from: g  reason: collision with root package name */
        public int f2058g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2059h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f2060i;

        /* renamed from: j  reason: collision with root package name */
        public int f2061j;
    }

    /* compiled from: BasicMeasure.java */
    /* renamed from: e.g.a.h.j.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0033b {
    }

    public b(e.g.a.h.c cVar) {
        this.c = cVar;
    }

    public final boolean a(InterfaceC0033b interfaceC0033b, ConstraintWidget constraintWidget, int i2) {
        this.b.a = constraintWidget.m();
        this.b.b = constraintWidget.t();
        this.b.c = constraintWidget.u();
        this.b.f2055d = constraintWidget.l();
        a aVar = this.b;
        aVar.f2060i = false;
        aVar.f2061j = i2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = dimensionBehaviour == dimensionBehaviour2;
        boolean z2 = aVar.b == dimensionBehaviour2;
        boolean z3 = z && constraintWidget.Y > 0.0f;
        boolean z4 = z2 && constraintWidget.Y > 0.0f;
        if (z3 && constraintWidget.t[0] == 4) {
            aVar.a = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z4 && constraintWidget.t[1] == 4) {
            aVar.b = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        ((ConstraintLayout.b) interfaceC0033b).b(constraintWidget, aVar);
        constraintWidget.T(this.b.f2056e);
        constraintWidget.O(this.b.f2057f);
        a aVar2 = this.b;
        constraintWidget.E = aVar2.f2059h;
        constraintWidget.L(aVar2.f2058g);
        a aVar3 = this.b;
        aVar3.f2061j = 0;
        return aVar3.f2060i;
    }

    public final void b(e.g.a.h.c cVar, int i2, int i3, int i4) {
        int i5 = cVar.d0;
        int i6 = cVar.e0;
        cVar.R(0);
        cVar.Q(0);
        cVar.W = i3;
        int i7 = cVar.d0;
        if (i3 < i7) {
            cVar.W = i7;
        }
        cVar.X = i4;
        int i8 = cVar.e0;
        if (i4 < i8) {
            cVar.X = i8;
        }
        cVar.R(i5);
        cVar.Q(i6);
        e.g.a.h.c cVar2 = this.c;
        cVar2.u0 = i2;
        cVar2.W();
    }

    public void c(e.g.a.h.c cVar) {
        this.a.clear();
        int size = cVar.r0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = cVar.r0.get(i2);
            ConstraintWidget.DimensionBehaviour m2 = constraintWidget.m();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (m2 == dimensionBehaviour || constraintWidget.t() == dimensionBehaviour) {
                this.a.add(constraintWidget);
            }
        }
        cVar.e0();
    }
}
