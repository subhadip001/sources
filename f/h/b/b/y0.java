package f.h.b.b;

import android.os.Handler;
import android.util.Pair;
import f.h.b.b.b2.k0.a;
import f.h.b.b.b2.z;
import f.h.b.b.q1;
import f.h.b.b.t1.w0;
import f.h.c.b.q;
import java.util.Objects;

/* compiled from: MediaPeriodQueue.java */
/* loaded from: classes.dex */
public final class y0 {
    public final q1.b a = new q1.b();
    public final q1.c b = new q1.c();
    public final f.h.b.b.t1.w0 c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f4660d;

    /* renamed from: e  reason: collision with root package name */
    public long f4661e;

    /* renamed from: f  reason: collision with root package name */
    public int f4662f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4663g;

    /* renamed from: h  reason: collision with root package name */
    public w0 f4664h;

    /* renamed from: i  reason: collision with root package name */
    public w0 f4665i;

    /* renamed from: j  reason: collision with root package name */
    public w0 f4666j;

    /* renamed from: k  reason: collision with root package name */
    public int f4667k;

    /* renamed from: l  reason: collision with root package name */
    public Object f4668l;

    /* renamed from: m  reason: collision with root package name */
    public long f4669m;

    public y0(f.h.b.b.t1.w0 w0Var, Handler handler) {
        this.c = w0Var;
        this.f4660d = handler;
    }

    public static z.a o(q1 q1Var, Object obj, long j2, long j3, q1.b bVar) {
        q1Var.h(obj, bVar);
        int c = bVar.c(j2);
        if (c == -1) {
            return new z.a(obj, j3, bVar.b(j2));
        }
        return new z.a(obj, c, bVar.e(c), j3);
    }

    public w0 a() {
        w0 w0Var = this.f4664h;
        if (w0Var == null) {
            return null;
        }
        if (w0Var == this.f4665i) {
            this.f4665i = w0Var.f4648l;
        }
        w0Var.h();
        int i2 = this.f4667k - 1;
        this.f4667k = i2;
        if (i2 == 0) {
            this.f4666j = null;
            w0 w0Var2 = this.f4664h;
            this.f4668l = w0Var2.b;
            this.f4669m = w0Var2.f4642f.a.f3914d;
        }
        this.f4664h = this.f4664h.f4648l;
        k();
        return this.f4664h;
    }

    public void b() {
        if (this.f4667k == 0) {
            return;
        }
        w0 w0Var = this.f4664h;
        f.h.b.b.e2.j.i(w0Var);
        w0 w0Var2 = w0Var;
        this.f4668l = w0Var2.b;
        this.f4669m = w0Var2.f4642f.a.f3914d;
        while (w0Var2 != null) {
            w0Var2.h();
            w0Var2 = w0Var2.f4648l;
        }
        this.f4664h = null;
        this.f4666j = null;
        this.f4665i = null;
        this.f4667k = 0;
        k();
    }

    public final x0 c(q1 q1Var, w0 w0Var, long j2) {
        long j3;
        x0 x0Var = w0Var.f4642f;
        long j4 = (w0Var.o + x0Var.f4653e) - j2;
        if (x0Var.f4654f) {
            long j5 = 0;
            int d2 = q1Var.d(q1Var.b(x0Var.a.a), this.a, this.b, this.f4662f, this.f4663g);
            if (d2 == -1) {
                return null;
            }
            int i2 = q1Var.g(d2, this.a, true).c;
            Object obj = this.a.b;
            long j6 = x0Var.a.f3914d;
            if (q1Var.n(i2, this.b).f4477m == d2) {
                Pair<Object, Long> k2 = q1Var.k(this.b, this.a, i2, -9223372036854775807L, Math.max(0L, j4));
                if (k2 == null) {
                    return null;
                }
                obj = k2.first;
                long longValue = ((Long) k2.second).longValue();
                w0 w0Var2 = w0Var.f4648l;
                if (w0Var2 != null && w0Var2.b.equals(obj)) {
                    j6 = w0Var2.f4642f.a.f3914d;
                } else {
                    j6 = this.f4661e;
                    this.f4661e = 1 + j6;
                }
                j3 = longValue;
                j5 = -9223372036854775807L;
            } else {
                j3 = 0;
            }
            return d(q1Var, o(q1Var, obj, j3, j6, this.a), j5, j3);
        }
        z.a aVar = x0Var.a;
        q1Var.h(aVar.a, this.a);
        if (aVar.a()) {
            int i3 = aVar.b;
            a.C0102a[] c0102aArr = this.a.f4467f.f3876d;
            int i4 = c0102aArr[i3].a;
            if (i4 == -1) {
                return null;
            }
            int a = c0102aArr[i3].a(aVar.c);
            if (a < i4) {
                return e(q1Var, aVar.a, i3, a, x0Var.c, aVar.f3914d);
            }
            long j7 = x0Var.c;
            if (j7 == -9223372036854775807L) {
                q1.c cVar = this.b;
                q1.b bVar = this.a;
                Pair<Object, Long> k3 = q1Var.k(cVar, bVar, bVar.c, -9223372036854775807L, Math.max(0L, j4));
                if (k3 == null) {
                    return null;
                }
                j7 = ((Long) k3.second).longValue();
            }
            return f(q1Var, aVar.a, j7, x0Var.c, aVar.f3914d);
        }
        int c = this.a.c(x0Var.f4652d);
        if (c == -1) {
            Object obj2 = aVar.a;
            long j8 = x0Var.f4653e;
            return f(q1Var, obj2, j8, j8, aVar.f3914d);
        }
        return e(q1Var, aVar.a, c, this.a.e(c), x0Var.f4653e, aVar.f3914d);
    }

