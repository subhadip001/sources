package g.a.v0;

import g.a.c0;
import io.grpc.ConnectivityState;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PickFirstLoadBalancer.java */
/* loaded from: classes2.dex */
public final class z1 extends g.a.c0 {
    public final c0.d b;
    public c0.h c;

    /* compiled from: PickFirstLoadBalancer.java */
    /* loaded from: classes2.dex */
    public class a implements c0.j {
        public final /* synthetic */ c0.h a;

        public a(c0.h hVar) {
            this.a = hVar;
        }

        @Override // g.a.c0.j
        public void a(g.a.l lVar) {
            c0.i bVar;
            z1 z1Var = z1.this;
            c0.h hVar = this.a;
            Objects.requireNonNull(z1Var);
            ConnectivityState connectivityState = lVar.a;
            if (connectivityState == ConnectivityState.SHUTDOWN) {
                return;
            }
            int ordinal = connectivityState.ordinal();
            if (ordinal == 0) {
                bVar = new b(c0.e.f7533e);
            } else if (ordinal == 1) {
                bVar = new b(c0.e.b(hVar));
            } else if (ordinal == 2) {
                bVar = new b(c0.e.a(lVar.b));
            } else if (ordinal == 3) {
                bVar = new c(hVar);
            } else {
                throw new IllegalArgumentException("Unsupported state:" + connectivityState);
            }
            z1Var.b.d(connectivityState, bVar);
        }
    }

    /* compiled from: PickFirstLoadBalancer.java */
    /* loaded from: classes2.dex */
    public static final class b extends c0.i {
        public final c0.e a;

        public b(c0.e eVar) {
            f.h.b.c.a.x(eVar, "result");
            this.a = eVar;
        }

        @Override // g.a.c0.i
        public c0.e a(c0.f fVar) {
            return this.a;
        }

        public String toString() {
            f.h.c.a.i iVar = new f.h.c.a.i(b.class.getSimpleName(), null);
            iVar.c("result", this.a);
            return iVar.toString();
        }
    }

    /* compiled from: PickFirstLoadBalancer.java */
    /* loaded from: classes2.dex */
    public final class c extends c0.i {
        public final c0.h a;
        public final AtomicBoolean b = new AtomicBoolean(false);

        /* compiled from: PickFirstLoadBalancer.java */
        /* loaded from: classes2.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.a.d();
            }
        }

        public c(c0.h hVar) {
            f.h.b.c.a.x(hVar, "subchannel");
            this.a = hVar;
        }

        @Override // g.a.c0.i
        public c0.e a(c0.f fVar) {
            if (this.b.compareAndSet(false, true)) {
                g.a.t0 c = z1.this.b.c();
                a aVar = new a();
                Queue<Runnable> queue = c.f7561g;
                f.h.b.c.a.x(aVar, "runnable is null");
                queue.add(aVar);
                c.a();
            }
            return c0.e.f7533e;
        }
    }

    public z1(c0.d dVar) {
        f.h.b.c.a.x(dVar, "helper");
        this.b = dVar;
    }

    @Override // g.a.c0
    public void a(Status status) {
        c0.h hVar = this.c;
        if (hVar != null) {
            hVar.e();
            this.c = null;
        }
        this.b.d(ConnectivityState.TRANSIENT_FAILURE, new b(c0.e.a(status)));
    }

    @Override // g.a.c0
    public void b(c0.g gVar) {
        List<g.a.r> list = gVar.a;
        c0.h hVar = this.c;
        if (hVar == null) {
            c0.d dVar = this.b;
            c0.b.a aVar = new c0.b.a();
            f.h.b.c.a.m(!list.isEmpty(), "addrs is empty");
            List<g.a.r> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
            aVar.a = unmodifiableList;
            c0.h a2 = dVar.a(new c0.b(unmodifiableList, aVar.b, aVar.c, null));
            a2.f(new a(a2));
            this.c = a2;
            this.b.d(ConnectivityState.CONNECTING, new b(c0.e.b(a2)));
            a2.d();
            return;
        }
        hVar.g(list);
    }

    @Override // g.a.c0
    public void c() {
        c0.h hVar = this.c;
        if (hVar != null) {
            hVar.e();
        }
    }
}
