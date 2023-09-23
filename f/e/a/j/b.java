package f.e.a.j;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: StrictLineReader.java */
/* loaded from: classes.dex */
public class b implements Closeable {

    /* renamed from: f  reason: collision with root package name */
    public final InputStream f3203f;

    /* renamed from: g  reason: collision with root package name */
    public final Charset f3204g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f3205h;

    /* renamed from: i  reason: collision with root package name */
    public int f3206i;

    /* renamed from: j  reason: collision with root package name */
    public int f3207j;

    /* compiled from: StrictLineReader.java */
    /* loaded from: classes.dex */
    public class a extends ByteArrayOutputStream {
        public a(int i2) {
            super(i2);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i2 = ((ByteArrayOutputStream) this).count;
            if (i2 > 0 && ((ByteArrayOutputStream) this).buf[i2 - 1] == 13) {
                i2--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i2, b.this.f3204g.name());
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        if (charset != null) {
            if (charset.equals(c.a)) {
                this.f3203f = inputStream;
                this.f3204g = charset;
                this.f3205h = new byte[8192];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw null;
    }

    public final void a() {
        InputStream inputStream = this.f3203f;
        byte[] bArr = this.f3205h;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f3206i = 0;
            this.f3207j = read;
            return;
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f3203f) {
            if (this.f3205h != null) {
                this.f3205h = null;
                this.f3203f.close();
            }
        }
    }

    public String f() {
        int i2;
        byte[] bArr;
        int i3;
        synchronized (this.f3203f) {
            if (this.f3205h != null) {
                if (this.f3206i >= this.f3207j) {
                    a();
                }
                for (int i4 = this.f3206i; i4 != this.f3207j; i4++) {
                    byte[] bArr2 = this.f3205h;
                    if (bArr2[i4] == 10) {
                        if (i4 != this.f3206i) {
                            i3 = i4 - 1;
                            if (bArr2[i3] == 13) {
                                byte[] bArr3 = this.f3205h;
                                int i5 = this.f3206i;
                                String str = new String(bArr3, i5, i3 - i5, this.f3204g.name());
                                this.f3206i = i4 + 1;
                                return str;
                            }
                        }
                        i3 = i4;
                        byte[] bArr32 = this.f3205h;
                        int i52 = this.f3206i;
                        String str2 = new String(bArr32, i52, i3 - i52, this.f3204g.name());
                        this.f3206i = i4 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f3207j - this.f3206i) + 80);
                loop1: while (true) {
                    byte[] bArr4 = this.f3205h;
                    int i6 = this.f3206i;
                    aVar.write(bArr4, i6, this.f3207j - i6);
                    this.f3207j = -1;
                    a();
                    i2 = this.f3206i;
                    while (i2 != this.f3207j) {
                        bArr = this.f3205h;
                        if (bArr[i2] == 10) {
                            break loop1;
                        }
                        i2++;
                    }
                }
                int i7 = this.f3206i;
                if (i2 != i7) {
                    aVar.write(bArr, i7, i2 - i7);
                }
                this.f3206i = i2 + 1;
                return aVar.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }
}