    public final x0 d(q1 q1Var, z.a aVar, long j2, long j3) {
        q1Var.h(aVar.a, this.a);
        if (aVar.a()) {
            return e(q1Var, aVar.a, aVar.b, aVar.c, j2, aVar.f3914d);
        }
        return f(q1Var, aVar.a, j3, j2, aVar.f3914d);
    }

    public final x0 e(q1 q1Var, Object obj, int i2, int i3, long j2, long j3) {
        z.a aVar = new z.a(obj, i2, i3, j3);
        long a = q1Var.h(obj, this.a).a(aVar.b, aVar.c);
        long j4 = i3 == this.a.f4467f.f3876d[i2].a(-1) ? this.a.f4467f.f3877e : 0L;
        return new x0(aVar, (a == -9223372036854775807L || j4 < a) ? j4 : Math.max(0L, a - 1), j2, -9223372036854775807L, a, false, false, false);
    }

    public final x0 f(q1 q1Var, Object obj, long j2, long j3, long j4) {
        long j5 = j2;
        q1Var.h(obj, this.a);
        int b = this.a.b(j5);
        z.a aVar = new z.a(obj, j4, b);
        boolean h2 = h(aVar);
        boolean j6 = j(q1Var, aVar);
        boolean i2 = i(q1Var, aVar, h2);
        long d2 = b != -1 ? this.a.d(b) : -9223372036854775807L;
        long j7 = (d2 == -9223372036854775807L || d2 == Long.MIN_VALUE) ? this.a.f4465d : d2;
        if (j7 != -9223372036854775807L && j5 >= j7) {
            j5 = Math.max(0L, j7 - 1);
        }
        return new x0(aVar, j5, j3, d2, j7, h2, j6, i2);
    }

    public x0 g(q1 q1Var, x0 x0Var) {
        long j2;
        z.a aVar = x0Var.a;
        boolean h2 = h(aVar);
        boolean j3 = j(q1Var, aVar);
        boolean i2 = i(q1Var, aVar, h2);
        q1Var.h(x0Var.a.a, this.a);
        if (aVar.a()) {
            j2 = this.a.a(aVar.b, aVar.c);
        } else {
            j2 = x0Var.f4652d;
            if (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) {
                j2 = this.a.f4465d;
            }
        }
        return new x0(aVar, x0Var.b, x0Var.c, x0Var.f4652d, j2, h2, j3, i2);
    }

    public final boolean h(z.a aVar) {
        return !aVar.a() && aVar.f3915e == -1;
    }

    public final boolean i(q1 q1Var, z.a aVar, boolean z) {
        int b = q1Var.b(aVar.a);
        if (q1Var.n(q1Var.f(b, this.a).c, this.b).f4473i) {
            return false;
        }
        return (q1Var.d(b, this.a, this.b, this.f4662f, this.f4663g) == -1) && z;
    }

    public final boolean j(q1 q1Var, z.a aVar) {
        if (h(aVar)) {
            return q1Var.n(q1Var.h(aVar.a, this.a).c, this.b).n == q1Var.b(aVar.a);
        }
        return false;
    }

    public final void k() {
        if (this.c != null) {
            f.h.c.b.a<Object> aVar = f.h.c.b.q.f5981g;
            final q.a aVar2 = new q.a();
            for (w0 w0Var = this.f4664h; w0Var != null; w0Var = w0Var.f4648l) {
                aVar2.b(w0Var.f4642f.a);
            }
            w0 w0Var2 = this.f4665i;
            final z.a aVar3 = w0Var2 == null ? null : w0Var2.f4642f.a;
            this.f4660d.post(new Runnable() { // from class: f.h.b.b.y
                @Override // java.lang.Runnable
                public final void run() {
                    y0 y0Var = y0.this;
                    q.a aVar4 = aVar2;
                    z.a aVar5 = aVar3;
                    f.h.b.b.t1.w0 w0Var3 = y0Var.c;
                    f.h.c.b.q c = aVar4.c();
                    w0.a aVar6 = w0Var3.f4492i;
                    f1 f1Var = w0Var3.f4495l;
                    Objects.requireNonNull(f1Var);
                    Objects.requireNonNull(aVar6);
                    aVar6.b = f.h.c.b.q.m(c);
                    if (!c.isEmpty()) {
                        aVar6.f4498e = (z.a) c.get(0);
                        Objects.requireNonNull(aVar5);
                        aVar6.f4499f = aVar5;
                    }
                    if (aVar6.f4497d == null) {
                        aVar6.f4497d = w0.a.b(f1Var, aVar6.b, aVar6.f4498e, aVar6.a);
                    }
                    aVar6.d(f1Var.D());
                }
            });
        }
    }

