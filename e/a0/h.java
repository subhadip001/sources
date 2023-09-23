package e.a0;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import e.i.j.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Transition.java */
/* loaded from: classes.dex */
public abstract class h implements Cloneable {
    public ArrayList<p> p;
    public ArrayList<p> q;
    public c x;
    public static final int[] z = {2, 1, 3, 4};
    public static final e A = new a();
    public static ThreadLocal<e.f.a<Animator, b>> B = new ThreadLocal<>();

    /* renamed from: f  reason: collision with root package name */
    public String f1433f = getClass().getName();

    /* renamed from: g  reason: collision with root package name */
    public long f1434g = -1;

    /* renamed from: h  reason: collision with root package name */
    public long f1435h = -1;

    /* renamed from: i  reason: collision with root package name */
    public TimeInterpolator f1436i = null;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<Integer> f1437j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<View> f1438k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public q f1439l = new q();

    /* renamed from: m  reason: collision with root package name */
    public q f1440m = new q();
    public n n = null;
    public int[] o = z;
    public ArrayList<Animator> r = new ArrayList<>();
    public int s = 0;
    public boolean t = false;
    public boolean u = false;
    public ArrayList<d> v = null;
    public ArrayList<Animator> w = new ArrayList<>();
    public e y = A;

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public static class a extends e {
        @Override // e.a0.e
        public Path a(float f2, float f3, float f4, float f5) {
            Path path = new Path();
            path.moveTo(f2, f3);
            path.lineTo(f4, f5);
            return path;
        }
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public static class b {
        public View a;
        public String b;
        public p c;

        /* renamed from: d  reason: collision with root package name */
        public c0 f1441d;

        /* renamed from: e  reason: collision with root package name */
        public h f1442e;

        public b(View view, String str, h hVar, c0 c0Var, p pVar) {
            this.a = view;
            this.b = str;
            this.c = pVar;
            this.f1441d = c0Var;
            this.f1442e = hVar;
        }
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public static abstract class c {
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public interface d {
        void a(h hVar);

        void b(h hVar);

        void c(h hVar);

        void d(h hVar);

        void e(h hVar);
    }

    public static void c(q qVar, View view, p pVar) {
        qVar.a.put(view, pVar);
        int id = view.getId();
        if (id >= 0) {
            if (qVar.b.indexOfKey(id) >= 0) {
                qVar.b.put(id, null);
            } else {
                qVar.b.put(id, view);
            }
        }
        AtomicInteger atomicInteger = e.i.j.z.a;
        String k2 = z.i.k(view);
        if (k2 != null) {
            if (qVar.f1445d.e(k2) >= 0) {
                qVar.f1445d.put(k2, null);
            } else {
                qVar.f1445d.put(k2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                e.f.e<View> eVar = qVar.c;
                if (eVar.f1979f) {
                    eVar.e();
                }
                if (e.f.d.b(eVar.f1980g, eVar.f1982i, itemIdAtPosition) >= 0) {
                    View f2 = qVar.c.f(itemIdAtPosition);
                    if (f2 != null) {
                        z.d.r(f2, false);
                        qVar.c.j(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                z.d.r(view, true);
                qVar.c.j(itemIdAtPosition, view);
            }
        }
    }

    public static e.f.a<Animator, b> o() {
        e.f.a<Animator, b> aVar = B.get();
        if (aVar == null) {
            e.f.a<Animator, b> aVar2 = new e.f.a<>();
            B.set(aVar2);
            return aVar2;
        }
        return aVar;
    }

    public static boolean t(p pVar, p pVar2, String str) {
        Object obj = pVar.a.get(str);
        Object obj2 = pVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    public void A(c cVar) {
        this.x = cVar;
    }

    public h B(TimeInterpolator timeInterpolator) {
        this.f1436i = timeInterpolator;
        return this;
    }

    public void C(e eVar) {
        if (eVar == null) {
            this.y = A;
        } else {
            this.y = eVar;
        }
    }

    public void D(m mVar) {
    }

    public h E(long j2) {
        this.f1434g = j2;
        return this;
    }

    public void F() {
        if (this.s == 0) {
            ArrayList<d> arrayList = this.v;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.v.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((d) arrayList2.get(i2)).a(this);
                }
            }
            this.u = false;
        }
        this.s++;
    }

    public String G(String str) {
        StringBuilder A2 = f.a.b.a.a.A(str);
        A2.append(getClass().getSimpleName());
        A2.append("@");
        A2.append(Integer.toHexString(hashCode()));
        A2.append(": ");
        String sb = A2.toString();
        if (this.f1435h != -1) {
            StringBuilder D = f.a.b.a.a.D(sb, "dur(");
            D.append(this.f1435h);
            D.append(") ");
            sb = D.toString();
        }
        if (this.f1434g != -1) {
            StringBuilder D2 = f.a.b.a.a.D(sb, "dly(");
            D2.append(this.f1434g);
            D2.append(") ");
            sb = D2.toString();
        }
        if (this.f1436i != null) {
            StringBuilder D3 = f.a.b.a.a.D(sb, "interp(");
            D3.append(this.f1436i);
            D3.append(") ");
            sb = D3.toString();
        }
        if (this.f1437j.size() > 0 || this.f1438k.size() > 0) {
            String p = f.a.b.a.a.p(sb, "tgts(");
            if (this.f1437j.size() > 0) {
                for (int i2 = 0; i2 < this.f1437j.size(); i2++) {
                    if (i2 > 0) {
                        p = f.a.b.a.a.p(p, ", ");
                    }
                    StringBuilder A3 = f.a.b.a.a.A(p);
                    A3.append(this.f1437j.get(i2));
                    p = A3.toString();
                }
            }
            if (this.f1438k.size() > 0) {
                for (int i3 = 0; i3 < this.f1438k.size(); i3++) {
                    if (i3 > 0) {
                        p = f.a.b.a.a.p(p, ", ");
                    }
                    StringBuilder A4 = f.a.b.a.a.A(p);
                    A4.append(this.f1438k.get(i3));
                    p = A4.toString();
                }
            }
            return f.a.b.a.a.p(p, ")");
        }
        return sb;
    }

    public h a(d dVar) {
        if (this.v == null) {
            this.v = new ArrayList<>();
        }
        this.v.add(dVar);
        return this;
    }

    public h b(View view) {
        this.f1438k.add(view);
        return this;
    }

    public abstract void d(p pVar);

    public final void e(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            p pVar = new p(view);
            if (z2) {
                g(pVar);
            } else {
                d(pVar);
            }
            pVar.c.add(this);
            f(pVar);
            if (z2) {
                c(this.f1439l, view, pVar);
            } else {
                c(this.f1440m, view, pVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                e(viewGroup.getChildAt(i2), z2);
            }
        }
    }

    public void f(p pVar) {
    }

    public abstract void g(p pVar);

    public void h(ViewGroup viewGroup, boolean z2) {
        i(z2);
        if (this.f1437j.size() <= 0 && this.f1438k.size() <= 0) {
            e(viewGroup, z2);
            return;
        }
        for (int i2 = 0; i2 < this.f1437j.size(); i2++) {
            View findViewById = viewGroup.findViewById(this.f1437j.get(i2).intValue());
            if (findViewById != null) {
                p pVar = new p(findViewById);
                if (z2) {
                    g(pVar);
                } else {
                    d(pVar);
                }
                pVar.c.add(this);
                f(pVar);
                if (z2) {
                    c(this.f1439l, findViewById, pVar);
                } else {
                    c(this.f1440m, findViewById, pVar);
                }
            }
        }
        for (int i3 = 0; i3 < this.f1438k.size(); i3++) {
            View view = this.f1438k.get(i3);
            p pVar2 = new p(view);
            if (z2) {
                g(pVar2);
            } else {
                d(pVar2);
            }
            pVar2.c.add(this);
            f(pVar2);
            if (z2) {
                c(this.f1439l, view, pVar2);
            } else {
                c(this.f1440m, view, pVar2);
            }
        }
    }

    public void i(boolean z2) {
        if (z2) {
            this.f1439l.a.clear();
            this.f1439l.b.clear();
            this.f1439l.c.b();
            return;
        }
        this.f1440m.a.clear();
        this.f1440m.b.clear();
        this.f1440m.c.b();
    }

    @Override // 
    /* renamed from: j */
    public h clone() {
        try {
            h hVar = (h) super.clone();
            hVar.w = new ArrayList<>();
            hVar.f1439l = new q();
            hVar.f1440m = new q();
            hVar.p = null;
            hVar.q = null;
            return hVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator k(ViewGroup viewGroup, p pVar, p pVar2) {
        return null;
    }

    public void l(ViewGroup viewGroup, q qVar, q qVar2, ArrayList<p> arrayList, ArrayList<p> arrayList2) {
        Animator k2;
        int i2;
        View view;
        Animator animator;
        p pVar;
        Animator animator2;
        p pVar2;
        e.f.a<Animator, b> o = o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            p pVar3 = arrayList.get(i3);
            p pVar4 = arrayList2.get(i3);
            if (pVar3 != null && !pVar3.c.contains(this)) {
                pVar3 = null;
            }
            if (pVar4 != null && !pVar4.c.contains(this)) {
                pVar4 = null;
            }
            if (pVar3 != null || pVar4 != null) {
                if ((pVar3 == null || pVar4 == null || r(pVar3, pVar4)) && (k2 = k(viewGroup, pVar3, pVar4)) != null) {
                    if (pVar4 != null) {
                        View view2 = pVar4.b;
                        String[] p = p();
                        if (p != null && p.length > 0) {
                            pVar2 = new p(view2);
                            p pVar5 = qVar2.a.get(view2);
                            if (pVar5 != null) {
                                int i4 = 0;
                                while (i4 < p.length) {
                                    pVar2.a.put(p[i4], pVar5.a.get(p[i4]));
                                    i4++;
                                    k2 = k2;
                                    size = size;
                                    pVar5 = pVar5;
                                }
                            }
                            Animator animator3 = k2;
                            i2 = size;
                            int i5 = o.f2001h;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= i5) {
                                    animator2 = animator3;
                                    break;
                                }
                                b bVar = o.get(o.h(i6));
                                if (bVar.c != null && bVar.a == view2 && bVar.b.equals(this.f1433f) && bVar.c.equals(pVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            i2 = size;
                            animator2 = k2;
                            pVar2 = null;
                        }
                        view = view2;
                        animator = animator2;
                        pVar = pVar2;
                    } else {
                        i2 = size;
                        view = pVar3.b;
                        animator = k2;
                        pVar = null;
                    }
                    if (animator != null) {
                        String str = this.f1433f;
                        y yVar = s.a;
                        o.put(animator, new b(view, str, this, new b0(viewGroup), pVar));
                        this.w.add(animator);
                    }
                    i3++;
                    size = i2;
                }
            }
            i2 = size;
            i3++;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator4 = this.w.get(sparseIntArray.keyAt(i7));
                animator4.setStartDelay(animator4.getStartDelay() + (sparseIntArray.valueAt(i7) - Long.MAX_VALUE));
            }
        }
    }

    public void m() {
        int i2 = this.s - 1;
        this.s = i2;
        if (i2 == 0) {
            ArrayList<d> arrayList = this.v;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.v.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((d) arrayList2.get(i3)).c(this);
                }
            }
            for (int i4 = 0; i4 < this.f1439l.c.l(); i4++) {
                View m2 = this.f1439l.c.m(i4);
                if (m2 != null) {
                    AtomicInteger atomicInteger = e.i.j.z.a;
                    z.d.r(m2, false);
                }
            }
            for (int i5 = 0; i5 < this.f1440m.c.l(); i5++) {
                View m3 = this.f1440m.c.m(i5);
                if (m3 != null) {
                    AtomicInteger atomicInteger2 = e.i.j.z.a;
                    z.d.r(m3, false);
                }
            }
            this.u = true;
        }
    }

    public p n(View view, boolean z2) {
        n nVar = this.n;
        if (nVar != null) {
            return nVar.n(view, z2);
        }
        ArrayList<p> arrayList = z2 ? this.p : this.q;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            p pVar = arrayList.get(i3);
            if (pVar == null) {
                return null;
            }
            if (pVar.b == view) {
                i2 = i3;
                break;
            }
            i3++;
        }
        if (i2 >= 0) {
            return (z2 ? this.q : this.p).get(i2);
        }
        return null;
    }

    public String[] p() {
        return null;
    }

    public p q(View view, boolean z2) {
        n nVar = this.n;
        if (nVar != null) {
            return nVar.q(view, z2);
        }
        return (z2 ? this.f1439l : this.f1440m).a.getOrDefault(view, null);
    }

    public boolean r(p pVar, p pVar2) {
        if (pVar == null || pVar2 == null) {
            return false;
        }
        String[] p = p();
        if (p != null) {
            for (String str : p) {
                if (!t(pVar, pVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : pVar.a.keySet()) {
            if (t(pVar, pVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    public boolean s(View view) {
        return (this.f1437j.size() == 0 && this.f1438k.size() == 0) || this.f1437j.contains(Integer.valueOf(view.getId())) || this.f1438k.contains(view);
    }

    public String toString() {
        return G("");
    }

    public void u(View view) {
        if (this.u) {
            return;
        }
        e.f.a<Animator, b> o = o();
        int i2 = o.f2001h;
        y yVar = s.a;
        b0 b0Var = new b0(view);
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            b l2 = o.l(i3);
            if (l2.a != null && b0Var.equals(l2.f1441d)) {
                o.h(i3).pause();
            }
        }
        ArrayList<d> arrayList = this.v;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.v.clone();
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((d) arrayList2.get(i4)).b(this);
            }
        }
        this.t = true;
    }

    public h v(d dVar) {
        ArrayList<d> arrayList = this.v;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(dVar);
        if (this.v.size() == 0) {
            this.v = null;
        }
        return this;
    }

    public h w(View view) {
        this.f1438k.remove(view);
        return this;
    }

    public void x(View view) {
        if (this.t) {
            if (!this.u) {
                e.f.a<Animator, b> o = o();
                int i2 = o.f2001h;
                y yVar = s.a;
                b0 b0Var = new b0(view);
                for (int i3 = i2 - 1; i3 >= 0; i3--) {
                    b l2 = o.l(i3);
                    if (l2.a != null && b0Var.equals(l2.f1441d)) {
                        o.h(i3).resume();
                    }
                }
                ArrayList<d> arrayList = this.v;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.v.clone();
                    int size = arrayList2.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ((d) arrayList2.get(i4)).e(this);
                    }
                }
            }
            this.t = false;
        }
    }

    public void y() {
        F();
        e.f.a<Animator, b> o = o();
        Iterator<Animator> it = this.w.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (o.containsKey(next)) {
                F();
                if (next != null) {
                    next.addListener(new i(this, o));
                    long j2 = this.f1435h;
                    if (j2 >= 0) {
                        next.setDuration(j2);
                    }
                    long j3 = this.f1434g;
                    if (j3 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.f1436i;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new j(this));
                    next.start();
                }
            }
        }
        this.w.clear();
        m();
    }

    public h z(long j2) {
        this.f1435h = j2;
        return this;
    }
}
