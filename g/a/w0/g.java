package g.a.w0;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import f.h.c.a.p;
import g.a.a;
import g.a.i0;
import g.a.u;
import g.a.v;
import g.a.v0.j1;
import g.a.v0.k2;
import g.a.v0.n2;
import g.a.v0.r2;
import g.a.v0.s0;
import g.a.v0.u1;
import g.a.v0.w;
import g.a.v0.w0;
import g.a.v0.x0;
import g.a.v0.x2;
import g.a.v0.y0;
import g.a.v0.z;
import g.a.v0.z0;
import g.a.w0.b;
import g.a.w0.f;
import g.a.w0.h;
import g.a.w0.p.i.a;
import g.a.w0.p.i.e;
import g.a.y;
import io.grpc.MethodDescriptor;
import io.grpc.SecurityLevel;
import io.grpc.Status;
import io.grpc.StatusException;
import io.grpc.internal.ClientStreamListener;
import io.grpc.internal.GrpcUtil;
import io.grpc.okhttp.internal.framed.ErrorCode;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import l.r;
import l.t;

/* compiled from: OkHttpClientTransport.java */
/* loaded from: classes2.dex */
public class g implements z, b.a {
    public static final Map<ErrorCode, Status> Q;
    public static final Logger R;
    public static final f[] S;
    public HostnameVerifier A;
    public int B;
    public final Deque<f> C;
    public final g.a.w0.p.a D;
    public ScheduledExecutorService E;
    public j1 F;
    public boolean G;
    public long H;
    public long I;
    public boolean J;
    public final Runnable K;
    public final int L;
    public final boolean M;
    public final x2 N;
    public final z0<f> O;
    public final u P;
    public final InetSocketAddress a;
    public final String b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final Random f8026d = new Random();

    /* renamed from: e  reason: collision with root package name */
    public final p<f.h.c.a.o> f8027e;

    /* renamed from: f  reason: collision with root package name */
    public final int f8028f;

    /* renamed from: g  reason: collision with root package name */
    public u1.a f8029g;

    /* renamed from: h  reason: collision with root package name */
    public g.a.w0.b f8030h;

    /* renamed from: i  reason: collision with root package name */
    public n f8031i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f8032j;

    /* renamed from: k  reason: collision with root package name */
    public final y f8033k;

    /* renamed from: l  reason: collision with root package name */
    public int f8034l;

    /* renamed from: m  reason: collision with root package name */
    public final Map<Integer, f> f8035m;
    public final Executor n;
    public final k2 o;
    public final int p;
    public int q;
    public e r;
    public g.a.a s;
    public Status t;
    public boolean u;
    public y0 v;
    public boolean w;
    public boolean x;
    public final SocketFactory y;
    public SSLSocketFactory z;

    /* compiled from: OkHttpClientTransport.java */
    /* loaded from: classes2.dex */
    public class a extends z0<f> {
        public a() {
        }

        @Override // g.a.v0.z0
        public void a() {
            g.this.f8029g.d(true);
        }

        @Override // g.a.v0.z0
        public void b() {
            g.this.f8029g.d(false);
        }
    }

    /* compiled from: OkHttpClientTransport.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Objects.requireNonNull(g.this);
            g gVar = g.this;
            Objects.requireNonNull(gVar);
            Objects.requireNonNull(g.this);
            gVar.r = new e(null, null);
            g gVar2 = g.this;
            gVar2.n.execute(gVar2.r);
            synchronized (g.this.f8032j) {
                g gVar3 = g.this;
                gVar3.B = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                gVar3.w();
            }
            Objects.requireNonNull(g.this);
            throw null;
        }
    }

    /* compiled from: OkHttpClientTransport.java */
    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f8037f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ g.a.w0.a f8038g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ g.a.w0.p.i.h f8039h;

        /* compiled from: OkHttpClientTransport.java */
        /* loaded from: classes2.dex */
        public class a implements l.y {
            public a(c cVar) {
            }

            @Override // l.y
            public long a0(l.f fVar, long j2) {
                return -1L;
            }

