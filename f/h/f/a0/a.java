package f.h.f.a0;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

/* compiled from: TypeToken.java */
/* loaded from: classes2.dex */
public class a<T> {
    public final Class<? super T> a;
    public final Type b;
    public final int c;

    public a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            Type a = f.h.f.z.a.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.b = a;
            this.a = (Class<? super T>) f.h.f.z.a.e(a);
            this.c = a.hashCode();
            return;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && f.h.f.z.a.c(this.b, ((a) obj).b);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return f.h.f.z.a.i(this.b);
    }

    public a(Type type) {
        Objects.requireNonNull(type);
        Type a = f.h.f.z.a.a(type);
        this.b = a;
        this.a = (Class<? super T>) f.h.f.z.a.e(a);
        this.c = a.hashCode();
    }
}
