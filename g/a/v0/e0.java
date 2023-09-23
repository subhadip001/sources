package g.a.v0;

import io.grpc.Status;

/* compiled from: DelayedClientCall.java */
/* loaded from: classes2.dex */
public class e0 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Status f7652f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ d0 f7653g;

    public e0(d0 d0Var, Status status) {
        this.f7653g = d0Var;
        this.f7652f = status;
    }

    @Override // java.lang.Runnable
    public void run() {
        g.a.d<ReqT, RespT> dVar = this.f7653g.c;
        Status status = this.f7652f;
        dVar.a(status.b, status.c);
    }
}
