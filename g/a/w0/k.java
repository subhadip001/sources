package g.a.w0;

import g.a.w0.p.a;
import io.grpc.okhttp.internal.Protocol;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: OkHttpTlsUpgrader.java */
/* loaded from: classes2.dex */
public final class k {
    public static final List<Protocol> a = Collections.unmodifiableList(Arrays.asList(Protocol.HTTP_2));

    public static SSLSocket a(SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, Socket socket, String str, int i2, g.a.w0.p.a aVar) {
        f.h.b.c.a.x(sSLSocketFactory, "sslSocketFactory");
        f.h.b.c.a.x(socket, "socket");
        f.h.b.c.a.x(aVar, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i2, true);
        String[] strArr = aVar.b != null ? (String[]) g.a.w0.p.h.a(String.class, aVar.b, sSLSocket.getEnabledCipherSuites()) : null;
        String[] strArr2 = (String[]) g.a.w0.p.h.a(String.class, aVar.c, sSLSocket.getEnabledProtocols());
        a.b bVar = new a.b(aVar);
        if (bVar.a) {
            if (strArr == null) {
                bVar.b = null;
            } else {
                bVar.b = (String[]) strArr.clone();
            }
            if (bVar.a) {
                if (strArr2 == null) {
                    bVar.c = null;
                } else {
                    bVar.c = (String[]) strArr2.clone();
                }
                g.a.w0.p.a a2 = bVar.a();
                sSLSocket.setEnabledProtocols(a2.c);
                String[] strArr3 = a2.b;
                if (strArr3 != null) {
                    sSLSocket.setEnabledCipherSuites(strArr3);
                }
                String d2 = i.f8057d.d(sSLSocket, str, aVar.f8075d ? a : null);
                List<Protocol> list = a;
                boolean contains = list.contains(Protocol.get(d2));
                f.h.b.c.a.D(contains, "Only " + list + " are supported, but negotiated protocol is %s", d2);
                if (hostnameVerifier == null) {
                    hostnameVerifier = g.a.w0.p.c.a;
                }
                if (hostnameVerifier.verify((str.startsWith("[") && str.endsWith("]")) ? str.substring(1, str.length() - 1) : str, sSLSocket.getSession())) {
                    return sSLSocket;
                }
                throw new SSLPeerUnverifiedException(f.a.b.a.a.p("Cannot verify hostname: ", str));
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        throw new IllegalStateException("no cipher suites for cleartext connections");
    }
}
