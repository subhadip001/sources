package k.c0.i;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.Objects;
import l.x;
import l.y;
import l.z;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* compiled from: Http2Stream.java */
/* loaded from: classes2.dex */
public final class n {
    public long b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final e f9053d;

    /* renamed from: e  reason: collision with root package name */
    public final List<k.c0.i.a> f9054e;

    /* renamed from: f  reason: collision with root package name */
    public List<k.c0.i.a> f9055f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9056g;

    /* renamed from: h  reason: collision with root package name */
    public final b f9057h;

    /* renamed from: i  reason: collision with root package name */
    public final a f9058i;
    public long a = 0;

    /* renamed from: j  reason: collision with root package name */
    public final c f9059j = new c();

    /* renamed from: k  reason: collision with root package name */
    public final c f9060k = new c();

    /* renamed from: l  reason: collision with root package name */
    public ErrorCode f9061l = null;

    /* compiled from: Http2Stream.java */
    /* loaded from: classes2.dex */
    public final class a implements x {

        /* renamed from: f  reason: collision with root package name */
        public final l.f f9062f = new l.f();

        /* renamed from: g  reason: collision with root package name */
        public boolean f9063g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f9064h;

        public a() {
        }

        @Override // l.x
        public void J(l.f fVar, long j2) {
            this.f9062f.J(fVar, j2);
            while (this.f9062f.f9230g >= 16384) {
                a(false);
            }
        }

        public final void a(boolean z) {
            n nVar;
            long min;
            n nVar2;
            synchronized (n.this) {
                n.this.f9060k.i();
                while (true) {
                    nVar = n.this;
                    if (nVar.b > 0 || this.f9064h || this.f9063g || nVar.f9061l != null) {
                        break;
                    }
                    nVar.i();
                }
                nVar.f9060k.n();
                n.this.b();
                min = Math.min(n.this.b, this.f9062f.f9230g);
                nVar2 = n.this;
                nVar2.b -= min;
            }
            nVar2.f9060k.i();
            try {
                n nVar3 = n.this;
                nVar3.f9053d.C(nVar3.c, z && min == this.f9062f.f9230g, this.f9062f, min);
            } finally {
                n.this.f9060k.n();
            }
        }

