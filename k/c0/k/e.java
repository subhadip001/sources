package k.c0.k;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: OptionalMethod.java */
/* loaded from: classes2.dex */
public class e<T> {
    public final Class<?> a;
    public final String b;
    public final Class[] c;

    public e(Class<?> cls, String str, Class... clsArr) {
        this.a = cls;
        this.b = str;
        this.c = clsArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
        if ((r4.getModifiers() & 1) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.reflect.Method a(java.lang.Class<?> r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.b
            r1 = 0
            if (r0 == 0) goto L26
            java.lang.Class[] r2 = r3.c
            java.lang.reflect.Method r4 = r4.getMethod(r0, r2)     // Catch: java.lang.NoSuchMethodException -> L13
            int r0 = r4.getModifiers()     // Catch: java.lang.NoSuchMethodException -> L14
            r0 = r0 & 1
            if (r0 != 0) goto L14
        L13:
            r4 = r1
        L14:
            if (r4 == 0) goto L25
            java.lang.Class<?> r0 = r3.a
            if (r0 == 0) goto L25
            java.lang.Class r2 = r4.getReturnType()
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 != 0) goto L25
            goto L26
        L25:
            r1 = r4
        L26:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k.c0.k.e.a(java.lang.Class):java.lang.reflect.Method");
    }

    public Object b(T t, Object... objArr) {
        Method a = a(t.getClass());
        if (a != null) {
            try {
                return a.invoke(t, objArr);
            } catch (IllegalAccessException e2) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + a);
                assertionError.initCause(e2);
                throw assertionError;
            }
        }
        StringBuilder A = f.a.b.a.a.A("Method ");
        A.append(this.b);
        A.append(" not supported for object ");
        A.append(t);
        throw new AssertionError(A.toString());
    }

    public Object c(T t, Object... objArr) {
        try {
            Method a = a(t.getClass());
            if (a != null) {
                try {
                } catch (IllegalAccessException unused) {
                    return null;
                }
            }
            return a.invoke(t, objArr);
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public Object d(T t, Object... objArr) {
        try {
            return b(t, objArr);
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }
}
