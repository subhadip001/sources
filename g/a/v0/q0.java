package g.a.v0;

import io.grpc.MethodDescriptor;

/* compiled from: ForwardingManagedChannel.java */
/* loaded from: classes2.dex */
public abstract class q0 extends g.a.f0 {
    public final g.a.f0 a;

    public q0(g.a.f0 f0Var) {
        this.a = f0Var;
    }

    @Override // g.a.c
    public String a() {
        return this.a.a();
    }

    @Override // g.a.c
    public <RequestT, ResponseT> g.a.d<RequestT, ResponseT> h(MethodDescriptor<RequestT, ResponseT> methodDescriptor, g.a.b bVar) {
        return this.a.h(methodDescriptor, bVar);
    }

    public String toString() {
        f.h.c.a.i c1 = f.h.b.c.a.c1(this);
        c1.c("delegate", this.a);
        return c1.toString();
    }
}
