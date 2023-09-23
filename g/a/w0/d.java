package g.a.w0;

import com.google.android.gms.common.api.Api;
import g.a.u;
import g.a.v0.i;
import g.a.v0.n2;
import g.a.v0.x;
import g.a.v0.x2;
import g.a.v0.z;
import g.a.w0.p.a;
import io.grpc.ChannelLogger;
import io.grpc.internal.GrpcUtil;
import io.grpc.okhttp.internal.CipherSuite;
import io.grpc.okhttp.internal.Platform;
import io.grpc.okhttp.internal.TlsVersion;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: OkHttpChannelBuilder.java */
/* loaded from: classes2.dex */
public class d extends g.a.v0.b<d> {
    public static final g.a.w0.p.a K;
    public static final n2.c<Executor> L;
    public SSLSocketFactory D;
    public g.a.w0.p.a E;
    public b F;
    public long G;
    public long H;
    public int I;
    public int J;

    /* compiled from: OkHttpChannelBuilder.java */
    /* loaded from: classes2.dex */
    public class a implements n2.c<Executor> {
        @Override // g.a.v0.n2.c
        public Executor a() {
            return Executors.newCachedThreadPool(GrpcUtil.d("grpc-okhttp-%d", true));
        }

        @Override // g.a.v0.n2.c
        public void b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }
    }

    /* compiled from: OkHttpChannelBuilder.java */
    /* loaded from: classes2.dex */
    public enum b {
        TLS,
        PLAINTEXT
    }

    /* compiled from: OkHttpChannelBuilder.java */
    /* loaded from: classes2.dex */
    public static final class c implements x {

        /* renamed from: f  reason: collision with root package name */
        public final Executor f8010f;

        /* renamed from: i  reason: collision with root package name */
        public final x2.b f8013i;

        /* renamed from: k  reason: collision with root package name */
        public final SSLSocketFactory f8015k;

        /* renamed from: m  reason: collision with root package name */
        public final g.a.w0.p.a f8017m;
        public final int n;
        public final boolean o;
        public final g.a.v0.i p;
        public final long q;
        public final int r;
        public final boolean s;
        public final int t;
        public final boolean v;
        public boolean w;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f8012h = true;
        public final ScheduledExecutorService u = (ScheduledExecutorService) n2.a(GrpcUtil.n);

        /* renamed from: j  reason: collision with root package name */
        public final SocketFactory f8014j = null;

        /* renamed from: l  reason: collision with root package name */
        public final HostnameVerifier f8016l = null;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f8011g = true;

        /* compiled from: OkHttpChannelBuilder.java */
        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ i.b f8018f;

            public a(c cVar, i.b bVar) {
                this.f8018f = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                i.b bVar = this.f8018f;
                long j2 = bVar.a;
                long max = Math.max(2 * j2, j2);
                if (g.a.v0.i.this.b.compareAndSet(bVar.a, max)) {
                    g.a.v0.i.c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{g.a.v0.i.this.a, Long.valueOf(max)});
                }
            }
        }

        public c(Executor executor, ScheduledExecutorService scheduledExecutorService, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, g.a.w0.p.a aVar, int i2, boolean z, long j2, long j3, int i3, boolean z2, int i4, x2.b bVar, boolean z3, a aVar2) {
            this.f8015k = sSLSocketFactory;
            this.f8017m = aVar;
            this.n = i2;
            this.o = z;
            this.p = new g.a.v0.i("keepalive time nanos", j2);
            this.q = j3;
            this.r = i3;
            this.s = z2;
            this.t = i4;
            this.v = z3;
            f.h.b.c.a.x(bVar, "transportTracerFactory");
            this.f8013i = bVar;
            this.f8010f = (Executor) n2.a(d.L);
        }

        @Override // g.a.v0.x
        public z I(SocketAddress socketAddress, x.a aVar, ChannelLogger channelLogger) {
            if (!this.w) {
                g.a.v0.i iVar = this.p;
                i.b bVar = new i.b(iVar.b.get(), null);
                a aVar2 = new a(this, bVar);
                String str = aVar.a;
                String str2 = aVar.c;
                g.a.a aVar3 = aVar.b;
                Executor executor = this.f8010f;
                SocketFactory socketFactory = this.f8014j;
                SSLSocketFactory sSLSocketFactory = this.f8015k;
                HostnameVerifier hostnameVerifier = this.f8016l;
                g.a.w0.p.a aVar4 = this.f8017m;
                int i2 = this.n;
                int i3 = this.r;
                u uVar = aVar.f7969d;
                int i4 = this.t;
                x2.b bVar2 = this.f8013i;
                Objects.requireNonNull(bVar2);
                g gVar = new g((InetSocketAddress) socketAddress, str, str2, aVar3, executor, socketFactory, sSLSocketFactory, hostnameVerifier, aVar4, i2, i3, uVar, aVar2, i4, new x2(bVar2.a, null), this.v);
                if (this.o) {
                    long j2 = bVar.a;
                    long j3 = this.q;
                    boolean z = this.s;
                    gVar.G = true;
                    gVar.H = j2;
                    gVar.I = j3;
                    gVar.J = z;
                }
                return gVar;
            }
            throw new IllegalStateException("The transport factory is closed.");
        }

        @Override // g.a.v0.x
        public ScheduledExecutorService b0() {
            return this.u;
        }

        @Override // g.a.v0.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.w) {
                return;
            }
            this.w = true;
            if (this.f8012h) {
                n2.b(GrpcUtil.n, this.u);
            }
            if (this.f8011g) {
                n2.b(d.L, this.f8010f);
            }
        }
    }

    static {
        a.b bVar = new a.b(g.a.w0.p.a.f8074f);
        bVar.b(CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384);
        bVar.d(TlsVersion.TLS_1_2);
        bVar.c(true);
        K = bVar.a();
        TimeUnit.DAYS.toNanos(1000L);
        L = new a();
    }

    public d(String str) {
        super(str);
        this.E = K;
        this.F = b.TLS;
        this.G = Long.MAX_VALUE;
        this.H = GrpcUtil.f8705j;
        this.I = 65535;
        this.J = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // g.a.v0.b
    public final x a() {
        SSLSocketFactory sSLSocketFactory;
        boolean z = this.G != Long.MAX_VALUE;
        int ordinal = this.F.ordinal();
        if (ordinal == 0) {
            try {
                if (this.D == null) {
                    this.D = SSLContext.getInstance("Default", Platform.f8709d.a).getSocketFactory();
                }
                sSLSocketFactory = this.D;
            } catch (GeneralSecurityException e2) {
                throw new RuntimeException("TLS Provider failure", e2);
            }
        } else if (ordinal != 1) {
            StringBuilder A = f.a.b.a.a.A("Unknown negotiation type: ");
            A.append(this.F);
            throw new RuntimeException(A.toString());
        } else {
            sSLSocketFactory = null;
        }
        return new c(null, null, null, sSLSocketFactory, null, this.E, this.s, z, this.G, this.H, this.I, false, this.J, this.r, false, null);
    }

    @Override // g.a.v0.b
    public int b() {
        int ordinal = this.F.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return 80;
            }
            throw new AssertionError(this.F + " not handled");
        }
        return 443;
    }
}
