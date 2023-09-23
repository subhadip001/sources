package f.h.b.b.g2;

import java.util.Arrays;

/* compiled from: TimedValueQueue.java */
/* loaded from: classes.dex */
public final class z<V> {
    public long[] a = new long[10];
    public V[] b = (V[]) new Object[10];
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f4312d;

    public synchronized void a(long j2, V v) {
        int i2 = this.f4312d;
        if (i2 > 0) {
            if (j2 <= this.a[((this.c + i2) - 1) % this.b.length]) {
                b();
            }
        }
        c();
        int i3 = this.c;
        int i4 = this.f4312d;
        V[] vArr = this.b;
        int length = (i3 + i4) % vArr.length;
        this.a[length] = j2;
        vArr[length] = v;
        this.f4312d = i4 + 1;
    }

    public synchronized void b() {
        this.c = 0;
        this.f4312d = 0;
        Arrays.fill(this.b, (Object) null);
    }

    public final void c() {
        int length = this.b.length;
        if (this.f4312d < length) {
            return;
        }
        int i2 = length * 2;
        long[] jArr = new long[i2];
        V[] vArr = (V[]) new Object[i2];
        int i3 = this.c;
        int i4 = length - i3;
        System.arraycopy(this.a, i3, jArr, 0, i4);
        System.arraycopy(this.b, this.c, vArr, 0, i4);
        int i5 = this.c;
        if (i5 > 0) {
            System.arraycopy(this.a, 0, jArr, i4, i5);
            System.arraycopy(this.b, 0, vArr, i4, this.c);
        }
        this.a = jArr;
        this.b = vArr;
        this.c = 0;
    }

    public final V d(long j2, boolean z) {
        V v = null;
        long j3 = Long.MAX_VALUE;
        while (this.f4312d > 0) {
            long j4 = j2 - this.a[this.c];
            if (j4 < 0 && (z || (-j4) >= j3)) {
                break;
            }
            v = f();
            j3 = j4;
        }
        return v;
    }

    public synchronized V e(long j2) {
        return d(j2, true);
    }

    public final V f() {
        f.h.b.b.e2.j.g(this.f4312d > 0);
        V[] vArr = this.b;
        int i2 = this.c;
        V v = vArr[i2];
        vArr[i2] = null;
        this.c = (i2 + 1) % vArr.length;
        this.f4312d--;
        return v;
    }
}
