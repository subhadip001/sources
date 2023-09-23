package f.m.b;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: MarkableInputStream.java */
/* loaded from: classes2.dex */
public final class o extends InputStream {

    /* renamed from: f  reason: collision with root package name */
    public final InputStream f6857f;

    /* renamed from: g  reason: collision with root package name */
    public long f6858g;

    /* renamed from: h  reason: collision with root package name */
    public long f6859h;

    /* renamed from: i  reason: collision with root package name */
    public long f6860i;

    /* renamed from: j  reason: collision with root package name */
    public long f6861j = -1;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6862k = true;

    /* renamed from: l  reason: collision with root package name */
    public int f6863l;

    public o(InputStream inputStream) {
        this.f6863l = -1;
        this.f6857f = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, 4096);
        this.f6863l = 1024;
    }

    public void a(long j2) {
        if (this.f6858g <= this.f6860i && j2 >= this.f6859h) {
            this.f6857f.reset();
            g(this.f6859h, j2);
            this.f6858g = j2;
            return;
        }
        throw new IOException("Cannot reset");
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f6857f.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f6857f.close();
    }

    public final void f(long j2) {
        try {
            long j3 = this.f6859h;
            long j4 = this.f6858g;
            if (j3 < j4 && j4 <= this.f6860i) {
                this.f6857f.reset();
                this.f6857f.mark((int) (j2 - this.f6859h));
                g(this.f6859h, this.f6858g);
            } else {
                this.f6859h = j4;
                this.f6857f.mark((int) (j2 - j4));
            }
            this.f6860i = j2;
        } catch (IOException e2) {
            throw new IllegalStateException("Unable to mark: " + e2);
        }
    }

    public final void g(long j2, long j3) {
        while (j2 < j3) {
            long skip = this.f6857f.skip(j3 - j2);
            if (skip == 0) {
                if (read() == -1) {
                    return;
                }
                skip = 1;
            }
            j2 += skip;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i2) {
        long j2 = this.f6858g + i2;
        if (this.f6860i < j2) {
            f(j2);
        }
        this.f6861j = this.f6858g;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f6857f.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        if (!this.f6862k) {
            long j2 = this.f6860i;
            if (this.f6858g + 1 > j2) {
                f(j2 + this.f6863l);
            }
        }
        int read = this.f6857f.read();
        if (read != -1) {
            this.f6858g++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public void reset() {
        a(this.f6861j);
    }

    @Override // java.io.InputStream
    public long skip(long j2) {
        if (!this.f6862k) {
            long j3 = this.f6858g;
            if (j3 + j2 > this.f6860i) {
                f(j3 + j2 + this.f6863l);
            }
        }
        long skip = this.f6857f.skip(j2);
        this.f6858g += skip;
        return skip;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        if (!this.f6862k) {
            long j2 = this.f6858g;
            if (bArr.length + j2 > this.f6860i) {
                f(j2 + bArr.length + this.f6863l);
            }
        }
        int read = this.f6857f.read(bArr);
        if (read != -1) {
            this.f6858g += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        if (!this.f6862k) {
            long j2 = this.f6858g;
            long j3 = i3;
            if (j2 + j3 > this.f6860i) {
                f(j2 + j3 + this.f6863l);
            }
        }
        int read = this.f6857f.read(bArr, i2, i3);
        if (read != -1) {
            this.f6858g += read;
        }
        return read;
    }
}