            @Override // l.y, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // l.y
            public l.z d() {
                return l.z.f9266d;
            }
        }

        public c(CountDownLatch countDownLatch, g.a.w0.a aVar, g.a.w0.p.i.h hVar) {
            this.f8037f = countDownLatch;
            this.f8038g = aVar;
            this.f8039h = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            t tVar;
            g gVar;
            e eVar;
            Socket h2;
            try {
                this.f8037f.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            a aVar = new a(this);
            Logger logger = l.o.a;
            t tVar2 = new t(aVar);
            SSLSession sSLSession = null;
            try {
                try {
                    g gVar2 = g.this;
                    u uVar = gVar2.P;
                    if (uVar == null) {
                        h2 = gVar2.y.createSocket(gVar2.a.getAddress(), g.this.a.getPort());
                    } else {
                        SocketAddress socketAddress = uVar.f7570f;
                        if (socketAddress instanceof InetSocketAddress) {
                            h2 = g.h(gVar2, uVar.f7571g, (InetSocketAddress) socketAddress, uVar.f7572h, uVar.f7573i);
                        } else {
                            Status status = Status.f8692m;
                            throw new StatusException(status.h("Unsupported SocketAddress implementation " + g.this.P.f7570f.getClass()));
                        }
                    }
                    Socket socket = h2;
                    g gVar3 = g.this;
                    SSLSocketFactory sSLSocketFactory = gVar3.z;
                    SSLSocket sSLSocket = socket;
                    if (sSLSocketFactory != null) {
                        SSLSocket a2 = k.a(sSLSocketFactory, gVar3.A, socket, gVar3.m(), g.this.n(), g.this.D);
                        sSLSession = a2.getSession();
                        sSLSocket = a2;
                    }
                    sSLSocket.setTcpNoDelay(true);
                    tVar = new t(l.o.h(sSLSocket));
                    try {
                        this.f8038g.a(l.o.e(sSLSocket), sSLSocket);
                        g gVar4 = g.this;
                        a.b b = gVar4.s.b();
                        b.b(g.a.t.a, sSLSocket.getRemoteSocketAddress());
                        b.b(g.a.t.b, sSLSocket.getLocalSocketAddress());
                        b.b(g.a.t.c, sSLSession);
                        b.b(s0.a, sSLSession == null ? SecurityLevel.NONE : SecurityLevel.PRIVACY_AND_INTEGRITY);
                        gVar4.s = b.a();
                        g gVar5 = g.this;
                        gVar5.r = new e(gVar5, ((g.a.w0.p.i.e) this.f8039h).e(tVar, true));
                        synchronized (g.this.f8032j) {
                            g gVar6 = g.this;
                            f.h.b.c.a.x(sSLSocket, "socket");
                            Objects.requireNonNull(gVar6);
                            if (sSLSession != null) {
                                g gVar7 = g.this;
                                new v.b(sSLSession);
                                Objects.requireNonNull(gVar7);
                            }
                        }
                    } catch (StatusException e2) {
                        e = e2;
                        tVar2 = tVar;
                        g.this.v(0, ErrorCode.INTERNAL_ERROR, e.f8693f);
                        gVar = g.this;
                        eVar = new e(gVar, ((g.a.w0.p.i.e) this.f8039h).e(tVar2, true));
                        gVar.r = eVar;
                    } catch (Exception e3) {
                        e = e3;
                        tVar2 = tVar;
                        g.this.a(e);
                        gVar = g.this;
                        eVar = new e(gVar, ((g.a.w0.p.i.e) this.f8039h).e(tVar2, true));
                        gVar.r = eVar;
                    } catch (Throwable th) {
                        th = th;
                        g gVar8 = g.this;
                        gVar8.r = new e(gVar8, ((g.a.w0.p.i.e) this.f8039h).e(tVar, true));
                        throw th;
                    }
                } catch (StatusException e4) {
                    e = e4;
                } catch (Exception e5) {
                    e = e5;
                }
            } catch (Throwable th2) {
                th = th2;
                tVar = tVar2;
            }
        }
    }

