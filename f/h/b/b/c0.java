package f.h.b.b;

import android.util.Pair;
import f.h.b.b.q1;
import java.util.Objects;

/* compiled from: AbstractConcatenatedTimeline.java */
/* loaded from: classes.dex */
public abstract class c0 extends q1 {
    public final int b;
    public final f.h.b.b.b2.i0 c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3916d;

    public c0(boolean z, f.h.b.b.b2.i0 i0Var) {
        this.f3916d = z;
        this.c = i0Var;
        this.b = i0Var.a();
    }

    @Override // f.h.b.b.q1
    public int a(boolean z) {
        if (this.b == 0) {
            return -1;
        }
        if (this.f3916d) {
            z = false;
        }
        int c = z ? this.c.c() : 0;
        do {
            h1 h1Var = (h1) this;
            if (h1Var.f4317i[c].q()) {
                c = r(c, z);
            } else {
                return h1Var.f4317i[c].a(z) + h1Var.f4316h[c];
            }
        } while (c != -1);
        return -1;
    }

    @Override // f.h.b.b.q1
    public final int b(Object obj) {
        int b;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            h1 h1Var = (h1) this;
            Integer num = h1Var.f4319k.get(obj2);
            int intValue = num == null ? -1 : num.intValue();
            if (intValue == -1 || (b = h1Var.f4317i[intValue].b(obj3)) == -1) {
                return -1;
            }
            return h1Var.f4315g[intValue] + b;
        }
        return -1;
    }

    @Override // f.h.b.b.q1
    public int c(boolean z) {
        int i2 = this.b;
        if (i2 == 0) {
            return -1;
        }
        if (this.f3916d) {
            z = false;
        }
        int g2 = z ? this.c.g() : i2 - 1;
        do {
            h1 h1Var = (h1) this;
            if (h1Var.f4317i[g2].q()) {
                g2 = s(g2, z);
            } else {
                return h1Var.f4317i[g2].c(z) + h1Var.f4316h[g2];
            }
        } while (g2 != -1);
        return -1;
    }

    @Override // f.h.b.b.q1
    public int e(int i2, int i3, boolean z) {
        if (this.f3916d) {
            if (i3 == 1) {
                i3 = 2;
            }
            z = false;
        }
        h1 h1Var = (h1) this;
        int d2 = f.h.b.b.g2.b0.d(h1Var.f4316h, i2 + 1, false, false);
        int i4 = h1Var.f4316h[d2];
        int e2 = h1Var.f4317i[d2].e(i2 - i4, i3 != 2 ? i3 : 0, z);
        if (e2 != -1) {
            return i4 + e2;
        }
        int r = r(d2, z);
        while (r != -1 && h1Var.f4317i[r].q()) {
            r = r(r, z);
        }
        if (r != -1) {
            return h1Var.f4317i[r].a(z) + h1Var.f4316h[r];
        } else if (i3 == 2) {
            return a(z);
        } else {
            return -1;
        }
    }

    @Override // f.h.b.b.q1
    public final q1.b g(int i2, q1.b bVar, boolean z) {
        h1 h1Var = (h1) this;
        int d2 = f.h.b.b.g2.b0.d(h1Var.f4315g, i2 + 1, false, false);
        int i3 = h1Var.f4316h[d2];
        h1Var.f4317i[d2].g(i2 - h1Var.f4315g[d2], bVar, z);
        bVar.c += i3;
        if (z) {
            Object obj = h1Var.f4318j[d2];
            Object obj2 = bVar.b;
            Objects.requireNonNull(obj2);
            bVar.b = Pair.create(obj, obj2);
        }
        return bVar;
    }

    @Override // f.h.b.b.q1
    public final q1.b h(Object obj, q1.b bVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        h1 h1Var = (h1) this;
        Integer num = h1Var.f4319k.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        int i2 = h1Var.f4316h[intValue];
        h1Var.f4317i[intValue].h(obj3, bVar);
        bVar.c += i2;
        bVar.b = obj;
        return bVar;
    }

    @Override // f.h.b.b.q1
    public int l(int i2, int i3, boolean z) {
        if (this.f3916d) {
            if (i3 == 1) {
                i3 = 2;
            }
            z = false;
        }
        h1 h1Var = (h1) this;
        int d2 = f.h.b.b.g2.b0.d(h1Var.f4316h, i2 + 1, false, false);
        int i4 = h1Var.f4316h[d2];
        int l2 = h1Var.f4317i[d2].l(i2 - i4, i3 != 2 ? i3 : 0, z);
        if (l2 != -1) {
            return i4 + l2;
        }
        int s = s(d2, z);
        while (s != -1 && h1Var.f4317i[s].q()) {
            s = s(s, z);
        }
        if (s != -1) {
            return h1Var.f4317i[s].c(z) + h1Var.f4316h[s];
        } else if (i3 == 2) {
            return c(z);
        } else {
            return -1;
        }
    }

    @Override // f.h.b.b.q1
    public final Object m(int i2) {
        h1 h1Var = (h1) this;
        int d2 = f.h.b.b.g2.b0.d(h1Var.f4315g, i2 + 1, false, false);
        return Pair.create(h1Var.f4318j[d2], h1Var.f4317i[d2].m(i2 - h1Var.f4315g[d2]));
    }

    @Override // f.h.b.b.q1
    public final q1.c o(int i2, q1.c cVar, long j2) {
        h1 h1Var = (h1) this;
        int d2 = f.h.b.b.g2.b0.d(h1Var.f4316h, i2 + 1, false, false);
        int i3 = h1Var.f4316h[d2];
        int i4 = h1Var.f4315g[d2];
        h1Var.f4317i[d2].o(i2 - i3, cVar, j2);
        Object obj = h1Var.f4318j[d2];
        if (!q1.c.r.equals(cVar.a)) {
            obj = Pair.create(obj, cVar.a);
        }
        cVar.a = obj;
        cVar.f4477m += i4;
        cVar.n += i4;
        return cVar;
    }

    public final int r(int i2, boolean z) {
        if (z) {
            return this.c.e(i2);
        }
        if (i2 < this.b - 1) {
            return i2 + 1;
        }
        return -1;
    }

    public final int s(int i2, boolean z) {
        if (z) {
            return this.c.d(i2);
        }
        if (i2 > 0) {
            return i2 - 1;
        }
        return -1;
    }
}
