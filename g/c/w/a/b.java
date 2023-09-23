package g.c.w.a;

import f.n.a.n.i;
import g.c.w.g.g;
import g.c.w.j.d;
import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* compiled from: ListCompositeDisposable.java */
/* loaded from: classes2.dex */
public final class b implements g.c.t.b, a {

    /* renamed from: f  reason: collision with root package name */
    public List<g.c.t.b> f8139f;

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f8140g;

    @Override // g.c.w.a.a
    public boolean a(g.c.t.b bVar) {
        if (c(bVar)) {
            ((g) bVar).dispose();
            return true;
        }
        return false;
    }

    @Override // g.c.w.a.a
    public boolean b(g.c.t.b bVar) {
        if (!this.f8140g) {
            synchronized (this) {
                if (!this.f8140g) {
                    List list = this.f8139f;
                    if (list == null) {
                        list = new LinkedList();
                        this.f8139f = list;
                    }
                    list.add(bVar);
                    return true;
                }
            }
        }
        bVar.dispose();
        return false;
    }

    @Override // g.c.w.a.a
    public boolean c(g.c.t.b bVar) {
        Objects.requireNonNull(bVar, "Disposable item is null");
        if (this.f8140g) {
            return false;
        }
        synchronized (this) {
            if (this.f8140g) {
                return false;
            }
            List<g.c.t.b> list = this.f8139f;
            if (list != null && list.remove(bVar)) {
                return true;
            }
            return false;
        }
    }

    @Override // g.c.t.b
    public void dispose() {
        if (this.f8140g) {
            return;
        }
        synchronized (this) {
            if (this.f8140g) {
                return;
            }
            this.f8140g = true;
            List<g.c.t.b> list = this.f8139f;
            ArrayList arrayList = null;
            this.f8139f = null;
            if (list == null) {
                return;
            }
            for (g.c.t.b bVar : list) {
                try {
                    bVar.dispose();
                } catch (Throwable th) {
                    i.d0(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
            if (arrayList != null) {
                if (arrayList.size() == 1) {
                    throw d.d((Throwable) arrayList.get(0));
                }
                throw new CompositeException(arrayList);
            }
        }
    }
}
