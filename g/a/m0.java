package g.a;

import g.a.k0;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.logging.Logger;

/* compiled from: NameResolverRegistry.java */
/* loaded from: classes2.dex */
public final class m0 {

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f7547e = Logger.getLogger(m0.class.getName());

    /* renamed from: f  reason: collision with root package name */
    public static m0 f7548f;
    public final k0.c a = new b(null);
    public String b = "unknown";
    public final LinkedHashSet<l0> c = new LinkedHashSet<>();

    /* renamed from: d  reason: collision with root package name */
    public f.h.c.b.s<String, l0> f7549d = f.h.c.b.n0.f5958l;

    /* compiled from: NameResolverRegistry.java */
    /* loaded from: classes2.dex */
    public final class b extends k0.c {
        public b(a aVar) {
        }

        @Override // g.a.k0.c
        public String a() {
            String str;
            synchronized (m0.this) {
                str = m0.this.b;
            }
            return str;
        }

        @Override // g.a.k0.c
        public k0 b(URI uri, k0.a aVar) {
            f.h.c.b.s<String, l0> sVar;
            m0 m0Var = m0.this;
            synchronized (m0Var) {
                sVar = m0Var.f7549d;
            }
            l0 l0Var = (l0) ((f.h.c.b.n0) sVar).get(uri.getScheme());
            if (l0Var == null) {
                return null;
            }
            return l0Var.b(uri, aVar);
        }
    }

    /* compiled from: NameResolverRegistry.java */
    /* loaded from: classes2.dex */
    public static final class c implements r0<l0> {
        public c(a aVar) {
        }

        @Override // g.a.r0
        public boolean a(l0 l0Var) {
            return l0Var.c();
        }

        @Override // g.a.r0
        public int b(l0 l0Var) {
            return l0Var.d();
        }
    }

    public final synchronized void a() {
        HashMap hashMap = new HashMap();
        int i2 = Integer.MIN_VALUE;
        String str = "unknown";
        Iterator<l0> it = this.c.iterator();
        while (it.hasNext()) {
            l0 next = it.next();
            String a2 = next.a();
            l0 l0Var = (l0) hashMap.get(a2);
            if (l0Var == null || l0Var.d() < next.d()) {
                hashMap.put(a2, next);
            }
            if (i2 < next.d()) {
                i2 = next.d();
                str = next.a();
            }
        }
        this.f7549d = f.h.c.b.s.a(hashMap);
        this.b = str;
    }
}
