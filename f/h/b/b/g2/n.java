package f.h.b.b.g2;

import java.util.Arrays;

/* compiled from: LongArray.java */
/* loaded from: classes.dex */
public final class n {
    public int a;
    public long[] b = new long[32];

    public void a(long j2) {
        int i2 = this.a;
        long[] jArr = this.b;
        if (i2 == jArr.length) {
            this.b = Arrays.copyOf(jArr, i2 * 2);
        }
        long[] jArr2 = this.b;
        int i3 = this.a;
        this.a = i3 + 1;
        jArr2[i3] = j2;
    }

    public long b(int i2) {
        if (i2 >= 0 && i2 < this.a) {
            return this.b[i2];
        }
        throw new IndexOutOfBoundsException(f.a.b.a.a.e(46, "Invalid index ", i2, ", size is ", this.a));
    }
}
