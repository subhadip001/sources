package j.a.y1;

import j.a.q0;
import j.a.y1.w;
import java.lang.Comparable;
import java.util.Arrays;

/* compiled from: ThreadSafeHeap.kt */
/* loaded from: classes2.dex */
public class v<T extends w & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;
    public T[] a;

    public final void a(T t) {
        q0.b bVar = (q0.b) t;
        bVar.a(this);
        T[] tArr = this.a;
        if (tArr == null) {
            tArr = (T[]) new w[4];
            this.a = tArr;
        } else if (this._size >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, this._size * 2);
            i.l.b.i.d(copyOf, "copyOf(this, newSize)");
            tArr = (T[]) ((w[]) copyOf);
            this.a = tArr;
        }
        int i2 = this._size;
        this._size = i2 + 1;
        tArr[i2] = t;
        bVar.f8781g = i2;
        f(i2);
    }

    public final T b() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final boolean c() {
        return this._size == 0;
    }

    public final T d(int i2) {
        T[] tArr = this.a;
        i.l.b.i.b(tArr);
        this._size--;
        if (i2 < this._size) {
            g(i2, this._size);
            int i3 = (i2 - 1) / 2;
            if (i2 > 0) {
                T t = tArr[i2];
                i.l.b.i.b(t);
                T t2 = tArr[i3];
                i.l.b.i.b(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    g(i2, i3);
                    f(i3);
                }
            }
            while (true) {
                int i4 = (i2 * 2) + 1;
                if (i4 >= this._size) {
                    break;
                }
                T[] tArr2 = this.a;
                i.l.b.i.b(tArr2);
                int i5 = i4 + 1;
                if (i5 < this._size) {
                    T t3 = tArr2[i5];
                    i.l.b.i.b(t3);
                    T t4 = tArr2[i4];
                    i.l.b.i.b(t4);
                    if (((Comparable) t3).compareTo(t4) < 0) {
                        i4 = i5;
                    }
                }
                T t5 = tArr2[i2];
                i.l.b.i.b(t5);
                T t6 = tArr2[i4];
                i.l.b.i.b(t6);
                if (((Comparable) t5).compareTo(t6) <= 0) {
                    break;
                }
                g(i2, i4);
                i2 = i4;
            }
        }
        T t7 = tArr[this._size];
        i.l.b.i.b(t7);
        t7.a(null);
        t7.f(-1);
        tArr[this._size] = null;
        return t7;
    }

    public final T e() {
        T d2;
        synchronized (this) {
            d2 = this._size > 0 ? d(0) : null;
        }
        return d2;
    }

    public final void f(int i2) {
        while (i2 > 0) {
            T[] tArr = this.a;
            i.l.b.i.b(tArr);
            int i3 = (i2 - 1) / 2;
            T t = tArr[i3];
            i.l.b.i.b(t);
            T t2 = tArr[i2];
            i.l.b.i.b(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            g(i2, i3);
            i2 = i3;
        }
    }

    public final void g(int i2, int i3) {
        T[] tArr = this.a;
        i.l.b.i.b(tArr);
        T t = tArr[i3];
        i.l.b.i.b(t);
        T t2 = tArr[i2];
        i.l.b.i.b(t2);
        tArr[i2] = t;
        tArr[i3] = t2;
        t.f(i2);
        t2.f(i3);
    }
}