    public void l(long j2) {
        w0 w0Var = this.f4666j;
        if (w0Var != null) {
            f.h.b.b.e2.j.g(w0Var.g());
            if (w0Var.f4640d) {
                w0Var.a.s(j2 - w0Var.o);
            }
        }
    }

    public boolean m(w0 w0Var) {
        boolean z = false;
        f.h.b.b.e2.j.g(w0Var != null);
        if (w0Var.equals(this.f4666j)) {
            return false;
        }
        this.f4666j = w0Var;
        while (true) {
            w0Var = w0Var.f4648l;
            if (w0Var == null) {
                break;
            }
            if (w0Var == this.f4665i) {
                this.f4665i = this.f4664h;
                z = true;
            }
            w0Var.h();
            this.f4667k--;
        }
        w0 w0Var2 = this.f4666j;
        if (w0Var2.f4648l != null) {
            w0Var2.b();
            w0Var2.f4648l = null;
            w0Var2.c();
        }
        k();
        return z;
    }

    public z.a n(q1 q1Var, Object obj, long j2) {
        long j3;
        int b;
        int i2 = q1Var.h(obj, this.a).c;
        Object obj2 = this.f4668l;
        if (obj2 != null && (b = q1Var.b(obj2)) != -1 && q1Var.f(b, this.a).c == i2) {
            j3 = this.f4669m;
        } else {
            w0 w0Var = this.f4664h;
            while (true) {
                if (w0Var != null) {
                    if (w0Var.b.equals(obj)) {
                        j3 = w0Var.f4642f.a.f3914d;
                        break;
                    }
                    w0Var = w0Var.f4648l;
                } else {
                    w0 w0Var2 = this.f4664h;
                    while (true) {
                        if (w0Var2 != null) {
                            int b2 = q1Var.b(w0Var2.b);
                            if (b2 != -1 && q1Var.f(b2, this.a).c == i2) {
                                j3 = w0Var2.f4642f.a.f3914d;
                                break;
                            }
                            w0Var2 = w0Var2.f4648l;
                        } else {
                            j3 = this.f4661e;
                            this.f4661e = 1 + j3;
                            if (this.f4664h == null) {
                                this.f4668l = obj;
                                this.f4669m = j3;
                            }
                        }
                    }
                }
            }
        }
        return o(q1Var, obj, j2, j3, this.a);
    }

    public final boolean p(q1 q1Var) {
        w0 w0Var;
        w0 w0Var2 = this.f4664h;
        if (w0Var2 == null) {
            return true;
        }
        int b = q1Var.b(w0Var2.b);
        while (true) {
            b = q1Var.d(b, this.a, this.b, this.f4662f, this.f4663g);
            while (true) {
                w0Var = w0Var2.f4648l;
                if (w0Var == null || w0Var2.f4642f.f4654f) {
                    break;
                }
                w0Var2 = w0Var;
            }
            if (b == -1 || w0Var == null || q1Var.b(w0Var.b) != b) {
                break;
            }
            w0Var2 = w0Var;
        }
        boolean m2 = m(w0Var2);
        w0Var2.f4642f = g(q1Var, w0Var2.f4642f);
        return !m2;
    }

    public boolean q(q1 q1Var, long j2, long j3) {
        boolean m2;
        x0 x0Var;
        w0 w0Var = this.f4664h;
        w0 w0Var2 = null;
        while (w0Var != null) {
            x0 x0Var2 = w0Var.f4642f;
            if (w0Var2 == null) {
                x0Var = g(q1Var, x0Var2);
            } else {
                x0 c = c(q1Var, w0Var2, j2);
                if (c == null) {
                    m2 = m(w0Var2);
                } else {
                    if (x0Var2.b == c.b && x0Var2.a.equals(c.a)) {
                        x0Var = c;
                    } else {
                        m2 = m(w0Var2);
                    }
                }
                return !m2;
            }
            w0Var.f4642f = x0Var.a(x0Var2.c);
            long j4 = x0Var2.f4653e;
            long j5 = x0Var.f4653e;
            if (!(j4 == -9223372036854775807L || j4 == j5)) {
                return (m(w0Var) || (w0Var == this.f4665i && ((j3 > Long.MIN_VALUE ? 1 : (j3 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j3 > ((j5 > (-9223372036854775807L) ? 1 : (j5 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : w0Var.o + j5) ? 1 : (j3 == ((j5 > (-9223372036854775807L) ? 1 : (j5 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : w0Var.o + j5) ? 0 : -1)) >= 0))) ? false : true;
            }
            w0Var2 = w0Var;
            w0Var = w0Var.f4648l;
        }
        return true;
    }
}
