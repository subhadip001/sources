package g.a.w0;

import g.a.v0.k2;
import g.a.w0.b;
import java.io.IOException;
import java.net.Socket;
import java.util.Objects;
import java.util.Queue;
import l.x;
import l.z;

/* compiled from: AsyncSink.java */
/* loaded from: classes2.dex */
public final class a implements x {

    /* renamed from: h  reason: collision with root package name */
    public final k2 f7988h;

    /* renamed from: i  reason: collision with root package name */
    public final b.a f7989i;

    /* renamed from: m  reason: collision with root package name */
    public x f7993m;
    public Socket n;

    /* renamed from: f  reason: collision with root package name */
    public final Object f7986f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public final l.f f7987g = new l.f();

    /* renamed from: j  reason: collision with root package name */
    public boolean f7990j = false;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7991k = false;

    /* renamed from: l  reason: collision with root package name */
    public boolean f7992l = false;

    /* compiled from: AsyncSink.java */
    /* renamed from: g.a.w0.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0199a extends d {

        /* renamed from: g  reason: collision with root package name */
        public final g.b.b f7994g;

        public C0199a() {
            super(null);
            g.b.c.a();
            this.f7994g = g.b.a.b;
        }

        @Override // g.a.w0.a.d
        public void a() {
            a aVar;
            Objects.requireNonNull(g.b.c.a);
            l.f fVar = new l.f();
            try {
                synchronized (a.this.f7986f) {
                    l.f fVar2 = a.this.f7987g;
                    fVar.J(fVar2, fVar2.f());
                    aVar = a.this;
                    aVar.f7990j = false;
                }
                aVar.f7993m.J(fVar, fVar.f9230g);
            } catch (Throwable th) {
                Objects.requireNonNull(g.b.c.a);
                throw th;
            }
        }
    }

    /* compiled from: AsyncSink.java */
    /* loaded from: classes2.dex */
    public class b extends d {

        /* renamed from: g  reason: collision with root package name */
        public final g.b.b f7996g;

        public b() {
            super(null);
            g.b.c.a();
            this.f7996g = g.b.a.b;
        }

        @Override // g.a.w0.a.d
        public void a() {
            a aVar;
            Objects.requireNonNull(g.b.c.a);
            l.f fVar = new l.f();
            try {
                synchronized (a.this.f7986f) {
                    l.f fVar2 = a.this.f7987g;
                    fVar.J(fVar2, fVar2.f9230g);
                    aVar = a.this;
                    aVar.f7991k = false;
                }
                aVar.f7993m.J(fVar, fVar.f9230g);
                a.this.f7993m.flush();
            } catch (Throwable th) {
                Objects.requireNonNull(g.b.c.a);
                throw th;
            }
        }
    }

    /* compiled from: AsyncSink.java */
    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Objects.requireNonNull(a.this.f7987g);
            try {
                x xVar = a.this.f7993m;
                if (xVar != null) {
                    xVar.close();
                }
            } catch (IOException e2) {
                a.this.f7989i.a(e2);
            }
            try {
                Socket socket = a.this.n;
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e3) {
                a.this.f7989i.a(e3);
            }
        }
    }

    /* compiled from: AsyncSink.java */
    /* loaded from: classes2.dex */
    public abstract class d implements Runnable {
        public d(C0199a c0199a) {
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (a.this.f7993m != null) {
                    a();
                    return;
                }
                throw new IOException("Unable to perform write due to unavailable sink.");
            } catch (Exception e2) {
                a.this.f7989i.a(e2);
            }
        }
    }

    public a(k2 k2Var, b.a aVar) {
        f.h.b.c.a.x(k2Var, "executor");
        this.f7988h = k2Var;
        f.h.b.c.a.x(aVar, "exceptionHandler");
        this.f7989i = aVar;
    }

    @Override // l.x
    public void J(l.f fVar, long j2) {
        f.h.b.c.a.x(fVar, "source");
        if (!this.f7992l) {
            g.b.a aVar = g.b.c.a;
            Objects.requireNonNull(aVar);
            try {
                synchronized (this.f7986f) {
                    this.f7987g.J(fVar, j2);
                    if (!this.f7990j && !this.f7991k && this.f7987g.f() > 0) {
                        this.f7990j = true;
                        k2 k2Var = this.f7988h;
                        C0199a c0199a = new C0199a();
                        Queue<Runnable> queue = k2Var.f7829g;
                        f.h.b.c.a.x(c0199a, "'r' must not be null.");
                        queue.add(c0199a);
                        k2Var.c(c0199a);
                        Objects.requireNonNull(aVar);
                        return;
                    }
                    Objects.requireNonNull(aVar);
                    return;
                }
            } catch (Throwable th) {
                Objects.requireNonNull(g.b.c.a);
                throw th;
            }
        }
        throw new IOException("closed");
    }

    public void a(x xVar, Socket socket) {
        f.h.b.c.a.C(this.f7993m == null, "AsyncSink's becomeConnected should only be called once.");
        f.h.b.c.a.x(xVar, "sink");
        this.f7993m = xVar;
        f.h.b.c.a.x(socket, "socket");
        this.n = socket;
    }

    @Override // l.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f7992l) {
            return;
        }
        this.f7992l = true;
        k2 k2Var = this.f7988h;
        c cVar = new c();
        Queue<Runnable> queue = k2Var.f7829g;
        f.h.b.c.a.x(cVar, "'r' must not be null.");
        queue.add(cVar);
        k2Var.c(cVar);
    }

    @Override // l.x
    public z d() {
        return z.f9266d;
    }

    @Override // l.x, java.io.Flushable
    public void flush() {
        if (!this.f7992l) {
            g.b.a aVar = g.b.c.a;
            Objects.requireNonNull(aVar);
            try {
                synchronized (this.f7986f) {
                    if (this.f7991k) {
                        Objects.requireNonNull(aVar);
                        return;
                    }
                    this.f7991k = true;
                    k2 k2Var = this.f7988h;
                    b bVar = new b();
                    Queue<Runnable> queue = k2Var.f7829g;
                    f.h.b.c.a.x(bVar, "'r' must not be null.");
                    queue.add(bVar);
                    k2Var.c(bVar);
                    Objects.requireNonNull(aVar);
                    return;
                }
            } catch (Throwable th) {
                Objects.requireNonNull(g.b.c.a);
                throw th;
            }
        }
        throw new IOException("closed");
    }
}
