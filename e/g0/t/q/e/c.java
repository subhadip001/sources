package e.g0.t.q.e;

import e.g0.k;
import e.g0.t.s.p;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ConstraintController.java */
/* loaded from: classes.dex */
public abstract class c<T> implements e.g0.t.q.a<T> {
    public final List<String> a = new ArrayList();
    public T b;
    public e.g0.t.q.f.d<T> c;

    /* renamed from: d  reason: collision with root package name */
    public a f2300d;

    /* compiled from: ConstraintController.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public c(e.g0.t.q.f.d<T> dVar) {
        this.c = dVar;
    }

    @Override // e.g0.t.q.a
    public void a(T t) {
        this.b = t;
        e(this.f2300d, t);
    }

    public abstract boolean b(p pVar);

    public abstract boolean c(T t);

    public void d(Iterable<p> iterable) {
        this.a.clear();
        for (p pVar : iterable) {
            if (b(pVar)) {
                this.a.add(pVar.a);
            }
        }
        if (this.a.isEmpty()) {
            this.c.b(this);
        } else {
            e.g0.t.q.f.d<T> dVar = this.c;
            synchronized (dVar.c) {
                if (dVar.f2308d.add(this)) {
                    if (dVar.f2308d.size() == 1) {
                        dVar.f2309e = dVar.a();
                        k.c().a(e.g0.t.q.f.d.f2307f, String.format("%s: initial state = %s", dVar.getClass().getSimpleName(), dVar.f2309e), new Throwable[0]);
                        dVar.d();
                    }
                    a(dVar.f2309e);
                }
            }
        }
        e(this.f2300d, this.b);
    }

    public final void e(a aVar, T t) {
        if (this.a.isEmpty() || aVar == null) {
            return;
        }
        if (t != null && !c(t)) {
            List<String> list = this.a;
            e.g0.t.q.d dVar = (e.g0.t.q.d) aVar;
            synchronized (dVar.c) {
                ArrayList arrayList = new ArrayList();
                for (String str : list) {
                    if (dVar.a(str)) {
                        k.c().a(e.g0.t.q.d.f2299d, String.format("Constraints met for %s", str), new Throwable[0]);
                        arrayList.add(str);
                    }
                }
                e.g0.t.q.c cVar = dVar.a;
                if (cVar != null) {
                    cVar.f(arrayList);
                }
            }
            return;
        }
        List<String> list2 = this.a;
        e.g0.t.q.d dVar2 = (e.g0.t.q.d) aVar;
        synchronized (dVar2.c) {
            e.g0.t.q.c cVar2 = dVar2.a;
            if (cVar2 != null) {
                cVar2.b(list2);
            }
        }
    }
}
