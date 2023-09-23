package g.a.v0;

import io.grpc.Status;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* compiled from: RetryPolicy.java */
/* loaded from: classes2.dex */
public final class i2 {

    /* renamed from: f  reason: collision with root package name */
    public static final i2 f7796f = new i2(1, 0, 0, 1.0d, Collections.emptySet());
    public final int a;
    public final long b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final double f7797d;

    /* renamed from: e  reason: collision with root package name */
    public final Set<Status.Code> f7798e;

    /* compiled from: RetryPolicy.java */
    /* loaded from: classes2.dex */
    public interface a {
        i2 get();
    }

    public i2(int i2, long j2, long j3, double d2, Set<Status.Code> set) {
        this.a = i2;
        this.b = j2;
        this.c = j3;
        this.f7797d = d2;
        this.f7798e = f.h.c.b.v.l(set);
    }

    public boolean equals(Object obj) {
        if (obj instanceof i2) {
            i2 i2Var = (i2) obj;
            return this.a == i2Var.a && this.b == i2Var.b && this.c == i2Var.c && Double.compare(this.f7797d, i2Var.f7797d) == 0 && f.h.b.c.a.i0(this.f7798e, i2Var.f7798e);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Double.valueOf(this.f7797d), this.f7798e});
    }

    public String toString() {
        f.h.c.a.i c1 = f.h.b.c.a.c1(this);
        c1.a("maxAttempts", this.a);
        c1.b("initialBackoffNanos", this.b);
        c1.b("maxBackoffNanos", this.c);
        c1.e("backoffMultiplier", String.valueOf(this.f7797d));
        c1.c("retryableStatusCodes", this.f7798e);
        return c1.toString();
    }
}
