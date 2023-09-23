package l;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: RealBufferedSource.java */
/* loaded from: classes2.dex */
public final class t implements h {

    /* renamed from: f  reason: collision with root package name */
    public final f f9257f = new f();

    /* renamed from: g  reason: collision with root package name */
    public final y f9258g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f9259h;

    public t(y yVar) {
        Objects.requireNonNull(yVar, "source == null");
        this.f9258g = yVar;
    }

    @Override // l.h
    public String A(long j2) {
        if (j2 >= 0) {
            long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
            long a = a((byte) 10, 0L, j3);
            if (a != -1) {
                return this.f9257f.O(a);
            }
            if (j3 < Long.MAX_VALUE && l(j3) && this.f9257f.l(j3 - 1) == 13 && l(1 + j3) && this.f9257f.l(j3) == 10) {
                return this.f9257f.O(j3);
            }
            f fVar = new f();
            f fVar2 = this.f9257f;
            fVar2.g(fVar, 0L, Math.min(32L, fVar2.f9230g));
            StringBuilder A = f.a.b.a.a.A("\\n not found: limit=");
            A.append(Math.min(this.f9257f.f9230g, j2));
            A.append(" content=");
            A.append(fVar.C().l());
            A.append((char) 8230);
            throw new EOFException(A.toString());
        }
        throw new IllegalArgumentException(f.a.b.a.a.l("limit < 0: ", j2));
    }

    @Override // l.h
    public String Q() {
        return A(Long.MAX_VALUE);
    }

    @Override // l.h
    public int R() {
        j0(4L);
        return this.f9257f.R();
    }

    @Override // l.h
    public byte[] S(long j2) {
        if (l(j2)) {
            return this.f9257f.S(j2);
        }
        throw new EOFException();
    }

    @Override // l.h
    public short Y() {
        j0(2L);
        return this.f9257f.Y();
    }

    public long a(byte b, long j2, long j3) {
        if (this.f9259h) {
            throw new IllegalStateException("closed");
        }
        if (j2 < 0 || j3 < j2) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j2), Long.valueOf(j3)));
        }
        while (j2 < j3) {
            long p = this.f9257f.p(b, j2, j3);
            if (p == -1) {
                f fVar = this.f9257f;
                long j4 = fVar.f9230g;
                if (j4 >= j3 || this.f9258g.a0(fVar, 8192L) == -1) {
                    break;
                }
                j2 = Math.max(j2, j4);
            } else {
                return p;
            }
        }
        return -1L;
    }

    @Override // l.y
    public long a0(f fVar, long j2) {
        if (fVar != null) {
            if (j2 >= 0) {
                if (!this.f9259h) {
                    f fVar2 = this.f9257f;
                    if (fVar2.f9230g == 0 && this.f9258g.a0(fVar2, 8192L) == -1) {
                        return -1L;
                    }
                    return this.f9257f.a0(fVar, Math.min(j2, this.f9257f.f9230g));
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException(f.a.b.a.a.l("byteCount < 0: ", j2));
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // l.h, l.g
    public f b() {
        return this.f9257f;
    }

    @Override // l.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f9259h) {
            return;
        }
        this.f9259h = true;
        this.f9258g.close();
        this.f9257f.a();
    }

    @Override // l.y
    public z d() {
        return this.f9258g.d();
    }

    @Override // l.h
    public void e(long j2) {
        if (this.f9259h) {
            throw new IllegalStateException("closed");
        }
        while (j2 > 0) {
            f fVar = this.f9257f;
            if (fVar.f9230g == 0 && this.f9258g.a0(fVar, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j2, this.f9257f.f9230g);
            this.f9257f.e(min);
            j2 -= min;
        }
    }

    public boolean f(long j2, i iVar) {
        int p = iVar.p();
        if (!this.f9259h) {
            if (j2 < 0 || p < 0 || iVar.p() - 0 < p) {
                return false;
            }
            for (int i2 = 0; i2 < p; i2++) {
                long j3 = i2 + j2;
                if (!l(1 + j3) || this.f9257f.l(j3) != iVar.k(0 + i2)) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException("closed");
    }

    public void g(byte[] bArr) {
        try {
            j0(bArr.length);
            this.f9257f.F(bArr);
        } catch (EOFException e2) {
            int i2 = 0;
            while (true) {
                f fVar = this.f9257f;
                long j2 = fVar.f9230g;
                if (j2 > 0) {
                    int q = fVar.q(bArr, i2, (int) j2);
                    if (q == -1) {
                        throw new AssertionError();
                    }
                    i2 += q;
                } else {
                    throw e2;
                }
            }
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f9259h;
    }

    @Override // l.h
    public i j(long j2) {
        if (l(j2)) {
            return this.f9257f.j(j2);
        }
        throw new EOFException();
    }

    @Override // l.h
    public void j0(long j2) {
        if (!l(j2)) {
            throw new EOFException();
        }
    }

    public boolean l(long j2) {
        f fVar;
        if (j2 >= 0) {
            if (!this.f9259h) {
                do {
                    fVar = this.f9257f;
                    if (fVar.f9230g >= j2) {
                        return true;
                    }
                } while (this.f9258g.a0(fVar, 8192L) != -1);
                return false;
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(f.a.b.a.a.l("byteCount < 0: ", j2));
    }

    @Override // l.h
    public long l0(byte b) {
        return a(b, 0L, Long.MAX_VALUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (r1 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r3)));
     */
    @Override // l.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long n0() {
        /*
            r6 = this;
            r0 = 1
            r6.j0(r0)
            r0 = 0
            r1 = 0
        L7:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.l(r3)
            if (r3 == 0) goto L4a
            l.f r3 = r6.f9257f
            long r4 = (long) r1
            byte r3 = r3.l(r4)
            r4 = 48
            if (r3 < r4) goto L1f
            r4 = 57
            if (r3 <= r4) goto L30
        L1f:
            r4 = 97
            if (r3 < r4) goto L27
            r4 = 102(0x66, float:1.43E-43)
            if (r3 <= r4) goto L30
        L27:
            r4 = 65
            if (r3 < r4) goto L32
            r4 = 70
            if (r3 <= r4) goto L30
            goto L32
        L30:
            r1 = r2
            goto L7
        L32:
            if (r1 == 0) goto L35
            goto L4a
        L35:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L4a:
            l.f r0 = r6.f9257f
            long r0 = r0.n0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.t.n0():long");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        f fVar = this.f9257f;
        if (fVar.f9230g == 0 && this.f9258g.a0(fVar, 8192L) == -1) {
            return -1;
        }
        return this.f9257f.read(byteBuffer);
    }

    @Override // l.h
    public byte readByte() {
        j0(1L);
        return this.f9257f.readByte();
    }

    @Override // l.h
    public int readInt() {
        j0(4L);
        return this.f9257f.readInt();
    }

    @Override // l.h
    public short readShort() {
        j0(2L);
        return this.f9257f.readShort();
    }

    @Override // l.h
    public boolean s() {
        if (this.f9259h) {
            throw new IllegalStateException("closed");
        }
        return this.f9257f.s() && this.f9258g.a0(this.f9257f, 8192L) == -1;
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("buffer(");
        A.append(this.f9258g);
        A.append(")");
        return A.toString();
    }

    @Override // l.h
    public long z() {
        byte l2;
        j0(1L);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (!l(i3)) {
                break;
            }
            l2 = this.f9257f.l(i2);
            if ((l2 < 48 || l2 > 57) && !(i2 == 0 && l2 == 45)) {
                break;
            }
            i2 = i3;
        }
        if (i2 == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(l2)));
        }
        return this.f9257f.z();
    }
}
