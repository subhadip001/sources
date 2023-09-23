package k;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* compiled from: CipherSuite.java */
/* loaded from: classes2.dex */
public final class g {
    public static final Comparator<String> b;
    public static final Map<String, g> c;

    /* renamed from: d  reason: collision with root package name */
    public static final g f9101d;

    /* renamed from: e  reason: collision with root package name */
    public static final g f9102e;

    /* renamed from: f  reason: collision with root package name */
    public static final g f9103f;

    /* renamed from: g  reason: collision with root package name */
    public static final g f9104g;

    /* renamed from: h  reason: collision with root package name */
    public static final g f9105h;

    /* renamed from: i  reason: collision with root package name */
    public static final g f9106i;

    /* renamed from: j  reason: collision with root package name */
    public static final g f9107j;

    /* renamed from: k  reason: collision with root package name */
    public static final g f9108k;

    /* renamed from: l  reason: collision with root package name */
    public static final g f9109l;

    /* renamed from: m  reason: collision with root package name */
    public static final g f9110m;
    public static final g n;
    public static final g o;
    public static final g p;
    public final String a;

    /* compiled from: CipherSuite.java */
    /* loaded from: classes2.dex */
    public class a implements Comparator<String> {
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
            return 1;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int compare(java.lang.String r7, java.lang.String r8) {
            /*
                r6 = this;
                java.lang.String r7 = (java.lang.String) r7
                java.lang.String r8 = (java.lang.String) r8
                int r0 = r7.length()
                int r1 = r8.length()
                int r0 = java.lang.Math.min(r0, r1)
                r1 = 4
            L11:
                r2 = -1
                r3 = 1
                if (r1 >= r0) goto L27
                char r4 = r7.charAt(r1)
                char r5 = r8.charAt(r1)
                if (r4 == r5) goto L24
                if (r4 >= r5) goto L22
                goto L35
            L22:
                r2 = 1
                goto L35
            L24:
                int r1 = r1 + 1
                goto L11
            L27:
                int r7 = r7.length()
                int r8 = r8.length()
                if (r7 == r8) goto L34
                if (r7 >= r8) goto L22
                goto L35
            L34:
                r2 = 0
            L35:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: k.g.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    static {
        a aVar = new a();
        b = aVar;
        c = new TreeMap(aVar);
        a("SSL_RSA_WITH_NULL_MD5");
        a("SSL_RSA_WITH_NULL_SHA");
        a("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        a("SSL_RSA_WITH_RC4_128_MD5");
        a("SSL_RSA_WITH_RC4_128_SHA");
        a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        a("SSL_RSA_WITH_DES_CBC_SHA");
        f9101d = a("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        a("SSL_DHE_DSS_WITH_DES_CBC_SHA");
        a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        a("SSL_DHE_RSA_WITH_DES_CBC_SHA");
        a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        a("SSL_DH_anon_WITH_RC4_128_MD5");
        a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        a("SSL_DH_anon_WITH_DES_CBC_SHA");
        a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        a("TLS_KRB5_WITH_DES_CBC_SHA");
        a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        a("TLS_KRB5_WITH_RC4_128_SHA");
        a("TLS_KRB5_WITH_DES_CBC_MD5");
        a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        a("TLS_KRB5_WITH_RC4_128_MD5");
        a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        f9102e = a("TLS_RSA_WITH_AES_128_CBC_SHA");
        a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        a("TLS_DH_anon_WITH_AES_128_CBC_SHA");
        f9103f = a("TLS_RSA_WITH_AES_256_CBC_SHA");
        a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        a("TLS_DH_anon_WITH_AES_256_CBC_SHA");
        a("TLS_RSA_WITH_NULL_SHA256");
        a("TLS_RSA_WITH_AES_128_CBC_SHA256");
        a("TLS_RSA_WITH_AES_256_CBC_SHA256");
        a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        a("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        a("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        a("TLS_PSK_WITH_RC4_128_SHA");
        a("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        a("TLS_PSK_WITH_AES_128_CBC_SHA");
        a("TLS_PSK_WITH_AES_256_CBC_SHA");
        a("TLS_RSA_WITH_SEED_CBC_SHA");
        f9104g = a("TLS_RSA_WITH_AES_128_GCM_SHA256");
        f9105h = a("TLS_RSA_WITH_AES_256_GCM_SHA384");
        a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        a("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        a("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        a("TLS_FALLBACK_SCSV");
        a("TLS_ECDH_ECDSA_WITH_NULL_SHA");
        a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        a("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        a("TLS_ECDH_RSA_WITH_NULL_SHA");
        a("TLS_ECDH_RSA_WITH_RC4_128_SHA");
        a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        a("TLS_ECDHE_RSA_WITH_NULL_SHA");
        a("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        f9106i = a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        f9107j = a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        a("TLS_ECDH_anon_WITH_NULL_SHA");
        a("TLS_ECDH_anon_WITH_RC4_128_SHA");
        a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        f9108k = a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        f9109l = a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        f9110m = a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        n = a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        o = a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        p = a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
    }

    public g(String str) {
        Objects.requireNonNull(str);
        this.a = str;
    }

    public static synchronized g a(String str) {
        g gVar;
        synchronized (g.class) {
            Map<String, g> map = c;
            gVar = map.get(str);
            if (gVar == null) {
                gVar = new g(str);
                map.put(str, gVar);
            }
        }
        return gVar;
    }

    public String toString() {
        return this.a;
    }
}
