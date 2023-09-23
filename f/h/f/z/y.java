package f.h.f.z;

import java.lang.reflect.Modifier;

/* compiled from: UnsafeAllocator.java */
/* loaded from: classes2.dex */
public abstract class y {
    public static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (!Modifier.isInterface(modifiers)) {
            if (Modifier.isAbstract(modifiers)) {
                StringBuilder A = f.a.b.a.a.A("Abstract class can't be instantiated! Class name: ");
                A.append(cls.getName());
                throw new UnsupportedOperationException(A.toString());
            }
            return;
        }
        StringBuilder A2 = f.a.b.a.a.A("Interface can't be instantiated! Interface name: ");
        A2.append(cls.getName());
        throw new UnsupportedOperationException(A2.toString());
    }

    public abstract <T> T b(Class<T> cls);
}