    /* compiled from: OkHttpClientTransport.java */
    /* loaded from: classes2.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            gVar.n.execute(gVar.r);
            synchronized (g.this.f8032j) {
                g gVar2 = g.this;
                gVar2.B = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                gVar2.w();
            }
        }
    }

    static {
        EnumMap enumMap = new EnumMap(ErrorCode.class);
        ErrorCode errorCode = ErrorCode.NO_ERROR;
        Status status = Status.f8692m;
        enumMap.put((EnumMap) errorCode, (ErrorCode) status.h("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) ErrorCode.PROTOCOL_ERROR, (ErrorCode) status.h("Protocol error"));
        enumMap.put((EnumMap) ErrorCode.INTERNAL_ERROR, (ErrorCode) status.h("Internal error"));
        enumMap.put((EnumMap) ErrorCode.FLOW_CONTROL_ERROR, (ErrorCode) status.h("Flow control error"));
        enumMap.put((EnumMap) ErrorCode.STREAM_CLOSED, (ErrorCode) status.h("Stream closed"));
        enumMap.put((EnumMap) ErrorCode.FRAME_TOO_LARGE, (ErrorCode) status.h("Frame too large"));
        enumMap.put((EnumMap) ErrorCode.REFUSED_STREAM, (ErrorCode) Status.n.h("Refused stream"));
        enumMap.put((EnumMap) ErrorCode.CANCEL, (ErrorCode) Status.f8686g.h("Cancelled"));
        enumMap.put((EnumMap) ErrorCode.COMPRESSION_ERROR, (ErrorCode) status.h("Compression error"));
        enumMap.put((EnumMap) ErrorCode.CONNECT_ERROR, (ErrorCode) status.h("Connect error"));
        enumMap.put((EnumMap) ErrorCode.ENHANCE_YOUR_CALM, (ErrorCode) Status.f8691l.h("Enhance your calm"));
        enumMap.put((EnumMap) ErrorCode.INADEQUATE_SECURITY, (ErrorCode) Status.f8689j.h("Inadequate security"));
        Q = Collections.unmodifiableMap(enumMap);
        R = Logger.getLogger(g.class.getName());
        S = new f[0];
    }

    public g(InetSocketAddress inetSocketAddress, String str, String str2, g.a.a aVar, Executor executor, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, g.a.w0.p.a aVar2, int i2, int i3, u uVar, Runnable runnable, int i4, x2 x2Var, boolean z) {
        Object obj = new Object();
        this.f8032j = obj;
        this.f8035m = new HashMap();
        this.B = 0;
        this.C = new LinkedList();
        this.O = new a();
        f.h.b.c.a.x(inetSocketAddress, "address");
        this.a = inetSocketAddress;
        this.b = str;
        this.p = i2;
        this.f8028f = i3;
        f.h.b.c.a.x(executor, "executor");
        this.n = executor;
        this.o = new k2(executor);
        this.f8034l = 3;
        this.y = socketFactory == null ? SocketFactory.getDefault() : socketFactory;
        this.z = sSLSocketFactory;
        this.A = hostnameVerifier;
        f.h.b.c.a.x(aVar2, "connectionSpec");
        this.D = aVar2;
        this.f8027e = GrpcUtil.o;
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-");
        sb.append("okhttp");
        sb.append('/');
        sb.append("1.32.2");
        this.c = sb.toString();
        this.P = uVar;
        f.h.b.c.a.x(runnable, "tooManyPingsRunnable");
        this.K = runnable;
        this.L = i4;
        this.N = x2Var;
        this.f8033k = y.a(g.class, inetSocketAddress.toString());
        g.a.a aVar3 = g.a.a.c;
        a.c<g.a.a> cVar = s0.b;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(cVar, aVar);
        for (Map.Entry<a.c<?>, Object> entry : aVar3.a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.s = new g.a.a(identityHashMap, null);
        this.M = z;
        synchronized (obj) {
        }
    }

    public static Socket h(g gVar, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) {
        Socket createSocket;
        String str3;
        Objects.requireNonNull(gVar);
        try {
            if (inetSocketAddress2.getAddress() != null) {
                createSocket = gVar.y.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort());
            } else {
                createSocket = gVar.y.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            }
            createSocket.setTcpNoDelay(true);
            l.y h2 = l.o.h(createSocket);
            r rVar = new r(l.o.e(createSocket));
            f.m.a.c j2 = gVar.j(inetSocketAddress, str, str2);
            f.m.a.b bVar = j2.a;
            rVar.D(String.format("CONNECT %s:%d HTTP/1.1", bVar.a, Integer.valueOf(bVar.b)));
            rVar.D("\r\n");
            int length = j2.b.a.length / 2;
            for (int i2 = 0; i2 < length; i2++) {
                f.m.a.a aVar = j2.b;
                Objects.requireNonNull(aVar);
                int i3 = i2 * 2;
                if (i3 >= 0) {
                    String[] strArr = aVar.a;
                    if (i3 < strArr.length) {
                        str3 = strArr[i3];
                        rVar.D(str3);
                        rVar.D(": ");
                        rVar.D(j2.b.a(i2));
                        rVar.D("\r\n");
                    }
                }
                str3 = null;
                rVar.D(str3);
                rVar.D(": ");
                rVar.D(j2.b.a(i2));
                rVar.D("\r\n");
            }
            rVar.D("\r\n");
            rVar.flush();
            f.m.a.d.a.a a2 = f.m.a.d.a.a.a(s(h2));
            while (!s(h2).equals("")) {
            }
            int i4 = a2.b;
            if (i4 < 200 || i4 >= 300) {
                l.f fVar = new l.f();
                try {
                    createSocket.shutdownOutput();
                    ((l.b) h2).a0(fVar, 1024L);
                } catch (IOException e2) {
                    fVar.u0("Unable to read body: " + e2.toString());
                }
                try {
                    createSocket.close();
                } catch (IOException unused) {
                }
                throw new StatusException(Status.n.h(String.format("Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s", Integer.valueOf(a2.b), a2.c, fVar.N())));
            }
            return createSocket;
        } catch (IOException e3) {
            throw new StatusException(Status.n.h("Failed trying to connect with proxy").g(e3));
        }
    }

    public static void i(g gVar, ErrorCode errorCode, String str) {
        Objects.requireNonNull(gVar);
        gVar.v(0, errorCode, z(errorCode).b(str));
    }

    public static String s(l.y yVar) {
        l.f fVar = new l.f();
        while (((l.b) yVar).a0(fVar, 1L) != -1) {
            if (fVar.l(fVar.f9230g - 1) == 10) {
                return fVar.Q();
            }
        }
        StringBuilder A = f.a.b.a.a.A("\\n not found: ");
        A.append(fVar.C().l());
        throw new EOFException(A.toString());
    }

    public static Status z(ErrorCode errorCode) {
        Status status = Q.get(errorCode);
        if (status != null) {
            return status;
        }
        Status status2 = Status.f8687h;
        StringBuilder A = f.a.b.a.a.A("Unknown http2 error code: ");
        A.append(errorCode.httpCode);
        return status2.h(A.toString());
    }

    @Override // g.a.w0.b.a
    public void a(Throwable th) {
        f.h.b.c.a.x(th, "failureCause");
        v(0, ErrorCode.INTERNAL_ERROR, Status.n.g(th));
    }

    @Override // g.a.v0.u1
    public void b(Status status) {
        synchronized (this.f8032j) {
            if (this.t != null) {
                return;
            }
            this.t = status;
            this.f8029g.a(status);
            y();
        }
    }

    @Override // g.a.v0.u1
    public void c(Status status) {
        b(status);
        synchronized (this.f8032j) {
            Iterator<Map.Entry<Integer, f>> it = this.f8035m.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, f> next = it.next();
                it.remove();
                f.b bVar = next.getValue().f8025m;
                i0 i0Var = new i0();
                Objects.requireNonNull(bVar);
                bVar.i(status, ClientStreamListener.RpcProgress.PROCESSED, false, i0Var);
                r(next.getValue());
            }
            for (f fVar : this.C) {
                f.b bVar2 = fVar.f8025m;
                i0 i0Var2 = new i0();
                Objects.requireNonNull(bVar2);
                bVar2.i(status, ClientStreamListener.RpcProgress.PROCESSED, true, i0Var2);
                r(fVar);
            }
            this.C.clear();
            y();
        }
    }

    @Override // g.a.v0.u1
    public Runnable d(u1.a aVar) {
        f.h.b.c.a.x(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f8029g = aVar;
        if (this.G) {
            this.E = (ScheduledExecutorService) n2.a(GrpcUtil.n);
            j1 j1Var = new j1(new j1.c(this), this.E, this.H, this.I, this.J);
            this.F = j1Var;
            synchronized (j1Var) {
                if (j1Var.f7802d) {
                    j1Var.b();
                }
            }
        }
        if (this.a == null) {
            synchronized (this.f8032j) {
                g.a.w0.b bVar = new g.a.w0.b(this, null, null);
                this.f8030h = bVar;
                this.f8031i = new n(this, bVar);
            }
            k2 k2Var = this.o;
            b bVar2 = new b();
            Queue<Runnable> queue = k2Var.f7829g;
            f.h.b.c.a.x(bVar2, "'r' must not be null.");
            queue.add(bVar2);
            k2Var.c(bVar2);
            return null;
        }
        g.a.w0.a aVar2 = new g.a.w0.a(this.o, this);
        g.a.w0.p.i.e eVar = new g.a.w0.p.i.e();
        Logger logger = l.o.a;
        e.d dVar = new e.d(new r(aVar2), true);
        synchronized (this.f8032j) {
            g.a.w0.b bVar3 = new g.a.w0.b(this, dVar, new h(Level.FINE, g.class));
            this.f8030h = bVar3;
            this.f8031i = new n(this, bVar3);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        k2 k2Var2 = this.o;
        c cVar = new c(countDownLatch, aVar2, eVar);
        Queue<Runnable> queue2 = k2Var2.f7829g;
        f.h.b.c.a.x(cVar, "'r' must not be null.");
        queue2.add(cVar);
        k2Var2.c(cVar);
        try {
            t();
            countDownLatch.countDown();
            k2 k2Var3 = this.o;
            d dVar2 = new d();
            Queue<Runnable> queue3 = k2Var3.f7829g;
            f.h.b.c.a.x(dVar2, "'r' must not be null.");
            queue3.add(dVar2);
            k2Var3.c(dVar2);
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    @Override // g.a.x
    public y e() {
        return this.f8033k;
    }

    @Override // g.a.v0.w
    public void f(w.a aVar, Executor executor) {
        long nextLong;
        Runnable w0Var;
        synchronized (this.f8032j) {
            boolean z = true;
            f.h.b.c.a.B(this.f8030h != null);
            if (this.w) {
                y0.a(executor, new x0(aVar, o()));
                return;
            }
            y0 y0Var = this.v;
            if (y0Var != null) {
                nextLong = 0;
                z = false;
            } else {
                nextLong = this.f8026d.nextLong();
                f.h.c.a.o oVar = this.f8027e.get();
                oVar.c();
                y0 y0Var2 = new y0(nextLong, oVar);
                this.v = y0Var2;
                this.N.f7974e++;
                y0Var = y0Var2;
            }
            if (z) {
                this.f8030h.P(false, (int) (nextLong >>> 32), (int) nextLong);
            }
            synchronized (y0Var) {
                if (!y0Var.f7982d) {
                    y0Var.c.put(aVar, executor);
                    return;
                }
                Throwable th = y0Var.f7983e;
                if (th != null) {
                    w0Var = new x0(aVar, th);
                } else {
                    w0Var = new w0(aVar, y0Var.f7984f);
                }
                y0.a(executor, w0Var);
            }
        }
    }

    @Override // g.a.v0.w
    public g.a.v0.v g(MethodDescriptor methodDescriptor, i0 i0Var, g.a.b bVar) {
        Object obj;
        f.h.b.c.a.x(methodDescriptor, FirebaseAnalytics.Param.METHOD);
        f.h.b.c.a.x(i0Var, "headers");
        r2 b2 = r2.b(bVar, this.s, i0Var);
        Object obj2 = this.f8032j;
        synchronized (obj2) {
            try {
                obj = obj2;
            } catch (Throwable th) {
                th = th;
                obj = obj2;
            }
            try {
                f fVar = new f(methodDescriptor, i0Var, this.f8030h, this, this.f8031i, this.f8032j, this.p, this.f8028f, this.b, this.c, b2, this.N, bVar, this.M);
                return fVar;
            } catch (Throwable th2) {
                th = th2;
                while (true) {
                    try {
                        break;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
        r17 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01f3, code lost:
        if (r5 != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
        r17 = r3;
        r16 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final f.m.a.c j(java.net.InetSocketAddress r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.w0.g.j(java.net.InetSocketAddress, java.lang.String, java.lang.String):f.m.a.c");
    }

    public void k(int i2, Status status, ClientStreamListener.RpcProgress rpcProgress, boolean z, ErrorCode errorCode, i0 i0Var) {
        synchronized (this.f8032j) {
            f remove = this.f8035m.remove(Integer.valueOf(i2));
            if (remove != null) {
                if (errorCode != null) {
                    this.f8030h.p0(i2, ErrorCode.CANCEL);
                }
                if (status != null) {
                    f.b bVar = remove.f8025m;
                    if (i0Var == null) {
                        i0Var = new i0();
                    }
                    bVar.i(status, rpcProgress, z, i0Var);
                }
                if (!w()) {
                    y();
                    r(remove);
                }
            }
        }
    }

    public f[] l() {
        f[] fVarArr;
        synchronized (this.f8032j) {
            fVarArr = (f[]) this.f8035m.values().toArray(S);
        }
        return fVarArr;
    }

    public String m() {
        URI a2 = GrpcUtil.a(this.b);
        if (a2.getHost() != null) {
            return a2.getHost();
        }
        return this.b;
    }

    public int n() {
        URI a2 = GrpcUtil.a(this.b);
        if (a2.getPort() != -1) {
            return a2.getPort();
        }
        return this.a.getPort();
    }

    public final Throwable o() {
        synchronized (this.f8032j) {
            Status status = this.t;
            if (status != null) {
                Objects.requireNonNull(status);
                return new StatusException(status);
            }
            return new StatusException(Status.n.h("Connection closed"));
        }
    }

    public f p(int i2) {
        f fVar;
        synchronized (this.f8032j) {
            fVar = this.f8035m.get(Integer.valueOf(i2));
        }
        return fVar;
    }

    public boolean q(int i2) {
        boolean z;
        synchronized (this.f8032j) {
            z = true;
            if (i2 >= this.f8034l || (i2 & 1) != 1) {
                z = false;
            }
        }
        return z;
    }

    public final void r(f fVar) {
        if (this.x && this.C.isEmpty() && this.f8035m.isEmpty()) {
            this.x = false;
            j1 j1Var = this.F;
            if (j1Var != null) {
                synchronized (j1Var) {
                    if (!j1Var.f7802d) {
                        j1.e eVar = j1Var.f7803e;
                        if (eVar == j1.e.PING_SCHEDULED || eVar == j1.e.PING_DELAYED) {
                            j1Var.f7803e = j1.e.IDLE;
                        }
                        if (j1Var.f7803e == j1.e.PING_SENT) {
                            j1Var.f7803e = j1.e.IDLE_AND_PING_SENT;
                        }
                    }
                }
            }
        }
        if (fVar.c) {
            this.O.c(fVar, false);
        }
    }

    public void t() {
        synchronized (this.f8032j) {
            g.a.w0.b bVar = this.f8030h;
            Objects.requireNonNull(bVar);
            try {
                bVar.f8002g.u();
            } catch (IOException e2) {
                bVar.f8001f.a(e2);
            }
            g.a.w0.p.i.g gVar = new g.a.w0.p.i.g();
            gVar.b(7, 0, this.f8028f);
            g.a.w0.b bVar2 = this.f8030h;
            bVar2.f8003h.f(h.a.OUTBOUND, gVar);
            try {
                bVar2.f8002g.L(gVar);
            } catch (IOException e3) {
                bVar2.f8001f.a(e3);
            }
            int i2 = this.f8028f;
            if (i2 > 65535) {
                this.f8030h.B(0, i2 - 65535);
            }
        }
    }

    public String toString() {
        f.h.c.a.i c1 = f.h.b.c.a.c1(this);
        c1.b("logId", this.f8033k.c);
        c1.c("address", this.a);
        return c1.toString();
    }

    public final void u(f fVar) {
        if (!this.x) {
            this.x = true;
            j1 j1Var = this.F;
            if (j1Var != null) {
                j1Var.b();
            }
        }
        if (fVar.c) {
            this.O.c(fVar, true);
        }
    }

    public final void v(int i2, ErrorCode errorCode, Status status) {
        synchronized (this.f8032j) {
            if (this.t == null) {
                this.t = status;
                this.f8029g.a(status);
            }
            if (errorCode != null && !this.u) {
                this.u = true;
                this.f8030h.o0(0, errorCode, new byte[0]);
            }
            Iterator<Map.Entry<Integer, f>> it = this.f8035m.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, f> next = it.next();
                if (next.getKey().intValue() > i2) {
                    it.remove();
                    next.getValue().f8025m.i(status, ClientStreamListener.RpcProgress.REFUSED, false, new i0());
                    r(next.getValue());
                }
            }
            for (f fVar : this.C) {
                fVar.f8025m.i(status, ClientStreamListener.RpcProgress.REFUSED, true, new i0());
                r(fVar);
            }
            this.C.clear();
            y();
        }
    }

    public final boolean w() {
        boolean z = false;
        while (!this.C.isEmpty() && this.f8035m.size() < this.B) {
            x(this.C.poll());
            z = true;
        }
        return z;
    }

    public final void x(f fVar) {
        f.h.b.c.a.C(fVar.f8024l == -1, "StreamId already assigned");
        this.f8035m.put(Integer.valueOf(this.f8034l), fVar);
        u(fVar);
        f.b bVar = fVar.f8025m;
        int i2 = this.f8034l;
        if (f.this.f8024l == -1) {
            f.this.f8024l = i2;
            f.b bVar2 = f.this.f8025m;
            f.h.b.c.a.B(bVar2.f7583j != null);
            synchronized (bVar2.b) {
                f.h.b.c.a.C(!bVar2.f7650f, "Already allocated");
                bVar2.f7650f = true;
            }
            bVar2.f();
            x2 x2Var = bVar2.c;
            x2Var.b++;
            x2Var.a.a();
            if (bVar.J) {
                g.a.w0.b bVar3 = bVar.G;
                f fVar2 = f.this;
                bVar3.h0(fVar2.p, false, fVar2.f8024l, 0, bVar.z);
                for (g.a.s0 s0Var : f.this.f8021i.a) {
                    Objects.requireNonNull((g.a.h) s0Var);
                }
                bVar.z = null;
                if (bVar.A.f9230g > 0) {
                    bVar.H.a(bVar.B, f.this.f8024l, bVar.A, bVar.C);
                }
                bVar.J = false;
            }
            MethodDescriptor.MethodType methodType = fVar.f8019g.a;
            if ((methodType != MethodDescriptor.MethodType.UNARY && methodType != MethodDescriptor.MethodType.SERVER_STREAMING) || fVar.p) {
                this.f8030h.flush();
            }
            int i3 = this.f8034l;
            if (i3 >= 2147483645) {
                this.f8034l = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                v(Api.BaseClientBuilder.API_PRIORITY_OTHER, ErrorCode.NO_ERROR, Status.n.h("Stream ids exhausted"));
                return;
            }
            this.f8034l = i3 + 2;
            return;
        }
        throw new IllegalStateException(f.h.b.c.a.E0("the stream has been started with id %s", Integer.valueOf(i2)));
    }

    public final void y() {
        if (this.t == null || !this.f8035m.isEmpty() || !this.C.isEmpty() || this.w) {
            return;
        }
        this.w = true;
        j1 j1Var = this.F;
        if (j1Var != null) {
            synchronized (j1Var) {
                j1.e eVar = j1Var.f7803e;
                j1.e eVar2 = j1.e.DISCONNECTED;
                if (eVar != eVar2) {
                    j1Var.f7803e = eVar2;
                    ScheduledFuture<?> scheduledFuture = j1Var.f7804f;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    ScheduledFuture<?> scheduledFuture2 = j1Var.f7805g;
                    if (scheduledFuture2 != null) {
                        scheduledFuture2.cancel(false);
                        j1Var.f7805g = null;
                    }
                }
            }
            n2.b(GrpcUtil.n, this.E);
            this.E = null;
        }
        y0 y0Var = this.v;
        if (y0Var != null) {
            Throwable o = o();
            synchronized (y0Var) {
                if (!y0Var.f7982d) {
                    y0Var.f7982d = true;
                    y0Var.f7983e = o;
                    Map<w.a, Executor> map = y0Var.c;
                    y0Var.c = null;
                    for (Map.Entry<w.a, Executor> entry : map.entrySet()) {
                        y0.a(entry.getValue(), new x0(entry.getKey(), o));
                    }
                }
            }
            this.v = null;
        }
        if (!this.u) {
            this.u = true;
            this.f8030h.o0(0, ErrorCode.NO_ERROR, new byte[0]);
        }
        this.f8030h.close();
    }

    /* compiled from: OkHttpClientTransport.java */
    /* loaded from: classes2.dex */
    public class e implements a.InterfaceC0201a, Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final h f8042f;

