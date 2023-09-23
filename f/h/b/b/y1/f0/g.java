package f.h.b.b.y1.f0;

import f.h.b.b.y1.i;

/* compiled from: VarintReader.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: d  reason: collision with root package name */
    public static final long[] f4769d = {128, 64, 32, 16, 8, 4, 2, 1};
    public final byte[] a = new byte[8];
    public int b;
    public int c;

    public static long a(byte[] bArr, int i2, boolean z) {
        long j2 = bArr[0] & 255;
        if (z) {
            j2 &= ~f4769d[i2 - 1];
        }
        for (int i3 = 1; i3 < i2; i3++) {
            j2 = (j2 << 8) | (bArr[i3] & 255);
        }
        return j2;
    }

    public static int b(int i2) {
        int i3 = 0;
        while (true) {
            long[] jArr = f4769d;
            if (i3 >= jArr.length) {
                return -1;
            }
            if ((jArr[i3] & i2) != 0) {
                return i3 + 1;
            }
            i3++;
        }
    }

    public long c(i iVar, boolean z, boolean z2, int i2) {
        if (this.b == 0) {
            if (!iVar.c(this.a, 0, 1, z)) {
                return -1L;
            }
            int b = b(this.a[0] & 255);
            this.c = b;
            if (b != -1) {
                this.b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i3 = this.c;
        if (i3 > i2) {
            this.b = 0;
            return -2L;
        }
        if (i3 != 1) {
            iVar.readFully(this.a, 1, i3 - 1);
        }
        this.b = 0;
        return a(this.a, this.c, z2);
    }
}
