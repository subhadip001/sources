package g.a.v0;

import com.google.firebase.analytics.FirebaseAnalytics;
import g.a.d;
import g.a.i;
import g.a.i0;
import g.a.v0.m1;
import g.a.v0.t2;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.internal.ClientStreamListener;
import io.grpc.internal.GrpcUtil;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: ClientCallImpl.java */
/* loaded from: classes2.dex */
public final class q<ReqT, RespT> extends g.a.d<ReqT, RespT> {
    public static final Logger v = Logger.getLogger(q.class.getName());
    public static final byte[] w = "gzip".getBytes(Charset.forName("US-ASCII"));
    public static final long x = TimeUnit.SECONDS.toNanos(1);
    public final MethodDescriptor<ReqT, RespT> a;
    public final g.b.d b;
    public final Executor c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f7880d;

    /* renamed from: e  reason: collision with root package name */
    public final n f7881e;

    /* renamed from: f  reason: collision with root package name */
    public final g.a.m f7882f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f7883g;

    /* renamed from: h  reason: collision with root package name */
    public final g.a.b f7884h;

    /* renamed from: i  reason: collision with root package name */
    public v f7885i;

    /* renamed from: j  reason: collision with root package name */
    public volatile boolean f7886j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7887k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f7888l;

    /* renamed from: m  reason: collision with root package name */
    public final c f7889m;
    public q<ReqT, RespT>.d n;
    public final ScheduledExecutorService o;
    public boolean p;
    public volatile ScheduledFuture<?> s;
    public volatile ScheduledFuture<?> t;
    public g.a.p q = g.a.p.f7557d;
    public g.a.k r = g.a.k.b;
    public boolean u = false;

    /* compiled from: ClientCallImpl.java */
    /* loaded from: classes2.dex */
    public class b implements ClientStreamListener {
        public final d.a<RespT> a;
        public Status b;

        /* compiled from: ClientCallImpl.java */
        /* loaded from: classes2.dex */
        public final class a extends b0 {

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ g.a.i0 f7890g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g.b.b bVar, g.a.i0 i0Var) {
                super(q.this.f7882f);
                this.f7890g = i0Var;
            }

            @Override // g.a.v0.b0
            public void a() {
                g.b.d dVar = q.this.b;
                g.b.a aVar = g.b.c.a;
                Objects.requireNonNull(aVar);
                Objects.requireNonNull(aVar);
                try {
                    b bVar = b.this;
                    if (bVar.b == null) {
                        bVar.a.b(this.f7890g);
                    }
                } finally {
                    g.b.d dVar2 = q.this.b;
                    Objects.requireNonNull(g.b.c.a);
                }
            }
        }

        /* compiled from: ClientCallImpl.java */
        /* renamed from: g.a.v0.q$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public final class C0198b extends b0 {

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ t2.a f7892g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0198b(g.b.b bVar, t2.a aVar) {
                super(q.this.f7882f);
                this.f7892g = aVar;
            }

            @Override // g.a.v0.b0
            public void a() {
                g.b.d dVar = q.this.b;
                g.b.a aVar = g.b.c.a;
                Objects.requireNonNull(aVar);
                Objects.requireNonNull(aVar);
                try {
                    b();
                    g.b.d dVar2 = q.this.b;
                    Objects.requireNonNull(aVar);
                } catch (Throwable th) {
                    g.b.d dVar3 = q.this.b;
                    Objects.requireNonNull(g.b.c.a);
                    throw th;
                }
            }

            public final void b() {
                if (b.this.b != null) {
                    t2.a aVar = this.f7892g;
                    Logger logger = GrpcUtil.a;
                    while (true) {
                        InputStream next = aVar.next();
                        if (next == null) {
                            return;
                        }
                        GrpcUtil.b(next);
                    }
                } else {
                    while (true) {
                        try {
                            InputStream next2 = this.f7892g.next();
                            if (next2 == null) {
                                return;
                            }
                            b bVar = b.this;
                            bVar.a.c(q.this.a.f8678e.a(next2));
                            next2.close();
                        } catch (Throwable th) {
                            t2.a aVar2 = this.f7892g;
                            Logger logger2 = GrpcUtil.a;
                            while (true) {
                                InputStream next3 = aVar2.next();
                                if (next3 != null) {
                                    GrpcUtil.b(next3);
                                } else {
                                    b.f(b.this, Status.f8686g.g(th).h("Failed to read message."));
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }

        /* compiled from: ClientCallImpl.java */
        /* loaded from: classes2.dex */
        public final class c extends b0 {
            public c(g.b.b bVar) {
                super(q.this.f7882f);
            }

