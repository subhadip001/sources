package g.a.v0;

import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import g.a.v0.h2;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: ManagedChannelServiceConfig.java */
/* loaded from: classes2.dex */
public final class t1 {
    public final a a;
    public final Map<String, a> b;
    public final Map<String, a> c;

    /* renamed from: d  reason: collision with root package name */
    public final h2.x f7927d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f7928e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, ?> f7929f;

    /* compiled from: ManagedChannelServiceConfig.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public final Long a;
        public final Boolean b;
        public final Integer c;

        /* renamed from: d  reason: collision with root package name */
        public final Integer f7930d;

        /* renamed from: e  reason: collision with root package name */
        public final i2 f7931e;

        /* renamed from: f  reason: collision with root package name */
        public final u0 f7932f;

        public a(Map<String, ?> map, boolean z, int i2, int i3) {
            Boolean bool;
            i2 i2Var;
            u0 u0Var;
            this.a = i1.h(map, "timeout");
            int i4 = i1.b;
            if (map.containsKey("waitForReady")) {
                Object obj = map.get("waitForReady");
                if (obj instanceof Boolean) {
                    bool = (Boolean) obj;
                } else {
                    throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, "waitForReady", map));
                }
            } else {
                bool = null;
            }
            this.b = bool;
            Integer e2 = i1.e(map, "maxResponseMessageBytes");
            this.c = e2;
            if (e2 != null) {
                f.h.b.c.a.q(e2.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", e2);
            }
            Integer e3 = i1.e(map, "maxRequestMessageBytes");
            this.f7930d = e3;
            if (e3 != null) {
                f.h.b.c.a.q(e3.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", e3);
            }
            Map<String, ?> f2 = z ? i1.f(map, "retryPolicy") : null;
            if (f2 == null) {
                i2Var = i2.f7796f;
            } else {
                Integer e4 = i1.e(f2, "maxAttempts");
                f.h.b.c.a.x(e4, "maxAttempts cannot be empty");
                int intValue = e4.intValue();
                f.h.b.c.a.o(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
                int min = Math.min(intValue, i2);
                Long h2 = i1.h(f2, "initialBackoff");
                f.h.b.c.a.x(h2, "initialBackoff cannot be empty");
                long longValue = h2.longValue();
                f.h.b.c.a.p(longValue > 0, "initialBackoffNanos must be greater than 0: %s", longValue);
                Long h3 = i1.h(f2, "maxBackoff");
                f.h.b.c.a.x(h3, "maxBackoff cannot be empty");
                long longValue2 = h3.longValue();
                f.h.b.c.a.p(longValue2 > 0, "maxBackoff must be greater than 0: %s", longValue2);
                Double d2 = i1.d(f2, "backoffMultiplier");
                f.h.b.c.a.x(d2, "backoffMultiplier cannot be empty");
                double doubleValue = d2.doubleValue();
                f.h.b.c.a.q(doubleValue > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, "backoffMultiplier must be greater than 0: %s", Double.valueOf(doubleValue));
                Set<Status.Code> a = m2.a(f2, "retryableStatusCodes");
                f.h.c.a.r.a(a != null, "%s is required in retry policy", "retryableStatusCodes");
                f.h.c.a.r.a(!a.isEmpty(), "%s must not be empty", "retryableStatusCodes");
                f.h.c.a.r.a(!a.contains(Status.Code.OK), "%s must not contain OK", "retryableStatusCodes");
                i2Var = new i2(min, longValue, longValue2, doubleValue, a);
            }
            this.f7931e = i2Var;
            Map<String, ?> f3 = z ? i1.f(map, "hedgingPolicy") : null;
            if (f3 == null) {
                u0Var = u0.f7936d;
            } else {
                Integer e5 = i1.e(f3, "maxAttempts");
                f.h.b.c.a.x(e5, "maxAttempts cannot be empty");
                int intValue2 = e5.intValue();
                f.h.b.c.a.o(intValue2 >= 2, "maxAttempts must be greater than 1: %s", intValue2);
                int min2 = Math.min(intValue2, i3);
                Long h4 = i1.h(f3, "hedgingDelay");
                f.h.b.c.a.x(h4, "hedgingDelay cannot be empty");
                long longValue3 = h4.longValue();
                f.h.b.c.a.p(longValue3 >= 0, "hedgingDelay must not be negative: %s", longValue3);
                Set<Status.Code> a2 = m2.a(f3, "nonFatalStatusCodes");
                if (a2 == null) {
                    a2 = Collections.unmodifiableSet(EnumSet.noneOf(Status.Code.class));
                } else {
                    f.h.c.a.r.a(!a2.contains(Status.Code.OK), "%s must not contain OK", "nonFatalStatusCodes");
                }
                u0Var = new u0(min2, longValue3, a2);
            }
            this.f7932f = u0Var;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return f.h.b.c.a.i0(this.a, aVar.a) && f.h.b.c.a.i0(this.b, aVar.b) && f.h.b.c.a.i0(this.c, aVar.c) && f.h.b.c.a.i0(this.f7930d, aVar.f7930d) && f.h.b.c.a.i0(this.f7931e, aVar.f7931e) && f.h.b.c.a.i0(this.f7932f, aVar.f7932f);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.f7930d, this.f7931e, this.f7932f});
        }

        public String toString() {
            f.h.c.a.i c1 = f.h.b.c.a.c1(this);
            c1.c("timeoutNanos", this.a);
            c1.c("waitForReady", this.b);
            c1.c("maxInboundMessageSize", this.c);
            c1.c("maxOutboundMessageSize", this.f7930d);
            c1.c("retryPolicy", this.f7931e);
            c1.c("hedgingPolicy", this.f7932f);
            return c1.toString();
        }
    }

    public t1(a aVar, Map<String, a> map, Map<String, a> map2, h2.x xVar, Object obj, Map<String, ?> map3) {
        this.a = aVar;
        this.b = Collections.unmodifiableMap(new HashMap(map));
        this.c = Collections.unmodifiableMap(new HashMap(map2));
        this.f7927d = xVar;
        this.f7928e = obj;
        this.f7929f = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    public static t1 a(Map<String, ?> map, boolean z, int i2, int i3, Object obj) {
        h2.x xVar;
        Map<String, ?> f2;
        h2.x xVar2;
        if (z) {
            if (map == null || (f2 = i1.f(map, "retryThrottling")) == null) {
                xVar2 = null;
            } else {
                float floatValue = i1.d(f2, "maxTokens").floatValue();
                float floatValue2 = i1.d(f2, "tokenRatio").floatValue();
                f.h.b.c.a.C(floatValue > 0.0f, "maxToken should be greater than zero");
                f.h.b.c.a.C(floatValue2 > 0.0f, "tokenRatio should be greater than zero");
                xVar2 = new h2.x(floatValue, floatValue2);
            }
            xVar = xVar2;
        } else {
            xVar = null;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Map<String, ?> f3 = map == null ? null : i1.f(map, "healthCheckConfig");
        List<?> b = i1.b(map, "methodConfig");
        if (b == null) {
            b = null;
        } else {
            i1.a(b);
        }
        if (b == null) {
            return new t1(null, hashMap, hashMap2, xVar, obj, f3);
        }
        Iterator<?> it = b.iterator();
        a aVar = null;
        while (it.hasNext()) {
            Map map2 = (Map) it.next();
            a aVar2 = new a(map2, z, i2, i3);
            List<?> b2 = i1.b(map2, "name");
            if (b2 == null) {
                b2 = null;
            } else {
                i1.a(b2);
            }
            if (b2 != null && !b2.isEmpty()) {
                Iterator<?> it2 = b2.iterator();
                while (it2.hasNext()) {
                    Map map3 = (Map) it2.next();
                    String g2 = i1.g(map3, NotificationCompat.CATEGORY_SERVICE);
                    String g3 = i1.g(map3, FirebaseAnalytics.Param.METHOD);
                    if (f.h.b.c.a.B0(g2)) {
                        f.h.b.c.a.q(f.h.b.c.a.B0(g3), "missing service name for method %s", g3);
                        f.h.b.c.a.q(aVar == null, "Duplicate default method config in service config %s", map);
                        aVar = aVar2;
                    } else if (f.h.b.c.a.B0(g3)) {
                        f.h.b.c.a.q(!hashMap2.containsKey(g2), "Duplicate service %s", g2);
                        hashMap2.put(g2, aVar2);
                    } else {
                        String a2 = MethodDescriptor.a(g2, g3);
                        f.h.b.c.a.q(!hashMap.containsKey(a2), "Duplicate method name %s", a2);
                        hashMap.put(a2, aVar2);
                    }
                }
            }
        }
        return new t1(aVar, hashMap, hashMap2, xVar, obj, f3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t1.class != obj.getClass()) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return f.h.b.c.a.i0(this.b, t1Var.b) && f.h.b.c.a.i0(this.c, t1Var.c) && f.h.b.c.a.i0(this.f7927d, t1Var.f7927d) && f.h.b.c.a.i0(this.f7928e, t1Var.f7928e);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.f7927d, this.f7928e});
    }

    public String toString() {
        f.h.c.a.i c1 = f.h.b.c.a.c1(this);
        c1.c("serviceMethodMap", this.b);
        c1.c("serviceMap", this.c);
        c1.c("retryThrottling", this.f7927d);
        c1.c("loadBalancingConfig", this.f7928e);
        return c1.toString();
    }
}
