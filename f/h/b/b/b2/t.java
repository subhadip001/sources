package f.h.b.b.b2;

import com.google.android.exoplayer2.source.TrackGroupArray;
import f.h.b.b.b2.w;
import f.h.b.b.b2.z;
import f.h.b.b.n1;
import java.io.IOException;
import java.util.Objects;

/* compiled from: MaskingMediaPeriod.java */
/* loaded from: classes.dex */
public final class t implements w, w.a {

    /* renamed from: f  reason: collision with root package name */
    public final z.a f3897f;

    /* renamed from: g  reason: collision with root package name */
    public final long f3898g;

    /* renamed from: h  reason: collision with root package name */
    public final f.h.b.b.f2.k f3899h;

    /* renamed from: i  reason: collision with root package name */
    public z f3900i;

    /* renamed from: j  reason: collision with root package name */
    public w f3901j;

    /* renamed from: k  reason: collision with root package name */
    public w.a f3902k;

    /* renamed from: l  reason: collision with root package name */
    public long f3903l = -9223372036854775807L;

    public t(z.a aVar, f.h.b.b.f2.k kVar, long j2) {
        this.f3897f = aVar;
        this.f3899h = kVar;
        this.f3898g = j2;
    }

    @Override // f.h.b.b.b2.h0.a
    public void a(w wVar) {
        w.a aVar = this.f3902k;
        int i2 = f.h.b.b.g2.b0.a;
        aVar.a(this);
    }

    @Override // f.h.b.b.b2.w.a
    public void b(w wVar) {
        w.a aVar = this.f3902k;
        int i2 = f.h.b.b.g2.b0.a;
        aVar.b(this);
    }

    @Override // f.h.b.b.b2.w
    public long c() {
        w wVar = this.f3901j;
        int i2 = f.h.b.b.g2.b0.a;
        return wVar.c();
    }

    public void d(z.a aVar) {
        long j2 = this.f3898g;
        long j3 = this.f3903l;
        if (j3 != -9223372036854775807L) {
            j2 = j3;
        }
        z zVar = this.f3900i;
        Objects.requireNonNull(zVar);
        w m2 = zVar.m(aVar, this.f3899h, j2);
        this.f3901j = m2;
        if (this.f3902k != null) {
            m2.l(this, j2);
        }
    }

    @Override // f.h.b.b.b2.w
    public void e() {
        try {
            w wVar = this.f3901j;
            if (wVar != null) {
                wVar.e();
                return;
            }
            z zVar = this.f3900i;
            if (zVar != null) {
                zVar.g();
            }
        } catch (IOException e2) {
            throw e2;
        }
    }

    @Override // f.h.b.b.b2.w
    public long f(long j2) {
        w wVar = this.f3901j;
        int i2 = f.h.b.b.g2.b0.a;
        return wVar.f(j2);
    }

    @Override // f.h.b.b.b2.w
    public boolean g(long j2) {
        w wVar = this.f3901j;
        return wVar != null && wVar.g(j2);
    }

    @Override // f.h.b.b.b2.w
    public boolean h() {
        w wVar = this.f3901j;
        return wVar != null && wVar.h();
    }

    @Override // f.h.b.b.b2.w
    public long i(long j2, n1 n1Var) {
        w wVar = this.f3901j;
        int i2 = f.h.b.b.g2.b0.a;
        return wVar.i(j2, n1Var);
    }

    @Override // f.h.b.b.b2.w
    public long k() {
        w wVar = this.f3901j;
        int i2 = f.h.b.b.g2.b0.a;
        return wVar.k();
    }

    @Override // f.h.b.b.b2.w
    public void l(w.a aVar, long j2) {
        this.f3902k = aVar;
        w wVar = this.f3901j;
        if (wVar != null) {
            long j3 = this.f3898g;
            long j4 = this.f3903l;
            if (j4 != -9223372036854775807L) {
                j3 = j4;
            }
            wVar.l(this, j3);
        }
    }

    @Override // f.h.b.b.b2.w
    public long m(f.h.b.b.d2.g[] gVarArr, boolean[] zArr, g0[] g0VarArr, boolean[] zArr2, long j2) {
        long j3;
        long j4 = this.f3903l;
        if (j4 == -9223372036854775807L || j2 != this.f3898g) {
            j3 = j2;
        } else {
            this.f3903l = -9223372036854775807L;
            j3 = j4;
        }
        w wVar = this.f3901j;
        int i2 = f.h.b.b.g2.b0.a;
        return wVar.m(gVarArr, zArr, g0VarArr, zArr2, j3);
    }

    @Override // f.h.b.b.b2.w
    public TrackGroupArray n() {
        w wVar = this.f3901j;
        int i2 = f.h.b.b.g2.b0.a;
        return wVar.n();
    }

    @Override // f.h.b.b.b2.w
    public long q() {
        w wVar = this.f3901j;
        int i2 = f.h.b.b.g2.b0.a;
        return wVar.q();
    }

    @Override // f.h.b.b.b2.w
    public void r(long j2, boolean z) {
        w wVar = this.f3901j;
        int i2 = f.h.b.b.g2.b0.a;
        wVar.r(j2, z);
    }

    @Override // f.h.b.b.b2.w
    public void s(long j2) {
        w wVar = this.f3901j;
        int i2 = f.h.b.b.g2.b0.a;
        wVar.s(j2);
    }
}
