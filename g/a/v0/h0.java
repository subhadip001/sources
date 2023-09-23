package g.a.v0;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.base.VerifyException;
import g.a.k0;
import g.a.v0.n2;
import io.grpc.Status;
import java.io.IOException;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: DnsNameResolver.java */
/* loaded from: classes2.dex */
public class h0 extends g.a.k0 {
    public static final g A;
    public static String B;
    public static final Logger s;
    public static final Set<String> t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static boolean x;
    public static boolean y;
    public static boolean z;
    public final g.a.p0 a;
    public final Random b = new Random();
    public volatile b c = d.INSTANCE;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<f> f7751d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    public final String f7752e;

    /* renamed from: f  reason: collision with root package name */
    public final String f7753f;

    /* renamed from: g  reason: collision with root package name */
    public final int f7754g;

    /* renamed from: h  reason: collision with root package name */
    public final n2.c<Executor> f7755h;

    /* renamed from: i  reason: collision with root package name */
    public final long f7756i;

    /* renamed from: j  reason: collision with root package name */
    public final g.a.t0 f7757j;

    /* renamed from: k  reason: collision with root package name */
    public final f.h.c.a.o f7758k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f7759l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f7760m;
    public Executor n;
    public final boolean o;
    public final k0.f p;
    public boolean q;
    public k0.d r;

    /* compiled from: DnsNameResolver.java */
    /* loaded from: classes2.dex */
    public interface b {
    }

    /* compiled from: DnsNameResolver.java */
    /* loaded from: classes2.dex */
    public static final class c {
        public Status a;
        public List<g.a.r> b;
        public k0.b c;

        public c(a aVar) {
        }
    }

    /* compiled from: DnsNameResolver.java */
    /* loaded from: classes2.dex */
    public enum d implements b {
        INSTANCE
    }

    /* compiled from: DnsNameResolver.java */
    /* loaded from: classes2.dex */
    public final class e implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final k0.d f7763f;

        /* compiled from: DnsNameResolver.java */
        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ boolean f7765f;

