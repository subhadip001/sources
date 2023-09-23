package f.h.b.a.i.w;

import f.h.b.a.i.w.h.w;
import f.h.b.a.i.w.i.a0;
import java.util.concurrent.Executor;

/* compiled from: DefaultScheduler_Factory.java */
/* loaded from: classes.dex */
public final class d implements Object<c> {
    public final h.a.a<Executor> a;
    public final h.a.a<f.h.b.a.i.s.e> b;
    public final h.a.a<w> c;

    /* renamed from: d  reason: collision with root package name */
    public final h.a.a<a0> f3727d;

    /* renamed from: e  reason: collision with root package name */
    public final h.a.a<f.h.b.a.i.x.a> f3728e;

    public d(h.a.a<Executor> aVar, h.a.a<f.h.b.a.i.s.e> aVar2, h.a.a<w> aVar3, h.a.a<a0> aVar4, h.a.a<f.h.b.a.i.x.a> aVar5) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f3727d = aVar4;
        this.f3728e = aVar5;
    }

    public Object get() {
        return new c(this.a.get(), this.b.get(), this.c.get(), this.f3727d.get(), this.f3728e.get());
    }
}
