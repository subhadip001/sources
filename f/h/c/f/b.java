package f.h.c.f;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* compiled from: TypeToken.java */
/* loaded from: classes.dex */
public abstract class b<T> extends a<T> implements Serializable {

    /* renamed from: f  reason: collision with root package name */
    public final Type f6010f;

    public b() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        f.h.b.c.a.q(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
        this.f6010f = type;
        f.h.b.c.a.D(!(type instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", type);
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f6010f.equals(((b) obj).f6010f);
        }
        return false;
    }

    public int hashCode() {
        return this.f6010f.hashCode();
    }

    public String toString() {
        Type type = this.f6010f;
        int i2 = c.a;
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
