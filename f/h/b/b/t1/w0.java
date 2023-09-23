package f.h.b.b.t1;

import android.util.SparseArray;
import android.view.Surface;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.firebase.inappmessaging.display.internal.FiamWindowManager;
import f.h.b.b.b2.z;
import f.h.b.b.c1;
import f.h.b.b.e1;
import f.h.b.b.f1;
import f.h.b.b.f2.d;
import f.h.b.b.g2.l;
import f.h.b.b.q1;
import f.h.b.b.t1.x0;
import f.h.c.b.s;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: AnalyticsCollector.java */
/* loaded from: classes.dex */
public class w0 implements f1.a, f.h.b.b.u1.q, f.h.b.b.h2.w, f.h.b.b.b2.a0, d.a, f.h.b.b.x1.a {

    /* renamed from: f  reason: collision with root package name */
    public final f.h.b.b.g2.f f4489f;

    /* renamed from: g  reason: collision with root package name */
    public final q1.b f4490g;

    /* renamed from: h  reason: collision with root package name */
    public final q1.c f4491h;

    /* renamed from: i  reason: collision with root package name */
    public final a f4492i;

    /* renamed from: j  reason: collision with root package name */
    public final SparseArray<x0.a> f4493j;

    /* renamed from: k  reason: collision with root package name */
    public f.h.b.b.g2.l<x0, x0.b> f4494k;

    /* renamed from: l  reason: collision with root package name */
    public f1 f4495l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4496m;

    /* compiled from: AnalyticsCollector.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final q1.b a;
        public f.h.c.b.q<z.a> b;
        public f.h.c.b.s<z.a, q1> c;

        /* renamed from: d  reason: collision with root package name */
        public z.a f4497d;

        /* renamed from: e  reason: collision with root package name */
        public z.a f4498e;

        /* renamed from: f  reason: collision with root package name */
        public z.a f4499f;

        public a(q1.b bVar) {
            this.a = bVar;
            f.h.c.b.a<Object> aVar = f.h.c.b.q.f5981g;
            this.b = f.h.c.b.m0.f5954j;
            this.c = f.h.c.b.n0.f5958l;
        }

        public static z.a b(f1 f1Var, f.h.c.b.q<z.a> qVar, z.a aVar, q1.b bVar) {
            q1 D = f1Var.D();
            int k2 = f1Var.k();
            Object m2 = D.q() ? null : D.m(k2);
            int b = (f1Var.e() || D.q()) ? -1 : D.f(k2, bVar).b(f.h.b.b.h0.a(f1Var.J()) - bVar.f4466e);
            for (int i2 = 0; i2 < qVar.size(); i2++) {
                z.a aVar2 = qVar.get(i2);
                if (c(aVar2, m2, f1Var.e(), f1Var.x(), f1Var.n(), b)) {
                    return aVar2;
                }
            }
            if (qVar.isEmpty() && aVar != null) {
                if (c(aVar, m2, f1Var.e(), f1Var.x(), f1Var.n(), b)) {
                    return aVar;
                }
            }
            return null;
        }

        public static boolean c(z.a aVar, Object obj, boolean z, int i2, int i3, int i4) {
            if (aVar.a.equals(obj)) {
                return (z && aVar.b == i2 && aVar.c == i3) || (!z && aVar.b == -1 && aVar.f3915e == i4);
            }
            return false;
        }

        public final void a(s.a<z.a, q1> aVar, z.a aVar2, q1 q1Var) {
            if (aVar2 == null) {
                return;
            }
            if (q1Var.b(aVar2.a) != -1) {
                aVar.c(aVar2, q1Var);
                return;
            }
            q1 q1Var2 = this.c.get(aVar2);
            if (q1Var2 != null) {
                aVar.c(aVar2, q1Var2);
            }
        }

