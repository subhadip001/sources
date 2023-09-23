package g.a;

import g.a.s;

/* compiled from: PartialForwardingClientCall.java */
/* loaded from: classes2.dex */
public abstract class n0<ReqT, RespT> extends d<ReqT, RespT> {
    @Override // g.a.d
    public void a(String str, Throwable th) {
        ((s.a) this).a.a(str, th);
    }

    @Override // g.a.d
    public void b() {
        ((s.a) this).a.b();
    }

    @Override // g.a.d
    public void c(int i2) {
        ((s.a) this).a.c(i2);
    }

    public String toString() {
        f.h.c.a.i c1 = f.h.b.c.a.c1(this);
        c1.c("delegate", ((s.a) this).a);
        return c1.toString();
    }
}
