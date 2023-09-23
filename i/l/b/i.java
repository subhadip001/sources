package i.l.b;

import java.util.Arrays;
import kotlin.UninitializedPropertyAccessException;

/* compiled from: Intrinsics.java */
/* loaded from: classes2.dex */
public class i {
    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void b(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        f(nullPointerException, i.class.getName());
        throw nullPointerException;
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        f(nullPointerException, i.class.getName());
        throw nullPointerException;
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(f.a.b.a.a.p(str, " must not be null"));
        f(nullPointerException, i.class.getName());
        throw nullPointerException;
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        StringBuilder F = f.a.b.a.a.F("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        F.append(str);
        NullPointerException nullPointerException = new NullPointerException(F.toString());
        f(nullPointerException, i.class.getName());
        throw nullPointerException;
    }

    public static <T extends Throwable> T f(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
        return t;
    }

    public static String g(String str, Object obj) {
        return str + obj;
    }

    public static void h(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(f.a.b.a.a.q("lateinit property ", str, " has not been initialized"));
        f(uninitializedPropertyAccessException, i.class.getName());
        throw uninitializedPropertyAccessException;
    }
}
