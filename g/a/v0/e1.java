package g.a.v0;

import io.grpc.ChannelLogger;

/* compiled from: InternalSubchannel.java */
/* loaded from: classes2.dex */
public class e1 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b1 f7654f;

    public e1(b1 b1Var) {
        this.f7654f = b1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7654f.f7608j.a(ChannelLogger.ChannelLogLevel.INFO, "Terminated");
        b1 b1Var = this.f7654f;
        p1 p1Var = (p1) b1Var.f7603e;
        m1.this.B.remove(b1Var);
        g.a.v.b(m1.this.P.b, b1Var);
        m1.k(m1.this);
    }
}
