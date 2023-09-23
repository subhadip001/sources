package k.c0.h;

import f.n.a.n.i;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import k.a0;
import k.q;
import k.r;
import k.t;
import k.v;
import k.y;
import l.h;
import l.l;
import l.o;
import l.x;
import l.y;
import l.z;

/* compiled from: Http1Codec.java */
/* loaded from: classes2.dex */
public final class a implements k.c0.g.c {
    public final t a;
    public final k.c0.f.f b;
    public final h c;

    /* renamed from: d  reason: collision with root package name */
    public final l.g f8949d;

    /* renamed from: e  reason: collision with root package name */
    public int f8950e = 0;

    /* renamed from: f  reason: collision with root package name */
    public long f8951f = 262144;

    /* compiled from: Http1Codec.java */
    /* loaded from: classes2.dex */
    public abstract class b implements y {

        /* renamed from: f  reason: collision with root package name */
        public final l f8952f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f8953g;

        /* renamed from: h  reason: collision with root package name */
        public long f8954h = 0;

        public b(C0231a c0231a) {
            this.f8952f = new l(a.this.c.d());
        }

        public final void a(boolean z, IOException iOException) {
            a aVar = a.this;
            int i2 = aVar.f8950e;
            if (i2 == 6) {
                return;
            }
            if (i2 == 5) {
                aVar.g(this.f8952f);
                a aVar2 = a.this;
                aVar2.f8950e = 6;
                k.c0.f.f fVar = aVar2.b;
                if (fVar != null) {
                    fVar.i(!z, aVar2, this.f8954h, iOException);
                    return;
                }
                return;
            }
            StringBuilder A = f.a.b.a.a.A("state: ");
            A.append(a.this.f8950e);
            throw new IllegalStateException(A.toString());
        }

        @Override // l.y
        public long a0(l.f fVar, long j2) {
            try {
                long a0 = a.this.c.a0(fVar, j2);
                if (a0 > 0) {
                    this.f8954h += a0;
                }
                return a0;
            } catch (IOException e2) {
                a(false, e2);
                throw e2;
            }
        }

        @Override // l.y
        public z d() {
            return this.f8952f;
        }
    }

    /* compiled from: Http1Codec.java */
    /* loaded from: classes2.dex */
    public final class c implements x {

        /* renamed from: f  reason: collision with root package name */
        public final l f8956f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f8957g;

        public c() {
            this.f8956f = new l(a.this.f8949d.d());
        }

        @Override // l.x
        public void J(l.f fVar, long j2) {
            if (this.f8957g) {
                throw new IllegalStateException("closed");
            }
            if (j2 == 0) {
                return;
            }
            a.this.f8949d.K(j2);
            a.this.f8949d.D("\r\n");
            a.this.f8949d.J(fVar, j2);
            a.this.f8949d.D("\r\n");
        }

