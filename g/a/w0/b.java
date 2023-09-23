package g.a.w0;

import g.a.w0.h;
import io.grpc.okhttp.internal.framed.ErrorCode;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: ExceptionHandlingFrameWriter.java */
/* loaded from: classes2.dex */
public final class b implements g.a.w0.p.i.b {

    /* renamed from: i  reason: collision with root package name */
    public static final Logger f8000i = Logger.getLogger(g.class.getName());

    /* renamed from: f  reason: collision with root package name */
    public final a f8001f;

    /* renamed from: g  reason: collision with root package name */
    public final g.a.w0.p.i.b f8002g;

    /* renamed from: h  reason: collision with root package name */
    public final h f8003h;

    /* compiled from: ExceptionHandlingFrameWriter.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(Throwable th);
    }

    public b(a aVar, g.a.w0.p.i.b bVar, h hVar) {
        f.h.b.c.a.x(aVar, "transportExceptionHandler");
        this.f8001f = aVar;
        f.h.b.c.a.x(bVar, "frameWriter");
        this.f8002g = bVar;
        f.h.b.c.a.x(hVar, "frameLogger");
        this.f8003h = hVar;
    }

    @Override // g.a.w0.p.i.b
    public void B(int i2, long j2) {
        this.f8003h.g(h.a.OUTBOUND, i2, j2);
        try {
            this.f8002g.B(i2, j2);
        } catch (IOException e2) {
            this.f8001f.a(e2);
        }
    }

    @Override // g.a.w0.p.i.b
    public void H(g.a.w0.p.i.g gVar) {
        h hVar = this.f8003h;
        h.a aVar = h.a.OUTBOUND;
        if (hVar.a()) {
            Logger logger = hVar.a;
            Level level = hVar.b;
            logger.log(level, aVar + " SETTINGS: ack=true");
        }
        try {
            this.f8002g.H(gVar);
        } catch (IOException e2) {
            this.f8001f.a(e2);
        }
    }

    @Override // g.a.w0.p.i.b
    public void L(g.a.w0.p.i.g gVar) {
        this.f8003h.f(h.a.OUTBOUND, gVar);
        try {
            this.f8002g.L(gVar);
        } catch (IOException e2) {
            this.f8001f.a(e2);
        }
    }

    @Override // g.a.w0.p.i.b
    public void P(boolean z, int i2, int i3) {
        h.a aVar = h.a.OUTBOUND;
        if (z) {
            h hVar = this.f8003h;
            long j2 = (4294967295L & i3) | (i2 << 32);
            if (hVar.a()) {
                Logger logger = hVar.a;
                Level level = hVar.b;
                logger.log(level, aVar + " PING: ack=true bytes=" + j2);
            }
        } else {
            this.f8003h.d(aVar, (4294967295L & i3) | (i2 << 32));
        }
        try {
            this.f8002g.P(z, i2, i3);
        } catch (IOException e2) {
            this.f8001f.a(e2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Level level;
        try {
            this.f8002g.close();
        } catch (IOException e2) {
            Logger logger = f8000i;
            if (e2.getClass().equals(IOException.class)) {
                level = Level.FINE;
            } else {
                level = Level.INFO;
            }
            logger.log(level, "Failed closing connection", (Throwable) e2);
        }
    }

    @Override // g.a.w0.p.i.b
    public int f0() {
        return this.f8002g.f0();
    }

    @Override // g.a.w0.p.i.b
    public void flush() {
        try {
            this.f8002g.flush();
        } catch (IOException e2) {
            this.f8001f.a(e2);
        }
    }

    @Override // g.a.w0.p.i.b
    public void h0(boolean z, boolean z2, int i2, int i3, List<g.a.w0.p.i.c> list) {
        try {
            this.f8002g.h0(z, z2, i2, i3, list);
        } catch (IOException e2) {
            this.f8001f.a(e2);
        }
    }

    @Override // g.a.w0.p.i.b
    public void o0(int i2, ErrorCode errorCode, byte[] bArr) {
        this.f8003h.c(h.a.OUTBOUND, i2, errorCode, l.i.m(bArr));
        try {
            this.f8002g.o0(i2, errorCode, bArr);
            this.f8002g.flush();
        } catch (IOException e2) {
            this.f8001f.a(e2);
        }
    }

    @Override // g.a.w0.p.i.b
    public void p0(int i2, ErrorCode errorCode) {
        this.f8003h.e(h.a.OUTBOUND, i2, errorCode);
        try {
            this.f8002g.p0(i2, errorCode);
        } catch (IOException e2) {
            this.f8001f.a(e2);
        }
    }

    @Override // g.a.w0.p.i.b
    public void u() {
        try {
            this.f8002g.u();
        } catch (IOException e2) {
            this.f8001f.a(e2);
        }
    }

    @Override // g.a.w0.p.i.b
    public void x(boolean z, int i2, l.f fVar, int i3) {
        this.f8003h.b(h.a.OUTBOUND, i2, fVar, i3, z);
        try {
            this.f8002g.x(z, i2, fVar, i3);
        } catch (IOException e2) {
            this.f8001f.a(e2);
        }
    }
}
