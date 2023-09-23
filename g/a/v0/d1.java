package g.a.v0;

import io.grpc.Status;
import java.util.List;

/* compiled from: InternalSubchannel.java */
/* loaded from: classes2.dex */
public class d1 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ List f7645f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ b1 f7646g;

    /* compiled from: InternalSubchannel.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b1 b1Var = d1.this.f7646g;
            u1 u1Var = b1Var.r;
            b1Var.q = null;
            b1Var.r = null;
            u1Var.b(Status.n.h("InternalSubchannel closed transport due to address change"));
        }
    }

    public d1(b1 b1Var, List list) {
        this.f7646g = b1Var;
        this.f7645f = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r8.f7645f
            r0.<init>(r1)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            g.a.v0.b1 r1 = r8.f7646g
            g.a.v0.b1$f r1 = r1.f7610l
            java.net.SocketAddress r1 = r1.a()
            g.a.v0.b1 r2 = r8.f7646g
            g.a.v0.b1$f r2 = r2.f7610l
            r2.a = r0
            r2.b()
            g.a.v0.b1 r2 = r8.f7646g
            r2.f7611m = r0
            g.a.v0.b1 r0 = r8.f7646g
            g.a.l r0 = r0.w
            io.grpc.ConnectivityState r0 = r0.a
            io.grpc.ConnectivityState r2 = io.grpc.ConnectivityState.READY
            r3 = 0
            if (r0 == r2) goto L35
            g.a.v0.b1 r0 = r8.f7646g
            g.a.l r0 = r0.w
            io.grpc.ConnectivityState r0 = r0.a
            io.grpc.ConnectivityState r2 = io.grpc.ConnectivityState.CONNECTING
            if (r0 != r2) goto L9c
        L35:
            g.a.v0.b1 r0 = r8.f7646g
            g.a.v0.b1$f r0 = r0.f7610l
            r2 = 0
            r4 = 0
        L3b:
            java.util.List<g.a.r> r5 = r0.a
            int r5 = r5.size()
            if (r4 >= r5) goto L5c
            java.util.List<g.a.r> r5 = r0.a
            java.lang.Object r5 = r5.get(r4)
            g.a.r r5 = (g.a.r) r5
            java.util.List<java.net.SocketAddress> r5 = r5.a
            int r5 = r5.indexOf(r1)
            r6 = -1
            if (r5 != r6) goto L57
            int r4 = r4 + 1
            goto L3b
        L57:
            r0.b = r4
            r0.c = r5
            r2 = 1
        L5c:
            if (r2 != 0) goto L9c
            g.a.v0.b1 r0 = r8.f7646g
            g.a.l r0 = r0.w
            io.grpc.ConnectivityState r0 = r0.a
            io.grpc.ConnectivityState r1 = io.grpc.ConnectivityState.READY
            if (r0 != r1) goto L7f
            g.a.v0.b1 r0 = r8.f7646g
            g.a.v0.u1 r0 = r0.v
            g.a.v0.b1 r1 = r8.f7646g
            r1.v = r3
            g.a.v0.b1 r1 = r8.f7646g
            g.a.v0.b1$f r1 = r1.f7610l
            r1.b()
            g.a.v0.b1 r1 = r8.f7646g
            io.grpc.ConnectivityState r2 = io.grpc.ConnectivityState.IDLE
            g.a.v0.b1.h(r1, r2)
            goto L9d
        L7f:
            g.a.v0.b1 r0 = r8.f7646g
            g.a.v0.z r0 = r0.u
            io.grpc.Status r1 = io.grpc.Status.n
            java.lang.String r2 = "InternalSubchannel closed pending transport due to address change"
            io.grpc.Status r1 = r1.h(r2)
            r0.b(r1)
            g.a.v0.b1 r0 = r8.f7646g
            r0.u = r3
            g.a.v0.b1$f r0 = r0.f7610l
            r0.b()
            g.a.v0.b1 r0 = r8.f7646g
            g.a.v0.b1.i(r0)
        L9c:
            r0 = r3
        L9d:
            if (r0 == 0) goto Ld6
            g.a.v0.b1 r1 = r8.f7646g
            g.a.t0$c r2 = r1.q
            if (r2 == 0) goto Lbf
            g.a.v0.u1 r1 = r1.r
            io.grpc.Status r2 = io.grpc.Status.n
            java.lang.String r4 = "InternalSubchannel closed transport early due to address change"
            io.grpc.Status r2 = r2.h(r4)
            r1.b(r2)
            g.a.v0.b1 r1 = r8.f7646g
            g.a.t0$c r1 = r1.q
            r1.a()
            g.a.v0.b1 r1 = r8.f7646g
            r1.q = r3
            r1.r = r3
        Lbf:
            g.a.v0.b1 r1 = r8.f7646g
            r1.r = r0
            g.a.t0 r2 = r1.f7609k
            g.a.v0.d1$a r3 = new g.a.v0.d1$a
            r3.<init>()
            r4 = 5
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.ScheduledExecutorService r7 = r1.f7605g
            g.a.t0$c r0 = r2.c(r3, r4, r6, r7)
            r1.q = r0
        Ld6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.v0.d1.run():void");
    }
}
