package f.h.f.z;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes2.dex */
public final class g {
    public final Map<Type, f.h.f.l<?>> a;
    public final f.h.f.z.a0.b b = f.h.f.z.a0.b.a;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes2.dex */
    public class a<T> implements t<T> {
        public final /* synthetic */ f.h.f.l a;
        public final /* synthetic */ Type b;

        public a(g gVar, f.h.f.l lVar, Type type) {
            this.a = lVar;
            this.b = type;
        }

        @Override // f.h.f.z.t
        public T a() {
            return (T) this.a.a(this.b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes2.dex */
    public class b<T> implements t<T> {
        public final /* synthetic */ f.h.f.l a;
        public final /* synthetic */ Type b;

        public b(g gVar, f.h.f.l lVar, Type type) {
            this.a = lVar;
            this.b = type;
        }

        @Override // f.h.f.z.t
        public T a() {
            return (T) this.a.a(this.b);
        }
    }

    public g(Map<Type, f.h.f.l<?>> map) {
        this.a = map;
    }

    public <T> t<T> a(f.h.f.a0.a<T> aVar) {
        h hVar;
        Type type = aVar.b;
        Class<? super T> cls = aVar.a;
        f.h.f.l<?> lVar = this.a.get(type);
        if (lVar != null) {
            return new a(this, lVar, type);
        }
        f.h.f.l<?> lVar2 = this.a.get(cls);
        if (lVar2 != null) {
            return new b(this, lVar2, type);
        }
        t<T> tVar = null;
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.b.a(declaredConstructor);
            }
            hVar = new h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            hVar = null;
        }
        if (hVar != null) {
            return hVar;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                tVar = new i<>(this);
            } else if (EnumSet.class.isAssignableFrom(cls)) {
                tVar = new j<>(this, type);
            } else if (Set.class.isAssignableFrom(cls)) {
                tVar = new k<>(this);
            } else if (Queue.class.isAssignableFrom(cls)) {
                tVar = new l<>(this);
            } else {
                tVar = new m<>(this);
            }
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                tVar = new n<>(this);
            } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
                tVar = new f.h.f.z.b<>(this);
            } else if (SortedMap.class.isAssignableFrom(cls)) {
                tVar = new c<>(this);
            } else {
                if (type instanceof ParameterizedType) {
                    Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                    Objects.requireNonNull(type2);
                    Type a2 = f.h.f.z.a.a(type2);
                    Class<?> e2 = f.h.f.z.a.e(a2);
                    a2.hashCode();
                    if (!String.class.isAssignableFrom(e2)) {
                        tVar = new d<>(this);
                    }
                }
                tVar = new e<>(this);
            }
        }
        return tVar != null ? tVar : new f(this, cls, type);
    }

    public String toString() {
        return this.a.toString();
    }
}
