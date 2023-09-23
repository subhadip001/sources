package e.s;

/* compiled from: ViewModelProvider.java */
/* loaded from: classes.dex */
public class g0 implements e0 {
    public static g0 a;

    @Override // e.s.e0
    public <T extends b0> T a(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        }
    }
}
