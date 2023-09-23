package g.a.w0;

import g.a.v0.d2;

/* compiled from: OkHttpReadableBuffer.java */
/* loaded from: classes2.dex */
public class j extends g.a.v0.c {

    /* renamed from: f  reason: collision with root package name */
    public final l.f f8067f;

    public j(l.f fVar) {
        this.f8067f = fVar;
    }

    @Override // g.a.v0.d2
    public void G(byte[] bArr, int i2, int i3) {
        while (i3 > 0) {
            int q = this.f8067f.q(bArr, i2, i3);
            if (q == -1) {
                throw new IndexOutOfBoundsException(f.a.b.a.a.j("EOF trying to read ", i3, " bytes"));
            }
            i3 -= q;
            i2 += q;
        }
    }

    @Override // g.a.v0.d2
    public int c() {
        return (int) this.f8067f.f9230g;
    }

    @Override // g.a.v0.c, g.a.v0.d2, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f8067f.a();
    }

    @Override // g.a.v0.d2
    public d2 n(int i2) {
        l.f fVar = new l.f();
        fVar.J(this.f8067f, i2);
        return new j(fVar);
    }

    @Override // g.a.v0.d2
    public int readUnsignedByte() {
        return this.f8067f.readByte() & 255;
    }
}
