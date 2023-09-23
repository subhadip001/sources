package f.h.b.b.g2;

import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: ParsableByteArray.java */
/* loaded from: classes.dex */
public final class t {
    public byte[] a;
    public int b;
    public int c;

    public t() {
        this.a = b0.f4270f;
    }

    public void A(byte[] bArr, int i2) {
        this.a = bArr;
        this.c = i2;
        this.b = 0;
    }

    public void B(int i2) {
        f.h.b.b.e2.j.c(i2 >= 0 && i2 <= this.a.length);
        this.c = i2;
    }

    public void C(int i2) {
        f.h.b.b.e2.j.c(i2 >= 0 && i2 <= this.c);
        this.b = i2;
    }

    public void D(int i2) {
        C(this.b + i2);
    }

    public int a() {
        return this.c - this.b;
    }

    public void b(int i2) {
        byte[] bArr = this.a;
        if (i2 > bArr.length) {
            this.a = Arrays.copyOf(bArr, i2);
        }
    }

    public int c() {
        return this.a[this.b] & 255;
    }

    public void d(s sVar, int i2) {
        e(sVar.a, 0, i2);
        sVar.k(0);
    }

    public void e(byte[] bArr, int i2, int i3) {
        System.arraycopy(this.a, this.b, bArr, i2, i3);
        this.b += i3;
    }

    public int f() {
        byte[] bArr = this.a;
        int i2 = this.b;
        int i3 = i2 + 1;
        this.b = i3;
        int i4 = i3 + 1;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.b = i6 + 1;
        return (bArr[i6] & 255) | i7;
    }

    public String g() {
        if (a() == 0) {
            return null;
        }
        int i2 = this.b;
        while (i2 < this.c && !b0.z(this.a[i2])) {
            i2++;
        }
        int i3 = this.b;
        if (i2 - i3 >= 3) {
            byte[] bArr = this.a;
            if (bArr[i3] == -17 && bArr[i3 + 1] == -69 && bArr[i3 + 2] == -65) {
                this.b = i3 + 3;
            }
        }
        byte[] bArr2 = this.a;
        int i4 = this.b;
        String l2 = b0.l(bArr2, i4, i2 - i4);
        this.b = i2;
        int i5 = this.c;
        if (i2 == i5) {
            return l2;
        }
        byte[] bArr3 = this.a;
        if (bArr3[i2] == 13) {
            int i6 = i2 + 1;
            this.b = i6;
            if (i6 == i5) {
                return l2;
            }
        }
        int i7 = this.b;
        if (bArr3[i7] == 10) {
            this.b = i7 + 1;
        }
        return l2;
    }

