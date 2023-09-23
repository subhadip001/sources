package g.a.v0;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import g.a.i0;
import g.a.v0.e;
import g.a.v0.w1;
import g.a.w0.f;
import io.grpc.Status;
import io.grpc.internal.ClientStreamListener;
import io.grpc.internal.GrpcUtil;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: AbstractClientStream.java */
/* loaded from: classes2.dex */
public abstract class a extends e implements v, w1.d {

    /* renamed from: f  reason: collision with root package name */
    public static final Logger f7576f = Logger.getLogger(a.class.getName());
    public final x2 a;
    public final r0 b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7577d;

    /* renamed from: e  reason: collision with root package name */
    public g.a.i0 f7578e;

    /* compiled from: AbstractClientStream.java */
    /* renamed from: g.a.v0.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0194a implements r0 {
        public g.a.i0 a;
        public boolean b;
        public final r2 c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f7579d;

        public C0194a(g.a.i0 i0Var, r2 r2Var) {
            f.h.b.c.a.x(i0Var, "headers");
            this.a = i0Var;
            f.h.b.c.a.x(r2Var, "statsTraceCtx");
            this.c = r2Var;
        }

        @Override // g.a.v0.r0
        public r0 a(g.a.j jVar) {
            return this;
        }

        @Override // g.a.v0.r0
        public void b(InputStream inputStream) {
            f.h.b.c.a.C(this.f7579d == null, "writePayload should not be called multiple times");
            try {
                this.f7579d = f.h.c.c.a.b(inputStream);
                for (g.a.s0 s0Var : this.c.a) {
                    Objects.requireNonNull(s0Var);
                }
                r2 r2Var = this.c;
                int length = this.f7579d.length;
                for (g.a.s0 s0Var2 : r2Var.a) {
                    Objects.requireNonNull(s0Var2);
                }
                r2 r2Var2 = this.c;
                int length2 = this.f7579d.length;
                for (g.a.s0 s0Var3 : r2Var2.a) {
                    Objects.requireNonNull(s0Var3);
                }
                r2 r2Var3 = this.c;
                long length3 = this.f7579d.length;
                for (g.a.s0 s0Var4 : r2Var3.a) {
                    s0Var4.a(length3);
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // g.a.v0.r0
        public void close() {
            this.b = true;
            f.h.b.c.a.C(this.f7579d != null, "Lack of request message. GET request is only supported for unary requests");
            ((f.a) a.this.q()).a(this.a, this.f7579d);
            this.f7579d = null;
            this.a = null;
        }

        @Override // g.a.v0.r0
        public void flush() {
        }

        @Override // g.a.v0.r0
        public void h(int i2) {
        }

        @Override // g.a.v0.r0
        public boolean isClosed() {
            return this.b;
        }
    }

    /* compiled from: AbstractClientStream.java */
    /* loaded from: classes2.dex */
    public interface b {
    }

    /* compiled from: AbstractClientStream.java */
    /* loaded from: classes2.dex */
    public static abstract class c extends e.a {

        /* renamed from: h  reason: collision with root package name */
        public final r2 f7581h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f7582i;

        /* renamed from: j  reason: collision with root package name */
        public ClientStreamListener f7583j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f7584k;

        /* renamed from: l  reason: collision with root package name */
        public g.a.p f7585l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f7586m;
        public Runnable n;
        public volatile boolean o;
        public boolean p;
        public boolean q;

