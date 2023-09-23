package g.a.v0;

import g.a.c0;
import io.grpc.Status;

/* compiled from: ManagedChannelImpl.java */
/* loaded from: classes2.dex */
public final class n1 extends c0.i {
    public final c0.e a;
    public final /* synthetic */ Throwable b;

    public n1(m1 m1Var, Throwable th) {
        this.b = th;
        Status g2 = Status.f8692m.h("Panic! This is a bug!").g(th);
        c0.e eVar = c0.e.f7533e;
        f.h.b.c.a.m(!g2.f(), "drop status shouldn't be OK");
        this.a = new c0.e(null, null, g2, true);
    }

    @Override // g.a.c0.i
    public c0.e a(c0.f fVar) {
        return this.a;
    }

    public String toString() {
        f.h.c.a.i iVar = new f.h.c.a.i(n1.class.getSimpleName(), null);
        iVar.c("panicPickResult", this.a);
        return iVar.toString();
    }
}
