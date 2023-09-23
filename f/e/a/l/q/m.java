package f.e.a.l.q;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import f.e.a.l.q.i;
import f.e.a.l.q.q;
import f.e.a.r.m.a;
import f.e.a.r.m.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: EngineJob.java */
/* loaded from: classes.dex */
public class m<R> implements i.a<R>, a.d {
    public static final c E = new c();
    public q<?> A;
    public i<R> B;
    public volatile boolean C;
    public boolean D;

    /* renamed from: f  reason: collision with root package name */
    public final e f3360f;

    /* renamed from: g  reason: collision with root package name */
    public final f.e.a.r.m.d f3361g;

    /* renamed from: h  reason: collision with root package name */
    public final q.a f3362h;

    /* renamed from: i  reason: collision with root package name */
    public final e.i.i.c<m<?>> f3363i;

    /* renamed from: j  reason: collision with root package name */
    public final c f3364j;

    /* renamed from: k  reason: collision with root package name */
    public final n f3365k;

    /* renamed from: l  reason: collision with root package name */
    public final f.e.a.l.q.d0.a f3366l;

    /* renamed from: m  reason: collision with root package name */
    public final f.e.a.l.q.d0.a f3367m;
    public final f.e.a.l.q.d0.a n;
    public final f.e.a.l.q.d0.a o;
    public final AtomicInteger p;
    public f.e.a.l.j q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public v<?> v;
    public DataSource w;
    public boolean x;
    public GlideException y;
    public boolean z;

    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final f.e.a.p.g f3368f;

        public a(f.e.a.p.g gVar) {
            this.f3368f = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.e.a.p.h hVar = (f.e.a.p.h) this.f3368f;
            hVar.c.a();
            synchronized (hVar.f3571d) {
                synchronized (m.this) {
                    if (m.this.f3360f.f3372f.contains(new d(this.f3368f, f.e.a.r.e.b))) {
                        m mVar = m.this;
                        f.e.a.p.g gVar = this.f3368f;
                        Objects.requireNonNull(mVar);
                        ((f.e.a.p.h) gVar).o(mVar.y, 5);
                    }
                    m.this.c();
                }
            }
        }
    }

    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final f.e.a.p.g f3370f;

        public b(f.e.a.p.g gVar) {
            this.f3370f = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.e.a.p.h hVar = (f.e.a.p.h) this.f3370f;
            hVar.c.a();
            synchronized (hVar.f3571d) {
                synchronized (m.this) {
                    if (m.this.f3360f.f3372f.contains(new d(this.f3370f, f.e.a.r.e.b))) {
                        m.this.A.d();
                        m mVar = m.this;
                        f.e.a.p.g gVar = this.f3370f;
                        Objects.requireNonNull(mVar);
                        ((f.e.a.p.h) gVar).p(mVar.A, mVar.w, mVar.D);
                        m.this.h(this.f3370f);
                    }
                    m.this.c();
                }
            }
        }
    }

    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public static class c {
    }

    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public static final class d {
        public final f.e.a.p.g a;
        public final Executor b;

        public d(f.e.a.p.g gVar, Executor executor) {
            this.a = gVar;
            this.b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.a.equals(((d) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public static final class e implements Iterable<d> {

        /* renamed from: f  reason: collision with root package name */
        public final List<d> f3372f = new ArrayList(2);

        public boolean isEmpty() {
            return this.f3372f.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator<d> iterator() {
            return this.f3372f.iterator();
        }
    }

    public m(f.e.a.l.q.d0.a aVar, f.e.a.l.q.d0.a aVar2, f.e.a.l.q.d0.a aVar3, f.e.a.l.q.d0.a aVar4, n nVar, q.a aVar5, e.i.i.c<m<?>> cVar) {
        c cVar2 = E;
        this.f3360f = new e();
        this.f3361g = new d.b();
        this.p = new AtomicInteger();
        this.f3366l = aVar;
        this.f3367m = aVar2;
        this.n = aVar3;
        this.o = aVar4;
        this.f3365k = nVar;
        this.f3362h = aVar5;
        this.f3363i = cVar;
        this.f3364j = cVar2;
    }

    public synchronized void a(f.e.a.p.g gVar, Executor executor) {
        this.f3361g.a();
        this.f3360f.f3372f.add(new d(gVar, executor));
        boolean z = true;
        if (this.x) {
            d(1);
            executor.execute(new b(gVar));
        } else if (this.z) {
            d(1);
            executor.execute(new a(gVar));
        } else {
            if (this.C) {
                z = false;
            }
            f.c.a.a.i.d(z, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    public void b() {
        if (e()) {
            return;
        }
        this.C = true;
        i<R> iVar = this.B;
        iVar.J = true;
        g gVar = iVar.H;
        if (gVar != null) {
            gVar.cancel();
        }
        n nVar = this.f3365k;
        f.e.a.l.j jVar = this.q;
        l lVar = (l) nVar;
        synchronized (lVar) {
            s sVar = lVar.a;
            Objects.requireNonNull(sVar);
            Map<f.e.a.l.j, m<?>> a2 = sVar.a(this.u);
            if (equals(a2.get(jVar))) {
                a2.remove(jVar);
            }
        }
    }

    public void c() {
        q<?> qVar;
        synchronized (this) {
            this.f3361g.a();
            f.c.a.a.i.d(e(), "Not yet complete!");
            int decrementAndGet = this.p.decrementAndGet();
            f.c.a.a.i.d(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                qVar = this.A;
                f();
            } else {
                qVar = null;
            }
        }
        if (qVar != null) {
            qVar.e();
        }
    }

    public synchronized void d(int i2) {
        q<?> qVar;
        f.c.a.a.i.d(e(), "Not yet complete!");
        if (this.p.getAndAdd(i2) == 0 && (qVar = this.A) != null) {
            qVar.d();
        }
    }

    public final boolean e() {
        return this.z || this.x || this.C;
    }

    public final synchronized void f() {
        boolean a2;
        if (this.q != null) {
            this.f3360f.f3372f.clear();
            this.q = null;
            this.A = null;
            this.v = null;
            this.z = false;
            this.C = false;
            this.x = false;
            this.D = false;
            i<R> iVar = this.B;
            i.e eVar = iVar.f3334l;
            synchronized (eVar) {
                eVar.a = true;
                a2 = eVar.a(false);
            }
            if (a2) {
                iVar.q();
            }
            this.B = null;
            this.y = null;
            this.w = null;
            this.f3363i.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override // f.e.a.r.m.a.d
    public f.e.a.r.m.d g() {
        return this.f3361g;
    }

    public synchronized void h(f.e.a.p.g gVar) {
        boolean z;
        this.f3361g.a();
        this.f3360f.f3372f.remove(new d(gVar, f.e.a.r.e.b));
        if (this.f3360f.isEmpty()) {
            b();
            if (!this.x && !this.z) {
                z = false;
                if (z && this.p.get() == 0) {
                    f();
                }
            }
            z = true;
            if (z) {
                f();
            }
        }
    }
}
