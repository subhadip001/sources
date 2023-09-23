package f.h.b.b.y1;

/* compiled from: VorbisBitArray.java */
/* loaded from: classes.dex */
public final class x {
    public final byte[] a;
    public final int b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f5111d;

    public x(byte[] bArr) {
        this.a = bArr;
        this.b = bArr.length;
    }

    public boolean a() {
        boolean z = (((this.a[this.c] & 255) >> this.f5111d) & 1) == 1;
        c(1);
        return z;
    }

    public int b(int i2) {
        int i3 = this.c;
        int min = Math.min(i2, 8 - this.f5111d);
        int i4 = i3 + 1;
        int i5 = ((this.a[i3] & 255) >> this.f5111d) & (255 >> (8 - min));
        while (min < i2) {
            i5 |= (this.a[i4] & 255) << min;
            min += 8;
            i4++;
        }
        int i6 = i5 & ((-1) >>> (32 - i2));
        c(i2);
        return i6;
    }

    public void c(int i2) {
        int i3;
        int i4 = i2 / 8;
        int i5 = this.c + i4;
        this.c = i5;
        int i6 = (i2 - (i4 * 8)) + this.f5111d;
        this.f5111d = i6;
        boolean z = true;
        if (i6 > 7) {
            this.c = i5 + 1;
            this.f5111d = i6 - 8;
        }
        int i7 = this.c;
        if (i7 < 0 || (i7 >= (i3 = this.b) && (i7 != i3 || this.f5111d != 0))) {
            z = false;
        }
        f.h.b.b.e2.j.g(z);
    }
}