        /* renamed from: g  reason: collision with root package name */
        public g.a.w0.p.i.a f8043g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f8044h;

        public e(g gVar, g.a.w0.p.i.a aVar) {
            h hVar = new h(Level.FINE, g.class);
            g.this = gVar;
            this.f8044h = true;
            this.f8043g = aVar;
            this.f8042f = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("OkHttpClientTransport");
            while (((e.c) this.f8043g).a(this)) {
                try {
                    j1 j1Var = g.this.F;
                    if (j1Var != null) {
                        j1Var.a();
                    }
                } catch (Throwable th) {
                    try {
                        g gVar = g.this;
                        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                        Status g2 = Status.f8692m.h("error in frame handler").g(th);
                        Map<ErrorCode, Status> map = g.Q;
                        gVar.v(0, errorCode, g2);
                        try {
                            ((e.c) this.f8043g).f8100f.close();
                        } catch (IOException e2) {
                            e = e2;
                            g.R.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                            g.this.f8029g.c();
                            Thread.currentThread().setName(name);
                        }
                    } catch (Throwable th2) {
                        try {
                            ((e.c) this.f8043g).f8100f.close();
                        } catch (IOException e3) {
                            g.R.log(Level.INFO, "Exception closing frame reader", (Throwable) e3);
                        }
                        g.this.f8029g.c();
                        Thread.currentThread().setName(name);
                        throw th2;
                    }
                }
            }
            g gVar2 = g.this;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            Status h2 = Status.n.h("End of stream or IOException");
            Map<ErrorCode, Status> map2 = g.Q;
            gVar2.v(0, errorCode2, h2);
            try {
                ((e.c) this.f8043g).f8100f.close();
            } catch (IOException e4) {
                e = e4;
                g.R.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                g.this.f8029g.c();
                Thread.currentThread().setName(name);
            }
            g.this.f8029g.c();
            Thread.currentThread().setName(name);
        }

        public e(g.a.w0.p.i.a aVar, h hVar) {
            this.f8044h = true;
            this.f8043g = null;
            this.f8042f = null;
        }
    }
}
