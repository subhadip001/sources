package k.c0.f;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k.b0;
import k.n;
import k.r;

/* compiled from: RouteSelector.java */
/* loaded from: classes2.dex */
public final class e {
    public final k.a a;
    public final d b;
    public final k.e c;

    /* renamed from: d  reason: collision with root package name */
    public final n f8922d;

    /* renamed from: e  reason: collision with root package name */
    public List<Proxy> f8923e;

    /* renamed from: f  reason: collision with root package name */
    public int f8924f;

    /* renamed from: g  reason: collision with root package name */
    public List<InetSocketAddress> f8925g = Collections.emptyList();

    /* renamed from: h  reason: collision with root package name */
    public final List<b0> f8926h = new ArrayList();

    /* compiled from: RouteSelector.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public final List<b0> a;
        public int b = 0;

        public a(List<b0> list) {
            this.a = list;
        }

        public boolean a() {
            return this.b < this.a.size();
        }
    }

    public e(k.a aVar, d dVar, k.e eVar, n nVar) {
        this.f8923e = Collections.emptyList();
        this.a = aVar;
        this.b = dVar;
        this.c = eVar;
        this.f8922d = nVar;
        r rVar = aVar.a;
        Proxy proxy = aVar.f8850h;
        if (proxy != null) {
            this.f8923e = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = aVar.f8849g.select(rVar.o());
            this.f8923e = (select == null || select.isEmpty()) ? k.c0.c.o(Proxy.NO_PROXY) : k.c0.c.n(select);
        }
        this.f8924f = 0;
    }

    public void a(b0 b0Var, IOException iOException) {
        k.a aVar;
        ProxySelector proxySelector;
        if (b0Var.b.type() != Proxy.Type.DIRECT && (proxySelector = (aVar = this.a).f8849g) != null) {
            proxySelector.connectFailed(aVar.a.o(), b0Var.b.address(), iOException);
        }
        d dVar = this.b;
        synchronized (dVar) {
            dVar.a.add(b0Var);
        }
    }

    public boolean b() {
        return c() || !this.f8926h.isEmpty();
    }

    public final boolean c() {
        return this.f8924f < this.f8923e.size();
    }
}
