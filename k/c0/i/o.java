package k.c0.i;

import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import k.c0.i.b;
import okhttp3.internal.http2.ErrorCode;

/* compiled from: Http2Writer.java */
/* loaded from: classes2.dex */
public final class o implements Closeable {

    /* renamed from: l  reason: collision with root package name */
    public static final Logger f9073l = Logger.getLogger(c.class.getName());

    /* renamed from: f  reason: collision with root package name */
    public final l.g f9074f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f9075g;

    /* renamed from: h  reason: collision with root package name */
    public final l.f f9076h;

    /* renamed from: i  reason: collision with root package name */
    public int f9077i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f9078j;

    /* renamed from: k  reason: collision with root package name */
    public final b.C0232b f9079k;

    public o(l.g gVar, boolean z) {
        this.f9074f = gVar;
        this.f9075g = z;
        l.f fVar = new l.f();
        this.f9076h = fVar;
        this.f9079k = new b.C0232b(fVar);
        this.f9077i = 16384;
    }

    public synchronized void B(int i2, long j2) {
        if (this.f9078j) {
            throw new IOException("closed");
        }
        if (j2 != 0 && j2 <= 2147483647L) {
            f(i2, 4, (byte) 8, (byte) 0);
            this.f9074f.m((int) j2);
            this.f9074f.flush();
        } else {
            c.b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j2));
            throw null;
        }
    }

    public synchronized void P(boolean z, int i2, int i3) {
        if (!this.f9078j) {
            f(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            this.f9074f.m(i2);
            this.f9074f.m(i3);
            this.f9074f.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(r rVar) {
        if (!this.f9078j) {
            int i2 = this.f9077i;
            int i3 = rVar.a;
            if ((i3 & 32) != 0) {
                i2 = rVar.b[5];
            }
            this.f9077i = i2;
            int i4 = i3 & 2;
            if ((i4 != 0 ? rVar.b[1] : -1) != -1) {
                b.C0232b c0232b = this.f9079k;
                int i5 = i4 != 0 ? rVar.b[1] : -1;
                Objects.requireNonNull(c0232b);
                int min = Math.min(i5, 16384);
                int i6 = c0232b.f8980d;
                if (i6 != min) {
                    if (min < i6) {
                        c0232b.b = Math.min(c0232b.b, min);
                    }
                    c0232b.c = true;
                    c0232b.f8980d = min;
                    int i7 = c0232b.f8984h;
                    if (min < i7) {
                        if (min == 0) {
                            c0232b.a();
                        } else {
                            c0232b.b(i7 - min);
                        }
                    }
                }
            }
            f(0, 0, (byte) 4, (byte) 1);
            this.f9074f.flush();
        } else {
            throw new IOException("closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f9078j = true;
        this.f9074f.close();
    }

    public void f(int i2, int i3, byte b, byte b2) {
        Logger logger = f9073l;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(c.a(false, i2, i3, b, b2));
        }
        int i4 = this.f9077i;
        if (i3 > i4) {
            c.b("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i4), Integer.valueOf(i3));
            throw null;
        } else if ((Integer.MIN_VALUE & i2) != 0) {
            c.b("reserved bit set: %s", Integer.valueOf(i2));
            throw null;
        } else {
            l.g gVar = this.f9074f;
            gVar.t((i3 >>> 16) & 255);
            gVar.t((i3 >>> 8) & 255);
            gVar.t(i3 & 255);
            this.f9074f.t(b & 255);
            this.f9074f.t(b2 & 255);
            this.f9074f.m(i2 & Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }
    }

    public synchronized void flush() {
        if (!this.f9078j) {
            this.f9074f.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void g(int i2, ErrorCode errorCode, byte[] bArr) {
        if (!this.f9078j) {
            if (errorCode.httpCode != -1) {
                f(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f9074f.m(i2);
                this.f9074f.m(errorCode.httpCode);
                if (bArr.length > 0) {
                    this.f9074f.V(bArr);
                }
                this.f9074f.flush();
            } else {
                c.b("errorCode.httpCode == -1", new Object[0]);
                throw null;
            }
        } else {
            throw new IOException("closed");
        }
    }

    public void l(boolean z, int i2, List<a> list) {
        if (!this.f9078j) {
            this.f9079k.e(list);
            long j2 = this.f9076h.f9230g;
            int min = (int) Math.min(this.f9077i, j2);
            long j3 = min;
            int i3 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
            byte b = i3 == 0 ? (byte) 4 : (byte) 0;
            if (z) {
                b = (byte) (b | 1);
            }
            f(i2, min, (byte) 1, b);
            this.f9074f.J(this.f9076h, j3);
            if (i3 > 0) {
                q(i2, j2 - j3);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    public synchronized void p(int i2, ErrorCode errorCode) {
        if (!this.f9078j) {
            if (errorCode.httpCode != -1) {
                f(i2, 4, (byte) 3, (byte) 0);
                this.f9074f.m(errorCode.httpCode);
                this.f9074f.flush();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void q(int i2, long j2) {
        while (j2 > 0) {
            int min = (int) Math.min(this.f9077i, j2);
            long j3 = min;
            j2 -= j3;
            f(i2, min, (byte) 9, j2 == 0 ? (byte) 4 : (byte) 0);
            this.f9074f.J(this.f9076h, j3);
        }
    }

    public synchronized void x(boolean z, int i2, l.f fVar, int i3) {
        if (!this.f9078j) {
            f(i2, i3, (byte) 0, z ? (byte) 1 : (byte) 0);
            if (i3 > 0) {
                this.f9074f.J(fVar, i3);
            }
        } else {
            throw new IOException("closed");
        }
    }
}
