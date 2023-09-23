package f.e.a.l.q.c0;

import f.e.a.l.q.c0.i;
import f.e.a.l.q.l;
import f.e.a.l.q.v;

/* compiled from: LruResourceCache.java */
/* loaded from: classes.dex */
public class h extends f.e.a.r.i<f.e.a.l.j, v<?>> implements i {

    /* renamed from: d  reason: collision with root package name */
    public i.a f3294d;

    public h(long j2) {
        super(j2);
    }

    @Override // f.e.a.r.i
    public int b(v<?> vVar) {
        v<?> vVar2 = vVar;
        if (vVar2 == null) {
            return 1;
        }
        return vVar2.b();
    }

    @Override // f.e.a.r.i
    public void c(f.e.a.l.j jVar, v<?> vVar) {
        v<?> vVar2 = vVar;
        i.a aVar = this.f3294d;
        if (aVar == null || vVar2 == null) {
            return;
        }
        ((l) aVar).f3352e.a(vVar2, true);
    }
}
