package com.google.common.io;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class BaseEncoding {
    public static final BaseEncoding a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    public static final BaseEncoding b;

    /* loaded from: classes.dex */
    public static final class DecodingException extends IOException {
        public DecodingException(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class a {
        public final String a;
        public final char[] b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f1272d;

        /* renamed from: e  reason: collision with root package name */
        public final int f1273e;

        /* renamed from: f  reason: collision with root package name */
        public final int f1274f;

        /* renamed from: g  reason: collision with root package name */
        public final byte[] f1275g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean[] f1276h;

        public a(String str, char[] cArr) {
            Objects.requireNonNull(str);
            this.a = str;
            Objects.requireNonNull(cArr);
            this.b = cArr;
            try {
                int b = f.h.c.d.a.b(cArr.length, RoundingMode.UNNECESSARY);
                this.f1272d = b;
                int min = Math.min(8, Integer.lowestOneBit(b));
                try {
                    this.f1273e = 8 / min;
                    this.f1274f = b / min;
                    this.c = cArr.length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i2 = 0; i2 < cArr.length; i2++) {
                        char c = cArr[i2];
                        f.h.b.c.a.n(c < 128, "Non-ASCII character: %s", c);
                        f.h.b.c.a.n(bArr[c] == -1, "Duplicate character: %s", c);
                        bArr[c] = (byte) i2;
                    }
                    this.f1275g = bArr;
                    boolean[] zArr = new boolean[this.f1273e];
                    for (int i3 = 0; i3 < this.f1274f; i3++) {
                        zArr[f.h.c.d.a.a(i3 * 8, this.f1272d, RoundingMode.CEILING)] = true;
                    }
                    this.f1276h = zArr;
                } catch (ArithmeticException e2) {
                    String str2 = new String(cArr);
                    throw new IllegalArgumentException(str2.length() != 0 ? "Illegal alphabet ".concat(str2) : new String("Illegal alphabet "), e2);
                }
            } catch (ArithmeticException e3) {
                throw new IllegalArgumentException(f.a.b.a.a.d(35, "Illegal alphabet length ", cArr.length), e3);
            }
        }

        public int a(char c) {
            if (c > 127) {
                String valueOf = String.valueOf(Integer.toHexString(c));
                throw new DecodingException(valueOf.length() != 0 ? "Unrecognized character: 0x".concat(valueOf) : new String("Unrecognized character: 0x"));
            }
            byte b = this.f1275g[c];
            if (b == -1) {
                if (c > ' ' && c != 127) {
                    StringBuilder sb = new StringBuilder(25);
                    sb.append("Unrecognized character: ");
                    sb.append(c);
                    throw new DecodingException(sb.toString());
                }
                String valueOf2 = String.valueOf(Integer.toHexString(c));
                throw new DecodingException(valueOf2.length() != 0 ? "Unrecognized character: 0x".concat(valueOf2) : new String("Unrecognized character: 0x"));
            }
            return b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Arrays.equals(this.b, ((a) obj).b);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.b);
        }

        public String toString() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends d {

        /* renamed from: f  reason: collision with root package name */
        public final char[] f1277f;

        public b(a aVar) {
            super(aVar, null);
            this.f1277f = new char[512];
            f.h.b.c.a.l(aVar.b.length == 16);
            for (int i2 = 0; i2 < 256; i2++) {
                char[] cArr = this.f1277f;
                char[] cArr2 = aVar.b;
                cArr[i2] = cArr2[i2 >>> 4];
                cArr[i2 | 256] = cArr2[i2 & 15];
            }
        }

        @Override // com.google.common.io.BaseEncoding.d, com.google.common.io.BaseEncoding
        public int b(byte[] bArr, CharSequence charSequence) {
            if (charSequence.length() % 2 != 1) {
                int i2 = 0;
                int i3 = 0;
                while (i2 < charSequence.length()) {
                    bArr[i3] = (byte) ((this.c.a(charSequence.charAt(i2)) << 4) | this.c.a(charSequence.charAt(i2 + 1)));
                    i2 += 2;
                    i3++;
                }
                return i3;
            }
            throw new DecodingException(f.a.b.a.a.d(32, "Invalid input length ", charSequence.length()));
        }

        @Override // com.google.common.io.BaseEncoding.d, com.google.common.io.BaseEncoding
        public void d(Appendable appendable, byte[] bArr, int i2, int i3) {
            f.h.b.c.a.A(i2, i2 + i3, bArr.length);
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = bArr[i2 + i4] & 255;
                appendable.append(this.f1277f[i5]);
                appendable.append(this.f1277f[i5 | 256]);
            }
        }

        @Override // com.google.common.io.BaseEncoding.d
        public BaseEncoding h(a aVar, Character ch) {
            return new b(aVar);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends BaseEncoding {
        public final a c;

        /* renamed from: d  reason: collision with root package name */
        public final Character f1278d;

        /* renamed from: e  reason: collision with root package name */
        public transient BaseEncoding f1279e;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
            if ((r2 < r5.length && r5[r2] != -1) == false) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public d(com.google.common.io.BaseEncoding.a r5, java.lang.Character r6) {
            /*
                r4 = this;
                r4.<init>()
                java.util.Objects.requireNonNull(r5)
                r4.c = r5
                r0 = 0
                r1 = 1
                if (r6 == 0) goto L1f
                char r2 = r6.charValue()
                byte[] r5 = r5.f1275g
                int r3 = r5.length
                if (r2 >= r3) goto L1c
                r5 = r5[r2]
                r2 = -1
                if (r5 == r2) goto L1c
                r5 = 1
                goto L1d
            L1c:
                r5 = 0
            L1d:
                if (r5 != 0) goto L20
            L1f:
                r0 = 1
            L20:
                java.lang.String r5 = "Padding character %s was already in alphabet"
                f.h.b.c.a.q(r0, r5, r6)
                r4.f1278d = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.BaseEncoding.d.<init>(com.google.common.io.BaseEncoding$a, java.lang.Character):void");
        }

        @Override // com.google.common.io.BaseEncoding
        public int b(byte[] bArr, CharSequence charSequence) {
            a aVar;
            CharSequence e2 = e(charSequence);
            a aVar2 = this.c;
            if (aVar2.f1276h[e2.length() % aVar2.f1273e]) {
                int i2 = 0;
                int i3 = 0;
                while (i2 < e2.length()) {
                    long j2 = 0;
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        aVar = this.c;
                        if (i4 >= aVar.f1273e) {
                            break;
                        }
                        j2 <<= aVar.f1272d;
                        if (i2 + i4 < e2.length()) {
                            j2 |= this.c.a(e2.charAt(i5 + i2));
                            i5++;
                        }
                        i4++;
                    }
                    int i6 = aVar.f1274f;
                    int i7 = (i6 * 8) - (i5 * aVar.f1272d);
                    int i8 = (i6 - 1) * 8;
                    while (i8 >= i7) {
                        bArr[i3] = (byte) ((j2 >>> i8) & 255);
                        i8 -= 8;
                        i3++;
                    }
                    i2 += this.c.f1273e;
                }
                return i3;
            }
            throw new DecodingException(f.a.b.a.a.d(32, "Invalid input length ", e2.length()));
        }

        @Override // com.google.common.io.BaseEncoding
        public void d(Appendable appendable, byte[] bArr, int i2, int i3) {
            f.h.b.c.a.A(i2, i2 + i3, bArr.length);
            int i4 = 0;
            while (i4 < i3) {
                g(appendable, bArr, i2 + i4, Math.min(this.c.f1274f, i3 - i4));
                i4 += this.c.f1274f;
            }
        }

        @Override // com.google.common.io.BaseEncoding
        public CharSequence e(CharSequence charSequence) {
            Objects.requireNonNull(charSequence);
            Character ch = this.f1278d;
            if (ch == null) {
                return charSequence;
            }
            char charValue = ch.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == charValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.c.equals(dVar.c) && f.h.b.c.a.i0(this.f1278d, dVar.f1278d);
            }
            return false;
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding f() {
            boolean z;
            boolean z2;
            BaseEncoding baseEncoding = this.f1279e;
            if (baseEncoding == null) {
                a aVar = this.c;
                char[] cArr = aVar.b;
                int length = cArr.length;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        z = false;
                        break;
                    } else if (f.h.b.c.a.z0(cArr[i3])) {
                        z = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (z) {
                    char[] cArr2 = aVar.b;
                    int length2 = cArr2.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            z2 = false;
                            break;
                        } else if (f.h.b.c.a.C0(cArr2[i4])) {
                            z2 = true;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    f.h.b.c.a.C(!z2, "Cannot call upperCase() on a mixed-case alphabet");
                    char[] cArr3 = new char[aVar.b.length];
                    while (true) {
                        char[] cArr4 = aVar.b;
                        if (i2 >= cArr4.length) {
                            break;
                        }
                        char c = cArr4[i2];
                        if (f.h.b.c.a.z0(c)) {
                            c = (char) (c ^ ' ');
                        }
                        cArr3[i2] = c;
                        i2++;
                    }
                    aVar = new a(String.valueOf(aVar.a).concat(".upperCase()"), cArr3);
                }
                baseEncoding = aVar == this.c ? this : h(aVar, this.f1278d);
                this.f1279e = baseEncoding;
            }
            return baseEncoding;
        }

        public void g(Appendable appendable, byte[] bArr, int i2, int i3) {
            f.h.b.c.a.A(i2, i2 + i3, bArr.length);
            int i4 = 0;
            f.h.b.c.a.l(i3 <= this.c.f1274f);
            long j2 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                j2 = (j2 | (bArr[i2 + i5] & 255)) << 8;
            }
            int i6 = ((i3 + 1) * 8) - this.c.f1272d;
            while (i4 < i3 * 8) {
                a aVar = this.c;
                appendable.append(aVar.b[((int) (j2 >>> (i6 - i4))) & aVar.c]);
                i4 += this.c.f1272d;
            }
            if (this.f1278d != null) {
                while (i4 < this.c.f1274f * 8) {
                    appendable.append(this.f1278d.charValue());
                    i4 += this.c.f1272d;
                }
            }
        }

        public BaseEncoding h(a aVar, Character ch) {
            return new d(aVar, ch);
        }

        public int hashCode() {
            return this.c.hashCode() ^ Arrays.hashCode(new Object[]{this.f1278d});
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.c.a);
            if (8 % this.c.f1272d != 0) {
                if (this.f1278d == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.f1278d);
                    sb.append("')");
                }
            }
            return sb.toString();
        }
    }

    static {
        new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new d(new a("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567".toCharArray()), '=');
        new d(new a("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV".toCharArray()), '=');
        b = new b(new a("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public final byte[] a(CharSequence charSequence) {
        try {
            CharSequence e2 = e(charSequence);
            int length = (int) (((((d) this).c.f1272d * e2.length()) + 7) / 8);
            byte[] bArr = new byte[length];
            int b2 = b(bArr, e2);
            if (b2 == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[b2];
            System.arraycopy(bArr, 0, bArr2, 0, b2);
            return bArr2;
        } catch (DecodingException e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public abstract int b(byte[] bArr, CharSequence charSequence);

    public String c(byte[] bArr) {
        int length = bArr.length;
        f.h.b.c.a.A(0, 0 + length, bArr.length);
        a aVar = ((d) this).c;
        StringBuilder sb = new StringBuilder(f.h.c.d.a.a(length, aVar.f1274f, RoundingMode.CEILING) * aVar.f1273e);
        try {
            d(sb, bArr, 0, length);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public abstract void d(Appendable appendable, byte[] bArr, int i2, int i3);

    public abstract CharSequence e(CharSequence charSequence);

    public abstract BaseEncoding f();

    /* loaded from: classes.dex */
    public static final class c extends d {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public c(java.lang.String r2, java.lang.String r3, java.lang.Character r4) {
            /*
                r1 = this;
                com.google.common.io.BaseEncoding$a r0 = new com.google.common.io.BaseEncoding$a
                char[] r3 = r3.toCharArray()
                r0.<init>(r2, r3)
                r1.<init>(r0, r4)
                char[] r2 = r0.b
                int r2 = r2.length
                r3 = 64
                if (r2 != r3) goto L15
                r2 = 1
                goto L16
            L15:
                r2 = 0
            L16:
                f.h.b.c.a.l(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.BaseEncoding.c.<init>(java.lang.String, java.lang.String, java.lang.Character):void");
        }

        @Override // com.google.common.io.BaseEncoding.d, com.google.common.io.BaseEncoding
        public int b(byte[] bArr, CharSequence charSequence) {
            CharSequence e2 = e(charSequence);
            a aVar = this.c;
            if (aVar.f1276h[e2.length() % aVar.f1273e]) {
                int i2 = 0;
                int i3 = 0;
                while (i2 < e2.length()) {
                    int i4 = i2 + 1;
                    int i5 = i4 + 1;
                    int a = (this.c.a(e2.charAt(i2)) << 18) | (this.c.a(e2.charAt(i4)) << 12);
                    int i6 = i3 + 1;
                    bArr[i3] = (byte) (a >>> 16);
                    if (i5 < e2.length()) {
                        int i7 = i5 + 1;
                        int a2 = a | (this.c.a(e2.charAt(i5)) << 6);
                        i3 = i6 + 1;
                        bArr[i6] = (byte) ((a2 >>> 8) & 255);
                        if (i7 < e2.length()) {
                            i5 = i7 + 1;
                            i6 = i3 + 1;
                            bArr[i3] = (byte) ((a2 | this.c.a(e2.charAt(i7))) & 255);
                        } else {
                            i2 = i7;
                        }
                    }
                    i3 = i6;
                    i2 = i5;
                }
                return i3;
            }
            throw new DecodingException(f.a.b.a.a.d(32, "Invalid input length ", e2.length()));
        }

        @Override // com.google.common.io.BaseEncoding.d, com.google.common.io.BaseEncoding
        public void d(Appendable appendable, byte[] bArr, int i2, int i3) {
            int i4 = i2 + i3;
            f.h.b.c.a.A(i2, i4, bArr.length);
            while (i3 >= 3) {
                int i5 = i2 + 1;
                int i6 = i5 + 1;
                int i7 = ((bArr[i2] & 255) << 16) | ((bArr[i5] & 255) << 8);
                int i8 = i7 | (bArr[i6] & 255);
                appendable.append(this.c.b[i8 >>> 18]);
                appendable.append(this.c.b[(i8 >>> 12) & 63]);
                appendable.append(this.c.b[(i8 >>> 6) & 63]);
                appendable.append(this.c.b[i8 & 63]);
                i3 -= 3;
                i2 = i6 + 1;
            }
            if (i2 < i4) {
                g(appendable, bArr, i2, i4 - i2);
            }
        }

        @Override // com.google.common.io.BaseEncoding.d
        public BaseEncoding h(a aVar, Character ch) {
            return new c(aVar, ch);
        }

        public c(a aVar, Character ch) {
            super(aVar, ch);
            f.h.b.c.a.l(aVar.b.length == 64);
        }
    }
}
