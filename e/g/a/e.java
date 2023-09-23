package e.g.a;

/* compiled from: Pools.java */
/* loaded from: classes.dex */
public class e<T> {
    public final Object[] a;
    public int b;

    public e(int i2) {
        if (i2 > 0) {
            this.a = new Object[i2];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public T a() {
        int i2 = this.b;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = this.a;
            T t = (T) objArr[i3];
            objArr[i3] = null;
            this.b = i2 - 1;
            return t;
        }
        return null;
    }

    public boolean b(T t) {
        int i2 = this.b;
        Object[] objArr = this.a;
        if (i2 < objArr.length) {
            objArr[i2] = t;
            this.b = i2 + 1;
            return true;
        }
        return false;
    }
}
