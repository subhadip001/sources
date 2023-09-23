package l;

import java.nio.channels.WritableByteChannel;

/* compiled from: BufferedSink.java */
/* loaded from: classes2.dex */
public interface g extends x, WritableByteChannel {
    g D(String str);

    g K(long j2);

    g V(byte[] bArr);

    f b();

    @Override // l.x, java.io.Flushable
    void flush();

    g k(int i2);

    g k0(long j2);

    g m(int i2);

    g t(int i2);

    g y();
}
