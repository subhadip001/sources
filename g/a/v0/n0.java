package g.a.v0;

import g.a.v0.b1;
import g.a.v0.t2;
import io.grpc.internal.ClientStreamListener;

/* compiled from: ForwardingClientStreamListener.java */
/* loaded from: classes2.dex */
public abstract class n0 implements ClientStreamListener {
    @Override // g.a.v0.t2
    public void a(t2.a aVar) {
        ((b1.d.a.C0196a) this).a.a(aVar);
    }

    @Override // g.a.v0.t2
    public void b() {
        ((b1.d.a.C0196a) this).a.b();
    }

    @Override // io.grpc.internal.ClientStreamListener
    public void d(g.a.i0 i0Var) {
        ((b1.d.a.C0196a) this).a.d(i0Var);
    }

    public String toString() {
        f.h.c.a.i c1 = f.h.b.c.a.c1(this);
        c1.c("delegate", ((b1.d.a.C0196a) this).a);
        return c1.toString();
    }
}
