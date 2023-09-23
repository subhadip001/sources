package f.h.f.z.z;

import f.h.f.u;
import f.h.f.v;
import f.h.f.w;
import f.h.f.x;

/* compiled from: JsonAdapterAnnotationTypeAdapterFactory.java */
/* loaded from: classes2.dex */
public final class d implements x {

    /* renamed from: f  reason: collision with root package name */
    public final f.h.f.z.g f6276f;

    public d(f.h.f.z.g gVar) {
        this.f6276f = gVar;
    }

    @Override // f.h.f.x
    public <T> w<T> a(f.h.f.j jVar, f.h.f.a0.a<T> aVar) {
        f.h.f.y.a aVar2 = (f.h.f.y.a) aVar.a.getAnnotation(f.h.f.y.a.class);
        if (aVar2 == null) {
            return null;
        }
        return (w<T>) b(this.f6276f, jVar, aVar, aVar2);
    }

    public w<?> b(f.h.f.z.g gVar, f.h.f.j jVar, f.h.f.a0.a<?> aVar, f.h.f.y.a aVar2) {
        w<?> mVar;
        Object a = gVar.a(new f.h.f.a0.a(aVar2.value())).a();
        if (a instanceof w) {
            mVar = (w) a;
        } else if (a instanceof x) {
            mVar = ((x) a).a(jVar, aVar);
        } else {
            boolean z = a instanceof u;
            if (!z && !(a instanceof f.h.f.o)) {
                StringBuilder A = f.a.b.a.a.A("Invalid attempt to bind an instance of ");
                A.append(a.getClass().getName());
                A.append(" as a @JsonAdapter for ");
                A.append(aVar.toString());
                A.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(A.toString());
            }
            mVar = new m<>(z ? (u) a : null, a instanceof f.h.f.o ? (f.h.f.o) a : null, jVar, aVar, null);
        }
        return (mVar == null || !aVar2.nullSafe()) ? mVar : new v(mVar);
    }
}
