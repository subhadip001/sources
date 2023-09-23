package f.h.c.a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Throwables.java */
/* loaded from: classes.dex */
public final class q {
    public static final Object a;

    static {
        Object obj = null;
        try {
            obj = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
        }
        a = obj;
        if (obj != null) {
            a("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (obj != null) {
            try {
                Method a2 = a("getStackTraceDepth", Throwable.class);
                if (a2 == null) {
                    return;
                }
                a2.invoke(obj, new Throwable());
            } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused2) {
            }
        }
    }

    public static Method a(String str, Class<?>... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void b(Throwable th) {
        if (!(th instanceof RuntimeException)) {
            if (th instanceof Error) {
                throw ((Error) th);
            }
            return;
        }
        throw ((RuntimeException) th);
    }
}
