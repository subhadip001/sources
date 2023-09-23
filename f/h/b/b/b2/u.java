package f.h.b.b.b2;

import f.h.b.b.b2.z;
import f.h.b.b.q1;
import f.h.b.b.u0;
import java.util.Objects;

/* compiled from: MaskingMediaSource.java */
/* loaded from: classes.dex */
public final class u extends m<Void> {

    /* renamed from: j  reason: collision with root package name */
    public final z f3904j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f3905k;

    /* renamed from: l  reason: collision with root package name */
    public final q1.c f3906l;

    /* renamed from: m  reason: collision with root package name */
    public final q1.b f3907m;
    public a n;
    public t o;
    public boolean p;
    public boolean q;
    public boolean r;

    /* compiled from: MaskingMediaSource.java */
    /* loaded from: classes.dex */
    public static final class a extends q {

        /* renamed from: e  reason: collision with root package name */
        public static final Object f3908e = new Object();
        public final Object c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f3909d;

        public a(q1 q1Var, Object obj, Object obj2) {
            super(q1Var);
            this.c = obj;
            this.f3909d = obj2;
        }

        @Override // f.h.b.b.b2.q, f.h.b.b.q1
        public int b(Object obj) {
            Object obj2;
            q1 q1Var = this.b;
            if (f3908e.equals(obj) && (obj2 = this.f3909d) != null) {
                obj = obj2;
            }
            return q1Var.b(obj);
        }

        @Override // f.h.b.b.b2.q, f.h.b.b.q1
        public q1.b g(int i2, q1.b bVar, boolean z) {
            this.b.g(i2, bVar, z);
            if (f.h.b.b.g2.b0.a(bVar.b, this.f3909d) && z) {
                bVar.b = f3908e;
            }
            return bVar;
        }

        @Override // f.h.b.b.b2.q, f.h.b.b.q1
        public Object m(int i2) {
            Object m2 = this.b.m(i2);
            return f.h.b.b.g2.b0.a(m2, this.f3909d) ? f3908e : m2;
        }

        @Override // f.h.b.b.q1
        public q1.c o(int i2, q1.c cVar, long j2) {
            this.b.o(i2, cVar, j2);
            if (f.h.b.b.g2.b0.a(cVar.a, this.c)) {
                cVar.a = q1.c.r;
            }
            return cVar;
        }
    }

    /* compiled from: MaskingMediaSource.java */
    /* loaded from: classes.dex */
    public static final class b extends q1 {
        public final u0 b;

        public b(u0 u0Var) {
            this.b = u0Var;
        }

        @Override // f.h.b.b.q1
        public int b(Object obj) {
            return obj == a.f3908e ? 0 : -1;
        }

        @Override // f.h.b.b.q1
        public q1.b g(int i2, q1.b bVar, boolean z) {
            Integer num = z ? 0 : null;
            Object obj = z ? a.f3908e : null;
            Objects.requireNonNull(bVar);
            f.h.b.b.b2.k0.a aVar = f.h.b.b.b2.k0.a.f3875g;
            bVar.a = num;
            bVar.b = obj;
            bVar.c = 0;
            bVar.f4465d = -9223372036854775807L;
            bVar.f4466e = 0L;
            bVar.f4467f = aVar;
            return bVar;
        }

        @Override // f.h.b.b.q1
        public int i() {
            return 1;
        }

        @Override // f.h.b.b.q1
        public Object m(int i2) {
            return a.f3908e;
        }

        @Override // f.h.b.b.q1
        public q1.c o(int i2, q1.c cVar, long j2) {
            cVar.d(q1.c.r, this.b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            cVar.f4476l = true;
            return cVar;
        }

        @Override // f.h.b.b.q1
        public int p() {
            return 1;
        }
    }

    public u(z zVar, boolean z) {
        this.f3904j = zVar;
        this.f3905k = z && zVar.h();
        this.f3906l = new q1.c();
        this.f3907m = new q1.b();
        q1 j2 = zVar.j();
        if (j2 != null) {
            this.n = new a(j2, null, null);
            this.r = true;
            return;
        }
        this.n = new a(new b(zVar.e()), q1.c.r, a.f3908e);
    }

    @Override // f.h.b.b.b2.z
    public u0 e() {
        return this.f3904j.e();
    }

    @Override // f.h.b.b.b2.m, f.h.b.b.b2.z
    public void g() {
    }

    @Override // f.h.b.b.b2.z
    public void i(w wVar) {
        t tVar = (t) wVar;
        if (tVar.f3901j != null) {
            z zVar = tVar.f3900i;
            Objects.requireNonNull(zVar);
            zVar.i(tVar.f3901j);
        }
        if (wVar == this.o) {
            this.o = null;
        }
    }

    @Override // f.h.b.b.b2.j
    public void p(f.h.b.b.f2.t tVar) {
        this.f3889i = tVar;
        this.f3888h = f.h.b.b.g2.b0.j();
        if (this.f3905k) {
            return;
        }
        this.p = true;
        u(null, this.f3904j);
    }

    @Override // f.h.b.b.b2.m, f.h.b.b.b2.j
    public void r() {
        this.q = false;
        this.p = false;
        super.r();
    }

