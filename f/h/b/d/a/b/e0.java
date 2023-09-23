package f.h.b.d.a.b;

import java.io.InputStream;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class e0 extends InputStream {

    /* renamed from: f  reason: collision with root package name */
    public final InputStream f5600f;

    /* renamed from: g  reason: collision with root package name */
    public long f5601g;

    public e0(InputStream inputStream, long j2) {
        this.f5600f = inputStream;
        this.f5601g = j2;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.f5600f.close();
        this.f5601g = 0L;
    }

    @Override // java.io.InputStream
    public final int read() {
        long j2 = this.f5601g;
        if (j2 <= 0) {
            return -1;
        }
        this.f5601g = j2 - 1;
        return this.f5600f.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        long j2 = this.f5601g;
        if (j2 <= 0) {
            return -1;
        }
        int read = this.f5600f.read(bArr, i2, (int) Math.min(i3, j2));
        if (read != -1) {
            this.f5601g -= read;
        }
        return read;
    }
}
