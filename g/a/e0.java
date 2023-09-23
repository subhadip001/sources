package g.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: LoadBalancerRegistry.java */
/* loaded from: classes2.dex */
public final class e0 {
    public static final Logger c = Logger.getLogger(e0.class.getName());

    /* renamed from: d  reason: collision with root package name */
    public static e0 f7535d;

    /* renamed from: e  reason: collision with root package name */
    public static final Iterable<Class<?>> f7536e;
    public final LinkedHashSet<d0> a = new LinkedHashSet<>();
    public final LinkedHashMap<String, d0> b = new LinkedHashMap<>();

    /* compiled from: LoadBalancerRegistry.java */
    /* loaded from: classes2.dex */
    public static final class a implements r0<d0> {
        @Override // g.a.r0
        public boolean a(d0 d0Var) {
            return d0Var.d();
        }

        @Override // g.a.r0
        public int b(d0 d0Var) {
            return d0Var.c();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("g.a.v0.a2"));
        } catch (ClassNotFoundException e2) {
            c.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e2);
        }
        try {
            arrayList.add(Class.forName("g.a.z0.b"));
        } catch (ClassNotFoundException e3) {
            c.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e3);
        }
        f7536e = Collections.unmodifiableList(arrayList);
    }

    public synchronized d0 a(String str) {
        LinkedHashMap<String, d0> linkedHashMap;
        linkedHashMap = this.b;
        f.h.b.c.a.x(str, "policy");
        return linkedHashMap.get(str);
    }

    public final synchronized void b() {
        this.b.clear();
        Iterator<d0> it = this.a.iterator();
        while (it.hasNext()) {
            d0 next = it.next();
            String b = next.b();
            d0 d0Var = this.b.get(b);
            if (d0Var == null || d0Var.c() < next.c()) {
                this.b.put(b, next);
            }
        }
    }
}
