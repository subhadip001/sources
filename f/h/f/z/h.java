package f.h.f.z;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: ConstructorConstructor.java */
/* loaded from: classes2.dex */
public class h<T> implements t<T> {
    public final /* synthetic */ Constructor a;

    public h(g gVar, Constructor constructor) {
        this.a = constructor;
    }

    @Override // f.h.f.z.t
    public T a() {
        try {
            return (T) this.a.newInstance(null);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InstantiationException e3) {
            StringBuilder A = f.a.b.a.a.A("Failed to invoke ");
            A.append(this.a);
            A.append(" with no args");
            throw new RuntimeException(A.toString(), e3);
        } catch (InvocationTargetException e4) {
            StringBuilder A2 = f.a.b.a.a.A("Failed to invoke ");
            A2.append(this.a);
            A2.append(" with no args");
            throw new RuntimeException(A2.toString(), e4.getTargetException());
        }
    }
}
