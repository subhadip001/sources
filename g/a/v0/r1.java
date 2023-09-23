package g.a.v0;

import g.a.v0.m1;

/* compiled from: ManagedChannelImpl.java */
/* loaded from: classes2.dex */
public class r1 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b1 f7899f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ m1.q f7900g;

    public r1(m1.q qVar, b1 b1Var) {
        this.f7900g = qVar;
        this.f7899f = b1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        g.a.v vVar = m1.this.P;
        g.a.v.a(vVar.b, this.f7899f);
        m1.this.B.add(this.f7899f);
    }
}
