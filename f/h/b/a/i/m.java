package f.h.b.a.i;

import java.util.Set;

/* compiled from: TransportFactoryImpl.java */
/* loaded from: classes.dex */
public final class m implements f.h.b.a.f {
    public final Set<f.h.b.a.b> a;
    public final l b;
    public final o c;

    public m(Set<f.h.b.a.b> set, l lVar, o oVar) {
        this.a = set;
        this.b = lVar;
        this.c = oVar;
    }

    @Override // f.h.b.a.f
    public <T> f.h.b.a.e<T> a(String str, Class<T> cls, f.h.b.a.d<T, byte[]> dVar) {
        return b(str, cls, new f.h.b.a.b("proto"), dVar);
    }

    @Override // f.h.b.a.f
    public <T> f.h.b.a.e<T> b(String str, Class<T> cls, f.h.b.a.b bVar, f.h.b.a.d<T, byte[]> dVar) {
        if (this.a.contains(bVar)) {
            return new n(this.b, str, bVar, dVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.a));
    }
}
