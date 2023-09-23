package f.h.b.b.b2;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.TrackGroupArray;
import f.h.b.b.b2.w;
import f.h.b.b.n1;
import f.h.b.b.s0;
import java.util.Objects;

/* compiled from: ClippingMediaPeriod.java */
/* loaded from: classes.dex */
public final class l implements w, w.a {

    /* renamed from: f  reason: collision with root package name */
    public final w f3880f;

    /* renamed from: g  reason: collision with root package name */
    public w.a f3881g;

    /* renamed from: h  reason: collision with root package name */
    public a[] f3882h = new a[0];

    /* renamed from: i  reason: collision with root package name */
    public long f3883i;

    /* renamed from: j  reason: collision with root package name */
    public long f3884j;

    /* renamed from: k  reason: collision with root package name */
    public long f3885k;

    /* compiled from: ClippingMediaPeriod.java */
    /* loaded from: classes.dex */
    public final class a implements g0 {
        public final g0 a;
        public boolean b;

        public a(g0 g0Var) {
            this.a = g0Var;
        }

        @Override // f.h.b.b.b2.g0
        public int a(s0 s0Var, DecoderInputBuffer decoderInputBuffer, boolean z) {
            if (l.this.d()) {
                return -3;
            }
            if (this.b) {
                decoderInputBuffer.f4610f = 4;
                return -4;
            }
            int a = this.a.a(s0Var, decoderInputBuffer, z);
            if (a == -5) {
                Format format = s0Var.b;
                Objects.requireNonNull(format);
                int i2 = format.G;
                if (i2 != 0 || format.H != 0) {
                    l lVar = l.this;
                    if (lVar.f3884j != 0) {
                        i2 = 0;
                    }
                    int i3 = lVar.f3885k == Long.MIN_VALUE ? format.H : 0;
                    Format.b b = format.b();
                    b.A = i2;
                    b.B = i3;
                    s0Var.b = b.a();
                }
                return -5;
            }
            l lVar2 = l.this;
            long j2 = lVar2.f3885k;
            if (j2 == Long.MIN_VALUE || ((a != -4 || decoderInputBuffer.f754j < j2) && !(a == -3 && lVar2.q() == Long.MIN_VALUE && !decoderInputBuffer.f753i))) {
                return a;
            }
            decoderInputBuffer.o();
            decoderInputBuffer.f4610f = 4;
            this.b = true;
            return -4;
        }

        @Override // f.h.b.b.b2.g0
        public void b() {
            this.a.b();
        }

        @Override // f.h.b.b.b2.g0
        public int c(long j2) {
            if (l.this.d()) {
                return -3;
            }
            return this.a.c(j2);
        }

        @Override // f.h.b.b.b2.g0
        public boolean e() {
            return !l.this.d() && this.a.e();
        }
    }

    public l(w wVar, boolean z, long j2, long j3) {
        this.f3880f = wVar;
        this.f3883i = z ? j2 : -9223372036854775807L;
        this.f3884j = j2;
        this.f3885k = j3;
    }

    @Override // f.h.b.b.b2.h0.a
    public void a(w wVar) {
        w.a aVar = this.f3881g;
        Objects.requireNonNull(aVar);
        aVar.a(this);
    }

    @Override // f.h.b.b.b2.w.a
    public void b(w wVar) {
        w.a aVar = this.f3881g;
        Objects.requireNonNull(aVar);
        aVar.b(this);
    }

    @Override // f.h.b.b.b2.w
    public long c() {
        long c = this.f3880f.c();
        if (c != Long.MIN_VALUE) {
            long j2 = this.f3885k;
            if (j2 == Long.MIN_VALUE || c < j2) {
                return c;
            }
        }
        return Long.MIN_VALUE;
    }

    public boolean d() {
        return this.f3883i != -9223372036854775807L;
    }

