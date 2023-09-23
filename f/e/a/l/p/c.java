package f.e.a.l.p;

import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import java.io.OutputStream;

/* compiled from: BufferedOutputStream.java */
/* loaded from: classes.dex */
public final class c extends OutputStream {

    /* renamed from: f  reason: collision with root package name */
    public final OutputStream f3241f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f3242g;

    /* renamed from: h  reason: collision with root package name */
    public f.e.a.l.q.b0.b f3243h;

    /* renamed from: i  reason: collision with root package name */
    public int f3244i;

    public c(OutputStream outputStream, f.e.a.l.q.b0.b bVar) {
        this.f3241f = outputStream;
        this.f3243h = bVar;
        this.f3242g = (byte[]) bVar.e(LogFileManager.MAX_LOG_SIZE, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            flush();
            this.f3241f.close();
            byte[] bArr = this.f3242g;
            if (bArr != null) {
                this.f3243h.d(bArr);
                this.f3242g = null;
            }
        } catch (Throwable th) {
            this.f3241f.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        int i2 = this.f3244i;
        if (i2 > 0) {
            this.f3241f.write(this.f3242g, 0, i2);
            this.f3244i = 0;
        }
        this.f3241f.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i2) {
        byte[] bArr = this.f3242g;
        int i3 = this.f3244i;
        int i4 = i3 + 1;
        this.f3244i = i4;
        bArr[i3] = (byte) i2;
        if (i4 != bArr.length || i4 <= 0) {
            return;
        }
        this.f3241f.write(bArr, 0, i4);
        this.f3244i = 0;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) {
        int i4 = 0;
        do {
            int i5 = i3 - i4;
            int i6 = i2 + i4;
            int i7 = this.f3244i;
            if (i7 == 0 && i5 >= this.f3242g.length) {
                this.f3241f.write(bArr, i6, i5);
                return;
            }
            int min = Math.min(i5, this.f3242g.length - i7);
            System.arraycopy(bArr, i6, this.f3242g, this.f3244i, min);
            int i8 = this.f3244i + min;
            this.f3244i = i8;
            i4 += min;
            byte[] bArr2 = this.f3242g;
            if (i8 == bArr2.length && i8 > 0) {
                this.f3241f.write(bArr2, 0, i8);
                this.f3244i = 0;
                continue;
            }
        } while (i4 < i3);
    }
}
