package f.e.a.l.q;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import f.e.a.l.q.g;
import f.e.a.l.q.j;
import f.e.a.l.q.l;
import f.e.a.l.q.m;
import f.e.a.l.q.q;
import f.e.a.r.m.a;
import f.e.a.r.m.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: DecodeJob.java */
/* loaded from: classes.dex */
public class i<R> implements g.a, Runnable, Comparable<i<?>>, a.d {
    public Object A;
    public Thread B;
    public f.e.a.l.j C;
    public f.e.a.l.j D;
    public Object E;
    public DataSource F;
    public f.e.a.l.p.d<?> G;
    public volatile f.e.a.l.q.g H;
    public volatile boolean I;
    public volatile boolean J;
    public boolean K;

    /* renamed from: i  reason: collision with root package name */
    public final d f3331i;

    /* renamed from: j  reason: collision with root package name */
    public final e.i.i.c<i<?>> f3332j;

    /* renamed from: m  reason: collision with root package name */
    public f.e.a.d f3335m;
    public f.e.a.l.j n;
    public Priority o;
    public o p;
    public int q;
    public int r;
    public k s;
    public f.e.a.l.l t;
    public a<R> u;
    public int v;
    public g w;
    public f x;
    public long y;
    public boolean z;

    /* renamed from: f  reason: collision with root package name */
    public final h<R> f3328f = new h<>();

    /* renamed from: g  reason: collision with root package name */
    public final List<Throwable> f3329g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final f.e.a.r.m.d f3330h = new d.b();

    /* renamed from: k  reason: collision with root package name */
    public final c<?> f3333k = new c<>();

