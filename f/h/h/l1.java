package f.h.h;

import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: Utf8.java */
/* loaded from: classes2.dex */
public final class l1 {
    public static final a a;

    /* compiled from: Utf8.java */
    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract String a(byte[] bArr, int i2, int i3);

        public final String b(ByteBuffer byteBuffer, int i2, int i3) {
            if ((i2 | i3 | ((byteBuffer.limit() - i2) - i3)) >= 0) {
                int i4 = i2 + i3;
                char[] cArr = new char[i3];
                int i5 = 0;
                while (i2 < i4) {
                    byte b = byteBuffer.get(i2);
                    if (!f.h.b.c.a.b(b)) {
                        break;
                    }
                    i2++;
                    cArr[i5] = (char) b;
                    i5++;
                }
                int i6 = i5;
                while (i2 < i4) {
                    int i7 = i2 + 1;
                    byte b2 = byteBuffer.get(i2);
                    if (f.h.b.c.a.b(b2)) {
                        int i8 = i6 + 1;
                        cArr[i6] = (char) b2;
                        while (i7 < i4) {
                            byte b3 = byteBuffer.get(i7);
                            if (!f.h.b.c.a.b(b3)) {
                                break;
                            }
                            i7++;
                            cArr[i8] = (char) b3;
                            i8++;
                        }
                        i2 = i7;
                        i6 = i8;
                    } else if (f.h.b.c.a.c(b2)) {
                        if (i7 < i4) {
                            f.h.b.c.a.d(b2, byteBuffer.get(i7), cArr, i6);
                            i2 = i7 + 1;
                            i6++;
                        } else {
                            throw InvalidProtocolBufferException.c();
                        }
                    } else if (f.h.b.c.a.e(b2)) {
                        if (i7 < i4 - 1) {
                            int i9 = i7 + 1;
                            f.h.b.c.a.f(b2, byteBuffer.get(i7), byteBuffer.get(i9), cArr, i6);
                            i2 = i9 + 1;
                            i6++;
                        } else {
                            throw InvalidProtocolBufferException.c();
                        }
                    } else if (i7 < i4 - 2) {
                        int i10 = i7 + 1;
                        byte b4 = byteBuffer.get(i7);
                        int i11 = i10 + 1;
                        f.h.b.c.a.a(b2, b4, byteBuffer.get(i10), byteBuffer.get(i11), cArr, i6);
                        i2 = i11 + 1;
                        i6 = i6 + 1 + 1;
                    } else {
                        throw InvalidProtocolBufferException.c();
                    }
                }
                return new String(cArr, 0, i6);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
        }

        public abstract String c(ByteBuffer byteBuffer, int i2, int i3);

        public abstract int d(CharSequence charSequence, byte[] bArr, int i2, int i3);

        public abstract int e(int i2, byte[] bArr, int i3, int i4);
    }

    /* compiled from: Utf8.java */
    /* loaded from: classes2.dex */
    public static final class b extends a {
        @Override // f.h.h.l1.a
        public String a(byte[] bArr, int i2, int i3) {
            if ((i2 | i3 | ((bArr.length - i2) - i3)) >= 0) {
                int i4 = i2 + i3;
                char[] cArr = new char[i3];
                int i5 = 0;
                while (i2 < i4) {
                    byte b = bArr[i2];
                    if (!f.h.b.c.a.b(b)) {
                        break;
                    }
                    i2++;
                    cArr[i5] = (char) b;
                    i5++;
                }
                int i6 = i5;
                while (i2 < i4) {
                    int i7 = i2 + 1;
                    byte b2 = bArr[i2];
                    if (f.h.b.c.a.b(b2)) {
                        int i8 = i6 + 1;
                        cArr[i6] = (char) b2;
                        while (i7 < i4) {
                            byte b3 = bArr[i7];
                            if (!f.h.b.c.a.b(b3)) {
                                break;
                            }
                            i7++;
                            cArr[i8] = (char) b3;
                            i8++;
                        }
                        i2 = i7;
                        i6 = i8;
                    } else if (f.h.b.c.a.c(b2)) {
                        if (i7 < i4) {
                            f.h.b.c.a.d(b2, bArr[i7], cArr, i6);
                            i2 = i7 + 1;
                            i6++;
                        } else {
                            throw InvalidProtocolBufferException.c();
                        }
                    } else if (f.h.b.c.a.e(b2)) {
                        if (i7 < i4 - 1) {
                            int i9 = i7 + 1;
                            f.h.b.c.a.f(b2, bArr[i7], bArr[i9], cArr, i6);
                            i2 = i9 + 1;
                            i6++;
                        } else {
                            throw InvalidProtocolBufferException.c();
                        }
                    } else if (i7 < i4 - 2) {
                        int i10 = i7 + 1;
                        byte b4 = bArr[i7];
                        int i11 = i10 + 1;
                        f.h.b.c.a.a(b2, b4, bArr[i10], bArr[i11], cArr, i6);
                        i2 = i11 + 1;
                        i6 = i6 + 1 + 1;
                    } else {
                        throw InvalidProtocolBufferException.c();
                    }
                }
                return new String(cArr, 0, i6);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }

        @Override // f.h.h.l1.a
        public String c(ByteBuffer byteBuffer, int i2, int i3) {
            return b(byteBuffer, i2, i3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
            return r10 + r0;
         */
        @Override // f.h.h.l1.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int d(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: f.h.h.l1.b.d(java.lang.CharSequence, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
            if (r13[r14] > (-65)) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
            if (r13[r14] > (-65)) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0082, code lost:
            if (r13[r14] > (-65)) goto L48;
         */
        @Override // f.h.h.l1.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int e(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instructions count: 242
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: f.h.h.l1.b.e(int, byte[], int, int):int");
        }
    }

    /* compiled from: Utf8.java */
    /* loaded from: classes2.dex */
    public static class c extends IllegalArgumentException {
        public c(int i2, int i3) {
            super(f.a.b.a.a.k("Unpaired surrogate at index ", i2, " of ", i3));
        }
    }

    /* compiled from: Utf8.java */
    /* loaded from: classes2.dex */
    public static final class d extends a {
        public static int f(byte[] bArr, int i2, long j2, int i3) {
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        return l1.g(i2, k1.j(bArr, j2), k1.j(bArr, j2 + 1));
                    }
                    throw new AssertionError();
                }
                return l1.f(i2, k1.j(bArr, j2));
            }
            return l1.e(i2);
        }

