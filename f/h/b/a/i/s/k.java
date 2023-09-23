package f.h.b.a.i.s;

import android.content.Context;

/* compiled from: MetadataBackendRegistry_Factory.java */
/* loaded from: classes.dex */
public final class k implements Object<j> {
    public final h.a.a<Context> a;
    public final h.a.a<h> b;

    public k(h.a.a<Context> aVar, h.a.a<h> aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public Object get() {
        return new j(this.a.get(), this.b.get());
    }
}
