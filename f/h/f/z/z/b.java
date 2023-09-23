package f.h.f.z.z;

import com.google.gson.stream.JsonToken;
import f.h.f.w;
import f.h.f.x;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* compiled from: CollectionTypeAdapterFactory.java */
/* loaded from: classes2.dex */
public final class b implements x {

    /* renamed from: f  reason: collision with root package name */
    public final f.h.f.z.g f6275f;

    /* compiled from: CollectionTypeAdapterFactory.java */
    /* loaded from: classes2.dex */
    public static final class a<E> extends w<Collection<E>> {
        public final w<E> a;
        public final f.h.f.z.t<? extends Collection<E>> b;

        public a(f.h.f.j jVar, Type type, w<E> wVar, f.h.f.z.t<? extends Collection<E>> tVar) {
            this.a = new n(jVar, wVar, type);
            this.b = tVar;
        }

        @Override // f.h.f.w
        public Object a(f.h.f.b0.a aVar) {
            if (aVar.s0() == JsonToken.NULL) {
                aVar.i0();
                return null;
            }
            Collection<E> a = this.b.a();
            aVar.a();
            while (aVar.F()) {
                a.add(this.a.a(aVar));
            }
            aVar.p();
            return a;
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, Object obj) {
            Collection<E> collection = (Collection) obj;
            if (collection == null) {
                bVar.F();
                return;
            }
            bVar.f();
            for (E e2 : collection) {
                this.a.b(bVar, e2);
            }
            bVar.p();
        }
    }

    public b(f.h.f.z.g gVar) {
        this.f6275f = gVar;
    }

    @Override // f.h.f.x
    public <T> w<T> a(f.h.f.j jVar, f.h.f.a0.a<T> aVar) {
        Type type;
        Type type2 = aVar.b;
        Class<? super T> cls = aVar.a;
        if (Collection.class.isAssignableFrom(cls)) {
            Type f2 = f.h.f.z.a.f(type2, cls, Collection.class);
            if (f2 instanceof WildcardType) {
                f2 = ((WildcardType) f2).getUpperBounds()[0];
            }
            if (f2 instanceof ParameterizedType) {
                type = ((ParameterizedType) f2).getActualTypeArguments()[0];
            } else {
                type = Object.class;
            }
            return new a(jVar, type, jVar.e(new f.h.f.a0.a<>(type)), this.f6275f.a(aVar));
        }
        return null;
    }
}
