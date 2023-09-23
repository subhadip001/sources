package e.u.b;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ViewInfoStore.java */
/* loaded from: classes.dex */
public class e0 {
    public final e.f.h<RecyclerView.a0, a> a = new e.f.h<>();
    public final e.f.e<RecyclerView.a0> b = new e.f.e<>();

    /* compiled from: ViewInfoStore.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d  reason: collision with root package name */
        public static e.i.i.c<a> f2855d = new e.i.i.d(20);
        public int a;
        public RecyclerView.j.c b;
        public RecyclerView.j.c c;

        public static a a() {
            a b = f2855d.b();
            return b == null ? new a() : b;
        }

        public static void b(a aVar) {
            aVar.a = 0;
            aVar.b = null;
            aVar.c = null;
            f2855d.a(aVar);
        }
    }

    /* compiled from: ViewInfoStore.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    public void a(RecyclerView.a0 a0Var) {
        a orDefault = this.a.getOrDefault(a0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.a.put(a0Var, orDefault);
        }
        orDefault.a |= 1;
    }

    public void b(RecyclerView.a0 a0Var, RecyclerView.j.c cVar) {
        a orDefault = this.a.getOrDefault(a0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.a.put(a0Var, orDefault);
        }
        orDefault.c = cVar;
        orDefault.a |= 8;
    }

    public void c(RecyclerView.a0 a0Var, RecyclerView.j.c cVar) {
        a orDefault = this.a.getOrDefault(a0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.a.put(a0Var, orDefault);
        }
        orDefault.b = cVar;
        orDefault.a |= 4;
    }

    public boolean d(RecyclerView.a0 a0Var) {
        a orDefault = this.a.getOrDefault(a0Var, null);
        return (orDefault == null || (orDefault.a & 1) == 0) ? false : true;
    }

    public final RecyclerView.j.c e(RecyclerView.a0 a0Var, int i2) {
        a l2;
        RecyclerView.j.c cVar;
        int e2 = this.a.e(a0Var);
        if (e2 >= 0 && (l2 = this.a.l(e2)) != null) {
            int i3 = l2.a;
            if ((i3 & i2) != 0) {
                int i4 = (~i2) & i3;
                l2.a = i4;
                if (i2 == 4) {
                    cVar = l2.b;
                } else if (i2 == 8) {
                    cVar = l2.c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i4 & 12) == 0) {
                    this.a.j(e2);
                    a.b(l2);
                }
                return cVar;
            }
        }
        return null;
    }

    public void f(RecyclerView.a0 a0Var) {
        a orDefault = this.a.getOrDefault(a0Var, null);
        if (orDefault == null) {
            return;
        }
        orDefault.a &= -2;
    }

    public void g(RecyclerView.a0 a0Var) {
        int l2 = this.b.l() - 1;
        while (true) {
            if (l2 < 0) {
                break;
            } else if (a0Var == this.b.m(l2)) {
                e.f.e<RecyclerView.a0> eVar = this.b;
                Object[] objArr = eVar.f1981h;
                Object obj = objArr[l2];
                Object obj2 = e.f.e.f1978j;
                if (obj != obj2) {
                    objArr[l2] = obj2;
                    eVar.f1979f = true;
                }
            } else {
                l2--;
            }
        }
        a remove = this.a.remove(a0Var);
        if (remove != null) {
            a.b(remove);
        }
    }
}
