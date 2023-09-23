package l;

import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: Buffer.java */
/* loaded from: classes2.dex */
public final class f implements h, g, Cloneable, ByteChannel {

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f9228h = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: f  reason: collision with root package name */
    public u f9229f;

    /* renamed from: g  reason: collision with root package name */
    public long f9230g;

    @Override // l.h
    public String A(long j2) {
        if (j2 >= 0) {
            long j3 = j2 != Long.MAX_VALUE ? j2 + 1 : Long.MAX_VALUE;
            long p = p((byte) 10, 0L, j3);
            if (p != -1) {
                return O(p);
            }
            if (j3 < this.f9230g && l(j3 - 1) == 13 && l(j3) == 10) {
                return O(j3);
            }
            f fVar = new f();
            g(fVar, 0L, Math.min(32L, this.f9230g));
            StringBuilder A = f.a.b.a.a.A("\\n not found: limit=");
            A.append(Math.min(this.f9230g, j2));
            A.append(" content=");
            A.append(fVar.C().l());
            A.append((char) 8230);
            throw new EOFException(A.toString());
        }
        throw new IllegalArgumentException(f.a.b.a.a.l("limit < 0: ", j2));
    }

    public i C() {
        return new i(v());
    }

    @Override // l.g
    public /* bridge */ /* synthetic */ g D(String str) {
        u0(str);
        return this;
    }

    public void F(byte[] bArr) {
        int i2 = 0;
        while (i2 < bArr.length) {
            int q = q(bArr, i2, bArr.length - i2);
            if (q == -1) {
                throw new EOFException();
            }
            i2 += q;
        }
    }

