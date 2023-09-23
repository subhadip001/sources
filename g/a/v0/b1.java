package g.a.v0;

import g.a.t0;
import g.a.v0.j0;
import g.a.v0.l;
import g.a.v0.u1;
import g.a.v0.x;
import io.grpc.ChannelLogger;
import io.grpc.ConnectivityState;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.internal.ClientStreamListener;
import java.net.SocketAddress;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: InternalSubchannel.java */
/* loaded from: classes2.dex */
public final class b1 implements g.a.x<Object>, w2 {
    public final g.a.y a;
    public final String b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final l.a f7602d;

    /* renamed from: e  reason: collision with root package name */
    public final e f7603e;

    /* renamed from: f  reason: collision with root package name */
    public final x f7604f;

    /* renamed from: g  reason: collision with root package name */
    public final ScheduledExecutorService f7605g;

    /* renamed from: h  reason: collision with root package name */
    public final g.a.v f7606h;

    /* renamed from: i  reason: collision with root package name */
    public final n f7607i;

    /* renamed from: j  reason: collision with root package name */
    public final ChannelLogger f7608j;

    /* renamed from: k  reason: collision with root package name */
    public final g.a.t0 f7609k;

    /* renamed from: l  reason: collision with root package name */
    public final f f7610l;

    /* renamed from: m  reason: collision with root package name */
    public volatile List<g.a.r> f7611m;
    public l n;
    public final f.h.c.a.o o;
    public t0.c p;
    public t0.c q;
    public u1 r;
    public z u;
    public volatile u1 v;
    public Status x;
    public final Collection<z> s = new ArrayList();
    public final z0<z> t = new a();
    public volatile g.a.l w = g.a.l.a(ConnectivityState.IDLE);

    /* compiled from: InternalSubchannel.java */
    /* loaded from: classes2.dex */
    public class a extends z0<z> {
        public a() {
        }

        @Override // g.a.v0.z0
        public void a() {
            b1 b1Var = b1.this;
            m1.this.Z.c(b1Var, true);
        }

        @Override // g.a.v0.z0
        public void b() {
            b1 b1Var = b1.this;
            m1.this.Z.c(b1Var, false);
        }
    }

    /* compiled from: InternalSubchannel.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b1.this.w.a == ConnectivityState.IDLE) {
                b1.this.f7608j.a(ChannelLogger.ChannelLogLevel.INFO, "CONNECTING as requested");
                b1.h(b1.this, ConnectivityState.CONNECTING);
                b1.i(b1.this);
            }
        }
    }

    /* compiled from: InternalSubchannel.java */
    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Status f7613f;

        public c(Status status) {
            this.f7613f = status;
        }

