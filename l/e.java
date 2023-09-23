package l;

import java.io.InputStream;

/* compiled from: Buffer.java */
/* loaded from: classes2.dex */
public class e extends InputStream {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f f9227f;

    public e(f fVar) {
        this.f9227f = fVar;
    }

    @Override // java.io.InputStream
    public int available() {
        return (int) Math.min(this.f9227f.f9230g, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.InputStream
    public int read() {
        f fVar = this.f9227f;
        if (fVar.f9230g > 0) {
            return fVar.readByte() & 255;
        }
        return -1;
    }

    public String toString() {
        return this.f9227f + ".inputStream()";
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        return this.f9227f.q(bArr, i2, i3);
    }
}