        public final void d(q1 q1Var) {
            s.a<z.a, q1> aVar = new s.a<>(4);
            if (this.b.isEmpty()) {
                a(aVar, this.f4498e, q1Var);
                if (!f.h.b.c.a.i0(this.f4499f, this.f4498e)) {
                    a(aVar, this.f4499f, q1Var);
                }
                if (!f.h.b.c.a.i0(this.f4497d, this.f4498e) && !f.h.b.c.a.i0(this.f4497d, this.f4499f)) {
                    a(aVar, this.f4497d, q1Var);
                }
            } else {
                for (int i2 = 0; i2 < this.b.size(); i2++) {
                    a(aVar, this.b.get(i2), q1Var);
                }
                if (!this.b.contains(this.f4497d)) {
                    a(aVar, this.f4497d, q1Var);
                }
            }
            this.c = aVar.a();
        }
    }

    public w0(f.h.b.b.g2.f fVar) {
        this.f4489f = fVar;
        this.f4494k = new f.h.b.b.g2.l<>(new CopyOnWriteArraySet(), f.h.b.b.g2.b0.n(), fVar, new f.h.c.a.p() { // from class: f.h.b.b.t1.a
            @Override // f.h.c.a.p
            public final Object get() {
                return new x0.b();
            }
        }, new l.b() { // from class: f.h.b.b.t1.l
            @Override // f.h.b.b.g2.l.b
            public final void a(Object obj, f.h.b.b.g2.q qVar) {
                x0 x0Var = (x0) obj;
                x0.b bVar = (x0.b) qVar;
            }
        });
        q1.b bVar = new q1.b();
        this.f4490g = bVar;
        this.f4491h = new q1.c();
        this.f4492i = new a(bVar);
        this.f4493j = new SparseArray<>();
    }

    @Override // f.h.b.b.f1.a
    public final void A(final f.h.b.b.u0 u0Var, final int i2) {
        final x0.a P = P();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.o
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).r();
            }
        };
        this.f4493j.put(1, P);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(1, aVar);
        lVar.a();
    }

    @Override // f.h.b.b.u1.q
    public final void B(final boolean z) {
        final x0.a U = U();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.b0
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).b();
            }
        };
        this.f4493j.put(1017, U);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(1017, aVar);
        lVar.a();
    }

    @Override // f.h.b.b.u1.q
    public final void C(final Exception exc) {
        final x0.a U = U();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.g
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).t();
            }
        };
        this.f4493j.put(1018, U);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(1018, aVar);
        lVar.a();
    }

    @Override // f.h.b.b.h2.w
    public final void D(final f.h.b.b.v1.d dVar) {
        final x0.a U = U();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.u0
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                x0 x0Var = (x0) obj;
                x0Var.M();
                x0Var.z();
            }
        };
        this.f4493j.put(1020, U);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(1020, aVar);
        lVar.a();
    }

    @Override // f.h.b.b.h2.w
    public final void E(final Format format, final f.h.b.b.v1.e eVar) {
        final x0.a U = U();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.f0
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                x0 x0Var = (x0) obj;
                x0Var.U(x0.a.this, format);
                x0Var.u();
            }
        };
        this.f4493j.put(1022, U);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(1022, aVar);
        lVar.a();
    }

    @Override // f.h.b.b.u1.q
    public final void F(final long j2) {
        final x0.a U = U();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.s0
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).l();
            }
        };
        this.f4493j.put(1011, U);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(1011, aVar);
        lVar.a();
    }

    @Override // f.h.b.b.f1.a
    public final void G(final boolean z, final int i2) {
        final x0.a P = P();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.n0
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).g();
            }
        };
        this.f4493j.put(6, P);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(6, aVar);
        lVar.a();
    }

    @Override // f.h.b.b.b2.a0
    public final void H(int i2, z.a aVar, final f.h.b.b.b2.s sVar, final f.h.b.b.b2.v vVar) {
        final x0.a S = S(i2, aVar);
        l.a<x0> aVar2 = new l.a() { // from class: f.h.b.b.t1.u
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).q();
            }
        };
        this.f4493j.put(1001, S);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(1001, aVar2);
        lVar.a();
    }

    @Override // f.h.b.b.f1.a
    public final void I(final TrackGroupArray trackGroupArray, final f.h.b.b.d2.k kVar) {
        final x0.a P = P();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.h
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).W();
            }
        };
        this.f4493j.put(2, P);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(2, aVar);
        lVar.a();
    }

    @Override // f.h.b.b.h2.w
    public final void J(final f.h.b.b.v1.d dVar) {
        final x0.a T = T();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.i
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                x0 x0Var = (x0) obj;
                x0Var.o();
                x0Var.j();
            }
        };
        this.f4493j.put(1025, T);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(1025, aVar);
        lVar.a();
    }

    @Override // f.h.b.b.f1.a
    public final void K(final c1 c1Var) {
        final x0.a P = P();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.y
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).C();
            }
        };
        this.f4493j.put(13, P);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(13, aVar);
        lVar.a();
    }

    @Override // f.h.b.b.u1.q
    public final void L(final int i2, final long j2, final long j3) {
        final x0.a U = U();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.t0
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).w();
            }
        };
        this.f4493j.put(1012, U);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(1012, aVar);
        lVar.a();
    }

    @Override // f.h.b.b.b2.a0
    public final void M(int i2, z.a aVar, final f.h.b.b.b2.s sVar, final f.h.b.b.b2.v vVar, final IOException iOException, final boolean z) {
        final x0.a S = S(i2, aVar);
        l.a<x0> aVar2 = new l.a() { // from class: f.h.b.b.t1.a0
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).s();
            }
        };
        this.f4493j.put(FiamWindowManager.DEFAULT_TYPE, S);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(FiamWindowManager.DEFAULT_TYPE, aVar2);
        lVar.a();
    }

    @Override // f.h.b.b.h2.w
    public final void N(final long j2, final int i2) {
        final x0.a T = T();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.i0
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).N();
            }
        };
        this.f4493j.put(1026, T);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(1026, aVar);
        lVar.a();
    }

    @Override // f.h.b.b.f1.a
    public void O(final boolean z) {
        final x0.a P = P();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.r0
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).x();
            }
        };
        this.f4493j.put(8, P);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(8, aVar);
        lVar.a();
    }

    public final x0.a P() {
        return R(this.f4492i.f4497d);
    }

    public final x0.a Q(q1 q1Var, int i2, z.a aVar) {
        long t;
        z.a aVar2 = q1Var.q() ? null : aVar;
        long elapsedRealtime = this.f4489f.elapsedRealtime();
        boolean z = false;
        boolean z2 = q1Var.equals(this.f4495l.D()) && i2 == this.f4495l.p();
        long j2 = 0;
        if (aVar2 != null && aVar2.a()) {
            if (z2 && this.f4495l.x() == aVar2.b && this.f4495l.n() == aVar2.c) {
                z = true;
            }
            if (z) {
                j2 = this.f4495l.J();
            }
        } else if (z2) {
            t = this.f4495l.t();
            return new x0.a(elapsedRealtime, q1Var, i2, aVar2, t, this.f4495l.D(), this.f4495l.p(), this.f4492i.f4497d, this.f4495l.J(), this.f4495l.f());
        } else if (!q1Var.q()) {
            j2 = q1Var.o(i2, this.f4491h, 0L).a();
        }
        t = j2;
        return new x0.a(elapsedRealtime, q1Var, i2, aVar2, t, this.f4495l.D(), this.f4495l.p(), this.f4492i.f4497d, this.f4495l.J(), this.f4495l.f());
    }

    public final x0.a R(z.a aVar) {
        Objects.requireNonNull(this.f4495l);
        q1 q1Var = aVar == null ? null : this.f4492i.c.get(aVar);
        if (aVar != null && q1Var != null) {
            return Q(q1Var, q1Var.h(aVar.a, this.f4490g).c, aVar);
        }
        int p = this.f4495l.p();
        q1 D = this.f4495l.D();
        if (!(p < D.p())) {
            D = q1.a;
        }
        return Q(D, p, null);
    }

    public final x0.a S(int i2, z.a aVar) {
        Objects.requireNonNull(this.f4495l);
        if (aVar != null) {
            if (this.f4492i.c.get(aVar) != null) {
                return R(aVar);
            }
            return Q(q1.a, i2, aVar);
        }
        q1 D = this.f4495l.D();
        if (!(i2 < D.p())) {
            D = q1.a;
        }
        return Q(D, i2, null);
    }

    public final x0.a T() {
        return R(this.f4492i.f4498e);
    }

    public final x0.a U() {
        return R(this.f4492i.f4499f);
    }

    @Override // f.h.b.b.f1.a
    public final void a() {
        final x0.a P = P();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.e0
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).a();
            }
        };
        this.f4493j.put(-1, P);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(-1, aVar);
        lVar.a();
    }

    @Override // f.h.b.b.h2.w
    public final void b(final int i2, final int i3, final int i4, final float f2) {
        final x0.a U = U();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.j
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).X();
            }
        };
        this.f4493j.put(1028, U);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(1028, aVar);
        lVar.a();
    }

    @Override // f.h.b.b.u1.q
    public final void c(final f.h.b.b.v1.d dVar) {
        final x0.a T = T();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.r
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                x0 x0Var = (x0) obj;
                x0Var.f();
                x0Var.j();
            }
        };
        this.f4493j.put(1014, T);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(1014, aVar);
        lVar.a();
    }

    @Override // f.h.b.b.f1.a
    public final void d(final int i2) {
        final x0.a P = P();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.c
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).R();
            }
        };
        this.f4493j.put(7, P);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(7, aVar);
        lVar.a();
    }

    @Override // f.h.b.b.f1.a
    public final void e(final int i2) {
        if (i2 == 1) {
            this.f4496m = false;
        }
        a aVar = this.f4492i;
        f1 f1Var = this.f4495l;
        Objects.requireNonNull(f1Var);
        aVar.f4497d = a.b(f1Var, aVar.b, aVar.f4498e, aVar.a);
        final x0.a P = P();
        l.a<x0> aVar2 = new l.a() { // from class: f.h.b.b.t1.k0
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).I();
            }
        };
        this.f4493j.put(12, P);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(12, aVar2);
        lVar.a();
    }

    @Override // f.h.b.b.h2.w
    public final void f(final String str) {
        final x0.a U = U();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.c0
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).G();
            }
        };
        this.f4493j.put(1024, U);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(1024, aVar);
        lVar.a();
    }

    @Override // f.h.b.b.u1.q
    public final void g(final f.h.b.b.v1.d dVar) {
        final x0.a U = U();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.q
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                x0 x0Var = (x0) obj;
                x0Var.k();
                x0Var.z();
            }
        };
        this.f4493j.put(1008, U);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(1008, aVar);
        lVar.a();
    }

    @Override // f.h.b.b.f1.a
    public final void h(final List<Metadata> list) {
        final x0.a P = P();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.z
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).i();
            }
        };
        this.f4493j.put(3, P);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(3, aVar);
        lVar.a();
    }

    @Override // f.h.b.b.h2.w
    public final void i(final String str, long j2, final long j3) {
        final x0.a U = U();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.m
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                x0 x0Var = (x0) obj;
                x0Var.F();
                x0Var.J();
            }
        };
        this.f4493j.put(1021, U);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(1021, aVar);
        lVar.a();
    }

    @Override // f.h.b.b.f1.a
    public final void j(final ExoPlaybackException exoPlaybackException) {
        final x0.a P;
        f.h.b.b.b2.x xVar = exoPlaybackException.f705l;
        if (xVar != null) {
            P = R(new z.a(xVar));
        } else {
            P = P();
        }
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.p
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).D();
            }
        };
        this.f4493j.put(11, P);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(11, aVar);
        lVar.a();
    }

    @Override // f.h.b.b.b2.a0
    public final void k(int i2, z.a aVar, final f.h.b.b.b2.v vVar) {
        final x0.a S = S(i2, aVar);
        l.a<x0> aVar2 = new l.a() { // from class: f.h.b.b.t1.e
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).B();
            }
        };
        this.f4493j.put(1004, S);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(1004, aVar2);
        lVar.a();
    }

    @Override // f.h.b.b.b2.a0
    public final void l(int i2, z.a aVar, final f.h.b.b.b2.s sVar, final f.h.b.b.b2.v vVar) {
        final x0.a S = S(i2, aVar);
        l.a<x0> aVar2 = new l.a() { // from class: f.h.b.b.t1.d0
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).m();
            }
        };
        this.f4493j.put(1002, S);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(1002, aVar2);
        lVar.a();
    }

    @Override // f.h.b.b.f1.a
    public final void m(final boolean z) {
        final x0.a P = P();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.b
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).P(x0.a.this, z);
            }
        };
        this.f4493j.put(4, P);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(4, aVar);
        lVar.a();
    }

    @Override // f.h.b.b.f1.a
    public final void n(q1 q1Var, final int i2) {
        a aVar = this.f4492i;
        f1 f1Var = this.f4495l;
        Objects.requireNonNull(f1Var);
        aVar.f4497d = a.b(f1Var, aVar.b, aVar.f4498e, aVar.a);
        aVar.d(f1Var.D());
        final x0.a P = P();
        l.a<x0> aVar2 = new l.a() { // from class: f.h.b.b.t1.s
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).v();
            }
        };
        this.f4493j.put(0, P);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(0, aVar2);
        lVar.a();
    }

    @Override // f.h.b.b.b2.a0
    public final void o(int i2, z.a aVar, final f.h.b.b.b2.s sVar, final f.h.b.b.b2.v vVar) {
        final x0.a S = S(i2, aVar);
        l.a<x0> aVar2 = new l.a() { // from class: f.h.b.b.t1.h0
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).H();
            }
        };
        this.f4493j.put(1000, S);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(1000, aVar2);
        lVar.a();
    }

    @Override // f.h.b.b.f1.a
    public final void p(final int i2) {
        final x0.a P = P();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.x
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).O();
            }
        };
        this.f4493j.put(5, P);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(5, aVar);
        lVar.a();
    }

    @Override // f.h.b.b.h2.w
    public final void q(final Surface surface) {
        final x0.a U = U();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.o0
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).c();
            }
        };
        this.f4493j.put(1027, U);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(1027, aVar);
        lVar.a();
    }

    @Override // f.h.b.b.u1.q
    public final void r(final String str) {
        final x0.a U = U();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.f
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).L();
            }
        };
        this.f4493j.put(1013, U);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(1013, aVar);
        lVar.a();
    }

    @Override // f.h.b.b.u1.q
    public final void s(final String str, long j2, final long j3) {
        final x0.a U = U();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.p0
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                x0 x0Var = (x0) obj;
                x0Var.K();
                x0Var.J();
            }
        };
        this.f4493j.put(1009, U);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(1009, aVar);
        lVar.a();
    }

    @Override // f.h.b.b.f1.a
    public final void t(final boolean z) {
        final x0.a P = P();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.t
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).p();
            }
        };
        this.f4493j.put(10, P);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(10, aVar);
        lVar.a();
    }

    @Override // f.h.b.b.f1.a
    public /* synthetic */ void u(f1 f1Var, f1.b bVar) {
        e1.a(this, f1Var, bVar);
    }

    @Override // f.h.b.b.h2.w
    public final void v(final int i2, final long j2) {
        final x0.a T = T();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.w
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).h();
            }
        };
        this.f4493j.put(1023, T);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(1023, aVar);
        lVar.a();
    }

    @Override // f.h.b.b.f1.a
    public /* synthetic */ void w(boolean z) {
        e1.b(this, z);
    }

    @Override // f.h.b.b.f1.a
    public final void x(final boolean z, final int i2) {
        final x0.a P = P();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.m0
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).A();
            }
        };
        this.f4493j.put(-1, P);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(-1, aVar);
        lVar.a();
    }

    @Override // f.h.b.b.u1.q
    public final void y(final Format format, final f.h.b.b.v1.e eVar) {
        final x0.a U = U();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.g0
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                x0 x0Var = (x0) obj;
                x0Var.Q(x0.a.this, format);
                x0Var.u();
            }
        };
        this.f4493j.put(1010, U);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(1010, aVar);
        lVar.a();
    }

    @Override // f.h.b.b.f1.a
    public final void z(final int i2) {
        final x0.a P = P();
        l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.j0
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).e();
            }
        };
        this.f4493j.put(9, P);
        f.h.b.b.g2.l<x0, x0.b> lVar = this.f4494k;
        lVar.b(9, aVar);
        lVar.a();
    }
}