        /* compiled from: AbstractClientStream.java */
        /* renamed from: g.a.v0.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0195a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ Status f7587f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ ClientStreamListener.RpcProgress f7588g;

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ g.a.i0 f7589h;

            public RunnableC0195a(Status status, ClientStreamListener.RpcProgress rpcProgress, g.a.i0 i0Var) {
                this.f7587f = status;
                this.f7588g = rpcProgress;
                this.f7589h = i0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.g(this.f7587f, this.f7588g, this.f7589h);
            }
        }

        public c(int i2, r2 r2Var, x2 x2Var) {
            super(i2, r2Var, x2Var);
            this.f7585l = g.a.p.f7557d;
            this.f7586m = false;
            f.h.b.c.a.x(r2Var, "statsTraceCtx");
            this.f7581h = r2Var;
        }

        @Override // g.a.v0.v1.b
        public void b(boolean z) {
            f.h.b.c.a.C(this.p, "status should have been reported on deframer closed");
            this.f7586m = true;
            if (this.q && z) {
                i(Status.f8692m.h("Encountered end-of-stream mid-frame"), ClientStreamListener.RpcProgress.PROCESSED, true, new g.a.i0());
            }
            Runnable runnable = this.n;
            if (runnable != null) {
                runnable.run();
                this.n = null;
            }
        }

        public final void g(Status status, ClientStreamListener.RpcProgress rpcProgress, g.a.i0 i0Var) {
            if (this.f7582i) {
                return;
            }
            this.f7582i = true;
            r2 r2Var = this.f7581h;
            if (r2Var.b.compareAndSet(false, true)) {
                for (g.a.s0 s0Var : r2Var.a) {
                    Objects.requireNonNull(s0Var);
                }
            }
            this.f7583j.e(status, rpcProgress, i0Var);
            x2 x2Var = this.c;
            if (x2Var != null) {
                if (status.f()) {
                    x2Var.c++;
                } else {
                    x2Var.f7973d++;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void h(g.a.i0 r8) {
            /*
                Method dump skipped, instructions count: 235
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: g.a.v0.a.c.h(g.a.i0):void");
        }

        public final void i(Status status, ClientStreamListener.RpcProgress rpcProgress, boolean z, g.a.i0 i0Var) {
            f.h.b.c.a.x(status, "status");
            f.h.b.c.a.x(i0Var, "trailers");
            if (!this.p || z) {
                this.p = true;
                this.q = status.f();
                synchronized (this.b) {
                    this.f7651g = true;
                }
                if (this.f7586m) {
                    this.n = null;
                    g(status, rpcProgress, i0Var);
                    return;
                }
                this.n = new RunnableC0195a(status, rpcProgress, i0Var);
                if (z) {
                    this.a.close();
                } else {
                    this.a.l();
                }
            }
        }
    }

    public a(z2 z2Var, r2 r2Var, x2 x2Var, g.a.i0 i0Var, g.a.b bVar, boolean z) {
        f.h.b.c.a.x(i0Var, "headers");
        f.h.b.c.a.x(x2Var, "transportTracer");
        this.a = x2Var;
        this.c = !Boolean.TRUE.equals(bVar.a(GrpcUtil.f8707l));
        this.f7577d = z;
        if (!z) {
            this.b = new w1(this, z2Var, r2Var);
            this.f7578e = i0Var;
            return;
        }
        this.b = new C0194a(i0Var, r2Var);
    }

    @Override // g.a.v0.w1.d
    public final void d(y2 y2Var, boolean z, boolean z2, int i2) {
        l.f fVar;
        f.h.b.c.a.m(y2Var != null || z, "null frame before EOS");
        f.a aVar = (f.a) q();
        Objects.requireNonNull(aVar);
        if (y2Var == null) {
            fVar = g.a.w0.f.q;
        } else {
            fVar = ((g.a.w0.l) y2Var).a;
            int i3 = (int) fVar.f9230g;
            if (i3 > 0) {
                e.a e2 = g.a.w0.f.this.e();
                synchronized (e2.b) {
                    e2.f7649e += i3;
                }
            }
        }
        try {
            synchronized (g.a.w0.f.this.f8025m.y) {
                f.b.m(g.a.w0.f.this.f8025m, fVar, z, z2);
                x2 x2Var = g.a.w0.f.this.a;
                Objects.requireNonNull(x2Var);
                if (i2 != 0) {
                    x2Var.f7975f += i2;
                    x2Var.a.a();
                }
            }
        } finally {
            Objects.requireNonNull(g.b.c.a);
        }
    }

    @Override // g.a.v0.v
    public void g(int i2) {
        e().a.g(i2);
    }

    @Override // g.a.v0.v
    public void h(int i2) {
        this.b.h(i2);
    }

    @Override // g.a.v0.v
    public final void i(g.a.p pVar) {
        c e2 = e();
        f.h.b.c.a.C(e2.f7583j == null, "Already called start");
        f.h.b.c.a.x(pVar, "decompressorRegistry");
        e2.f7585l = pVar;
    }

    @Override // g.a.v0.v
    public final void j(Status status) {
        f.h.b.c.a.m(!status.f(), "Should not cancel with OK status");
        f.a aVar = (f.a) q();
        Objects.requireNonNull(aVar);
        Objects.requireNonNull(g.b.c.a);
        try {
            synchronized (g.a.w0.f.this.f8025m.y) {
                g.a.w0.f.this.f8025m.n(status, true, null);
            }
        } catch (Throwable th) {
            Objects.requireNonNull(g.b.c.a);
            throw th;
        }
    }

    @Override // g.a.v0.v
    public final void l(a1 a1Var) {
        g.a.a aVar = ((g.a.w0.f) this).o;
        a1Var.b("remote_addr", aVar.a.get(g.a.t.a));
    }

    @Override // g.a.v0.v
    public final void m() {
        if (e().o) {
            return;
        }
        e().o = true;
        this.b.close();
    }

    @Override // g.a.v0.v
    public void n(g.a.n nVar) {
        g.a.i0 i0Var = this.f7578e;
        i0.f<Long> fVar = GrpcUtil.b;
        i0Var.b(fVar);
        this.f7578e.h(fVar, Long.valueOf(Math.max(0L, nVar.g(TimeUnit.NANOSECONDS))));
    }

    @Override // g.a.v0.v
    public final void o(ClientStreamListener clientStreamListener) {
        c e2 = e();
        f.h.b.c.a.C(e2.f7583j == null, "Already called setListener");
        f.h.b.c.a.x(clientStreamListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        e2.f7583j = clientStreamListener;
        if (this.f7577d) {
            return;
        }
        ((f.a) q()).a(this.f7578e, null);
        this.f7578e = null;
    }

    @Override // g.a.v0.v
    public final void p(boolean z) {
        e().f7584k = z;
    }

    public abstract b q();

    @Override // g.a.v0.e
    /* renamed from: r */
    public abstract c e();
}
