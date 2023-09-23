package g.a.v0;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import g.a.v0.h;
import g.a.v0.t2;
import g.a.v0.v1;
import java.io.Closeable;
import java.io.InputStream;

/* compiled from: ApplicationThreadDeframer.java */
/* loaded from: classes2.dex */
public class g implements c0 {

    /* renamed from: f  reason: collision with root package name */
    public final v1.b f7683f;

    /* renamed from: g  reason: collision with root package name */
    public final g.a.v0.h f7684g;

    /* renamed from: h  reason: collision with root package name */
    public final v1 f7685h;

    /* compiled from: ApplicationThreadDeframer.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f7686f;

        public a(int i2) {
            this.f7686f = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.f7685h.isClosed()) {
                return;
            }
            try {
                g.this.f7685h.f(this.f7686f);
            } catch (Throwable th) {
                g.a.v0.h hVar = g.this.f7684g;
                hVar.a.e(new h.c(th));
                g.this.f7685h.close();
            }
        }
    }

    /* compiled from: ApplicationThreadDeframer.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ d2 f7688f;

        public b(d2 d2Var) {
            this.f7688f = d2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                g.this.f7685h.q(this.f7688f);
            } catch (Throwable th) {
                g.a.v0.h hVar = g.this.f7684g;
                hVar.a.e(new h.c(th));
                g.this.f7685h.close();
            }
        }
    }

    /* compiled from: ApplicationThreadDeframer.java */
    /* loaded from: classes2.dex */
    public class c implements Closeable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ d2 f7690f;

        public c(g gVar, d2 d2Var) {
            this.f7690f = d2Var;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f7690f.close();
        }
    }

    /* compiled from: ApplicationThreadDeframer.java */
    /* loaded from: classes2.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f7685h.l();
        }
    }

    /* compiled from: ApplicationThreadDeframer.java */
    /* loaded from: classes2.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f7685h.close();
        }
    }

    /* compiled from: ApplicationThreadDeframer.java */
    /* loaded from: classes2.dex */
    public class f extends C0197g implements Closeable {

        /* renamed from: i  reason: collision with root package name */
        public final Closeable f7693i;

        public f(g gVar, Runnable runnable, Closeable closeable) {
            super(runnable, null);
            this.f7693i = closeable;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f7693i.close();
        }
    }

    /* compiled from: ApplicationThreadDeframer.java */
    /* renamed from: g.a.v0.g$g  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0197g implements t2.a {

        /* renamed from: f  reason: collision with root package name */
        public final Runnable f7694f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f7695g = false;

        public C0197g(Runnable runnable, a aVar) {
            this.f7694f = runnable;
        }

        @Override // g.a.v0.t2.a
        public InputStream next() {
            if (!this.f7695g) {
                this.f7694f.run();
                this.f7695g = true;
            }
            return g.this.f7684g.c.poll();
        }
    }

    /* compiled from: ApplicationThreadDeframer.java */
    /* loaded from: classes2.dex */
    public interface h extends h.d {
    }

    public g(v1.b bVar, h hVar, v1 v1Var) {
        f.h.b.c.a.x(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        q2 q2Var = new q2(bVar);
        this.f7683f = q2Var;
        g.a.v0.h hVar2 = new g.a.v0.h(q2Var, hVar);
        this.f7684g = hVar2;
        v1Var.f7937f = hVar2;
        this.f7685h = v1Var;
    }

    @Override // g.a.v0.c0
    public void close() {
        this.f7685h.x = true;
        this.f7683f.a(new C0197g(new e(), null));
    }

    @Override // g.a.v0.c0
    public void f(int i2) {
        this.f7683f.a(new C0197g(new a(i2), null));
    }

    @Override // g.a.v0.c0
    public void g(int i2) {
        this.f7685h.f7938g = i2;
    }

    @Override // g.a.v0.c0
    public void l() {
        this.f7683f.a(new C0197g(new d(), null));
    }

    @Override // g.a.v0.c0
    public void p(g.a.o oVar) {
        this.f7685h.p(oVar);
    }

    @Override // g.a.v0.c0
    public void q(d2 d2Var) {
        this.f7683f.a(new f(this, new b(d2Var), new c(this, d2Var)));
    }
}
