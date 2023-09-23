package g.a.v0;

import io.grpc.Status;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* compiled from: HedgingPolicy.java */
/* loaded from: classes2.dex */
public final class u0 {

    /* renamed from: d  reason: collision with root package name */
    public static final u0 f7936d = new u0(1, 0, Collections.emptySet());
    public final int a;
    public final long b;
    public final Set<Status.Code> c;

    /* compiled from: HedgingPolicy.java */
    /* loaded from: classes2.dex */
    public interface a {
        u0 get();
    }

    public u0(int i2, long j2, Set<Status.Code> set) {
        this.a = i2;
        this.b = j2;
        this.c = f.h.c.b.v.l(set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u0.class != obj.getClass()) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.a == u0Var.a && this.b == u0Var.b && f.h.b.c.a.i0(this.c, u0Var.c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c});
    }

    public String toString() {
        f.h.c.a.i c1 = f.h.b.c.a.c1(this);
        c1.a("maxAttempts", this.a);
        c1.b("hedgingDelayNanos", this.b);
        c1.c("nonFatalStatusCodes", this.c);
        return c1.toString();
    }
}
