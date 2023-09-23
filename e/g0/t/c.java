package e.g0.t;

import e.g0.m;
import e.s.s;

/* compiled from: OperationImpl.java */
/* loaded from: classes.dex */
public class c implements e.g0.m {
    public final s<m.b> c = new s<>();

    /* renamed from: d  reason: collision with root package name */
    public final e.g0.t.t.s.c<m.b.c> f2202d = new e.g0.t.t.s.c<>();

    public c() {
        a(e.g0.m.b);
    }

    public void a(m.b bVar) {
        this.c.i(bVar);
        if (bVar instanceof m.b.c) {
            this.f2202d.j((m.b.c) bVar);
        } else if (bVar instanceof m.b.a) {
            this.f2202d.k(((m.b.a) bVar).a);
        }
    }
}