    public int h() {
        byte[] bArr = this.a;
        int i2 = this.b;
        int i3 = i2 + 1;
        this.b = i3;
        int i4 = i3 + 1;
        this.b = i4;
        int i5 = (bArr[i2] & 255) | ((bArr[i3] & 255) << 8);
        int i6 = i4 + 1;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.b = i6 + 1;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    public long i() {
        byte[] bArr = this.a;
        int i2 = this.b;
        int i3 = i2 + 1;
        this.b = i3;
        int i4 = i3 + 1;
        this.b = i4;
        int i5 = i4 + 1;
        this.b = i5;
        this.b = i5 + 1;
        return (bArr[i2] & 255) | ((bArr[i3] & 255) << 8) | ((bArr[i4] & 255) << 16) | ((bArr[i5] & 255) << 24);
    }

    public int j() {
        int h2 = h();
        if (h2 >= 0) {
            return h2;
        }
        throw new IllegalStateException(f.a.b.a.a.d(29, "Top bit not zero: ", h2));
    }

    public int k() {
        byte[] bArr = this.a;
        int i2 = this.b;
        int i3 = i2 + 1;
        this.b = i3;
        this.b = i3 + 1;
        return ((bArr[i3] & 255) << 8) | (bArr[i2] & 255);
    }

    public long l() {
        byte[] bArr = this.a;
        int i2 = this.b;
        int i3 = i2 + 1;
        this.b = i3;
        int i4 = i3 + 1;
        this.b = i4;
        int i5 = i4 + 1;
        this.b = i5;
        int i6 = i5 + 1;
        this.b = i6;
        int i7 = i6 + 1;
        this.b = i7;
        int i8 = i7 + 1;
        this.b = i8;
        int i9 = i8 + 1;
        this.b = i9;
        this.b = i9 + 1;
        return ((bArr[i2] & 255) << 56) | ((bArr[i3] & 255) << 48) | ((bArr[i4] & 255) << 40) | ((bArr[i5] & 255) << 32) | ((bArr[i6] & 255) << 24) | ((bArr[i7] & 255) << 16) | ((bArr[i8] & 255) << 8) | (bArr[i9] & 255);
    }

    public String m() {
        if (a() == 0) {
            return null;
        }
        int i2 = this.b;
        while (i2 < this.c && this.a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.a;
        int i3 = this.b;
        String l2 = b0.l(bArr, i3, i2 - i3);
        this.b = i2;
        if (i2 < this.c) {
            this.b = i2 + 1;
        }
        return l2;
    }

    public String n(int i2) {
        if (i2 == 0) {
            return "";
        }
        int i3 = this.b;
        int i4 = (i3 + i2) - 1;
        String l2 = b0.l(this.a, i3, (i4 >= this.c || this.a[i4] != 0) ? i2 : i2 - 1);
        this.b += i2;
        return l2;
    }

    public String o(int i2) {
        return p(i2, f.h.c.a.c.c);
    }

    public String p(int i2, Charset charset) {
        String str = new String(this.a, this.b, i2, charset);
        this.b += i2;
        return str;
    }

    public int q() {
        return (r() << 21) | (r() << 14) | (r() << 7) | r();
    }

    public int r() {
        byte[] bArr = this.a;
        int i2 = this.b;
        this.b = i2 + 1;
        return bArr[i2] & 255;
    }

    public long s() {
        byte[] bArr = this.a;
        int i2 = this.b;
        int i3 = i2 + 1;
        this.b = i3;
        int i4 = i3 + 1;
        this.b = i4;
        int i5 = i4 + 1;
        this.b = i5;
        this.b = i5 + 1;
        return ((bArr[i2] & 255) << 24) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
    }

    public int t() {
        byte[] bArr = this.a;
        int i2 = this.b;
        int i3 = i2 + 1;
        this.b = i3;
        int i4 = i3 + 1;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
        this.b = i4 + 1;
        return (bArr[i4] & 255) | i5;
    }

    public int u() {
        int f2 = f();
        if (f2 >= 0) {
            return f2;
        }
        throw new IllegalStateException(f.a.b.a.a.d(29, "Top bit not zero: ", f2));
    }

    public long v() {
        long l2 = l();
        if (l2 >= 0) {
            return l2;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(l2);
        throw new IllegalStateException(sb.toString());
    }

    public int w() {
        byte[] bArr = this.a;
        int i2 = this.b;
        int i3 = i2 + 1;
        this.b = i3;
        this.b = i3 + 1;
        return (bArr[i3] & 255) | ((bArr[i2] & 255) << 8);
    }

    public long x() {
        int i2;
        int i3;
        byte b;
        int i4;
        long j2 = this.a[this.b];
        int i5 = 7;
        while (true) {
            if (i5 < 0) {
                break;
            }
            if (((1 << i5) & j2) != 0) {
                i5--;
            } else if (i5 < 6) {
                j2 &= i4 - 1;
                i3 = 7 - i5;
            } else if (i5 == 7) {
                i3 = 1;
            }
        }
        i3 = 0;
        if (i3 != 0) {
            for (i2 = 1; i2 < i3; i2++) {
                if ((this.a[this.b + i2] & 192) != 128) {
                    StringBuilder sb = new StringBuilder(62);
                    sb.append("Invalid UTF-8 sequence continuation byte: ");
                    sb.append(j2);
                    throw new NumberFormatException(sb.toString());
                }
                j2 = (j2 << 6) | (b & 63);
            }
            this.b += i3;
            return j2;
        }
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Invalid UTF-8 sequence first byte: ");
        sb2.append(j2);
        throw new NumberFormatException(sb2.toString());
    }

    public void y(int i2) {
        byte[] bArr = this.a;
        if (bArr.length < i2) {
            bArr = new byte[i2];
        }
        A(bArr, i2);
    }

    public void z(byte[] bArr) {
        int length = bArr.length;
        this.a = bArr;
        this.c = length;
        this.b = 0;
    }

    public t(int i2) {
        this.a = new byte[i2];
        this.c = i2;
    }

    public t(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public t(byte[] bArr, int i2) {
        this.a = bArr;
        this.c = i2;
    }
}
