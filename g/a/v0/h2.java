package g.a.v0;

import androidx.core.app.NotificationManagerCompat;
import g.a.h;
import g.a.i0;
import g.a.v0.i2;
import g.a.v0.t2;
import g.a.v0.u0;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.internal.ClientStreamListener;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: RetriableStream.java */
/* loaded from: classes2.dex */
public abstract class h2<ReqT> implements g.a.v0.v {
    public static final i0.f<String> w;
    public static final i0.f<String> x;
    public static final Status y;
    public static Random z;
    public final MethodDescriptor<ReqT, ?> a;
    public final Executor b;
    public final ScheduledExecutorService c;

    /* renamed from: d  reason: collision with root package name */
    public final g.a.i0 f7767d;

    /* renamed from: e  reason: collision with root package name */
    public final i2.a f7768e;

    /* renamed from: f  reason: collision with root package name */
    public final u0.a f7769f;

    /* renamed from: g  reason: collision with root package name */
    public i2 f7770g;

    /* renamed from: h  reason: collision with root package name */
    public u0 f7771h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7772i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f7773j;

    /* renamed from: k  reason: collision with root package name */
    public final r f7774k;

    /* renamed from: l  reason: collision with root package name */
    public final long f7775l;

    /* renamed from: m  reason: collision with root package name */
    public final long f7776m;
    public final x n;
    public final a1 o;
    public volatile u p;
    public final AtomicBoolean q;
    public long r;
    public ClientStreamListener s;
    public s t;
    public s u;
    public long v;

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class a extends h.a {
        public final /* synthetic */ g.a.h a;

        public a(h2 h2Var, g.a.h hVar) {
            this.a = hVar;
        }

        @Override // g.a.h.a
        public g.a.h a(h.b bVar, g.a.i0 i0Var) {
            return this.a;
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class b implements p {
        public final /* synthetic */ String a;

        public b(h2 h2Var, String str) {
            this.a = str;
        }

        @Override // g.a.v0.h2.p
        public void a(w wVar) {
            wVar.a.k(this.a);
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Collection f7777f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ w f7778g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Future f7779h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ Future f7780i;

        public c(Collection collection, w wVar, Future future, Future future2) {
            this.f7777f = collection;
            this.f7778g = wVar;
            this.f7779h = future;
            this.f7780i = future2;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (w wVar : this.f7777f) {
                if (wVar != this.f7778g) {
                    wVar.a.j(h2.y);
                }
            }
            Future future = this.f7779h;
            if (future != null) {
                future.cancel(false);
            }
            Future future2 = this.f7780i;
            if (future2 != null) {
                future2.cancel(false);
            }
            h2.this.x();
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class d implements p {
        public final /* synthetic */ g.a.j a;

        public d(h2 h2Var, g.a.j jVar) {
            this.a = jVar;
        }

        @Override // g.a.v0.h2.p
        public void a(w wVar) {
            wVar.a.a(this.a);
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class e implements p {
        public final /* synthetic */ g.a.n a;

        public e(h2 h2Var, g.a.n nVar) {
            this.a = nVar;
        }

        @Override // g.a.v0.h2.p
        public void a(w wVar) {
            wVar.a.n(this.a);
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class f implements p {
        public final /* synthetic */ g.a.p a;

        public f(h2 h2Var, g.a.p pVar) {
            this.a = pVar;
        }

        @Override // g.a.v0.h2.p
        public void a(w wVar) {
            wVar.a.i(this.a);
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class g implements p {
        public g(h2 h2Var) {
        }

        @Override // g.a.v0.h2.p
        public void a(w wVar) {
            wVar.a.flush();
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class h implements p {
        public final /* synthetic */ boolean a;

        public h(h2 h2Var, boolean z) {
            this.a = z;
        }

        @Override // g.a.v0.h2.p
        public void a(w wVar) {
            wVar.a.p(this.a);
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class i implements p {
        public i(h2 h2Var) {
        }

        @Override // g.a.v0.h2.p
        public void a(w wVar) {
            wVar.a.m();
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class j implements p {
        public final /* synthetic */ int a;

        public j(h2 h2Var, int i2) {
            this.a = i2;
        }

        @Override // g.a.v0.h2.p
        public void a(w wVar) {
            wVar.a.g(this.a);
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class k implements p {
        public final /* synthetic */ int a;

        public k(h2 h2Var, int i2) {
            this.a = i2;
        }

        @Override // g.a.v0.h2.p
        public void a(w wVar) {
            wVar.a.h(this.a);
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class l implements p {
        public l(h2 h2Var) {
        }

        @Override // g.a.v0.h2.p
        public void a(w wVar) {
            wVar.a.c();
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class m implements p {
        public final /* synthetic */ int a;

        public m(h2 h2Var, int i2) {
            this.a = i2;
        }

        @Override // g.a.v0.h2.p
        public void a(w wVar) {
            wVar.a.f(this.a);
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class n implements p {
        public final /* synthetic */ Object a;

        public n(Object obj) {
            this.a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // g.a.v0.h2.p
        public void a(w wVar) {
            wVar.a.b(h2.this.a.b(this.a));
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class o implements p {
        public o() {
        }

        @Override // g.a.v0.h2.p
        public void a(w wVar) {
            wVar.a.o(new v(wVar));
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public interface p {
        void a(w wVar);
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class q extends g.a.h {
        public final w a;
        public long b;

        public q(w wVar) {
            this.a = wVar;
        }

        @Override // g.a.s0
        public void a(long j2) {
            if (h2.this.p.f7787f != null) {
                return;
            }
            synchronized (h2.this.f7773j) {
                if (h2.this.p.f7787f == null) {
                    w wVar = this.a;
                    if (!wVar.b) {
                        long j3 = this.b + j2;
                        this.b = j3;
                        h2 h2Var = h2.this;
                        long j4 = h2Var.r;
                        if (j3 <= j4) {
                            return;
                        }
                        if (j3 > h2Var.f7775l) {
                            wVar.c = true;
                        } else {
                            long addAndGet = h2Var.f7774k.a.addAndGet(j3 - j4);
                            h2 h2Var2 = h2.this;
                            h2Var2.r = this.b;
                            if (addAndGet > h2Var2.f7776m) {
                                this.a.c = true;
                            }
                        }
                        w wVar2 = this.a;
                        Runnable q = wVar2.c ? h2.this.q(wVar2) : null;
                        if (q != null) {
                            ((c) q).run();
                        }
                    }
                }
            }
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public static final class r {
        public final AtomicLong a = new AtomicLong();
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public static final class s {
        public final Object a;
        public Future<?> b;
        public boolean c;

        public s(Object obj) {
            this.a = obj;
        }

        public Future<?> a() {
            this.c = true;
            return this.b;
        }

        public void b(Future<?> future) {
            synchronized (this.a) {
                if (!this.c) {
                    this.b = future;
                }
            }
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public final class t implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final s f7782f;

        /* compiled from: RetriableStream.java */
        /* loaded from: classes2.dex */
        public class a implements Runnable {
            public a() {
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
                if (r4 != false) goto L26;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r8 = this;
                    g.a.v0.h2$t r0 = g.a.v0.h2.t.this
                    g.a.v0.h2 r0 = g.a.v0.h2.this
                    g.a.v0.h2$u r1 = r0.p
                    int r1 = r1.f7786e
                    g.a.v0.h2$w r0 = r0.r(r1)
                    g.a.v0.h2$t r1 = g.a.v0.h2.t.this
                    g.a.v0.h2 r1 = g.a.v0.h2.this
                    java.lang.Object r1 = r1.f7773j
                    monitor-enter(r1)
                    g.a.v0.h2$t r2 = g.a.v0.h2.t.this     // Catch: java.lang.Throwable -> La0
                    g.a.v0.h2$s r3 = r2.f7782f     // Catch: java.lang.Throwable -> La0
                    boolean r3 = r3.c     // Catch: java.lang.Throwable -> La0
                    r4 = 1
                    r5 = 0
                    r6 = 0
                    if (r3 == 0) goto L1f
                    goto L6d
                L1f:
                    g.a.v0.h2 r2 = g.a.v0.h2.this     // Catch: java.lang.Throwable -> La0
                    g.a.v0.h2$u r3 = r2.p     // Catch: java.lang.Throwable -> La0
                    g.a.v0.h2$u r3 = r3.a(r0)     // Catch: java.lang.Throwable -> La0
                    r2.p = r3     // Catch: java.lang.Throwable -> La0
                    g.a.v0.h2$t r2 = g.a.v0.h2.t.this     // Catch: java.lang.Throwable -> La0
                    g.a.v0.h2 r2 = g.a.v0.h2.this     // Catch: java.lang.Throwable -> La0
                    g.a.v0.h2$u r3 = r2.p     // Catch: java.lang.Throwable -> La0
                    boolean r2 = r2.v(r3)     // Catch: java.lang.Throwable -> La0
                    if (r2 == 0) goto L5a
                    g.a.v0.h2$t r2 = g.a.v0.h2.t.this     // Catch: java.lang.Throwable -> La0
                    g.a.v0.h2 r2 = g.a.v0.h2.this     // Catch: java.lang.Throwable -> La0
                    g.a.v0.h2$x r2 = r2.n     // Catch: java.lang.Throwable -> La0
                    if (r2 == 0) goto L4b
                    java.util.concurrent.atomic.AtomicInteger r3 = r2.f7795d     // Catch: java.lang.Throwable -> La0
                    int r3 = r3.get()     // Catch: java.lang.Throwable -> La0
                    int r2 = r2.b     // Catch: java.lang.Throwable -> La0
                    if (r3 <= r2) goto L48
                    goto L49
                L48:
                    r4 = 0
                L49:
                    if (r4 == 0) goto L5a
                L4b:
                    g.a.v0.h2$t r2 = g.a.v0.h2.t.this     // Catch: java.lang.Throwable -> La0
                    g.a.v0.h2 r2 = g.a.v0.h2.this     // Catch: java.lang.Throwable -> La0
                    g.a.v0.h2$s r3 = new g.a.v0.h2$s     // Catch: java.lang.Throwable -> La0
                    java.lang.Object r4 = r2.f7773j     // Catch: java.lang.Throwable -> La0
                    r3.<init>(r4)     // Catch: java.lang.Throwable -> La0
                    r2.u = r3     // Catch: java.lang.Throwable -> La0
                    r5 = r3
                    goto L6c
                L5a:
                    g.a.v0.h2$t r2 = g.a.v0.h2.t.this     // Catch: java.lang.Throwable -> La0
                    g.a.v0.h2 r2 = g.a.v0.h2.this     // Catch: java.lang.Throwable -> La0
                    g.a.v0.h2$u r3 = r2.p     // Catch: java.lang.Throwable -> La0
                    g.a.v0.h2$u r3 = r3.b()     // Catch: java.lang.Throwable -> La0
                    r2.p = r3     // Catch: java.lang.Throwable -> La0
                    g.a.v0.h2$t r2 = g.a.v0.h2.t.this     // Catch: java.lang.Throwable -> La0
                    g.a.v0.h2 r2 = g.a.v0.h2.this     // Catch: java.lang.Throwable -> La0
                    r2.u = r5     // Catch: java.lang.Throwable -> La0
                L6c:
                    r4 = 0
                L6d:
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> La0
                    if (r4 == 0) goto L7e
                    g.a.v0.v r0 = r0.a
                    io.grpc.Status r1 = io.grpc.Status.f8686g
                    java.lang.String r2 = "Unneeded hedging"
                    io.grpc.Status r1 = r1.h(r2)
                    r0.j(r1)
                    return
                L7e:
                    if (r5 == 0) goto L98
                    g.a.v0.h2$t r1 = g.a.v0.h2.t.this
                    g.a.v0.h2 r1 = g.a.v0.h2.this
                    java.util.concurrent.ScheduledExecutorService r2 = r1.c
                    g.a.v0.h2$t r3 = new g.a.v0.h2$t
                    r3.<init>(r5)
                    g.a.v0.u0 r1 = r1.f7771h
                    long r6 = r1.b
                    java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
                    java.util.concurrent.ScheduledFuture r1 = r2.schedule(r3, r6, r1)
                    r5.b(r1)
                L98:
                    g.a.v0.h2$t r1 = g.a.v0.h2.t.this
                    g.a.v0.h2 r1 = g.a.v0.h2.this
                    r1.t(r0)
                    return
                La0:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> La0
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: g.a.v0.h2.t.a.run():void");
            }
        }

        public t(s sVar) {
            this.f7782f = sVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            h2.this.b.execute(new a());
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public static final class u {
        public final boolean a;
        public final List<p> b;
        public final Collection<w> c;

        /* renamed from: d  reason: collision with root package name */
        public final Collection<w> f7785d;

        /* renamed from: e  reason: collision with root package name */
        public final int f7786e;

        /* renamed from: f  reason: collision with root package name */
        public final w f7787f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f7788g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f7789h;

        public u(List<p> list, Collection<w> collection, Collection<w> collection2, w wVar, boolean z, boolean z2, boolean z3, int i2) {
            this.b = list;
            f.h.b.c.a.x(collection, "drainedSubstreams");
            this.c = collection;
            this.f7787f = wVar;
            this.f7785d = collection2;
            this.f7788g = z;
            this.a = z2;
            this.f7789h = z3;
            this.f7786e = i2;
            boolean z4 = false;
            f.h.b.c.a.C(!z2 || list == null, "passThrough should imply buffer is null");
            f.h.b.c.a.C((z2 && wVar == null) ? false : true, "passThrough should imply winningSubstream != null");
            f.h.b.c.a.C(!z2 || (collection.size() == 1 && collection.contains(wVar)) || (collection.size() == 0 && wVar.b), "passThrough should imply winningSubstream is drained");
            f.h.b.c.a.C((z && wVar == null) ? true : true, "cancelled should imply committed");
        }

        public u a(w wVar) {
            Collection unmodifiableCollection;
            f.h.b.c.a.C(!this.f7789h, "hedging frozen");
            f.h.b.c.a.C(this.f7787f == null, "already committed");
            if (this.f7785d == null) {
                unmodifiableCollection = Collections.singleton(wVar);
            } else {
                ArrayList arrayList = new ArrayList(this.f7785d);
                arrayList.add(wVar);
                unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            return new u(this.b, this.c, unmodifiableCollection, this.f7787f, this.f7788g, this.a, this.f7789h, this.f7786e + 1);
        }

        public u b() {
            return this.f7789h ? this : new u(this.b, this.c, this.f7785d, this.f7787f, this.f7788g, this.a, true, this.f7786e);
        }

        public u c(w wVar) {
            ArrayList arrayList = new ArrayList(this.f7785d);
            arrayList.remove(wVar);
            return new u(this.b, this.c, Collections.unmodifiableCollection(arrayList), this.f7787f, this.f7788g, this.a, this.f7789h, this.f7786e);
        }

        public u d(w wVar, w wVar2) {
            ArrayList arrayList = new ArrayList(this.f7785d);
            arrayList.remove(wVar);
            arrayList.add(wVar2);
            return new u(this.b, this.c, Collections.unmodifiableCollection(arrayList), this.f7787f, this.f7788g, this.a, this.f7789h, this.f7786e);
        }

        public u e(w wVar) {
            wVar.b = true;
            if (this.c.contains(wVar)) {
                ArrayList arrayList = new ArrayList(this.c);
                arrayList.remove(wVar);
                return new u(this.b, Collections.unmodifiableCollection(arrayList), this.f7785d, this.f7787f, this.f7788g, this.a, this.f7789h, this.f7786e);
            }
            return this;
        }

        public u f(w wVar) {
            Collection unmodifiableCollection;
            f.h.b.c.a.C(!this.a, "Already passThrough");
            if (wVar.b) {
                unmodifiableCollection = this.c;
            } else if (this.c.isEmpty()) {
                unmodifiableCollection = Collections.singletonList(wVar);
            } else {
                ArrayList arrayList = new ArrayList(this.c);
                arrayList.add(wVar);
                unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            Collection collection = unmodifiableCollection;
            w wVar2 = this.f7787f;
            boolean z = wVar2 != null;
            List<p> list = this.b;
            if (z) {
                f.h.b.c.a.C(wVar2 == wVar, "Another RPC attempt has already committed");
                list = null;
            }
            return new u(list, collection, this.f7785d, this.f7787f, this.f7788g, z, this.f7789h, this.f7786e);
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public final class v implements ClientStreamListener {
        public final w a;

        /* compiled from: RetriableStream.java */
        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ w f7790f;

            public a(w wVar) {
                this.f7790f = wVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                h2 h2Var = h2.this;
                w wVar = this.f7790f;
                i0.f<String> fVar = h2.w;
                h2Var.t(wVar);
            }
        }

        /* compiled from: RetriableStream.java */
        /* loaded from: classes2.dex */
        public class b implements Runnable {

            /* compiled from: RetriableStream.java */
            /* loaded from: classes2.dex */
            public class a implements Runnable {
                public a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    v vVar = v.this;
                    i0.f<String> fVar = h2.w;
                    h2.this.t(h2.this.r(vVar.a.f7794d + 1));
                }
            }

            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h2.this.b.execute(new a());
            }
        }

        public v(w wVar) {
            this.a = wVar;
        }

        @Override // g.a.v0.t2
        public void a(t2.a aVar) {
            u uVar = h2.this.p;
            f.h.b.c.a.C(uVar.f7787f != null, "Headers should be received prior to messages.");
            if (uVar.f7787f != this.a) {
                return;
            }
            h2.this.s.a(aVar);
        }

        @Override // g.a.v0.t2
        public void b() {
            h2.this.s.b();
        }

        @Override // io.grpc.internal.ClientStreamListener
        public void c(Status status, g.a.i0 i0Var) {
            e(status, ClientStreamListener.RpcProgress.PROCESSED, i0Var);
        }

        @Override // io.grpc.internal.ClientStreamListener
        public void d(g.a.i0 i0Var) {
            int i2;
            int i3;
            h2.d(h2.this, this.a);
            if (h2.this.p.f7787f == this.a) {
                h2.this.s.d(i0Var);
                x xVar = h2.this.n;
                if (xVar != null) {
                    do {
                        i2 = xVar.f7795d.get();
                        i3 = xVar.a;
                        if (i2 == i3) {
                            return;
                        }
                    } while (!xVar.f7795d.compareAndSet(i2, Math.min(xVar.c + i2, i3)));
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:102:0x01d8  */
        @Override // io.grpc.internal.ClientStreamListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void e(io.grpc.Status r9, io.grpc.internal.ClientStreamListener.RpcProgress r10, g.a.i0 r11) {
            /*
                Method dump skipped, instructions count: 537
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: g.a.v0.h2.v.e(io.grpc.Status, io.grpc.internal.ClientStreamListener$RpcProgress, g.a.i0):void");
        }

        public final Integer f(g.a.i0 i0Var) {
            String str = (String) i0Var.d(h2.x);
            if (str != null) {
                try {
                    return Integer.valueOf(str);
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }
            return null;
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public static final class w {
        public g.a.v0.v a;
        public boolean b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public final int f7794d;

        public w(int i2) {
            this.f7794d = i2;
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public static final class x {
        public final int a;
        public final int b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicInteger f7795d;

        public x(float f2, float f3) {
            AtomicInteger atomicInteger = new AtomicInteger();
            this.f7795d = atomicInteger;
            this.c = (int) (f3 * 1000.0f);
            int i2 = (int) (f2 * 1000.0f);
            this.a = i2;
            this.b = i2 / 2;
            atomicInteger.set(i2);
        }

        public boolean a() {
            int i2;
            int i3;
            do {
                i2 = this.f7795d.get();
                if (i2 == 0) {
                    return false;
                }
                i3 = i2 + NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            } while (!this.f7795d.compareAndSet(i2, Math.max(i3, 0)));
            return i3 > this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof x) {
                x xVar = (x) obj;
                return this.a == xVar.a && this.c == xVar.c;
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.c)});
        }
    }

    static {
        i0.d<String> dVar = g.a.i0.f7537d;
        w = i0.f.a("grpc-previous-rpc-attempts", dVar);
        x = i0.f.a("grpc-retry-pushback-ms", dVar);
        y = Status.f8686g.h("Stream thrown away because RetriableStream committed");
        z = new Random();
    }

    public static void d(h2 h2Var, w wVar) {
        Runnable q2 = h2Var.q(wVar);
        if (q2 != null) {
            ((c) q2).run();
        }
    }

    public static void e(h2 h2Var, Integer num) {
        Objects.requireNonNull(h2Var);
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            h2Var.u();
            return;
        }
        synchronized (h2Var.f7773j) {
            s sVar = h2Var.u;
            if (sVar != null) {
                Future<?> a2 = sVar.a();
                s sVar2 = new s(h2Var.f7773j);
                h2Var.u = sVar2;
                if (a2 != null) {
                    a2.cancel(false);
                }
                sVar2.b(h2Var.c.schedule(new t(sVar2), num.intValue(), TimeUnit.MILLISECONDS));
            }
        }
    }

    @Override // g.a.v0.s2
    public final void a(g.a.j jVar) {
        s(new d(this, jVar));
    }

    @Override // g.a.v0.s2
    public final void b(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // g.a.v0.s2
    public void c() {
        s(new l(this));
    }

    @Override // g.a.v0.s2
    public final void f(int i2) {
        u uVar = this.p;
        if (uVar.a) {
            uVar.f7787f.a.f(i2);
        } else {
            s(new m(this, i2));
        }
    }

    @Override // g.a.v0.s2
    public final void flush() {
        u uVar = this.p;
        if (uVar.a) {
            uVar.f7787f.a.flush();
        } else {
            s(new g(this));
        }
    }

    @Override // g.a.v0.v
    public final void g(int i2) {
        s(new j(this, i2));
    }

    @Override // g.a.v0.v
    public final void h(int i2) {
        s(new k(this, i2));
    }

    @Override // g.a.v0.v
    public final void i(g.a.p pVar) {
        s(new f(this, pVar));
    }

    @Override // g.a.v0.v
    public final void j(Status status) {
        w wVar = new w(0);
        wVar.a = new x1();
        Runnable q2 = q(wVar);
        if (q2 != null) {
            this.s.c(status, new g.a.i0());
            ((c) q2).run();
            return;
        }
        this.p.f7787f.a.j(status);
        synchronized (this.f7773j) {
            u uVar = this.p;
            this.p = new u(uVar.b, uVar.c, uVar.f7785d, uVar.f7787f, true, uVar.a, uVar.f7789h, uVar.f7786e);
        }
    }

    @Override // g.a.v0.v
    public final void k(String str) {
        s(new b(this, str));
    }

    @Override // g.a.v0.v
    public void l(a1 a1Var) {
        u uVar;
        synchronized (this.f7773j) {
            a1Var.b("closed", this.o);
            uVar = this.p;
        }
        if (uVar.f7787f != null) {
            a1 a1Var2 = new a1();
            uVar.f7787f.a.l(a1Var2);
            a1Var.b("committed", a1Var2);
            return;
        }
        a1 a1Var3 = new a1();
        for (w wVar : uVar.c) {
            a1 a1Var4 = new a1();
            wVar.a.l(a1Var4);
            a1Var3.a.add(String.valueOf(a1Var4));
        }
        a1Var.b("open", a1Var3);
    }

    @Override // g.a.v0.v
    public final void m() {
        s(new i(this));
    }

    @Override // g.a.v0.v
    public final void n(g.a.n nVar) {
        s(new e(this, nVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
        if ((r4.f7795d.get() > r4.b) != false) goto L27;
     */
    @Override // g.a.v0.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(io.grpc.internal.ClientStreamListener r7) {
        /*
            r6 = this;
            r6.s = r7
            io.grpc.Status r7 = r6.y()
            if (r7 == 0) goto Lc
            r6.j(r7)
            return
        Lc:
            java.lang.Object r7 = r6.f7773j
            monitor-enter(r7)
            g.a.v0.h2$u r0 = r6.p     // Catch: java.lang.Throwable -> L91
            java.util.List<g.a.v0.h2$p> r0 = r0.b     // Catch: java.lang.Throwable -> L91
            g.a.v0.h2$o r1 = new g.a.v0.h2$o     // Catch: java.lang.Throwable -> L91
            r1.<init>()     // Catch: java.lang.Throwable -> L91
            r0.add(r1)     // Catch: java.lang.Throwable -> L91
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L91
            r7 = 0
            g.a.v0.h2$w r0 = r6.r(r7)
            g.a.v0.u0 r1 = r6.f7771h
            r2 = 1
            if (r1 != 0) goto L28
            r1 = 1
            goto L29
        L28:
            r1 = 0
        L29:
            java.lang.String r3 = "hedgingPolicy has been initialized unexpectedly"
            f.h.b.c.a.C(r1, r3)
            g.a.v0.u0$a r1 = r6.f7769f
            g.a.v0.u0 r1 = r1.get()
            r6.f7771h = r1
            g.a.v0.u0 r3 = g.a.v0.u0.f7936d
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L8d
            r6.f7772i = r2
            g.a.v0.i2 r1 = g.a.v0.i2.f7796f
            r6.f7770g = r1
            r1 = 0
            java.lang.Object r3 = r6.f7773j
            monitor-enter(r3)
            g.a.v0.h2$u r4 = r6.p     // Catch: java.lang.Throwable -> L8a
            g.a.v0.h2$u r4 = r4.a(r0)     // Catch: java.lang.Throwable -> L8a
            r6.p = r4     // Catch: java.lang.Throwable -> L8a
            g.a.v0.h2$u r4 = r6.p     // Catch: java.lang.Throwable -> L8a
            boolean r4 = r6.v(r4)     // Catch: java.lang.Throwable -> L8a
            if (r4 == 0) goto L72
            g.a.v0.h2$x r4 = r6.n     // Catch: java.lang.Throwable -> L8a
            if (r4 == 0) goto L69
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f7795d     // Catch: java.lang.Throwable -> L8a
            int r5 = r5.get()     // Catch: java.lang.Throwable -> L8a
            int r4 = r4.b     // Catch: java.lang.Throwable -> L8a
            if (r5 <= r4) goto L67
            r7 = 1
        L67:
            if (r7 == 0) goto L72
        L69:
            g.a.v0.h2$s r1 = new g.a.v0.h2$s     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r7 = r6.f7773j     // Catch: java.lang.Throwable -> L8a
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L8a
            r6.u = r1     // Catch: java.lang.Throwable -> L8a
        L72:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L8d
            java.util.concurrent.ScheduledExecutorService r7 = r6.c
            g.a.v0.h2$t r2 = new g.a.v0.h2$t
            r2.<init>(r1)
            g.a.v0.u0 r3 = r6.f7771h
            long r3 = r3.b
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.util.concurrent.ScheduledFuture r7 = r7.schedule(r2, r3, r5)
            r1.b(r7)
            goto L8d
        L8a:
            r7 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8a
            throw r7
        L8d:
            r6.t(r0)
            return
        L91:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L91
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.v0.h2.o(io.grpc.internal.ClientStreamListener):void");
    }

    @Override // g.a.v0.v
    public final void p(boolean z2) {
        s(new h(this, z2));
    }

    public final Runnable q(w wVar) {
        List<p> list;
        Collection emptyList;
        Future<?> future;
        Future<?> future2;
        synchronized (this.f7773j) {
            if (this.p.f7787f != null) {
                return null;
            }
            Collection<w> collection = this.p.c;
            u uVar = this.p;
            boolean z2 = false;
            f.h.b.c.a.C(uVar.f7787f == null, "Already committed");
            List<p> list2 = uVar.b;
            if (uVar.c.contains(wVar)) {
                list = null;
                emptyList = Collections.singleton(wVar);
                z2 = true;
            } else {
                list = list2;
                emptyList = Collections.emptyList();
            }
            this.p = new u(list, emptyList, uVar.f7785d, wVar, uVar.f7788g, z2, uVar.f7789h, uVar.f7786e);
            this.f7774k.a.addAndGet(-this.r);
            s sVar = this.t;
            if (sVar != null) {
                Future<?> a2 = sVar.a();
                this.t = null;
                future = a2;
            } else {
                future = null;
            }
            s sVar2 = this.u;
            if (sVar2 != null) {
                Future<?> a3 = sVar2.a();
                this.u = null;
                future2 = a3;
            } else {
                future2 = null;
            }
            return new c(collection, wVar, future, future2);
        }
    }

    public final w r(int i2) {
        w wVar = new w(i2);
        a aVar = new a(this, new q(wVar));
        g.a.i0 i0Var = this.f7767d;
        g.a.i0 i0Var2 = new g.a.i0();
        i0Var2.f(i0Var);
        if (i2 > 0) {
            i0Var2.h(w, String.valueOf(i2));
        }
        wVar.a = w(aVar, i0Var2);
        return wVar;
    }

    public final void s(p pVar) {
        Collection<w> collection;
        synchronized (this.f7773j) {
            if (!this.p.a) {
                this.p.b.add(pVar);
            }
            collection = this.p.c;
        }
        for (w wVar : collection) {
            pVar.a(wVar);
        }
    }

    public final void t(w wVar) {
        ArrayList<p> arrayList = null;
        int i2 = 0;
        while (true) {
            synchronized (this.f7773j) {
                u uVar = this.p;
                w wVar2 = uVar.f7787f;
                if (wVar2 != null && wVar2 != wVar) {
                    wVar.a.j(y);
                    return;
                } else if (i2 == uVar.b.size()) {
                    this.p = uVar.f(wVar);
                    return;
                } else if (wVar.b) {
                    return;
                } else {
                    int min = Math.min(i2 + 128, uVar.b.size());
                    if (arrayList == null) {
                        arrayList = new ArrayList(uVar.b.subList(i2, min));
                    } else {
                        arrayList.clear();
                        arrayList.addAll(uVar.b.subList(i2, min));
                    }
                    for (p pVar : arrayList) {
                        u uVar2 = this.p;
                        w wVar3 = uVar2.f7787f;
                        if (wVar3 == null || wVar3 == wVar) {
                            if (uVar2.f7788g) {
                                f.h.b.c.a.C(wVar3 == wVar, "substream should be CANCELLED_BECAUSE_COMMITTED already");
                                return;
                            }
                            pVar.a(wVar);
                        }
                    }
                    i2 = min;
                }
            }
        }
    }

    public final void u() {
        Future<?> future;
        synchronized (this.f7773j) {
            s sVar = this.u;
            future = null;
            if (sVar != null) {
                Future<?> a2 = sVar.a();
                this.u = null;
                future = a2;
            }
            this.p = this.p.b();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    public final boolean v(u uVar) {
        return uVar.f7787f == null && uVar.f7786e < this.f7771h.a && !uVar.f7789h;
    }

    public abstract g.a.v0.v w(h.a aVar, g.a.i0 i0Var);

    public abstract void x();

    public abstract Status y();

    public final void z(ReqT reqt) {
        u uVar = this.p;
        if (uVar.a) {
            uVar.f7787f.a.b(this.a.f8677d.b(reqt));
        } else {
            s(new n(reqt));
        }
    }
}
