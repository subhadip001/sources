package f.h.b.b.b2;

import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.upstream.Loader;
import f.h.b.b.b2.c0;
import f.h.b.b.b2.z;
import f.h.b.b.f2.i;
import f.h.b.b.q1;
import f.h.b.b.u0;
import java.util.Objects;

/* compiled from: ProgressiveMediaSource.java */
/* loaded from: classes.dex */
public final class d0 extends j implements c0.b {

    /* renamed from: g  reason: collision with root package name */
    public final u0 f3833g;

    /* renamed from: h  reason: collision with root package name */
    public final u0.f f3834h;

    /* renamed from: i  reason: collision with root package name */
    public final i.a f3835i;

    /* renamed from: j  reason: collision with root package name */
    public final f.h.b.b.y1.l f3836j;

    /* renamed from: k  reason: collision with root package name */
    public final f.h.b.b.x1.c f3837k;

    /* renamed from: l  reason: collision with root package name */
    public final f.h.b.b.f2.r f3838l;

    /* renamed from: m  reason: collision with root package name */
    public final int f3839m;
    public boolean n;
    public long o;
    public boolean p;
    public boolean q;
    public f.h.b.b.f2.t r;

    /* compiled from: ProgressiveMediaSource.java */
    /* loaded from: classes.dex */
    public class a extends q {
        public a(q1 q1Var) {
            super(q1Var);
        }

        @Override // f.h.b.b.q1
        public q1.c o(int i2, q1.c cVar, long j2) {
            this.b.o(i2, cVar, j2);
            cVar.f4476l = true;
            return cVar;
        }
    }

    /* compiled from: ProgressiveMediaSource.java */
    /* loaded from: classes.dex */
    public static final class b implements b0 {
        public final i.a a;

        public b(i.a aVar, f.h.b.b.y1.l lVar) {
            this.a = aVar;
        }
    }

    public d0(u0 u0Var, i.a aVar, f.h.b.b.y1.l lVar, f.h.b.b.x1.c cVar, f.h.b.b.f2.r rVar, int i2) {
        u0.f fVar = u0Var.b;
        Objects.requireNonNull(fVar);
        this.f3834h = fVar;
        this.f3833g = u0Var;
        this.f3835i = aVar;
        this.f3836j = lVar;
        this.f3837k = cVar;
        this.f3838l = rVar;
        this.f3839m = i2;
        this.n = true;
        this.o = -9223372036854775807L;
    }

    @Override // f.h.b.b.b2.z
    public u0 e() {
        return this.f3833g;
    }

    @Override // f.h.b.b.b2.z
    public void g() {
    }

    @Override // f.h.b.b.b2.z
    public void i(w wVar) {
        f0[] f0VarArr;
        c0 c0Var = (c0) wVar;
        if (c0Var.A) {
            for (f0 f0Var : c0Var.x) {
                f0Var.h();
                DrmSession drmSession = f0Var.f3858h;
                if (drmSession != null) {
                    f.h.b.b.x1.d dVar = (f.h.b.b.x1.d) drmSession;
                    f0Var.f3858h = null;
                    f0Var.f3857g = null;
                }
            }
        }
        Loader loader = c0Var.p;
        Loader.d<? extends Loader.e> dVar2 = loader.b;
        if (dVar2 != null) {
            dVar2.a(true);
        }
        loader.a.execute(new Loader.g(c0Var));
        loader.a.shutdown();
        c0Var.u.removeCallbacksAndMessages(null);
        c0Var.v = null;
        c0Var.Q = true;
    }

    @Override // f.h.b.b.b2.z
    public w m(z.a aVar, f.h.b.b.f2.k kVar, long j2) {
        f.h.b.b.f2.i a2 = this.f3835i.a();
        f.h.b.b.f2.t tVar = this.r;
        if (tVar != null) {
            a2.d(tVar);
        }
        return new c0(this.f3834h.a, a2, this.f3836j, this.f3837k, this.f3868d.a(0, aVar), this.f3838l, this.c.k(0, aVar, 0L), this, kVar, this.f3834h.f4515f, this.f3839m);
    }

    @Override // f.h.b.b.b2.j
    public void p(f.h.b.b.f2.t tVar) {
        this.r = tVar;
        this.f3837k.d();
        s();
    }

    @Override // f.h.b.b.b2.j
    public void r() {
        this.f3837k.release();
    }

    public final void s() {
        q1 j0Var = new j0(this.o, this.p, false, this.q, null, this.f3833g);
        if (this.n) {
            j0Var = new a(j0Var);
        }
        q(j0Var);
    }

    public void t(long j2, boolean z, boolean z2) {
        if (j2 == -9223372036854775807L) {
            j2 = this.o;
        }
        if (!this.n && this.o == j2 && this.p == z && this.q == z2) {
            return;
        }
        this.o = j2;
        this.p = z;
        this.q = z2;
        this.n = false;
        s();
    }
}
