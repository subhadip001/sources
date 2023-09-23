package g.a.v0;

import io.grpc.internal.GrpcUtil;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: ProxyDetectorImpl.java */
/* loaded from: classes2.dex */
public class c2 implements g.a.p0 {

    /* renamed from: d  reason: collision with root package name */
    public static final Logger f7620d = Logger.getLogger(c2.class.getName());

    /* renamed from: e  reason: collision with root package name */
    public static final c f7621e = new a();

    /* renamed from: f  reason: collision with root package name */
    public static final f.h.c.a.p<ProxySelector> f7622f = new b();
    public final f.h.c.a.p<ProxySelector> a;
    public final c b;
    public final InetSocketAddress c;

    /* compiled from: ProxyDetectorImpl.java */
    /* loaded from: classes2.dex */
    public class a implements c {
        @Override // g.a.v0.c2.c
        public PasswordAuthentication a(String str, InetAddress inetAddress, int i2, String str2, String str3, String str4) {
            URL url;
            try {
                url = new URL(str2, str, i2, "");
            } catch (MalformedURLException unused) {
                c2.f7620d.log(Level.WARNING, String.format("failed to create URL for Authenticator: %s %s", str2, str));
                url = null;
            }
            return Authenticator.requestPasswordAuthentication(str, inetAddress, i2, str2, str3, null, url, Authenticator.RequestorType.PROXY);
        }
    }

    /* compiled from: ProxyDetectorImpl.java */
    /* loaded from: classes2.dex */
    public class b implements f.h.c.a.p<ProxySelector> {
        @Override // f.h.c.a.p
        public ProxySelector get() {
            return ProxySelector.getDefault();
        }
    }

    /* compiled from: ProxyDetectorImpl.java */
    /* loaded from: classes2.dex */
    public interface c {
        PasswordAuthentication a(String str, InetAddress inetAddress, int i2, String str2, String str3, String str4);
    }

    public c2() {
        f.h.c.a.p<ProxySelector> pVar = f7622f;
        c cVar = f7621e;
        String str = System.getenv("GRPC_PROXY_EXP");
        Objects.requireNonNull(pVar);
        this.a = pVar;
        Objects.requireNonNull(cVar);
        this.b = cVar;
        if (str != null) {
            String[] split = str.split(":", 2);
            int parseInt = split.length > 1 ? Integer.parseInt(split[1]) : 80;
            f7620d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
            this.c = new InetSocketAddress(split[0], parseInt);
            return;
        }
        this.c = null;
    }

    @Override // g.a.p0
    public g.a.o0 a(SocketAddress socketAddress) {
        if (socketAddress instanceof InetSocketAddress) {
            InetSocketAddress inetSocketAddress = this.c;
            if (inetSocketAddress != null) {
                int i2 = g.a.u.f7569j;
                f.h.b.c.a.x(inetSocketAddress, "proxyAddress");
                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) socketAddress;
                f.h.b.c.a.x(inetSocketAddress2, "targetAddress");
                return new g.a.u(inetSocketAddress, inetSocketAddress2, null, null, null);
            }
            InetSocketAddress inetSocketAddress3 = (InetSocketAddress) socketAddress;
            try {
                try {
                    URI uri = new URI("https", null, GrpcUtil.c(inetSocketAddress3), inetSocketAddress3.getPort(), null, null, null);
                    ProxySelector proxySelector = this.a.get();
                    if (proxySelector == null) {
                        f7620d.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                        return null;
                    }
                    List<Proxy> select = proxySelector.select(uri);
                    if (select.size() > 1) {
                        f7620d.warning("More than 1 proxy detected, gRPC will select the first one");
                    }
                    Proxy proxy = select.get(0);
                    if (proxy.type() == Proxy.Type.DIRECT) {
                        return null;
                    }
                    InetSocketAddress inetSocketAddress4 = (InetSocketAddress) proxy.address();
                    PasswordAuthentication a2 = this.b.a(GrpcUtil.c(inetSocketAddress4), inetSocketAddress4.getAddress(), inetSocketAddress4.getPort(), "https", "", null);
                    InetSocketAddress inetSocketAddress5 = inetSocketAddress4.isUnresolved() ? new InetSocketAddress(InetAddress.getByName(inetSocketAddress4.getHostName()), inetSocketAddress4.getPort()) : inetSocketAddress4;
                    int i3 = g.a.u.f7569j;
                    f.h.b.c.a.x(inetSocketAddress3, "targetAddress");
                    f.h.b.c.a.x(inetSocketAddress5, "proxyAddress");
                    if (a2 == null) {
                        return new g.a.u(inetSocketAddress5, inetSocketAddress3, null, null, null);
                    }
                    return new g.a.u(inetSocketAddress5, inetSocketAddress3, a2.getUserName(), a2.getPassword() != null ? new String(a2.getPassword()) : null, null);
                } catch (URISyntaxException e2) {
                    f7620d.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e2);
                    return null;
                }
            } catch (Throwable th) {
                f7620d.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th);
                return null;
            }
        }
        return null;
    }
}
