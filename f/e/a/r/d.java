package f.e.a.r;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: ExceptionPassthroughInputStream.java */
/* loaded from: classes.dex */
public final class d extends InputStream {

    /* renamed from: h  reason: collision with root package name */
    public static final Queue<d> f3602h;

    /* renamed from: f  reason: collision with root package name */
    public InputStream f3603f;

    /* renamed from: g  reason: collision with root package name */
    public IOException f3604g;

    static {
        char[] cArr = l.a;
        f3602h = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f3603f.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3603f.close();
    }

    @Override // java.io.InputStream
    public void mark(int i2) {
        this.f3603f.mark(i2);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f3603f.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f3603f.read();
        } catch (IOException e2) {
            this.f3604g = e2;
            throw e2;
        }
    }

    public void release() {
        this.f3604g = null;
        this.f3603f = null;
        Queue<d> queue = f3602h;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f3603f.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j2) {
        try {
            return this.f3603f.skip(j2);
        } catch (IOException e2) {
            this.f3604g = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f3603f.read(bArr);
        } catch (IOException e2) {
            this.f3604g = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        try {
            return this.f3603f.read(bArr, i2, i3);
        } catch (IOException e2) {
            this.f3604g = e2;
            throw e2;
        }
    }
}
