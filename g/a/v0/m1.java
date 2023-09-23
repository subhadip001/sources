package g.a.v0;

import g.a.a;
import g.a.c0;
import g.a.k0;
import g.a.t0;
import g.a.v0.g2;
import g.a.v0.h2;
import g.a.v0.j0;
import g.a.v0.k;
import g.a.v0.l;
import g.a.v0.m2;
import g.a.v0.n;
import g.a.v0.q;
import g.a.v0.u1;
import g.a.v0.u2;
import io.grpc.ChannelLogger;
import io.grpc.ConnectivityState;
import io.grpc.InternalChannelz$ChannelTrace$Event;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.internal.GrpcUtil;
import java.lang.Thread;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* compiled from: ManagedChannelImpl.java */
/* loaded from: classes2.dex */
public final class m1 extends g.a.f0 implements g.a.x<Object> {
    public static final Logger e0 = Logger.getLogger(m1.class.getName());
    public static final Pattern f0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");
    public static final Status g0;
    public static final Status h0;
    public static final Status i0;
    public static final t1 j0;
    public static final g.a.w k0;
    public boolean A;
    public final Set<b1> B;
    public Collection<m.a<?, ?>> C;
    public final Object D;
    public final Set<Object> E;
    public final f0 F;
    public final r G;
    public final AtomicBoolean H;
    public volatile boolean I;
    public volatile boolean J;
    public final CountDownLatch K;
    public final n.a L;
    public final g.a.v0.n M;
    public final g.a.v0.p N;
    public final ChannelLogger O;
    public final g.a.v P;
    public n Q;
    public t1 R;
    public final AtomicReference<g.a.w> S;
    public boolean T;
    public final boolean U;
    public final h2.r V;
    public final long W;
    public final long X;
    public final u1.a Y;
    public final z0<Object> Z;
    public final g.a.y a;
    public t0.c a0;
    public final String b;
    public g.a.v0.l b0;
    public final k0.c c;
    public final q.c c0;

    /* renamed from: d  reason: collision with root package name */
    public final k0.a f7835d;
    public final g2 d0;

    /* renamed from: e  reason: collision with root package name */
    public final g.a.v0.k f7836e;

    /* renamed from: f  reason: collision with root package name */
    public final x f7837f;

    /* renamed from: g  reason: collision with root package name */
    public final o f7838g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f7839h;

    /* renamed from: i  reason: collision with root package name */
    public final y1<? extends Executor> f7840i;

    /* renamed from: j  reason: collision with root package name */
    public final y1<? extends Executor> f7841j;

    /* renamed from: k  reason: collision with root package name */
    public final h f7842k;

    /* renamed from: l  reason: collision with root package name */
    public final h f7843l;

