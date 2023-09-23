package f.h.b.a.i.w.i;

/* compiled from: SQLiteEventStore_Factory.java */
/* loaded from: classes.dex */
public final class i0 implements Object<h0> {
    public final h.a.a<f.h.b.a.i.y.a> a;
    public final h.a.a<f.h.b.a.i.y.a> b;
    public final h.a.a<b0> c;

    /* renamed from: d  reason: collision with root package name */
    public final h.a.a<j0> f3759d;

    /* renamed from: e  reason: collision with root package name */
    public final h.a.a<String> f3760e;

    public i0(h.a.a<f.h.b.a.i.y.a> aVar, h.a.a<f.h.b.a.i.y.a> aVar2, h.a.a<b0> aVar3, h.a.a<j0> aVar4, h.a.a<String> aVar5) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f3759d = aVar4;
        this.f3760e = aVar5;
    }

    public Object get() {
        f.h.b.a.i.y.a aVar = this.a.get();
        f.h.b.a.i.y.a aVar2 = this.b.get();
        b0 b0Var = this.c.get();
        return new h0(aVar, aVar2, b0Var, this.f3759d.get(), this.f3760e);
    }
}
