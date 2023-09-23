package g.c.w.j;

import f.n.a.n.i;

/* compiled from: OpenHashSet.java */
/* loaded from: classes2.dex */
public final class e<T> {
    public int a;
    public int b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public T[] f8584d;

    public e() {
        int T = i.T(16);
        this.a = T - 1;
        this.c = (int) (T * 0.75f);
        this.f8584d = (T[]) new Object[T];
    }

    public static int b(int i2) {
        int i3 = i2 * (-1640531527);
        return i3 ^ (i3 >>> 16);
    }

    public boolean a(T t) {
        T t2;
        T[] tArr = this.f8584d;
        int i2 = this.a;
        int b = b(t.hashCode()) & i2;
        T t3 = tArr[b];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                b = (b + 1) & i2;
                t2 = tArr[b];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[b] = t;
        int i3 = this.b + 1;
        this.b = i3;
        if (i3 >= this.c) {
            T[] tArr2 = this.f8584d;
            int length = tArr2.length;
            int i4 = length << 1;
            int i5 = i4 - 1;
            T[] tArr3 = (T[]) new Object[i4];
            while (true) {
                int i6 = i3 - 1;
                if (i3 == 0) {
                    break;
                }
                do {
                    length--;
                } while (tArr2[length] == null);
                int b2 = b(tArr2[length].hashCode()) & i5;
                if (tArr3[b2] != null) {
                    do {
                        b2 = (b2 + 1) & i5;
                    } while (tArr3[b2] != null);
                }
                tArr3[b2] = tArr2[length];
                i3 = i6;
            }
            this.a = i5;
            this.c = (int) (i4 * 0.75f);
            this.f8584d = tArr3;
        }
        return true;
    }

    public boolean c(int i2, T[] tArr, int i3) {
        int i4;
        T t;
        this.b--;
        while (true) {
            int i5 = i2 + 1;
            while (true) {
                i4 = i5 & i3;
                t = tArr[i4];
                if (t == null) {
                    tArr[i2] = null;
                    return true;
                }
                int b = b(t.hashCode()) & i3;
                if (i2 > i4) {
                    if (i2 >= b && b > i4) {
                        break;
                    }
                    i5 = i4 + 1;
                } else if (i2 < b && b <= i4) {
                    i5 = i4 + 1;
                }
            }
            tArr[i2] = t;
            i2 = i4;
        }
    }
}