    @Override // f.h.b.b.b2.w
    public void e() {
        this.f3880f.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r0 > r7) goto L18;
     */
    @Override // f.h.b.b.b2.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long f(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f3883i = r0
            f.h.b.b.b2.l$a[] r0 = r6.f3882h
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.b = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            f.h.b.b.b2.w r0 = r6.f3880f
            long r0 = r0.f(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L33
            long r7 = r6.f3884j
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L34
            long r7 = r6.f3885k
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L33
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L34
        L33:
            r2 = 1
        L34:
            f.h.b.b.e2.j.g(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.b2.l.f(long):long");
    }

    @Override // f.h.b.b.b2.w
    public boolean g(long j2) {
        return this.f3880f.g(j2);
    }

    @Override // f.h.b.b.b2.w
    public boolean h() {
        return this.f3880f.h();
    }

    @Override // f.h.b.b.b2.w
    public long i(long j2, n1 n1Var) {
        long j3 = this.f3884j;
        if (j2 == j3) {
            return j3;
        }
        long i2 = f.h.b.b.g2.b0.i(n1Var.a, 0L, j2 - j3);
        long j4 = n1Var.b;
        long j5 = this.f3885k;
        long i3 = f.h.b.b.g2.b0.i(j4, 0L, j5 == Long.MIN_VALUE ? Long.MAX_VALUE : j5 - j2);
        if (i2 != n1Var.a || i3 != n1Var.b) {
            n1Var = new n1(i2, i3);
        }
        return this.f3880f.i(j2, n1Var);
    }

    @Override // f.h.b.b.b2.w
    public long k() {
        if (d()) {
            long j2 = this.f3883i;
            this.f3883i = -9223372036854775807L;
            long k2 = k();
            return k2 != -9223372036854775807L ? k2 : j2;
        }
        long k3 = this.f3880f.k();
        if (k3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        f.h.b.b.e2.j.g(k3 >= this.f3884j);
        long j3 = this.f3885k;
        if (j3 != Long.MIN_VALUE && k3 > j3) {
            z = false;
        }
        f.h.b.b.e2.j.g(z);
        return k3;
    }

    @Override // f.h.b.b.b2.w
    public void l(w.a aVar, long j2) {
        this.f3881g = aVar;
        this.f3880f.l(this, j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
        if (r1 > r5) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    @Override // f.h.b.b.b2.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long m(f.h.b.b.d2.g[] r16, boolean[] r17, f.h.b.b.b2.g0[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r0 = r15
            r8 = r16
            r9 = r18
            int r1 = r9.length
            f.h.b.b.b2.l$a[] r1 = new f.h.b.b.b2.l.a[r1]
            r0.f3882h = r1
            int r1 = r9.length
            f.h.b.b.b2.g0[] r10 = new f.h.b.b.b2.g0[r1]
            r11 = 0
            r1 = 0
        Lf:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L28
            f.h.b.b.b2.l$a[] r2 = r0.f3882h
            r3 = r9[r1]
            f.h.b.b.b2.l$a r3 = (f.h.b.b.b2.l.a) r3
            r2[r1] = r3
            r3 = r2[r1]
            if (r3 == 0) goto L23
            r2 = r2[r1]
            f.h.b.b.b2.g0 r12 = r2.a
        L23:
            r10[r1] = r12
            int r1 = r1 + 1
            goto Lf
        L28:
            f.h.b.b.b2.w r1 = r0.f3880f
            r2 = r16
            r3 = r17
            r4 = r10
            r5 = r19
            r6 = r20
            long r1 = r1.m(r2, r3, r4, r5, r6)
            boolean r3 = r15.d()
            r4 = 1
            if (r3 == 0) goto L6a
            long r5 = r0.f3884j
            int r3 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r3 != 0) goto L6a
            r13 = 0
            int r3 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r3 == 0) goto L65
            int r3 = r8.length
            r5 = 0
        L4c:
            if (r5 >= r3) goto L65
            r6 = r8[r5]
            if (r6 == 0) goto L62
            com.google.android.exoplayer2.Format r6 = r6.h()
            java.lang.String r7 = r6.q
            java.lang.String r6 = r6.n
            boolean r6 = f.h.b.b.g2.p.a(r7, r6)
            if (r6 != 0) goto L62
            r3 = 1
            goto L66
        L62:
            int r5 = r5 + 1
            goto L4c
        L65:
            r3 = 0
        L66:
            if (r3 == 0) goto L6a
            r5 = r1
            goto L6f
        L6a:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L6f:
            r0.f3883i = r5
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 == 0) goto L89
            long r5 = r0.f3884j
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L88
            long r5 = r0.f3885k
            r7 = -9223372036854775808
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L89
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 > 0) goto L88
            goto L89
        L88:
            r4 = 0
        L89:
            f.h.b.b.e2.j.g(r4)
        L8c:
            int r3 = r9.length
            if (r11 >= r3) goto Lb8
            r3 = r10[r11]
            if (r3 != 0) goto L98
            f.h.b.b.b2.l$a[] r3 = r0.f3882h
            r3[r11] = r12
            goto Laf
        L98:
            f.h.b.b.b2.l$a[] r3 = r0.f3882h
            r4 = r3[r11]
            if (r4 == 0) goto La6
            r4 = r3[r11]
            f.h.b.b.b2.g0 r4 = r4.a
            r5 = r10[r11]
            if (r4 == r5) goto Laf
        La6:
            f.h.b.b.b2.l$a r4 = new f.h.b.b.b2.l$a
            r5 = r10[r11]
            r4.<init>(r5)
            r3[r11] = r4
        Laf:
            f.h.b.b.b2.l$a[] r3 = r0.f3882h
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L8c
        Lb8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.b2.l.m(f.h.b.b.d2.g[], boolean[], f.h.b.b.b2.g0[], boolean[], long):long");
    }

    @Override // f.h.b.b.b2.w
    public TrackGroupArray n() {
        return this.f3880f.n();
    }

    @Override // f.h.b.b.b2.w
    public long q() {
        long q = this.f3880f.q();
        if (q != Long.MIN_VALUE) {
            long j2 = this.f3885k;
            if (j2 == Long.MIN_VALUE || q < j2) {
                return q;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // f.h.b.b.b2.w
    public void r(long j2, boolean z) {
        this.f3880f.r(j2, z);
    }

    @Override // f.h.b.b.b2.w
    public void s(long j2) {
        this.f3880f.s(j2);
    }
}
