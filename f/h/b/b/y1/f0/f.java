package f.h.b.b.y1.f0;

import f.h.b.b.g2.t;
import f.h.b.b.y1.i;

/* compiled from: Sniffer.java */
/* loaded from: classes.dex */
public final class f {
    public final t a = new t(8);
    public int b;

    public final long a(i iVar) {
        int i2 = 0;
        iVar.o(this.a.a, 0, 1);
        int i3 = this.a.a[0] & 255;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while ((i3 & i4) == 0) {
            i4 >>= 1;
            i5++;
        }
        int i6 = i3 & (~i4);
        iVar.o(this.a.a, 1, i5);
        while (i2 < i5) {
            i2++;
            i6 = (this.a.a[i2] & 255) + (i6 << 8);
        }
        this.b = i5 + 1 + this.b;
        return i6;
    }
}
