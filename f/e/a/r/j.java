package f.e.a.r;

import java.io.FilterInputStream;
import java.io.InputStream;

/* compiled from: MarkEnforcingInputStream.java */
/* loaded from: classes.dex */
public class j extends FilterInputStream {

    /* renamed from: f  reason: collision with root package name */
    public int f3605f;

    public j(InputStream inputStream) {
        super(inputStream);
        this.f3605f = Integer.MIN_VALUE;
    }

    public final long a(long j2) {
        int i2 = this.f3605f;
        if (i2 == 0) {
            return -1L;
        }
        return (i2 == Integer.MIN_VALUE || j2 <= ((long) i2)) ? j2 : i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i2 = this.f3605f;
        if (i2 == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i2, super.available());
    }

    public final void f(long j2) {
        int i2 = this.f3605f;
        if (i2 == Integer.MIN_VALUE || j2 == -1) {
            return;
        }
        this.f3605f = (int) (i2 - j2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i2) {
        super.mark(i2);
        this.f3605f = i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (a(1L) == -1) {
            return -1;
        }
        int read = super.read();
        f(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.f3605f = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) {
        long a = a(j2);
        if (a == -1) {
            return 0L;
        }
        long skip = super.skip(a);
        f(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        int a = (int) a(i3);
        if (a == -1) {
            return -1;
        }
        int read = super.read(bArr, i2, a);
        f(read);
        return read;
    }
}
