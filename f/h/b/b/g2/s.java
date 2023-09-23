package f.h.b.b.g2;

/* compiled from: ParsableBitArray.java */
/* loaded from: classes.dex */
public final class s {
    public byte[] a;
    public int b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f4300d;

    public s() {
        this.a = b0.f4270f;
    }

    public final void a() {
        int i2;
        int i3 = this.b;
        f.h.b.b.e2.j.g(i3 >= 0 && (i3 < (i2 = this.f4300d) || (i3 == i2 && this.c == 0)));
    }

    public int b() {
        return ((this.f4300d - this.b) * 8) - this.c;
    }

    public void c() {
        if (this.c == 0) {
            return;
        }
        this.c = 0;
        this.b++;
        a();
    }

    public int d() {
        f.h.b.b.e2.j.g(this.c == 0);
        return this.b;
    }

    public int e() {
        return (this.b * 8) + this.c;
    }

    public boolean f() {
        boolean z = (this.a[this.b] & (128 >> this.c)) != 0;
        l();
        return z;
    }

    public int g(int i2) {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        this.c += i2;
        int i4 = 0;
        while (true) {
            i3 = this.c;
            if (i3 <= 8) {
                break;
            }
            int i5 = i3 - 8;
            this.c = i5;
            byte[] bArr = this.a;
            int i6 = this.b;
            this.b = i6 + 1;
            i4 |= (bArr[i6] & 255) << i5;
        }
        byte[] bArr2 = this.a;
        int i7 = this.b;
        int i8 = ((-1) >>> (32 - i2)) & (i4 | ((bArr2[i7] & 255) >> (8 - i3)));
        if (i3 == 8) {
            this.c = 0;
            this.b = i7 + 1;
        }
        a();
        return i8;
    }

    public void h(byte[] bArr, int i2, int i3) {
        int i4 = (i3 >> 3) + i2;
        while (i2 < i4) {
            byte[] bArr2 = this.a;
            int i5 = this.b;
            int i6 = i5 + 1;
            this.b = i6;
            byte b = bArr2[i5];
            int i7 = this.c;
            bArr[i2] = (byte) (b << i7);
            bArr[i2] = (byte) (((255 & bArr2[i6]) >> (8 - i7)) | bArr[i2]);
            i2++;
        }
        int i8 = i3 & 7;
        if (i8 == 0) {
            return;
        }
        bArr[i4] = (byte) (bArr[i4] & (255 >> i8));
        int i9 = this.c;
        if (i9 + i8 > 8) {
            int i10 = bArr[i4];
            byte[] bArr3 = this.a;
            int i11 = this.b;
            this.b = i11 + 1;
            bArr[i4] = (byte) (i10 | ((bArr3[i11] & 255) << i9));
            this.c = i9 - 8;
        }
        int i12 = this.c + i8;
        this.c = i12;
        byte[] bArr4 = this.a;
        int i13 = this.b;
        bArr[i4] = (byte) (((byte) (((255 & bArr4[i13]) >> (8 - i12)) << (8 - i8))) | bArr[i4]);
        if (i12 == 8) {
            this.c = 0;
            this.b = i13 + 1;
        }
        a();
    }

    public void i(byte[] bArr, int i2, int i3) {
        f.h.b.b.e2.j.g(this.c == 0);
        System.arraycopy(this.a, this.b, bArr, i2, i3);
        this.b += i3;
        a();
    }

    public void j(byte[] bArr, int i2) {
        this.a = bArr;
        this.b = 0;
        this.c = 0;
        this.f4300d = i2;
    }

    public void k(int i2) {
        int i3 = i2 / 8;
        this.b = i3;
        this.c = i2 - (i3 * 8);
        a();
    }

    public void l() {
        int i2 = this.c + 1;
        this.c = i2;
        if (i2 == 8) {
            this.c = 0;
            this.b++;
        }
        a();
    }

    public void m(int i2) {
        int i3 = i2 / 8;
        int i4 = this.b + i3;
        this.b = i4;
        int i5 = (i2 - (i3 * 8)) + this.c;
        this.c = i5;
        if (i5 > 7) {
            this.b = i4 + 1;
            this.c = i5 - 8;
        }
        a();
    }

    public void n(int i2) {
        f.h.b.b.e2.j.g(this.c == 0);
        this.b += i2;
        a();
    }

    public s(byte[] bArr) {
        int length = bArr.length;
        this.a = bArr;
        this.f4300d = length;
    }

    public s(byte[] bArr, int i2) {
        this.a = bArr;
        this.f4300d = i2;
    }
}
