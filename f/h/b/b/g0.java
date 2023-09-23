package f.h.b.b;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.util.Objects;

/* compiled from: BaseRenderer.java */
/* loaded from: classes.dex */
public abstract class g0 implements j1, k1 {

    /* renamed from: f  reason: collision with root package name */
    public final int f4248f;

    /* renamed from: h  reason: collision with root package name */
    public l1 f4250h;

    /* renamed from: i  reason: collision with root package name */
    public int f4251i;

    /* renamed from: j  reason: collision with root package name */
    public int f4252j;

    /* renamed from: k  reason: collision with root package name */
    public f.h.b.b.b2.g0 f4253k;

    /* renamed from: l  reason: collision with root package name */
    public Format[] f4254l;

    /* renamed from: m  reason: collision with root package name */
    public long f4255m;
    public boolean o;
    public boolean p;

    /* renamed from: g  reason: collision with root package name */
    public final s0 f4249g = new s0();
    public long n = Long.MIN_VALUE;

    public g0(int i2) {
        this.f4248f = i2;
    }

    public final s0 A() {
        this.f4249g.a();
        return this.f4249g;
    }

    public abstract void B();

    public void C(boolean z, boolean z2) {
    }

    public abstract void D(long j2, boolean z);

    public void E() {
    }

    public void F() {
    }

    public void G() {
    }

    public abstract void H(Format[] formatArr, long j2, long j3);

    public final int I(s0 s0Var, DecoderInputBuffer decoderInputBuffer, boolean z) {
        f.h.b.b.b2.g0 g0Var = this.f4253k;
        Objects.requireNonNull(g0Var);
        int a = g0Var.a(s0Var, decoderInputBuffer, z);
        if (a == -4) {
            if (decoderInputBuffer.m()) {
                this.n = Long.MIN_VALUE;
                return this.o ? -4 : -3;
            }
            long j2 = decoderInputBuffer.f754j + this.f4255m;
            decoderInputBuffer.f754j = j2;
            this.n = Math.max(this.n, j2);
        } else if (a == -5) {
            Format format = s0Var.b;
            Objects.requireNonNull(format);
            if (format.u != Long.MAX_VALUE) {
                Format.b b = format.b();
                b.o = format.u + this.f4255m;
                s0Var.b = b.a();
            }
        }
        return a;
    }

    @Override // f.h.b.b.j1
    public final void d() {
        f.h.b.b.e2.j.g(this.f4252j == 0);
        this.f4249g.a();
        E();
    }

    @Override // f.h.b.b.j1
    public final void f(int i2) {
        this.f4251i = i2;
    }

    @Override // f.h.b.b.j1
    public final void g() {
        f.h.b.b.e2.j.g(this.f4252j == 1);
        this.f4249g.a();
        this.f4252j = 0;
        this.f4253k = null;
        this.f4254l = null;
        this.o = false;
        B();
    }

    @Override // f.h.b.b.j1
    public final int getState() {
        return this.f4252j;
    }

    @Override // f.h.b.b.j1
    public final f.h.b.b.b2.g0 getStream() {
        return this.f4253k;
    }

    @Override // f.h.b.b.j1
    public final boolean i() {
        return this.n == Long.MIN_VALUE;
    }

    @Override // f.h.b.b.j1
    public final void j(Format[] formatArr, f.h.b.b.b2.g0 g0Var, long j2, long j3) {
        f.h.b.b.e2.j.g(!this.o);
        this.f4253k = g0Var;
        this.n = j3;
        this.f4254l = formatArr;
        this.f4255m = j3;
        H(formatArr, j2, j3);
    }

    @Override // f.h.b.b.j1
    public final void k() {
        this.o = true;
    }

    @Override // f.h.b.b.j1
    public final k1 l() {
        return this;
    }

    @Override // f.h.b.b.j1
    public /* synthetic */ void n(float f2, float f3) {
        i1.a(this, f2, f3);
    }

    @Override // f.h.b.b.j1
    public final void o(l1 l1Var, Format[] formatArr, f.h.b.b.b2.g0 g0Var, long j2, boolean z, boolean z2, long j3, long j4) {
        f.h.b.b.e2.j.g(this.f4252j == 0);
        this.f4250h = l1Var;
        this.f4252j = 1;
        C(z, z2);
        j(formatArr, g0Var, j3, j4);
        D(j2, z);
    }

    public int p() {
        return 0;
    }

    @Override // f.h.b.b.g1.b
    public void r(int i2, Object obj) {
    }

    @Override // f.h.b.b.j1
    public final void s() {
        f.h.b.b.b2.g0 g0Var = this.f4253k;
        Objects.requireNonNull(g0Var);
        g0Var.b();
    }

    @Override // f.h.b.b.j1
    public final void start() {
        f.h.b.b.e2.j.g(this.f4252j == 1);
        this.f4252j = 2;
        F();
    }

    @Override // f.h.b.b.j1
    public final void stop() {
        f.h.b.b.e2.j.g(this.f4252j == 2);
        this.f4252j = 1;
        G();
    }

    @Override // f.h.b.b.j1
    public final long t() {
        return this.n;
    }

    @Override // f.h.b.b.j1
    public final void u(long j2) {
        this.o = false;
        this.n = j2;
        D(j2, false);
    }

    @Override // f.h.b.b.j1
    public final boolean v() {
        return this.o;
    }

    @Override // f.h.b.b.j1
    public f.h.b.b.g2.o w() {
        return null;
    }

    @Override // f.h.b.b.j1
    public final int x() {
        return this.f4248f;
    }

    public final ExoPlaybackException y(Throwable th, Format format) {
        return z(th, format, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.exoplayer2.ExoPlaybackException z(java.lang.Throwable r13, com.google.android.exoplayer2.Format r14, boolean r15) {
        /*
            r12 = this;
            r0 = 4
            if (r14 == 0) goto L1a
            boolean r1 = r12.p
            if (r1 != 0) goto L1a
            r1 = 1
            r12.p = r1
            r1 = 0
            int r2 = r12.a(r14)     // Catch: java.lang.Throwable -> L14 com.google.android.exoplayer2.ExoPlaybackException -> L18
            r2 = r2 & 7
            r12.p = r1
            goto L1b
        L14:
            r13 = move-exception
            r12.p = r1
            throw r13
        L18:
            r12.p = r1
        L1a:
            r2 = 4
        L1b:
            java.lang.String r7 = r12.getName()
            int r8 = r12.f4251i
            com.google.android.exoplayer2.ExoPlaybackException r1 = new com.google.android.exoplayer2.ExoPlaybackException
            if (r14 != 0) goto L27
            r10 = 4
            goto L28
        L27:
            r10 = r2
        L28:
            r4 = 1
            r6 = 0
            r3 = r1
            r5 = r13
            r9 = r14
            r11 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.g0.z(java.lang.Throwable, com.google.android.exoplayer2.Format, boolean):com.google.android.exoplayer2.ExoPlaybackException");
    }
}
