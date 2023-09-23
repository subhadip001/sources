package g.a.v0;

import java.io.InputStream;

/* compiled from: ReadableBuffers.java */
/* loaded from: classes2.dex */
public final class e2 {
    public static final /* synthetic */ int a = 0;

    /* compiled from: ReadableBuffers.java */
    /* loaded from: classes2.dex */
    public static class b extends c {

        /* renamed from: f  reason: collision with root package name */
        public int f7656f;

        /* renamed from: g  reason: collision with root package name */
        public final int f7657g;

        /* renamed from: h  reason: collision with root package name */
        public final byte[] f7658h;

        public b(byte[] bArr, int i2, int i3) {
            f.h.b.c.a.m(i2 >= 0, "offset must be >= 0");
            f.h.b.c.a.m(i3 >= 0, "length must be >= 0");
            int i4 = i3 + i2;
            f.h.b.c.a.m(i4 <= bArr.length, "offset + length exceeds array boundary");
            f.h.b.c.a.x(bArr, "bytes");
            this.f7658h = bArr;
            this.f7656f = i2;
            this.f7657g = i4;
        }

        @Override // g.a.v0.d2
        public void G(byte[] bArr, int i2, int i3) {
            System.arraycopy(this.f7658h, this.f7656f, bArr, i2, i3);
            this.f7656f += i3;
        }

        @Override // g.a.v0.d2
        public int c() {
            return this.f7657g - this.f7656f;
        }

        @Override // g.a.v0.d2
        public d2 n(int i2) {
            if (c() >= i2) {
                int i3 = this.f7656f;
                this.f7656f = i3 + i2;
                return new b(this.f7658h, i3, i2);
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // g.a.v0.d2
        public int readUnsignedByte() {
            a(1);
            byte[] bArr = this.f7658h;
            int i2 = this.f7656f;
            this.f7656f = i2 + 1;
            return bArr[i2] & 255;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f.h.b.c.a.m(true, "offset must be >= 0");
        f.h.b.c.a.m(true, "length must be >= 0");
        f.h.b.c.a.m(0 + 0 <= bArr.length, "offset + length exceeds array boundary");
        f.h.b.c.a.x(bArr, "bytes");
    }

    /* compiled from: ReadableBuffers.java */
    /* loaded from: classes2.dex */
    public static final class a extends InputStream implements g.a.b0 {

        /* renamed from: f  reason: collision with root package name */
        public final d2 f7655f;

        public a(d2 d2Var) {
            f.h.b.c.a.x(d2Var, "buffer");
            this.f7655f = d2Var;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f7655f.c();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f7655f.close();
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f7655f.c() == 0) {
                return -1;
            }
            return this.f7655f.readUnsignedByte();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            if (this.f7655f.c() == 0) {
                return -1;
            }
            int min = Math.min(this.f7655f.c(), i3);
            this.f7655f.G(bArr, i2, min);
            return min;
        }
    }
}
