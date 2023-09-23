package f.e.a.l.p;

import java.io.FilterInputStream;
import java.io.InputStream;

/* compiled from: ExifOrientationStream.java */
/* loaded from: classes.dex */
public final class g extends FilterInputStream {

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f3245h;

    /* renamed from: i  reason: collision with root package name */
    public static final int f3246i;

    /* renamed from: j  reason: collision with root package name */
    public static final int f3247j;

    /* renamed from: f  reason: collision with root package name */
    public final byte f3248f;

    /* renamed from: g  reason: collision with root package name */
    public int f3249g;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f3245h = bArr;
        int length = bArr.length;
        f3246i = length;
        f3247j = length + 2;
    }

    public g(InputStream inputStream, int i2) {
        super(inputStream);
        if (i2 >= -1 && i2 <= 8) {
            this.f3248f = (byte) i2;
            return;
        }
        throw new IllegalArgumentException(f.a.b.a.a.i("Cannot add invalid orientation: ", i2));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read;
        int i2;
        int i3 = this.f3249g;
        if (i3 < 2 || i3 > (i2 = f3247j)) {
            read = super.read();
        } else if (i3 == i2) {
            read = this.f3248f;
        } else {
            read = f3245h[i3 - 2] & 255;
        }
        if (read != -1) {
            this.f3249g++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) {
        long skip = super.skip(j2);
        if (skip > 0) {
            this.f3249g = (int) (this.f3249g + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        int i4;
        int i5 = this.f3249g;
        int i6 = f3247j;
        if (i5 > i6) {
            i4 = super.read(bArr, i2, i3);
        } else if (i5 == i6) {
            bArr[i2] = this.f3248f;
            i4 = 1;
        } else if (i5 < 2) {
            i4 = super.read(bArr, i2, 2 - i5);
        } else {
            int min = Math.min(i6 - i5, i3);
            System.arraycopy(f3245h, this.f3249g - 2, bArr, i2, min);
            i4 = min;
        }
        if (i4 > 0) {
            this.f3249g += i4;
        }
        return i4;
    }
}
