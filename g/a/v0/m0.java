package g.a.v0;

import g.a.v0.b1;
import io.grpc.Status;
import java.io.InputStream;

/* compiled from: ForwardingClientStream.java */
/* loaded from: classes2.dex */
public abstract class m0 implements v {
    @Override // g.a.v0.s2
    public void a(g.a.j jVar) {
        ((b1.d.a) this).a.a(jVar);
    }

    @Override // g.a.v0.s2
    public void b(InputStream inputStream) {
        ((b1.d.a) this).a.b(inputStream);
    }

    @Override // g.a.v0.s2
    public void c() {
        ((b1.d.a) this).a.c();
    }

    @Override // g.a.v0.s2
    public void f(int i2) {
        ((b1.d.a) this).a.f(i2);
    }

    @Override // g.a.v0.s2
    public void flush() {
        ((b1.d.a) this).a.flush();
    }

    @Override // g.a.v0.v
    public void g(int i2) {
        ((b1.d.a) this).a.g(i2);
    }

    @Override // g.a.v0.v
    public void h(int i2) {
        ((b1.d.a) this).a.h(i2);
    }

    @Override // g.a.v0.v
    public void i(g.a.p pVar) {
        ((b1.d.a) this).a.i(pVar);
    }

    @Override // g.a.v0.v
    public void j(Status status) {
        ((b1.d.a) this).a.j(status);
    }

    @Override // g.a.v0.v
    public void k(String str) {
        ((b1.d.a) this).a.k(str);
    }

    @Override // g.a.v0.v
    public void l(a1 a1Var) {
        ((b1.d.a) this).a.l(a1Var);
    }

    @Override // g.a.v0.v
    public void m() {
        ((b1.d.a) this).a.m();
    }

    @Override // g.a.v0.v
    public void n(g.a.n nVar) {
        ((b1.d.a) this).a.n(nVar);
    }

    @Override // g.a.v0.v
    public void p(boolean z) {
        ((b1.d.a) this).a.p(z);
    }

    public String toString() {
        f.h.c.a.i c1 = f.h.b.c.a.c1(this);
        c1.c("delegate", ((b1.d.a) this).a);
        return c1.toString();
    }
}