    /* renamed from: m  reason: collision with root package name */
    public final u2 f7844m;
    public final g.a.t0 n;
    public final g.a.p o;
    public final g.a.k p;
    public final f.h.c.a.p<f.h.c.a.o> q;
    public final long r;
    public final a0 s;
    public final l2 t;
    public final l.a u;
    public final g.a.c v;
    public g.a.k0 w;
    public boolean x;
    public k y;
    public volatile c0.i z;

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public class a extends g.a.w {
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public final class b implements n.a {
        public final /* synthetic */ u2 a;

        public b(m1 m1Var, u2 u2Var) {
            this.a = u2Var;
        }

        @Override // g.a.v0.n.a
        public g.a.v0.n a() {
            return new g.a.v0.n(this.a);
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public class c implements Thread.UncaughtExceptionHandler {
        public c() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            Logger logger = m1.e0;
            Level level = Level.SEVERE;
            StringBuilder A = f.a.b.a.a.A("[");
            A.append(m1.this.a);
            A.append("] Uncaught exception in the SynchronizationContext. Panic!");
            logger.log(level, A.toString(), th);
            m1 m1Var = m1.this;
            if (m1Var.A) {
                return;
            }
            m1Var.A = true;
            g2 g2Var = m1Var.d0;
            g2Var.f7741f = false;
            ScheduledFuture<?> scheduledFuture = g2Var.f7742g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                g2Var.f7742g = null;
            }
            m1Var.o(false);
            n1 n1Var = new n1(m1Var, th);
            m1Var.z = n1Var;
            m1Var.F.i(n1Var);
            m1Var.O.a(ChannelLogger.ChannelLogLevel.ERROR, "PANIC! Entering TRANSIENT_FAILURE");
            m1Var.s.a(ConnectivityState.TRANSIENT_FAILURE);
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public class d implements Executor {
        public d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            Executor executor;
            h hVar = m1.this.f7843l;
            synchronized (hVar) {
                if (hVar.b == null) {
                    Executor a = hVar.a.a();
                    f.h.b.c.a.y(a, "%s.getObject()", hVar.b);
                    hVar.b = a;
                }
                executor = hVar.b;
            }
            executor.execute(runnable);
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public final class e implements q.c {

        /* compiled from: ManagedChannelImpl.java */
        /* loaded from: classes2.dex */
        public final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                m1.this.l();
            }
        }

        public e(a aVar) {
        }

        public final w a(c0.f fVar) {
            c0.i iVar = m1.this.z;
            if (m1.this.H.get()) {
                return m1.this.F;
            }
            if (iVar == null) {
                g.a.t0 t0Var = m1.this.n;
                a aVar = new a();
                Queue<Runnable> queue = t0Var.f7561g;
                f.h.b.c.a.x(aVar, "runnable is null");
                queue.add(aVar);
                t0Var.a();
                return m1.this.F;
            }
            w e2 = GrpcUtil.e(iVar.a(fVar), ((b2) fVar).a.b());
            return e2 != null ? e2 : m1.this.F;
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m1 m1Var = m1.this;
            m1Var.a0 = null;
            m1Var.n.d();
            if (m1Var.x) {
                m1Var.w.b();
            }
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public final class g implements u1.a {
        public g(a aVar) {
        }

        @Override // g.a.v0.u1.a
        public void a(Status status) {
            f.h.b.c.a.C(m1.this.H.get(), "Channel must have been shut down");
        }

        @Override // g.a.v0.u1.a
        public void b() {
        }

        @Override // g.a.v0.u1.a
        public void c() {
            f.h.b.c.a.C(m1.this.H.get(), "Channel must have been shut down");
            m1.this.I = true;
            m1.this.o(false);
            Objects.requireNonNull(m1.this);
            m1.k(m1.this);
        }

        @Override // g.a.v0.u1.a
        public void d(boolean z) {
            m1 m1Var = m1.this;
            m1Var.Z.c(m1Var.F, z);
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public static final class h {
        public final y1<? extends Executor> a;
        public Executor b;

        public h(y1<? extends Executor> y1Var) {
            f.h.b.c.a.x(y1Var, "executorPool");
            this.a = y1Var;
        }

        public synchronized void a() {
            Executor executor = this.b;
            if (executor != null) {
                this.b = this.a.b(executor);
            }
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public final class i extends z0<Object> {
        public i(a aVar) {
        }

        @Override // g.a.v0.z0
        public void a() {
            m1.this.l();
        }

        @Override // g.a.v0.z0
        public void b() {
            if (m1.this.H.get()) {
                return;
            }
            m1.this.n();
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public class j implements Runnable {
        public j(a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            m1 m1Var = m1.this;
            m1Var.o(true);
            m1Var.F.i(null);
            m1Var.O.a(ChannelLogger.ChannelLogLevel.INFO, "Entering IDLE state");
            m1Var.s.a(ConnectivityState.IDLE);
            if (true ^ m1Var.Z.a.isEmpty()) {
                m1Var.l();
            }
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public class k extends c0.d {
        public k.b a;

        /* compiled from: ManagedChannelImpl.java */
        /* loaded from: classes2.dex */
        public final class a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ c0.i f7849f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ ConnectivityState f7850g;

            public a(c0.i iVar, ConnectivityState connectivityState) {
                this.f7849f = iVar;
                this.f7850g = connectivityState;
            }

            @Override // java.lang.Runnable
            public void run() {
                k kVar = k.this;
                m1 m1Var = m1.this;
                if (kVar != m1Var.y) {
                    return;
                }
                c0.i iVar = this.f7849f;
                m1Var.z = iVar;
                m1Var.F.i(iVar);
                ConnectivityState connectivityState = this.f7850g;
                if (connectivityState != ConnectivityState.SHUTDOWN) {
                    m1.this.O.b(ChannelLogger.ChannelLogLevel.INFO, "Entering {0} state with picker: {1}", connectivityState, this.f7849f);
                    m1.this.s.a(this.f7850g);
                }
            }
        }

        public k(a aVar) {
        }

        @Override // g.a.c0.d
        public c0.h a(c0.b bVar) {
            m1.this.n.d();
            f.h.b.c.a.C(!m1.this.J, "Channel is terminated");
            return new q(bVar, this);
        }

        @Override // g.a.c0.d
        public ChannelLogger b() {
            return m1.this.O;
        }

        @Override // g.a.c0.d
        public g.a.t0 c() {
            return m1.this.n;
        }

        @Override // g.a.c0.d
        public void d(ConnectivityState connectivityState, c0.i iVar) {
            f.h.b.c.a.x(connectivityState, "newState");
            f.h.b.c.a.x(iVar, "newPicker");
            m1.j(m1.this, "updateBalancingState()");
            g.a.t0 t0Var = m1.this.n;
            a aVar = new a(iVar, connectivityState);
            Queue<Runnable> queue = t0Var.f7561g;
            f.h.b.c.a.x(aVar, "runnable is null");
            queue.add(aVar);
            t0Var.a();
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public final class l extends k0.d {
        public final k a;
        public final g.a.k0 b;

        /* compiled from: ManagedChannelImpl.java */
        /* loaded from: classes2.dex */
        public final class a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ Status f7852f;

            public a(Status status) {
                this.f7852f = status;
            }

            @Override // java.lang.Runnable
            public void run() {
                l.c(l.this, this.f7852f);
            }
        }

        /* compiled from: ManagedChannelImpl.java */
        /* loaded from: classes2.dex */
        public final class b implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ k0.e f7854f;

            public b(k0.e eVar) {
                this.f7854f = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                t1 t1Var;
                Object obj;
                k0.e eVar = this.f7854f;
                List<g.a.r> list = eVar.a;
                m1.this.O.b(ChannelLogger.ChannelLogLevel.DEBUG, "Resolved address: {0}, config={1}", list, eVar.b);
                m1 m1Var = m1.this;
                n nVar = m1Var.Q;
                n nVar2 = n.SUCCESS;
                if (nVar != nVar2) {
                    m1Var.O.b(ChannelLogger.ChannelLogLevel.INFO, "Address resolved: {0}", list);
                    m1.this.Q = nVar2;
                }
                m1.this.b0 = null;
                k0.e eVar2 = this.f7854f;
                k0.b bVar = eVar2.c;
                g.a.w wVar = (g.a.w) eVar2.b.a.get(g.a.w.a);
                t1 t1Var2 = (bVar == null || (obj = bVar.b) == null) ? null : (t1) obj;
                Status status = bVar != null ? bVar.a : null;
                m1 m1Var2 = m1.this;
                if (!m1Var2.U) {
                    if (t1Var2 != null) {
                        m1Var2.O.a(ChannelLogger.ChannelLogLevel.INFO, "Service config from name resolver discarded by channel settings");
                    }
                    Objects.requireNonNull(m1.this);
                    t1Var = m1.j0;
                    if (wVar != null) {
                        m1.this.O.a(ChannelLogger.ChannelLogLevel.INFO, "Config selector from name resolver discarded by channel settings");
                    }
                    m1.this.S.set(null);
                } else {
                    if (t1Var2 != null) {
                        m1Var2.S.set(wVar);
                    } else if (status != null) {
                        if (!m1Var2.T) {
                            m1Var2.O.a(ChannelLogger.ChannelLogLevel.INFO, "Fallback to error due to invalid first service config without default config");
                            l.this.a(bVar.a);
                            return;
                        }
                        t1Var2 = m1Var2.R;
                    } else {
                        t1Var2 = m1.j0;
                        m1Var2.S.set(null);
                    }
                    if (!t1Var2.equals(m1.this.R)) {
                        ChannelLogger channelLogger = m1.this.O;
                        ChannelLogger.ChannelLogLevel channelLogLevel = ChannelLogger.ChannelLogLevel.INFO;
                        Object[] objArr = new Object[1];
                        objArr[0] = t1Var2 == m1.j0 ? " to empty" : "";
                        channelLogger.b(channelLogLevel, "Service config changed{0}", objArr);
                        m1.this.R = t1Var2;
                    }
                    try {
                        m1 m1Var3 = m1.this;
                        m1Var3.T = true;
                        l2 l2Var = m1Var3.t;
                        l2Var.a.set(m1Var3.R);
                        l2Var.c = true;
                    } catch (RuntimeException e2) {
                        Logger logger = m1.e0;
                        Level level = Level.WARNING;
                        StringBuilder A = f.a.b.a.a.A("[");
                        A.append(m1.this.a);
                        A.append("] Unexpected exception from parsing service config");
                        logger.log(level, A.toString(), (Throwable) e2);
                    }
                    t1Var = t1Var2;
                }
                l.this.d();
                g.a.a aVar = this.f7854f.b;
                l lVar = l.this;
                if (lVar.a == m1.this.y) {
                    a.b b = aVar.b();
                    a.c<g.a.w> cVar = g.a.w.a;
                    if (b.a.a.containsKey(cVar)) {
                        IdentityHashMap identityHashMap = new IdentityHashMap(b.a.a);
                        identityHashMap.remove(cVar);
                        b.a = new g.a.a(identityHashMap, null);
                    }
                    IdentityHashMap<a.c<?>, Object> identityHashMap2 = b.b;
                    if (identityHashMap2 != null) {
                        identityHashMap2.remove(cVar);
                    }
                    Map<String, ?> map = t1Var.f7929f;
                    if (map != null) {
                        b.b(g.a.c0.a, map);
                        b.a();
                    }
                    k.b bVar2 = l.this.a.a;
                    g.a.a aVar2 = g.a.a.c;
                    Status a = bVar2.a(new c0.g(list, b.a(), t1Var.f7928e, null));
                    if (a.f()) {
                        return;
                    }
                    l lVar2 = l.this;
                    l.c(lVar2, a.b(l.this.b + " was used"));
                }
            }
        }

        public l(k kVar, g.a.k0 k0Var) {
            f.h.b.c.a.x(kVar, "helperImpl");
            this.a = kVar;
            f.h.b.c.a.x(k0Var, "resolver");
            this.b = k0Var;
        }

        public static void c(l lVar, Status status) {
            Objects.requireNonNull(lVar);
            m1.e0.log(Level.WARNING, "[{0}] Failed to resolve name. status={1}", new Object[]{m1.this.a, status});
            if (m1.this.S.get() == m1.k0) {
                m1.this.S.set(null);
                lVar.d();
            }
            m1 m1Var = m1.this;
            n nVar = m1Var.Q;
            n nVar2 = n.ERROR;
            if (nVar != nVar2) {
                m1Var.O.b(ChannelLogger.ChannelLogLevel.WARNING, "Failed to resolve name: {0}", status);
                m1.this.Q = nVar2;
            }
            k kVar = lVar.a;
            if (kVar != m1.this.y) {
                return;
            }
            kVar.a.b.a(status);
            m1 m1Var2 = m1.this;
            t0.c cVar = m1Var2.a0;
            if (cVar != null) {
                t0.b bVar = cVar.a;
                if ((bVar.f7568h || bVar.f7567g) ? false : true) {
                    return;
                }
            }
            if (m1Var2.b0 == null) {
                Objects.requireNonNull((j0.a) m1Var2.u);
                m1Var2.b0 = new j0();
            }
            long a2 = ((j0) m1.this.b0).a();
            m1.this.O.b(ChannelLogger.ChannelLogLevel.DEBUG, "Scheduling DNS resolution backoff for {0} ns", Long.valueOf(a2));
            m1 m1Var3 = m1.this;
            m1Var3.a0 = m1Var3.n.c(new f(), a2, TimeUnit.NANOSECONDS, m1Var3.f7837f.b0());
        }

        @Override // g.a.k0.d
        public void a(Status status) {
            f.h.b.c.a.m(!status.f(), "the error status must not be OK");
            g.a.t0 t0Var = m1.this.n;
            a aVar = new a(status);
            Queue<Runnable> queue = t0Var.f7561g;
            f.h.b.c.a.x(aVar, "runnable is null");
            queue.add(aVar);
            t0Var.a();
        }

        @Override // g.a.k0.d
        public void b(k0.e eVar) {
            g.a.t0 t0Var = m1.this.n;
            b bVar = new b(eVar);
            Queue<Runnable> queue = t0Var.f7561g;
            f.h.b.c.a.x(bVar, "runnable is null");
            queue.add(bVar);
            t0Var.a();
        }

        public final void d() {
            Collection<m.a<?, ?>> collection = m1.this.C;
            if (collection == null) {
                return;
            }
            Iterator<m.a<?, ?>> it = collection.iterator();
            if (it.hasNext()) {
                Objects.requireNonNull(it.next());
                throw null;
            }
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public class m extends g.a.c {
        public final String a;

        /* compiled from: ManagedChannelImpl.java */
        /* loaded from: classes2.dex */
        public final class a<ReqT, RespT> extends d0<ReqT, RespT> {
            @Override // g.a.v0.d0
            public void f() {
                throw null;
            }
        }

        public m(String str, a aVar) {
            f.h.b.c.a.x(str, "authority");
            this.a = str;
        }

        @Override // g.a.c
        public String a() {
            return this.a;
        }

        @Override // g.a.c
        public <ReqT, RespT> g.a.d<ReqT, RespT> h(MethodDescriptor<ReqT, RespT> methodDescriptor, g.a.b bVar) {
            return i(methodDescriptor, bVar);
        }

        public final <ReqT, RespT> g.a.d<ReqT, RespT> i(MethodDescriptor<ReqT, RespT> methodDescriptor, g.a.b bVar) {
            Executor i2 = m1.i(m1.this, bVar);
            m1 m1Var = m1.this;
            q.c cVar = m1Var.c0;
            ScheduledExecutorService b0 = m1Var.J ? null : m1.this.f7837f.b0();
            m1 m1Var2 = m1.this;
            g.a.v0.n nVar = m1Var2.M;
            m1Var2.S.get();
            g.a.v0.q qVar = new g.a.v0.q(methodDescriptor, i2, bVar, cVar, b0, nVar);
            Objects.requireNonNull(m1.this);
            qVar.p = false;
            m1 m1Var3 = m1.this;
            qVar.q = m1Var3.o;
            qVar.r = m1Var3.p;
            return qVar;
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public enum n {
        NO_RESOLUTION,
        SUCCESS,
        ERROR
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public static final class o implements ScheduledExecutorService {

        /* renamed from: f  reason: collision with root package name */
        public final ScheduledExecutorService f7860f;

        public o(ScheduledExecutorService scheduledExecutorService, a aVar) {
            f.h.b.c.a.x(scheduledExecutorService, "delegate");
            this.f7860f = scheduledExecutorService;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j2, TimeUnit timeUnit) {
            return this.f7860f.awaitTermination(j2, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f7860f.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
            return this.f7860f.invokeAll(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
            return (T) this.f7860f.invokeAny(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            return this.f7860f.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            return this.f7860f.isTerminated();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j2, TimeUnit timeUnit) {
            return this.f7860f.schedule(callable, j2, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
            return this.f7860f.scheduleAtFixedRate(runnable, j2, j3, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
            return this.f7860f.scheduleWithFixedDelay(runnable, j2, j3, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Callable<T> callable) {
            return this.f7860f.submit(callable);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) {
            return this.f7860f.invokeAll(collection, j2, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) {
            return (T) this.f7860f.invokeAny(collection, j2, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
            return this.f7860f.schedule(runnable, j2, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public Future<?> submit(Runnable runnable) {
            return this.f7860f.submit(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Runnable runnable, T t) {
            return this.f7860f.submit(runnable, t);
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public static final class p extends k0.f {
        public final int a;
        public final int b;
        public final g.a.v0.k c;

        /* renamed from: d  reason: collision with root package name */
        public final ChannelLogger f7861d;

        public p(boolean z, int i2, int i3, g.a.v0.k kVar, ChannelLogger channelLogger) {
            this.a = i2;
            this.b = i3;
            f.h.b.c.a.x(kVar, "autoLoadBalancerFactory");
            this.c = kVar;
            f.h.b.c.a.x(channelLogger, "channelLogger");
            this.f7861d = channelLogger;
        }

        @Override // g.a.k0.f
        public k0.b a(Map<String, ?> map) {
            List<m2.a> d2;
            k0.b bVar;
            try {
                g.a.v0.k kVar = this.c;
                Objects.requireNonNull(kVar);
                Object obj = null;
                if (map != null) {
                    try {
                        d2 = m2.d(m2.b(map));
                    } catch (RuntimeException e2) {
                        bVar = new k0.b(Status.f8687h.h("can't parse load balancer configuration").g(e2));
                    }
                } else {
                    d2 = null;
                }
                bVar = (d2 == null || d2.isEmpty()) ? null : m2.c(d2, kVar.a);
                if (bVar != null) {
                    Status status = bVar.a;
                    if (status != null) {
                        return new k0.b(status);
                    }
                    obj = bVar.b;
                }
                return new k0.b(t1.a(map, false, this.a, this.b, obj));
            } catch (RuntimeException e3) {
                return new k0.b(Status.f8687h.h("failed to parse service config").g(e3));
            }
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public final class q extends g.a.v0.f {
        public final c0.b a;
        public final g.a.y b;
        public final g.a.v0.o c;

        /* renamed from: d  reason: collision with root package name */
        public final g.a.v0.p f7862d;

        /* renamed from: e  reason: collision with root package name */
        public b1 f7863e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f7864f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f7865g;

        /* renamed from: h  reason: collision with root package name */
        public t0.c f7866h;

        /* compiled from: ManagedChannelImpl.java */
        /* loaded from: classes2.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                t0.c cVar;
                q qVar = q.this;
                m1.this.n.d();
                if (qVar.f7863e == null) {
                    qVar.f7865g = true;
                    return;
                }
                if (qVar.f7865g) {
                    if (!m1.this.I || (cVar = qVar.f7866h) == null) {
                        return;
                    }
                    cVar.a();
                    qVar.f7866h = null;
                } else {
                    qVar.f7865g = true;
                }
                if (!m1.this.I) {
                    qVar.f7866h = m1.this.n.c(new k1(new q1(qVar)), 5L, TimeUnit.SECONDS, m1.this.f7837f.b0());
                } else {
                    qVar.f7863e.b(m1.h0);
                }
            }
        }

        public q(c0.b bVar, k kVar) {
            f.h.b.c.a.x(bVar, "args");
            this.a = bVar;
            f.h.b.c.a.x(kVar, "helper");
            g.a.y b = g.a.y.b("Subchannel", m1.this.a());
            this.b = b;
            long a2 = m1.this.f7844m.a();
            StringBuilder A = f.a.b.a.a.A("Subchannel for ");
            A.append(bVar.a);
            g.a.v0.p pVar = new g.a.v0.p(b, 0, a2, A.toString());
            this.f7862d = pVar;
            this.c = new g.a.v0.o(pVar, m1.this.f7844m);
        }

        @Override // g.a.c0.h
        public List<g.a.r> a() {
            m1.j(m1.this, "Subchannel.getAllAddresses()");
            f.h.b.c.a.C(this.f7864f, "not started");
            return this.f7863e.f7611m;
        }

        @Override // g.a.c0.h
        public g.a.a b() {
            return this.a.b;
        }

        @Override // g.a.c0.h
        public Object c() {
            f.h.b.c.a.C(this.f7864f, "Subchannel is not started");
            return this.f7863e;
        }

        @Override // g.a.c0.h
        public void d() {
            m1.j(m1.this, "Subchannel.requestConnection()");
            f.h.b.c.a.C(this.f7864f, "not started");
            this.f7863e.a();
        }

        @Override // g.a.c0.h
        public void e() {
            m1.j(m1.this, "Subchannel.shutdown()");
            g.a.t0 t0Var = m1.this.n;
            a aVar = new a();
            Queue<Runnable> queue = t0Var.f7561g;
            f.h.b.c.a.x(aVar, "runnable is null");
            queue.add(aVar);
            t0Var.a();
        }

        @Override // g.a.c0.h
        public void f(c0.j jVar) {
            m1.this.n.d();
            f.h.b.c.a.C(!this.f7864f, "already started");
            f.h.b.c.a.C(!this.f7865g, "already shutdown");
            this.f7864f = true;
            if (m1.this.I) {
                g.a.t0 t0Var = m1.this.n;
                o1 o1Var = new o1(this, jVar);
                Queue<Runnable> queue = t0Var.f7561g;
                f.h.b.c.a.x(o1Var, "runnable is null");
                queue.add(o1Var);
                t0Var.a();
                return;
            }
            List<g.a.r> list = this.a.a;
            String a2 = m1.this.a();
            Objects.requireNonNull(m1.this);
            m1 m1Var = m1.this;
            l.a aVar = m1Var.u;
            x xVar = m1Var.f7837f;
            ScheduledExecutorService b0 = xVar.b0();
            m1 m1Var2 = m1.this;
            b1 b1Var = new b1(list, a2, null, aVar, xVar, b0, m1Var2.q, m1Var2.n, new p1(this, jVar), m1Var2.P, m1Var2.L.a(), this.f7862d, this.b, this.c);
            m1 m1Var3 = m1.this;
            g.a.v0.p pVar = m1Var3.N;
            InternalChannelz$ChannelTrace$Event.Severity severity = InternalChannelz$ChannelTrace$Event.Severity.CT_INFO;
            Long valueOf = Long.valueOf(m1Var3.f7844m.a());
            f.h.b.c.a.x("Child Subchannel started", "description");
            f.h.b.c.a.x(severity, "severity");
            f.h.b.c.a.x(valueOf, "timestampNanos");
            f.h.b.c.a.C(true, "at least one of channelRef and subchannelRef must be null");
            pVar.b(new InternalChannelz$ChannelTrace$Event("Child Subchannel started", severity, valueOf.longValue(), null, b1Var, null));
            this.f7863e = b1Var;
            g.a.t0 t0Var2 = m1.this.n;
            r1 r1Var = new r1(this, b1Var);
            Queue<Runnable> queue2 = t0Var2.f7561g;
            f.h.b.c.a.x(r1Var, "runnable is null");
            queue2.add(r1Var);
            t0Var2.a();
        }

        @Override // g.a.c0.h
        public void g(List<g.a.r> list) {
            m1.this.n.d();
            b1 b1Var = this.f7863e;
            Objects.requireNonNull(b1Var);
            f.h.b.c.a.x(list, "newAddressGroups");
            for (g.a.r rVar : list) {
                f.h.b.c.a.x(rVar, "newAddressGroups contains null entry");
            }
            f.h.b.c.a.m(!list.isEmpty(), "newAddressGroups is empty");
            g.a.t0 t0Var = b1Var.f7609k;
            d1 d1Var = new d1(b1Var, list);
            Queue<Runnable> queue = t0Var.f7561g;
            f.h.b.c.a.x(d1Var, "runnable is null");
            queue.add(d1Var);
            t0Var.a();
        }

        public String toString() {
            return this.b.toString();
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* loaded from: classes2.dex */
    public final class r {
        public final Object a = new Object();
        public Collection<v> b = new HashSet();

        public r(a aVar) {
        }
    }

    static {
        Status status = Status.n;
        g0 = status.h("Channel shutdownNow invoked");
        h0 = status.h("Channel shutdown invoked");
        i0 = status.h("Subchannel shutdown invoked");
        j0 = new t1(null, new HashMap(), new HashMap(), null, null, null);
        k0 = new a();
    }

    public m1(g.a.v0.b<?> bVar, x xVar, l.a aVar, y1<? extends Executor> y1Var, f.h.c.a.p<f.h.c.a.o> pVar, List<g.a.e> list, u2 u2Var) {
        g.a.t0 t0Var = new g.a.t0(new c());
        this.n = t0Var;
        this.s = new a0();
        this.B = new HashSet(16, 0.75f);
        this.D = new Object();
        this.E = new HashSet(1, 0.75f);
        this.G = new r(null);
        this.H = new AtomicBoolean(false);
        this.K = new CountDownLatch(1);
        this.Q = n.NO_RESOLUTION;
        this.R = j0;
        this.S = new AtomicReference<>(k0);
        this.T = false;
        this.V = new h2.r();
        g gVar = new g(null);
        this.Y = gVar;
        this.Z = new i(null);
        this.c0 = new e(null);
        String str = bVar.f7593f;
        f.h.b.c.a.x(str, "target");
        this.b = str;
        g.a.y b2 = g.a.y.b("Channel", str);
        this.a = b2;
        f.h.b.c.a.x(u2Var, "timeProvider");
        this.f7844m = u2Var;
        y1<? extends Executor> y1Var2 = bVar.a;
        f.h.b.c.a.x(y1Var2, "executorPool");
        this.f7840i = y1Var2;
        Executor a2 = y1Var2.a();
        f.h.b.c.a.x(a2, "executor");
        Executor executor = a2;
        this.f7839h = executor;
        g.a.v0.m mVar = new g.a.v0.m(xVar, executor);
        this.f7837f = mVar;
        o oVar = new o(mVar.b0(), null);
        this.f7838g = oVar;
        g.a.v0.p pVar2 = new g.a.v0.p(b2, 0, ((u2.a) u2Var).a(), f.a.b.a.a.q("Channel for '", str, "'"));
        this.N = pVar2;
        g.a.v0.o oVar2 = new g.a.v0.o(pVar2, u2Var);
        this.O = oVar2;
        k0.c cVar = bVar.f7592e;
        this.c = cVar;
        g.a.p0 p0Var = GrpcUtil.f8706k;
        g.a.v0.k kVar = new g.a.v0.k(bVar.f7594g);
        this.f7836e = kVar;
        y1<? extends Executor> y1Var3 = bVar.b;
        f.h.b.c.a.x(y1Var3, "offloadExecutorPool");
        this.f7843l = new h(y1Var3);
        p pVar3 = new p(false, bVar.f7598k, bVar.f7599l, kVar, oVar2);
        Integer valueOf = Integer.valueOf(bVar.b());
        Objects.requireNonNull(p0Var);
        k0.a aVar2 = new k0.a(valueOf, p0Var, t0Var, pVar3, oVar, oVar2, new d(), null);
        this.f7835d = aVar2;
        this.w = m(str, cVar, aVar2);
        f.h.b.c.a.x(y1Var, "balancerRpcExecutorPool");
        this.f7841j = y1Var;
        this.f7842k = new h(y1Var);
        f0 f0Var = new f0(executor, t0Var);
        this.F = f0Var;
        f0Var.d(gVar);
        this.u = aVar;
        l2 l2Var = new l2(false);
        this.t = l2Var;
        boolean z = bVar.q;
        this.U = z;
        this.v = g.a.g.a(g.a.g.a(new m(this.w.a(), null), Arrays.asList(l2Var)), list);
        f.h.b.c.a.x(pVar, "stopwatchSupplier");
        this.q = pVar;
        long j2 = bVar.f7597j;
        if (j2 == -1) {
            this.r = j2;
        } else {
            f.h.b.c.a.p(j2 >= g.a.v0.b.z, "invalid idleTimeoutMillis %s", j2);
            this.r = bVar.f7597j;
        }
        this.d0 = new g2(new j(null), t0Var, mVar.b0(), pVar.get());
        g.a.p pVar4 = bVar.f7595h;
        f.h.b.c.a.x(pVar4, "decompressorRegistry");
        this.o = pVar4;
        g.a.k kVar2 = bVar.f7596i;
        f.h.b.c.a.x(kVar2, "compressorRegistry");
        this.p = kVar2;
        this.X = bVar.f7600m;
        this.W = bVar.n;
        b bVar2 = new b(this, u2Var);
        this.L = bVar2;
        this.M = bVar2.a();
        g.a.v vVar = bVar.p;
        Objects.requireNonNull(vVar);
        this.P = vVar;
        g.a.v.a(vVar.a, this);
        if (z) {
            return;
        }
        this.T = true;
        l2Var.a.set(this.R);
        l2Var.c = true;
    }

    public static Executor i(m1 m1Var, g.a.b bVar) {
        Objects.requireNonNull(m1Var);
        Executor executor = bVar.b;
        return executor == null ? m1Var.f7839h : executor;
    }

    public static void j(m1 m1Var, String str) {
        Objects.requireNonNull(m1Var);
        try {
            m1Var.n.d();
        } catch (IllegalStateException e2) {
            Logger logger = e0;
            Level level = Level.WARNING;
            logger.log(level, str + " should be called from SynchronizationContext. This warning will become an exception in a future release. See https://github.com/grpc/grpc-java/issues/5015 for more details", (Throwable) e2);
        }
    }

    public static void k(m1 m1Var) {
        if (!m1Var.J && m1Var.H.get() && m1Var.B.isEmpty() && m1Var.E.isEmpty()) {
            m1Var.O.a(ChannelLogger.ChannelLogLevel.INFO, "Terminated");
            g.a.v.b(m1Var.P.a, m1Var);
            m1Var.f7840i.b(m1Var.f7839h);
            m1Var.f7842k.a();
            m1Var.f7843l.a();
            m1Var.f7837f.close();
            m1Var.J = true;
            m1Var.K.countDown();
        }
    }

    public static g.a.k0 m(String str, k0.c cVar, k0.a aVar) {
        URI uri;
        g.a.k0 b2;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e2) {
            sb.append(e2.getMessage());
            uri = null;
        }
        if (uri == null || (b2 = cVar.b(uri, aVar)) == null) {
            String str2 = "";
            if (!f0.matcher(str).matches()) {
                try {
                    g.a.k0 b3 = cVar.b(new URI(cVar.a(), "", "/" + str, null), aVar);
                    if (b3 != null) {
                        return b3;
                    }
                } catch (URISyntaxException e3) {
                    throw new IllegalArgumentException(e3);
                }
            }
            Object[] objArr = new Object[2];
            objArr[0] = str;
            if (sb.length() > 0) {
                str2 = " (" + ((Object) sb) + ")";
            }
            objArr[1] = str2;
            throw new IllegalArgumentException(String.format("cannot find a NameResolver for %s%s", objArr));
        }
        return b2;
    }

    @Override // g.a.c
    public String a() {
        return this.v.a();
    }

    @Override // g.a.x
    public g.a.y e() {
        return this.a;
    }

    @Override // g.a.c
    public <ReqT, RespT> g.a.d<ReqT, RespT> h(MethodDescriptor<ReqT, RespT> methodDescriptor, g.a.b bVar) {
        return this.v.h(methodDescriptor, bVar);
    }

    public void l() {
        this.n.d();
        if (this.H.get() || this.A) {
            return;
        }
        if (!this.Z.a.isEmpty()) {
            this.d0.f7741f = false;
        } else {
            n();
        }
        if (this.y != null) {
            return;
        }
        this.O.a(ChannelLogger.ChannelLogLevel.INFO, "Exiting idle mode");
        k kVar = new k(null);
        g.a.v0.k kVar2 = this.f7836e;
        Objects.requireNonNull(kVar2);
        kVar.a = new k.b(kVar);
        this.y = kVar;
        this.w.d(new l(kVar, this.w));
        this.x = true;
    }

    public final void n() {
        long j2 = this.r;
        if (j2 == -1) {
            return;
        }
        g2 g2Var = this.d0;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Objects.requireNonNull(g2Var);
        long nanos = timeUnit.toNanos(j2);
        f.h.c.a.o oVar = g2Var.f7739d;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long a2 = oVar.a(timeUnit2) + nanos;
        g2Var.f7741f = true;
        if (a2 - g2Var.f7740e < 0 || g2Var.f7742g == null) {
            ScheduledFuture<?> scheduledFuture = g2Var.f7742g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            g2Var.f7742g = g2Var.a.schedule(new g2.c(null), nanos, timeUnit2);
        }
        g2Var.f7740e = a2;
    }

    public final void o(boolean z) {
        this.n.d();
        if (z) {
            f.h.b.c.a.C(this.x, "nameResolver is not started");
            f.h.b.c.a.C(this.y != null, "lbHelper is null");
        }
        if (this.w != null) {
            this.n.d();
            t0.c cVar = this.a0;
            if (cVar != null) {
                cVar.a();
                this.a0 = null;
                this.b0 = null;
            }
            this.w.c();
            this.x = false;
            if (z) {
                this.w = m(this.b, this.c, this.f7835d);
            } else {
                this.w = null;
            }
        }
        k kVar = this.y;
        if (kVar != null) {
            k.b bVar = kVar.a;
            bVar.b.c();
            bVar.b = null;
            this.y = null;
        }
        this.z = null;
    }

    public String toString() {
        f.h.c.a.i c1 = f.h.b.c.a.c1(this);
        c1.b("logId", this.a.c);
        c1.c("target", this.b);
        return c1.toString();
    }
}
