package g.a.v0;

import g.a.c0;
import g.a.v0.u1;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.internal.GrpcUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: DelayedClientTransport.java */
/* loaded from: classes2.dex */
public final class f0 implements u1 {
    public final Executor c;

    /* renamed from: d  reason: collision with root package name */
    public final g.a.t0 f7659d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f7660e;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f7661f;

    /* renamed from: g  reason: collision with root package name */
    public Runnable f7662g;

    /* renamed from: h  reason: collision with root package name */
    public u1.a f7663h;

    /* renamed from: j  reason: collision with root package name */
    public Status f7665j;

    /* renamed from: k  reason: collision with root package name */
    public c0.i f7666k;

    /* renamed from: l  reason: collision with root package name */
    public long f7667l;
    public final g.a.y a = g.a.y.a(f0.class, null);
    public final Object b = new Object();

    /* renamed from: i  reason: collision with root package name */
    public Collection<f> f7664i = new LinkedHashSet();

    /* compiled from: DelayedClientTransport.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ u1.a f7668f;

        public a(f0 f0Var, u1.a aVar) {
            this.f7668f = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7668f.d(true);
        }
    }

    /* compiled from: DelayedClientTransport.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ u1.a f7669f;

        public b(f0 f0Var, u1.a aVar) {
            this.f7669f = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7669f.d(false);
        }
    }

    /* compiled from: DelayedClientTransport.java */
    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ u1.a f7670f;

