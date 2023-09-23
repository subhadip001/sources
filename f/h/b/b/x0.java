package f.h.b.b;

import f.h.b.b.b2.z;

/* compiled from: MediaPeriodInfo.java */
/* loaded from: classes.dex */
public final class x0 {
    public final z.a a;
    public final long b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4652d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4653e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4654f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4655g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f4656h;

    public x0(z.a aVar, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3) {
        this.a = aVar;
        this.b = j2;
        this.c = j3;
        this.f4652d = j4;
        this.f4653e = j5;
        this.f4654f = z;
        this.f4655g = z2;
        this.f4656h = z3;
    }

    public x0 a(long j2) {
        return j2 == this.c ? this : new x0(this.a, this.b, j2, this.f4652d, this.f4653e, this.f4654f, this.f4655g, this.f4656h);
    }

    public x0 b(long j2) {
        return j2 == this.b ? this : new x0(this.a, j2, this.c, this.f4652d, this.f4653e, this.f4654f, this.f4655g, this.f4656h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x0.class != obj.getClass()) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.b == x0Var.b && this.c == x0Var.c && this.f4652d == x0Var.f4652d && this.f4653e == x0Var.f4653e && this.f4654f == x0Var.f4654f && this.f4655g == x0Var.f4655g && this.f4656h == x0Var.f4656h && f.h.b.b.g2.b0.a(this.a, x0Var.a);
    }

    public int hashCode() {
        return ((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.f4652d)) * 31) + ((int) this.f4653e)) * 31) + (this.f4654f ? 1 : 0)) * 31) + (this.f4655g ? 1 : 0)) * 31) + (this.f4656h ? 1 : 0);
    }
}
