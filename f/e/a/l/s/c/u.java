package f.e.a.l.s.c;

import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: RecyclableBufferedInputStream.java */
/* loaded from: classes.dex */
public class u extends FilterInputStream {

    /* renamed from: f  reason: collision with root package name */
    public volatile byte[] f3476f;

    /* renamed from: g  reason: collision with root package name */
    public int f3477g;

    /* renamed from: h  reason: collision with root package name */
    public int f3478h;

    /* renamed from: i  reason: collision with root package name */
    public int f3479i;

    /* renamed from: j  reason: collision with root package name */
    public int f3480j;

    /* renamed from: k  reason: collision with root package name */
    public final f.e.a.l.q.b0.b f3481k;

    /* compiled from: RecyclableBufferedInputStream.java */
    /* loaded from: classes.dex */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public u(InputStream inputStream, f.e.a.l.q.b0.b bVar) {
        super(inputStream);
        this.f3479i = -1;
        this.f3481k = bVar;
        this.f3476f = (byte[]) bVar.e(LogFileManager.MAX_LOG_SIZE, byte[].class);
    }

    public static IOException f() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) {
        int i2 = this.f3479i;
        if (i2 != -1) {
            int i3 = this.f3480j - i2;
            int i4 = this.f3478h;
            if (i3 < i4) {
                if (i2 == 0 && i4 > bArr.length && this.f3477g == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i4) {
                        i4 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f3481k.e(i4, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f3476f = bArr2;
                    this.f3481k.d(bArr);
                    bArr = bArr2;
                } else if (i2 > 0) {
                    System.arraycopy(bArr, i2, bArr, 0, bArr.length - i2);
                }
                int i5 = this.f3480j - this.f3479i;
                this.f3480j = i5;
                this.f3479i = 0;
                this.f3477g = 0;
                int read = inputStream.read(bArr, i5, bArr.length - i5);
                int i6 = this.f3480j;
                if (read > 0) {
                    i6 += read;
                }
                this.f3477g = i6;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f3479i = -1;
            this.f3480j = 0;
            this.f3477g = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f3476f != null && inputStream != null) {
        } else {
            f();
            throw null;
        }
        return (this.f3477g - this.f3480j) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f3476f != null) {
            this.f3481k.d(this.f3476f);
            this.f3476f = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i2) {
        this.f3478h = Math.max(this.f3478h, i2);
        this.f3479i = this.f3480j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f3476f;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.f3480j < this.f3477g || a(inputStream, bArr) != -1) {
                if (bArr != this.f3476f && (bArr = this.f3476f) == null) {
                    f();
                    throw null;
                }
                int i2 = this.f3477g;
                int i3 = this.f3480j;
                if (i2 - i3 > 0) {
                    this.f3480j = i3 + 1;
                    return bArr[i3] & 255;
                }
                return -1;
            }
            return -1;
        }
        f();
        throw null;
    }

    public synchronized void release() {
        if (this.f3476f != null) {
            this.f3481k.d(this.f3476f);
            this.f3476f = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f3476f != null) {
            int i2 = this.f3479i;
            if (-1 != i2) {
                this.f3480j = i2;
            } else {
                throw new a("Mark has been invalidated, pos: " + this.f3480j + " markLimit: " + this.f3478h);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j2) {
        if (j2 < 1) {
            return 0L;
        }
        byte[] bArr = this.f3476f;
        if (bArr != null) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i2 = this.f3477g;
                int i3 = this.f3480j;
                if (i2 - i3 >= j2) {
                    this.f3480j = (int) (i3 + j2);
                    return j2;
                }
                long j3 = i2 - i3;
                this.f3480j = i2;
                if (this.f3479i != -1 && j2 <= this.f3478h) {
                    if (a(inputStream, bArr) == -1) {
                        return j3;
                    }
                    int i4 = this.f3477g;
                    int i5 = this.f3480j;
                    if (i4 - i5 >= j2 - j3) {
                        this.f3480j = (int) ((i5 + j2) - j3);
                        return j2;
                    }
                    long j4 = (j3 + i4) - i5;
                    this.f3480j = i4;
                    return j4;
                }
                long skip = inputStream.skip(j2 - j3);
                if (skip > 0) {
                    this.f3479i = -1;
                }
                return j3 + skip;
            }
            f();
            throw null;
        }
        f();
        throw null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        byte[] bArr2 = this.f3476f;
        if (bArr2 == null) {
            f();
            throw null;
        } else if (i3 == 0) {
            return 0;
        } else {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i6 = this.f3480j;
                int i7 = this.f3477g;
                if (i6 < i7) {
                    int i8 = i7 - i6 >= i3 ? i3 : i7 - i6;
                    System.arraycopy(bArr2, i6, bArr, i2, i8);
                    this.f3480j += i8;
                    if (i8 == i3 || inputStream.available() == 0) {
                        return i8;
                    }
                    i2 += i8;
                    i4 = i3 - i8;
                } else {
                    i4 = i3;
                }
                while (true) {
                    if (this.f3479i == -1 && i4 >= bArr2.length) {
                        i5 = inputStream.read(bArr, i2, i4);
                        if (i5 == -1) {
                            return i4 != i3 ? i3 - i4 : -1;
                        }
                    } else if (a(inputStream, bArr2) == -1) {
                        return i4 != i3 ? i3 - i4 : -1;
                    } else {
                        if (bArr2 != this.f3476f && (bArr2 = this.f3476f) == null) {
                            f();
                            throw null;
                        }
                        int i9 = this.f3477g;
                        int i10 = this.f3480j;
                        i5 = i9 - i10 >= i4 ? i4 : i9 - i10;
                        System.arraycopy(bArr2, i10, bArr, i2, i5);
                        this.f3480j += i5;
                    }
                    i4 -= i5;
                    if (i4 == 0) {
                        return i3;
                    }
                    if (inputStream.available() == 0) {
                        return i3 - i4;
                    }
                    i2 += i5;
                }
            } else {
                f();
                throw null;
            }
        }
    }
}