    @Override // l.x
    public void J(f fVar, long j2) {
        u b;
        if (fVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (fVar != this) {
            a0.b(fVar.f9230g, 0L, j2);
            while (j2 > 0) {
                u uVar = fVar.f9229f;
                if (j2 < uVar.c - uVar.b) {
                    u uVar2 = this.f9229f;
                    u uVar3 = uVar2 != null ? uVar2.f9263g : null;
                    if (uVar3 != null && uVar3.f9261e) {
                        if ((uVar3.c + j2) - (uVar3.f9260d ? 0 : uVar3.b) <= 8192) {
                            uVar.d(uVar3, (int) j2);
                            fVar.f9230g -= j2;
                            this.f9230g += j2;
                            return;
                        }
                    }
                    int i2 = (int) j2;
                    Objects.requireNonNull(uVar);
                    if (i2 > 0 && i2 <= uVar.c - uVar.b) {
                        if (i2 >= 1024) {
                            b = uVar.c();
                        } else {
                            b = v.b();
                            System.arraycopy(uVar.a, uVar.b, b.a, 0, i2);
                        }
                        b.c = b.b + i2;
                        uVar.b += i2;
                        uVar.f9263g.b(b);
                        fVar.f9229f = b;
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                u uVar4 = fVar.f9229f;
                long j3 = uVar4.c - uVar4.b;
                fVar.f9229f = uVar4.a();
                u uVar5 = this.f9229f;
                if (uVar5 == null) {
                    this.f9229f = uVar4;
                    uVar4.f9263g = uVar4;
                    uVar4.f9262f = uVar4;
                } else {
                    uVar5.f9263g.b(uVar4);
                    u uVar6 = uVar4.f9263g;
                    if (uVar6 != uVar4) {
                        if (uVar6.f9261e) {
                            int i3 = uVar4.c - uVar4.b;
                            if (i3 <= (8192 - uVar6.c) + (uVar6.f9260d ? 0 : uVar6.b)) {
                                uVar4.d(uVar6, i3);
                                uVar4.a();
                                v.a(uVar4);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                fVar.f9230g -= j3;
                this.f9230g += j3;
                j2 -= j3;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    public String M(long j2, Charset charset) {
        a0.b(this.f9230g, 0L, j2);
        if (charset != null) {
            if (j2 <= 2147483647L) {
                if (j2 == 0) {
                    return "";
                }
                u uVar = this.f9229f;
                if (uVar.b + j2 > uVar.c) {
                    return new String(S(j2), charset);
                }
                String str = new String(uVar.a, uVar.b, (int) j2, charset);
                int i2 = (int) (uVar.b + j2);
                uVar.b = i2;
                this.f9230g -= j2;
                if (i2 == uVar.c) {
                    this.f9229f = uVar.a();
                    v.a(uVar);
                }
                return str;
            }
            throw new IllegalArgumentException(f.a.b.a.a.l("byteCount > Integer.MAX_VALUE: ", j2));
        }
        throw new IllegalArgumentException("charset == null");
    }

    public String N() {
        try {
            return M(this.f9230g, a0.a);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public String O(long j2) {
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (l(j3) == 13) {
                String M = M(j3, a0.a);
                e(2L);
                return M;
            }
        }
        String M2 = M(j2, a0.a);
        e(1L);
        return M2;
    }

    @Override // l.h
    public String Q() {
        return A(Long.MAX_VALUE);
    }

    @Override // l.h
    public int R() {
        int readInt = readInt();
        Charset charset = a0.a;
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    @Override // l.h
    public byte[] S(long j2) {
        a0.b(this.f9230g, 0L, j2);
        if (j2 <= 2147483647L) {
            byte[] bArr = new byte[(int) j2];
            F(bArr);
            return bArr;
        }
        throw new IllegalArgumentException(f.a.b.a.a.l("byteCount > Integer.MAX_VALUE: ", j2));
    }

    public i T() {
        long j2 = this.f9230g;
        if (j2 > 2147483647L) {
            StringBuilder A = f.a.b.a.a.A("size > Integer.MAX_VALUE: ");
            A.append(this.f9230g);
            throw new IllegalArgumentException(A.toString());
        }
        int i2 = (int) j2;
        if (i2 == 0) {
            return i.f9232j;
        }
        return new w(this, i2);
    }

    @Override // l.g
    public /* bridge */ /* synthetic */ g V(byte[] bArr) {
        d0(bArr);
        return this;
    }

    public u W(int i2) {
        if (i2 >= 1 && i2 <= 8192) {
            u uVar = this.f9229f;
            if (uVar == null) {
                u b = v.b();
                this.f9229f = b;
                b.f9263g = b;
                b.f9262f = b;
                return b;
            }
            u uVar2 = uVar.f9263g;
            if (uVar2.c + i2 > 8192 || !uVar2.f9261e) {
                u b2 = v.b();
                uVar2.b(b2);
                return b2;
            }
            return uVar2;
        }
        throw new IllegalArgumentException();
    }

    public f X(i iVar) {
        if (iVar != null) {
            iVar.u(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    @Override // l.h
    public short Y() {
        short readShort = readShort();
        Charset charset = a0.a;
        int i2 = readShort & 65535;
        return (short) (((i2 & 255) << 8) | ((65280 & i2) >>> 8));
    }

    public void a() {
        try {
            e(this.f9230g);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // l.y
    public long a0(f fVar, long j2) {
        if (fVar != null) {
            if (j2 >= 0) {
                long j3 = this.f9230g;
                if (j3 == 0) {
                    return -1L;
                }
                if (j2 > j3) {
                    j2 = j3;
                }
                fVar.J(this, j2);
                return j2;
            }
            throw new IllegalArgumentException(f.a.b.a.a.l("byteCount < 0: ", j2));
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // l.h, l.g
    public f b() {
        return this;
    }

    public Object clone() {
        f fVar = new f();
        if (this.f9230g != 0) {
            u c = this.f9229f.c();
            fVar.f9229f = c;
            c.f9263g = c;
            c.f9262f = c;
            u uVar = this.f9229f;
            while (true) {
                uVar = uVar.f9262f;
                if (uVar == this.f9229f) {
                    break;
                }
                fVar.f9229f.f9263g.b(uVar.c());
            }
            fVar.f9230g = this.f9230g;
        }
        return fVar;
    }

    @Override // l.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // l.y
    public z d() {
        return z.f9266d;
    }

    public f d0(byte[] bArr) {
        if (bArr != null) {
            g0(bArr, 0, bArr.length);
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // l.h
    public void e(long j2) {
        u uVar;
        while (j2 > 0) {
            if (this.f9229f != null) {
                int min = (int) Math.min(j2, uVar.c - uVar.b);
                long j3 = min;
                this.f9230g -= j3;
                j2 -= j3;
                u uVar2 = this.f9229f;
                int i2 = uVar2.b + min;
                uVar2.b = i2;
                if (i2 == uVar2.c) {
                    this.f9229f = uVar2.a();
                    v.a(uVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            long j2 = this.f9230g;
            if (j2 != fVar.f9230g) {
                return false;
            }
            long j3 = 0;
            if (j2 == 0) {
                return true;
            }
            u uVar = this.f9229f;
            u uVar2 = fVar.f9229f;
            int i2 = uVar.b;
            int i3 = uVar2.b;
            while (j3 < this.f9230g) {
                long min = Math.min(uVar.c - i2, uVar2.c - i3);
                int i4 = 0;
                while (i4 < min) {
                    int i5 = i2 + 1;
                    int i6 = i3 + 1;
                    if (uVar.a[i2] != uVar2.a[i3]) {
                        return false;
                    }
                    i4++;
                    i2 = i5;
                    i3 = i6;
                }
                if (i2 == uVar.c) {
                    uVar = uVar.f9262f;
                    i2 = uVar.b;
                }
                if (i3 == uVar2.c) {
                    uVar2 = uVar2.f9262f;
                    i3 = uVar2.b;
                }
                j3 += min;
            }
            return true;
        }
        return false;
    }

    public long f() {
        long j2 = this.f9230g;
        if (j2 == 0) {
            return 0L;
        }
        u uVar = this.f9229f.f9263g;
        int i2 = uVar.c;
        return (i2 >= 8192 || !uVar.f9261e) ? j2 : j2 - (i2 - uVar.b);
    }

    @Override // l.g, l.x, java.io.Flushable
    public void flush() {
    }

    public f g(f fVar, long j2, long j3) {
        if (fVar != null) {
            a0.b(this.f9230g, j2, j3);
            if (j3 == 0) {
                return this;
            }
            fVar.f9230g += j3;
            u uVar = this.f9229f;
            while (true) {
                int i2 = uVar.c;
                int i3 = uVar.b;
                if (j2 < i2 - i3) {
                    break;
                }
                j2 -= i2 - i3;
                uVar = uVar.f9262f;
            }
            while (j3 > 0) {
                u c = uVar.c();
                int i4 = (int) (c.b + j2);
                c.b = i4;
                c.c = Math.min(i4 + ((int) j3), c.c);
                u uVar2 = fVar.f9229f;
                if (uVar2 == null) {
                    c.f9263g = c;
                    c.f9262f = c;
                    fVar.f9229f = c;
                } else {
                    uVar2.f9263g.b(c);
                }
                j3 -= c.c - c.b;
                uVar = uVar.f9262f;
                j2 = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public f g0(byte[] bArr, int i2, int i3) {
        if (bArr != null) {
            long j2 = i3;
            a0.b(bArr.length, i2, j2);
            int i4 = i3 + i2;
            while (i2 < i4) {
                u W = W(1);
                int min = Math.min(i4 - i2, 8192 - W.c);
                System.arraycopy(bArr, i2, W.a, W.c, min);
                i2 += min;
                W.c += min;
            }
            this.f9230g += j2;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public int hashCode() {
        u uVar = this.f9229f;
        if (uVar == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = uVar.c;
            for (int i4 = uVar.b; i4 < i3; i4++) {
                i2 = (i2 * 31) + uVar.a[i4];
            }
            uVar = uVar.f9262f;
        } while (uVar != this.f9229f);
        return i2;
    }

    public long i0(y yVar) {
        if (yVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j2 = 0;
        while (true) {
            long a0 = yVar.a0(this, 8192L);
            if (a0 == -1) {
                return j2;
            }
            j2 += a0;
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // l.h
    public i j(long j2) {
        return new i(S(j2));
    }

    @Override // l.h
    public void j0(long j2) {
        if (this.f9230g < j2) {
            throw new EOFException();
        }
    }

    @Override // l.g
    public /* bridge */ /* synthetic */ g k(int i2) {
        t0(i2);
        return this;
    }

    public byte l(long j2) {
        int i2;
        a0.b(this.f9230g, j2, 1L);
        long j3 = this.f9230g;
        if (j3 - j2 > j2) {
            u uVar = this.f9229f;
            while (true) {
                int i3 = uVar.c;
                int i4 = uVar.b;
                long j4 = i3 - i4;
                if (j2 < j4) {
                    return uVar.a[i4 + ((int) j2)];
                }
                j2 -= j4;
                uVar = uVar.f9262f;
            }
        } else {
            long j5 = j2 - j3;
            u uVar2 = this.f9229f;
            do {
                uVar2 = uVar2.f9263g;
                int i5 = uVar2.c;
                i2 = uVar2.b;
                j5 += i5 - i2;
            } while (j5 < 0);
            return uVar2.a[i2 + ((int) j5)];
        }
    }

    @Override // l.h
    public long l0(byte b) {
        return p(b, 0L, Long.MAX_VALUE);
    }

    @Override // l.g
    public /* bridge */ /* synthetic */ g m(int i2) {
        s0(i2);
        return this;
    }

    public f m0(int i2) {
        u W = W(1);
        byte[] bArr = W.a;
        int i3 = W.c;
        W.c = i3 + 1;
        bArr[i3] = (byte) i2;
        this.f9230g++;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b A[EDGE_INSN: B:42:0x009b->B:38:0x009b ?: BREAK  , SYNTHETIC] */
    @Override // l.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long n0() {
        /*
            r15 = this;
            long r0 = r15.f9230g
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La2
            r0 = 0
            r1 = 0
            r4 = r2
        Lb:
            l.u r6 = r15.f9229f
            byte[] r7 = r6.a
            int r8 = r6.b
            int r9 = r6.c
        L13:
            if (r8 >= r9) goto L87
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L39
        L22:
            r11 = 97
            if (r10 < r11) goto L2d
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2d
            int r11 = r10 + (-97)
            goto L37
        L2d:
            r11 = 65
            if (r10 < r11) goto L6c
            r11 = 70
            if (r10 > r11) goto L6c
            int r11 = r10 + (-65)
        L37:
            int r11 = r11 + 10
        L39:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L49
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L13
        L49:
            l.f r0 = new l.f
            r0.<init>()
            l.f r0 = r0.K(r4)
            r0.m0(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Number too large: "
            java.lang.StringBuilder r2 = f.a.b.a.a.A(r2)
            java.lang.String r0 = r0.N()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L6c:
            if (r0 == 0) goto L70
            r1 = 1
            goto L87
        L70:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r1 = f.a.b.a.a.A(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L87:
            if (r8 != r9) goto L93
            l.u r7 = r6.a()
            r15.f9229f = r7
            l.v.a(r6)
            goto L95
        L93:
            r6.b = r8
        L95:
            if (r1 != 0) goto L9b
            l.u r6 = r15.f9229f
            if (r6 != 0) goto Lb
        L9b:
            long r1 = r15.f9230g
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f9230g = r1
            return r4
        La2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.f.n0():long");
    }

    public long p(byte b, long j2, long j3) {
        u uVar;
        long j4 = 0;
        if (j2 >= 0 && j3 >= j2) {
            long j5 = this.f9230g;
            long j6 = j3 > j5 ? j5 : j3;
            if (j2 == j6 || (uVar = this.f9229f) == null) {
                return -1L;
            }
            if (j5 - j2 < j2) {
                while (j5 > j2) {
                    uVar = uVar.f9263g;
                    j5 -= uVar.c - uVar.b;
                }
            } else {
                while (true) {
                    long j7 = (uVar.c - uVar.b) + j4;
                    if (j7 >= j2) {
                        break;
                    }
                    uVar = uVar.f9262f;
                    j4 = j7;
                }
                j5 = j4;
            }
            long j8 = j2;
            while (j5 < j6) {
                byte[] bArr = uVar.a;
                int min = (int) Math.min(uVar.c, (uVar.b + j6) - j5);
                for (int i2 = (int) ((uVar.b + j8) - j5); i2 < min; i2++) {
                    if (bArr[i2] == b) {
                        return (i2 - uVar.b) + j5;
                    }
                }
                j5 += uVar.c - uVar.b;
                uVar = uVar.f9262f;
                j8 = j5;
            }
            return -1L;
        }
        throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f9230g), Long.valueOf(j2), Long.valueOf(j3)));
    }

    public int q(byte[] bArr, int i2, int i3) {
        a0.b(bArr.length, i2, i3);
        u uVar = this.f9229f;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(i3, uVar.c - uVar.b);
        System.arraycopy(uVar.a, uVar.b, bArr, i2, min);
        int i4 = uVar.b + min;
        uVar.b = i4;
        this.f9230g -= min;
        if (i4 == uVar.c) {
            this.f9229f = uVar.a();
            v.a(uVar);
        }
        return min;
    }

    @Override // l.g
    /* renamed from: q0 */
    public f k0(long j2) {
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i2 == 0) {
            m0(48);
            return this;
        }
        boolean z = false;
        int i3 = 1;
        if (i2 < 0) {
            j2 = -j2;
            if (j2 < 0) {
                u0("-9223372036854775808");
                return this;
            }
            z = true;
        }
        if (j2 >= 100000000) {
            i3 = j2 < 1000000000000L ? j2 < 10000000000L ? j2 < 1000000000 ? 9 : 10 : j2 < 100000000000L ? 11 : 12 : j2 < 1000000000000000L ? j2 < 10000000000000L ? 13 : j2 < 100000000000000L ? 14 : 15 : j2 < 100000000000000000L ? j2 < 10000000000000000L ? 16 : 17 : j2 < 1000000000000000000L ? 18 : 19;
        } else if (j2 >= 10000) {
            i3 = j2 < 1000000 ? j2 < 100000 ? 5 : 6 : j2 < 10000000 ? 7 : 8;
        } else if (j2 >= 100) {
            i3 = j2 < 1000 ? 3 : 4;
        } else if (j2 >= 10) {
            i3 = 2;
        }
        if (z) {
            i3++;
        }
        u W = W(i3);
        byte[] bArr = W.a;
        int i4 = W.c + i3;
        while (j2 != 0) {
            i4--;
            bArr[i4] = f9228h[(int) (j2 % 10)];
            j2 /= 10;
        }
        if (z) {
            bArr[i4 - 1] = 45;
        }
        W.c += i3;
        this.f9230g += i3;
        return this;
    }

    @Override // l.g
    /* renamed from: r0 */
    public f K(long j2) {
        if (j2 == 0) {
            m0(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j2)) / 4) + 1;
        u W = W(numberOfTrailingZeros);
        byte[] bArr = W.a;
        int i2 = W.c;
        for (int i3 = (i2 + numberOfTrailingZeros) - 1; i3 >= i2; i3--) {
            bArr[i3] = f9228h[(int) (15 & j2)];
            j2 >>>= 4;
        }
        W.c += numberOfTrailingZeros;
        this.f9230g += numberOfTrailingZeros;
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        u uVar = this.f9229f;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), uVar.c - uVar.b);
        byteBuffer.put(uVar.a, uVar.b, min);
        int i2 = uVar.b + min;
        uVar.b = i2;
        this.f9230g -= min;
        if (i2 == uVar.c) {
            this.f9229f = uVar.a();
            v.a(uVar);
        }
        return min;
    }

    @Override // l.h
    public byte readByte() {
        long j2 = this.f9230g;
        if (j2 != 0) {
            u uVar = this.f9229f;
            int i2 = uVar.b;
            int i3 = uVar.c;
            int i4 = i2 + 1;
            byte b = uVar.a[i2];
            this.f9230g = j2 - 1;
            if (i4 == i3) {
                this.f9229f = uVar.a();
                v.a(uVar);
            } else {
                uVar.b = i4;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    @Override // l.h
    public int readInt() {
        long j2 = this.f9230g;
        if (j2 >= 4) {
            u uVar = this.f9229f;
            int i2 = uVar.b;
            int i3 = uVar.c;
            if (i3 - i2 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = uVar.a;
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = ((bArr[i2] & 255) << 24) | ((bArr[i4] & 255) << 16);
            int i7 = i5 + 1;
            int i8 = i6 | ((bArr[i5] & 255) << 8);
            int i9 = i7 + 1;
            int i10 = i8 | (bArr[i7] & 255);
            this.f9230g = j2 - 4;
            if (i9 == i3) {
                this.f9229f = uVar.a();
                v.a(uVar);
            } else {
                uVar.b = i9;
            }
            return i10;
        }
        StringBuilder A = f.a.b.a.a.A("size < 4: ");
        A.append(this.f9230g);
        throw new IllegalStateException(A.toString());
    }

    @Override // l.h
    public short readShort() {
        long j2 = this.f9230g;
        if (j2 >= 2) {
            u uVar = this.f9229f;
            int i2 = uVar.b;
            int i3 = uVar.c;
            if (i3 - i2 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = uVar.a;
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = ((bArr[i2] & 255) << 8) | (bArr[i4] & 255);
            this.f9230g = j2 - 2;
            if (i5 == i3) {
                this.f9229f = uVar.a();
                v.a(uVar);
            } else {
                uVar.b = i5;
            }
            return (short) i6;
        }
        StringBuilder A = f.a.b.a.a.A("size < 2: ");
        A.append(this.f9230g);
        throw new IllegalStateException(A.toString());
    }

    @Override // l.h
    public boolean s() {
        return this.f9230g == 0;
    }

    public f s0(int i2) {
        u W = W(4);
        byte[] bArr = W.a;
        int i3 = W.c;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 24) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >>> 16) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >>> 8) & 255);
        bArr[i6] = (byte) (i2 & 255);
        W.c = i6 + 1;
        this.f9230g += 4;
        return this;
    }

    @Override // l.g
    public /* bridge */ /* synthetic */ g t(int i2) {
        m0(i2);
        return this;
    }

    public f t0(int i2) {
        u W = W(2);
        byte[] bArr = W.a;
        int i3 = W.c;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 8) & 255);
        bArr[i4] = (byte) (i2 & 255);
        W.c = i4 + 1;
        this.f9230g += 2;
        return this;
    }

    public String toString() {
        return T().toString();
    }

    public f u0(String str) {
        v0(str, 0, str.length());
        return this;
    }

    public byte[] v() {
        try {
            return S(this.f9230g);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public f v0(String str, int i2, int i3) {
        char charAt;
        if (i2 >= 0) {
            if (i3 >= i2) {
                if (i3 > str.length()) {
                    StringBuilder B = f.a.b.a.a.B("endIndex > string.length: ", i3, " > ");
                    B.append(str.length());
                    throw new IllegalArgumentException(B.toString());
                }
                while (i2 < i3) {
                    char charAt2 = str.charAt(i2);
                    if (charAt2 < 128) {
                        u W = W(1);
                        byte[] bArr = W.a;
                        int i4 = W.c - i2;
                        int min = Math.min(i3, 8192 - i4);
                        int i5 = i2 + 1;
                        bArr[i2 + i4] = (byte) charAt2;
                        while (true) {
                            i2 = i5;
                            if (i2 >= min || (charAt = str.charAt(i2)) >= 128) {
                                break;
                            }
                            i5 = i2 + 1;
                            bArr[i2 + i4] = (byte) charAt;
                        }
                        int i6 = W.c;
                        int i7 = (i4 + i2) - i6;
                        W.c = i6 + i7;
                        this.f9230g += i7;
                    } else {
                        if (charAt2 < 2048) {
                            m0((charAt2 >> 6) | 192);
                            m0((charAt2 & '?') | 128);
                        } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                            int i8 = i2 + 1;
                            char charAt3 = i8 < i3 ? str.charAt(i8) : (char) 0;
                            if (charAt2 <= 56319 && charAt3 >= 56320 && charAt3 <= 57343) {
                                int i9 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + LogFileManager.MAX_LOG_SIZE;
                                m0((i9 >> 18) | 240);
                                m0(((i9 >> 12) & 63) | 128);
                                m0(((i9 >> 6) & 63) | 128);
                                m0((i9 & 63) | 128);
                                i2 += 2;
                            } else {
                                m0(63);
                                i2 = i8;
                            }
                        } else {
                            m0((charAt2 >> '\f') | 224);
                            m0(((charAt2 >> 6) & 63) | 128);
                            m0((charAt2 & '?') | 128);
                        }
                        i2++;
                    }
                }
                return this;
            }
            throw new IllegalArgumentException(f.a.b.a.a.k("endIndex < beginIndex: ", i3, " < ", i2));
        }
        throw new IllegalArgumentException(f.a.b.a.a.i("beginIndex < 0: ", i2));
    }

    public f w0(int i2) {
        if (i2 < 128) {
            m0(i2);
        } else if (i2 < 2048) {
            m0((i2 >> 6) | 192);
            m0((i2 & 63) | 128);
        } else if (i2 < 65536) {
            if (i2 >= 55296 && i2 <= 57343) {
                m0(63);
            } else {
                m0((i2 >> 12) | 224);
                m0(((i2 >> 6) & 63) | 128);
                m0((i2 & 63) | 128);
            }
        } else if (i2 <= 1114111) {
            m0((i2 >> 18) | 240);
            m0(((i2 >> 12) & 63) | 128);
            m0(((i2 >> 6) & 63) | 128);
            m0((i2 & 63) | 128);
        } else {
            StringBuilder A = f.a.b.a.a.A("Unexpected code point: ");
            A.append(Integer.toHexString(i2));
            throw new IllegalArgumentException(A.toString());
        }
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i2 = remaining;
            while (i2 > 0) {
                u W = W(1);
                int min = Math.min(i2, 8192 - W.c);
                byteBuffer.get(W.a, W.c, min);
                i2 -= min;
                W.c += min;
            }
            this.f9230g += remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // l.g
    public g y() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        r1 = new l.f().q0(r3);
        r1.m0(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        if (r8 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        r3 = f.a.b.a.a.A("Number too large: ");
        r3.append(r1.N());
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
        throw new java.lang.NumberFormatException(r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b1, code lost:
        r17.f9230g -= r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b7, code lost:
        if (r8 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bb, code lost:
        return -r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    @Override // l.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long z() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.f9230g
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto Lbc
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            r5 = -7
            r7 = 0
            r8 = 0
            r9 = 0
        L14:
            l.u r10 = r0.f9229f
            byte[] r11 = r10.a
            int r12 = r10.b
            int r13 = r10.c
        L1c:
            if (r12 >= r13) goto L95
            r14 = r11[r12]
            r15 = 48
            if (r14 < r15) goto L65
            r15 = 57
            if (r14 > r15) goto L65
            int r15 = 48 - r14
            int r16 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r16 < 0) goto L3d
            if (r16 != 0) goto L36
            long r1 = (long) r15
            int r16 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r16 >= 0) goto L36
            goto L3d
        L36:
            r1 = 10
            long r3 = r3 * r1
            long r1 = (long) r15
            long r3 = r3 + r1
            goto L6f
        L3d:
            l.f r1 = new l.f
            r1.<init>()
            l.f r1 = r1.k0(r3)
            r1.m0(r14)
            if (r8 != 0) goto L4e
            r1.readByte()
        L4e:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r3 = "Number too large: "
            java.lang.StringBuilder r3 = f.a.b.a.a.A(r3)
            java.lang.String r1 = r1.N()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L65:
            r1 = 45
            if (r14 != r1) goto L79
            if (r7 != 0) goto L79
            r1 = 1
            long r5 = r5 - r1
            r8 = 1
        L6f:
            int r12 = r12 + 1
            int r7 = r7 + 1
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            goto L1c
        L79:
            if (r7 == 0) goto L7e
            r1 = 1
            r9 = 1
            goto L95
        L7e:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            java.lang.StringBuilder r2 = f.a.b.a.a.A(r2)
            java.lang.String r3 = java.lang.Integer.toHexString(r14)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L95:
            if (r12 != r13) goto La1
            l.u r1 = r10.a()
            r0.f9229f = r1
            l.v.a(r10)
            goto La3
        La1:
            r10.b = r12
        La3:
            if (r9 != 0) goto Lb1
            l.u r1 = r0.f9229f
            if (r1 != 0) goto Laa
            goto Lb1
        Laa:
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            goto L14
        Lb1:
            long r1 = r0.f9230g
            long r5 = (long) r7
            long r1 = r1 - r5
            r0.f9230g = r1
            if (r8 == 0) goto Lba
            goto Lbb
        Lba:
            long r3 = -r3
        Lbb:
            return r3
        Lbc:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "size == 0"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.f.z():long");
    }
}
