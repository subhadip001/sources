package e.p.c;

import androidx.fragment.app.Fragment;

/* compiled from: FragmentFactory.java */
/* loaded from: classes.dex */
public class v {
    public static final e.f.h<ClassLoader, e.f.h<String, Class<?>>> a = new e.f.h<>();

    public static Class<?> b(ClassLoader classLoader, String str) {
        e.f.h<ClassLoader, e.f.h<String, Class<?>>> hVar = a;
        e.f.h<String, Class<?>> orDefault = hVar.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new e.f.h<>();
            hVar.put(classLoader, orDefault);
        }
        Class<?> orDefault2 = orDefault.getOrDefault(str, null);
        if (orDefault2 == null) {
            Class<?> cls = Class.forName(str, false, classLoader);
            orDefault.put(str, cls);
            return cls;
        }
        return orDefault2;
    }

    public static Class<? extends Fragment> c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e2) {
            throw new Fragment.InstantiationException(f.a.b.a.a.q("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e2);
        } catch (ClassNotFoundException e3) {
            throw new Fragment.InstantiationException(f.a.b.a.a.q("Unable to instantiate fragment ", str, ": make sure class name exists"), e3);
        }
    }

    public Fragment a(ClassLoader classLoader, String str) {
        throw null;
    }
}
