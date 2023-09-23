package f.h.b.a.i.w.i;

import android.content.Context;

/* compiled from: SchemaManager_Factory.java */
/* loaded from: classes.dex */
public final class k0 implements Object<j0> {
    public final h.a.a<Context> a;
    public final h.a.a<String> b;
    public final h.a.a<Integer> c;

    public k0(h.a.a<Context> aVar, h.a.a<String> aVar2, h.a.a<Integer> aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public Object get() {
        return new j0(this.a.get(), this.b.get(), this.c.get().intValue());
    }
}
