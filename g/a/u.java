package g.a;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;

/* compiled from: HttpConnectProxiedSocketAddress.java */
/* loaded from: classes2.dex */
public final class u extends o0 {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f7569j = 0;

    /* renamed from: f  reason: collision with root package name */
    public final SocketAddress f7570f;

    /* renamed from: g  reason: collision with root package name */
    public final InetSocketAddress f7571g;

    /* renamed from: h  reason: collision with root package name */
    public final String f7572h;

    /* renamed from: i  reason: collision with root package name */
    public final String f7573i;

    public u(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2, a aVar) {
        f.h.b.c.a.x(socketAddress, "proxyAddress");
        f.h.b.c.a.x(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            f.h.b.c.a.D(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.f7570f = socketAddress;
        this.f7571g = inetSocketAddress;
        this.f7572h = str;
        this.f7573i = str2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            return f.h.b.c.a.i0(this.f7570f, uVar.f7570f) && f.h.b.c.a.i0(this.f7571g, uVar.f7571g) && f.h.b.c.a.i0(this.f7572h, uVar.f7572h) && f.h.b.c.a.i0(this.f7573i, uVar.f7573i);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7570f, this.f7571g, this.f7572h, this.f7573i});
    }

    public String toString() {
        f.h.c.a.i c1 = f.h.b.c.a.c1(this);
        c1.c("proxyAddr", this.f7570f);
        c1.c("targetAddr", this.f7571g);
        c1.c("username", this.f7572h);
        c1.d("hasPassword", this.f7573i != null);
        return c1.toString();
    }
}
