package g.a.v0;

import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.Constants;
import io.grpc.Status;
import io.grpc.internal.ClientStreamListener;

/* compiled from: FailingClientStream.java */
/* loaded from: classes2.dex */
public final class k0 extends x1 {
    public boolean b;
    public final Status c;

    /* renamed from: d  reason: collision with root package name */
    public final ClientStreamListener.RpcProgress f7823d;

    public k0(Status status) {
        ClientStreamListener.RpcProgress rpcProgress = ClientStreamListener.RpcProgress.PROCESSED;
        f.h.b.c.a.m(!status.f(), "error must not be OK");
        this.c = status;
        this.f7823d = rpcProgress;
    }

    @Override // g.a.v0.x1, g.a.v0.v
    public void l(a1 a1Var) {
        a1Var.b(Constants.IPC_BUNDLE_KEY_SEND_ERROR, this.c);
        a1Var.b(NotificationCompat.CATEGORY_PROGRESS, this.f7823d);
    }

    @Override // g.a.v0.x1, g.a.v0.v
    public void o(ClientStreamListener clientStreamListener) {
        f.h.b.c.a.C(!this.b, "already started");
        this.b = true;
        clientStreamListener.e(this.c, this.f7823d, new g.a.i0());
    }

    public k0(Status status, ClientStreamListener.RpcProgress rpcProgress) {
        f.h.b.c.a.m(!status.f(), "error must not be OK");
        this.c = status;
        this.f7823d = rpcProgress;
    }
}