            public a(boolean z) {
                this.f7765f = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f7765f) {
                    h0 h0Var = h0.this;
                    h0Var.f7759l = true;
                    if (h0Var.f7756i > 0) {
                        f.h.c.a.o oVar = h0Var.f7758k;
                        oVar.b();
                        oVar.c();
                    }
                }
                h0.this.q = false;
            }
        }

        public e(k0.d dVar) {
            f.h.b.c.a.x(dVar, "savedListener");
            this.f7763f = dVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:5|(2:6|7)|(3:9|(1:11)|12)(4:41|42|43|(6:45|46|(1:48)|49|19|20)(5:50|(1:52)|53|(1:55)|56))|13|14|(1:22)|18|19|20) */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
            r1 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
            r1 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00a6, code lost:
            r3 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00b0, code lost:
            r2 = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00e8, code lost:
            r9 = r2;
            r2 = r1;
            r1 = r9;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 264
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: g.a.v0.h0.e.run():void");
        }
    }

    /* compiled from: DnsNameResolver.java */
    /* loaded from: classes2.dex */
    public interface f {
        List<String> a(String str);
    }

    /* compiled from: DnsNameResolver.java */
    /* loaded from: classes2.dex */
    public interface g {
        f a();

        Throwable b();
    }

    static {
        Logger logger = Logger.getLogger(h0.class.getName());
        s = logger;
        t = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        u = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        v = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        w = property3;
        x = Boolean.parseBoolean(property);
        y = Boolean.parseBoolean(property2);
        z = Boolean.parseBoolean(property3);
        g gVar = null;
        try {
            try {
                try {
                    g gVar2 = (g) Class.forName("g.a.v0.g1", true, h0.class.getClassLoader()).asSubclass(g.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                    if (gVar2.b() != null) {
                        logger.log(Level.FINE, "JndiResourceResolverFactory not available, skipping.", gVar2.b());
                    } else {
                        gVar = gVar2;
                    }
                } catch (Exception e2) {
                    s.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e2);
                }
            } catch (Exception e3) {
                s.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e3);
            }
        } catch (ClassCastException e4) {
            s.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e4);
        } catch (ClassNotFoundException e5) {
            s.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e5);
        }
        A = gVar;
    }

    public h0(String str, k0.a aVar, n2.c cVar, f.h.c.a.o oVar, boolean z2) {
        f.h.b.c.a.x(aVar, "args");
        this.f7755h = cVar;
        StringBuilder sb = new StringBuilder();
        sb.append("//");
        f.h.b.c.a.x(str, "name");
        sb.append(str);
        URI create = URI.create(sb.toString());
        f.h.b.c.a.q(create.getHost() != null, "Invalid DNS name: %s", str);
        String authority = create.getAuthority();
        f.h.b.c.a.y(authority, "nameUri (%s) doesn't have an authority", create);
        this.f7752e = authority;
        this.f7753f = create.getHost();
        if (create.getPort() == -1) {
            this.f7754g = aVar.a;
        } else {
            this.f7754g = create.getPort();
        }
        g.a.p0 p0Var = aVar.b;
        f.h.b.c.a.x(p0Var, "proxyDetector");
        this.a = p0Var;
        long j2 = 0;
        if (!z2) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j3 = 30;
            if (property != null) {
                try {
                    j3 = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            j2 = j3 > 0 ? TimeUnit.SECONDS.toNanos(j3) : j3;
        }
        this.f7756i = j2;
        f.h.b.c.a.x(oVar, NotificationCompat.CATEGORY_STOPWATCH);
        this.f7758k = oVar;
        g.a.t0 t0Var = aVar.c;
        f.h.b.c.a.x(t0Var, "syncContext");
        this.f7757j = t0Var;
        Executor executor = aVar.f7546g;
        this.n = executor;
        this.o = executor == null;
        k0.f fVar = aVar.f7543d;
        f.h.b.c.a.x(fVar, "serviceConfigParser");
        this.p = fVar;
    }

    public static g.a.r e(h0 h0Var) {
        g.a.o0 a2 = h0Var.a.a(InetSocketAddress.createUnresolved(h0Var.f7753f, h0Var.f7754g));
        if (a2 != null) {
            return new g.a.r(Collections.singletonList(a2), g.a.a.c);
        }
        return null;
    }

    public static Map<String, ?> g(Map<String, ?> map, Random random, String str) {
        boolean z2;
        boolean z3;
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            f.h.c.a.r.a(t.contains(entry.getKey()), "Bad key: %s", entry);
        }
        List<String> c2 = i1.c(map, "clientLanguage");
        if (c2 != null && !c2.isEmpty()) {
            Iterator<String> it = c2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if ("java".equalsIgnoreCase(it.next())) {
                        z3 = true;
                        break;
                    }
                } else {
                    z3 = false;
                    break;
                }
            }
            if (!z3) {
                return null;
            }
        }
        Double d2 = i1.d(map, "percentage");
        if (d2 != null) {
            int intValue = d2.intValue();
            f.h.c.a.r.a(intValue >= 0 && intValue <= 100, "Bad percentage: %s", d2);
            if (random.nextInt(100) >= intValue) {
                return null;
            }
        }
        List<String> c3 = i1.c(map, "clientHostname");
        if (c3 != null && !c3.isEmpty()) {
            Iterator<String> it2 = c3.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().equals(str)) {
                        z2 = true;
                        break;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
            if (!z2) {
                return null;
            }
        }
        Map<String, ?> f2 = i1.f(map, "serviceConfig");
        if (f2 != null) {
            return f2;
        }
        throw new VerifyException(String.format("key '%s' missing in '%s'", map, "serviceConfig"));
    }

    public static List<Map<String, ?>> h(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.startsWith("grpc_config=")) {
                s.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            } else {
                String substring = str.substring(12);
                Logger logger = h1.a;
                f.h.f.b0.a aVar = new f.h.f.b0.a(new StringReader(substring));
                try {
                    Object a2 = h1.a(aVar);
                    if (a2 instanceof List) {
                        List list2 = (List) a2;
                        i1.a(list2);
                        arrayList.addAll(list2);
                    } else {
                        throw new ClassCastException("wrong type " + a2);
                    }
                } finally {
                    try {
                        aVar.close();
                    } catch (IOException e2) {
                        h1.a.log(Level.WARNING, "Failed to close", (Throwable) e2);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // g.a.k0
    public String a() {
        return this.f7752e;
    }

    @Override // g.a.k0
    public void b() {
        f.h.b.c.a.C(this.r != null, "not started");
        i();
    }

    @Override // g.a.k0
    public void c() {
        if (this.f7760m) {
            return;
        }
        this.f7760m = true;
        Executor executor = this.n;
        if (executor == null || !this.o) {
            return;
        }
        n2.b(this.f7755h, executor);
        this.n = null;
    }

    @Override // g.a.k0
    public void d(k0.d dVar) {
        f.h.b.c.a.C(this.r == null, "already started");
        if (this.o) {
            this.n = (Executor) n2.a(this.f7755h);
        }
        f.h.b.c.a.x(dVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.r = dVar;
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g.a.v0.h0.c f(boolean r10) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.v0.h0.f(boolean):g.a.v0.h0$c");
    }

    public final void i() {
        int i2;
        if (this.q || this.f7760m) {
            return;
        }
        if (!this.f7759l || this.f7756i == 0 || (i2 > 0 && this.f7758k.a(TimeUnit.NANOSECONDS) > this.f7756i)) {
            this.q = true;
            this.n.execute(new e(this.r));
        }
    }

    public final List<g.a.r> j() {
        Exception e2 = null;
        try {
            try {
                b bVar = this.c;
                String str = this.f7753f;
                Objects.requireNonNull((d) bVar);
                List<InetAddress> unmodifiableList = Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
                ArrayList arrayList = new ArrayList(unmodifiableList.size());
                for (InetAddress inetAddress : unmodifiableList) {
                    InetSocketAddress inetSocketAddress = new InetSocketAddress(inetAddress, this.f7754g);
                    arrayList.add(new g.a.r(Collections.singletonList(inetSocketAddress), g.a.a.c));
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e3) {
                e2 = e3;
                f.h.c.a.q.b(e2);
                throw new RuntimeException(e2);
            }
        } catch (Throwable th) {
            if (e2 != null) {
                s.log(Level.FINE, "Address resolution failure", (Throwable) e2);
            }
            throw th;
        }
    }
}
