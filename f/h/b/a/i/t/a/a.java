package f.h.b.a.i.t.a;

/* compiled from: DoubleCheck.java */
/* loaded from: classes.dex */
public final class a<T> implements h.a.a<T> {
    public static final Object c = new Object();
    public volatile h.a.a<T> a;
    public volatile Object b = c;

    public a(h.a.a<T> aVar) {
        this.a = aVar;
    }

    public static Object a(Object obj, Object obj2) {
        if (!(obj != c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // h.a.a
    public T get() {
        T t = (T) this.b;
        Object obj = c;
        if (t == obj) {
            synchronized (this) {
                t = this.b;
                if (t == obj) {
                    t = this.a.get();
                    a(this.b, t);
                    this.b = t;
                    this.a = null;
                }
            }
        }
        return t;
    }
}
