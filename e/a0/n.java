package e.a0;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import e.a0.h;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionSet.java */
/* loaded from: classes.dex */
public class n extends h {
    public int E;
    public ArrayList<h> C = new ArrayList<>();
    public boolean D = true;
    public boolean F = false;
    public int G = 0;

    /* compiled from: TransitionSet.java */
    /* loaded from: classes.dex */
    public class a extends k {
        public final /* synthetic */ h a;

        public a(n nVar, h hVar) {
            this.a = hVar;
        }

        @Override // e.a0.h.d
        public void c(h hVar) {
            this.a.y();
            hVar.v(this);
        }
    }

    /* compiled from: TransitionSet.java */
    /* loaded from: classes.dex */
    public static class b extends k {
        public n a;

        public b(n nVar) {
            this.a = nVar;
        }

        @Override // e.a0.k, e.a0.h.d
        public void a(h hVar) {
            n nVar = this.a;
            if (nVar.F) {
                return;
            }
            nVar.F();
            this.a.F = true;
        }

        @Override // e.a0.h.d
        public void c(h hVar) {
            n nVar = this.a;
            int i2 = nVar.E - 1;
            nVar.E = i2;
            if (i2 == 0) {
                nVar.F = false;
                nVar.m();
            }
            hVar.v(this);
        }
    }

    @Override // e.a0.h
    public void A(h.c cVar) {
        this.x = cVar;
        this.G |= 8;
        int size = this.C.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.C.get(i2).A(cVar);
        }
    }

    @Override // e.a0.h
    public h B(TimeInterpolator timeInterpolator) {
        this.G |= 1;
        ArrayList<h> arrayList = this.C;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.C.get(i2).B(timeInterpolator);
            }
        }
        this.f1436i = timeInterpolator;
        return this;
    }

    @Override // e.a0.h
    public void C(e eVar) {
        if (eVar == null) {
            this.y = h.A;
        } else {
            this.y = eVar;
        }
        this.G |= 4;
        if (this.C != null) {
            for (int i2 = 0; i2 < this.C.size(); i2++) {
                this.C.get(i2).C(eVar);
            }
        }
    }

    @Override // e.a0.h
    public void D(m mVar) {
        this.G |= 2;
        int size = this.C.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.C.get(i2).D(mVar);
        }
    }

    @Override // e.a0.h
    public h E(long j2) {
        this.f1434g = j2;
        return this;
    }

    @Override // e.a0.h
    public String G(String str) {
        String G = super.G(str);
        for (int i2 = 0; i2 < this.C.size(); i2++) {
            StringBuilder D = f.a.b.a.a.D(G, "\n");
            D.append(this.C.get(i2).G(str + "  "));
            G = D.toString();
        }
        return G;
    }

    public n H(h hVar) {
        this.C.add(hVar);
        hVar.n = this;
        long j2 = this.f1435h;
        if (j2 >= 0) {
            hVar.z(j2);
        }
        if ((this.G & 1) != 0) {
            hVar.B(this.f1436i);
        }
        if ((this.G & 2) != 0) {
            hVar.D(null);
        }
        if ((this.G & 4) != 0) {
            hVar.C(this.y);
        }
        if ((this.G & 8) != 0) {
            hVar.A(this.x);
        }
        return this;
    }

    public h I(int i2) {
        if (i2 < 0 || i2 >= this.C.size()) {
            return null;
        }
        return this.C.get(i2);
    }

    public n J(int i2) {
        if (i2 == 0) {
            this.D = true;
        } else if (i2 == 1) {
            this.D = false;
        } else {
            throw new AndroidRuntimeException(f.a.b.a.a.i("Invalid parameter for TransitionSet ordering: ", i2));
        }
        return this;
    }

    @Override // e.a0.h
    public h a(h.d dVar) {
        super.a(dVar);
        return this;
    }

    @Override // e.a0.h
    public h b(View view) {
        for (int i2 = 0; i2 < this.C.size(); i2++) {
            this.C.get(i2).b(view);
        }
        this.f1438k.add(view);
        return this;
    }

    @Override // e.a0.h
    public void d(p pVar) {
        if (s(pVar.b)) {
            Iterator<h> it = this.C.iterator();
            while (it.hasNext()) {
                h next = it.next();
                if (next.s(pVar.b)) {
                    next.d(pVar);
                    pVar.c.add(next);
                }
            }
        }
    }

    @Override // e.a0.h
    public void f(p pVar) {
        int size = this.C.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.C.get(i2).f(pVar);
        }
    }

    @Override // e.a0.h
    public void g(p pVar) {
        if (s(pVar.b)) {
            Iterator<h> it = this.C.iterator();
            while (it.hasNext()) {
                h next = it.next();
                if (next.s(pVar.b)) {
                    next.g(pVar);
                    pVar.c.add(next);
                }
            }
        }
    }

    @Override // e.a0.h
    /* renamed from: j */
    public h clone() {
        n nVar = (n) super.clone();
        nVar.C = new ArrayList<>();
        int size = this.C.size();
        for (int i2 = 0; i2 < size; i2++) {
            h clone = this.C.get(i2).clone();
            nVar.C.add(clone);
            clone.n = nVar;
        }
        return nVar;
    }

    @Override // e.a0.h
    public void l(ViewGroup viewGroup, q qVar, q qVar2, ArrayList<p> arrayList, ArrayList<p> arrayList2) {
        long j2 = this.f1434g;
        int size = this.C.size();
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = this.C.get(i2);
            if (j2 > 0 && (this.D || i2 == 0)) {
                long j3 = hVar.f1434g;
                if (j3 > 0) {
                    hVar.E(j3 + j2);
                } else {
                    hVar.E(j2);
                }
            }
            hVar.l(viewGroup, qVar, qVar2, arrayList, arrayList2);
        }
    }

    @Override // e.a0.h
    public void u(View view) {
        super.u(view);
        int size = this.C.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.C.get(i2).u(view);
        }
    }

    @Override // e.a0.h
    public h v(h.d dVar) {
        super.v(dVar);
        return this;
    }

    @Override // e.a0.h
    public h w(View view) {
        for (int i2 = 0; i2 < this.C.size(); i2++) {
            this.C.get(i2).w(view);
        }
        this.f1438k.remove(view);
        return this;
    }

    @Override // e.a0.h
    public void x(View view) {
        super.x(view);
        int size = this.C.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.C.get(i2).x(view);
        }
    }

    @Override // e.a0.h
    public void y() {
        if (this.C.isEmpty()) {
            F();
            m();
            return;
        }
        b bVar = new b(this);
        Iterator<h> it = this.C.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.E = this.C.size();
        if (!this.D) {
            for (int i2 = 1; i2 < this.C.size(); i2++) {
                this.C.get(i2 - 1).a(new a(this, this.C.get(i2)));
            }
            h hVar = this.C.get(0);
            if (hVar != null) {
                hVar.y();
                return;
            }
            return;
        }
        Iterator<h> it2 = this.C.iterator();
        while (it2.hasNext()) {
            it2.next().y();
        }
    }

    @Override // e.a0.h
    public h z(long j2) {
        ArrayList<h> arrayList;
        this.f1435h = j2;
        if (j2 >= 0 && (arrayList = this.C) != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.C.get(i2).z(j2);
            }
        }
        return this;
    }
}
