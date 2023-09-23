package g.a.v0;

import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.internal.ClientStreamListener;

/* compiled from: FailingClientTransport.java */
/* loaded from: classes2.dex */
public class l0 implements w {
    public final Status a;
    public final ClientStreamListener.RpcProgress b;

    public l0(Status status, ClientStreamListener.RpcProgress rpcProgress) {
        f.h.b.c.a.m(!status.f(), "error must not be OK");
        this.a = status;
        this.b = rpcProgress;
    }

    @Override // g.a.x
    public g.a.y e() {
        throw new UnsupportedOperationException("Not a real transport");
    }

    @Override // g.a.v0.w
    public v g(MethodDescriptor<?, ?> methodDescriptor, g.a.i0 i0Var, g.a.b bVar) {
        return new k0(this.a, this.b);
    }
}
