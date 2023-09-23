package l;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: RealBufferedSink.java */
/* loaded from: classes2.dex */
public final class r implements g {

    /* renamed from: f  reason: collision with root package name */
    public final f f9253f = new f();

    /* renamed from: g  reason: collision with root package name */
    public final x f9254g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f9255h;

    public r(x xVar) {
        Objects.requireNonNull(xVar, "sink == null");
        this.f9254g = xVar;
    }

    @Override // l.g
    public g D(String str) {
        if (!this.f9255h) {
            this.f9253f.u0(str);
            y();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // l.x
    public void J(f fVar, long j2) {
        if (!this.f9255h) {
            this.f9253f.J(fVar, j2);
            y();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // l.g
    public g K(long j2) {
        if (!this.f9255h) {
            this.f9253f.K(j2);
            return y();
        }
        throw new IllegalStateException("closed");
    }

    @Override // l.g
    public g V(byte[] bArr) {
        if (!this.f9255h) {
            this.f9253f.d0(bArr);
            y();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public g a(byte[] bArr, int i2, int i3) {
        if (!this.f9255h) {
            this.f9253f.g0(bArr, i2, i3);
            y();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // l.g
    public f b() {
        return this.f9253f;
    }

    @Override // l.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f9255h) {
            return;
        }
        Throwable th = null;
        try {
            f fVar = this.f9253f;
            long j2 = fVar.f9230g;
            if (j2 > 0) {
                this.f9254g.J(fVar, j2);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f9254g.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f9255h = true;
        if (th == null) {
            return;
        }
        Charset charset = a0.a;
        throw th;
    }

    @Override // l.x
    public z d() {
        return this.f9254g.d();
    }

    @Override // l.g, l.x, java.io.Flushable
    public void flush() {
        if (!this.f9255h) {
            f fVar = this.f9253f;
            long j2 = fVar.f9230g;
            if (j2 > 0) {
                this.f9254g.J(fVar, j2);
            }
            this.f9254g.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f9255h;
    }

    @Override // l.g
    public g k(int i2) {
        if (!this.f9255h) {
            this.f9253f.t0(i2);
            y();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // l.g
    public g k0(long j2) {
        if (!this.f9255h) {
            this.f9253f.k0(j2);
            y();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // l.g
    public g m(int i2) {
        if (!this.f9255h) {
            this.f9253f.s0(i2);
            return y();
        }
        throw new IllegalStateException("closed");
    }

    @Override // l.g
    public g t(int i2) {
        if (!this.f9255h) {
            this.f9253f.m0(i2);
            return y();
        }
        throw new IllegalStateException("closed");
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("buffer(");
        A.append(this.f9254g);
        A.append(")");
        return A.toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (!this.f9255h) {
            int write = this.f9253f.write(byteBuffer);
            y();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    @Override // l.g
    public g y() {
        if (!this.f9255h) {
            long f2 = this.f9253f.f();
            if (f2 > 0) {
                this.f9254g.J(this.f9253f, f2);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
