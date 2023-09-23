package e.s;

/* compiled from: ViewModelProvider.java */
/* loaded from: classes.dex */
public abstract class f0 extends h0 implements e0 {
    @Override // e.s.e0
    public <T extends b0> T a(Class<T> cls) {
        throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
    }

    public abstract <T extends b0> T c(String str, Class<T> cls);
}
