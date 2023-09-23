package f.h.f.z.z;

import f.h.f.w;
import f.h.f.z.z.j;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* compiled from: TypeAdapterRuntimeTypeWrapper.java */
/* loaded from: classes2.dex */
public final class n<T> extends w<T> {
    public final f.h.f.j a;
    public final w<T> b;
    public final Type c;

    public n(f.h.f.j jVar, w<T> wVar, Type type) {
        this.a = jVar;
        this.b = wVar;
        this.c = type;
    }

    @Override // f.h.f.w
    public T a(f.h.f.b0.a aVar) {
        return this.b.a(aVar);
    }

    @Override // f.h.f.w
    public void b(f.h.f.b0.b bVar, T t) {
        w<T> wVar = this.b;
        Type type = this.c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.c) {
            wVar = this.a.e(new f.h.f.a0.a<>(type));
            if (wVar instanceof j.a) {
                w<T> wVar2 = this.b;
                if (!(wVar2 instanceof j.a)) {
                    wVar = wVar2;
                }
            }
        }
        wVar.b(bVar, t);
    }
}
