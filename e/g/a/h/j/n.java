package e.g.a.h.j;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: WidgetGroup.java */
/* loaded from: classes.dex */
public class n {

    /* renamed from: f  reason: collision with root package name */
    public static int f2090f;
    public int b;
    public int c;
    public ArrayList<ConstraintWidget> a = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<a> f2091d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f2092e = -1;

    /* compiled from: WidgetGroup.java */
    /* loaded from: classes.dex */
    public class a {
        public a(n nVar, ConstraintWidget constraintWidget, e.g.a.d dVar, int i2) {
            new WeakReference(constraintWidget);
            dVar.o(constraintWidget.J);
            dVar.o(constraintWidget.K);
            dVar.o(constraintWidget.L);
            dVar.o(constraintWidget.M);
            dVar.o(constraintWidget.N);
        }
    }

    public n(int i2) {
        this.b = -1;
        this.c = 0;
        int i3 = f2090f;
        f2090f = i3 + 1;
        this.b = i3;
        this.c = i2;
    }

    public boolean a(ConstraintWidget constraintWidget) {
        if (this.a.contains(constraintWidget)) {
            return false;
        }
        this.a.add(constraintWidget);
        return true;
    }

    public void b(ArrayList<n> arrayList) {
        int size = this.a.size();
        if (this.f2092e != -1 && size > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                n nVar = arrayList.get(i2);
                if (this.f2092e == nVar.b) {
                    d(this.c, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c(e.g.a.d dVar, int i2) {
        int o;
        int o2;
        if (this.a.size() == 0) {
            return 0;
        }
        ArrayList<ConstraintWidget> arrayList = this.a;
        e.g.a.h.c cVar = (e.g.a.h.c) arrayList.get(0).V;
        dVar.u();
        cVar.d(dVar, false);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList.get(i3).d(dVar, false);
        }
        if (i2 == 0 && cVar.A0 > 0) {
            e.e.a.a(cVar, dVar, arrayList, 0);
        }
        if (i2 == 1 && cVar.B0 > 0) {
            e.e.a.a(cVar, dVar, arrayList, 1);
        }
        try {
            dVar.q();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f2091d = new ArrayList<>();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            this.f2091d.add(new a(this, arrayList.get(i4), dVar, i2));
        }
        if (i2 == 0) {
            o = dVar.o(cVar.J);
            o2 = dVar.o(cVar.L);
            dVar.u();
        } else {
            o = dVar.o(cVar.K);
            o2 = dVar.o(cVar.M);
            dVar.u();
        }
        return o2 - o;
    }

    public void d(int i2, n nVar) {
        Iterator<ConstraintWidget> it = this.a.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            nVar.a(next);
            if (i2 == 0) {
                next.p0 = nVar.b;
            } else {
                next.q0 = nVar.b;
            }
        }
        this.f2092e = nVar.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i2 = this.c;
        sb.append(i2 == 0 ? "Horizontal" : i2 == 1 ? "Vertical" : i2 == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String t = f.a.b.a.a.t(sb, this.b, "] <");
        Iterator<ConstraintWidget> it = this.a.iterator();
        while (it.hasNext()) {
            StringBuilder D = f.a.b.a.a.D(t, " ");
            D.append(it.next().j0);
            t = D.toString();
        }
        return f.a.b.a.a.p(t, " >");
    }
}
