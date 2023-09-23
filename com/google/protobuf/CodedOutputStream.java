package com.google.protobuf;

import f.h.h.a0;
import f.h.h.a1;
import f.h.h.h;
import f.h.h.j;
import f.h.h.k1;
import f.h.h.l1;
import f.h.h.m;
import f.h.h.n0;
import f.h.h.y;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class CodedOutputStream extends h {
    public static final Logger b = Logger.getLogger(CodedOutputStream.class.getName());
    public static final boolean c = k1.f6407g;
    public m a;

    /* loaded from: classes2.dex */
    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public OutOfSpaceException(String str, Throwable th) {
            super(f.a.b.a.a.p("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class b extends CodedOutputStream {

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f1283d;

        /* renamed from: e  reason: collision with root package name */
        public final int f1284e;

        /* renamed from: f  reason: collision with root package name */
        public int f1285f;

        /* renamed from: g  reason: collision with root package name */
        public int f1286g;

        public b(int i2) {
            super(null);
            if (i2 >= 0) {
                int max = Math.max(i2, 20);
                this.f1283d = new byte[max];
                this.f1284e = max;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int G() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        public final void d0(int i2) {
            byte[] bArr = this.f1283d;
            int i3 = this.f1285f;
            int i4 = i3 + 1;
            this.f1285f = i4;
            bArr[i3] = (byte) (i2 & 255);
            int i5 = i4 + 1;
            this.f1285f = i5;
            bArr[i4] = (byte) ((i2 >> 8) & 255);
            int i6 = i5 + 1;
            this.f1285f = i6;
            bArr[i5] = (byte) ((i2 >> 16) & 255);
            this.f1285f = i6 + 1;
            bArr[i6] = (byte) ((i2 >> 24) & 255);
            this.f1286g += 4;
        }

        public final void e0(long j2) {
            byte[] bArr = this.f1283d;
            int i2 = this.f1285f;
            int i3 = i2 + 1;
            this.f1285f = i3;
            bArr[i2] = (byte) (j2 & 255);
            int i4 = i3 + 1;
            this.f1285f = i4;
            bArr[i3] = (byte) ((j2 >> 8) & 255);
            int i5 = i4 + 1;
            this.f1285f = i5;
            bArr[i4] = (byte) ((j2 >> 16) & 255);
            int i6 = i5 + 1;
            this.f1285f = i6;
            bArr[i5] = (byte) (255 & (j2 >> 24));
            int i7 = i6 + 1;
            this.f1285f = i7;
            bArr[i6] = (byte) (((int) (j2 >> 32)) & 255);
            int i8 = i7 + 1;
            this.f1285f = i8;
            bArr[i7] = (byte) (((int) (j2 >> 40)) & 255);
            int i9 = i8 + 1;
            this.f1285f = i9;
            bArr[i8] = (byte) (((int) (j2 >> 48)) & 255);
            this.f1285f = i9 + 1;
            bArr[i9] = (byte) (((int) (j2 >> 56)) & 255);
            this.f1286g += 8;
        }

        public final void f0(int i2) {
            if (CodedOutputStream.c) {
                long j2 = this.f1285f;
                while ((i2 & (-128)) != 0) {
                    byte[] bArr = this.f1283d;
                    int i3 = this.f1285f;
                    this.f1285f = i3 + 1;
                    k1.t(bArr, i3, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                }
                byte[] bArr2 = this.f1283d;
                int i4 = this.f1285f;
                this.f1285f = i4 + 1;
                k1.t(bArr2, i4, (byte) i2);
                this.f1286g += (int) (this.f1285f - j2);
                return;
            }
            while ((i2 & (-128)) != 0) {
                byte[] bArr3 = this.f1283d;
                int i5 = this.f1285f;
                this.f1285f = i5 + 1;
                bArr3[i5] = (byte) ((i2 & 127) | 128);
                this.f1286g++;
                i2 >>>= 7;
            }
            byte[] bArr4 = this.f1283d;
            int i6 = this.f1285f;
            this.f1285f = i6 + 1;
            bArr4[i6] = (byte) i2;
            this.f1286g++;
        }

        public final void g0(long j2) {
            if (CodedOutputStream.c) {
                long j3 = this.f1285f;
                while ((j2 & (-128)) != 0) {
                    byte[] bArr = this.f1283d;
                    int i2 = this.f1285f;
                    this.f1285f = i2 + 1;
                    k1.t(bArr, i2, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                byte[] bArr2 = this.f1283d;
                int i3 = this.f1285f;
                this.f1285f = i3 + 1;
                k1.t(bArr2, i3, (byte) j2);
                this.f1286g += (int) (this.f1285f - j3);
                return;
            }
            while ((j2 & (-128)) != 0) {
                byte[] bArr3 = this.f1283d;
                int i4 = this.f1285f;
                this.f1285f = i4 + 1;
                bArr3[i4] = (byte) ((((int) j2) & 127) | 128);
                this.f1286g++;
                j2 >>>= 7;
            }
            byte[] bArr4 = this.f1283d;
            int i5 = this.f1285f;
            this.f1285f = i5 + 1;
            bArr4[i5] = (byte) j2;
            this.f1286g++;
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends CodedOutputStream {

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f1287d;

        /* renamed from: e  reason: collision with root package name */
        public final int f1288e;

        /* renamed from: f  reason: collision with root package name */
        public int f1289f;

        public c(byte[] bArr, int i2, int i3) {
            super(null);
            Objects.requireNonNull(bArr, "buffer");
            int i4 = i2 + i3;
            if ((i2 | i3 | (bArr.length - i4)) >= 0) {
                this.f1287d = bArr;
                this.f1289f = i2;
                this.f1288e = i4;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int G() {
            return this.f1288e - this.f1289f;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void H(byte b) {
            try {
                byte[] bArr = this.f1287d;
                int i2 = this.f1289f;
                this.f1289f = i2 + 1;
                bArr[i2] = b;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f1289f), Integer.valueOf(this.f1288e), 1), e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void I(int i2, boolean z) {
            a0((i2 << 3) | 0);
            H(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void J(byte[] bArr, int i2, int i3) {
            a0(i3);
            d0(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void K(int i2, j jVar) {
            a0((i2 << 3) | 2);
            L(jVar);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void L(j jVar) {
            a0(jVar.size());
            jVar.o(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void M(int i2, int i3) {
            a0((i2 << 3) | 5);
            N(i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void N(int i2) {
            try {
                byte[] bArr = this.f1287d;
                int i3 = this.f1289f;
                int i4 = i3 + 1;
                this.f1289f = i4;
                bArr[i3] = (byte) (i2 & 255);
                int i5 = i4 + 1;
                this.f1289f = i5;
                bArr[i4] = (byte) ((i2 >> 8) & 255);
                int i6 = i5 + 1;
                this.f1289f = i6;
                bArr[i5] = (byte) ((i2 >> 16) & 255);
                this.f1289f = i6 + 1;
                bArr[i6] = (byte) ((i2 >> 24) & 255);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f1289f), Integer.valueOf(this.f1288e), 1), e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void O(int i2, long j2) {
            a0((i2 << 3) | 1);
            P(j2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void P(long j2) {
            try {
                byte[] bArr = this.f1287d;
                int i2 = this.f1289f;
                int i3 = i2 + 1;
                this.f1289f = i3;
                bArr[i2] = (byte) (((int) j2) & 255);
                int i4 = i3 + 1;
                this.f1289f = i4;
                bArr[i3] = (byte) (((int) (j2 >> 8)) & 255);
                int i5 = i4 + 1;
                this.f1289f = i5;
                bArr[i4] = (byte) (((int) (j2 >> 16)) & 255);
                int i6 = i5 + 1;
                this.f1289f = i6;
                bArr[i5] = (byte) (((int) (j2 >> 24)) & 255);
                int i7 = i6 + 1;
                this.f1289f = i7;
                bArr[i6] = (byte) (((int) (j2 >> 32)) & 255);
                int i8 = i7 + 1;
                this.f1289f = i8;
                bArr[i7] = (byte) (((int) (j2 >> 40)) & 255);
                int i9 = i8 + 1;
                this.f1289f = i9;
                bArr[i8] = (byte) (((int) (j2 >> 48)) & 255);
                this.f1289f = i9 + 1;
                bArr[i9] = (byte) (((int) (j2 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f1289f), Integer.valueOf(this.f1288e), 1), e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void Q(int i2, int i3) {
            a0((i2 << 3) | 0);
            if (i3 >= 0) {
                a0(i3);
            } else {
                c0(i3);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void R(int i2) {
            if (i2 >= 0) {
                a0(i2);
            } else {
                c0(i2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void S(int i2, n0 n0Var, a1 a1Var) {
            a0((i2 << 3) | 2);
            a0(((f.h.h.a) n0Var).getSerializedSize(a1Var));
            a1Var.b(n0Var, this.a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void T(n0 n0Var) {
            a0(n0Var.getSerializedSize());
            n0Var.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void U(int i2, n0 n0Var) {
            Y(1, 3);
            Z(2, i2);
            a0(26);
            a0(n0Var.getSerializedSize());
            n0Var.writeTo(this);
            Y(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void V(int i2, j jVar) {
            Y(1, 3);
            Z(2, i2);
            K(3, jVar);
            Y(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void W(int i2, String str) {
            a0((i2 << 3) | 2);
            X(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void X(String str) {
            int i2 = this.f1289f;
            try {
                int A = CodedOutputStream.A(str.length() * 3);
                int A2 = CodedOutputStream.A(str.length());
                if (A2 == A) {
                    int i3 = i2 + A2;
                    this.f1289f = i3;
                    int c = l1.c(str, this.f1287d, i3, G());
                    this.f1289f = i2;
                    a0((c - i2) - A2);
                    this.f1289f = c;
                } else {
                    a0(l1.d(str));
                    this.f1289f = l1.c(str, this.f1287d, this.f1289f, G());
                }
            } catch (l1.c e2) {
                this.f1289f = i2;
                F(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void Y(int i2, int i3) {
            a0((i2 << 3) | i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void Z(int i2, int i3) {
            a0((i2 << 3) | 0);
            a0(i3);
        }

        @Override // f.h.h.h
        public final void a(byte[] bArr, int i2, int i3) {
            d0(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void a0(int i2) {
            while ((i2 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f1287d;
                    int i3 = this.f1289f;
                    this.f1289f = i3 + 1;
                    bArr[i3] = (byte) ((i2 & 127) | 128);
                    i2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f1289f), Integer.valueOf(this.f1288e), 1), e2);
                }
            }
            byte[] bArr2 = this.f1287d;
            int i4 = this.f1289f;
            this.f1289f = i4 + 1;
            bArr2[i4] = (byte) i2;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void b0(int i2, long j2) {
            a0((i2 << 3) | 0);
            c0(j2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void c0(long j2) {
            if (CodedOutputStream.c && G() >= 10) {
                while ((j2 & (-128)) != 0) {
                    byte[] bArr = this.f1287d;
                    int i2 = this.f1289f;
                    this.f1289f = i2 + 1;
                    k1.t(bArr, i2, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                byte[] bArr2 = this.f1287d;
                int i3 = this.f1289f;
                this.f1289f = i3 + 1;
                k1.t(bArr2, i3, (byte) j2);
                return;
            }
            while ((j2 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f1287d;
                    int i4 = this.f1289f;
                    this.f1289f = i4 + 1;
                    bArr3[i4] = (byte) ((((int) j2) & 127) | 128);
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f1289f), Integer.valueOf(this.f1288e), 1), e2);
                }
            }
            byte[] bArr4 = this.f1287d;
            int i5 = this.f1289f;
            this.f1289f = i5 + 1;
            bArr4[i5] = (byte) j2;
        }

        public final void d0(byte[] bArr, int i2, int i3) {
            try {
                System.arraycopy(bArr, i2, this.f1287d, this.f1289f, i3);
                this.f1289f += i3;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f1289f), Integer.valueOf(this.f1288e), Integer.valueOf(i3)), e2);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends b {

        /* renamed from: h  reason: collision with root package name */
        public final OutputStream f1290h;

        public d(OutputStream outputStream, int i2) {
            super(i2);
            Objects.requireNonNull(outputStream, "out");
            this.f1290h = outputStream;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void H(byte b) {
            if (this.f1285f == this.f1284e) {
                h0();
            }
            byte[] bArr = this.f1283d;
            int i2 = this.f1285f;
            this.f1285f = i2 + 1;
            bArr[i2] = b;
            this.f1286g++;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void I(int i2, boolean z) {
            j0(11);
            f0((i2 << 3) | 0);
            byte b = z ? (byte) 1 : (byte) 0;
            byte[] bArr = this.f1283d;
            int i3 = this.f1285f;
            this.f1285f = i3 + 1;
            bArr[i3] = b;
            this.f1286g++;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void J(byte[] bArr, int i2, int i3) {
            j0(5);
            f0(i3);
            k0(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void K(int i2, j jVar) {
            a0((i2 << 3) | 2);
            L(jVar);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void L(j jVar) {
            a0(jVar.size());
            jVar.o(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void M(int i2, int i3) {
            j0(14);
            f0((i2 << 3) | 5);
            d0(i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void N(int i2) {
            j0(4);
            d0(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void O(int i2, long j2) {
            j0(18);
            f0((i2 << 3) | 1);
            e0(j2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void P(long j2) {
            j0(8);
            e0(j2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void Q(int i2, int i3) {
            j0(20);
            f0((i2 << 3) | 0);
            if (i3 >= 0) {
                f0(i3);
            } else {
                g0(i3);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void R(int i2) {
            if (i2 >= 0) {
                j0(5);
                f0(i2);
                return;
            }
            c0(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void S(int i2, n0 n0Var, a1 a1Var) {
            a0((i2 << 3) | 2);
            a0(((f.h.h.a) n0Var).getSerializedSize(a1Var));
            a1Var.b(n0Var, this.a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void T(n0 n0Var) {
            a0(n0Var.getSerializedSize());
            n0Var.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void U(int i2, n0 n0Var) {
            Y(1, 3);
            Z(2, i2);
            a0(26);
            a0(n0Var.getSerializedSize());
            n0Var.writeTo(this);
            Y(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void V(int i2, j jVar) {
            Y(1, 3);
            Z(2, i2);
            K(3, jVar);
            Y(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void W(int i2, String str) {
            a0((i2 << 3) | 2);
            X(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void X(String str) {
            int d2;
            try {
                int length = str.length() * 3;
                int A = CodedOutputStream.A(length);
                int i2 = A + length;
                int i3 = this.f1284e;
                if (i2 > i3) {
                    byte[] bArr = new byte[length];
                    int c = l1.c(str, bArr, 0, length);
                    a0(c);
                    k0(bArr, 0, c);
                    return;
                }
                if (i2 > i3 - this.f1285f) {
                    h0();
                }
                int A2 = CodedOutputStream.A(str.length());
                int i4 = this.f1285f;
                try {
                    if (A2 == A) {
                        int i5 = i4 + A2;
                        this.f1285f = i5;
                        int c2 = l1.c(str, this.f1283d, i5, this.f1284e - i5);
                        this.f1285f = i4;
                        d2 = (c2 - i4) - A2;
                        f0(d2);
                        this.f1285f = c2;
                    } else {
                        d2 = l1.d(str);
                        f0(d2);
                        this.f1285f = l1.c(str, this.f1283d, this.f1285f, d2);
                    }
                    this.f1286g += d2;
                } catch (l1.c e2) {
                    this.f1286g -= this.f1285f - i4;
                    this.f1285f = i4;
                    throw e2;
                } catch (ArrayIndexOutOfBoundsException e3) {
                    throw new OutOfSpaceException(e3);
                }
            } catch (l1.c e4) {
                F(str, e4);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void Y(int i2, int i3) {
            a0((i2 << 3) | i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void Z(int i2, int i3) {
            j0(20);
            f0((i2 << 3) | 0);
            f0(i3);
        }

        @Override // f.h.h.h
        public void a(byte[] bArr, int i2, int i3) {
            k0(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void a0(int i2) {
            j0(5);
            f0(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void b0(int i2, long j2) {
            j0(20);
            f0((i2 << 3) | 0);
            g0(j2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void c0(long j2) {
            j0(10);
            g0(j2);
        }

        public final void h0() {
            this.f1290h.write(this.f1283d, 0, this.f1285f);
            this.f1285f = 0;
        }

        public void i0() {
            if (this.f1285f > 0) {
                h0();
            }
        }

        public final void j0(int i2) {
            if (this.f1284e - this.f1285f < i2) {
                h0();
            }
        }

        public void k0(byte[] bArr, int i2, int i3) {
            int i4 = this.f1284e;
            int i5 = this.f1285f;
            if (i4 - i5 >= i3) {
                System.arraycopy(bArr, i2, this.f1283d, i5, i3);
                this.f1285f += i3;
                this.f1286g += i3;
                return;
            }
            int i6 = i4 - i5;
            System.arraycopy(bArr, i2, this.f1283d, i5, i6);
            int i7 = i2 + i6;
            int i8 = i3 - i6;
            this.f1285f = this.f1284e;
            this.f1286g += i6;
            h0();
            if (i8 <= this.f1284e) {
                System.arraycopy(bArr, i7, this.f1283d, 0, i8);
                this.f1285f = i8;
            } else {
                this.f1290h.write(bArr, i7, i8);
            }
            this.f1286g += i8;
        }
    }

    public CodedOutputStream() {
    }

    public static int A(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int B(int i2, long j2) {
        return C(j2) + y(i2);
    }

    public static int C(long j2) {
        int i2;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            i2 = 6;
            j2 >>>= 28;
        } else {
            i2 = 2;
        }
        if (((-2097152) & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? i2 + 1 : i2;
    }

    public static int D(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    public static long E(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    public static int c(int i2, boolean z) {
        return y(i2) + 1;
    }

    public static int d(int i2, j jVar) {
        return y(i2) + p(jVar.size());
    }

    public static int e(j jVar) {
        return p(jVar.size());
    }

    public static int f(int i2, double d2) {
        return y(i2) + 8;
    }

    public static int g(int i2, int i3) {
        return y(i2) + m(i3);
    }

    public static int h(int i2, int i3) {
        return y(i2) + 4;
    }

    public static int i(int i2, long j2) {
        return y(i2) + 8;
    }

    public static int j(int i2, float f2) {
        return y(i2) + 4;
    }

    @Deprecated
    public static int k(int i2, n0 n0Var, a1 a1Var) {
        return (y(i2) * 2) + ((f.h.h.a) n0Var).getSerializedSize(a1Var);
    }

    public static int l(int i2, int i3) {
        return m(i3) + y(i2);
    }

    public static int m(int i2) {
        if (i2 >= 0) {
            return A(i2);
        }
        return 10;
    }

    public static int n(int i2, long j2) {
        return y(i2) + C(j2);
    }

    public static int o(a0 a0Var) {
        int serializedSize;
        if (a0Var.b != null) {
            serializedSize = a0Var.b.size();
        } else {
            serializedSize = a0Var.a != null ? a0Var.a.getSerializedSize() : 0;
        }
        return p(serializedSize);
    }

    public static int p(int i2) {
        return A(i2) + i2;
    }

    public static int q(int i2, int i3) {
        return y(i2) + 4;
    }

    public static int r(int i2, long j2) {
        return y(i2) + 8;
    }

    public static int s(int i2, int i3) {
        return t(i3) + y(i2);
    }

    public static int t(int i2) {
        return A(D(i2));
    }

    public static int u(int i2, long j2) {
        return v(j2) + y(i2);
    }

    public static int v(long j2) {
        return C(E(j2));
    }

    public static int w(int i2, String str) {
        return x(str) + y(i2);
    }

    public static int x(String str) {
        int length;
        try {
            length = l1.d(str);
        } catch (l1.c unused) {
            length = str.getBytes(y.a).length;
        }
        return p(length);
    }

    public static int y(int i2) {
        return A((i2 << 3) | 0);
    }

    public static int z(int i2, int i3) {
        return A(i3) + y(i2);
    }

    public final void F(String str, l1.c cVar) {
        b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) cVar);
        byte[] bytes = str.getBytes(y.a);
        try {
            a0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new OutOfSpaceException(e2);
        }
    }

    public abstract int G();

    public abstract void H(byte b2);

    public abstract void I(int i2, boolean z);

    public abstract void J(byte[] bArr, int i2, int i3);

    public abstract void K(int i2, j jVar);

    public abstract void L(j jVar);

    public abstract void M(int i2, int i3);

    public abstract void N(int i2);

    public abstract void O(int i2, long j2);

    public abstract void P(long j2);

    public abstract void Q(int i2, int i3);

    public abstract void R(int i2);

    public abstract void S(int i2, n0 n0Var, a1 a1Var);

    public abstract void T(n0 n0Var);

    public abstract void U(int i2, n0 n0Var);

    public abstract void V(int i2, j jVar);

    public abstract void W(int i2, String str);

    public abstract void X(String str);

    public abstract void Y(int i2, int i3);

    public abstract void Z(int i2, int i3);

    public abstract void a0(int i2);

    public final void b() {
        if (G() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void b0(int i2, long j2);

    public abstract void c0(long j2);

    public CodedOutputStream(a aVar) {
    }
}
