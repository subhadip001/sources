package f.e.a.r;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ContentLengthInputStream.java */
/* loaded from: classes.dex */
public final class c extends FilterInputStream {

    /* renamed from: f  reason: collision with root package name */
    public final long f3600f;

    /* renamed from: g  reason: collision with root package name */
    public int f3601g;

    public c(InputStream inputStream, long j2) {
        super(inputStream);
        this.f3600f = j2;
    }

    public final int a(int i2) {
        if (i2 >= 0) {
            this.f3601g += i2;
        } else if (this.f3600f - this.f3601g > 0) {
            StringBuilder A = f.a.b.a.a.A("Failed to read all expected data, expected: ");
            A.append(this.f3600f);
            A.append(", but read: ");
            A.append(this.f3601g);
            throw new IOException(A.toString());
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f3600f - this.f3601g, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i2, int i3) {
        int read;
        read = super.read(bArr, i2, i3);
        a(read);
        return read;
    }
}
