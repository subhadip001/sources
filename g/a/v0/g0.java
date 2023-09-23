package g.a.v0;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import g.a.v0.t2;
import io.grpc.Status;
import io.grpc.internal.ClientStreamListener;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DelayedStream.java */
/* loaded from: classes2.dex */
public class g0 implements v {
    public volatile boolean a;
    public ClientStreamListener b;
    public v c;

    /* renamed from: d  reason: collision with root package name */
    public Status f7697d;

    /* renamed from: e  reason: collision with root package name */
    public List<Runnable> f7698e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public o f7699f;

    /* renamed from: g  reason: collision with root package name */
    public long f7700g;

    /* renamed from: h  reason: collision with root package name */
    public long f7701h;

    /* compiled from: DelayedStream.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f7702f;

        public a(int i2) {
            this.f7702f = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            g0.this.c.f(this.f7702f);
        }
    }

    /* compiled from: DelayedStream.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g0.this.c.c();
        }
    }

    /* compiled from: DelayedStream.java */
    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ g.a.j f7705f;

        public c(g.a.j jVar) {
            this.f7705f = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g0.this.c.a(this.f7705f);
        }
    }

    /* compiled from: DelayedStream.java */
    /* loaded from: classes2.dex */
    public class d implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ boolean f7707f;

        public d(boolean z) {
            this.f7707f = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            g0.this.c.p(this.f7707f);
        }
    }

    /* compiled from: DelayedStream.java */
    /* loaded from: classes2.dex */
    public class e implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ g.a.p f7709f;

        public e(g.a.p pVar) {
            this.f7709f = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g0.this.c.i(this.f7709f);
        }
    }

    /* compiled from: DelayedStream.java */
    /* loaded from: classes2.dex */
    public class f implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f7711f;

        public f(int i2) {
            this.f7711f = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            g0.this.c.g(this.f7711f);
        }
    }

    /* compiled from: DelayedStream.java */
    /* loaded from: classes2.dex */
    public class g implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f7713f;

        public g(int i2) {
            this.f7713f = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            g0.this.c.h(this.f7713f);
        }
    }

    /* compiled from: DelayedStream.java */
    /* loaded from: classes2.dex */
    public class h implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ g.a.n f7715f;

        public h(g.a.n nVar) {
            this.f7715f = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g0.this.c.n(this.f7715f);
        }
    }

    /* compiled from: DelayedStream.java */
    /* loaded from: classes2.dex */
    public class i implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f7717f;

        public i(String str) {
            this.f7717f = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            g0.this.c.k(this.f7717f);
        }
    }

    /* compiled from: DelayedStream.java */
    /* loaded from: classes2.dex */
    public class j implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ClientStreamListener f7719f;

        public j(ClientStreamListener clientStreamListener) {
            this.f7719f = clientStreamListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            g0.this.c.o(this.f7719f);
        }
    }

    /* compiled from: DelayedStream.java */
    /* loaded from: classes2.dex */
    public class k implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ InputStream f7721f;

        public k(InputStream inputStream) {
            this.f7721f = inputStream;
        }

        @Override // java.lang.Runnable
        public void run() {
            g0.this.c.b(this.f7721f);
        }
    }

    /* compiled from: DelayedStream.java */
    /* loaded from: classes2.dex */
    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g0.this.c.flush();
        }
    }

    /* compiled from: DelayedStream.java */
    /* loaded from: classes2.dex */
    public class m implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Status f7724f;

        public m(Status status) {
            this.f7724f = status;
        }

        @Override // java.lang.Runnable
        public void run() {
            g0.this.c.j(this.f7724f);
        }
    }

    /* compiled from: DelayedStream.java */
    /* loaded from: classes2.dex */
    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g0.this.c.m();
        }
    }

    /* compiled from: DelayedStream.java */
    /* loaded from: classes2.dex */
    public static class o implements ClientStreamListener {
        public final ClientStreamListener a;
        public volatile boolean b;
        public List<Runnable> c = new ArrayList();

        /* compiled from: DelayedStream.java */
        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ t2.a f7727f;

            public a(t2.a aVar) {
                this.f7727f = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.a.a(this.f7727f);
            }
        }

        /* compiled from: DelayedStream.java */
        /* loaded from: classes2.dex */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.a.b();
            }
        }

        /* compiled from: DelayedStream.java */
        /* loaded from: classes2.dex */
        public class c implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ g.a.i0 f7730f;

            public c(g.a.i0 i0Var) {
                this.f7730f = i0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.a.d(this.f7730f);
            }
        }

        /* compiled from: DelayedStream.java */
        /* loaded from: classes2.dex */
        public class d implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ Status f7732f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ g.a.i0 f7733g;

            public d(Status status, g.a.i0 i0Var) {
                this.f7732f = status;
                this.f7733g = i0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.a.c(this.f7732f, this.f7733g);
            }
        }

        /* compiled from: DelayedStream.java */
        /* loaded from: classes2.dex */
        public class e implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ Status f7735f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ ClientStreamListener.RpcProgress f7736g;

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ g.a.i0 f7737h;

            public e(Status status, ClientStreamListener.RpcProgress rpcProgress, g.a.i0 i0Var) {
                this.f7735f = status;
                this.f7736g = rpcProgress;
                this.f7737h = i0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.a.e(this.f7735f, this.f7736g, this.f7737h);
            }
        }

        public o(ClientStreamListener clientStreamListener) {
            this.a = clientStreamListener;
        }

        @Override // g.a.v0.t2
        public void a(t2.a aVar) {
            if (this.b) {
                this.a.a(aVar);
            } else {
                f(new a(aVar));
            }
        }

        @Override // g.a.v0.t2
        public void b() {
            if (this.b) {
                this.a.b();
            } else {
                f(new b());
            }
        }

        @Override // io.grpc.internal.ClientStreamListener
        public void c(Status status, g.a.i0 i0Var) {
            f(new d(status, i0Var));
        }

        @Override // io.grpc.internal.ClientStreamListener
        public void d(g.a.i0 i0Var) {
            f(new c(i0Var));
        }

        @Override // io.grpc.internal.ClientStreamListener
        public void e(Status status, ClientStreamListener.RpcProgress rpcProgress, g.a.i0 i0Var) {
            f(new e(status, rpcProgress, i0Var));
        }

        public final void f(Runnable runnable) {
            synchronized (this) {
                if (!this.b) {
                    this.c.add(runnable);
                } else {
                    runnable.run();
                }
            }
        }
    }

    @Override // g.a.v0.s2
    public void a(g.a.j jVar) {
        f.h.b.c.a.x(jVar, "compressor");
        d(new c(jVar));
    }

    @Override // g.a.v0.s2
    public void b(InputStream inputStream) {
        f.h.b.c.a.x(inputStream, "message");
        if (this.a) {
            this.c.b(inputStream);
        } else {
            d(new k(inputStream));
        }
    }

    @Override // g.a.v0.s2
    public void c() {
        d(new b());
    }

    public final void d(Runnable runnable) {
        synchronized (this) {
            if (!this.a) {
                this.f7698e.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
        if (r0.hasNext() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r6)
            java.util.List<java.lang.Runnable> r1 = r6.f7698e     // Catch: java.lang.Throwable -> L6d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L4f
            r0 = 0
            r6.f7698e = r0     // Catch: java.lang.Throwable -> L6d
            r1 = 1
            r6.a = r1     // Catch: java.lang.Throwable -> L6d
            g.a.v0.g0$o r2 = r6.f7699f     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L4e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L1e:
            monitor-enter(r2)
            java.util.List<java.lang.Runnable> r4 = r2.c     // Catch: java.lang.Throwable -> L4b
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L2d
            r2.c = r0     // Catch: java.lang.Throwable -> L4b
            r2.b = r1     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            goto L4e
        L2d:
            java.util.List<java.lang.Runnable> r4 = r2.c     // Catch: java.lang.Throwable -> L4b
            r2.c = r3     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            java.util.Iterator r3 = r4.iterator()
        L36:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L46
            java.lang.Object r5 = r3.next()
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r5.run()
            goto L36
        L46:
            r4.clear()
            r3 = r4
            goto L1e
        L4b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            throw r0
        L4e:
            return
        L4f:
            java.util.List<java.lang.Runnable> r1 = r6.f7698e     // Catch: java.lang.Throwable -> L6d
            r6.f7698e = r0     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r0 = r1.iterator()
        L58:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L58
        L68:
            r1.clear()
            r0 = r1
            goto L5
        L6d:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.v0.g0.e():void");
    }

    @Override // g.a.v0.s2
    public void f(int i2) {
        if (this.a) {
            this.c.f(i2);
        } else {
            d(new a(i2));
        }
    }

    @Override // g.a.v0.s2
    public void flush() {
        if (this.a) {
            this.c.flush();
        } else {
            d(new l());
        }
    }

    @Override // g.a.v0.v
    public void g(int i2) {
        if (this.a) {
            this.c.g(i2);
        } else {
            d(new f(i2));
        }
    }

    @Override // g.a.v0.v
    public void h(int i2) {
        if (this.a) {
            this.c.h(i2);
        } else {
            d(new g(i2));
        }
    }

    @Override // g.a.v0.v
    public void i(g.a.p pVar) {
        f.h.b.c.a.x(pVar, "decompressorRegistry");
        d(new e(pVar));
    }

    @Override // g.a.v0.v
    public void j(Status status) {
        boolean z;
        ClientStreamListener clientStreamListener;
        f.h.b.c.a.x(status, "reason");
        synchronized (this) {
            if (this.c == null) {
                q(x1.a);
                z = false;
                clientStreamListener = this.b;
                this.f7697d = status;
            } else {
                z = true;
                clientStreamListener = null;
            }
        }
        if (z) {
            d(new m(status));
            return;
        }
        if (clientStreamListener != null) {
            clientStreamListener.c(status, new g.a.i0());
        }
        e();
    }

    @Override // g.a.v0.v
    public void k(String str) {
        f.h.b.c.a.C(this.b == null, "May only be called before start");
        f.h.b.c.a.x(str, "authority");
        d(new i(str));
    }

    @Override // g.a.v0.v
    public void l(a1 a1Var) {
        synchronized (this) {
            if (this.b == null) {
                return;
            }
            if (this.c != null) {
                a1Var.b("buffered_nanos", Long.valueOf(this.f7701h - this.f7700g));
                this.c.l(a1Var);
            } else {
                a1Var.b("buffered_nanos", Long.valueOf(System.nanoTime() - this.f7700g));
                a1Var.a.add("waiting_for_connection");
            }
        }
    }

    @Override // g.a.v0.v
    public void m() {
        d(new n());
    }

    @Override // g.a.v0.v
    public void n(g.a.n nVar) {
        d(new h(nVar));
    }

    @Override // g.a.v0.v
    public void o(ClientStreamListener clientStreamListener) {
        Status status;
        boolean z;
        f.h.b.c.a.C(this.b == null, "already started");
        synchronized (this) {
            f.h.b.c.a.x(clientStreamListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.b = clientStreamListener;
            status = this.f7697d;
            z = this.a;
            if (!z) {
                o oVar = new o(clientStreamListener);
                this.f7699f = oVar;
                clientStreamListener = oVar;
            }
            this.f7700g = System.nanoTime();
        }
        if (status != null) {
            clientStreamListener.c(status, new g.a.i0());
        } else if (z) {
            this.c.o(clientStreamListener);
        } else {
            d(new j(clientStreamListener));
        }
    }

    @Override // g.a.v0.v
    public void p(boolean z) {
        d(new d(z));
    }

    public final void q(v vVar) {
        v vVar2 = this.c;
        f.h.b.c.a.D(vVar2 == null, "realStream already set to %s", vVar2);
        this.c = vVar;
        this.f7701h = System.nanoTime();
    }

    public final void r(v vVar) {
        synchronized (this) {
            if (this.c != null) {
                return;
            }
            f.h.b.c.a.x(vVar, "stream");
            q(vVar);
            e();
        }
    }
}
