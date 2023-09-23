package g.a.v0;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import g.a.d;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: DelayedClientCall.java */
/* loaded from: classes2.dex */
public class d0<ReqT, RespT> extends g.a.d<ReqT, RespT> {

    /* renamed from: g  reason: collision with root package name */
    public static final g.a.d<Object, Object> f7625g;
    public volatile boolean a;
    public d.a<RespT> b;
    public g.a.d<ReqT, RespT> c;

    /* renamed from: d  reason: collision with root package name */
    public Status f7626d;

    /* renamed from: e  reason: collision with root package name */
    public List<Runnable> f7627e;

    /* renamed from: f  reason: collision with root package name */
    public f<RespT> f7628f;

    /* compiled from: DelayedClientCall.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ d.a f7629f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ g.a.i0 f7630g;

        public a(d.a aVar, g.a.i0 i0Var) {
            this.f7629f = aVar;
            this.f7630g = i0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            d0.this.c.e(this.f7629f, this.f7630g);
        }
    }

    /* compiled from: DelayedClientCall.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Object f7632f;

        public b(Object obj) {
            this.f7632f = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            d0.this.c.d(this.f7632f);
        }
    }

    /* compiled from: DelayedClientCall.java */
    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f7634f;

        public c(int i2) {
            this.f7634f = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            d0.this.c.c(this.f7634f);
        }
    }

    /* compiled from: DelayedClientCall.java */
    /* loaded from: classes2.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d0.this.c.b();
        }
    }

    /* compiled from: DelayedClientCall.java */
    /* loaded from: classes2.dex */
    public class e extends g.a.d<Object, Object> {
        @Override // g.a.d
        public void a(String str, Throwable th) {
        }

        @Override // g.a.d
        public void b() {
        }

        @Override // g.a.d
        public void c(int i2) {
        }

        @Override // g.a.d
        public void d(Object obj) {
        }

        @Override // g.a.d
        public void e(d.a<Object> aVar, g.a.i0 i0Var) {
        }
    }

    /* compiled from: DelayedClientCall.java */
    /* loaded from: classes2.dex */
    public static final class f<RespT> extends d.a<RespT> {
        public final d.a<RespT> a;
        public volatile boolean b;
        public List<Runnable> c = new ArrayList();

        /* compiled from: DelayedClientCall.java */
        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ g.a.i0 f7637f;

            public a(g.a.i0 i0Var) {
                this.f7637f = i0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.a.b(this.f7637f);
            }
        }

        /* compiled from: DelayedClientCall.java */
        /* loaded from: classes2.dex */
        public class b implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ Object f7639f;

            public b(Object obj) {
                this.f7639f = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                f.this.a.c(this.f7639f);
            }
        }

        /* compiled from: DelayedClientCall.java */
        /* loaded from: classes2.dex */
        public class c implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ Status f7641f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ g.a.i0 f7642g;

            public c(Status status, g.a.i0 i0Var) {
                this.f7641f = status;
                this.f7642g = i0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.a.a(this.f7641f, this.f7642g);
            }
        }

        /* compiled from: DelayedClientCall.java */
        /* loaded from: classes2.dex */
        public class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.a.d();
            }
        }

        public f(d.a<RespT> aVar) {
            this.a = aVar;
        }

        @Override // g.a.d.a
        public void a(Status status, g.a.i0 i0Var) {
            e(new c(status, i0Var));
        }

        @Override // g.a.d.a
        public void b(g.a.i0 i0Var) {
            if (this.b) {
                this.a.b(i0Var);
            } else {
                e(new a(i0Var));
            }
        }

        @Override // g.a.d.a
        public void c(RespT respt) {
            if (this.b) {
                this.a.c(respt);
            } else {
                e(new b(respt));
            }
        }

        @Override // g.a.d.a
        public void d() {
            if (this.b) {
                this.a.d();
            } else {
                e(new d());
            }
        }

        public final void e(Runnable runnable) {
            synchronized (this) {
                if (!this.b) {
                    this.c.add(runnable);
                } else {
                    runnable.run();
                }
            }
        }
    }

    static {
        Logger.getLogger(d0.class.getName());
        f7625g = new e();
    }

    @Override // g.a.d
    public final void a(String str, Throwable th) {
        Status h2;
        boolean z;
        d.a<RespT> aVar;
        Status status = Status.f8686g;
        if (str != null) {
            h2 = status.h(str);
        } else {
            h2 = status.h("Call cancelled without message");
        }
        if (th != null) {
            h2 = h2.g(th);
        }
        synchronized (this) {
            g.a.d<ReqT, RespT> dVar = this.c;
            z = true;
            if (dVar == null) {
                g.a.d<ReqT, RespT> dVar2 = (g.a.d<ReqT, RespT>) f7625g;
                if (dVar != null) {
                    z = false;
                }
                f.h.b.c.a.D(z, "realCall already set to %s", dVar);
                this.c = dVar2;
                aVar = this.b;
                this.f7626d = h2;
                z = false;
            } else {
                aVar = null;
            }
        }
        if (z) {
            g(new e0(this, h2));
        } else if (aVar == null) {
            h();
        } else {
            throw null;
        }
        f();
    }

    @Override // g.a.d
    public final void b() {
        g(new d());
    }

    @Override // g.a.d
    public final void c(int i2) {
        if (this.a) {
            this.c.c(i2);
        } else {
            g(new c(i2));
        }
    }

    @Override // g.a.d
    public final void d(ReqT reqt) {
        if (this.a) {
            this.c.d(reqt);
        } else {
            g(new b(reqt));
        }
    }

    @Override // g.a.d
    public final void e(d.a<RespT> aVar, g.a.i0 i0Var) {
        Status status;
        boolean z;
        f.h.b.c.a.C(this.b == null, "already started");
        synchronized (this) {
            f.h.b.c.a.x(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.b = aVar;
            status = this.f7626d;
            z = this.a;
            if (!z) {
                f<RespT> fVar = new f<>(aVar);
                this.f7628f = fVar;
                aVar = fVar;
            }
        }
        if (status != null) {
            throw null;
        }
        if (z) {
            this.c.e(aVar, i0Var);
        } else {
            g(new a(aVar, i0Var));
        }
    }

    public void f() {
    }

    public final void g(Runnable runnable) {
        synchronized (this) {
            if (!this.a) {
                this.f7627e.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (r0.hasNext() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List<java.lang.Runnable> r1 = r3.f7627e     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L1e
            r0 = 0
            r3.f7627e = r0     // Catch: java.lang.Throwable -> L3c
            r1 = 1
            r3.a = r1     // Catch: java.lang.Throwable -> L3c
            g.a.v0.d0$f<RespT> r1 = r3.f7628f     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L1a
            return
        L1a:
            java.util.Objects.requireNonNull(r3)
            throw r0
        L1e:
            java.util.List<java.lang.Runnable> r1 = r3.f7627e     // Catch: java.lang.Throwable -> L3c
            r3.f7627e = r0     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r0 = r1.iterator()
        L27:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L27
        L37:
            r1.clear()
            r0 = r1
            goto L5
        L3c:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.v0.d0.h():void");
    }

    public String toString() {
        f.h.c.a.i c1 = f.h.b.c.a.c1(this);
        c1.c("realCall", this.c);
        return c1.toString();
    }
}
