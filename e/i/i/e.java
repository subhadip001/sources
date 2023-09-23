package e.i.i;

/* compiled from: Pools.java */
/* loaded from: classes.dex */
public class e<T> extends d<T> {
    public final Object c;

    public e(int i2) {
        super(i2);
        this.c = new Object();
    }

    @Override // e.i.i.d, e.i.i.c
    public boolean a(T t) {
        boolean a;
        synchronized (this.c) {
            a = super.a(t);
        }
        return a;
    }

    @Override // e.i.i.d, e.i.i.c
    public T b() {
        T t;
        synchronized (this.c) {
            t = (T) super.b();
        }
        return t;
    }
}
