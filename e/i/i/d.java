package e.i.i;

/* compiled from: Pools.java */
/* loaded from: classes.dex */
public class d<T> implements c<T> {
    public final Object[] a;
    public int b;

    public d(int i2) {
        if (i2 > 0) {
            this.a = new Object[i2];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // e.i.i.c
    public boolean a(T t) {
        int i2;
        boolean z;
        int i3 = 0;
        while (true) {
            i2 = this.b;
            if (i3 >= i2) {
                z = false;
                break;
            } else if (this.a[i3] == t) {
                z = true;
                break;
            } else {
                i3++;
            }
        }
        if (!z) {
            Object[] objArr = this.a;
            if (i2 < objArr.length) {
                objArr[i2] = t;
                this.b = i2 + 1;
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    @Override // e.i.i.c
    public T b() {
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
}
