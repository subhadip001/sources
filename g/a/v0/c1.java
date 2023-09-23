package g.a.v0;

import io.grpc.ChannelLogger;
import io.grpc.ConnectivityState;

/* compiled from: InternalSubchannel.java */
/* loaded from: classes2.dex */
public class c1 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b1 f7619f;

    public c1(b1 b1Var) {
        this.f7619f = b1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        b1 b1Var = this.f7619f;
        b1Var.p = null;
        b1Var.f7608j.a(ChannelLogger.ChannelLogLevel.INFO, "CONNECTING after backoff");
        b1.h(this.f7619f, ConnectivityState.CONNECTING);
        b1.i(this.f7619f);
    }
}
