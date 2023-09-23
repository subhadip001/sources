package f.h.f.z.z;

import com.google.gson.stream.JsonToken;
import f.h.f.w;
import f.h.f.x;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* compiled from: ArrayTypeAdapter.java */
/* loaded from: classes2.dex */
public final class a<E> extends w<Object> {
    public static final x c = new C0144a();
    public final Class<E> a;
    public final w<E> b;

    /* compiled from: ArrayTypeAdapter.java */
    /* renamed from: f.h.f.z.z.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0144a implements x {
        @Override // f.h.f.x
        public <T> w<T> a(f.h.f.j jVar, f.h.f.a0.a<T> aVar) {
            Type componentType;
            Type type = aVar.b;
            boolean z = type instanceof GenericArrayType;
            if (z || ((type instanceof Class) && ((Class) type).isArray())) {
                if (z) {
                    componentType = ((GenericArrayType) type).getGenericComponentType();
                } else {
                    componentType = ((Class) type).getComponentType();
                }
                return new a(jVar, jVar.e(new f.h.f.a0.a<>(componentType)), f.h.f.z.a.e(componentType));
            }
            return null;
        }
    }

    public a(f.h.f.j jVar, w<E> wVar, Class<E> cls) {
        this.b = new n(jVar, wVar, cls);
        this.a = cls;
    }

    @Override // f.h.f.w
    public Object a(f.h.f.b0.a aVar) {
        if (aVar.s0() == JsonToken.NULL) {
            aVar.i0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.F()) {
            arrayList.add(this.b.a(aVar));
        }
        aVar.p();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.a, size);
        for (int i2 = 0; i2 < size; i2++) {
            Array.set(newInstance, i2, arrayList.get(i2));
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.h.f.w
    public void b(f.h.f.b0.b bVar, Object obj) {
        if (obj == null) {
            bVar.F();
            return;
        }
        bVar.f();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.b.b(bVar, Array.get(obj, i2));
        }
        bVar.p();
    }
}
