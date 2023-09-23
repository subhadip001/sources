package f.h.b.b;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.IllegalSeekPositionException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import f.h.b.b.b2.i0;
import f.h.b.b.b2.z;
import f.h.b.b.f1;
import f.h.b.b.g1;
import f.h.b.b.g2.l;
import f.h.b.b.q0;
import f.h.b.b.q1;
import f.h.b.b.t1.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: ExoPlayerImpl.java */
/* loaded from: classes.dex */
public final class o0 extends f0 implements f1 {
    public final f.h.b.b.d2.m b;
    public final j1[] c;

    /* renamed from: d  reason: collision with root package name */
    public final f.h.b.b.d2.l f4409d;

    /* renamed from: e  reason: collision with root package name */
    public final f.h.b.b.g2.y f4410e;

    /* renamed from: f  reason: collision with root package name */
    public final q0.e f4411f;

    /* renamed from: g  reason: collision with root package name */
    public final q0 f4412g;

    /* renamed from: h  reason: collision with root package name */
    public final f.h.b.b.g2.l<f1.a, f1.b> f4413h;

    /* renamed from: i  reason: collision with root package name */
    public final q1.b f4414i;

    /* renamed from: j  reason: collision with root package name */
    public final List<a> f4415j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f4416k;

    /* renamed from: l  reason: collision with root package name */
    public final f.h.b.b.b2.b0 f4417l;

    /* renamed from: m  reason: collision with root package name */
    public final f.h.b.b.t1.w0 f4418m;
    public final Looper n;
    public final f.h.b.b.f2.d o;
    public final f.h.b.b.g2.f p;
    public int q;
    public boolean r;
    public int s;
    public boolean t;
    public int u;
    public int v;
    public f.h.b.b.b2.i0 w;
    public b1 x;
    public int y;
    public long z;

    /* compiled from: ExoPlayerImpl.java */
    /* loaded from: classes.dex */
    public static final class a implements z0 {
        public final Object a;
        public q1 b;

        public a(Object obj, q1 q1Var) {
            this.a = obj;
            this.b = q1Var;
        }

        @Override // f.h.b.b.z0
        public q1 a() {
            return this.b;
        }

        @Override // f.h.b.b.z0
        public Object getUid() {
            return this.a;
        }
    }

