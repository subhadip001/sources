package e.s;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: ViewModelProvider.java */
/* loaded from: classes.dex */
public class d0 extends g0 {
    public static d0 c;
    public Application b;

    public d0(Application application) {
        this.b = application;
    }

    @Override // e.s.g0, e.s.e0
    public <T extends b0> T a(Class<T> cls) {
        if (a.class.isAssignableFrom(cls)) {
            try {
                return cls.getConstructor(Application.class).newInstance(this.b);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException("Cannot create an instance of " + cls, e5);
            }
        }
        return (T) super.a(cls);
    }
}
