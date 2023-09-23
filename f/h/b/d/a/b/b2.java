package f.h.b.d.a.b;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class b2 extends InputStream {

    /* renamed from: f  reason: collision with root package name */
    public final Enumeration f5578f;

    /* renamed from: g  reason: collision with root package name */
    public InputStream f5579g;

    public b2(Enumeration enumeration) {
        this.f5578f = enumeration;
        a();
    }

    public final void a() {
        InputStream inputStream = this.f5579g;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f5579g = this.f5578f.hasMoreElements() ? new FileInputStream((File) this.f5578f.nextElement()) : null;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        InputStream inputStream = this.f5579g;
        if (inputStream != null) {
            inputStream.close();
            this.f5579g = null;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        while (true) {
            InputStream inputStream = this.f5579g;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        if (this.f5579g == null) {
            return -1;
        }
        Objects.requireNonNull(bArr);
        if (i2 < 0 || i3 < 0 || i3 > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        if (i3 != 0) {
            do {
                int read = this.f5579g.read(bArr, i2, i3);
                if (read > 0) {
                    return read;
                }
                a();
            } while (this.f5579g != null);
            return -1;
        }
        return 0;
    }
}
