package k.c0.k;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import k.t;
import okhttp3.Protocol;

/* compiled from: Platform.java */
/* loaded from: classes2.dex */
public class f {
    public static final f a;
    public static final Logger b;

    static {
        Class<?> cls;
        f fVar;
        boolean z;
        e eVar;
        e eVar2;
        d dVar = null;
        try {
            try {
                cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException unused) {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            }
            Class<?> cls2 = cls;
            e eVar3 = new e(null, "setUseSessionTickets", Boolean.TYPE);
            e eVar4 = new e(null, "setHostname", String.class);
            if (Security.getProvider("GMSCore_OpenSSL") == null) {
                try {
                    Class.forName("android.net.Network");
                } catch (ClassNotFoundException unused2) {
                    z = false;
                }
            }
            z = true;
            if (z) {
                eVar = new e(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                eVar2 = new e(null, "setAlpnProtocols", byte[].class);
            } else {
                eVar = null;
                eVar2 = null;
            }
            fVar = new a(cls2, eVar3, eVar4, eVar, eVar2);
        } catch (ClassNotFoundException unused3) {
            fVar = null;
        }
        if (fVar == null) {
            if (!("conscrypt".equals(System.getProperty("okhttp.platform")) ? true : "Conscrypt".equals(Security.getProviders()[0].getName())) || (fVar = b.m()) == null) {
                try {
                    fVar = new c(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
                } catch (NoSuchMethodException unused4) {
                    fVar = null;
                }
                if (fVar == null) {
                    try {
                        Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                        dVar = new d(cls3.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls3.getMethod("get", SSLSocket.class), cls3.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
                    } catch (ClassNotFoundException | NoSuchMethodException unused5) {
                    }
                    fVar = dVar != null ? dVar : new f();
                }
            }
        }
        a = fVar;
        b = Logger.getLogger(t.class.getName());
    }

    public static List<String> b(List<Protocol> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Protocol protocol = list.get(i2);
            if (protocol != Protocol.HTTP_1_0) {
                arrayList.add(protocol.toString());
            }
        }
        return arrayList;
    }

    public void a(SSLSocket sSLSocket) {
    }

    public k.c0.l.c c(X509TrustManager x509TrustManager) {
        return new k.c0.l.a(d(x509TrustManager));
    }

    public k.c0.l.e d(X509TrustManager x509TrustManager) {
        return new k.c0.l.b(x509TrustManager.getAcceptedIssuers());
    }

    public void e(SSLSocket sSLSocket, String str, List<Protocol> list) {
    }

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        socket.connect(inetSocketAddress, i2);
    }

    public SSLContext g() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No TLS provider", e2);
        }
    }

    public String h(SSLSocket sSLSocket) {
        return null;
    }

    public Object i(String str) {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean j(String str) {
        return true;
    }

    public void k(int i2, String str, Throwable th) {
        b.log(i2 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void l(String str, Object obj) {
        if (obj == null) {
            str = f.a.b.a.a.p(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        k(5, str, (Throwable) obj);
    }
}