    @Override // f.h.b.b.b2.m
    public z.a s(Void r2, z.a aVar) {
        Object obj = aVar.a;
        Object obj2 = this.n.f3909d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = a.f3908e;
        }
        return aVar.b(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // f.h.b.b.b2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t(java.lang.Void r7, f.h.b.b.b2.z r8, f.h.b.b.q1 r9) {
        /*
            r6 = this;
            java.lang.Void r7 = (java.lang.Void) r7
            boolean r7 = r6.q
            if (r7 == 0) goto L1e
            f.h.b.b.b2.u$a r7 = r6.n
            f.h.b.b.b2.u$a r8 = new f.h.b.b.b2.u$a
            java.lang.Object r0 = r7.c
            java.lang.Object r7 = r7.f3909d
            r8.<init>(r9, r0, r7)
            r6.n = r8
            f.h.b.b.b2.t r7 = r6.o
            if (r7 == 0) goto La7
            long r7 = r7.f3903l
            r6.w(r7)
            goto La7
        L1e:
            boolean r7 = r9.q()
            if (r7 == 0) goto L41
            boolean r7 = r6.r
            if (r7 == 0) goto L34
            f.h.b.b.b2.u$a r7 = r6.n
            f.h.b.b.b2.u$a r8 = new f.h.b.b.b2.u$a
            java.lang.Object r0 = r7.c
            java.lang.Object r7 = r7.f3909d
            r8.<init>(r9, r0, r7)
            goto L3e
        L34:
            java.lang.Object r7 = f.h.b.b.q1.c.r
            java.lang.Object r8 = f.h.b.b.b2.u.a.f3908e
            f.h.b.b.b2.u$a r0 = new f.h.b.b.b2.u$a
            r0.<init>(r9, r7, r8)
            r8 = r0
        L3e:
            r6.n = r8
            goto La7
        L41:
            r7 = 0
            f.h.b.b.q1$c r8 = r6.f3906l
            r9.n(r7, r8)
            f.h.b.b.q1$c r1 = r6.f3906l
            long r7 = r1.o
            f.h.b.b.b2.t r0 = r6.o
            if (r0 == 0) goto L59
            long r2 = r0.f3898g
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L59
            r4 = r2
            goto L5a
        L59:
            r4 = r7
        L5a:
            java.lang.Object r7 = r1.a
            f.h.b.b.q1$b r2 = r6.f3907m
            r3 = 0
            r0 = r9
            android.util.Pair r8 = r0.j(r1, r2, r3, r4)
            java.lang.Object r0 = r8.first
            java.lang.Object r8 = r8.second
            java.lang.Long r8 = (java.lang.Long) r8
            long r1 = r8.longValue()
            boolean r8 = r6.r
            if (r8 == 0) goto L7e
            f.h.b.b.b2.u$a r7 = r6.n
            f.h.b.b.b2.u$a r8 = new f.h.b.b.b2.u$a
            java.lang.Object r0 = r7.c
            java.lang.Object r7 = r7.f3909d
            r8.<init>(r9, r0, r7)
            goto L83
        L7e:
            f.h.b.b.b2.u$a r8 = new f.h.b.b.b2.u$a
            r8.<init>(r9, r7, r0)
        L83:
            r6.n = r8
            f.h.b.b.b2.t r7 = r6.o
            if (r7 == 0) goto La7
            r6.w(r1)
            f.h.b.b.b2.z$a r7 = r7.f3897f
            java.lang.Object r8 = r7.a
            f.h.b.b.b2.u$a r9 = r6.n
            java.lang.Object r9 = r9.f3909d
            if (r9 == 0) goto La2
            java.lang.Object r9 = f.h.b.b.b2.u.a.f3908e
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto La2
            f.h.b.b.b2.u$a r8 = r6.n
            java.lang.Object r8 = r8.f3909d
        La2:
            f.h.b.b.b2.z$a r7 = r7.b(r8)
            goto La8
        La7:
            r7 = 0
        La8:
            r8 = 1
            r6.r = r8
            r6.q = r8
            f.h.b.b.b2.u$a r8 = r6.n
            r6.q(r8)
            if (r7 == 0) goto Lbc
            f.h.b.b.b2.t r8 = r6.o
            java.util.Objects.requireNonNull(r8)
            r8.d(r7)
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.b2.u.t(java.lang.Object, f.h.b.b.b2.z, f.h.b.b.q1):void");
    }

    @Override // f.h.b.b.b2.z
    /* renamed from: v */
    public t m(z.a aVar, f.h.b.b.f2.k kVar, long j2) {
        t tVar = new t(aVar, kVar, j2);
        z zVar = this.f3904j;
        f.h.b.b.e2.j.g(tVar.f3900i == null);
        tVar.f3900i = zVar;
        if (this.q) {
            Object obj = aVar.a;
            if (this.n.f3909d != null && obj.equals(a.f3908e)) {
                obj = this.n.f3909d;
            }
            tVar.d(aVar.b(obj));
        } else {
            this.o = tVar;
            if (!this.p) {
                this.p = true;
                u(null, this.f3904j);
            }
        }
        return tVar;
    }

    public final void w(long j2) {
        t tVar = this.o;
        int b2 = this.n.b(tVar.f3897f.a);
        if (b2 == -1) {
            return;
        }
        long j3 = this.n.f(b2, this.f3907m).f4465d;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        tVar.f3903l = j2;
    }
}