        @Override // l.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (n.this) {
                if (this.f9063g) {
                    return;
                }
                n nVar = n.this;
                if (!nVar.f9058i.f9064h) {
                    if (this.f9062f.f9230g > 0) {
                        while (this.f9062f.f9230g > 0) {
                            a(true);
                        }
                    } else {
                        nVar.f9053d.C(nVar.c, true, null, 0L);
                    }
                }
                synchronized (n.this) {
                    this.f9063g = true;
                }
                n.this.f9053d.w.flush();
                n.this.a();
            }
        }

        @Override // l.x
        public z d() {
            return n.this.f9060k;
        }

        @Override // l.x, java.io.Flushable
        public void flush() {
            synchronized (n.this) {
                n.this.b();
            }
            while (this.f9062f.f9230g > 0) {
                a(false);
                n.this.f9053d.flush();
            }
        }
    }

    /* compiled from: Http2Stream.java */
    /* loaded from: classes2.dex */
    public final class b implements y {

        /* renamed from: f  reason: collision with root package name */
        public final l.f f9066f = new l.f();

        /* renamed from: g  reason: collision with root package name */
        public final l.f f9067g = new l.f();

        /* renamed from: h  reason: collision with root package name */
        public final long f9068h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f9069i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f9070j;

        public b(long j2) {
            this.f9068h = j2;
        }

        public final void a() {
            n.this.f9059j.i();
            while (this.f9067g.f9230g == 0 && !this.f9070j && !this.f9069i) {
                try {
                    n nVar = n.this;
                    if (nVar.f9061l != null) {
                        break;
                    }
                    nVar.i();
                } finally {
                    n.this.f9059j.n();
                }
            }
        }

        @Override // l.y
        public long a0(l.f fVar, long j2) {
            if (j2 >= 0) {
                synchronized (n.this) {
                    a();
                    if (!this.f9069i) {
                        if (n.this.f9061l == null) {
                            l.f fVar2 = this.f9067g;
                            long j3 = fVar2.f9230g;
                            if (j3 == 0) {
                                return -1L;
                            }
                            long a0 = fVar2.a0(fVar, Math.min(j2, j3));
                            n nVar = n.this;
                            long j4 = nVar.a + a0;
                            nVar.a = j4;
                            if (j4 >= nVar.f9053d.s.a() / 2) {
                                n nVar2 = n.this;
                                nVar2.f9053d.M(nVar2.c, nVar2.a);
                                n.this.a = 0L;
                            }
                            synchronized (n.this.f9053d) {
                                e eVar = n.this.f9053d;
                                long j5 = eVar.q + a0;
                                eVar.q = j5;
                                if (j5 >= eVar.s.a() / 2) {
                                    e eVar2 = n.this.f9053d;
                                    eVar2.M(0, eVar2.q);
                                    n.this.f9053d.q = 0L;
                                }
                            }
                            return a0;
                        }
                        throw new StreamResetException(n.this.f9061l);
                    }
                    throw new IOException("stream closed");
                }
            }
            throw new IllegalArgumentException(f.a.b.a.a.l("byteCount < 0: ", j2));
        }

        @Override // l.y, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (n.this) {
                this.f9069i = true;
                this.f9067g.a();
                n.this.notifyAll();
            }
            n.this.a();
        }

        @Override // l.y
        public z d() {
            return n.this.f9059j;
        }
    }

    /* compiled from: Http2Stream.java */
    /* loaded from: classes2.dex */
    public class c extends l.c {
        public c() {
        }

        @Override // l.c
        public IOException l(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // l.c
        public void m() {
            n nVar = n.this;
            ErrorCode errorCode = ErrorCode.CANCEL;
            if (nVar.d(errorCode)) {
                nVar.f9053d.F(nVar.c, errorCode);
            }
        }

        public void n() {
            if (k()) {
                throw l(null);
            }
        }
    }

    public n(int i2, e eVar, boolean z, boolean z2, List<k.c0.i.a> list) {
        Objects.requireNonNull(eVar, "connection == null");
        Objects.requireNonNull(list, "requestHeaders == null");
        this.c = i2;
        this.f9053d = eVar;
        this.b = eVar.t.a();
        b bVar = new b(eVar.s.a());
        this.f9057h = bVar;
        a aVar = new a();
        this.f9058i = aVar;
        bVar.f9070j = z2;
        aVar.f9064h = z;
        this.f9054e = list;
    }

    public void a() {
        boolean z;
        boolean g2;
        synchronized (this) {
            b bVar = this.f9057h;
            if (!bVar.f9070j && bVar.f9069i) {
                a aVar = this.f9058i;
                if (aVar.f9064h || aVar.f9063g) {
                    z = true;
                    g2 = g();
                }
            }
            z = false;
            g2 = g();
        }
        if (z) {
            c(ErrorCode.CANCEL);
        } else if (g2) {
        } else {
            this.f9053d.q(this.c);
        }
    }

    public void b() {
        a aVar = this.f9058i;
        if (!aVar.f9063g) {
            if (!aVar.f9064h) {
                if (this.f9061l != null) {
                    throw new StreamResetException(this.f9061l);
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public void c(ErrorCode errorCode) {
        if (d(errorCode)) {
            e eVar = this.f9053d;
            eVar.w.p(this.c, errorCode);
        }
    }

    public final boolean d(ErrorCode errorCode) {
        synchronized (this) {
            if (this.f9061l != null) {
                return false;
            }
            if (this.f9057h.f9070j && this.f9058i.f9064h) {
                return false;
            }
            this.f9061l = errorCode;
            notifyAll();
            this.f9053d.q(this.c);
            return true;
        }
    }

    public x e() {
        synchronized (this) {
            if (!this.f9056g && !f()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f9058i;
    }

    public boolean f() {
        return this.f9053d.f8999f == ((this.c & 1) == 1);
    }

    public synchronized boolean g() {
        if (this.f9061l != null) {
            return false;
        }
        b bVar = this.f9057h;
        if (bVar.f9070j || bVar.f9069i) {
            a aVar = this.f9058i;
            if (aVar.f9064h || aVar.f9063g) {
                if (this.f9056g) {
                    return false;
                }
            }
        }
        return true;
    }

    public void h() {
        boolean g2;
        synchronized (this) {
            this.f9057h.f9070j = true;
            g2 = g();
            notifyAll();
        }
        if (g2) {
            return;
        }
        this.f9053d.q(this.c);
    }

    public void i() {
        try {
            wait();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }
}
