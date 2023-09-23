package f.e.a.l.s.c;

import android.media.MediaDataSource;
import f.e.a.l.s.c.z;
import java.nio.ByteBuffer;

/* compiled from: VideoDecoder.java */
/* loaded from: classes.dex */
public class a0 extends MediaDataSource {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f3453f;

    public a0(z.d dVar, ByteBuffer byteBuffer) {
        this.f3453f = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // android.media.MediaDataSource
    public long getSize() {
        return this.f3453f.limit();
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j2, byte[] bArr, int i2, int i3) {
        if (j2 >= this.f3453f.limit()) {
            return -1;
        }
        this.f3453f.position((int) j2);
        int min = Math.min(i3, this.f3453f.remaining());
        this.f3453f.get(bArr, i2, min);
        return min;
    }
}
