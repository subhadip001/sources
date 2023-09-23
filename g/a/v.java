package g.a;

import java.security.cert.Certificate;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* compiled from: InternalChannelz.java */
/* loaded from: classes2.dex */
public final class v {

    /* renamed from: d  reason: collision with root package name */
    public static final Logger f7574d = Logger.getLogger(v.class.getName());

    /* renamed from: e  reason: collision with root package name */
    public static final v f7575e = new v();
    public final ConcurrentNavigableMap<Long, x<Object>> a;
    public final ConcurrentMap<Long, x<Object>> b;
    public final ConcurrentMap<Long, x<Object>> c;

    /* compiled from: InternalChannelz.java */
    /* loaded from: classes2.dex */
    public static final class b {
        public b(SSLSession sSLSession) {
            sSLSession.getCipherSuite();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                Certificate certificate = localCertificates[0];
            }
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                if (peerCertificates != null) {
                    Certificate certificate2 = peerCertificates[0];
                }
            } catch (SSLPeerUnverifiedException e2) {
                v.f7574d.log(Level.FINE, String.format("Peer cert not available for peerHost=%s", sSLSession.getPeerHost()), (Throwable) e2);
            }
        }
    }

    public v() {
        new ConcurrentSkipListMap();
        this.a = new ConcurrentSkipListMap();
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public static <T extends x<?>> void a(Map<Long, T> map, T t) {
        map.put(Long.valueOf(t.e().c), t);
    }

    public static <T extends x<?>> void b(Map<Long, T> map, T t) {
        map.remove(Long.valueOf(t.e().c));
    }
}
