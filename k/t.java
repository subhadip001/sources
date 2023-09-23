package k;

import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import k.e;
import k.n;
import k.q;
import okhttp3.Protocol;

/* compiled from: OkHttpClient.java */
/* loaded from: classes2.dex */
public class t implements Cloneable, e.a {
    public static final List<Protocol> D = k.c0.c.o(Protocol.HTTP_2, Protocol.HTTP_1_1);
    public static final List<i> E = k.c0.c.o(i.f9117f, i.f9118g);
    public final int A;
    public final int B;
    public final int C;

    /* renamed from: f  reason: collision with root package name */
    public final l f9151f;

    /* renamed from: g  reason: collision with root package name */
    public final List<Protocol> f9152g;

    /* renamed from: h  reason: collision with root package name */
    public final List<i> f9153h;

    /* renamed from: i  reason: collision with root package name */
    public final List<s> f9154i;

    /* renamed from: j  reason: collision with root package name */
    public final List<s> f9155j;

    /* renamed from: k  reason: collision with root package name */
    public final n.b f9156k;

    /* renamed from: l  reason: collision with root package name */
    public final ProxySelector f9157l;

    /* renamed from: m  reason: collision with root package name */
    public final k f9158m;
    public final c n;
    public final SocketFactory o;
    public final SSLSocketFactory p;
    public final k.c0.l.c q;
    public final HostnameVerifier r;
    public final f s;
    public final k.b t;
    public final k.b u;
    public final h v;
    public final m w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    /* compiled from: OkHttpClient.java */
    /* loaded from: classes2.dex */
    public class a extends k.c0.a {
        @Override // k.c0.a
        public void a(q.a aVar, String str, String str2) {
            aVar.a.add(str);
            aVar.a.add(str2.trim());
        }

        @Override // k.c0.a
        public Socket b(h hVar, k.a aVar, k.c0.f.f fVar) {
            for (k.c0.f.c cVar : hVar.f9112d) {
                if (cVar.g(aVar, null) && cVar.h() && cVar != fVar.b()) {
                    if (fVar.f8936m == null && fVar.f8933j.n.size() == 1) {
                        Socket c = fVar.c(true, false, false);
                        fVar.f8933j = cVar;
                        cVar.n.add(fVar.f8933j.n.get(0));
                        return c;
                    }
                    throw new IllegalStateException();
                }
            }
            return null;
        }

        @Override // k.c0.a
        public k.c0.f.c c(h hVar, k.a aVar, k.c0.f.f fVar, b0 b0Var) {
            for (k.c0.f.c cVar : hVar.f9112d) {
                if (cVar.g(aVar, b0Var)) {
                    fVar.a(cVar, true);
                    return cVar;
                }
            }
            return null;
        }
    }

    /* compiled from: OkHttpClient.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: i  reason: collision with root package name */
        public c f9164i;

        /* renamed from: m  reason: collision with root package name */
        public k.b f9168m;
        public k.b n;
        public h o;
        public m p;
        public boolean q;
        public boolean r;
        public boolean s;
        public int t;
        public int u;
        public int v;

        /* renamed from: d  reason: collision with root package name */
        public final List<s> f9159d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final List<s> f9160e = new ArrayList();
        public l a = new l();
        public List<Protocol> b = t.D;
        public List<i> c = t.E;

        /* renamed from: f  reason: collision with root package name */
        public n.b f9161f = new o(n.a);

        /* renamed from: g  reason: collision with root package name */
        public ProxySelector f9162g = ProxySelector.getDefault();

        /* renamed from: h  reason: collision with root package name */
        public k f9163h = k.a;

        /* renamed from: j  reason: collision with root package name */
        public SocketFactory f9165j = SocketFactory.getDefault();

        /* renamed from: k  reason: collision with root package name */
        public HostnameVerifier f9166k = k.c0.l.d.a;

        /* renamed from: l  reason: collision with root package name */
        public f f9167l = f.c;

        public b() {
            k.b bVar = k.b.a;
            this.f9168m = bVar;
            this.n = bVar;
            this.o = new h();
            this.p = m.a;
            this.q = true;
            this.r = true;
            this.s = true;
            this.t = 10000;
            this.u = 10000;
            this.v = 10000;
        }
    }

    static {
        k.c0.a.a = new a();
    }

    public t() {
        this(new b());
    }

    public t(b bVar) {
        boolean z;
        this.f9151f = bVar.a;
        this.f9152g = bVar.b;
        List<i> list = bVar.c;
        this.f9153h = list;
        this.f9154i = k.c0.c.n(bVar.f9159d);
        this.f9155j = k.c0.c.n(bVar.f9160e);
        this.f9156k = bVar.f9161f;
        this.f9157l = bVar.f9162g;
        this.f9158m = bVar.f9163h;
        this.n = bVar.f9164i;
        this.o = bVar.f9165j;
        loop0: while (true) {
            for (i iVar : list) {
                z = z || iVar.a;
            }
        }
        if (!z) {
            this.p = null;
            this.q = null;
        } else {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                    X509TrustManager x509TrustManager = (X509TrustManager) trustManagers[0];
                    try {
                        k.c0.k.f fVar = k.c0.k.f.a;
                        SSLContext g2 = fVar.g();
                        g2.init(null, new TrustManager[]{x509TrustManager}, null);
                        this.p = g2.getSocketFactory();
                        this.q = fVar.c(x509TrustManager);
                    } catch (GeneralSecurityException e2) {
                        throw k.c0.c.a("No System TLS", e2);
                    }
                } else {
                    throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
                }
            } catch (GeneralSecurityException e3) {
                throw k.c0.c.a("No System TLS", e3);
            }
        }
        this.r = bVar.f9166k;
        f fVar2 = bVar.f9167l;
        k.c0.l.c cVar = this.q;
        this.s = k.c0.c.k(fVar2.b, cVar) ? fVar2 : new f(fVar2.a, cVar);
        this.t = bVar.f9168m;
        this.u = bVar.n;
        this.v = bVar.o;
        this.w = bVar.p;
        this.x = bVar.q;
        this.y = bVar.r;
        this.z = bVar.s;
        this.A = bVar.t;
        this.B = bVar.u;
        this.C = bVar.v;
        if (!this.f9154i.contains(null)) {
            if (this.f9155j.contains(null)) {
                StringBuilder A = f.a.b.a.a.A("Null network interceptor: ");
                A.append(this.f9155j);
                throw new IllegalStateException(A.toString());
            }
            return;
        }
        StringBuilder A2 = f.a.b.a.a.A("Null interceptor: ");
        A2.append(this.f9154i);
        throw new IllegalStateException(A2.toString());
    }
}
