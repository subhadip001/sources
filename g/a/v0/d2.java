package g.a.v0;

import java.io.Closeable;

/* compiled from: ReadableBuffer.java */
/* loaded from: classes2.dex */
public interface d2 extends Closeable {
    void G(byte[] bArr, int i2, int i3);

    int c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    d2 n(int i2);

    int readUnsignedByte();
}
