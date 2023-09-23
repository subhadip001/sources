package g.a.v0;

import g.a.k0;
import g.a.m0;
import g.a.v0.b;
import g.a.v0.x2;
import io.grpc.internal.GrpcUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: AbstractManagedChannelImplBuilder.java */
/* loaded from: classes2.dex */
public abstract class b<T extends b<T>> extends g.a.g0<T> {
    public y1<? extends Executor> a;
    public y1<? extends Executor> b;
    public final List<g.a.e> c;

    /* renamed from: d  reason: collision with root package name */
    public final g.a.m0 f7591d;

    /* renamed from: e  reason: collision with root package name */
    public k0.c f7592e;

    /* renamed from: f  reason: collision with root package name */
    public final String f7593f;

    /* renamed from: g  reason: collision with root package name */
    public String f7594g;

    /* renamed from: h  reason: collision with root package name */
    public g.a.p f7595h;

    /* renamed from: i  reason: collision with root package name */
    public g.a.k f7596i;

    /* renamed from: j  reason: collision with root package name */
    public long f7597j;

    /* renamed from: k  reason: collision with root package name */
    public int f7598k;

    /* renamed from: l  reason: collision with root package name */
    public int f7599l;

    /* renamed from: m  reason: collision with root package name */
    public long f7600m;
    public long n;
    public boolean o;
    public g.a.v p;
    public boolean q;
    public x2.b r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public static final Logger x = Logger.getLogger(b.class.getName());
    public static final long y = TimeUnit.MINUTES.toMillis(30);
    public static final long z = TimeUnit.SECONDS.toMillis(1);
    public static final y1<? extends Executor> A = new p2(GrpcUtil.f8708m);
    public static final g.a.p B = g.a.p.f7557d;
    public static final g.a.k C = g.a.k.b;

    public b(String str) {
        g.a.m0 m0Var;
        y1<? extends Executor> y1Var = A;
        this.a = y1Var;
        this.b = y1Var;
        this.c = new ArrayList();
        Logger logger = g.a.m0.f7547e;
        synchronized (g.a.m0.class) {
            if (g.a.m0.f7548f == null) {
                ArrayList arrayList = new ArrayList();
                try {
                    arrayList.add(Class.forName("g.a.v0.i0"));
                } catch (ClassNotFoundException e2) {
                    g.a.m0.f7547e.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e2);
                }
                List<g.a.l0> G = f.n.a.n.i.G(g.a.l0.class, Collections.unmodifiableList(arrayList), g.a.l0.class.getClassLoader(), new m0.c(null));
                if (G.isEmpty()) {
                    g.a.m0.f7547e.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                g.a.m0.f7548f = new g.a.m0();
                for (g.a.l0 l0Var : G) {
                    Logger logger2 = g.a.m0.f7547e;
                    logger2.fine("Service loader found " + l0Var);
                    if (l0Var.c()) {
                        g.a.m0 m0Var2 = g.a.m0.f7548f;
                        synchronized (m0Var2) {
                            f.h.b.c.a.m(l0Var.c(), "isAvailable() returned false");
                            m0Var2.c.add(l0Var);
                        }
                    }
                }
                g.a.m0.f7548f.a();
            }
            m0Var = g.a.m0.f7548f;
        }
        this.f7591d = m0Var;
        this.f7592e = m0Var.a;
        this.f7594g = "pick_first";
        this.f7595h = B;
        this.f7596i = C;
        this.f7597j = y;
        this.f7598k = 5;
        this.f7599l = 5;
        this.f7600m = 16777216L;
        this.n = 1048576L;
        this.p = g.a.v.f7575e;
        this.q = true;
        x2.b bVar = x2.f7972h;
        this.r = x2.f7972h;
        this.s = 4194304;
        this.t = true;
        this.u = true;
        this.v = true;
        this.w = true;
        f.h.b.c.a.x(str, "target");
        this.f7593f = str;
    }

    public abstract x a();

    public int b() {
        return 443;
    }
}
