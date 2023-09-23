package g.a.y0;

import f.h.c.a.i;
import f.h.c.g.a.a;
import g.a.b;
import g.a.d;
import g.a.i0;
import io.grpc.Status;
import io.grpc.StatusException;
import io.grpc.StatusRuntimeException;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: ClientCalls.java */
/* loaded from: classes2.dex */
public final class c {
    public static final Logger a = Logger.getLogger(c.class.getName());
    public static boolean b;
    public static final b.a<d> c;

    /* compiled from: ClientCalls.java */
    /* loaded from: classes2.dex */
    public static final class b<RespT> extends f.h.c.g.a.a<RespT> {

        /* renamed from: m  reason: collision with root package name */
        public final g.a.d<?, RespT> f8115m;

        public b(g.a.d<?, RespT> dVar) {
            this.f8115m = dVar;
        }

        @Override // f.h.c.g.a.a
        public void n() {
            this.f8115m.a("GrpcFuture was cancelled", null);
        }

        @Override // f.h.c.g.a.a
        public String o() {
            i c1 = f.h.b.c.a.c1(this);
            c1.c("clientCall", this.f8115m);
            return c1.toString();
        }

        public boolean q(Throwable th) {
            if (f.h.c.g.a.a.f6013k.b(this, null, new a.d(th))) {
                f.h.c.g.a.a.j(this);
                return true;
            }
            return false;
        }
    }

    /* compiled from: ClientCalls.java */
    /* renamed from: g.a.y0.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0202c<T> extends d.a<T> {
        public AbstractC0202c(a aVar) {
        }
    }

    /* compiled from: ClientCalls.java */
    /* loaded from: classes2.dex */
    public enum d {
        BLOCKING,
        FUTURE,
        ASYNC
    }

    /* compiled from: ClientCalls.java */
    /* loaded from: classes2.dex */
    public static final class e extends ConcurrentLinkedQueue<Runnable> implements Executor {

        /* renamed from: g  reason: collision with root package name */
        public static final Logger f8120g = Logger.getLogger(e.class.getName());

        /* renamed from: h  reason: collision with root package name */
        public static final Object f8121h = new Object();

