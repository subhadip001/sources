package k;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import okhttp3.TlsVersion;

/* compiled from: Handshake.java */
/* loaded from: classes2.dex */
public final class p {
    public final TlsVersion a;
    public final g b;
    public final List<Certificate> c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Certificate> f9132d;

    public p(TlsVersion tlsVersion, g gVar, List<Certificate> list, List<Certificate> list2) {
        this.a = tlsVersion;
        this.b = gVar;
        this.c = list;
        this.f9132d = list2;
    }

    public static p a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        List emptyList;
        List emptyList2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            g a = g.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol != null) {
                TlsVersion forJavaName = TlsVersion.forJavaName(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                if (certificateArr != null) {
                    emptyList = k.c0.c.o(certificateArr);
                } else {
                    emptyList = Collections.emptyList();
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                if (localCertificates != null) {
                    emptyList2 = k.c0.c.o(localCertificates);
                } else {
                    emptyList2 = Collections.emptyList();
                }
                return new p(forJavaName, a, emptyList, emptyList2);
            }
            throw new IllegalStateException("tlsVersion == null");
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            return this.a.equals(pVar.a) && this.b.equals(pVar.b) && this.c.equals(pVar.c) && this.f9132d.equals(pVar.f9132d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.f9132d.hashCode() + ((hashCode2 + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31)) * 31);
    }
}
