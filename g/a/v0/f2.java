package g.a.v0;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: ReflectionLongAdderCounter.java */
/* loaded from: classes2.dex */
public final class f2 implements l1 {
    public static final Logger b = Logger.getLogger(f2.class.getName());
    public static final Constructor<?> c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f7681d;

    /* renamed from: e  reason: collision with root package name */
    public static final RuntimeException f7682e;
    public final Object a;

    static {
        Method method;
        Constructor<?> constructor;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            int i2 = 0;
            method = cls.getMethod("add", Long.TYPE);
            try {
                cls.getMethod("sum", new Class[0]);
                Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                while (true) {
                    if (i2 >= length) {
                        constructor = null;
                        break;
                    }
                    constructor = constructors[i2];
                    if (constructor.getParameterTypes().length == 0) {
                        break;
                    }
                    i2++;
                }
                th = null;
            } catch (Throwable th) {
                th = th;
                b.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
                constructor = null;
                if (th != null) {
                }
                c = null;
                f7681d = null;
                f7682e = new RuntimeException(th);
            }
        } catch (Throwable th2) {
            th = th2;
            method = null;
        }
        if (th != null && constructor != null) {
            c = constructor;
            f7681d = method;
            f7682e = null;
            return;
        }
        c = null;
        f7681d = null;
        f7682e = new RuntimeException(th);
    }

    public f2() {
        RuntimeException runtimeException = f7682e;
        if (runtimeException == null) {
            try {
                this.a = c.newInstance(new Object[0]);
                return;
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException(e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException(e4);
            }
        }
        throw runtimeException;
    }

    @Override // g.a.v0.l1
    public void add(long j2) {
        try {
            f7681d.invoke(this.a, Long.valueOf(j2));
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
