package androidx.versionedparcelable;

import android.os.Parcelable;
import e.c0.b;
import e.f.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class VersionedParcel {
    public final a<String, Method> a;
    public final a<String, Method> b;
    public final a<String, Class> c;

    /* loaded from: classes.dex */
    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(a<String, Method> aVar, a<String, Method> aVar2, a<String, Class> aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public abstract void a();

    public abstract VersionedParcel b();

    public final Class c(Class<? extends b> cls) {
        Class orDefault = this.c.getOrDefault(cls.getName(), null);
        if (orDefault == null) {
            Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.c.put(cls.getName(), cls2);
            return cls2;
        }
        return orDefault;
    }

    public final Method d(String str) {
        Method orDefault = this.a.getOrDefault(str, null);
        if (orDefault == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
            this.a.put(str, declaredMethod);
            return declaredMethod;
        }
        return orDefault;
    }

    public final Method e(Class cls) {
        Method orDefault = this.b.getOrDefault(cls.getName(), null);
        if (orDefault == null) {
            Class c = c(cls);
            System.currentTimeMillis();
            Method declaredMethod = c.getDeclaredMethod("write", cls, VersionedParcel.class);
            this.b.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return orDefault;
    }

    public abstract boolean f();

    public abstract byte[] g();

    public abstract CharSequence h();

    public abstract boolean i(int i2);

    public abstract int j();

    public int k(int i2, int i3) {
        return !i(i3) ? i2 : j();
    }

    public abstract <T extends Parcelable> T l();

    public <T extends Parcelable> T m(T t, int i2) {
        return !i(i2) ? t : (T) l();
    }

    public abstract String n();

    public <T extends b> T o() {
        String n = n();
        if (n == null) {
            return null;
        }
        try {
            return (T) d(n).invoke(null, b());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    public abstract void p(int i2);

    public abstract void q(boolean z);

    public abstract void r(byte[] bArr);

    public abstract void s(CharSequence charSequence);

    public abstract void t(int i2);

    public abstract void u(Parcelable parcelable);

    public abstract void v(String str);

    /* JADX WARN: Multi-variable type inference failed */
    public void w(b bVar) {
        if (bVar == null) {
            v(null);
            return;
        }
        try {
            v(c(bVar.getClass()).getName());
            VersionedParcel b = b();
            try {
                e(bVar.getClass()).invoke(null, bVar, b);
                b.a();
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
            } catch (InvocationTargetException e5) {
                if (e5.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e5.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(bVar.getClass().getSimpleName() + " does not have a Parcelizer", e6);
        }
    }
}
