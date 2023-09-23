package f.e.a.l.q;

import f.e.a.l.p.d;
import f.e.a.l.q.g;
import f.e.a.l.r.n;

/* compiled from: SourceGenerator.java */
/* loaded from: classes.dex */
public class z implements d.a<Object> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ n.a f3407f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a0 f3408g;

    public z(a0 a0Var, n.a aVar) {
        this.f3408g = a0Var;
        this.f3407f = aVar;
    }

    @Override // f.e.a.l.p.d.a
    public void c(Exception exc) {
        a0 a0Var = this.f3408g;
        n.a<?> aVar = this.f3407f;
        n.a<?> aVar2 = a0Var.f3273k;
        if (aVar2 != null && aVar2 == aVar) {
            a0 a0Var2 = this.f3408g;
            n.a aVar3 = this.f3407f;
            g.a aVar4 = a0Var2.f3269g;
            f.e.a.l.j jVar = a0Var2.f3274l;
            f.e.a.l.p.d<Data> dVar = aVar3.c;
            aVar4.a(jVar, exc, dVar, dVar.d());
        }
    }

    @Override // f.e.a.l.p.d.a
    public void f(Object obj) {
        a0 a0Var = this.f3408g;
        n.a<?> aVar = this.f3407f;
        n.a<?> aVar2 = a0Var.f3273k;
        if (aVar2 != null && aVar2 == aVar) {
            a0 a0Var2 = this.f3408g;
            n.a aVar3 = this.f3407f;
            k kVar = a0Var2.f3268f.p;
            if (obj != null && kVar.c(aVar3.c.d())) {
                a0Var2.f3272j = obj;
                a0Var2.f3269g.d();
                return;
            }
            g.a aVar4 = a0Var2.f3269g;
            f.e.a.l.j jVar = aVar3.a;
            f.e.a.l.p.d<Data> dVar = aVar3.c;
            aVar4.f(jVar, obj, dVar, dVar.d(), a0Var2.f3274l);
        }
    }
}
