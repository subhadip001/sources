package g.a.v0;

import g.a.v0.u1;
import g.a.v0.w;
import io.grpc.Status;
import java.util.concurrent.Executor;

/* compiled from: ForwardingConnectionClientTransport.java */
/* loaded from: classes2.dex */
public abstract class o0 implements z {
    public abstract z a();

    @Override // g.a.v0.u1
    public void b(Status status) {
        a().b(status);
    }

    @Override // g.a.v0.u1
    public void c(Status status) {
        a().c(status);
    }

    @Override // g.a.v0.u1
    public Runnable d(u1.a aVar) {
        return a().d(aVar);
    }

    @Override // g.a.x
    public g.a.y e() {
        return a().e();
    }

    @Override // g.a.v0.w
    public void f(w.a aVar, Executor executor) {
        a().f(aVar, executor);
    }

    public String toString() {
        f.h.c.a.i c1 = f.h.b.c.a.c1(this);
        c1.c("delegate", a());
        return c1.toString();
    }
}