            @Override // g.a.v0.b0
            public void a() {
                g.b.d dVar = q.this.b;
                g.b.a aVar = g.b.c.a;
                Objects.requireNonNull(aVar);
                Objects.requireNonNull(aVar);
                try {
                    b bVar = b.this;
                    if (bVar.b == null) {
                        bVar.a.d();
                    }
                } finally {
                    g.b.d dVar2 = q.this.b;
                    Objects.requireNonNull(g.b.c.a);
                }
            }
        }

        public b(d.a<RespT> aVar) {
            f.h.b.c.a.x(aVar, "observer");
            this.a = aVar;
        }

        public static void f(b bVar, Status status) {
            bVar.b = status;
            q.this.f7885i.j(status);
        }

        @Override // g.a.v0.t2
        public void a(t2.a aVar) {
            g.b.d dVar = q.this.b;
            g.b.a aVar2 = g.b.c.a;
            Objects.requireNonNull(aVar2);
            g.b.c.a();
            try {
                q.this.c.execute(new C0198b(g.b.a.b, aVar));
                g.b.d dVar2 = q.this.b;
                Objects.requireNonNull(aVar2);
            } catch (Throwable th) {
                g.b.d dVar3 = q.this.b;
                Objects.requireNonNull(g.b.c.a);
                throw th;
            }
        }

        @Override // g.a.v0.t2
        public void b() {
            if (q.this.a.a.clientSendsOneMessage()) {
                return;
            }
            g.b.d dVar = q.this.b;
            Objects.requireNonNull(g.b.c.a);
            g.b.c.a();
            try {
                q.this.c.execute(new c(g.b.a.b));
                g.b.d dVar2 = q.this.b;
            } catch (Throwable th) {
                g.b.d dVar3 = q.this.b;
                Objects.requireNonNull(g.b.c.a);
                throw th;
            }
        }

        @Override // io.grpc.internal.ClientStreamListener
        public void c(Status status, g.a.i0 i0Var) {
            e(status, ClientStreamListener.RpcProgress.PROCESSED, i0Var);
        }

        @Override // io.grpc.internal.ClientStreamListener
        public void d(g.a.i0 i0Var) {
            g.b.d dVar = q.this.b;
            g.b.a aVar = g.b.c.a;
            Objects.requireNonNull(aVar);
            g.b.c.a();
            try {
                q.this.c.execute(new a(g.b.a.b, i0Var));
                g.b.d dVar2 = q.this.b;
                Objects.requireNonNull(aVar);
            } catch (Throwable th) {
                g.b.d dVar3 = q.this.b;
                Objects.requireNonNull(g.b.c.a);
                throw th;
            }
        }

        @Override // io.grpc.internal.ClientStreamListener
        public void e(Status status, ClientStreamListener.RpcProgress rpcProgress, g.a.i0 i0Var) {
            g.b.d dVar = q.this.b;
            g.b.a aVar = g.b.c.a;
            Objects.requireNonNull(aVar);
            try {
                g(status, i0Var);
                g.b.d dVar2 = q.this.b;
                Objects.requireNonNull(aVar);
            } catch (Throwable th) {
                g.b.d dVar3 = q.this.b;
                Objects.requireNonNull(g.b.c.a);
                throw th;
            }
        }

