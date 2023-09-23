package f.h.b.b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import f.h.b.b.a1;
import f.h.b.b.b2.w;
import f.h.b.b.b2.z;
import f.h.b.b.g1;
import f.h.b.b.m0;
import f.h.b.b.q1;
import f.h.b.b.u0;
import f.h.c.b.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ExoPlayerImplInternal.java */
/* loaded from: classes.dex */
public final class q0 implements Handler.Callback, w.a, a1.d, m0.a, g1.a {
    public n1 A;
    public b1 B;
    public d C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public g O;
    public long P;
    public int Q;
    public boolean R;
    public ExoPlaybackException S;

    /* renamed from: f  reason: collision with root package name */
    public final j1[] f4445f;

    /* renamed from: g  reason: collision with root package name */
    public final k1[] f4446g;

    /* renamed from: h  reason: collision with root package name */
    public final f.h.b.b.d2.l f4447h;

    /* renamed from: i  reason: collision with root package name */
    public final f.h.b.b.d2.m f4448i;

    /* renamed from: j  reason: collision with root package name */
    public final l0 f4449j;

    /* renamed from: k  reason: collision with root package name */
    public final f.h.b.b.f2.d f4450k;

    /* renamed from: l  reason: collision with root package name */
    public final f.h.b.b.g2.y f4451l;

    /* renamed from: m  reason: collision with root package name */
    public final HandlerThread f4452m;
    public final Looper n;
    public final q1.c o;
    public final q1.b p;
    public final long q;
    public final boolean r = false;
    public final m0 s;
    public final ArrayList<c> t;
    public final f.h.b.b.g2.f u;
    public final e v;
    public final y0 w;
    public final a1 x;
    public final t0 y;
    public final long z;

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final List<a1.c> a;
        public final f.h.b.b.b2.i0 b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final long f4453d;