        @Override // f.h.h.l1.a
        public String a(byte[] bArr, int i2, int i3) {
            Charset charset = y.a;
            String str = new String(bArr, i2, i3, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i2, i3 + i2))) {
                throw InvalidProtocolBufferException.c();
            }
            return str;
        }

        @Override // f.h.h.l1.a
        public String c(ByteBuffer byteBuffer, int i2, int i3) {
            if ((i2 | i3 | ((byteBuffer.limit() - i2) - i3)) >= 0) {
                long b = k1.b(byteBuffer) + i2;
                long j2 = i3 + b;
                char[] cArr = new char[i3];
                int i4 = 0;
                while (b < j2) {
                    byte i5 = k1.i(b);
                    if (!f.h.b.c.a.b(i5)) {
                        break;
                    }
                    b++;
                    cArr[i4] = (char) i5;
                    i4++;
                }
                while (true) {
                    int i6 = i4;
                    while (b < j2) {
                        long j3 = b + 1;
                        byte i7 = k1.i(b);
                        if (f.h.b.c.a.b(i7)) {
                            cArr[i6] = (char) i7;
                            i6++;
                            b = j3;
                            while (b < j2) {
                                byte i8 = k1.i(b);
                                if (!f.h.b.c.a.b(i8)) {
                                    break;
                                }
                                b++;
                                cArr[i6] = (char) i8;
                                i6++;
                            }
                        } else if (f.h.b.c.a.c(i7)) {
                            if (j3 < j2) {
                                b = j3 + 1;
                                f.h.b.c.a.d(i7, k1.i(j3), cArr, i6);
                                i6++;
                            } else {
                                throw InvalidProtocolBufferException.c();
                            }
                        } else if (f.h.b.c.a.e(i7)) {
                            if (j3 < j2 - 1) {
                                long j4 = j3 + 1;
                                f.h.b.c.a.f(i7, k1.i(j3), k1.i(j4), cArr, i6);
                                i6++;
                                b = j4 + 1;
                            } else {
                                throw InvalidProtocolBufferException.c();
                            }
                        } else if (j3 < j2 - 2) {
                            long j5 = j3 + 1;
                            byte i9 = k1.i(j3);
                            long j6 = j5 + 1;
                            byte i10 = k1.i(j5);
                            b = j6 + 1;
                            f.h.b.c.a.a(i7, i9, i10, k1.i(j6), cArr, i6);
                            i4 = i6 + 1 + 1;
                        } else {
                            throw InvalidProtocolBufferException.c();
                        }
                    }
                    return new String(cArr, 0, i6);
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
        }

        @Override // f.h.h.l1.a
        public int d(CharSequence charSequence, byte[] bArr, int i2, int i3) {
            char c;
            long j2;
            long j3;
            int i4;
            char charAt;
            long j4 = i2;
            long j5 = i3 + j4;
            int length = charSequence.length();
            if (length > i3 || bArr.length - i3 < i2) {
                StringBuilder A = f.a.b.a.a.A("Failed writing ");
                A.append(charSequence.charAt(length - 1));
                A.append(" at index ");
                A.append(i2 + i3);
                throw new ArrayIndexOutOfBoundsException(A.toString());
            }
            int i5 = 0;
            while (true) {
                c = 128;
                j2 = 1;
                if (i5 >= length || (charAt = charSequence.charAt(i5)) >= 128) {
                    break;
                }
                k1.t(bArr, j4, (byte) charAt);
                i5++;
                j4 = 1 + j4;
            }
            if (i5 == length) {
                return (int) j4;
            }
            while (i5 < length) {
                char charAt2 = charSequence.charAt(i5);
                if (charAt2 >= c || j4 >= j5) {
                    if (charAt2 < 2048 && j4 <= j5 - 2) {
                        long j6 = j4 + j2;
                        k1.t(bArr, j4, (byte) ((charAt2 >>> 6) | 960));
                        k1.t(bArr, j6, (byte) ((charAt2 & '?') | 128));
                        j4 = j6 + j2;
                    } else if ((charAt2 >= 55296 && 57343 >= charAt2) || j4 > j5 - 3) {
                        if (j4 <= j5 - 4) {
                            int i6 = i5 + 1;
                            if (i6 != length) {
                                char charAt3 = charSequence.charAt(i6);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    long j7 = j4 + 1;
                                    k1.t(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                    long j8 = 1 + j7;
                                    k1.t(bArr, j7, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j9 = 1 + j8;
                                    k1.t(bArr, j8, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j2 = 1;
                                    k1.t(bArr, j9, (byte) ((codePoint & 63) | 128));
                                    i5 = i6;
                                    j4 = j9 + 1;
                                } else {
                                    i5 = i6;
                                }
                            }
                            throw new c(i5 - 1, length);
                        } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i4 = i5 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i4)))) {
                            throw new c(i5, length);
                        } else {
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j4);
                        }
                    } else {
                        long j10 = j4 + j2;
                        k1.t(bArr, j4, (byte) ((charAt2 >>> '\f') | 480));
                        long j11 = j2 + j10;
                        k1.t(bArr, j10, (byte) (((charAt2 >>> 6) & 63) | 128));
                        j3 = j11 + 1;
                        k1.t(bArr, j11, (byte) ((charAt2 & '?') | 128));
                        j2 = 1;
                    }
                    i5++;
                    c = 128;
                } else {
                    j3 = j4 + j2;
                    k1.t(bArr, j4, (byte) charAt2);
                }
                j4 = j3;
                i5++;
                c = 128;
            }
            return (int) j4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
            if (f.h.h.k1.j(r26, r8) > (-65)) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
            if (f.h.h.k1.j(r26, r8) > (-65)) goto L31;
         */
        @Override // f.h.h.l1.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int e(int r25, byte[] r26, int r27, int r28) {
            /*
                Method dump skipped, instructions count: 434
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: f.h.h.l1.d.e(int, byte[], int, int):int");
        }
    }

    static {
        a = (!(k1.f6407g && k1.f6406f) || f.h.h.d.a()) ? new b() : new d();
    }

    public static int a(byte[] bArr, int i2, int i3) {
        byte b2 = bArr[i2 - 1];
        int i4 = i3 - i2;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    return g(b2, bArr[i2], bArr[i2 + 1]);
                }
                throw new AssertionError();
            }
            return f(b2, bArr[i2]);
        }
        return e(b2);
    }

    public static String b(byte[] bArr, int i2, int i3) {
        return a.a(bArr, i2, i3);
    }

    public static int c(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        return a.d(charSequence, bArr, i2, i3);
    }

    public static int d(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i3);
            if (charAt < 2048) {
                i4 += (127 - charAt) >>> 31;
                i3++;
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char charAt2 = charSequence.charAt(i3);
                    if (charAt2 < 2048) {
                        i2 += (127 - charAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i3) < 65536) {
                                throw new c(i3, length2);
                            }
                            i3++;
                        }
                    }
                    i3++;
                }
                i4 += i2;
            }
        }
        if (i4 >= length) {
            return i4;
        }
        StringBuilder A = f.a.b.a.a.A("UTF-8 length does not fit in int: ");
        A.append(i4 + 4294967296L);
        throw new IllegalArgumentException(A.toString());
    }

    public static int e(int i2) {
        if (i2 > -12) {
            return -1;
        }
        return i2;
    }

    public static int f(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    public static int g(int i2, int i3, int i4) {
        if (i2 > -12 || i3 > -65 || i4 > -65) {
            return -1;
        }
        return (i2 ^ (i3 << 8)) ^ (i4 << 16);
    }

    public static boolean h(byte[] bArr, int i2, int i3) {
        return a.e(0, bArr, i2, i3) == 0;
    }
}