    /* renamed from: l  reason: collision with root package name */
    public final e f3334l = new e();

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public interface a<R> {
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public final class b<Z> implements j.a<Z> {
        public final DataSource a;

        public b(DataSource dataSource) {
            this.a = dataSource;
        }
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public static class c<Z> {
        public f.e.a.l.j a;
        public f.e.a.l.n<Z> b;
        public u<Z> c;
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public interface d {
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public static class e {
        public boolean a;
        public boolean b;
        public boolean c;

        public final boolean a(boolean z) {
            return (this.c || z || this.b) && this.a;
        }
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public enum f {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public enum g {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public i(d dVar, e.i.i.c<i<?>> cVar) {
        this.f3331i = dVar;
        this.f3332j = cVar;
    }

    @Override // f.e.a.l.q.g.a
    public void a(f.e.a.l.j jVar, Exception exc, f.e.a.l.p.d<?> dVar, DataSource dataSource) {
        dVar.b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        Class<?> a2 = dVar.a();
        glideException.f684g = jVar;
        glideException.f685h = dataSource;
        glideException.f686i = a2;
        this.f3329g.add(glideException);
        if (Thread.currentThread() != this.B) {
            r(f.SWITCH_TO_SOURCE_SERVICE);
        } else {
            s();
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(i<?> iVar) {
        i<?> iVar2 = iVar;
        int ordinal = this.o.ordinal() - iVar2.o.ordinal();
        return ordinal == 0 ? this.v - iVar2.v : ordinal;
    }

    @Override // f.e.a.l.q.g.a
    public void d() {
        r(f.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // f.e.a.l.q.g.a
    public void f(f.e.a.l.j jVar, Object obj, f.e.a.l.p.d<?> dVar, DataSource dataSource, f.e.a.l.j jVar2) {
        this.C = jVar;
        this.E = obj;
        this.G = dVar;
        this.F = dataSource;
        this.D = jVar2;
        this.K = jVar != this.f3328f.a().get(0);
        if (Thread.currentThread() != this.B) {
            r(f.DECODE_DATA);
        } else {
            k();
        }
    }

    @Override // f.e.a.r.m.a.d
    public f.e.a.r.m.d g() {
        return this.f3330h;
    }

    public final <Data> v<R> i(f.e.a.l.p.d<?> dVar, Data data, DataSource dataSource) {
        if (data == null) {
            return null;
        }
        try {
            int i2 = f.e.a.r.h.b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            v<R> j2 = j(data, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                n("Decoded result " + j2, elapsedRealtimeNanos, null);
            }
            return j2;
        } finally {
            dVar.b();
        }
    }

    public final <Data> v<R> j(Data data, DataSource dataSource) {
        t<Data, ?, R> d2 = this.f3328f.d(data.getClass());
        f.e.a.l.l lVar = this.t;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z = dataSource == DataSource.RESOURCE_DISK_CACHE || this.f3328f.r;
            f.e.a.l.k<Boolean> kVar = f.e.a.l.s.c.k.f3459i;
            Boolean bool = (Boolean) lVar.c(kVar);
            if (bool == null || (bool.booleanValue() && !z)) {
                lVar = new f.e.a.l.l();
                lVar.d(this.t);
                lVar.b.put(kVar, Boolean.valueOf(z));
            }
        }
        f.e.a.l.l lVar2 = lVar;
        f.e.a.l.p.e<Data> g2 = this.f3335m.a().g(data);
        try {
            return d2.a(g2, lVar2, this.q, this.r, new b(dataSource));
        } finally {
            g2.b();
        }
    }

    public final void k() {
        u uVar;
        boolean a2;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j2 = this.y;
            StringBuilder A = f.a.b.a.a.A("data: ");
            A.append(this.E);
            A.append(", cache key: ");
            A.append(this.C);
            A.append(", fetcher: ");
            A.append(this.G);
            n("Retrieved data", j2, A.toString());
        }
        u uVar2 = null;
        try {
            uVar = i(this.G, this.E, this.F);
        } catch (GlideException e2) {
            f.e.a.l.j jVar = this.D;
            DataSource dataSource = this.F;
            e2.f684g = jVar;
            e2.f685h = dataSource;
            e2.f686i = null;
            this.f3329g.add(e2);
            uVar = null;
        }
        if (uVar != null) {
            DataSource dataSource2 = this.F;
            boolean z = this.K;
            if (uVar instanceof r) {
                ((r) uVar).initialize();
            }
            if (this.f3333k.c != null) {
                uVar2 = u.d(uVar);
                uVar = uVar2;
            }
            o(uVar, dataSource2, z);
            this.w = g.ENCODE;
            c<?> cVar = this.f3333k;
            if (cVar.c != null) {
                ((l.c) this.f3331i).a().a(cVar.a, new f.e.a.l.q.f(cVar.b, cVar.c, this.t));
                cVar.c.e();
            }
            if (uVar2 != null) {
                uVar2.e();
            }
            e eVar = this.f3334l;
            synchronized (eVar) {
                eVar.b = true;
                a2 = eVar.a(false);
            }
            if (a2) {
                q();
                return;
            }
            return;
        }
        s();
    }

    public final f.e.a.l.q.g l() {
        int ordinal = this.w.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 5) {
                        return null;
                    }
                    StringBuilder A = f.a.b.a.a.A("Unrecognized stage: ");
                    A.append(this.w);
                    throw new IllegalStateException(A.toString());
                }
                return new a0(this.f3328f, this);
            }
            return new f.e.a.l.q.d(this.f3328f, this);
        }
        return new w(this.f3328f, this);
    }

    public final g m(g gVar) {
        g gVar2 = g.RESOURCE_CACHE;
        g gVar3 = g.DATA_CACHE;
        g gVar4 = g.FINISHED;
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            return this.s.b() ? gVar2 : m(gVar2);
        } else if (ordinal == 1) {
            return this.s.a() ? gVar3 : m(gVar3);
        } else if (ordinal == 2) {
            return this.z ? gVar4 : g.SOURCE;
        } else if (ordinal == 3 || ordinal == 5) {
            return gVar4;
        } else {
            throw new IllegalArgumentException("Unrecognized stage: " + gVar);
        }
    }

    public final void n(String str, long j2, String str2) {
        StringBuilder D = f.a.b.a.a.D(str, " in ");
        D.append(f.e.a.r.h.a(j2));
        D.append(", load key: ");
        D.append(this.p);
        D.append(str2 != null ? f.a.b.a.a.p(", ", str2) : "");
        D.append(", thread: ");
        D.append(Thread.currentThread().getName());
        Log.v("DecodeJob", D.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(v<R> vVar, DataSource dataSource, boolean z) {
        u();
        m<?> mVar = (m) this.u;
        synchronized (mVar) {
            mVar.v = vVar;
            mVar.w = dataSource;
            mVar.D = z;
        }
        synchronized (mVar) {
            mVar.f3361g.a();
            if (mVar.C) {
                mVar.v.a();
                mVar.f();
            } else if (!mVar.f3360f.isEmpty()) {
                if (!mVar.x) {
                    m.c cVar = mVar.f3364j;
                    v<?> vVar2 = mVar.v;
                    boolean z2 = mVar.r;
                    f.e.a.l.j jVar = mVar.q;
                    q.a aVar = mVar.f3362h;
                    Objects.requireNonNull(cVar);
                    mVar.A = new q<>(vVar2, z2, true, jVar, aVar);
                    mVar.x = true;
                    m.e eVar = mVar.f3360f;
                    Objects.requireNonNull(eVar);
                    ArrayList arrayList = new ArrayList(eVar.f3372f);
                    mVar.d(arrayList.size() + 1);
                    ((l) mVar.f3365k).e(mVar, mVar.q, mVar.A);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        m.d dVar = (m.d) it.next();
                        dVar.b.execute(new m.b(dVar.a));
                    }
                    mVar.c();
                    return;
                }
                throw new IllegalStateException("Already have resource");
            } else {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
        }
    }

    public final void p() {
        boolean a2;
        u();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.f3329g));
        m<?> mVar = (m) this.u;
        synchronized (mVar) {
            mVar.y = glideException;
        }
        synchronized (mVar) {
            mVar.f3361g.a();
            if (mVar.C) {
                mVar.f();
            } else if (!mVar.f3360f.isEmpty()) {
                if (!mVar.z) {
                    mVar.z = true;
                    f.e.a.l.j jVar = mVar.q;
                    m.e eVar = mVar.f3360f;
                    Objects.requireNonNull(eVar);
                    ArrayList arrayList = new ArrayList(eVar.f3372f);
                    mVar.d(arrayList.size() + 1);
                    ((l) mVar.f3365k).e(mVar, jVar, null);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        m.d dVar = (m.d) it.next();
                        dVar.b.execute(new m.a(dVar.a));
                    }
                    mVar.c();
                } else {
                    throw new IllegalStateException("Already failed once");
                }
            } else {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
        }
        e eVar2 = this.f3334l;
        synchronized (eVar2) {
            eVar2.c = true;
            a2 = eVar2.a(false);
        }
        if (a2) {
            q();
        }
    }

    public final void q() {
        e eVar = this.f3334l;
        synchronized (eVar) {
            eVar.b = false;
            eVar.a = false;
            eVar.c = false;
        }
        c<?> cVar = this.f3333k;
        cVar.a = null;
        cVar.b = null;
        cVar.c = null;
        h<R> hVar = this.f3328f;
        hVar.c = null;
        hVar.f3318d = null;
        hVar.n = null;
        hVar.f3321g = null;
        hVar.f3325k = null;
        hVar.f3323i = null;
        hVar.o = null;
        hVar.f3324j = null;
        hVar.p = null;
        hVar.a.clear();
        hVar.f3326l = false;
        hVar.b.clear();
        hVar.f3327m = false;
        this.I = false;
        this.f3335m = null;
        this.n = null;
        this.t = null;
        this.o = null;
        this.p = null;
        this.u = null;
        this.w = null;
        this.H = null;
        this.B = null;
        this.C = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.y = 0L;
        this.J = false;
        this.A = null;
        this.f3329g.clear();
        this.f3332j.a(this);
    }

    public final void r(f fVar) {
        f.e.a.l.q.d0.a aVar;
        this.x = fVar;
        m mVar = (m) this.u;
        if (mVar.s) {
            aVar = mVar.n;
        } else {
            aVar = mVar.t ? mVar.o : mVar.f3367m;
        }
        aVar.f3310f.execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        f.e.a.l.p.d<?> dVar = this.G;
        try {
            try {
                if (this.J) {
                    p();
                    if (dVar != null) {
                        dVar.b();
                        return;
                    }
                    return;
                }
                t();
                if (dVar != null) {
                    dVar.b();
                }
            } catch (f.e.a.l.q.c e2) {
                throw e2;
            }
        }
    }

    public final void s() {
        this.B = Thread.currentThread();
        int i2 = f.e.a.r.h.b;
        this.y = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        while (!this.J && this.H != null && !(z = this.H.b())) {
            this.w = m(this.w);
            this.H = l();
            if (this.w == g.SOURCE) {
                r(f.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.w == g.FINISHED || this.J) && !z) {
            p();
        }
    }

    public final void t() {
        int ordinal = this.x.ordinal();
        if (ordinal == 0) {
            this.w = m(g.INITIALIZE);
            this.H = l();
            s();
        } else if (ordinal == 1) {
            s();
        } else if (ordinal == 2) {
            k();
        } else {
            StringBuilder A = f.a.b.a.a.A("Unrecognized run reason: ");
            A.append(this.x);
            throw new IllegalStateException(A.toString());
        }
    }

    public final void u() {
        Throwable th;
        this.f3330h.a();
        if (this.I) {
            if (this.f3329g.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.f3329g;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.I = true;
    }
}
