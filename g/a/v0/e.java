package g.a.v0;

import g.a.i;
import g.a.v0.a;
import g.a.v0.g;
import g.a.v0.t2;
import g.a.v0.v1;
import g.a.w0.f;
import io.grpc.internal.GrpcUtil;
import java.io.InputStream;
import java.util.Objects;

/* compiled from: AbstractStream.java */
/* loaded from: classes2.dex */
public abstract class e implements s2 {

    /* compiled from: AbstractStream.java */
    /* loaded from: classes2.dex */
    public static abstract class a implements g.h, v1.b {
        public c0 a;
        public final Object b = new Object();
        public final x2 c;

        /* renamed from: d  reason: collision with root package name */
        public final v1 f7648d;

        /* renamed from: e  reason: collision with root package name */
        public int f7649e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f7650f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f7651g;

        public a(int i2, r2 r2Var, x2 x2Var) {
            f.h.b.c.a.x(r2Var, "statsTraceCtx");
            f.h.b.c.a.x(x2Var, "transportTracer");
            this.c = x2Var;
            v1 v1Var = new v1(this, i.b.a, i2, r2Var, x2Var);
            this.f7648d = v1Var;
            this.a = v1Var;
        }

        @Override // g.a.v0.v1.b
        public void a(t2.a aVar) {
            ((a.c) this).f7583j.a(aVar);
        }

        public final void f() {
            boolean z;
            synchronized (this.b) {
                synchronized (this.b) {
                    z = this.f7650f && this.f7649e < 32768 && !this.f7651g;
                }
            }
            if (z) {
                ((a.c) this).f7583j.b();
            }
        }
    }

    @Override // g.a.v0.s2
    public final void a(g.a.j jVar) {
        r0 r0Var = ((g.a.v0.a) this).b;
        f.h.b.c.a.x(jVar, "compressor");
        r0Var.a(jVar);
    }

    @Override // g.a.v0.s2
    public final void b(InputStream inputStream) {
        f.h.b.c.a.x(inputStream, "message");
        try {
            if (!((g.a.v0.a) this).b.isClosed()) {
                ((g.a.v0.a) this).b.b(inputStream);
            }
        } finally {
            GrpcUtil.b(inputStream);
        }
    }

    @Override // g.a.v0.s2
    public void c() {
        a e2 = e();
        v1 v1Var = e2.f7648d;
        v1Var.f7937f = e2;
        e2.a = v1Var;
    }

    public abstract a e();

    @Override // g.a.v0.s2
    public final void f(int i2) {
        a e2 = e();
        Objects.requireNonNull(e2);
        g.b.c.a();
        ((f.b) e2).e(new d(e2, g.b.a.b, i2));
    }

    @Override // g.a.v0.s2
    public final void flush() {
        g.a.v0.a aVar = (g.a.v0.a) this;
        if (aVar.b.isClosed()) {
            return;
        }
        aVar.b.flush();
    }
}