        public a(List list, f.h.b.b.b2.i0 i0Var, int i2, long j2, p0 p0Var) {
            this.a = list;
            this.b = i0Var;
            this.c = i2;
            this.f4453d = j2;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes.dex */
    public static class b {
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes.dex */
    public static final class c implements Comparable<c> {

        /* renamed from: f  reason: collision with root package name */
        public final g1 f4454f;

        /* renamed from: g  reason: collision with root package name */
        public int f4455g;

        /* renamed from: h  reason: collision with root package name */
        public long f4456h;

        /* renamed from: i  reason: collision with root package name */
        public Object f4457i;

        public void a(int i2, long j2, Object obj) {
            this.f4455g = i2;
            this.f4456h = j2;
            this.f4457i = obj;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0015, code lost:
            if (r0 != null) goto L10;
         */
        @Override // java.lang.Comparable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int compareTo(f.h.b.b.q0.c r9) {
            /*
                r8 = this;
                f.h.b.b.q0$c r9 = (f.h.b.b.q0.c) r9
                java.lang.Object r0 = r8.f4457i
                r1 = 1
                r2 = 0
                if (r0 != 0) goto La
                r3 = 1
                goto Lb
            La:
                r3 = 0
            Lb:
                java.lang.Object r4 = r9.f4457i
                if (r4 != 0) goto L11
                r4 = 1
                goto L12
            L11:
                r4 = 0
            L12:
                r5 = -1
                if (r3 == r4) goto L1a
                if (r0 == 0) goto L18
            L17:
                r1 = -1
            L18:
                r2 = r1
                goto L35
            L1a:
                if (r0 != 0) goto L1d
                goto L35
            L1d:
                int r0 = r8.f4455g
                int r3 = r9.f4455g
                int r0 = r0 - r3
                if (r0 == 0) goto L26
                r2 = r0
                goto L35
            L26:
                long r3 = r8.f4456h
                long r6 = r9.f4456h
                int r9 = f.h.b.b.g2.b0.a
                int r9 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r9 >= 0) goto L31
                goto L17
            L31:
                if (r9 != 0) goto L18
                r1 = 0
                goto L18
            L35:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.q0.c.compareTo(java.lang.Object):int");
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes.dex */
    public static final class d {
        public boolean a;
        public b1 b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4458d;

        /* renamed from: e  reason: collision with root package name */
        public int f4459e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f4460f;

        /* renamed from: g  reason: collision with root package name */
        public int f4461g;

        public d(b1 b1Var) {
            this.b = b1Var;
        }

        public void a(int i2) {
            this.a |= i2 > 0;
            this.c += i2;
        }

        public void b(int i2) {
            if (this.f4458d && this.f4459e != 4) {
                f.h.b.b.e2.j.c(i2 == 4);
                return;
            }
            this.a = true;
            this.f4458d = true;
            this.f4459e = i2;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes.dex */
    public interface e {
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes.dex */
    public static final class f {
        public final z.a a;
        public final long b;
        public final long c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f4462d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f4463e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f4464f;

        public f(z.a aVar, long j2, long j3, boolean z, boolean z2, boolean z3) {
            this.a = aVar;
            this.b = j2;
            this.c = j3;
            this.f4462d = z;
            this.f4463e = z2;
            this.f4464f = z3;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes.dex */
    public static final class g {
        public final q1 a;
        public final int b;
        public final long c;

        public g(q1 q1Var, int i2, long j2) {
            this.a = q1Var;
            this.b = i2;
            this.c = j2;
        }
    }

    public q0(j1[] j1VarArr, f.h.b.b.d2.l lVar, f.h.b.b.d2.m mVar, l0 l0Var, f.h.b.b.f2.d dVar, int i2, boolean z, f.h.b.b.t1.w0 w0Var, n1 n1Var, t0 t0Var, long j2, boolean z2, Looper looper, f.h.b.b.g2.f fVar, e eVar) {
        this.v = eVar;
        this.f4445f = j1VarArr;
        this.f4447h = lVar;
        this.f4448i = mVar;
        this.f4449j = l0Var;
        this.f4450k = dVar;
        this.I = i2;
        this.J = z;
        this.A = n1Var;
        this.y = t0Var;
        this.z = j2;
        this.E = z2;
        this.u = fVar;
        this.q = l0Var.f4399g;
        b1 i3 = b1.i(mVar);
        this.B = i3;
        this.C = new d(i3);
        this.f4446g = new k1[j1VarArr.length];
        for (int i4 = 0; i4 < j1VarArr.length; i4++) {
            j1VarArr[i4].f(i4);
            this.f4446g[i4] = j1VarArr[i4].l();
        }
        this.s = new m0(this, fVar);
        this.t = new ArrayList<>();
        this.o = new q1.c();
        this.p = new q1.b();
        lVar.a = dVar;
        this.R = true;
        Handler handler = new Handler(looper);
        this.w = new y0(w0Var, handler);
        this.x = new a1(this, w0Var, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f4452m = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.n = looper2;
        this.f4451l = fVar.b(looper2, this);
    }

    public static boolean I(c cVar, q1 q1Var, q1 q1Var2, int i2, boolean z, q1.c cVar2, q1.b bVar) {
        Object obj = cVar.f4457i;
        if (obj == null) {
            Objects.requireNonNull(cVar.f4454f);
            Objects.requireNonNull(cVar.f4454f);
            long a2 = h0.a(-9223372036854775807L);
            g1 g1Var = cVar.f4454f;
            Pair<Object, Long> K = K(q1Var, new g(g1Var.f4256d, g1Var.f4260h, a2), false, i2, z, cVar2, bVar);
            if (K == null) {
                return false;
            }
            cVar.a(q1Var.b(K.first), ((Long) K.second).longValue(), K.first);
            Objects.requireNonNull(cVar.f4454f);
            return true;
        }
        int b2 = q1Var.b(obj);
        if (b2 == -1) {
            return false;
        }
        Objects.requireNonNull(cVar.f4454f);
        cVar.f4455g = b2;
        q1Var2.h(cVar.f4457i, bVar);
        if (q1Var2.n(bVar.c, cVar2).f4476l) {
            Pair<Object, Long> j2 = q1Var.j(cVar2, bVar, q1Var.h(cVar.f4457i, bVar).c, cVar.f4456h + bVar.f4466e);
            cVar.a(q1Var.b(j2.first), ((Long) j2.second).longValue(), j2.first);
        }
        return true;
    }

    public static Pair<Object, Long> K(q1 q1Var, g gVar, boolean z, int i2, boolean z2, q1.c cVar, q1.b bVar) {
        Pair<Object, Long> j2;
        Object L;
        q1 q1Var2 = gVar.a;
        if (q1Var.q()) {
            return null;
        }
        q1 q1Var3 = q1Var2.q() ? q1Var : q1Var2;
        try {
            j2 = q1Var3.j(cVar, bVar, gVar.b, gVar.c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (q1Var.equals(q1Var3)) {
            return j2;
        }
        if (q1Var.b(j2.first) != -1) {
            q1Var3.h(j2.first, bVar);
            return q1Var3.n(bVar.c, cVar).f4476l ? q1Var.j(cVar, bVar, q1Var.h(j2.first, bVar).c, gVar.c) : j2;
        }
        if (z && (L = L(cVar, bVar, i2, z2, j2.first, q1Var3, q1Var)) != null) {
            return q1Var.j(cVar, bVar, q1Var.h(L, bVar).c, -9223372036854775807L);
        }
        return null;
    }

    public static Object L(q1.c cVar, q1.b bVar, int i2, boolean z, Object obj, q1 q1Var, q1 q1Var2) {
        int b2 = q1Var.b(obj);
        int i3 = q1Var.i();
        int i4 = b2;
        int i5 = -1;
        for (int i6 = 0; i6 < i3 && i5 == -1; i6++) {
            i4 = q1Var.d(i4, bVar, cVar, i2, z);
            if (i4 == -1) {
                break;
            }
            i5 = q1Var2.b(q1Var.m(i4));
        }
        if (i5 == -1) {
            return null;
        }
        return q1Var2.m(i5);
    }

    public static boolean f0(b1 b1Var, q1.b bVar, q1.c cVar) {
        z.a aVar = b1Var.b;
        q1 q1Var = b1Var.a;
        return aVar.a() || q1Var.q() || q1Var.n(q1Var.h(aVar.a, bVar).c, cVar).f4476l;
    }

    public static Format[] j(f.h.b.b.d2.g gVar) {
        int length = gVar != null ? gVar.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i2 = 0; i2 < length; i2++) {
            formatArr[i2] = gVar.d(i2);
        }
        return formatArr;
    }

    public static boolean w(j1 j1Var) {
        return j1Var.getState() != 0;
    }

    public final void A(b bVar) {
        this.C.a(1);
        a1 a1Var = this.x;
        Objects.requireNonNull(bVar);
        Objects.requireNonNull(a1Var);
        f.h.b.b.e2.j.c(a1Var.e() >= 0);
        a1Var.f3778i = null;
        r(a1Var.c());
    }

    public final void B() {
        this.C.a(1);
        F(false, false, false, true);
        this.f4449j.b(false);
        c0(this.B.a.q() ? 4 : 2);
        a1 a1Var = this.x;
        f.h.b.b.f2.t c2 = this.f4450k.c();
        f.h.b.b.e2.j.g(!a1Var.f3779j);
        a1Var.f3780k = c2;
        for (int i2 = 0; i2 < a1Var.a.size(); i2++) {
            a1.c cVar = a1Var.a.get(i2);
            a1Var.g(cVar);
            a1Var.f3777h.add(cVar);
        }
        a1Var.f3779j = true;
        this.f4451l.d(2);
    }

    public final void C() {
        F(true, false, true, false);
        this.f4449j.b(true);
        c0(1);
        this.f4452m.quit();
        synchronized (this) {
            this.D = true;
            notifyAll();
        }
    }

    public final void D(int i2, int i3, f.h.b.b.b2.i0 i0Var) {
        boolean z = true;
        this.C.a(1);
        a1 a1Var = this.x;
        Objects.requireNonNull(a1Var);
        f.h.b.b.e2.j.c((i2 < 0 || i2 > i3 || i3 > a1Var.e()) ? false : false);
        a1Var.f3778i = i0Var;
        a1Var.i(i2, i3);
        r(a1Var.c());
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0046 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.q0.E():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(boolean r33, boolean r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.q0.F(boolean, boolean, boolean, boolean):void");
    }

    public final void G() {
        w0 w0Var = this.w.f4664h;
        this.F = w0Var != null && w0Var.f4642f.f4655g && this.E;
    }

    public final void H(long j2) {
        j1[] j1VarArr;
        f.h.b.b.d2.g[] gVarArr;
        w0 w0Var = this.w.f4664h;
        if (w0Var != null) {
            j2 += w0Var.o;
        }
        this.P = j2;
        this.s.f4402f.a(j2);
        for (j1 j1Var : this.f4445f) {
            if (w(j1Var)) {
                j1Var.u(this.P);
            }
        }
        for (w0 w0Var2 = this.w.f4664h; w0Var2 != null; w0Var2 = w0Var2.f4648l) {
            for (f.h.b.b.d2.g gVar : w0Var2.n.c) {
                if (gVar != null) {
                    gVar.j();
                }
            }
        }
    }

    public final void J(q1 q1Var, q1 q1Var2) {
        if (q1Var.q() && q1Var2.q()) {
            return;
        }
        int size = this.t.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (!I(this.t.get(size), q1Var, q1Var2, this.I, this.J, this.o, this.p)) {
                    this.t.get(size).f4454f.c(false);
                    this.t.remove(size);
                }
            } else {
                Collections.sort(this.t);
                return;
            }
        }
    }

    public final void M(long j2, long j3) {
        this.f4451l.a.removeMessages(2);
        this.f4451l.a.sendEmptyMessageAtTime(2, j2 + j3);
    }

    public final void N(boolean z) {
        z.a aVar = this.w.f4664h.f4642f.a;
        long Q = Q(aVar, this.B.r, true, false);
        if (Q != this.B.r) {
            this.B = u(aVar, Q, this.B.c);
            if (z) {
                this.C.b(4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O(f.h.b.b.q0.g r19) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.q0.O(f.h.b.b.q0$g):void");
    }

    public final long P(z.a aVar, long j2, boolean z) {
        y0 y0Var = this.w;
        return Q(aVar, j2, y0Var.f4664h != y0Var.f4665i, z);
    }

    public final long Q(z.a aVar, long j2, boolean z, boolean z2) {
        y0 y0Var;
        i0();
        this.G = false;
        if (z2 || this.B.f3790d == 3) {
            c0(2);
        }
        w0 w0Var = this.w.f4664h;
        w0 w0Var2 = w0Var;
        while (w0Var2 != null && !aVar.equals(w0Var2.f4642f.a)) {
            w0Var2 = w0Var2.f4648l;
        }
        if (z || w0Var != w0Var2 || (w0Var2 != null && w0Var2.o + j2 < 0)) {
            for (j1 j1Var : this.f4445f) {
                f(j1Var);
            }
            if (w0Var2 != null) {
                while (true) {
                    y0Var = this.w;
                    if (y0Var.f4664h == w0Var2) {
                        break;
                    }
                    y0Var.a();
                }
                y0Var.m(w0Var2);
                w0Var2.o = 0L;
                h();
            }
        }
        if (w0Var2 != null) {
            this.w.m(w0Var2);
            if (!w0Var2.f4640d) {
                w0Var2.f4642f = w0Var2.f4642f.b(j2);
            } else {
                long j3 = w0Var2.f4642f.f4653e;
                if (j3 != -9223372036854775807L && j2 >= j3) {
                    j2 = Math.max(0L, j3 - 1);
                }
                if (w0Var2.f4641e) {
                    long f2 = w0Var2.a.f(j2);
                    w0Var2.a.r(f2 - this.q, this.r);
                    j2 = f2;
                }
            }
            H(j2);
            y();
        } else {
            this.w.b();
            H(j2);
        }
        q(false);
        this.f4451l.d(2);
        return j2;
    }

    public final void R(g1 g1Var) {
        if (g1Var.f4259g == this.n) {
            e(g1Var);
            int i2 = this.B.f3790d;
            if (i2 == 3 || i2 == 2) {
                this.f4451l.d(2);
                return;
            }
            return;
        }
        this.f4451l.c(15, g1Var).sendToTarget();
    }

    public final void S(final g1 g1Var) {
        Looper looper = g1Var.f4259g;
        if (!looper.getThread().isAlive()) {
            Log.w("TAG", "Trying to send message on a dead thread.");
            g1Var.c(false);
            return;
        }
        f.h.b.b.g2.y b2 = this.u.b(looper, null);
        b2.a.post(new Runnable() { // from class: f.h.b.b.x
            @Override // java.lang.Runnable
            public final void run() {
                q0 q0Var = q0.this;
                g1 g1Var2 = g1Var;
                Objects.requireNonNull(q0Var);
                try {
                    q0Var.e(g1Var2);
                } catch (ExoPlaybackException e2) {
                    f.h.b.b.g2.m.b("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
                    throw new RuntimeException(e2);
                }
            }
        });
    }

    public final void T(boolean z, AtomicBoolean atomicBoolean) {
        j1[] j1VarArr;
        if (this.K != z) {
            this.K = z;
            if (!z) {
                for (j1 j1Var : this.f4445f) {
                    if (!w(j1Var)) {
                        j1Var.d();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void U(a aVar) {
        this.C.a(1);
        if (aVar.c != -1) {
            this.O = new g(new h1(aVar.a, aVar.b), aVar.c, aVar.f4453d);
        }
        a1 a1Var = this.x;
        List<a1.c> list = aVar.a;
        f.h.b.b.b2.i0 i0Var = aVar.b;
        a1Var.i(0, a1Var.a.size());
        r(a1Var.a(a1Var.a.size(), list, i0Var));
    }

    public final void V(boolean z) {
        if (z == this.M) {
            return;
        }
        this.M = z;
        b1 b1Var = this.B;
        int i2 = b1Var.f3790d;
        if (!z && i2 != 4 && i2 != 1) {
            this.f4451l.d(2);
        } else {
            this.B = b1Var.c(z);
        }
    }

    public final void W(boolean z) {
        this.E = z;
        G();
        if (this.F) {
            y0 y0Var = this.w;
            if (y0Var.f4665i != y0Var.f4664h) {
                N(true);
                q(false);
            }
        }
    }

    public final void X(boolean z, int i2, boolean z2, int i3) {
        f.h.b.b.d2.g[] gVarArr;
        this.C.a(z2 ? 1 : 0);
        d dVar = this.C;
        dVar.a = true;
        dVar.f4460f = true;
        dVar.f4461g = i3;
        this.B = this.B.d(z, i2);
        this.G = false;
        for (w0 w0Var = this.w.f4664h; w0Var != null; w0Var = w0Var.f4648l) {
            for (f.h.b.b.d2.g gVar : w0Var.n.c) {
                if (gVar != null) {
                    gVar.c(z);
                }
            }
        }
        if (!d0()) {
            i0();
            m0();
            return;
        }
        int i4 = this.B.f3790d;
        if (i4 == 3) {
            g0();
            this.f4451l.d(2);
        } else if (i4 == 2) {
            this.f4451l.d(2);
        }
    }

    public final void Y(c1 c1Var) {
        this.s.h(c1Var);
        c1 c2 = this.s.c();
        t(c2, c2.a, true, true);
    }

    public final void Z(int i2) {
        this.I = i2;
        y0 y0Var = this.w;
        q1 q1Var = this.B.a;
        y0Var.f4662f = i2;
        if (!y0Var.p(q1Var)) {
            N(true);
        }
        q(false);
    }

    @Override // f.h.b.b.b2.h0.a
    public void a(f.h.b.b.b2.w wVar) {
        this.f4451l.c(9, wVar).sendToTarget();
    }

    public final void a0(boolean z) {
        this.J = z;
        y0 y0Var = this.w;
        q1 q1Var = this.B.a;
        y0Var.f4663g = z;
        if (!y0Var.p(q1Var)) {
            N(true);
        }
        q(false);
    }

    @Override // f.h.b.b.b2.w.a
    public void b(f.h.b.b.b2.w wVar) {
        this.f4451l.c(8, wVar).sendToTarget();
    }

    public final void b0(f.h.b.b.b2.i0 i0Var) {
        this.C.a(1);
        a1 a1Var = this.x;
        int e2 = a1Var.e();
        if (i0Var.a() != e2) {
            i0Var = i0Var.h().f(0, e2);
        }
        a1Var.f3778i = i0Var;
        r(a1Var.c());
    }

    public final void c(a aVar, int i2) {
        this.C.a(1);
        a1 a1Var = this.x;
        if (i2 == -1) {
            i2 = a1Var.e();
        }
        r(a1Var.a(i2, aVar.a, aVar.b));
    }

    public final void c0(int i2) {
        b1 b1Var = this.B;
        if (b1Var.f3790d != i2) {
            this.B = b1Var.g(i2);
        }
    }

    public final void d(ExoPlaybackException exoPlaybackException) {
        f.h.b.b.e2.j.c(exoPlaybackException.f706m && exoPlaybackException.f699f == 1);
        try {
            N(true);
        } catch (Exception e2) {
            exoPlaybackException.addSuppressed(e2);
            throw exoPlaybackException;
        }
    }

    public final boolean d0() {
        b1 b1Var = this.B;
        return b1Var.f3797k && b1Var.f3798l == 0;
    }

    public final void e(g1 g1Var) {
        g1Var.b();
        try {
            g1Var.a.r(g1Var.f4257e, g1Var.f4258f);
        } finally {
            g1Var.c(true);
        }
    }

    public final boolean e0(q1 q1Var, z.a aVar) {
        if (aVar.a() || q1Var.q()) {
            return false;
        }
        q1Var.n(q1Var.h(aVar.a, this.p).c, this.o);
        if (this.o.c()) {
            q1.c cVar = this.o;
            return cVar.f4473i && cVar.f4470f != -9223372036854775807L;
        }
        return false;
    }

    public final void f(j1 j1Var) {
        if (j1Var.getState() != 0) {
            m0 m0Var = this.s;
            if (j1Var == m0Var.f4404h) {
                m0Var.f4405i = null;
                m0Var.f4404h = null;
                m0Var.f4406j = true;
            }
            if (j1Var.getState() == 2) {
                j1Var.stop();
            }
            j1Var.g();
            this.N--;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:315:0x04a1, code lost:
        if (r7 == false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
        if (r7 != (-9223372036854775807L)) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x027f A[EDGE_INSN: B:407:0x027f->B:161:0x027f ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0302 A[EDGE_INSN: B:413:0x0302->B:191:0x0302 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 1563
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.q0.g():void");
    }

    public final void g0() {
        j1[] j1VarArr;
        this.G = false;
        m0 m0Var = this.s;
        m0Var.f4407k = true;
        m0Var.f4402f.b();
        for (j1 j1Var : this.f4445f) {
            if (w(j1Var)) {
                j1Var.start();
            }
        }
    }

    public final void h() {
        i(new boolean[this.f4445f.length]);
    }

    public final void h0(boolean z, boolean z2) {
        F(z || !this.K, false, true, false);
        this.C.a(z2 ? 1 : 0);
        this.f4449j.b(true);
        c0(1);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        w0 w0Var;
        try {
            switch (message.what) {
                case 0:
                    B();
                    break;
                case 1:
                    X(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    g();
                    break;
                case 3:
                    O((g) message.obj);
                    break;
                case 4:
                    Y((c1) message.obj);
                    break;
                case 5:
                    this.A = (n1) message.obj;
                    break;
                case 6:
                    h0(false, true);
                    break;
                case 7:
                    C();
                    return true;
                case 8:
                    s((f.h.b.b.b2.w) message.obj);
                    break;
                case 9:
                    p((f.h.b.b.b2.w) message.obj);
                    break;
                case 10:
                    E();
                    break;
                case 11:
                    Z(message.arg1);
                    break;
                case 12:
                    a0(message.arg1 != 0);
                    break;
                case 13:
                    T(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    g1 g1Var = (g1) message.obj;
                    Objects.requireNonNull(g1Var);
                    R(g1Var);
                    break;
                case 15:
                    S((g1) message.obj);
                    break;
                case 16:
                    c1 c1Var = (c1) message.obj;
                    t(c1Var, c1Var.a, true, false);
                    break;
                case 17:
                    U((a) message.obj);
                    break;
                case 18:
                    c((a) message.obj, message.arg1);
                    break;
                case 19:
                    A((b) message.obj);
                    break;
                case 20:
                    D(message.arg1, message.arg2, (f.h.b.b.b2.i0) message.obj);
                    break;
                case 21:
                    b0((f.h.b.b.b2.i0) message.obj);
                    break;
                case 22:
                    r(this.x.c());
                    break;
                case 23:
                    W(message.arg1 != 0);
                    break;
                case 24:
                    V(message.arg1 == 1);
                    break;
                case 25:
                    d((ExoPlaybackException) message.obj);
                    break;
                default:
                    return false;
            }
            z();
        } catch (ExoPlaybackException e2) {
            e = e2;
            if (e.f699f == 1 && (w0Var = this.w.f4665i) != null) {
                e = e.a(w0Var.f4642f.a);
            }
            if (e.f706m && this.S == null) {
                f.h.b.b.g2.m.c("ExoPlayerImplInternal", "Recoverable playback error", e);
                this.S = e;
                Message c2 = this.f4451l.c(25, e);
                c2.getTarget().sendMessageAtFrontOfQueue(c2);
            } else {
                ExoPlaybackException exoPlaybackException = this.S;
                if (exoPlaybackException != null) {
                    e.addSuppressed(exoPlaybackException);
                    this.S = null;
                }
                f.h.b.b.g2.m.b("ExoPlayerImplInternal", "Playback error", e);
                h0(true, false);
                this.B = this.B.e(e);
            }
            z();
        } catch (IOException e3) {
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(0, e3);
            w0 w0Var2 = this.w.f4664h;
            if (w0Var2 != null) {
                exoPlaybackException2 = exoPlaybackException2.a(w0Var2.f4642f.a);
            }
            f.h.b.b.g2.m.b("ExoPlayerImplInternal", "Playback error", exoPlaybackException2);
            h0(false, false);
            this.B = this.B.e(exoPlaybackException2);
            z();
        } catch (RuntimeException e4) {
            ExoPlaybackException exoPlaybackException3 = new ExoPlaybackException(2, e4);
            f.h.b.b.g2.m.b("ExoPlayerImplInternal", "Playback error", exoPlaybackException3);
            h0(true, false);
            this.B = this.B.e(exoPlaybackException3);
            z();
        }
        return true;
    }

    public final void i(boolean[] zArr) {
        f.h.b.b.g2.o oVar;
        w0 w0Var = this.w.f4665i;
        f.h.b.b.d2.m mVar = w0Var.n;
        for (int i2 = 0; i2 < this.f4445f.length; i2++) {
            if (!mVar.b(i2)) {
                this.f4445f[i2].d();
            }
        }
        for (int i3 = 0; i3 < this.f4445f.length; i3++) {
            if (mVar.b(i3)) {
                boolean z = zArr[i3];
                j1 j1Var = this.f4445f[i3];
                if (w(j1Var)) {
                    continue;
                } else {
                    y0 y0Var = this.w;
                    w0 w0Var2 = y0Var.f4665i;
                    boolean z2 = w0Var2 == y0Var.f4664h;
                    f.h.b.b.d2.m mVar2 = w0Var2.n;
                    l1 l1Var = mVar2.b[i3];
                    Format[] j2 = j(mVar2.c[i3]);
                    boolean z3 = d0() && this.B.f3790d == 3;
                    boolean z4 = !z && z3;
                    this.N++;
                    j1Var.o(l1Var, j2, w0Var2.c[i3], this.P, z4, z2, w0Var2.e(), w0Var2.o);
                    j1Var.r(103, new p0(this));
                    m0 m0Var = this.s;
                    Objects.requireNonNull(m0Var);
                    f.h.b.b.g2.o w = j1Var.w();
                    if (w != null && w != (oVar = m0Var.f4405i)) {
                        if (oVar == null) {
                            m0Var.f4405i = w;
                            m0Var.f4404h = j1Var;
                            w.h(m0Var.f4402f.f4311j);
                        } else {
                            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                    }
                    if (z3) {
                        j1Var.start();
                    }
                }
            }
        }
        w0Var.f4643g = true;
    }

    public final void i0() {
        j1[] j1VarArr;
        m0 m0Var = this.s;
        m0Var.f4407k = false;
        f.h.b.b.g2.w wVar = m0Var.f4402f;
        if (wVar.f4308g) {
            wVar.a(wVar.m());
            wVar.f4308g = false;
        }
        for (j1 j1Var : this.f4445f) {
            if (w(j1Var) && j1Var.getState() == 2) {
                j1Var.stop();
            }
        }
    }

    public final void j0() {
        w0 w0Var = this.w.f4666j;
        boolean z = this.H || (w0Var != null && w0Var.a.h());
        b1 b1Var = this.B;
        if (z != b1Var.f3792f) {
            this.B = new b1(b1Var.a, b1Var.b, b1Var.c, b1Var.f3790d, b1Var.f3791e, z, b1Var.f3793g, b1Var.f3794h, b1Var.f3795i, b1Var.f3796j, b1Var.f3797k, b1Var.f3798l, b1Var.f3799m, b1Var.p, b1Var.q, b1Var.r, b1Var.n, b1Var.o);
        }
    }

    public final long k(q1 q1Var, Object obj, long j2) {
        long elapsedRealtime;
        q1Var.n(q1Var.h(obj, this.p).c, this.o);
        q1.c cVar = this.o;
        if (cVar.f4470f != -9223372036854775807L && cVar.c()) {
            q1.c cVar2 = this.o;
            if (cVar2.f4473i) {
                long j3 = cVar2.f4471g;
                int i2 = f.h.b.b.g2.b0.a;
                if (j3 == -9223372036854775807L) {
                    elapsedRealtime = System.currentTimeMillis();
                } else {
                    elapsedRealtime = j3 + SystemClock.elapsedRealtime();
                }
                return h0.a(elapsedRealtime - this.o.f4470f) - (j2 + this.p.f4466e);
            }
        }
        return -9223372036854775807L;
    }

    public final void k0(q1 q1Var, z.a aVar, q1 q1Var2, z.a aVar2, long j2) {
        if (q1Var.q() || !e0(q1Var, aVar)) {
            return;
        }
        q1Var.n(q1Var.h(aVar.a, this.p).c, this.o);
        t0 t0Var = this.y;
        u0.e eVar = this.o.f4475k;
        int i2 = f.h.b.b.g2.b0.a;
        k0 k0Var = (k0) t0Var;
        Objects.requireNonNull(k0Var);
        k0Var.f4386d = h0.a(eVar.a);
        k0Var.f4389g = h0.a(eVar.b);
        k0Var.f4390h = h0.a(eVar.c);
        float f2 = eVar.f4511d;
        if (f2 == -3.4028235E38f) {
            f2 = 0.97f;
        }
        k0Var.f4393k = f2;
        float f3 = eVar.f4512e;
        if (f3 == -3.4028235E38f) {
            f3 = 1.03f;
        }
        k0Var.f4392j = f3;
        k0Var.a();
        if (j2 != -9223372036854775807L) {
            k0 k0Var2 = (k0) this.y;
            k0Var2.f4387e = k(q1Var, aVar.a, j2);
            k0Var2.a();
            return;
        }
        if (f.h.b.b.g2.b0.a(q1Var2.q() ? null : q1Var2.n(q1Var2.h(aVar2.a, this.p).c, this.o).a, this.o.a)) {
            return;
        }
        k0 k0Var3 = (k0) this.y;
        k0Var3.f4387e = -9223372036854775807L;
        k0Var3.a();
    }

    public final long l() {
        w0 w0Var = this.w.f4665i;
        if (w0Var == null) {
            return 0L;
        }
        long j2 = w0Var.o;
        if (!w0Var.f4640d) {
            return j2;
        }
        int i2 = 0;
        while (true) {
            j1[] j1VarArr = this.f4445f;
            if (i2 >= j1VarArr.length) {
                return j2;
            }
            if (w(j1VarArr[i2]) && this.f4445f[i2].getStream() == w0Var.c[i2]) {
                long t = this.f4445f[i2].t();
                if (t == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j2 = Math.max(t, j2);
            }
            i2++;
        }
    }

    public final void l0(TrackGroupArray trackGroupArray, f.h.b.b.d2.m mVar) {
        l0 l0Var = this.f4449j;
        j1[] j1VarArr = this.f4445f;
        f.h.b.b.d2.g[] gVarArr = mVar.c;
        int i2 = l0Var.f4398f;
        if (i2 == -1) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = 13107200;
                if (i3 < j1VarArr.length) {
                    if (gVarArr[i3] != null) {
                        int x = j1VarArr[i3].x();
                        if (x == 0) {
                            i5 = 144310272;
                        } else if (x != 1) {
                            if (x == 2) {
                                i5 = 131072000;
                            } else if (x == 3 || x == 5 || x == 6) {
                                i5 = 131072;
                            } else if (x != 7) {
                                throw new IllegalArgumentException();
                            } else {
                                i5 = 0;
                            }
                        }
                        i4 += i5;
                    }
                    i3++;
                } else {
                    i2 = Math.max(13107200, i4);
                    break;
                }
            }
        }
        l0Var.f4400h = i2;
        l0Var.a.b(i2);
    }

    public final Pair<z.a, Long> m(q1 q1Var) {
        if (q1Var.q()) {
            z.a aVar = b1.s;
            return Pair.create(b1.s, 0L);
        }
        Pair<Object, Long> j2 = q1Var.j(this.o, this.p, q1Var.a(this.J), -9223372036854775807L);
        z.a n = this.w.n(q1Var, j2.first, 0L);
        long longValue = ((Long) j2.second).longValue();
        if (n.a()) {
            q1Var.h(n.a, this.p);
            longValue = n.c == this.p.e(n.b) ? this.p.f4467f.f3877e : 0L;
        }
        return Pair.create(n, Long.valueOf(longValue));
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0199 A[LOOP:2: B:78:0x017d->B:88:0x0199, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01aa  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x013d -> B:64:0x0144). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x017c -> B:78:0x017d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m0() {
        /*
            Method dump skipped, instructions count: 859
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.q0.m0():void");
    }

    public final long n() {
        return o(this.B.p);
    }

    public final long o(long j2) {
        w0 w0Var = this.w.f4666j;
        if (w0Var == null) {
            return 0L;
        }
        return Math.max(0L, j2 - (this.P - w0Var.o));
    }

    public final void p(f.h.b.b.b2.w wVar) {
        y0 y0Var = this.w;
        w0 w0Var = y0Var.f4666j;
        if (w0Var != null && w0Var.a == wVar) {
            y0Var.l(this.P);
            y();
        }
    }

    public final void q(boolean z) {
        long d2;
        w0 w0Var = this.w.f4666j;
        z.a aVar = w0Var == null ? this.B.b : w0Var.f4642f.a;
        boolean z2 = !this.B.f3796j.equals(aVar);
        if (z2) {
            this.B = this.B.a(aVar);
        }
        b1 b1Var = this.B;
        if (w0Var == null) {
            d2 = b1Var.r;
        } else {
            d2 = w0Var.d();
        }
        b1Var.p = d2;
        this.B.q = n();
        if ((z2 || z) && w0Var != null && w0Var.f4640d) {
            l0(w0Var.f4649m, w0Var.n);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(f.h.b.b.q1 r40) {
        /*
            Method dump skipped, instructions count: 709
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.q0.r(f.h.b.b.q1):void");
    }

    public final void s(f.h.b.b.b2.w wVar) {
        w0 w0Var = this.w.f4666j;
        if (w0Var != null && w0Var.a == wVar) {
            float f2 = this.s.c().a;
            q1 q1Var = this.B.a;
            w0Var.f4640d = true;
            w0Var.f4649m = w0Var.a.n();
            f.h.b.b.d2.m i2 = w0Var.i(f2, q1Var);
            x0 x0Var = w0Var.f4642f;
            long j2 = x0Var.b;
            long j3 = x0Var.f4653e;
            if (j3 != -9223372036854775807L && j2 >= j3) {
                j2 = Math.max(0L, j3 - 1);
            }
            long a2 = w0Var.a(i2, j2, false, new boolean[w0Var.f4645i.length]);
            long j4 = w0Var.o;
            x0 x0Var2 = w0Var.f4642f;
            w0Var.o = (x0Var2.b - a2) + j4;
            w0Var.f4642f = x0Var2.b(a2);
            l0(w0Var.f4649m, w0Var.n);
            if (w0Var == this.w.f4664h) {
                H(w0Var.f4642f.b);
                h();
                b1 b1Var = this.B;
                this.B = u(b1Var.b, w0Var.f4642f.b, b1Var.c);
            }
            y();
        }
    }

    public final void t(c1 c1Var, float f2, boolean z, boolean z2) {
        int i2;
        if (z) {
            if (z2) {
                this.C.a(1);
            }
            this.B = this.B.f(c1Var);
        }
        float f3 = c1Var.a;
        w0 w0Var = this.w.f4664h;
        while (true) {
            i2 = 0;
            if (w0Var == null) {
                break;
            }
            f.h.b.b.d2.g[] gVarArr = w0Var.n.c;
            int length = gVarArr.length;
            while (i2 < length) {
                f.h.b.b.d2.g gVar = gVarArr[i2];
                if (gVar != null) {
                    gVar.i(f3);
                }
                i2++;
            }
            w0Var = w0Var.f4648l;
        }
        j1[] j1VarArr = this.f4445f;
        int length2 = j1VarArr.length;
        while (i2 < length2) {
            j1 j1Var = j1VarArr[i2];
            if (j1Var != null) {
                j1Var.n(f2, c1Var.a);
            }
            i2++;
        }
    }

    public final b1 u(z.a aVar, long j2, long j3) {
        f.h.b.b.d2.m mVar;
        f.h.c.b.q<Object> qVar;
        TrackGroupArray trackGroupArray;
        TrackGroupArray trackGroupArray2;
        f.h.b.b.d2.m mVar2;
        f.h.c.b.q<Object> qVar2;
        int i2 = 0;
        this.R = (!this.R && j2 == this.B.r && aVar.equals(this.B.b)) ? false : true;
        G();
        b1 b1Var = this.B;
        TrackGroupArray trackGroupArray3 = b1Var.f3793g;
        f.h.b.b.d2.m mVar3 = b1Var.f3794h;
        List<Metadata> list = b1Var.f3795i;
        if (this.x.f3779j) {
            w0 w0Var = this.w.f4664h;
            if (w0Var == null) {
                trackGroupArray2 = TrackGroupArray.f878i;
            } else {
                trackGroupArray2 = w0Var.f4649m;
            }
            if (w0Var == null) {
                mVar2 = this.f4448i;
            } else {
                mVar2 = w0Var.n;
            }
            f.h.b.b.d2.g[] gVarArr = mVar2.c;
            f.h.b.c.a.w(4, "initialCapacity");
            Object[] objArr = new Object[4];
            int length = gVarArr.length;
            int i3 = 0;
            boolean z = false;
            int i4 = 0;
            while (i3 < length) {
                f.h.b.b.d2.g gVar = gVarArr[i3];
                if (gVar != null) {
                    Metadata metadata = gVar.d(i2).o;
                    if (metadata == null) {
                        Metadata metadata2 = new Metadata(new Metadata.Entry[i2]);
                        int i5 = i4 + 1;
                        if (objArr.length < i5) {
                            objArr = Arrays.copyOf(objArr, o.b.a(objArr.length, i5));
                        }
                        objArr[i4] = metadata2;
                        i4 = i5;
                    } else {
                        int i6 = i4 + 1;
                        if (objArr.length < i6) {
                            objArr = Arrays.copyOf(objArr, o.b.a(objArr.length, i6));
                        }
                        objArr[i4] = metadata;
                        i4 = i6;
                        z = true;
                    }
                }
                i3++;
                i2 = 0;
            }
            if (z) {
                qVar2 = f.h.c.b.q.k(objArr, i4);
            } else {
                f.h.c.b.a<Object> aVar2 = f.h.c.b.q.f5981g;
                qVar2 = f.h.c.b.m0.f5954j;
            }
            if (w0Var != null) {
                x0 x0Var = w0Var.f4642f;
                if (x0Var.c != j3) {
                    w0Var.f4642f = x0Var.a(j3);
                }
            }
            qVar = qVar2;
            trackGroupArray = trackGroupArray2;
            mVar = mVar2;
        } else if (aVar.equals(b1Var.b)) {
            mVar = mVar3;
            qVar = list;
            trackGroupArray = trackGroupArray3;
        } else {
            TrackGroupArray trackGroupArray4 = TrackGroupArray.f878i;
            f.h.b.b.d2.m mVar4 = this.f4448i;
            f.h.c.b.a<Object> aVar3 = f.h.c.b.q.f5981g;
            trackGroupArray = trackGroupArray4;
            mVar = mVar4;
            qVar = f.h.c.b.m0.f5954j;
        }
        return this.B.b(aVar, j2, j3, n(), trackGroupArray, mVar, qVar);
    }

    public final boolean v() {
        w0 w0Var = this.w.f4666j;
        if (w0Var == null) {
            return false;
        }
        return (!w0Var.f4640d ? 0L : w0Var.a.c()) != Long.MIN_VALUE;
    }

    public final boolean x() {
        w0 w0Var = this.w.f4664h;
        long j2 = w0Var.f4642f.f4653e;
        return w0Var.f4640d && (j2 == -9223372036854775807L || this.B.r < j2 || !d0());
    }

    public final void y() {
        int i2;
        boolean z = false;
        if (v()) {
            w0 w0Var = this.w.f4666j;
            long o = o(!w0Var.f4640d ? 0L : w0Var.a.c());
            if (w0Var != this.w.f4664h) {
                long j2 = w0Var.f4642f.b;
            }
            l0 l0Var = this.f4449j;
            float f2 = this.s.c().a;
            f.h.b.b.f2.k kVar = l0Var.a;
            synchronized (kVar) {
                i2 = kVar.f4216e * kVar.b;
            }
            boolean z2 = i2 >= l0Var.f4400h;
            long j3 = l0Var.b;
            if (f2 > 1.0f) {
                j3 = Math.min(f.h.b.b.g2.b0.o(j3, f2), l0Var.c);
            }
            if (o < Math.max(j3, 500000L)) {
                boolean z3 = !z2;
                l0Var.f4401i = z3;
                if (!z3 && o < 500000) {
                    Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                }
            } else if (o >= l0Var.c || z2) {
                l0Var.f4401i = false;
            }
            z = l0Var.f4401i;
        }
        this.H = z;
        if (z) {
            w0 w0Var2 = this.w.f4666j;
            long j4 = this.P;
            f.h.b.b.e2.j.g(w0Var2.g());
            w0Var2.a.g(j4 - w0Var2.o);
        }
        j0();
    }

    public final void z() {
        d dVar = this.C;
        b1 b1Var = this.B;
        boolean z = dVar.a | (dVar.b != b1Var);
        dVar.a = z;
        dVar.b = b1Var;
        if (z) {
            o0 o0Var = ((o) this.v).a;
            o0Var.f4410e.a.post(new t(o0Var, dVar));
            this.C = new d(this.B);
        }
    }
}
