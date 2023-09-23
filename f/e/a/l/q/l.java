package f.e.a.l.q;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import f.e.a.l.q.a;
import f.e.a.l.q.c0.a;
import f.e.a.l.q.c0.i;
import f.e.a.l.q.i;
import f.e.a.l.q.q;
import f.e.a.r.i;
import f.e.a.r.m.a;
import java.io.File;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: Engine.java */
/* loaded from: classes.dex */
public class l implements n, i.a, q.a {

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f3350i = Log.isLoggable("Engine", 2);
    public final s a;
    public final p b;
    public final f.e.a.l.q.c0.i c;

    /* renamed from: d  reason: collision with root package name */
    public final b f3351d;

    /* renamed from: e  reason: collision with root package name */
    public final y f3352e;

    /* renamed from: f  reason: collision with root package name */
    public final c f3353f;

    /* renamed from: g  reason: collision with root package name */
    public final a f3354g;

    /* renamed from: h  reason: collision with root package name */
    public final f.e.a.l.q.a f3355h;

    /* compiled from: Engine.java */
    /* loaded from: classes.dex */
    public static class a {
        public final i.d a;
        public final e.i.i.c<i<?>> b = f.e.a.r.m.a.a(150, new C0078a());
        public int c;

        /* compiled from: Engine.java */
        /* renamed from: f.e.a.l.q.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0078a implements a.b<i<?>> {
            public C0078a() {
            }

            @Override // f.e.a.r.m.a.b
            public i<?> a() {
                a aVar = a.this;
                return new i<>(aVar.a, aVar.b);
            }
        }

        public a(i.d dVar) {
            this.a = dVar;
        }
    }

    /* compiled from: Engine.java */
    /* loaded from: classes.dex */
    public static class b {
        public final f.e.a.l.q.d0.a a;
        public final f.e.a.l.q.d0.a b;
        public final f.e.a.l.q.d0.a c;

        /* renamed from: d  reason: collision with root package name */
        public final f.e.a.l.q.d0.a f3356d;

        /* renamed from: e  reason: collision with root package name */
        public final n f3357e;

        /* renamed from: f  reason: collision with root package name */
        public final q.a f3358f;

        /* renamed from: g  reason: collision with root package name */
        public final e.i.i.c<m<?>> f3359g = f.e.a.r.m.a.a(150, new a());

        /* compiled from: Engine.java */
        /* loaded from: classes.dex */
        public class a implements a.b<m<?>> {
            public a() {
            }

            @Override // f.e.a.r.m.a.b
            public m<?> a() {
                b bVar = b.this;
                return new m<>(bVar.a, bVar.b, bVar.c, bVar.f3356d, bVar.f3357e, bVar.f3358f, bVar.f3359g);
            }
        }

        public b(f.e.a.l.q.d0.a aVar, f.e.a.l.q.d0.a aVar2, f.e.a.l.q.d0.a aVar3, f.e.a.l.q.d0.a aVar4, n nVar, q.a aVar5) {
            this.a = aVar;
            this.b = aVar2;
            this.c = aVar3;
            this.f3356d = aVar4;
            this.f3357e = nVar;
            this.f3358f = aVar5;
        }
    }

    /* compiled from: Engine.java */
    /* loaded from: classes.dex */
    public static class c implements i.d {
        public final a.InterfaceC0073a a;
        public volatile f.e.a.l.q.c0.a b;

        public c(a.InterfaceC0073a interfaceC0073a) {
            this.a = interfaceC0073a;
        }

        public f.e.a.l.q.c0.a a() {
            if (this.b == null) {
                synchronized (this) {
                    if (this.b == null) {
                        f.e.a.l.q.c0.d dVar = (f.e.a.l.q.c0.d) this.a;
                        f.e.a.l.q.c0.f fVar = (f.e.a.l.q.c0.f) dVar.b;
                        File cacheDir = fVar.a.getCacheDir();
                        f.e.a.l.q.c0.e eVar = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else if (fVar.b != null) {
                            cacheDir = new File(cacheDir, fVar.b);
                        }
                        if (cacheDir != null && (cacheDir.isDirectory() || cacheDir.mkdirs())) {
                            eVar = new f.e.a.l.q.c0.e(cacheDir, dVar.a);
                        }
                        this.b = eVar;
                    }
                    if (this.b == null) {
                        this.b = new f.e.a.l.q.c0.b();
                    }
                }
            }
            return this.b;
        }
    }

    /* compiled from: Engine.java */
    /* loaded from: classes.dex */
    public class d {
        public final m<?> a;
        public final f.e.a.p.g b;

        public d(f.e.a.p.g gVar, m<?> mVar) {
            this.b = gVar;
            this.a = mVar;
        }
    }

    public l(f.e.a.l.q.c0.i iVar, a.InterfaceC0073a interfaceC0073a, f.e.a.l.q.d0.a aVar, f.e.a.l.q.d0.a aVar2, f.e.a.l.q.d0.a aVar3, f.e.a.l.q.d0.a aVar4, boolean z) {
        this.c = iVar;
        c cVar = new c(interfaceC0073a);
        this.f3353f = cVar;
        f.e.a.l.q.a aVar5 = new f.e.a.l.q.a(z);
        this.f3355h = aVar5;
        synchronized (this) {
            synchronized (aVar5) {
                aVar5.f3266e = this;
            }
        }
        this.b = new p();
        this.a = new s();
        this.f3351d = new b(aVar, aVar2, aVar3, aVar4, this, this);
        this.f3354g = new a(cVar);
        this.f3352e = new y();
        ((f.e.a.l.q.c0.h) iVar).f3294d = this;
    }

