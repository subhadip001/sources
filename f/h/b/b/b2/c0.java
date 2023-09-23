package f.h.b.b.b2;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.upstream.Loader;
import f.h.b.b.b2.a0;
import f.h.b.b.b2.f0;
import f.h.b.b.b2.r;
import f.h.b.b.b2.w;
import f.h.b.b.n1;
import f.h.b.b.x1.a;
import f.h.b.b.y1.t;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: ProgressiveMediaPeriod.java */
/* loaded from: classes.dex */
public final class c0 implements w, f.h.b.b.y1.j, Loader.b<a>, Loader.f, f0.b {
    public static final Map<String, String> R;
    public static final Format S;
    public boolean A;
    public boolean B;
    public e C;
    public f.h.b.b.y1.t D;
    public boolean F;
    public boolean H;
    public boolean I;
    public int J;
    public long L;
    public boolean N;
    public int O;
    public boolean P;
    public boolean Q;

    /* renamed from: f  reason: collision with root package name */
    public final Uri f3811f;

    /* renamed from: g  reason: collision with root package name */
    public final f.h.b.b.f2.i f3812g;

    /* renamed from: h  reason: collision with root package name */
    public final f.h.b.b.x1.c f3813h;

    /* renamed from: i  reason: collision with root package name */
    public final f.h.b.b.f2.r f3814i;

    /* renamed from: j  reason: collision with root package name */
    public final a0.a f3815j;

    /* renamed from: k  reason: collision with root package name */
    public final a.C0110a f3816k;

    /* renamed from: l  reason: collision with root package name */
    public final b f3817l;

    /* renamed from: m  reason: collision with root package name */
    public final f.h.b.b.f2.k f3818m;
    public final String n;
    public final long o;
    public final k q;
    public w.a v;
    public IcyHeaders w;
    public boolean z;
    public final Loader p = new Loader("Loader:ProgressiveMediaPeriod");
    public final f.h.b.b.g2.i r = new f.h.b.b.g2.i();
    public final Runnable s = new Runnable() { // from class: f.h.b.b.b2.g
        @Override // java.lang.Runnable
        public final void run() {
            c0.this.x();
        }
    };
    public final Runnable t = new Runnable() { // from class: f.h.b.b.b2.i
        @Override // java.lang.Runnable
        public final void run() {
            c0 c0Var = c0.this;
            if (c0Var.Q) {
                return;
            }
            w.a aVar = c0Var.v;
            Objects.requireNonNull(aVar);
            aVar.a(c0Var);
        }
    };
    public final Handler u = f.h.b.b.g2.b0.j();
    public d[] y = new d[0];
    public f0[] x = new f0[0];
    public long M = -9223372036854775807L;
    public long K = -1;
    public long E = -9223372036854775807L;
    public int G = 1;

    /* compiled from: ProgressiveMediaPeriod.java */
    /* loaded from: classes.dex */
    public final class a implements Loader.e, r.a {
        public final Uri b;
        public final f.h.b.b.f2.s c;

        /* renamed from: d  reason: collision with root package name */
        public final k f3819d;

        /* renamed from: e  reason: collision with root package name */
        public final f.h.b.b.y1.j f3820e;

        /* renamed from: f  reason: collision with root package name */
        public final f.h.b.b.g2.i f3821f;

        /* renamed from: h  reason: collision with root package name */
        public volatile boolean f3823h;

        /* renamed from: j  reason: collision with root package name */
        public long f3825j;

        /* renamed from: m  reason: collision with root package name */
        public f.h.b.b.y1.w f3828m;
        public boolean n;

        /* renamed from: g  reason: collision with root package name */
        public final f.h.b.b.y1.s f3822g = new f.h.b.b.y1.s();

        /* renamed from: i  reason: collision with root package name */
        public boolean f3824i = true;

        /* renamed from: l  reason: collision with root package name */
        public long f3827l = -1;
        public final long a = s.b.getAndIncrement();

        /* renamed from: k  reason: collision with root package name */
        public f.h.b.b.f2.j f3826k = c(0);

