package l;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* compiled from: ByteString.java */
/* loaded from: classes2.dex */
public class i implements Serializable, Comparable<i> {

    /* renamed from: i  reason: collision with root package name */
    public static final char[] f9231i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: j  reason: collision with root package name */
    public static final i f9232j = m(new byte[0]);

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f9233f;

    /* renamed from: g  reason: collision with root package name */
    public transient int f9234g;

    /* renamed from: h  reason: collision with root package name */
    public transient String f9235h;

    public i(byte[] bArr) {
        this.f9233f = bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a3, code lost:
        r5 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static l.i d(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.i.d(java.lang.String):l.i");
    }

    public static i f(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 * 2;
                bArr[i2] = (byte) (g(str.charAt(i3 + 1)) + (g(str.charAt(i3)) << 4));
            }
            return m(bArr);
        }
        throw new IllegalArgumentException(f.a.b.a.a.p("Unexpected hex string: ", str));
    }

    public static int g(char c) {
        if (c < '0' || c > '9') {
            char c2 = 'a';
            if (c < 'a' || c > 'f') {
                c2 = 'A';
                if (c < 'A' || c > 'F') {
                    throw new IllegalArgumentException("Unexpected hex digit: " + c);
                }
            }
            return (c - c2) + 10;
        }
        return c - '0';
    }

    public static i j(String str) {
        if (str != null) {
            i iVar = new i(str.getBytes(a0.a));
            iVar.f9235h = str;
            return iVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    public static i m(byte... bArr) {
        if (bArr != null) {
            return new i((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public String a() {
        byte[] bArr = this.f9233f;
        byte[] bArr2 = d.a;
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int i4 = i2 + 1;
            bArr3[i2] = bArr2[(bArr[i3] & 255) >> 2];
            int i5 = i4 + 1;
            int i6 = i3 + 1;
            bArr3[i4] = bArr2[((bArr[i3] & 3) << 4) | ((bArr[i6] & 255) >> 4)];
            int i7 = i5 + 1;
            int i8 = i3 + 2;
            bArr3[i5] = bArr2[((bArr[i6] & 15) << 2) | ((bArr[i8] & 255) >> 6)];
            i2 = i7 + 1;
            bArr3[i7] = bArr2[bArr[i8] & 63];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            int i9 = i2 + 1;
            bArr3[i2] = bArr2[(bArr[length] & 255) >> 2];
            int i10 = i9 + 1;
            bArr3[i9] = bArr2[(bArr[length] & 3) << 4];
            bArr3[i10] = 61;
            bArr3[i10 + 1] = 61;
        } else if (length2 == 2) {
            int i11 = i2 + 1;
            bArr3[i2] = bArr2[(bArr[length] & 255) >> 2];
            int i12 = i11 + 1;
            int i13 = length + 1;
            bArr3[i11] = bArr2[((bArr[i13] & 255) >> 4) | ((bArr[length] & 3) << 4)];
            bArr3[i12] = bArr2[(bArr[i13] & 15) << 2];
            bArr3[i12 + 1] = 61;
        }
        try {
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(l.i r10) {
        /*
            r9 = this;
            l.i r10 = (l.i) r10
            int r0 = r9.p()
            int r1 = r10.p()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L10:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2b
            byte r7 = r9.k(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.k(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L25
            int r4 = r4 + 1
            goto L10
        L25:
            if (r7 >= r8) goto L29
        L27:
            r3 = -1
            goto L31
        L29:
            r3 = 1
            goto L31
        L2b:
            if (r0 != r1) goto L2e
            goto L31
        L2e:
            if (r0 >= r1) goto L29
            goto L27
        L31:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.i.compareTo(java.lang.Object):int");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            int p = iVar.p();
            byte[] bArr = this.f9233f;
            if (p == bArr.length && iVar.o(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = this.f9234g;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = Arrays.hashCode(this.f9233f);
        this.f9234g = hashCode;
        return hashCode;
    }

    public final i i(String str) {
        try {
            return m(MessageDigest.getInstance(str).digest(this.f9233f));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public byte k(int i2) {
        return this.f9233f[i2];
    }

    public String l() {
        byte[] bArr = this.f9233f;
        char[] cArr = new char[bArr.length * 2];
        int i2 = 0;
        for (byte b : bArr) {
            int i3 = i2 + 1;
            char[] cArr2 = f9231i;
            cArr[i2] = cArr2[(b >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public boolean n(int i2, i iVar, int i3, int i4) {
        return iVar.o(i3, this.f9233f, i2, i4);
    }

    public boolean o(int i2, byte[] bArr, int i3, int i4) {
        if (i2 >= 0) {
            byte[] bArr2 = this.f9233f;
            if (i2 <= bArr2.length - i4 && i3 >= 0 && i3 <= bArr.length - i4 && a0.a(bArr2, i2, bArr, i3, i4)) {
                return true;
            }
        }
        return false;
    }

    public int p() {
        return this.f9233f.length;
    }

    public i q(int i2, int i3) {
        if (i2 >= 0) {
            byte[] bArr = this.f9233f;
            if (i3 <= bArr.length) {
                int i4 = i3 - i2;
                if (i4 >= 0) {
                    if (i2 == 0 && i3 == bArr.length) {
                        return this;
                    }
                    byte[] bArr2 = new byte[i4];
                    System.arraycopy(bArr, i2, bArr2, 0, i4);
                    return new i(bArr2);
                }
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            throw new IllegalArgumentException(f.a.b.a.a.t(f.a.b.a.a.A("endIndex > length("), this.f9233f.length, ")"));
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public i r() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f9233f;
            if (i2 >= bArr.length) {
                return this;
            }
            byte b = bArr[i2];
            if (b >= 65 && b <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i2] = (byte) (b + 32);
                for (int i3 = i2 + 1; i3 < bArr2.length; i3++) {
                    byte b2 = bArr2[i3];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i3] = (byte) (b2 + 32);
                    }
                }
                return new i(bArr2);
            }
            i2++;
        }
    }

    public byte[] s() {
        return (byte[]) this.f9233f.clone();
    }

    public String t() {
        String str = this.f9235h;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f9233f, a0.a);
        this.f9235h = str2;
        return str2;
    }

    public String toString() {
        if (this.f9233f.length == 0) {
            return "[size=0]";
        }
        String t = t();
        int length = t.length();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = t.length();
                break;
            } else if (i3 == 64) {
                break;
            } else {
                int codePointAt = t.codePointAt(i2);
                if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                    i3++;
                    i2 += Character.charCount(codePointAt);
                }
            }
        }
        i2 = -1;
        if (i2 == -1) {
            if (this.f9233f.length <= 64) {
                StringBuilder A = f.a.b.a.a.A("[hex=");
                A.append(l());
                A.append("]");
                return A.toString();
            }
            StringBuilder A2 = f.a.b.a.a.A("[size=");
            A2.append(this.f9233f.length);
            A2.append(" hex=");
            A2.append(q(0, 64).l());
            A2.append("…]");
            return A2.toString();
        }
        String replace = t.substring(0, i2).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (i2 < t.length()) {
            StringBuilder A3 = f.a.b.a.a.A("[size=");
            A3.append(this.f9233f.length);
            A3.append(" text=");
            A3.append(replace);
            A3.append("…]");
            return A3.toString();
        }
        return f.a.b.a.a.q("[text=", replace, "]");
    }

    public void u(f fVar) {
        byte[] bArr = this.f9233f;
        fVar.g0(bArr, 0, bArr.length);
    }
}