        public final void g(Status status, g.a.i0 i0Var) {
            q qVar = q.this;
            g.a.n nVar = qVar.f7884h.a;
            Objects.requireNonNull(qVar.f7882f);
            if (nVar == null) {
                nVar = null;
            }
            if (status.a == Status.Code.CANCELLED && nVar != null && nVar.f()) {
                a1 a1Var = new a1();
                q.this.f7885i.l(a1Var);
                status = Status.f8688i.b("ClientCall was cancelled at or after deadline. " + a1Var);
                i0Var = new g.a.i0();
            }
            g.b.c.a();
            q.this.c.execute(new u(this, g.b.a.b, status, i0Var));
        }
    }

    /* compiled from: ClientCallImpl.java */
    /* loaded from: classes2.dex */
    public interface c {
    }

    /* compiled from: ClientCallImpl.java */
    /* loaded from: classes2.dex */
    public final class d {
        public d.a<RespT> a;

        public d(d.a aVar, a aVar2) {
            this.a = aVar;
        }
    }

    public q(MethodDescriptor methodDescriptor, Executor executor, g.a.b bVar, c cVar, ScheduledExecutorService scheduledExecutorService, n nVar) {
        boolean z = false;
        this.a = methodDescriptor;
        String str = methodDescriptor.b;
        System.identityHashCode(this);
        Objects.requireNonNull(g.b.c.a);
        this.b = g.b.a.a;
        if (executor == f.h.c.g.a.b.INSTANCE) {
            this.c = new j2();
            this.f7880d = true;
        } else {
            this.c = new k2(executor);
            this.f7880d = false;
        }
        this.f7881e = nVar;
        this.f7882f = g.a.m.c();
        MethodDescriptor.MethodType methodType = methodDescriptor.a;
        this.f7883g = (methodType == MethodDescriptor.MethodType.UNARY || methodType == MethodDescriptor.MethodType.SERVER_STREAMING) ? true : true;
        this.f7884h = bVar;
        this.f7889m = cVar;
        this.o = scheduledExecutorService;
    }

    public static void f(q qVar, Status status, d.a aVar) {
        if (qVar.t != null) {
            return;
        }
        qVar.t = qVar.o.schedule(new k1(new t(qVar, status)), x, TimeUnit.NANOSECONDS);
        qVar.c.execute(new r(qVar, aVar, status));
    }

    @Override // g.a.d
    public void a(String str, Throwable th) {
        g.b.a aVar = g.b.c.a;
        Objects.requireNonNull(aVar);
        try {
            g(str, th);
            Objects.requireNonNull(aVar);
        } catch (Throwable th2) {
            Objects.requireNonNull(g.b.c.a);
            throw th2;
        }
    }

    @Override // g.a.d
    public void b() {
        g.b.a aVar = g.b.c.a;
        Objects.requireNonNull(aVar);
        try {
            f.h.b.c.a.C(this.f7885i != null, "Not started");
            f.h.b.c.a.C(!this.f7887k, "call was cancelled");
            f.h.b.c.a.C(!this.f7888l, "call already half-closed");
            this.f7888l = true;
            this.f7885i.m();
            Objects.requireNonNull(aVar);
        } catch (Throwable th) {
            Objects.requireNonNull(g.b.c.a);
            throw th;
        }
    }

    @Override // g.a.d
    public void c(int i2) {
        g.b.a aVar = g.b.c.a;
        Objects.requireNonNull(aVar);
        try {
            boolean z = true;
            f.h.b.c.a.C(this.f7885i != null, "Not started");
            if (i2 < 0) {
                z = false;
            }
            f.h.b.c.a.m(z, "Number requested must be non-negative");
            this.f7885i.f(i2);
            Objects.requireNonNull(aVar);
        } catch (Throwable th) {
            Objects.requireNonNull(g.b.c.a);
            throw th;
        }
    }

    @Override // g.a.d
    public void d(ReqT reqt) {
        g.b.a aVar = g.b.c.a;
        Objects.requireNonNull(aVar);
        try {
            i(reqt);
            Objects.requireNonNull(aVar);
        } catch (Throwable th) {
            Objects.requireNonNull(g.b.c.a);
            throw th;
        }
    }

    @Override // g.a.d
    public void e(d.a<RespT> aVar, g.a.i0 i0Var) {
        g.b.a aVar2 = g.b.c.a;
        Objects.requireNonNull(aVar2);
        try {
            j(aVar, i0Var);
            Objects.requireNonNull(aVar2);
        } catch (Throwable th) {
            Objects.requireNonNull(g.b.c.a);
            throw th;
        }
    }

    public final void g(String str, Throwable th) {
        Status h2;
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            v.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.f7887k) {
            return;
        }
        this.f7887k = true;
        try {
            if (this.f7885i != null) {
                Status status = Status.f8686g;
                if (str != null) {
                    h2 = status.h(str);
                } else {
                    h2 = status.h("Call cancelled without message");
                }
                if (th != null) {
                    h2 = h2.g(th);
                }
                this.f7885i.j(h2);
            }
        } finally {
            h();
        }
    }

    public final void h() {
        Objects.requireNonNull(this.f7882f);
        ScheduledFuture<?> scheduledFuture = this.t;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        ScheduledFuture<?> scheduledFuture2 = this.s;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
        }
    }

    public final void i(ReqT reqt) {
        f.h.b.c.a.C(this.f7885i != null, "Not started");
        f.h.b.c.a.C(!this.f7887k, "call was cancelled");
        f.h.b.c.a.C(!this.f7888l, "call was half-closed");
        try {
            v vVar = this.f7885i;
            if (vVar instanceof h2) {
                ((h2) vVar).z(reqt);
            } else {
                vVar.b(this.a.f8677d.b(reqt));
            }
            if (this.f7883g) {
                return;
            }
            this.f7885i.flush();
        } catch (Error e2) {
            this.f7885i.j(Status.f8686g.h("Client sendMessage() failed with Error"));
            throw e2;
        } catch (RuntimeException e3) {
            this.f7885i.j(Status.f8686g.g(e3).h("Failed to stream message"));
        }
    }

    public final void j(d.a<RespT> aVar, g.a.i0 i0Var) {
        g.a.j jVar;
        f.h.b.c.a.C(this.f7885i == null, "Already started");
        f.h.b.c.a.C(!this.f7887k, "call was cancelled");
        f.h.b.c.a.x(aVar, "observer");
        f.h.b.c.a.x(i0Var, "headers");
        Objects.requireNonNull(this.f7882f);
        String str = this.f7884h.f7527d;
        if (str != null) {
            jVar = this.r.a.get(str);
            if (jVar == null) {
                this.f7885i = x1.a;
                this.c.execute(new r(this, aVar, Status.f8692m.h(String.format("Unable to find compressor by name %s", str))));
                return;
            }
        } else {
            jVar = i.b.a;
        }
        g.a.p pVar = this.q;
        boolean z = this.p;
        i0.f<String> fVar = GrpcUtil.c;
        i0Var.b(fVar);
        if (jVar != i.b.a) {
            i0Var.h(fVar, jVar.a());
        }
        i0.f<byte[]> fVar2 = GrpcUtil.f8699d;
        i0Var.b(fVar2);
        byte[] bArr = pVar.b;
        if (bArr.length != 0) {
            i0Var.h(fVar2, bArr);
        }
        i0Var.b(GrpcUtil.f8700e);
        i0.f<byte[]> fVar3 = GrpcUtil.f8701f;
        i0Var.b(fVar3);
        if (z) {
            i0Var.h(fVar3, w);
        }
        g.a.n nVar = this.f7884h.a;
        Objects.requireNonNull(this.f7882f);
        if (nVar == null) {
            nVar = null;
        }
        if (!(nVar != null && nVar.f())) {
            Objects.requireNonNull(this.f7882f);
            g.a.n nVar2 = this.f7884h.a;
            Logger logger = v;
            if (logger.isLoggable(Level.FINE) && nVar != null && nVar.equals(null)) {
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                StringBuilder sb = new StringBuilder(String.format("Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(Math.max(0L, nVar.g(timeUnit)))));
                if (nVar2 == null) {
                    sb.append(" Explicit call timeout was not set.");
                } else {
                    sb.append(String.format(" Explicit call timeout was '%d' ns.", Long.valueOf(nVar2.g(timeUnit))));
                }
                logger.fine(sb.toString());
            }
            c cVar = this.f7889m;
            MethodDescriptor<ReqT, RespT> methodDescriptor = this.a;
            g.a.b bVar = this.f7884h;
            g.a.m mVar = this.f7882f;
            m1.e eVar = (m1.e) cVar;
            Objects.requireNonNull(m1.this);
            w a2 = eVar.a(new b2(methodDescriptor, i0Var, bVar));
            g.a.m a3 = mVar.a();
            try {
                v g2 = a2.g(methodDescriptor, i0Var, bVar);
                mVar.d(a3);
                this.f7885i = g2;
            } catch (Throwable th) {
                mVar.d(a3);
                throw th;
            }
        } else {
            this.f7885i = new k0(Status.f8688i.h("ClientCall started after deadline exceeded: " + nVar));
        }
        if (this.f7880d) {
            this.f7885i.c();
        }
        String str2 = this.f7884h.c;
        if (str2 != null) {
            this.f7885i.k(str2);
        }
        Integer num = this.f7884h.f7531h;
        if (num != null) {
            this.f7885i.g(num.intValue());
        }
        Integer num2 = this.f7884h.f7532i;
        if (num2 != null) {
            this.f7885i.h(num2.intValue());
        }
        if (nVar != null) {
            this.f7885i.n(nVar);
        }
        this.f7885i.a(jVar);
        boolean z2 = this.p;
        if (z2) {
            this.f7885i.p(z2);
        }
        this.f7885i.i(this.q);
        n nVar3 = this.f7881e;
        nVar3.b.add(1L);
        nVar3.a.a();
        this.n = new d(aVar, null);
        this.f7885i.o(new b(aVar));
        g.a.m mVar2 = this.f7882f;
        q<ReqT, RespT>.d dVar = this.n;
        Objects.requireNonNull(mVar2);
        g.a.m.b(dVar, "cancellationListener");
        if (nVar != null) {
            Objects.requireNonNull(this.f7882f);
            if (!nVar.equals(null) && this.o != null && !(this.f7885i instanceof k0)) {
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                long g3 = nVar.g(timeUnit2);
                this.s = this.o.schedule(new k1(new s(this, g3, aVar)), g3, timeUnit2);
            }
        }
        if (this.f7886j) {
            h();
        }
    }

    public String toString() {
        f.h.c.a.i c1 = f.h.b.c.a.c1(this);
        c1.c(FirebaseAnalytics.Param.METHOD, this.a);
        return c1.toString();
    }
}