    public o0(j1[] j1VarArr, f.h.b.b.d2.l lVar, f.h.b.b.b2.b0 b0Var, l0 l0Var, f.h.b.b.f2.d dVar, final f.h.b.b.t1.w0 w0Var, boolean z, n1 n1Var, t0 t0Var, long j2, boolean z2, f.h.b.b.g2.f fVar, Looper looper, final f1 f1Var) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = f.h.b.b.g2.b0.f4269e;
        StringBuilder z3 = f.a.b.a.a.z(f.a.b.a.a.x(str, f.a.b.a.a.x(hexString, 30)), "Init ", hexString, " [", "ExoPlayerLib/2.13.2");
        z3.append("] [");
        z3.append(str);
        z3.append("]");
        Log.i("ExoPlayerImpl", z3.toString());
        f.h.b.b.e2.j.g(j1VarArr.length > 0);
        this.c = j1VarArr;
        Objects.requireNonNull(lVar);
        this.f4409d = lVar;
        this.f4417l = b0Var;
        this.o = dVar;
        this.f4418m = w0Var;
        this.f4416k = z;
        this.n = looper;
        this.p = fVar;
        this.q = 0;
        this.f4413h = new f.h.b.b.g2.l<>(new CopyOnWriteArraySet(), looper, fVar, new f.h.c.a.p() { // from class: f.h.b.b.a0
            @Override // f.h.c.a.p
            public final Object get() {
                return new f1.b();
            }
        }, new l.b() { // from class: f.h.b.b.l
            @Override // f.h.b.b.g2.l.b
            public final void a(Object obj, f.h.b.b.g2.q qVar) {
                ((f1.a) obj).u(f1.this, (f1.b) qVar);
            }
        });
        this.f4415j = new ArrayList();
        this.w = new i0.a(0, new Random());
        f.h.b.b.d2.m mVar = new f.h.b.b.d2.m(new l1[j1VarArr.length], new f.h.b.b.d2.g[j1VarArr.length], null);
        this.b = mVar;
        this.f4414i = new q1.b();
        this.y = -1;
        this.f4410e = fVar.b(looper, null);
        o oVar = new o(this);
        this.f4411f = oVar;
        this.x = b1.i(mVar);
        if (w0Var != null) {
            f.h.b.b.e2.j.g(w0Var.f4495l == null || w0Var.f4492i.b.isEmpty());
            w0Var.f4495l = f1Var;
            f.h.b.b.g2.l<f.h.b.b.t1.x0, x0.b> lVar2 = w0Var.f4494k;
            w0Var.f4494k = new f.h.b.b.g2.l<>(lVar2.f4284e, looper, lVar2.a, lVar2.c, new l.b() { // from class: f.h.b.b.t1.v0
                @Override // f.h.b.b.g2.l.b
                public final void a(Object obj, f.h.b.b.g2.q qVar) {
                    x0 x0Var = (x0) obj;
                    x0.b bVar = (x0.b) qVar;
                    SparseArray<x0.a> sparseArray = w0.this.f4493j;
                    bVar.b.clear();
                    int i2 = 0;
                    while (i2 < bVar.a.size()) {
                        f.h.b.b.e2.j.c(i2 >= 0 && i2 < bVar.a.size());
                        int keyAt = bVar.a.keyAt(i2);
                        SparseArray<x0.a> sparseArray2 = bVar.b;
                        x0.a aVar = sparseArray.get(keyAt);
                        Objects.requireNonNull(aVar);
                        sparseArray2.append(keyAt, aVar);
                        i2++;
                    }
                    x0Var.E();
                }
            });
            m(w0Var);
            dVar.f(new Handler(looper), w0Var);
        }
        this.f4412g = new q0(j1VarArr, lVar, mVar, l0Var, dVar, this.q, this.r, w0Var, n1Var, t0Var, j2, z2, looper, fVar, oVar);
    }

    public static boolean M(b1 b1Var) {
        return b1Var.f3790d == 3 && b1Var.f3797k && b1Var.f3798l == 0;
    }

    @Override // f.h.b.b.f1
    public int A() {
        return this.x.f3798l;
    }

    @Override // f.h.b.b.f1
    public TrackGroupArray B() {
        return this.x.f3793g;
    }

    @Override // f.h.b.b.f1
    public int C() {
        return this.q;
    }

    @Override // f.h.b.b.f1
    public q1 D() {
        return this.x.a;
    }

    @Override // f.h.b.b.f1
    public Looper E() {
        return this.n;
    }

    @Override // f.h.b.b.f1
    public boolean F() {
        return this.r;
    }

    @Override // f.h.b.b.f1
    public long G() {
        if (this.x.a.q()) {
            return this.z;
        }
        b1 b1Var = this.x;
        if (b1Var.f3796j.f3914d != b1Var.b.f3914d) {
            return b1Var.a.n(p(), this.a).b();
        }
        long j2 = b1Var.p;
        if (this.x.f3796j.a()) {
            b1 b1Var2 = this.x;
            q1.b h2 = b1Var2.a.h(b1Var2.f3796j.a, this.f4414i);
            long d2 = h2.d(this.x.f3796j.b);
            j2 = d2 == Long.MIN_VALUE ? h2.f4465d : d2;
        }
        return O(this.x.f3796j, j2);
    }

    @Override // f.h.b.b.f1
    public f.h.b.b.d2.k H() {
        return new f.h.b.b.d2.k(this.x.f3794h.c);
    }

    @Override // f.h.b.b.f1
    public int I(int i2) {
        return this.c[i2].x();
    }

    @Override // f.h.b.b.f1
    public long J() {
        if (this.x.a.q()) {
            return this.z;
        }
        if (this.x.b.a()) {
            return h0.b(this.x.r);
        }
        b1 b1Var = this.x;
        return O(b1Var.b, b1Var.r);
    }

    @Override // f.h.b.b.f1
    public f1.c K() {
        return null;
    }

    public final Pair<Object, Long> L(q1 q1Var, int i2, long j2) {
        if (q1Var.q()) {
            this.y = i2;
            if (j2 == -9223372036854775807L) {
                j2 = 0;
            }
            this.z = j2;
            return null;
        }
        if (i2 == -1 || i2 >= q1Var.p()) {
            i2 = q1Var.a(this.r);
            j2 = q1Var.n(i2, this.a).a();
        }
        return q1Var.j(this.a, this.f4414i, i2, h0.a(j2));
    }

    public final b1 N(b1 b1Var, q1 q1Var, Pair<Object, Long> pair) {
        List<Metadata> list;
        int i2;
        long j2;
        f.h.b.b.e2.j.c(q1Var.q() || pair != null);
        q1 q1Var2 = b1Var.a;
        b1 h2 = b1Var.h(q1Var);
        if (q1Var.q()) {
            z.a aVar = b1.s;
            z.a aVar2 = b1.s;
            long a2 = h0.a(this.z);
            long a3 = h0.a(this.z);
            TrackGroupArray trackGroupArray = TrackGroupArray.f878i;
            f.h.b.b.d2.m mVar = this.b;
            f.h.c.b.a<Object> aVar3 = f.h.c.b.q.f5981g;
            b1 a4 = h2.b(aVar2, a2, a3, 0L, trackGroupArray, mVar, f.h.c.b.m0.f5954j).a(aVar2);
            a4.p = a4.r;
            return a4;
        }
        Object obj = h2.b.a;
        int i3 = f.h.b.b.g2.b0.a;
        boolean z = !obj.equals(pair.first);
        z.a aVar4 = z ? new z.a(pair.first) : h2.b;
        long longValue = ((Long) pair.second).longValue();
        long a5 = h0.a(t());
        if (!q1Var2.q()) {
            a5 -= q1Var2.h(obj, this.f4414i).f4466e;
        }
        if (z || longValue < a5) {
            f.h.b.b.e2.j.g(!aVar4.a());
            TrackGroupArray trackGroupArray2 = z ? TrackGroupArray.f878i : h2.f3793g;
            f.h.b.b.d2.m mVar2 = z ? this.b : h2.f3794h;
            if (z) {
                f.h.c.b.a<Object> aVar5 = f.h.c.b.q.f5981g;
                list = f.h.c.b.m0.f5954j;
            } else {
                list = h2.f3795i;
            }
            b1 a6 = h2.b(aVar4, longValue, longValue, 0L, trackGroupArray2, mVar2, list).a(aVar4);
            a6.p = longValue;
            return a6;
        } else if (i2 == 0) {
            int b = q1Var.b(h2.f3796j.a);
            if (b == -1 || q1Var.f(b, this.f4414i).c != q1Var.h(aVar4.a, this.f4414i).c) {
                q1Var.h(aVar4.a, this.f4414i);
                if (aVar4.a()) {
                    j2 = this.f4414i.a(aVar4.b, aVar4.c);
                } else {
                    j2 = this.f4414i.f4465d;
                }
                b1 a7 = h2.b(aVar4, h2.r, h2.r, j2 - h2.r, h2.f3793g, h2.f3794h, h2.f3795i).a(aVar4);
                a7.p = j2;
                return a7;
            }
            return h2;
        } else {
            f.h.b.b.e2.j.g(!aVar4.a());
            long max = Math.max(0L, h2.q - (longValue - a5));
            long j3 = h2.p;
            if (h2.f3796j.equals(h2.b)) {
                j3 = longValue + max;
            }
            b1 b2 = h2.b(aVar4, longValue, longValue, max, h2.f3793g, h2.f3794h, h2.f3795i);
            b2.p = j3;
            return b2;
        }
    }

    public final long O(z.a aVar, long j2) {
        long b = h0.b(j2);
        this.x.a.h(aVar.a, this.f4414i);
        return b + h0.b(this.f4414i.f4466e);
    }

    public final void P(int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            this.f4415j.remove(i4);
        }
        this.w = this.w.b(i2, i3);
    }

    public void Q(boolean z, int i2, int i3) {
        b1 b1Var = this.x;
        if (b1Var.f3797k == z && b1Var.f3798l == i2) {
            return;
        }
        this.s++;
        b1 d2 = b1Var.d(z, i2);
        this.f4412g.f4451l.b(1, z ? 1 : 0, i2).sendToTarget();
        S(d2, false, 4, 0, i3, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void R(boolean r20, com.google.android.exoplayer2.ExoPlaybackException r21) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.o0.R(boolean, com.google.android.exoplayer2.ExoPlaybackException):void");
    }

    public final void S(final b1 b1Var, boolean z, final int i2, final int i3, final int i4, boolean z2) {
        Pair pair;
        int i5;
        final u0 u0Var;
        b1 b1Var2 = this.x;
        this.x = b1Var;
        boolean z3 = !b1Var2.a.equals(b1Var.a);
        q1 q1Var = b1Var2.a;
        q1 q1Var2 = b1Var.a;
        if (q1Var2.q() && q1Var.q()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (q1Var2.q() != q1Var.q()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            Object obj = q1Var.n(q1Var.h(b1Var2.b.a, this.f4414i).c, this.a).a;
            Object obj2 = q1Var2.n(q1Var2.h(b1Var.b.a, this.f4414i).c, this.a).a;
            int i6 = this.a.f4477m;
            if (!obj.equals(obj2)) {
                if (z && i2 == 0) {
                    i5 = 1;
                } else if (z && i2 == 1) {
                    i5 = 2;
                } else if (!z3) {
                    throw new IllegalStateException();
                } else {
                    i5 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i5));
            } else if (z && i2 == 0 && q1Var2.b(b1Var.b.a) == i6) {
                pair = new Pair(Boolean.TRUE, 0);
            } else {
                pair = new Pair(Boolean.FALSE, -1);
            }
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        final int intValue = ((Integer) pair.second).intValue();
        if (!b1Var2.a.equals(b1Var.a)) {
            this.f4413h.b(0, new l.a() { // from class: f.h.b.b.c
                @Override // f.h.b.b.g2.l.a
                public final void b(Object obj3) {
                    b1 b1Var3 = b1.this;
                    ((f1.a) obj3).n(b1Var3.a, i3);
                }
            });
        }
        if (z) {
            this.f4413h.b(12, new l.a() { // from class: f.h.b.b.d
                @Override // f.h.b.b.g2.l.a
                public final void b(Object obj3) {
                    ((f1.a) obj3).e(i2);
                }
            });
        }
        if (booleanValue) {
            if (b1Var.a.q()) {
                u0Var = null;
            } else {
                u0Var = b1Var.a.n(b1Var.a.h(b1Var.b.a, this.f4414i).c, this.a).c;
            }
            this.f4413h.b(1, new l.a() { // from class: f.h.b.b.r
                @Override // f.h.b.b.g2.l.a
                public final void b(Object obj3) {
                    ((f1.a) obj3).A(u0.this, intValue);
                }
            });
        }
        ExoPlaybackException exoPlaybackException = b1Var2.f3791e;
        ExoPlaybackException exoPlaybackException2 = b1Var.f3791e;
        if (exoPlaybackException != exoPlaybackException2 && exoPlaybackException2 != null) {
            this.f4413h.b(11, new l.a() { // from class: f.h.b.b.n
                @Override // f.h.b.b.g2.l.a
                public final void b(Object obj3) {
                    ((f1.a) obj3).j(b1.this.f3791e);
                }
            });
        }
        f.h.b.b.d2.m mVar = b1Var2.f3794h;
        f.h.b.b.d2.m mVar2 = b1Var.f3794h;
        if (mVar != mVar2) {
            this.f4409d.a(mVar2.f4102d);
            final f.h.b.b.d2.k kVar = new f.h.b.b.d2.k(b1Var.f3794h.c);
            this.f4413h.b(2, new l.a() { // from class: f.h.b.b.m
                @Override // f.h.b.b.g2.l.a
                public final void b(Object obj3) {
                    b1 b1Var3 = b1.this;
                    ((f1.a) obj3).I(b1Var3.f3793g, kVar);
                }
            });
        }
        if (!b1Var2.f3795i.equals(b1Var.f3795i)) {
            this.f4413h.b(3, new l.a() { // from class: f.h.b.b.j
                @Override // f.h.b.b.g2.l.a
                public final void b(Object obj3) {
                    ((f1.a) obj3).h(b1.this.f3795i);
                }
            });
        }
        if (b1Var2.f3792f != b1Var.f3792f) {
            this.f4413h.b(4, new l.a() { // from class: f.h.b.b.f
                @Override // f.h.b.b.g2.l.a
                public final void b(Object obj3) {
                    ((f1.a) obj3).m(b1.this.f3792f);
                }
            });
        }
        if (b1Var2.f3790d != b1Var.f3790d || b1Var2.f3797k != b1Var.f3797k) {
            this.f4413h.b(-1, new l.a() { // from class: f.h.b.b.p
                @Override // f.h.b.b.g2.l.a
                public final void b(Object obj3) {
                    b1 b1Var3 = b1.this;
                    ((f1.a) obj3).x(b1Var3.f3797k, b1Var3.f3790d);
                }
            });
        }
        if (b1Var2.f3790d != b1Var.f3790d) {
            this.f4413h.b(5, new l.a() { // from class: f.h.b.b.k
                @Override // f.h.b.b.g2.l.a
                public final void b(Object obj3) {
                    ((f1.a) obj3).p(b1.this.f3790d);
                }
            });
        }
        if (b1Var2.f3797k != b1Var.f3797k) {
            this.f4413h.b(6, new l.a() { // from class: f.h.b.b.v
                @Override // f.h.b.b.g2.l.a
                public final void b(Object obj3) {
                    b1 b1Var3 = b1.this;
                    ((f1.a) obj3).G(b1Var3.f3797k, i4);
                }
            });
        }
        if (b1Var2.f3798l != b1Var.f3798l) {
            this.f4413h.b(7, new l.a() { // from class: f.h.b.b.s
                @Override // f.h.b.b.g2.l.a
                public final void b(Object obj3) {
                    ((f1.a) obj3).d(b1.this.f3798l);
                }
            });
        }
        if (M(b1Var2) != M(b1Var)) {
            this.f4413h.b(8, new l.a() { // from class: f.h.b.b.i
                @Override // f.h.b.b.g2.l.a
                public final void b(Object obj3) {
                    ((f1.a) obj3).O(o0.M(b1.this));
                }
            });
        }
        if (!b1Var2.f3799m.equals(b1Var.f3799m)) {
            this.f4413h.b(13, new l.a() { // from class: f.h.b.b.w
                @Override // f.h.b.b.g2.l.a
                public final void b(Object obj3) {
                    ((f1.a) obj3).K(b1.this.f3799m);
                }
            });
        }
        if (z2) {
            this.f4413h.b(-1, new l.a() { // from class: f.h.b.b.a
                @Override // f.h.b.b.g2.l.a
                public final void b(Object obj3) {
                    ((f1.a) obj3).a();
                }
            });
        }
        if (b1Var2.n != b1Var.n) {
            this.f4413h.b(-1, new l.a() { // from class: f.h.b.b.g
                @Override // f.h.b.b.g2.l.a
                public final void b(Object obj3) {
                    boolean z4 = b1.this.n;
                    Objects.requireNonNull((f1.a) obj3);
                }
            });
        }
        if (b1Var2.o != b1Var.o) {
            this.f4413h.b(-1, new l.a() { // from class: f.h.b.b.u
                @Override // f.h.b.b.g2.l.a
                public final void b(Object obj3) {
                    ((f1.a) obj3).w(b1.this.o);
                }
            });
        }
        this.f4413h.a();
    }

    public g1 a(g1.b bVar) {
        return new g1(this.f4412g, bVar, this.x.a, p(), this.p, this.f4412g.n);
    }

    public final int b() {
        if (this.x.a.q()) {
            return this.y;
        }
        b1 b1Var = this.x;
        return b1Var.a.h(b1Var.b.a, this.f4414i).c;
    }

    @Override // f.h.b.b.f1
    public c1 c() {
        return this.x.f3799m;
    }

    @Override // f.h.b.b.f1
    public void d() {
        b1 b1Var = this.x;
        if (b1Var.f3790d != 1) {
            return;
        }
        b1 e2 = b1Var.e(null);
        b1 g2 = e2.g(e2.a.q() ? 4 : 2);
        this.s++;
        this.f4412g.f4451l.a(0).sendToTarget();
        S(g2, false, 4, 1, 1, false);
    }

    @Override // f.h.b.b.f1
    public boolean e() {
        return this.x.b.a();
    }

    @Override // f.h.b.b.f1
    public long f() {
        return h0.b(this.x.q);
    }

    @Override // f.h.b.b.f1
    public void g(int i2, long j2) {
        q1 q1Var = this.x.a;
        if (i2 >= 0 && (q1Var.q() || i2 < q1Var.p())) {
            this.s++;
            if (e()) {
                Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                q0.d dVar = new q0.d(this.x);
                dVar.a(1);
                o0 o0Var = ((o) this.f4411f).a;
                o0Var.f4410e.a.post(new t(o0Var, dVar));
                return;
            }
            b1 b1Var = this.x;
            b1 N = N(b1Var.g(b1Var.f3790d != 1 ? 2 : 1), q1Var, L(q1Var, i2, j2));
            this.f4412g.f4451l.c(3, new q0.g(q1Var, i2, h0.a(j2))).sendToTarget();
            S(N, true, 1, 0, 1, true);
            return;
        }
        throw new IllegalSeekPositionException(q1Var, i2, j2);
    }

    @Override // f.h.b.b.f1
    public long getDuration() {
        if (e()) {
            b1 b1Var = this.x;
            z.a aVar = b1Var.b;
            b1Var.a.h(aVar.a, this.f4414i);
            return h0.b(this.f4414i.a(aVar.b, aVar.c));
        }
        q1 D = D();
        if (D.q()) {
            return -9223372036854775807L;
        }
        return D.n(p(), this.a).b();
    }

    @Override // f.h.b.b.f1
    public boolean h() {
        return this.x.f3797k;
    }

    @Override // f.h.b.b.f1
    public void i(final boolean z) {
        if (this.r != z) {
            this.r = z;
            this.f4412g.f4451l.b(12, z ? 1 : 0, 0).sendToTarget();
            f.h.b.b.g2.l<f1.a, f1.b> lVar = this.f4413h;
            lVar.b(10, new l.a() { // from class: f.h.b.b.h
                @Override // f.h.b.b.g2.l.a
                public final void b(Object obj) {
                    ((f1.a) obj).t(z);
                }
            });
            lVar.a();
        }
    }

    @Override // f.h.b.b.f1
    public List<Metadata> j() {
        return this.x.f3795i;
    }

    @Override // f.h.b.b.f1
    public int k() {
        if (this.x.a.q()) {
            return 0;
        }
        b1 b1Var = this.x;
        return b1Var.a.b(b1Var.b.a);
    }

    @Override // f.h.b.b.f1
    public void m(f1.a aVar) {
        f.h.b.b.g2.l<f1.a, f1.b> lVar = this.f4413h;
        if (lVar.f4287h) {
            return;
        }
        Objects.requireNonNull(aVar);
        lVar.f4284e.add(new l.c<>(aVar, lVar.c));
    }

    @Override // f.h.b.b.f1
    public int n() {
        if (e()) {
            return this.x.b.c;
        }
        return -1;
    }

    @Override // f.h.b.b.f1
    public void o(f1.a aVar) {
        f.h.b.b.g2.l<f1.a, f1.b> lVar = this.f4413h;
        Iterator<l.c<f1.a, f1.b>> it = lVar.f4284e.iterator();
        while (it.hasNext()) {
            l.c<f1.a, f1.b> next = it.next();
            if (next.a.equals(aVar)) {
                l.b<f1.a, f1.b> bVar = lVar.f4283d;
                next.f4288d = true;
                if (next.c) {
                    bVar.a(next.a, next.b);
                }
                lVar.f4284e.remove(next);
            }
        }
    }

    @Override // f.h.b.b.f1
    public int p() {
        int b = b();
        if (b == -1) {
            return 0;
        }
        return b;
    }

    @Override // f.h.b.b.f1
    public ExoPlaybackException q() {
        return this.x.f3791e;
    }

    @Override // f.h.b.b.f1
    public void r(boolean z) {
        Q(z, 0, 1);
    }

    @Override // f.h.b.b.f1
    public f1.d s() {
        return null;
    }

    @Override // f.h.b.b.f1
    public long t() {
        if (e()) {
            b1 b1Var = this.x;
            b1Var.a.h(b1Var.b.a, this.f4414i);
            b1 b1Var2 = this.x;
            if (b1Var2.c == -9223372036854775807L) {
                return b1Var2.a.n(p(), this.a).a();
            }
            return h0.b(this.f4414i.f4466e) + h0.b(this.x.c);
        }
        return J();
    }

    @Override // f.h.b.b.f1
    public int v() {
        return this.x.f3790d;
    }

    @Override // f.h.b.b.f1
    public int x() {
        if (e()) {
            return this.x.b.b;
        }
        return -1;
    }

    @Override // f.h.b.b.f1
    public void y(final int i2) {
        if (this.q != i2) {
            this.q = i2;
            this.f4412g.f4451l.b(11, i2, 0).sendToTarget();
            f.h.b.b.g2.l<f1.a, f1.b> lVar = this.f4413h;
            lVar.b(9, new l.a() { // from class: f.h.b.b.e
                @Override // f.h.b.b.g2.l.a
                public final void b(Object obj) {
                    ((f1.a) obj).z(i2);
                }
            });
            lVar.a();
        }
    }
}
