package l;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: RealBufferedSource.java */
/* loaded from: classes2.dex */
public class s extends InputStream {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ t f9256f;

    public s(t tVar) {
        this.f9256f = tVar;
    }

    @Override // java.io.InputStream
    public int available() {
        t tVar = this.f9256f;
        if (!tVar.f9259h) {
            return (int) Math.min(tVar.f9257f.f9230g, 2147483647L);
        }
        throw new IOException("closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f9256f.close();
    }

    @Override // java.io.InputStream
    public int read() {
        t tVar = this.f9256f;
        if (!tVar.f9259h) {
            f fVar = tVar.f9257f;
            if (fVar.f9230g == 0 && tVar.f9258g.a0(fVar, 8192L) == -1) {
                return -1;
            }
            return this.f9256f.f9257f.readByte() & 255;
        }
        throw new IOException("closed");
    }

    public String toString() {
        return this.f9256f + ".inputStream()";
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        if (!this.f9256f.f9259h) {
            a0.b(bArr.length, i2, i3);
            t tVar = this.f9256f;
            f fVar = tVar.f9257f;
            if (fVar.f9230g == 0 && tVar.f9258g.a0(fVar, 8192L) == -1) {
                return -1;
            }
            return this.f9256f.f9257f.q(bArr, i2, i3);
        }
        throw new IOException("closed");
    }
}
