package g.a.v0;

import g.a.a;
import g.a.c0;
import g.a.e0;
import g.a.v0.m2;
import io.grpc.ChannelLogger;
import io.grpc.ConnectivityState;
import io.grpc.Status;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

/* compiled from: AutoConfiguredLoadBalancerFactory.java */
/* loaded from: classes2.dex */
public final class k {
    public final g.a.e0 a;
    public final String b;

    /* compiled from: AutoConfiguredLoadBalancerFactory.java */
    /* loaded from: classes2.dex */
    public final class b {
        public final c0.d a;
        public g.a.c0 b;
        public g.a.d0 c;

        public b(c0.d dVar) {
            this.a = dVar;
            g.a.d0 a = k.this.a.a(k.this.b);
            this.c = a;
            if (a != null) {
                this.b = a.a(dVar);
                return;
            }
            throw new IllegalStateException(f.a.b.a.a.u(f.a.b.a.a.A("Could not find policy '"), k.this.b, "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."));
        }

        public Status a(c0.g gVar) {
            List<g.a.r> list = gVar.a;
            g.a.a aVar = gVar.b;
            if (aVar.a(g.a.c0.ATTR_LOAD_BALANCING_CONFIG) == null) {
                m2.b bVar = (m2.b) gVar.c;
                if (bVar == null) {
                    try {
                        k kVar = k.this;
                        bVar = new m2.b(k.a(kVar, kVar.b, "using default policy"), null, null);
                    } catch (f e2) {
                        this.a.d(ConnectivityState.TRANSIENT_FAILURE, new d(Status.f8692m.h(e2.getMessage())));
                        this.b.c();
                        this.c = null;
                        this.b = new e(null);
                        return Status.f8685f;
                    }
                }
                if (this.c == null || !bVar.a.b().equals(this.c.b())) {
                    this.a.d(ConnectivityState.CONNECTING, new c(null));
                    this.b.c();
                    g.a.d0 d0Var = bVar.a;
                    this.c = d0Var;
                    g.a.c0 c0Var = this.b;
                    this.b = d0Var.a(this.a);
                    this.a.b().b(ChannelLogger.ChannelLogLevel.INFO, "Load balancer changed from {0} to {1}", c0Var.getClass().getSimpleName(), this.b.getClass().getSimpleName());
                }
                Object obj = bVar.c;
                if (obj != null) {
                    this.a.b().b(ChannelLogger.ChannelLogLevel.DEBUG, "Load-balancing config: {0}", bVar.c);
                    a.b b = aVar.b();
                    b.b(g.a.c0.ATTR_LOAD_BALANCING_CONFIG, bVar.b);
                    aVar = b.a();
                }
                g.a.c0 c0Var2 = this.b;
                if (gVar.a.isEmpty()) {
                    Objects.requireNonNull(c0Var2);
                    Status status = Status.n;
                    return status.h("NameResolver returned no usable address. addrs=" + list + ", attrs=" + aVar);
                }
                g.a.a aVar2 = g.a.a.c;
                c0Var2.b(new c0.g(gVar.a, aVar, obj, null));
                return Status.f8685f;
            }
            StringBuilder A = f.a.b.a.a.A("Unexpected ATTR_LOAD_BALANCING_CONFIG from upstream: ");
            A.append(aVar.a(g.a.c0.ATTR_LOAD_BALANCING_CONFIG));
            throw new IllegalArgumentException(A.toString());
        }
    }

    /* compiled from: AutoConfiguredLoadBalancerFactory.java */
    /* loaded from: classes2.dex */
    public static final class c extends c0.i {
        public c() {
        }

        @Override // g.a.c0.i
        public c0.e a(c0.f fVar) {
            return c0.e.f7533e;
        }

        public String toString() {
            return new f.h.c.a.i(c.class.getSimpleName(), null).toString();
        }

        public c(a aVar) {
        }
    }

    /* compiled from: AutoConfiguredLoadBalancerFactory.java */
    /* loaded from: classes2.dex */
    public static final class d extends c0.i {
        public final Status a;

        public d(Status status) {
            this.a = status;
        }

        @Override // g.a.c0.i
        public c0.e a(c0.f fVar) {
            return c0.e.a(this.a);
        }
    }

    /* compiled from: AutoConfiguredLoadBalancerFactory.java */
    /* loaded from: classes2.dex */
    public static final class e extends g.a.c0 {
        public e(a aVar) {
        }

        @Override // g.a.c0
        public void a(Status status) {
        }

        @Override // g.a.c0
        public void b(c0.g gVar) {
        }

        @Override // g.a.c0
        public void c() {
        }
    }

    /* compiled from: AutoConfiguredLoadBalancerFactory.java */
    /* loaded from: classes2.dex */
    public static final class f extends Exception {
        public f(String str, a aVar) {
            super(str);
        }
    }

    public k(String str) {
        g.a.e0 e0Var;
        Logger logger = g.a.e0.c;
        synchronized (g.a.e0.class) {
            if (g.a.e0.f7535d == null) {
                List<g.a.d0> G = f.n.a.n.i.G(g.a.d0.class, g.a.e0.f7536e, g.a.d0.class.getClassLoader(), new e0.a());
                g.a.e0.f7535d = new g.a.e0();
                for (g.a.d0 d0Var : G) {
                    Logger logger2 = g.a.e0.c;
                    logger2.fine("Service loader found " + d0Var);
                    if (d0Var.d()) {
                        g.a.e0 e0Var2 = g.a.e0.f7535d;
                        synchronized (e0Var2) {
                            f.h.b.c.a.m(d0Var.d(), "isAvailable() returned false");
                            e0Var2.a.add(d0Var);
                        }
                    }
                }
                g.a.e0.f7535d.b();
            }
            e0Var = g.a.e0.f7535d;
        }
        f.h.b.c.a.x(e0Var, "registry");
        this.a = e0Var;
        f.h.b.c.a.x(str, "defaultPolicy");
        this.b = str;
    }

    public static g.a.d0 a(k kVar, String str, String str2) {
        g.a.d0 a2 = kVar.a.a(str);
        if (a2 != null) {
            return a2;
        }
        throw new f(f.a.b.a.a.s("Trying to load '", str, "' because ", str2, ", but it's unavailable"), null);
    }
}
