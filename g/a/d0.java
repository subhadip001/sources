package g.a;

import g.a.c0;
import g.a.k0;
import java.util.Map;

/* compiled from: LoadBalancerProvider.java */
/* loaded from: classes2.dex */
public abstract class d0 extends c0.c {
    public static final k0.b a = new k0.b(new a());

    /* compiled from: LoadBalancerProvider.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public String toString() {
            return "service config is unused";
        }
    }

    public abstract String b();

    public abstract int c();

    public abstract boolean d();

    public k0.b e(Map<String, ?> map) {
        return a;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        f.h.c.a.i c1 = f.h.b.c.a.c1(this);
        c1.c("policy", b());
        c1.a("priority", c());
        c1.d("available", d());
        return c1.toString();
    }
}
