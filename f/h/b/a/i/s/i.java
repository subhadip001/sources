package f.h.b.a.i.s;

import android.content.Context;

/* compiled from: CreationContextFactory_Factory.java */
/* loaded from: classes.dex */
public final class i implements Object<h> {
    public final h.a.a<Context> a;
    public final h.a.a<f.h.b.a.i.y.a> b;
    public final h.a.a<f.h.b.a.i.y.a> c;

    public i(h.a.a<Context> aVar, h.a.a<f.h.b.a.i.y.a> aVar2, h.a.a<f.h.b.a.i.y.a> aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public Object get() {
        return new h(this.a.get(), this.b.get(), this.c.get());
    }
}