        public c(f0 f0Var, u1.a aVar) {
            this.f7670f = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7670f.c();
        }
    }

    /* compiled from: DelayedClientTransport.java */
    /* loaded from: classes2.dex */
    public class d implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Status f7671f;

        public d(Status status) {
            this.f7671f = status;
        }

        @Override // java.lang.Runnable
        public void run() {
            f0.this.f7663h.a(this.f7671f);
        }
    }

    /* compiled from: DelayedClientTransport.java */
    /* loaded from: classes2.dex */
    public class e implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f f7673f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ w f7674g;

        public e(f0 f0Var, f fVar, w wVar) {
            this.f7673f = fVar;
            this.f7674g = wVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = this.f7673f;
            w wVar = this.f7674g;
            g.a.m a = fVar.f7676j.a();
            try {
                c0.f fVar2 = fVar.f7675i;
                v g2 = wVar.g(((b2) fVar2).c, ((b2) fVar2).b, ((b2) fVar2).a);
                fVar.f7676j.d(a);
                fVar.r(g2);
            } catch (Throwable th) {
                fVar.f7676j.d(a);
                throw th;
            }
        }
    }

    /* compiled from: DelayedClientTransport.java */
    /* loaded from: classes2.dex */
    public class f extends g0 {

        /* renamed from: i  reason: collision with root package name */
        public final c0.f f7675i;

        /* renamed from: j  reason: collision with root package name */
        public final g.a.m f7676j = g.a.m.c();

        public f(c0.f fVar, a aVar) {
            this.f7675i = fVar;
        }

        @Override // g.a.v0.g0, g.a.v0.v
        public void j(Status status) {
            super.j(status);
            synchronized (f0.this.b) {
                f0 f0Var = f0.this;
                if (f0Var.f7662g != null) {
                    boolean remove = f0Var.f7664i.remove(this);
                    if (!f0.this.h() && remove) {
                        f0 f0Var2 = f0.this;
                        f0Var2.f7659d.b(f0Var2.f7661f);
                        f0 f0Var3 = f0.this;
                        if (f0Var3.f7665j != null) {
                            f0Var3.f7659d.b(f0Var3.f7662g);
                            f0.this.f7662g = null;
                        }
                    }
                }
            }
            f0.this.f7659d.a();
        }
    }

    public f0(Executor executor, g.a.t0 t0Var) {
        this.c = executor;
        this.f7659d = t0Var;
    }

    public final f a(c0.f fVar) {
        int size;
        f fVar2 = new f(fVar, null);
        this.f7664i.add(fVar2);
        synchronized (this.b) {
            size = this.f7664i.size();
        }
        if (size == 1) {
            this.f7659d.b(this.f7660e);
        }
        return fVar2;
    }

    @Override // g.a.v0.u1
    public final void b(Status status) {
        Runnable runnable;
        synchronized (this.b) {
            if (this.f7665j != null) {
                return;
            }
            this.f7665j = status;
            g.a.t0 t0Var = this.f7659d;
            d dVar = new d(status);
            Queue<Runnable> queue = t0Var.f7561g;
            f.h.b.c.a.x(dVar, "runnable is null");
            queue.add(dVar);
            if (!h() && (runnable = this.f7662g) != null) {
                this.f7659d.b(runnable);
                this.f7662g = null;
            }
            this.f7659d.a();
        }
    }

    @Override // g.a.v0.u1
    public final void c(Status status) {
        Collection<f> collection;
        Runnable runnable;
        b(status);
        synchronized (this.b) {
            collection = this.f7664i;
            runnable = this.f7662g;
            this.f7662g = null;
            if (!collection.isEmpty()) {
                this.f7664i = Collections.emptyList();
            }
        }
        if (runnable != null) {
            for (f fVar : collection) {
                fVar.j(status);
            }
            g.a.t0 t0Var = this.f7659d;
            Queue<Runnable> queue = t0Var.f7561g;
            f.h.b.c.a.x(runnable, "runnable is null");
            queue.add(runnable);
            t0Var.a();
        }
    }

    @Override // g.a.v0.u1
    public final Runnable d(u1.a aVar) {
        this.f7663h = aVar;
        this.f7660e = new a(this, aVar);
        this.f7661f = new b(this, aVar);
        this.f7662g = new c(this, aVar);
        return null;
    }

    @Override // g.a.x
    public g.a.y e() {
        return this.a;
    }

    @Override // g.a.v0.w
    public final v g(MethodDescriptor<?, ?> methodDescriptor, g.a.i0 i0Var, g.a.b bVar) {
        v k0Var;
        try {
            b2 b2Var = new b2(methodDescriptor, i0Var, bVar);
            c0.i iVar = null;
            long j2 = -1;
            while (true) {
                synchronized (this.b) {
                    Status status = this.f7665j;
                    if (status != null) {
                        k0Var = new k0(status);
                        break;
                    }
                    c0.i iVar2 = this.f7666k;
                    if (iVar2 == null) {
                        k0Var = a(b2Var);
                        break;
                    } else if (iVar != null && j2 == this.f7667l) {
                        k0Var = a(b2Var);
                        break;
                    } else {
                        j2 = this.f7667l;
                        w e2 = GrpcUtil.e(iVar2.a(b2Var), bVar.b());
                        if (e2 != null) {
                            k0Var = e2.g(b2Var.c, b2Var.b, b2Var.a);
                            break;
                        }
                        iVar = iVar2;
                    }
                }
            }
            return k0Var;
        } finally {
            this.f7659d.a();
        }
    }

    public final boolean h() {
        boolean z;
        synchronized (this.b) {
            z = !this.f7664i.isEmpty();
        }
        return z;
    }

    public final void i(c0.i iVar) {
        Runnable runnable;
        synchronized (this.b) {
            this.f7666k = iVar;
            this.f7667l++;
            if (iVar != null && h()) {
                ArrayList arrayList = new ArrayList(this.f7664i);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    c0.e a2 = iVar.a(fVar.f7675i);
                    g.a.b bVar = ((b2) fVar.f7675i).a;
                    w e2 = GrpcUtil.e(a2, bVar.b());
                    if (e2 != null) {
                        Executor executor = this.c;
                        Executor executor2 = bVar.b;
                        if (executor2 != null) {
                            executor = executor2;
                        }
                        executor.execute(new e(this, fVar, e2));
                        arrayList2.add(fVar);
                    }
                }
                synchronized (this.b) {
                    try {
                        if (h()) {
                            this.f7664i.removeAll(arrayList2);
                            if (this.f7664i.isEmpty()) {
                                this.f7664i = new LinkedHashSet();
                            }
                            if (!h()) {
                                this.f7659d.b(this.f7661f);
                                if (this.f7665j != null && (runnable = this.f7662g) != null) {
                                    Queue<Runnable> queue = this.f7659d.f7561g;
                                    f.h.b.c.a.x(runnable, "runnable is null");
                                    queue.add(runnable);
                                    this.f7662g = null;
                                }
                            }
                            this.f7659d.a();
                        }
                    } finally {
                    }
                }
            }
        }
    }
}
