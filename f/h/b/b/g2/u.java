package f.h.b.b.g2;

/* compiled from: ParsableNalUnitBitArray.java */
/* loaded from: classes.dex */
public final class u {
    public byte[] a;
    public int b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f4301d = 0;

    public u(byte[] bArr, int i2, int i3) {
        this.a = bArr;
        this.c = i2;
        this.b = i3;
        a();
    }

    public final void a() {
        int i2;
        int i3 = this.c;
        f.h.b.b.e2.j.g(i3 >= 0 && (i3 < (i2 = this.b) || (i3 == i2 && this.f4301d == 0)));
    }

    public boolean b(int i2) {
        int i3 = this.c;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        int i6 = (this.f4301d + i2) - (i4 * 8);
        if (i6 > 7) {
            i5++;
            i6 -= 8;
        }
        while (true) {
            i3++;
            if (i3 > i5 || i5 >= this.b) {
                break;
            } else if (i(i3)) {
                i5++;
                i3 += 2;
            }
        }
        int i7 = this.b;
        if (i5 >= i7) {
            return i5 == i7 && i6 == 0;
        }
        return true;
    }

    public boolean c() {
        int i2 = this.c;
        int i3 = this.f4301d;
        int i4 = 0;
        while (this.c < this.b && !d()) {
            i4++;
        }
        boolean z = this.c == this.b;
        this.c = i2;
        this.f4301d = i3;
        return !z && b((i4 * 2) + 1);
    }

    public boolean d() {
        boolean z = (this.a[this.c] & (128 >> this.f4301d)) != 0;
        j();
        return z;
    }

    public int e(int i2) {
        int i3;
        this.f4301d += i2;
        int i4 = 0;
        while (true) {
            i3 = this.f4301d;
            if (i3 <= 8) {
                break;
            }
            int i5 = i3 - 8;
            this.f4301d = i5;
            byte[] bArr = this.a;
            int i6 = this.c;
            i4 |= (bArr[i6] & 255) << i5;
            if (!i(i6 + 1)) {
                r3 = 1;
            }
            this.c = i6 + r3;
        }
        byte[] bArr2 = this.a;
        int i7 = this.c;
        int i8 = ((-1) >>> (32 - i2)) & (i4 | ((bArr2[i7] & 255) >> (8 - i3)));
        if (i3 == 8) {
            this.f4301d = 0;
            this.c = i7 + (i(i7 + 1) ? 2 : 1);
        }
        a();
        return i8;
    }

    public final int f() {
        int i2 = 0;
        while (!d()) {
            i2++;
        }
        return ((1 << i2) - 1) + (i2 > 0 ? e(i2) : 0);
    }

    public int g() {
        int f2 = f();
        return ((f2 + 1) / 2) * (f2 % 2 == 0 ? -1 : 1);
    }

    public void h(byte[] bArr, int i2, int i3) {
        this.a = bArr;
        this.c = i2;
        this.b = i3;
        this.f4301d = 0;
        a();
    }

    public final boolean i(int i2) {
        if (2 <= i2 && i2 < this.b) {
            byte[] bArr = this.a;
            if (bArr[i2] == 3 && bArr[i2 - 2] == 0 && bArr[i2 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public void j() {
        int i2 = this.f4301d + 1;
        this.f4301d = i2;
        if (i2 == 8) {
            this.f4301d = 0;
            int i3 = this.c;
            this.c = i3 + (i(i3 + 1) ? 2 : 1);
        }
        a();
    }

    public void k(int i2) {
        int i3 = this.c;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        this.c = i5;
        int i6 = (i2 - (i4 * 8)) + this.f4301d;
        this.f4301d = i6;
        if (i6 > 7) {
            this.c = i5 + 1;
            this.f4301d = i6 - 8;
        }
        while (true) {
            i3++;
            if (i3 <= this.c) {
                if (i(i3)) {
                    this.c++;
                    i3 += 2;
                }
            } else {
                a();
                return;
            }
        }
    }
}