        @Override // java.lang.Runnable
        public void run() {
            ConnectivityState connectivityState = b1.this.w.a;
            ConnectivityState connectivityState2 = ConnectivityState.SHUTDOWN;
            if (connectivityState == connectivityState2) {
                return;
            }
            b1 b1Var = b1.this;
            b1Var.x = this.f7613f;
            u1 u1Var = b1Var.v;
            b1 b1Var2 = b1.this;
            z zVar = b1Var2.u;
            b1Var2.v = null;
            b1 b1Var3 = b1.this;
            b1Var3.u = null;
            b1Var3.f7609k.d();
            b1Var3.j(g.a.l.a(connectivityState2));
            b1.this.f7610l.b();
            if (b1.this.s.isEmpty()) {
                b1 b1Var4 = b1.this;
                g.a.t0 t0Var = b1Var4.f7609k;
                e1 e1Var = new e1(b1Var4);
                Queue<Runnable> queue = t0Var.f7561g;
                f.h.b.c.a.x(e1Var, "runnable is null");
                queue.add(e1Var);
                t0Var.a();
            }
            b1 b1Var5 = b1.this;
            b1Var5.f7609k.d();
            t0.c cVar = b1Var5.p;
            if (cVar != null) {
                cVar.a();
                b1Var5.p = null;
                b1Var5.n = null;
            }
            t0.c cVar2 = b1.this.q;
            if (cVar2 != null) {
                cVar2.a();
                b1.this.r.b(this.f7613f);
                b1 b1Var6 = b1.this;
                b1Var6.q = null;
                b1Var6.r = null;
            }
            if (u1Var != null) {
                u1Var.b(this.f7613f);
            }
            if (zVar != null) {
                zVar.b(this.f7613f);
            }
        }
    }

    /* compiled from: InternalSubchannel.java */
    /* loaded from: classes2.dex */
    public static final class d extends o0 {
        public final z a;
        public final n b;

        /* compiled from: InternalSubchannel.java */
        /* loaded from: classes2.dex */
        public class a extends m0 {
            public final /* synthetic */ v a;

            /* compiled from: InternalSubchannel.java */
            /* renamed from: g.a.v0.b1$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public class C0196a extends n0 {
                public final /* synthetic */ ClientStreamListener a;

                public C0196a(ClientStreamListener clientStreamListener) {
                    this.a = clientStreamListener;
                }

                @Override // io.grpc.internal.ClientStreamListener
                public void c(Status status, g.a.i0 i0Var) {
                    d.this.b.a(status.f());
                    this.a.c(status, i0Var);
                }

                @Override // io.grpc.internal.ClientStreamListener
                public void e(Status status, ClientStreamListener.RpcProgress rpcProgress, g.a.i0 i0Var) {
                    d.this.b.a(status.f());
                    this.a.e(status, rpcProgress, i0Var);
                }
            }

            public a(v vVar) {
                this.a = vVar;
            }

            @Override // g.a.v0.v
            public void o(ClientStreamListener clientStreamListener) {
                n nVar = d.this.b;
                nVar.b.add(1L);
                nVar.a.a();
                this.a.o(new C0196a(clientStreamListener));
            }
        }

        public d(z zVar, n nVar, a aVar) {
            this.a = zVar;
            this.b = nVar;
        }

        @Override // g.a.v0.o0
        public z a() {
            return this.a;
        }

        @Override // g.a.v0.w
        public v g(MethodDescriptor<?, ?> methodDescriptor, g.a.i0 i0Var, g.a.b bVar) {
            return new a(a().g(methodDescriptor, i0Var, bVar));
        }
    }

    /* compiled from: InternalSubchannel.java */
    /* loaded from: classes2.dex */
    public static abstract class e {
    }

    /* compiled from: InternalSubchannel.java */
    /* loaded from: classes2.dex */
    public static final class f {
        public List<g.a.r> a;
        public int b;
        public int c;

        public f(List<g.a.r> list) {
            this.a = list;
        }

        public SocketAddress a() {
            return this.a.get(this.b).a.get(this.c);
        }

        public void b() {
            this.b = 0;
            this.c = 0;
        }
    }

    /* compiled from: InternalSubchannel.java */
    /* loaded from: classes2.dex */
    public class g implements u1.a {
        public final z a;
        public boolean b = false;

        /* compiled from: InternalSubchannel.java */
        /* loaded from: classes2.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g gVar = g.this;
                b1 b1Var = b1.this;
                b1Var.n = null;
                if (b1Var.x != null) {
                    f.h.b.c.a.C(b1Var.v == null, "Unexpected non-null activeTransport");
                    g gVar2 = g.this;
                    gVar2.a.b(b1.this.x);
                    return;
                }
                z zVar = b1Var.u;
                z zVar2 = gVar.a;
                if (zVar == zVar2) {
                    b1Var.v = zVar2;
                    b1 b1Var2 = b1.this;
                    b1Var2.u = null;
                    ConnectivityState connectivityState = ConnectivityState.READY;
                    b1Var2.f7609k.d();
                    b1Var2.j(g.a.l.a(connectivityState));
                }
            }
        }

        /* compiled from: InternalSubchannel.java */
        /* loaded from: classes2.dex */
        public class b implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ Status f7616f;

            public b(Status status) {
                this.f7616f = status;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b1.this.w.a == ConnectivityState.SHUTDOWN) {
                    return;
                }
                u1 u1Var = b1.this.v;
                g gVar = g.this;
                z zVar = gVar.a;
                if (u1Var == zVar) {
                    b1.this.v = null;
                    b1.this.f7610l.b();
                    b1.h(b1.this, ConnectivityState.IDLE);
                    return;
                }
                b1 b1Var = b1.this;
                if (b1Var.u == zVar) {
                    f.h.b.c.a.D(b1Var.w.a == ConnectivityState.CONNECTING, "Expected state is CONNECTING, actual state is %s", b1.this.w.a);
                    f fVar = b1.this.f7610l;
                    int i2 = fVar.c + 1;
                    fVar.c = i2;
                    if (i2 >= fVar.a.get(fVar.b).a.size()) {
                        fVar.b++;
                        fVar.c = 0;
                    }
                    f fVar2 = b1.this.f7610l;
                    if (!(fVar2.b < fVar2.a.size())) {
                        b1 b1Var2 = b1.this;
                        b1Var2.u = null;
                        b1Var2.f7610l.b();
                        b1 b1Var3 = b1.this;
                        Status status = this.f7616f;
                        b1Var3.f7609k.d();
                        f.h.b.c.a.m(!status.f(), "The error status must not be OK");
                        b1Var3.j(new g.a.l(ConnectivityState.TRANSIENT_FAILURE, status));
                        if (b1Var3.n == null) {
                            Objects.requireNonNull((j0.a) b1Var3.f7602d);
                            b1Var3.n = new j0();
                        }
                        long a = ((j0) b1Var3.n).a();
                        f.h.c.a.o oVar = b1Var3.o;
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        long a2 = a - oVar.a(timeUnit);
                        b1Var3.f7608j.b(ChannelLogger.ChannelLogLevel.INFO, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", b1Var3.k(status), Long.valueOf(a2));
                        f.h.b.c.a.C(b1Var3.p == null, "previous reconnectTask is not done");
                        b1Var3.p = b1Var3.f7609k.c(new c1(b1Var3), a2, timeUnit, b1Var3.f7605g);
                        return;
                    }
                    b1.i(b1.this);
                }
            }
        }

        /* compiled from: InternalSubchannel.java */
        /* loaded from: classes2.dex */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g gVar = g.this;
                b1.this.s.remove(gVar.a);
                if (b1.this.w.a == ConnectivityState.SHUTDOWN && b1.this.s.isEmpty()) {
                    b1 b1Var = b1.this;
                    g.a.t0 t0Var = b1Var.f7609k;
                    e1 e1Var = new e1(b1Var);
                    Queue<Runnable> queue = t0Var.f7561g;
                    f.h.b.c.a.x(e1Var, "runnable is null");
                    queue.add(e1Var);
                    t0Var.a();
                }
            }
        }

        public g(z zVar, SocketAddress socketAddress) {
            this.a = zVar;
        }

        @Override // g.a.v0.u1.a
        public void a(Status status) {
            b1.this.f7608j.b(ChannelLogger.ChannelLogLevel.INFO, "{0} SHUTDOWN with {1}", this.a.e(), b1.this.k(status));
            this.b = true;
            g.a.t0 t0Var = b1.this.f7609k;
            b bVar = new b(status);
            Queue<Runnable> queue = t0Var.f7561g;
            f.h.b.c.a.x(bVar, "runnable is null");
            queue.add(bVar);
            t0Var.a();
        }

        @Override // g.a.v0.u1.a
        public void b() {
            b1.this.f7608j.a(ChannelLogger.ChannelLogLevel.INFO, "READY");
            g.a.t0 t0Var = b1.this.f7609k;
            a aVar = new a();
            Queue<Runnable> queue = t0Var.f7561g;
            f.h.b.c.a.x(aVar, "runnable is null");
            queue.add(aVar);
            t0Var.a();
        }

        @Override // g.a.v0.u1.a
        public void c() {
            f.h.b.c.a.C(this.b, "transportShutdown() must be called before transportTerminated().");
            b1.this.f7608j.b(ChannelLogger.ChannelLogLevel.INFO, "{0} Terminated", this.a.e());
            g.a.v.b(b1.this.f7606h.c, this.a);
            b1 b1Var = b1.this;
            z zVar = this.a;
            g.a.t0 t0Var = b1Var.f7609k;
            f1 f1Var = new f1(b1Var, zVar, false);
            Queue<Runnable> queue = t0Var.f7561g;
            f.h.b.c.a.x(f1Var, "runnable is null");
            queue.add(f1Var);
            t0Var.a();
            g.a.t0 t0Var2 = b1.this.f7609k;
            c cVar = new c();
            Queue<Runnable> queue2 = t0Var2.f7561g;
            f.h.b.c.a.x(cVar, "runnable is null");
            queue2.add(cVar);
            t0Var2.a();
        }

        @Override // g.a.v0.u1.a
        public void d(boolean z) {
            b1 b1Var = b1.this;
            z zVar = this.a;
            g.a.t0 t0Var = b1Var.f7609k;
            f1 f1Var = new f1(b1Var, zVar, z);
            Queue<Runnable> queue = t0Var.f7561g;
            f.h.b.c.a.x(f1Var, "runnable is null");
            queue.add(f1Var);
            t0Var.a();
        }
    }

    /* compiled from: InternalSubchannel.java */
    /* loaded from: classes2.dex */
    public static final class h extends ChannelLogger {
        public g.a.y a;

        @Override // io.grpc.ChannelLogger
        public void a(ChannelLogger.ChannelLogLevel channelLogLevel, String str) {
            g.a.y yVar = this.a;
            Level d2 = o.d(channelLogLevel);
            if (p.f7876e.isLoggable(d2)) {
                p.a(yVar, d2, str);
            }
        }

        @Override // io.grpc.ChannelLogger
        public void b(ChannelLogger.ChannelLogLevel channelLogLevel, String str, Object... objArr) {
            g.a.y yVar = this.a;
            Level d2 = o.d(channelLogLevel);
            if (p.f7876e.isLoggable(d2)) {
                p.a(yVar, d2, MessageFormat.format(str, objArr));
            }
        }
    }

    public b1(List<g.a.r> list, String str, String str2, l.a aVar, x xVar, ScheduledExecutorService scheduledExecutorService, f.h.c.a.p<f.h.c.a.o> pVar, g.a.t0 t0Var, e eVar, g.a.v vVar, n nVar, p pVar2, g.a.y yVar, ChannelLogger channelLogger) {
        f.h.b.c.a.x(list, "addressGroups");
        f.h.b.c.a.m(!list.isEmpty(), "addressGroups is empty");
        for (g.a.r rVar : list) {
            f.h.b.c.a.x(rVar, "addressGroups contains null entry");
        }
        List<g.a.r> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f7611m = unmodifiableList;
        this.f7610l = new f(unmodifiableList);
        this.b = str;
        this.c = null;
        this.f7602d = aVar;
        this.f7604f = xVar;
        this.f7605g = scheduledExecutorService;
        this.o = pVar.get();
        this.f7609k = t0Var;
        this.f7603e = eVar;
        this.f7606h = vVar;
        this.f7607i = nVar;
        f.h.b.c.a.x(pVar2, "channelTracer");
        f.h.b.c.a.x(yVar, "logId");
        this.a = yVar;
        f.h.b.c.a.x(channelLogger, "channelLogger");
        this.f7608j = channelLogger;
    }

    public static void h(b1 b1Var, ConnectivityState connectivityState) {
        b1Var.f7609k.d();
        b1Var.j(g.a.l.a(connectivityState));
    }

    public static void i(b1 b1Var) {
        SocketAddress socketAddress;
        g.a.u uVar;
        b1Var.f7609k.d();
        f.h.b.c.a.C(b1Var.p == null, "Should have no reconnectTask scheduled");
        f fVar = b1Var.f7610l;
        if (fVar.b == 0 && fVar.c == 0) {
            f.h.c.a.o oVar = b1Var.o;
            oVar.b();
            oVar.c();
        }
        SocketAddress a2 = b1Var.f7610l.a();
        if (a2 instanceof g.a.u) {
            uVar = (g.a.u) a2;
            socketAddress = uVar.f7571g;
        } else {
            socketAddress = a2;
            uVar = null;
        }
        f fVar2 = b1Var.f7610l;
        g.a.a aVar = fVar2.a.get(fVar2.b).b;
        String str = (String) aVar.a.get(g.a.r.f7559d);
        x.a aVar2 = new x.a();
        if (str == null) {
            str = b1Var.b;
        }
        f.h.b.c.a.x(str, "authority");
        aVar2.a = str;
        f.h.b.c.a.x(aVar, "eagAttributes");
        aVar2.b = aVar;
        aVar2.c = b1Var.c;
        aVar2.f7969d = uVar;
        h hVar = new h();
        hVar.a = b1Var.a;
        d dVar = new d(b1Var.f7604f.I(socketAddress, aVar2, hVar), b1Var.f7607i, null);
        hVar.a = dVar.e();
        g.a.v.a(b1Var.f7606h.c, dVar);
        b1Var.u = dVar;
        b1Var.s.add(dVar);
        Runnable d2 = dVar.a().d(new g(dVar, socketAddress));
        if (d2 != null) {
            Queue<Runnable> queue = b1Var.f7609k.f7561g;
            f.h.b.c.a.x(d2, "runnable is null");
            queue.add(d2);
        }
        b1Var.f7608j.b(ChannelLogger.ChannelLogLevel.INFO, "Started transport {0}", hVar.a);
    }

    @Override // g.a.v0.w2
    public w a() {
        u1 u1Var = this.v;
        if (u1Var != null) {
            return u1Var;
        }
        g.a.t0 t0Var = this.f7609k;
        b bVar = new b();
        Queue<Runnable> queue = t0Var.f7561g;
        f.h.b.c.a.x(bVar, "runnable is null");
        queue.add(bVar);
        t0Var.a();
        return null;
    }

    public void b(Status status) {
        g.a.t0 t0Var = this.f7609k;
        c cVar = new c(status);
        Queue<Runnable> queue = t0Var.f7561g;
        f.h.b.c.a.x(cVar, "runnable is null");
        queue.add(cVar);
        t0Var.a();
    }

    @Override // g.a.x
    public g.a.y e() {
        return this.a;
    }

    public final void j(g.a.l lVar) {
        this.f7609k.d();
        if (this.w.a != lVar.a) {
            boolean z = this.w.a != ConnectivityState.SHUTDOWN;
            f.h.b.c.a.C(z, "Cannot transition out of SHUTDOWN to " + lVar);
            this.w = lVar;
            p1 p1Var = (p1) this.f7603e;
            m1 m1Var = m1.this;
            Logger logger = m1.e0;
            Objects.requireNonNull(m1Var);
            ConnectivityState connectivityState = lVar.a;
            if (connectivityState == ConnectivityState.TRANSIENT_FAILURE || connectivityState == ConnectivityState.IDLE) {
                m1Var.n.d();
                m1Var.n.d();
                t0.c cVar = m1Var.a0;
                if (cVar != null) {
                    cVar.a();
                    m1Var.a0 = null;
                    m1Var.b0 = null;
                }
                m1Var.n.d();
                if (m1Var.x) {
                    m1Var.w.b();
                }
            }
            f.h.b.c.a.C(p1Var.a != null, "listener is null");
            p1Var.a.a(lVar);
        }
    }

    public final String k(Status status) {
        StringBuilder sb = new StringBuilder();
        sb.append(status.a);
        if (status.b != null) {
            sb.append("(");
            sb.append(status.b);
            sb.append(")");
        }
        return sb.toString();
    }

    public String toString() {
        f.h.c.a.i c1 = f.h.b.c.a.c1(this);
        c1.b("logId", this.a.c);
        c1.c("addressGroups", this.f7611m);
        return c1.toString();
    }
}