        public a(Uri uri, f.h.b.b.f2.i iVar, k kVar, f.h.b.b.y1.j jVar, f.h.b.b.g2.i iVar2) {
            this.b = uri;
            this.c = new f.h.b.b.f2.s(iVar);
            this.f3819d = kVar;
            this.f3820e = jVar;
            this.f3821f = iVar2;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void a() {
            f.h.b.b.f2.f fVar;
            int i2;
            int i3 = 0;
            while (i3 == 0 && !this.f3823h) {
                try {
                    long j2 = this.f3822g.a;
                    f.h.b.b.f2.j c = c(j2);
                    this.f3826k = c;
                    long i4 = this.c.i(c);
                    this.f3827l = i4;
                    if (i4 != -1) {
                        this.f3827l = i4 + j2;
                    }
                    c0.this.w = IcyHeaders.b(this.c.k());
                    f.h.b.b.f2.s sVar = this.c;
                    IcyHeaders icyHeaders = c0.this.w;
                    if (icyHeaders == null || (i2 = icyHeaders.f796k) == -1) {
                        fVar = sVar;
                    } else {
                        fVar = new r(sVar, i2, this);
                        f.h.b.b.y1.w B = c0.this.B(new d(0, true));
                        this.f3828m = B;
                        ((f0) B).e(c0.S);
                    }
                    long j3 = j2;
                    this.f3819d.b(fVar, this.b, this.c.k(), j2, this.f3827l, this.f3820e);
                    if (c0.this.w != null) {
                        f.h.b.b.y1.h hVar = this.f3819d.b;
                        if (hVar instanceof f.h.b.b.y1.g0.f) {
                            ((f.h.b.b.y1.g0.f) hVar).r = true;
                        }
                    }
                    if (this.f3824i) {
                        k kVar = this.f3819d;
                        long j4 = this.f3825j;
                        f.h.b.b.y1.h hVar2 = kVar.b;
                        Objects.requireNonNull(hVar2);
                        hVar2.g(j3, j4);
                        this.f3824i = false;
                    }
                    while (true) {
                        long j5 = j3;
                        while (i3 == 0 && !this.f3823h) {
                            try {
                                f.h.b.b.g2.i iVar = this.f3821f;
                                synchronized (iVar) {
                                    while (!iVar.b) {
                                        iVar.wait();
                                    }
                                }
                                k kVar2 = this.f3819d;
                                f.h.b.b.y1.s sVar2 = this.f3822g;
                                f.h.b.b.y1.h hVar3 = kVar2.b;
                                Objects.requireNonNull(hVar3);
                                f.h.b.b.y1.i iVar2 = kVar2.c;
                                Objects.requireNonNull(iVar2);
                                i3 = hVar3.e(iVar2, sVar2);
                                j3 = this.f3819d.a();
                                if (j3 > c0.this.o + j5) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f3821f.a();
                        c0 c0Var = c0.this;
                        c0Var.u.post(c0Var.t);
                    }
                    if (i3 == 1) {
                        i3 = 0;
                    } else if (this.f3819d.a() != -1) {
                        this.f3822g.a = this.f3819d.a();
                    }
                    f.h.b.b.f2.s sVar3 = this.c;
                    if (sVar3 != null) {
                        try {
                            sVar3.a.close();
                        } catch (IOException unused2) {
                        }
                    }
                } catch (Throwable th) {
                    if (i3 != 1 && this.f3819d.a() != -1) {
                        this.f3822g.a = this.f3819d.a();
                    }
                    f.h.b.b.f2.s sVar4 = this.c;
                    int i5 = f.h.b.b.g2.b0.a;
                    if (sVar4 != null) {
                        try {
                            sVar4.a.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void b() {
            this.f3823h = true;
        }

        public final f.h.b.b.f2.j c(long j2) {
            Collections.emptyMap();
            Uri uri = this.b;
            String str = c0.this.n;
            Map<String, String> map = c0.R;
            f.h.b.b.e2.j.j(uri, "The uri must be set.");
            return new f.h.b.b.f2.j(uri, 0L, 1, null, map, j2, -1L, str, 6, null, null);
        }
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    /* loaded from: classes.dex */
    public final class c implements g0 {
        public final int a;

        public c(int i2) {
            this.a = i2;
        }

        /* JADX WARN: Removed duplicated region for block: B:104:0x0233  */
        @Override // f.h.b.b.b2.g0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int a(f.h.b.b.s0 r21, com.google.android.exoplayer2.decoder.DecoderInputBuffer r22, boolean r23) {
            /*
                Method dump skipped, instructions count: 575
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.b2.c0.c.a(f.h.b.b.s0, com.google.android.exoplayer2.decoder.DecoderInputBuffer, boolean):int");
        }

        @Override // f.h.b.b.b2.g0
        public void b() {
            c0 c0Var = c0.this;
            DrmSession drmSession = c0Var.x[this.a].f3858h;
            if (drmSession == null) {
                c0Var.A();
                return;
            }
            DrmSession.DrmSessionException drmSessionException = ((f.h.b.b.x1.d) drmSession).a;
            Objects.requireNonNull(drmSessionException);
            throw drmSessionException;
        }

        @Override // f.h.b.b.b2.g0
        public int c(long j2) {
            int i2;
            c0 c0Var = c0.this;
            int i3 = this.a;
            boolean z = false;
            if (c0Var.D()) {
                return 0;
            }
            c0Var.y(i3);
            f0 f0Var = c0Var.x[i3];
            boolean z2 = c0Var.P;
            synchronized (f0Var) {
                int k2 = f0Var.k(f0Var.t);
                if (f0Var.m() && j2 >= f0Var.n[k2]) {
                    if (j2 > f0Var.w && z2) {
                        i2 = f0Var.q - f0Var.t;
                    } else {
                        i2 = f0Var.i(k2, f0Var.q - f0Var.t, j2, true);
                        if (i2 == -1) {
                            i2 = 0;
                        }
                    }
                }
                i2 = 0;
            }
            synchronized (f0Var) {
                if (i2 >= 0) {
                    if (f0Var.t + i2 <= f0Var.q) {
                        z = true;
                    }
                }
                f.h.b.b.e2.j.c(z);
                f0Var.t += i2;
            }
            if (i2 == 0) {
                c0Var.z(i3);
            }
            return i2;
        }

        @Override // f.h.b.b.b2.g0
        public boolean e() {
            c0 c0Var = c0.this;
            return !c0Var.D() && c0Var.x[this.a].n(c0Var.P);
        }
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    /* loaded from: classes.dex */
    public static final class d {
        public final int a;
        public final boolean b;

        public d(int i2, boolean z) {
            this.a = i2;
            this.b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b;
        }

        public int hashCode() {
            return (this.a * 31) + (this.b ? 1 : 0);
        }
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    /* loaded from: classes.dex */
    public static final class e {
        public final TrackGroupArray a;
        public final boolean[] b;
        public final boolean[] c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean[] f3829d;

        public e(TrackGroupArray trackGroupArray, boolean[] zArr) {
            this.a = trackGroupArray;
            this.b = zArr;
            int i2 = trackGroupArray.f879f;
            this.c = new boolean[i2];
            this.f3829d = new boolean[i2];
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        R = Collections.unmodifiableMap(hashMap);
        Format.b bVar = new Format.b();
        bVar.a = "icy";
        bVar.f722k = "application/x-icy";
        S = bVar.a();
    }

    public c0(Uri uri, f.h.b.b.f2.i iVar, f.h.b.b.y1.l lVar, f.h.b.b.x1.c cVar, a.C0110a c0110a, f.h.b.b.f2.r rVar, a0.a aVar, b bVar, f.h.b.b.f2.k kVar, String str, int i2) {
        this.f3811f = uri;
        this.f3812g = iVar;
        this.f3813h = cVar;
        this.f3816k = c0110a;
        this.f3814i = rVar;
        this.f3815j = aVar;
        this.f3817l = bVar;
        this.f3818m = kVar;
        this.n = str;
        this.o = i2;
        this.q = new k(lVar);
    }

    public void A() {
        Loader loader = this.p;
        int a2 = ((f.h.b.b.f2.p) this.f3814i).a(this.G);
        IOException iOException = loader.c;
        if (iOException == null) {
            Loader.d<? extends Loader.e> dVar = loader.b;
            if (dVar != null) {
                if (a2 == Integer.MIN_VALUE) {
                    a2 = dVar.f997f;
                }
                IOException iOException2 = dVar.f1001j;
                if (iOException2 != null && dVar.f1002k > a2) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final f.h.b.b.y1.w B(d dVar) {
        int length = this.x.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (dVar.equals(this.y[i2])) {
                return this.x[i2];
            }
        }
        f.h.b.b.f2.k kVar = this.f3818m;
        Looper looper = this.u.getLooper();
        f.h.b.b.x1.c cVar = this.f3813h;
        a.C0110a c0110a = this.f3816k;
        Objects.requireNonNull(looper);
        Objects.requireNonNull(cVar);
        Objects.requireNonNull(c0110a);
        f0 f0Var = new f0(kVar, looper, cVar, c0110a);
        f0Var.f3856f = this;
        int i3 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.y, i3);
        dVarArr[length] = dVar;
        int i4 = f.h.b.b.g2.b0.a;
        this.y = dVarArr;
        f0[] f0VarArr = (f0[]) Arrays.copyOf(this.x, i3);
        f0VarArr[length] = f0Var;
        this.x = f0VarArr;
        return f0Var;
    }

    public final void C() {
        a aVar = new a(this.f3811f, this.f3812g, this.q, this, this.r);
        if (this.A) {
            f.h.b.b.e2.j.g(w());
            long j2 = this.E;
            if (j2 != -9223372036854775807L && this.M > j2) {
                this.P = true;
                this.M = -9223372036854775807L;
                return;
            }
            f.h.b.b.y1.t tVar = this.D;
            Objects.requireNonNull(tVar);
            long j3 = tVar.h(this.M).a.b;
            long j4 = this.M;
            aVar.f3822g.a = j3;
            aVar.f3825j = j4;
            aVar.f3824i = true;
            aVar.n = false;
            for (f0 f0Var : this.x) {
                f0Var.u = this.M;
            }
            this.M = -9223372036854775807L;
        }
        this.O = u();
        this.f3815j.i(new s(aVar.a, aVar.f3826k, this.p.c(aVar, this, ((f.h.b.b.f2.p) this.f3814i).a(this.G))), 1, -1, null, 0, null, aVar.f3825j, this.E);
    }

    public final boolean D() {
        return this.I || w();
    }

    @Override // f.h.b.b.y1.j
    public void a(final f.h.b.b.y1.t tVar) {
        this.u.post(new Runnable() { // from class: f.h.b.b.b2.h
            @Override // java.lang.Runnable
            public final void run() {
                c0 c0Var = c0.this;
                f.h.b.b.y1.t tVar2 = tVar;
                c0Var.D = c0Var.w == null ? tVar2 : new t.b(-9223372036854775807L, 0L);
                c0Var.E = tVar2.i();
                boolean z = c0Var.K == -1 && tVar2.i() == -9223372036854775807L;
                c0Var.F = z;
                c0Var.G = z ? 7 : 1;
                ((d0) c0Var.f3817l).t(c0Var.E, tVar2.c(), c0Var.F);
                if (c0Var.A) {
                    return;
                }
                c0Var.x();
            }
        });
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    public void b(a aVar, long j2, long j3, boolean z) {
        a aVar2 = aVar;
        f.h.b.b.f2.s sVar = aVar2.c;
        s sVar2 = new s(aVar2.a, aVar2.f3826k, sVar.c, sVar.f4247d, j2, j3, sVar.b);
        Objects.requireNonNull(this.f3814i);
        this.f3815j.c(sVar2, 1, -1, null, 0, null, aVar2.f3825j, this.E);
        if (z) {
            return;
        }
        if (this.K == -1) {
            this.K = aVar2.f3827l;
        }
        for (f0 f0Var : this.x) {
            f0Var.q(false);
        }
        if (this.J > 0) {
            w.a aVar3 = this.v;
            Objects.requireNonNull(aVar3);
            aVar3.a(this);
        }
    }

    @Override // f.h.b.b.b2.w
    public long c() {
        if (this.J == 0) {
            return Long.MIN_VALUE;
        }
        return q();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    public void d(a aVar, long j2, long j3) {
        f.h.b.b.y1.t tVar;
        a aVar2 = aVar;
        if (this.E == -9223372036854775807L && (tVar = this.D) != null) {
            boolean c2 = tVar.c();
            long v = v();
            long j4 = v == Long.MIN_VALUE ? 0L : v + 10000;
            this.E = j4;
            ((d0) this.f3817l).t(j4, c2, this.F);
        }
        f.h.b.b.f2.s sVar = aVar2.c;
        s sVar2 = new s(aVar2.a, aVar2.f3826k, sVar.c, sVar.f4247d, j2, j3, sVar.b);
        Objects.requireNonNull(this.f3814i);
        this.f3815j.e(sVar2, 1, -1, null, 0, null, aVar2.f3825j, this.E);
        if (this.K == -1) {
            this.K = aVar2.f3827l;
        }
        this.P = true;
        w.a aVar3 = this.v;
        Objects.requireNonNull(aVar3);
        aVar3.a(this);
    }

    @Override // f.h.b.b.b2.w
    public void e() {
        A();
        if (this.P && !this.A) {
            throw new ParserException("Loading finished before preparation is complete.");
        }
    }

    @Override // f.h.b.b.b2.w
    public long f(long j2) {
        boolean z;
        t();
        boolean[] zArr = this.C.b;
        if (!this.D.c()) {
            j2 = 0;
        }
        this.I = false;
        this.L = j2;
        if (w()) {
            this.M = j2;
            return j2;
        }
        if (this.G != 7) {
            int length = this.x.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.x[i2].r(j2, false) && (zArr[i2] || !this.B)) {
                    z = false;
                    break;
                }
            }
            z = true;
            if (z) {
                return j2;
            }
        }
        this.N = false;
        this.M = j2;
        this.P = false;
        if (this.p.b()) {
            for (f0 f0Var : this.x) {
                f0Var.h();
            }
            Loader.d<? extends Loader.e> dVar = this.p.b;
            f.h.b.b.e2.j.i(dVar);
            dVar.a(false);
        } else {
            this.p.c = null;
            for (f0 f0Var2 : this.x) {
                f0Var2.q(false);
            }
        }
        return j2;
    }

    @Override // f.h.b.b.b2.w
    public boolean g(long j2) {
        if (!this.P) {
            if (!(this.p.c != null) && !this.N && (!this.A || this.J != 0)) {
                boolean b2 = this.r.b();
                if (this.p.b()) {
                    return b2;
                }
                C();
                return true;
            }
        }
        return false;
    }

    @Override // f.h.b.b.b2.w
    public boolean h() {
        boolean z;
        if (this.p.b()) {
            f.h.b.b.g2.i iVar = this.r;
            synchronized (iVar) {
                z = iVar.b;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // f.h.b.b.b2.w
    public long i(long j2, n1 n1Var) {
        t();
        if (this.D.c()) {
            t.a h2 = this.D.h(j2);
            long j3 = h2.a.a;
            long j4 = h2.b.a;
            long j5 = n1Var.a;
            if (j5 == 0 && n1Var.b == 0) {
                return j2;
            }
            int i2 = f.h.b.b.g2.b0.a;
            long j6 = j2 - j5;
            long j7 = ((j5 ^ j2) & (j2 ^ j6)) >= 0 ? j6 : Long.MIN_VALUE;
            long j8 = n1Var.b;
            long j9 = j2 + j8;
            long j10 = ((j8 ^ j9) & (j2 ^ j9)) >= 0 ? j9 : Long.MAX_VALUE;
            boolean z = false;
            boolean z2 = j7 <= j3 && j3 <= j10;
            if (j7 <= j4 && j4 <= j10) {
                z = true;
            }
            if (z2 && z) {
                if (Math.abs(j3 - j2) <= Math.abs(j4 - j2)) {
                    return j3;
                }
            } else if (z2) {
                return j3;
            } else {
                if (!z) {
                    return j7;
                }
            }
            return j4;
        }
        return 0L;
    }

    @Override // f.h.b.b.y1.j
    public void j() {
        this.z = true;
        this.u.post(this.s);
    }

    @Override // f.h.b.b.b2.w
    public long k() {
        if (this.I) {
            if (this.P || u() > this.O) {
                this.I = false;
                return this.L;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // f.h.b.b.b2.w
    public void l(w.a aVar, long j2) {
        this.v = aVar;
        this.r.b();
        C();
    }

    @Override // f.h.b.b.b2.w
    public long m(f.h.b.b.d2.g[] gVarArr, boolean[] zArr, g0[] g0VarArr, boolean[] zArr2, long j2) {
        t();
        e eVar = this.C;
        TrackGroupArray trackGroupArray = eVar.a;
        boolean[] zArr3 = eVar.c;
        int i2 = this.J;
        for (int i3 = 0; i3 < gVarArr.length; i3++) {
            if (g0VarArr[i3] != null && (gVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((c) g0VarArr[i3]).a;
                f.h.b.b.e2.j.g(zArr3[i4]);
                this.J--;
                zArr3[i4] = false;
                g0VarArr[i3] = null;
            }
        }
        boolean z = !this.H ? j2 == 0 : i2 != 0;
        for (int i5 = 0; i5 < gVarArr.length; i5++) {
            if (g0VarArr[i5] == null && gVarArr[i5] != null) {
                f.h.b.b.d2.g gVar = gVarArr[i5];
                f.h.b.b.e2.j.g(gVar.length() == 1);
                f.h.b.b.e2.j.g(gVar.f(0) == 0);
                int b2 = trackGroupArray.b(gVar.a());
                f.h.b.b.e2.j.g(!zArr3[b2]);
                this.J++;
                zArr3[b2] = true;
                g0VarArr[i5] = new c(b2);
                zArr2[i5] = true;
                if (!z) {
                    f0 f0Var = this.x[b2];
                    z = (f0Var.r(j2, true) || f0Var.r + f0Var.t == 0) ? false : true;
                }
            }
        }
        if (this.J == 0) {
            this.N = false;
            this.I = false;
            if (this.p.b()) {
                for (f0 f0Var2 : this.x) {
                    f0Var2.h();
                }
                Loader.d<? extends Loader.e> dVar = this.p.b;
                f.h.b.b.e2.j.i(dVar);
                dVar.a(false);
            } else {
                for (f0 f0Var3 : this.x) {
                    f0Var3.q(false);
                }
            }
        } else if (z) {
            j2 = f(j2);
            for (int i6 = 0; i6 < g0VarArr.length; i6++) {
                if (g0VarArr[i6] != null) {
                    zArr2[i6] = true;
                }
            }
        }
        this.H = true;
        return j2;
    }

    @Override // f.h.b.b.b2.w
    public TrackGroupArray n() {
        t();
        return this.C.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.upstream.Loader.c o(f.h.b.b.b2.c0.a r26, long r27, long r29, java.io.IOException r31, int r32) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.b2.c0.o(com.google.android.exoplayer2.upstream.Loader$e, long, long, java.io.IOException, int):com.google.android.exoplayer2.upstream.Loader$c");
    }

    @Override // f.h.b.b.y1.j
    public f.h.b.b.y1.w p(int i2, int i3) {
        return B(new d(i2, false));
    }

    @Override // f.h.b.b.b2.w
    public long q() {
        long j2;
        boolean z;
        long j3;
        t();
        boolean[] zArr = this.C.b;
        if (this.P) {
            return Long.MIN_VALUE;
        }
        if (w()) {
            return this.M;
        }
        if (this.B) {
            int length = this.x.length;
            j2 = Long.MAX_VALUE;
            for (int i2 = 0; i2 < length; i2++) {
                if (zArr[i2]) {
                    f0 f0Var = this.x[i2];
                    synchronized (f0Var) {
                        z = f0Var.x;
                    }
                    if (z) {
                        continue;
                    } else {
                        f0 f0Var2 = this.x[i2];
                        synchronized (f0Var2) {
                            j3 = f0Var2.w;
                        }
                        j2 = Math.min(j2, j3);
                    }
                }
            }
        } else {
            j2 = Long.MAX_VALUE;
        }
        if (j2 == Long.MAX_VALUE) {
            j2 = v();
        }
        return j2 == Long.MIN_VALUE ? this.L : j2;
    }

    @Override // f.h.b.b.b2.w
    public void r(long j2, boolean z) {
        long j3;
        int i2;
        t();
        if (w()) {
            return;
        }
        boolean[] zArr = this.C.c;
        int length = this.x.length;
        for (int i3 = 0; i3 < length; i3++) {
            f0 f0Var = this.x[i3];
            boolean z2 = zArr[i3];
            e0 e0Var = f0Var.a;
            synchronized (f0Var) {
                int i4 = f0Var.q;
                j3 = -1;
                if (i4 != 0) {
                    long[] jArr = f0Var.n;
                    int i5 = f0Var.s;
                    if (j2 >= jArr[i5]) {
                        int i6 = f0Var.i(i5, (!z2 || (i2 = f0Var.t) == i4) ? i4 : i2 + 1, j2, z);
                        if (i6 != -1) {
                            j3 = f0Var.g(i6);
                        }
                    }
                }
            }
            e0Var.a(j3);
        }
    }

    @Override // f.h.b.b.b2.w
    public void s(long j2) {
    }

    public final void t() {
        f.h.b.b.e2.j.g(this.A);
        Objects.requireNonNull(this.C);
        Objects.requireNonNull(this.D);
    }

    public final int u() {
        f0[] f0VarArr;
        int i2 = 0;
        for (f0 f0Var : this.x) {
            i2 += f0Var.r + f0Var.q;
        }
        return i2;
    }

    public final long v() {
        f0[] f0VarArr;
        long j2;
        long j3 = Long.MIN_VALUE;
        for (f0 f0Var : this.x) {
            synchronized (f0Var) {
                j2 = f0Var.w;
            }
            j3 = Math.max(j3, j2);
        }
        return j3;
    }

    public final boolean w() {
        return this.M != -9223372036854775807L;
    }

    public final void x() {
        Metadata b2;
        if (this.Q || this.A || !this.z || this.D == null) {
            return;
        }
        for (f0 f0Var : this.x) {
            if (f0Var.l() == null) {
                return;
            }
        }
        this.r.a();
        int length = this.x.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            Format l2 = this.x[i2].l();
            Objects.requireNonNull(l2);
            String str = l2.q;
            boolean h2 = f.h.b.b.g2.p.h(str);
            boolean z = h2 || f.h.b.b.g2.p.j(str);
            zArr[i2] = z;
            this.B = z | this.B;
            IcyHeaders icyHeaders = this.w;
            if (icyHeaders != null) {
                if (h2 || this.y[i2].b) {
                    Metadata metadata = l2.o;
                    if (metadata == null) {
                        b2 = new Metadata(icyHeaders);
                    } else {
                        b2 = metadata.b(icyHeaders);
                    }
                    Format.b b3 = l2.b();
                    b3.f720i = b2;
                    l2 = b3.a();
                }
                if (h2 && l2.f712k == -1 && l2.f713l == -1 && icyHeaders.f791f != -1) {
                    Format.b b4 = l2.b();
                    b4.f717f = icyHeaders.f791f;
                    l2 = b4.a();
                }
            }
            Class<? extends Object> b5 = this.f3813h.b(l2);
            Format.b b6 = l2.b();
            b6.D = b5;
            trackGroupArr[i2] = new TrackGroup(b6.a());
        }
        this.C = new e(new TrackGroupArray(trackGroupArr), zArr);
        this.A = true;
        w.a aVar = this.v;
        Objects.requireNonNull(aVar);
        aVar.b(this);
    }

    public final void y(int i2) {
        t();
        e eVar = this.C;
        boolean[] zArr = eVar.f3829d;
        if (zArr[i2]) {
            return;
        }
        Format format = eVar.a.f880g[i2].f876g[0];
        a0.a aVar = this.f3815j;
        aVar.b(new v(1, f.h.b.b.g2.p.g(format.q), format, 0, null, aVar.a(this.L), -9223372036854775807L));
        zArr[i2] = true;
    }

    public final void z(int i2) {
        t();
        boolean[] zArr = this.C.b;
        if (this.N && zArr[i2] && !this.x[i2].n(false)) {
            this.M = 0L;
            this.N = false;
            this.I = true;
            this.L = 0L;
            this.O = 0;
            for (f0 f0Var : this.x) {
                f0Var.q(false);
            }
            w.a aVar = this.v;
            Objects.requireNonNull(aVar);
            aVar.a(this);
        }
    }
}
