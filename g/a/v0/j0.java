package g.a.v0;

import g.a.v0.l;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: ExponentialBackoffPolicy.java */
/* loaded from: classes2.dex */
public final class j0 implements l {
    public Random a = new Random();
    public long b = TimeUnit.SECONDS.toNanos(1);
    public long c = TimeUnit.MINUTES.toNanos(2);

    /* renamed from: d  reason: collision with root package name */
    public double f7799d = 1.6d;

    /* renamed from: e  reason: collision with root package name */
    public double f7800e = 0.2d;

    /* renamed from: f  reason: collision with root package name */
    public long f7801f = this.b;

    /* compiled from: ExponentialBackoffPolicy.java */
    /* loaded from: classes2.dex */
    public static final class a implements l.a {
    }

    public long a() {
        long j2 = this.f7801f;
        double d2 = j2;
        this.f7801f = Math.min((long) (this.f7799d * d2), this.c);
        double d3 = this.f7800e;
        double d4 = (-d3) * d2;
        double d5 = d3 * d2;
        f.h.b.c.a.l(d5 >= d4);
        return j2 + ((long) ((this.a.nextDouble() * (d5 - d4)) + d4));
    }
}