        @Override // l.x, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f8957g) {
                return;
            }
            this.f8957g = true;
            a.this.f8949d.D("0\r\n\r\n");
            a.this.g(this.f8956f);
            a.this.f8950e = 3;
        }

        @Override // l.x
        public z d() {
            return this.f8956f;
        }

        @Override // l.x, java.io.Flushable
        public synchronized void flush() {
            if (this.f8957g) {
                return;
            }
            a.this.f8949d.flush();
        }
    }

    /* compiled from: Http1Codec.java */
    /* loaded from: classes2.dex */
    public class d extends b {

        /* renamed from: j  reason: collision with root package name */
        public final r f8959j;

        /* renamed from: k  reason: collision with root package name */
        public long f8960k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f8961l;

        public d(r rVar) {
            super(null);
            this.f8960k = -1L;
            this.f8961l = true;
            this.f8959j = rVar;
        }

        @Override // k.c0.h.a.b, l.y
        public long a0(l.f fVar, long j2) {
            if (j2 >= 0) {
                if (!this.f8953g) {
                    if (this.f8961l) {
                        long j3 = this.f8960k;
                        if (j3 == 0 || j3 == -1) {
                            if (j3 != -1) {
                                a.this.c.Q();
                            }
                            try {
                                this.f8960k = a.this.c.n0();
                                String trim = a.this.c.Q().trim();
                                if (this.f8960k >= 0 && (trim.isEmpty() || trim.startsWith(";"))) {
                                    if (this.f8960k == 0) {
                                        this.f8961l = false;
                                        a aVar = a.this;
                                        k.c0.g.e.d(aVar.a.f9158m, this.f8959j, aVar.j());
                                        a(true, null);
                                    }
                                    if (!this.f8961l) {
                                        return -1L;
                                    }
                                } else {
                                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f8960k + trim + "\"");
                                }
                            } catch (NumberFormatException e2) {
                                throw new ProtocolException(e2.getMessage());
                            }
                        }
                        long a0 = super.a0(fVar, Math.min(j2, this.f8960k));
                        if (a0 != -1) {
                            this.f8960k -= a0;
                            return a0;
                        }
                        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                        a(false, protocolException);
                        throw protocolException;
                    }
                    return -1L;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException(f.a.b.a.a.l("byteCount < 0: ", j2));
        }

        @Override // l.y, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f8953g) {
                return;
            }
            if (this.f8961l && !k.c0.c.j(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.f8953g = true;
        }
    }

    /* compiled from: Http1Codec.java */
    /* loaded from: classes2.dex */
    public final class e implements x {

        /* renamed from: f  reason: collision with root package name */
        public final l f8963f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f8964g;

        /* renamed from: h  reason: collision with root package name */
        public long f8965h;

        public e(long j2) {
            this.f8963f = new l(a.this.f8949d.d());
            this.f8965h = j2;
        }

        @Override // l.x
        public void J(l.f fVar, long j2) {
            if (!this.f8964g) {
                k.c0.c.c(fVar.f9230g, 0L, j2);
                if (j2 <= this.f8965h) {
                    a.this.f8949d.J(fVar, j2);
                    this.f8965h -= j2;
                    return;
                }
                StringBuilder A = f.a.b.a.a.A("expected ");
                A.append(this.f8965h);
                A.append(" bytes but received ");
                A.append(j2);
                throw new ProtocolException(A.toString());
            }
            throw new IllegalStateException("closed");
        }

        @Override // l.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f8964g) {
                return;
            }
            this.f8964g = true;
            if (this.f8965h <= 0) {
                a.this.g(this.f8963f);
                a.this.f8950e = 3;
                return;
            }
            throw new ProtocolException("unexpected end of stream");
        }

        @Override // l.x
        public z d() {
            return this.f8963f;
        }

        @Override // l.x, java.io.Flushable
        public void flush() {
            if (this.f8964g) {
                return;
            }
            a.this.f8949d.flush();
        }
    }

    /* compiled from: Http1Codec.java */
    /* loaded from: classes2.dex */
    public class f extends b {

        /* renamed from: j  reason: collision with root package name */
        public long f8967j;

        public f(a aVar, long j2) {
            super(null);
            this.f8967j = j2;
            if (j2 == 0) {
                a(true, null);
            }
        }

        @Override // k.c0.h.a.b, l.y
        public long a0(l.f fVar, long j2) {
            if (j2 >= 0) {
                if (!this.f8953g) {
                    long j3 = this.f8967j;
                    if (j3 == 0) {
                        return -1L;
                    }
                    long a0 = super.a0(fVar, Math.min(j3, j2));
                    if (a0 != -1) {
                        long j4 = this.f8967j - a0;
                        this.f8967j = j4;
                        if (j4 == 0) {
                            a(true, null);
                        }
                        return a0;
                    }
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    a(false, protocolException);
                    throw protocolException;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException(f.a.b.a.a.l("byteCount < 0: ", j2));
        }

        @Override // l.y, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f8953g) {
                return;
            }
            if (this.f8967j != 0 && !k.c0.c.j(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.f8953g = true;
        }
    }

    /* compiled from: Http1Codec.java */
    /* loaded from: classes2.dex */
    public class g extends b {

        /* renamed from: j  reason: collision with root package name */
        public boolean f8968j;

        public g(a aVar) {
            super(null);
        }

        @Override // k.c0.h.a.b, l.y
        public long a0(l.f fVar, long j2) {
            if (j2 >= 0) {
                if (!this.f8953g) {
                    if (this.f8968j) {
                        return -1L;
                    }
                    long a0 = super.a0(fVar, j2);
                    if (a0 == -1) {
                        this.f8968j = true;
                        a(true, null);
                        return -1L;
                    }
                    return a0;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException(f.a.b.a.a.l("byteCount < 0: ", j2));
        }

        @Override // l.y, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f8953g) {
                return;
            }
            if (!this.f8968j) {
                a(false, null);
            }
            this.f8953g = true;
        }
    }

    public a(t tVar, k.c0.f.f fVar, h hVar, l.g gVar) {
        this.a = tVar;
        this.b = fVar;
        this.c = hVar;
        this.f8949d = gVar;
    }

    @Override // k.c0.g.c
    public void a() {
        this.f8949d.flush();
    }

    @Override // k.c0.g.c
    public void b(v vVar) {
        Proxy.Type type = this.b.b().c.b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(vVar.b);
        sb.append(' ');
        if (!vVar.a.a.equals("https") && type == Proxy.Type.HTTP) {
            sb.append(vVar.a);
        } else {
            sb.append(i.S(vVar.a));
        }
        sb.append(" HTTP/1.1");
        k(vVar.c, sb.toString());
    }

    @Override // k.c0.g.c
    public a0 c(k.y yVar) {
        Objects.requireNonNull(this.b.f8929f);
        String a = yVar.f9185k.a("Content-Type");
        if (a == null) {
            a = null;
        }
        if (!k.c0.g.e.b(yVar)) {
            y h2 = h(0L);
            Logger logger = o.a;
            return new k.c0.g.g(a, 0L, new l.t(h2));
        }
        String a2 = yVar.f9185k.a("Transfer-Encoding");
        if ("chunked".equalsIgnoreCase(a2 != null ? a2 : null)) {
            r rVar = yVar.f9180f.a;
            if (this.f8950e == 4) {
                this.f8950e = 5;
                d dVar = new d(rVar);
                Logger logger2 = o.a;
                return new k.c0.g.g(a, -1L, new l.t(dVar));
            }
            StringBuilder A = f.a.b.a.a.A("state: ");
            A.append(this.f8950e);
            throw new IllegalStateException(A.toString());
        }
        long a3 = k.c0.g.e.a(yVar);
        if (a3 != -1) {
            y h3 = h(a3);
            Logger logger3 = o.a;
            return new k.c0.g.g(a, a3, new l.t(h3));
        } else if (this.f8950e == 4) {
            k.c0.f.f fVar = this.b;
            if (fVar != null) {
                this.f8950e = 5;
                fVar.f();
                g gVar = new g(this);
                Logger logger4 = o.a;
                return new k.c0.g.g(a, -1L, new l.t(gVar));
            }
            throw new IllegalStateException("streamAllocation == null");
        } else {
            StringBuilder A2 = f.a.b.a.a.A("state: ");
            A2.append(this.f8950e);
            throw new IllegalStateException(A2.toString());
        }
    }

    @Override // k.c0.g.c
    public y.a d(boolean z) {
        int i2 = this.f8950e;
        if (i2 != 1 && i2 != 3) {
            StringBuilder A = f.a.b.a.a.A("state: ");
            A.append(this.f8950e);
            throw new IllegalStateException(A.toString());
        }
        try {
            k.c0.g.i a = k.c0.g.i.a(i());
            y.a aVar = new y.a();
            aVar.b = a.a;
            aVar.c = a.b;
            aVar.f9188d = a.c;
            aVar.d(j());
            if (z && a.b == 100) {
                return null;
            }
            if (a.b == 100) {
                this.f8950e = 3;
                return aVar;
            }
            this.f8950e = 4;
            return aVar;
        } catch (EOFException e2) {
            StringBuilder A2 = f.a.b.a.a.A("unexpected end of stream on ");
            A2.append(this.b);
            IOException iOException = new IOException(A2.toString());
            iOException.initCause(e2);
            throw iOException;
        }
    }

    @Override // k.c0.g.c
    public void e() {
        this.f8949d.flush();
    }

    @Override // k.c0.g.c
    public x f(v vVar, long j2) {
        if ("chunked".equalsIgnoreCase(vVar.c.a("Transfer-Encoding"))) {
            if (this.f8950e == 1) {
                this.f8950e = 2;
                return new c();
            }
            StringBuilder A = f.a.b.a.a.A("state: ");
            A.append(this.f8950e);
            throw new IllegalStateException(A.toString());
        } else if (j2 != -1) {
            if (this.f8950e == 1) {
                this.f8950e = 2;
                return new e(j2);
            }
            StringBuilder A2 = f.a.b.a.a.A("state: ");
            A2.append(this.f8950e);
            throw new IllegalStateException(A2.toString());
        } else {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    public void g(l lVar) {
        z zVar = lVar.f9238e;
        lVar.f9238e = z.f9266d;
        zVar.a();
        zVar.b();
    }

    public l.y h(long j2) {
        if (this.f8950e == 4) {
            this.f8950e = 5;
            return new f(this, j2);
        }
        StringBuilder A = f.a.b.a.a.A("state: ");
        A.append(this.f8950e);
        throw new IllegalStateException(A.toString());
    }

    public final String i() {
        String A = this.c.A(this.f8951f);
        this.f8951f -= A.length();
        return A;
    }

    public q j() {
        q.a aVar = new q.a();
        while (true) {
            String i2 = i();
            if (i2.length() != 0) {
                Objects.requireNonNull((t.a) k.c0.a.a);
                aVar.a(i2);
            } else {
                return new q(aVar);
            }
        }
    }

    public void k(q qVar, String str) {
        if (this.f8950e == 0) {
            this.f8949d.D(str).D("\r\n");
            int d2 = qVar.d();
            for (int i2 = 0; i2 < d2; i2++) {
                this.f8949d.D(qVar.b(i2)).D(": ").D(qVar.e(i2)).D("\r\n");
            }
            this.f8949d.D("\r\n");
            this.f8950e = 1;
            return;
        }
        StringBuilder A = f.a.b.a.a.A("state: ");
        A.append(this.f8950e);
        throw new IllegalStateException(A.toString());
    }
}
