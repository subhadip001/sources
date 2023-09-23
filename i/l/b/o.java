package i.l.b;

import java.util.Objects;

/* compiled from: Reflection.java */
/* loaded from: classes2.dex */
public class o {
    public static final p a;
    public static final i.o.b[] b;

    static {
        p pVar = null;
        try {
            pVar = (p) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (pVar == null) {
            pVar = new p();
        }
        a = pVar;
        b = new i.o.b[0];
    }

    public static i.o.b a(Class cls) {
        Objects.requireNonNull(a);
        return new c(cls);
    }
}
