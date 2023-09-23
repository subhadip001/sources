package k.c0.k;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;
import org.conscrypt.OpenSSLProvider;

/* compiled from: ConscryptPlatform.java */
/* loaded from: classes2.dex */
public class b extends f {
    public static f m() {
        try {
            Class.forName("org.conscrypt.ConscryptEngineSocket");
            if (Conscrypt.isAvailable()) {
                Conscrypt.setUseEngineSocketByDefault(true);
                return new b();
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @Override // k.c0.k.f
    public void e(SSLSocket sSLSocket, String str, List<Protocol> list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) ((ArrayList) f.b(list)).toArray(new String[0]));
        }
    }

    @Override // k.c0.k.f
    public SSLContext g() {
        try {
            return SSLContext.getInstance("TLS", n());
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No TLS provider", e2);
        }
    }

    @Override // k.c0.k.f
    public String h(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    public final Provider n() {
        return new OpenSSLProvider();
    }
}
