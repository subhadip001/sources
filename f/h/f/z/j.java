package f.h.f.z;

import com.google.gson.JsonIOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: ConstructorConstructor.java */
/* loaded from: classes2.dex */
public class j<T> implements t<T> {
    public final /* synthetic */ Type a;

    public j(g gVar, Type type) {
        this.a = type;
    }

    @Override // f.h.f.z.t
    public T a() {
        Type type = this.a;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return (T) EnumSet.noneOf((Class) type2);
            }
            StringBuilder A = f.a.b.a.a.A("Invalid EnumSet type: ");
            A.append(this.a.toString());
            throw new JsonIOException(A.toString());
        }
        StringBuilder A2 = f.a.b.a.a.A("Invalid EnumSet type: ");
        A2.append(this.a.toString());
        throw new JsonIOException(A2.toString());
    }
}
