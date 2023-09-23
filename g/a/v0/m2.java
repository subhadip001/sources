package g.a.v0;

import com.google.common.base.VerifyException;
import g.a.k0;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: ServiceConfigUtil.java */
/* loaded from: classes2.dex */
public final class m2 {

    /* compiled from: ServiceConfigUtil.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public final String a;
        public final Map<String, ?> b;

        public a(String str, Map<String, ?> map) {
            f.h.b.c.a.x(str, "policyName");
            this.a = str;
            f.h.b.c.a.x(map, "rawConfigValue");
            this.b = map;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.a.equals(aVar.a) && this.b.equals(aVar.b);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b});
        }

        public String toString() {
            f.h.c.a.i c1 = f.h.b.c.a.c1(this);
            c1.c("policyName", this.a);
            c1.c("rawConfigValue", this.b);
            return c1.toString();
        }
    }

    /* compiled from: ServiceConfigUtil.java */
    /* loaded from: classes2.dex */
    public static final class b {
        public final g.a.d0 a;
        @Deprecated
        public final Map<String, ?> b;
        public final Object c;

        public b(g.a.d0 d0Var, Map<String, ?> map, Object obj) {
            f.h.b.c.a.x(d0Var, "provider");
            this.a = d0Var;
            this.b = map;
            this.c = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return f.h.b.c.a.i0(this.a, bVar.a) && f.h.b.c.a.i0(this.b, bVar.b) && f.h.b.c.a.i0(this.c, bVar.c);
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
        }

        public String toString() {
            f.h.c.a.i c1 = f.h.b.c.a.c1(this);
            c1.c("provider", this.a);
            c1.c("rawConfig", this.b);
            c1.c("config", this.c);
            return c1.toString();
        }
    }

    public static Set<Status.Code> a(Map<String, ?> map, String str) {
        Status.Code valueOf;
        List<?> b2 = i1.b(map, str);
        if (b2 == null) {
            return null;
        }
        EnumSet noneOf = EnumSet.noneOf(Status.Code.class);
        for (Object obj : b2) {
            if (obj instanceof Double) {
                Double d2 = (Double) obj;
                int intValue = d2.intValue();
                f.h.c.a.r.a(((double) intValue) == d2.doubleValue(), "Status code %s is not integral", obj);
                valueOf = Status.d(intValue).a;
                f.h.c.a.r.a(valueOf.value() == d2.intValue(), "Status code %s is not valid", obj);
            } else if (obj instanceof String) {
                try {
                    valueOf = Status.Code.valueOf((String) obj);
                } catch (IllegalArgumentException e2) {
                    throw new VerifyException("Status code " + obj + " is not valid", e2);
                }
            } else {
                throw new VerifyException("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass());
            }
            noneOf.add(valueOf);
        }
        return Collections.unmodifiableSet(noneOf);
    }

    public static List<Map<String, ?>> b(Map<String, ?> map) {
        String g2;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            List<?> b2 = i1.b(map, "loadBalancingConfig");
            if (b2 == null) {
                b2 = null;
            } else {
                i1.a(b2);
            }
            arrayList.addAll(b2);
        }
        if (arrayList.isEmpty() && (g2 = i1.g(map, "loadBalancingPolicy")) != null) {
            arrayList.add(Collections.singletonMap(g2.toLowerCase(Locale.ROOT), Collections.emptyMap()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static k0.b c(List<a> list, g.a.e0 e0Var) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : list) {
            String str = aVar.a;
            g.a.d0 a2 = e0Var.a(str);
            if (a2 == null) {
                arrayList.add(str);
            } else {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(m2.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                k0.b e2 = a2.e(aVar.b);
                return e2.a != null ? e2 : new k0.b(new b(a2, aVar.b, e2.b));
            }
        }
        Status status = Status.f8687h;
        return new k0.b(status.h("None of " + arrayList + " specified by Service Config are available."));
    }

    public static List<a> d(List<Map<String, ?>> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map<String, ?> map : list) {
            if (map.size() == 1) {
                String key = map.entrySet().iterator().next().getKey();
                arrayList.add(new a(key, i1.f(map, key)));
            } else {
                StringBuilder A = f.a.b.a.a.A("There are ");
                A.append(map.size());
                A.append(" fields in a LoadBalancingConfig object. Exactly one is expected. Config=");
                A.append(map);
                throw new RuntimeException(A.toString());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
