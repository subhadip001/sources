package f.h.b.b;

import android.util.Pair;
import com.google.android.exoplayer2.source.TrackGroupArray;
import f.h.b.b.a1;
import f.h.b.b.b2.z;
import java.util.Objects;

/* compiled from: MediaPeriodHolder.java */
/* loaded from: classes.dex */
public final class w0 {
    public final f.h.b.b.b2.w a;
    public final Object b;
    public final f.h.b.b.b2.g0[] c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4640d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4641e;

    /* renamed from: f  reason: collision with root package name */
    public x0 f4642f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4643g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean[] f4644h;

    /* renamed from: i  reason: collision with root package name */
    public final k1[] f4645i;

    /* renamed from: j  reason: collision with root package name */
    public final f.h.b.b.d2.l f4646j;

    /* renamed from: k  reason: collision with root package name */
    public final a1 f4647k;

    /* renamed from: l  reason: collision with root package name */
    public w0 f4648l;

    /* renamed from: m  reason: collision with root package name */
    public TrackGroupArray f4649m;
    public f.h.b.b.d2.m n;
    public long o;

    public w0(k1[] k1VarArr, long j2, f.h.b.b.d2.l lVar, f.h.b.b.f2.k kVar, a1 a1Var, x0 x0Var, f.h.b.b.d2.m mVar) {
        this.f4645i = k1VarArr;
        this.o = j2;
        this.f4646j = lVar;
        this.f4647k = a1Var;
        z.a aVar = x0Var.a;
        this.b = aVar.a;
        this.f4642f = x0Var;
        this.f4649m = TrackGroupArray.f878i;
        this.n = mVar;
        this.c = new f.h.b.b.b2.g0[k1VarArr.length];
        this.f4644h = new boolean[k1VarArr.length];
        long j3 = x0Var.b;
        long j4 = x0Var.f4652d;
        Objects.requireNonNull(a1Var);
        Pair pair = (Pair) aVar.a;
        Object obj = pair.first;
        z.a b = aVar.b(pair.second);
        a1.c cVar = a1Var.c.get(obj);
        Objects.requireNonNull(cVar);
        a1Var.f3777h.add(cVar);
        a1.b bVar = a1Var.f3776g.get(cVar);
        if (bVar != null) {
            bVar.a.l(bVar.b);
        }
        cVar.c.add(b);
        f.h.b.b.b2.w m2 = cVar.a.m(b, kVar, j3);
        a1Var.b.put(m2, cVar);
        a1Var.d();
        if (j4 != -9223372036854775807L && j4 != Long.MIN_VALUE) {
            m2 = new f.h.b.b.b2.l(m2, true, 0L, j4);
        }
        this.a = m2;
    }

    public long a(f.h.b.b.d2.m mVar, long j2, boolean z, boolean[] zArr) {
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= mVar.a) {
                break;
            }
            boolean[] zArr2 = this.f4644h;
            if (z || !mVar.a(this.n, i2)) {
                z2 = false;
            }
            zArr2[i2] = z2;
            i2++;
        }
        f.h.b.b.b2.g0[] g0VarArr = this.c;
        int i3 = 0;
        while (true) {
            k1[] k1VarArr = this.f4645i;
            if (i3 >= k1VarArr.length) {
                break;
            }
            if (((g0) k1VarArr[i3]).f4248f == 7) {
                g0VarArr[i3] = null;
            }
            i3++;
        }
        b();
        this.n = mVar;
        c();
        long m2 = this.a.m(mVar.c, this.f4644h, this.c, zArr, j2);
        f.h.b.b.b2.g0[] g0VarArr2 = this.c;
        int i4 = 0;
        while (true) {
            k1[] k1VarArr2 = this.f4645i;
            if (i4 >= k1VarArr2.length) {
                break;
            }
            if (((g0) k1VarArr2[i4]).f4248f == 7 && this.n.b(i4)) {
                g0VarArr2[i4] = new f.h.b.b.b2.o();
            }
            i4++;
        }
        this.f4641e = false;
        int i5 = 0;
        while (true) {
            f.h.b.b.b2.g0[] g0VarArr3 = this.c;
            if (i5 >= g0VarArr3.length) {
                return m2;
            }
            if (g0VarArr3[i5] != null) {
                f.h.b.b.e2.j.g(mVar.b(i5));
                if (((g0) this.f4645i[i5]).f4248f != 7) {
                    this.f4641e = true;
                }
            } else {
                f.h.b.b.e2.j.g(mVar.c[i5] == null);
            }
            i5++;
        }
    }

    public final void b() {
        if (!g()) {
            return;
        }
        int i2 = 0;
        while (true) {
            f.h.b.b.d2.m mVar = this.n;
            if (i2 >= mVar.a) {
                return;
            }
            boolean b = mVar.b(i2);
            f.h.b.b.d2.g gVar = this.n.c[i2];
            if (b && gVar != null) {
                gVar.g();
            }
            i2++;
        }
    }

    public final void c() {
        if (!g()) {
            return;
        }
        int i2 = 0;
        while (true) {
            f.h.b.b.d2.m mVar = this.n;
            if (i2 >= mVar.a) {
                return;
            }
            boolean b = mVar.b(i2);
            f.h.b.b.d2.g gVar = this.n.c[i2];
            if (b && gVar != null) {
                gVar.e();
            }
            i2++;
        }
    }

    public long d() {
        if (!this.f4640d) {
            return this.f4642f.b;
        }
        long q = this.f4641e ? this.a.q() : Long.MIN_VALUE;
        return q == Long.MIN_VALUE ? this.f4642f.f4653e : q;
    }

    public long e() {
        return this.f4642f.b + this.o;
    }

    public boolean f() {
        return this.f4640d && (!this.f4641e || this.a.q() == Long.MIN_VALUE);
    }

    public final boolean g() {
        return this.f4648l == null;
    }

    public void h() {
        b();
        long j2 = this.f4642f.f4652d;
        a1 a1Var = this.f4647k;
        f.h.b.b.b2.w wVar = this.a;
        try {
            if (j2 != -9223372036854775807L && j2 != Long.MIN_VALUE) {
                a1Var.h(((f.h.b.b.b2.l) wVar).f3880f);
            } else {
                a1Var.h(wVar);
            }
        } catch (RuntimeException e2) {
            f.h.b.b.g2.m.b("MediaPeriodHolder", "Period release failed.", e2);
        }
    }

    public f.h.b.b.d2.m i(float f2, q1 q1Var) {
        f.h.b.b.d2.g[] gVarArr;
        f.h.b.b.d2.m b = this.f4646j.b(this.f4645i, this.f4649m, this.f4642f.a, q1Var);
        for (f.h.b.b.d2.g gVar : b.c) {
            if (gVar != null) {
                gVar.i(f2);
            }
        }
        return b;
    }
}