        /* renamed from: f  reason: collision with root package name */
        public volatile Object f8122f;

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
            throw new java.lang.InterruptedException();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a() {
            /*
                r4 = this;
                boolean r0 = java.lang.Thread.interrupted()
                if (r0 != 0) goto L4c
                java.lang.Object r0 = r4.poll()
                java.lang.Runnable r0 = (java.lang.Runnable) r0
                if (r0 != 0) goto L35
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r4.f8122f = r0
            L14:
                r0 = 0
                java.lang.Object r1 = r4.poll()     // Catch: java.lang.Throwable -> L31
                java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.Throwable -> L31
                if (r1 != 0) goto L2d
                java.util.concurrent.locks.LockSupport.park(r4)     // Catch: java.lang.Throwable -> L31
                boolean r1 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L31
                if (r1 != 0) goto L27
                goto L14
            L27:
                java.lang.InterruptedException r1 = new java.lang.InterruptedException     // Catch: java.lang.Throwable -> L31
                r1.<init>()     // Catch: java.lang.Throwable -> L31
                throw r1     // Catch: java.lang.Throwable -> L31
            L2d:
                r4.f8122f = r0
                r0 = r1
                goto L35
            L31:
                r1 = move-exception
                r4.f8122f = r0
                throw r1
            L35:
                r0.run()     // Catch: java.lang.Throwable -> L39
                goto L43
            L39:
                r0 = move-exception
                java.util.logging.Logger r1 = g.a.y0.c.e.f8120g
                java.util.logging.Level r2 = java.util.logging.Level.WARNING
                java.lang.String r3 = "Runnable threw exception"
                r1.log(r2, r3, r0)
            L43:
                java.lang.Object r0 = r4.poll()
                java.lang.Runnable r0 = (java.lang.Runnable) r0
                if (r0 != 0) goto L35
                return
            L4c:
                java.lang.InterruptedException r0 = new java.lang.InterruptedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: g.a.y0.c.e.a():void");
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            add(runnable);
            Object obj = this.f8122f;
            if (obj != f8121h) {
                LockSupport.unpark((Thread) obj);
            } else if (remove(runnable) && c.b) {
                throw new RejectedExecutionException();
            }
        }

        public void shutdown() {
            this.f8122f = f8121h;
            while (true) {
                Runnable poll = poll();
                if (poll == null) {
                    return;
                }
                try {
                    poll.run();
                } catch (Throwable th) {
                    f8120g.log(Level.WARNING, "Runnable threw exception", th);
                }
            }
        }
    }

    /* compiled from: ClientCalls.java */
    /* loaded from: classes2.dex */
    public static final class f<RespT> extends AbstractC0202c<RespT> {
        public final b<RespT> a;
        public RespT b;

        public f(b<RespT> bVar) {
            super(null);
            this.a = bVar;
        }

        @Override // g.a.d.a
        public void a(Status status, i0 i0Var) {
            if (status.f()) {
                if (this.b == null) {
                    this.a.q(new StatusRuntimeException(Status.f8692m.h("No value received for unary call"), i0Var));
                }
                b<RespT> bVar = this.a;
                Object obj = this.b;
                Objects.requireNonNull(bVar);
                if (obj == null) {
                    obj = f.h.c.g.a.a.f6014l;
                }
                if (f.h.c.g.a.a.f6013k.b(bVar, null, obj)) {
                    f.h.c.g.a.a.j(bVar);
                    return;
                }
                return;
            }
            this.a.q(new StatusRuntimeException(status, i0Var));
        }

        @Override // g.a.d.a
        public void b(i0 i0Var) {
        }

        @Override // g.a.d.a
        public void c(RespT respt) {
            if (this.b == null) {
                this.b = respt;
                return;
            }
            throw Status.f8692m.h("More than one value received for unary call").a();
        }
    }

    static {
        b = !f.h.b.c.a.B0(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        c = b.a.a("internal-stub-type");
    }

    public static RuntimeException a(g.a.d<?, ?> dVar, Throwable th) {
        try {
            dVar.a(null, th);
        } catch (Throwable th2) {
            a.log(Level.SEVERE, "RuntimeException encountered while closing call", th2);
        }
        if (!(th instanceof RuntimeException)) {
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new AssertionError(th);
        }
        throw ((RuntimeException) th);
    }

    public static <ReqT, RespT> f.h.c.g.a.c<RespT> b(g.a.d<ReqT, RespT> dVar, ReqT reqt) {
        b bVar = new b(dVar);
        f fVar = new f(bVar);
        dVar.e(fVar, new i0());
        fVar.a.f8115m.c(2);
        try {
            dVar.d(reqt);
            dVar.b();
            return bVar;
        } catch (Error e2) {
            a(dVar, e2);
            throw null;
        } catch (RuntimeException e3) {
            a(dVar, e3);
            throw null;
        }
    }

    public static <V> V c(Future<V> future) {
        try {
            return (V) ((f.h.c.g.a.a) future).get();
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            throw Status.f8686g.h("Thread interrupted").g(e2).a();
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            f.h.b.c.a.x(cause, "t");
            for (Throwable th = cause; th != null; th = th.getCause()) {
                if (!(th instanceof StatusException)) {
                    if (th instanceof StatusRuntimeException) {
                        StatusRuntimeException statusRuntimeException = (StatusRuntimeException) th;
                        throw new StatusRuntimeException(statusRuntimeException.f8696f, statusRuntimeException.f8697g);
                    }
                } else {
                    StatusException statusException = (StatusException) th;
                    throw new StatusRuntimeException(statusException.f8693f, statusException.f8694g);
                }
            }
            throw Status.f8687h.h("unexpected exception").g(cause).a();
        }
    }
}