    public static void d(String str, long j2, f.e.a.l.j jVar) {
        StringBuilder D = f.a.b.a.a.D(str, " in ");
        D.append(f.e.a.r.h.a(j2));
        D.append("ms, key: ");
        D.append(jVar);
        Log.v("Engine", D.toString());
    }

    @Override // f.e.a.l.q.q.a
    public void a(f.e.a.l.j jVar, q<?> qVar) {
        f.e.a.l.q.a aVar = this.f3355h;
        synchronized (aVar) {
            a.b remove = aVar.c.remove(jVar);
            if (remove != null) {
                remove.c = null;
                remove.clear();
            }
        }
        if (qVar.f3380f) {
            ((f.e.a.l.q.c0.h) this.c).d(jVar, qVar);
        } else {
            this.f3352e.a(qVar, false);
        }
    }

    public <R> d b(f.e.a.d dVar, Object obj, f.e.a.l.j jVar, int i2, int i3, Class<?> cls, Class<R> cls2, Priority priority, k kVar, Map<Class<?>, f.e.a.l.o<?>> map, boolean z, boolean z2, f.e.a.l.l lVar, boolean z3, boolean z4, boolean z5, boolean z6, f.e.a.p.g gVar, Executor executor) {
        long j2;
        if (f3350i) {
            int i4 = f.e.a.r.h.b;
            j2 = SystemClock.elapsedRealtimeNanos();
        } else {
            j2 = 0;
        }
        long j3 = j2;
        Objects.requireNonNull(this.b);
        o oVar = new o(obj, jVar, i2, i3, map, cls, cls2, lVar);
        synchronized (this) {
            q<?> c2 = c(oVar, z3, j3);
            if (c2 == null) {
                return g(dVar, obj, jVar, i2, i3, cls, cls2, priority, kVar, map, z, z2, lVar, z3, z4, z5, z6, gVar, executor, oVar, j3);
            }
            ((f.e.a.p.h) gVar).p(c2, DataSource.MEMORY_CACHE, false);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final q<?> c(o oVar, boolean z, long j2) {
        q<?> qVar;
        v vVar;
        q<?> qVar2;
        if (z) {
            f.e.a.l.q.a aVar = this.f3355h;
            synchronized (aVar) {
                a.b bVar = aVar.c.get(oVar);
                if (bVar == null) {
                    qVar = null;
                } else {
                    qVar = bVar.get();
                    if (qVar == null) {
                        aVar.b(bVar);
                    }
                }
            }
            if (qVar != null) {
                qVar.d();
            }
            if (qVar != null) {
                if (f3350i) {
                    d("Loaded resource from active resources", j2, oVar);
                }
                return qVar;
            }
            f.e.a.l.q.c0.h hVar = (f.e.a.l.q.c0.h) this.c;
            synchronized (hVar) {
                i.a aVar2 = (i.a) hVar.a.remove(oVar);
                if (aVar2 == null) {
                    vVar = null;
                } else {
                    hVar.c -= aVar2.b;
                    vVar = aVar2.a;
                }
            }
            v vVar2 = vVar;
            if (vVar2 == null) {
                qVar2 = null;
            } else if (vVar2 instanceof q) {
                qVar2 = (q) vVar2;
            } else {
                qVar2 = new q<>(vVar2, true, true, oVar, this);
            }
            if (qVar2 != null) {
                qVar2.d();
                this.f3355h.a(oVar, qVar2);
            }
            if (qVar2 != null) {
                if (f3350i) {
                    d("Loaded resource from cache", j2, oVar);
                }
                return qVar2;
            }
            return null;
        }
        return null;
    }

    public synchronized void e(m<?> mVar, f.e.a.l.j jVar, q<?> qVar) {
        if (qVar != null) {
            if (qVar.f3380f) {
                this.f3355h.a(jVar, qVar);
            }
        }
        s sVar = this.a;
        Objects.requireNonNull(sVar);
        Map<f.e.a.l.j, m<?>> a2 = sVar.a(mVar.u);
        if (mVar.equals(a2.get(jVar))) {
            a2.remove(jVar);
        }
    }

    public void f(v<?> vVar) {
        if (vVar instanceof q) {
            ((q) vVar).e();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9 A[Catch: all -> 0x0113, TryCatch #0 {, blocks: (B:19:0x00d3, B:21:0x00df, B:27:0x00e9, B:35:0x00fc, B:28:0x00ec, B:30:0x00f0, B:31:0x00f3, B:33:0x00f7, B:34:0x00fa), top: B:48:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ec A[Catch: all -> 0x0113, TryCatch #0 {, blocks: (B:19:0x00d3, B:21:0x00df, B:27:0x00e9, B:35:0x00fc, B:28:0x00ec, B:30:0x00f0, B:31:0x00f3, B:33:0x00f7, B:34:0x00fa), top: B:48:0x00d3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <R> f.e.a.l.q.l.d g(f.e.a.d r17, java.lang.Object r18, f.e.a.l.j r19, int r20, int r21, java.lang.Class<?> r22, java.lang.Class<R> r23, com.bumptech.glide.Priority r24, f.e.a.l.q.k r25, java.util.Map<java.lang.Class<?>, f.e.a.l.o<?>> r26, boolean r27, boolean r28, f.e.a.l.l r29, boolean r30, boolean r31, boolean r32, boolean r33, f.e.a.p.g r34, java.util.concurrent.Executor r35, f.e.a.l.q.o r36, long r37) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.a.l.q.l.g(f.e.a.d, java.lang.Object, f.e.a.l.j, int, int, java.lang.Class, java.lang.Class, com.bumptech.glide.Priority, f.e.a.l.q.k, java.util.Map, boolean, boolean, f.e.a.l.l, boolean, boolean, boolean, boolean, f.e.a.p.g, java.util.concurrent.Executor, f.e.a.l.q.o, long):f.e.a.l.q.l$d");
    }
}
