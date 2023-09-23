package g.a.w0.p;

import io.grpc.okhttp.internal.CipherSuite;
import io.grpc.okhttp.internal.TlsVersion;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: ConnectionSpec.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final CipherSuite[] f8073e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f8074f;
    public final boolean a;
    public final String[] b;
    public final String[] c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f8075d;

    static {
        CipherSuite[] cipherSuiteArr = {CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_DHE_DSS_WITH_AES_128_CBC_SHA, CipherSuite.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f8073e = cipherSuiteArr;
        b bVar = new b(true);
        bVar.b(cipherSuiteArr);
        TlsVersion tlsVersion = TlsVersion.TLS_1_0;
        bVar.d(TlsVersion.TLS_1_2, TlsVersion.TLS_1_1, tlsVersion);
        bVar.c(true);
        a a = bVar.a();
        f8074f = a;
        b bVar2 = new b(a);
        bVar2.d(tlsVersion);
        bVar2.c(true);
        bVar2.a();
        new b(false).a();
    }

    public a(b bVar, C0200a c0200a) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.f8075d = bVar.f8076d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (obj == this) {
                return true;
            }
            a aVar = (a) obj;
            boolean z = this.a;
            if (z != aVar.a) {
                return false;
            }
            return !z || (Arrays.equals(this.b, aVar.b) && Arrays.equals(this.c, aVar.c) && this.f8075d == aVar.f8075d);
        }
        return false;
    }

    public int hashCode() {
        if (this.a) {
            return ((((527 + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c)) * 31) + (!this.f8075d ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        List unmodifiableList;
        if (!this.a) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.b;
        int i2 = 0;
        if (strArr == null) {
            unmodifiableList = null;
        } else {
            CipherSuite[] cipherSuiteArr = new CipherSuite[strArr.length];
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.b;
                if (i3 >= strArr2.length) {
                    break;
                }
                cipherSuiteArr[i3] = CipherSuite.forJavaName(strArr2[i3]);
                i3++;
            }
            String[] strArr3 = h.a;
            unmodifiableList = Collections.unmodifiableList(Arrays.asList((Object[]) cipherSuiteArr.clone()));
        }
        StringBuilder E = f.a.b.a.a.E("ConnectionSpec(cipherSuites=", unmodifiableList == null ? "[use default]" : unmodifiableList.toString(), ", tlsVersions=");
        TlsVersion[] tlsVersionArr = new TlsVersion[this.c.length];
        while (true) {
            String[] strArr4 = this.c;
            if (i2 < strArr4.length) {
                tlsVersionArr[i2] = TlsVersion.forJavaName(strArr4[i2]);
                i2++;
            } else {
                String[] strArr5 = h.a;
                E.append(Collections.unmodifiableList(Arrays.asList((Object[]) tlsVersionArr.clone())));
                E.append(", supportsTlsExtensions=");
                E.append(this.f8075d);
                E.append(")");
                return E.toString();
            }
        }
    }

    /* compiled from: ConnectionSpec.java */
    /* loaded from: classes2.dex */
    public static final class b {
        public boolean a;
        public String[] b;
        public String[] c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f8076d;

        public b(boolean z) {
            this.a = z;
        }

        public a a() {
            return new a(this, null);
        }

        public b b(CipherSuite... cipherSuiteArr) {
            if (this.a) {
                String[] strArr = new String[cipherSuiteArr.length];
                for (int i2 = 0; i2 < cipherSuiteArr.length; i2++) {
                    strArr[i2] = cipherSuiteArr[i2].javaName;
                }
                this.b = strArr;
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public b c(boolean z) {
            if (this.a) {
                this.f8076d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public b d(TlsVersion... tlsVersionArr) {
            if (this.a) {
                if (tlsVersionArr.length != 0) {
                    String[] strArr = new String[tlsVersionArr.length];
                    for (int i2 = 0; i2 < tlsVersionArr.length; i2++) {
                        strArr[i2] = tlsVersionArr[i2].javaName;
                    }
                    this.c = strArr;
                    return this;
                }
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public b(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.f8076d = aVar.f8075d;
        }
    }
}
