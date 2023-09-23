package e.i.d;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: TypefaceCompatApi28Impl.java */
/* loaded from: classes.dex */
public class i extends h {
    @Override // e.i.d.h
    public Typeface j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2457g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2463m.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // e.i.d.h
    public Method p(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
