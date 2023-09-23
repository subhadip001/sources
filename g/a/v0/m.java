package g.a.v0;

import g.a.v0.x;
import io.grpc.ChannelLogger;
import io.grpc.MethodDescriptor;
import java.net.SocketAddress;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: CallCredentialsApplyingTransportFactory.java */
/* loaded from: classes2.dex */
public final class m implements x {

    /* renamed from: f  reason: collision with root package name */
    public final x f7833f;

    /* renamed from: g  reason: collision with root package name */
    public final Executor f7834g;

    /* compiled from: CallCredentialsApplyingTransportFactory.java */
    /* loaded from: classes2.dex */
    public class a extends o0 {
        public final z a;

        public a(z zVar, String str) {
            f.h.b.c.a.x(zVar, "delegate");
            this.a = zVar;
            f.h.b.c.a.x(str, "authority");
        }

        @Override // g.a.v0.o0
        public z a() {
            return this.a;
        }

        @Override // g.a.v0.w
        public v g(MethodDescriptor<?, ?> methodDescriptor, g.a.i0 i0Var, g.a.b bVar) {
            Objects.requireNonNull(bVar);
            return this.a.g(methodDescriptor, i0Var, bVar);
        }
    }

    public m(x xVar, Executor executor) {
        f.h.b.c.a.x(xVar, "delegate");
        this.f7833f = xVar;
        f.h.b.c.a.x(executor, "appExecutor");
        this.f7834g = executor;
    }

    @Override // g.a.v0.x
    public z I(SocketAddress socketAddress, x.a aVar, ChannelLogger channelLogger) {
        return new a(this.f7833f.I(socketAddress, aVar, channelLogger), aVar.a);
    }

    @Override // g.a.v0.x
    public ScheduledExecutorService b0() {
        return this.f7833f.b0();
    }

    @Override // g.a.v0.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f7833f.close();
    }
}
