package g.a.v0;

import io.grpc.ChannelLogger;
import java.io.Closeable;
import java.net.SocketAddress;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: ClientTransportFactory.java */
/* loaded from: classes2.dex */
public interface x extends Closeable {

    /* compiled from: ClientTransportFactory.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public String a = "unknown-authority";
        public g.a.a b = g.a.a.c;
        public String c;

        /* renamed from: d  reason: collision with root package name */
        public g.a.u f7969d;

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.a.equals(aVar.a) && this.b.equals(aVar.b) && f.h.b.c.a.i0(this.c, aVar.c) && f.h.b.c.a.i0(this.f7969d, aVar.f7969d);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.f7969d});
        }
    }

    z I(SocketAddress socketAddress, a aVar, ChannelLogger channelLogger);

    ScheduledExecutorService b0();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
}
