package k;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.TlsVersion;

/* compiled from: ConnectionSpec.java */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: e  reason: collision with root package name */
    public static final g[] f9116e;

    /* renamed from: f  reason: collision with root package name */
    public static final i f9117f;

    /* renamed from: g  reason: collision with root package name */
    public static final i f9118g;
    public final boolean a;
    public final boolean b;
    public final String[] c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f9119d;

    static {
        g[] gVarArr = {g.f9108k, g.f9110m, g.f9109l, g.n, g.p, g.o, g.f9106i, g.f9107j, g.f9104g, g.f9105h, g.f9102e, g.f9103f, g.f9101d};
        f9116e = gVarArr;
        a aVar = new a(true);
        String[] strArr = new String[13];
        for (int i2 = 0; i2 < 13; i2++) {
            strArr[i2] = gVarArr[i2].a;
        }
        aVar.a(strArr);
        TlsVersion tlsVersion = TlsVersion.TLS_1_0;
        aVar.c(TlsVersion.TLS_1_3, TlsVersion.TLS_1_2, TlsVersion.TLS_1_1, tlsVersion);
        if (aVar.a) {
            aVar.f9120d = true;
            i iVar = new i(aVar);
            f9117f = iVar;
            a aVar2 = new a(iVar);
            aVar2.c(tlsVersion);
            if (aVar2.a) {
                aVar2.f9120d = true;
                f9118g = new i(new a(false));
                return;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
    }

    public i(a aVar) {
        this.a = aVar.a;
        this.c = aVar.b;
        this.f9119d = aVar.c;
        this.b = aVar.f9120d;
    }

    public boolean a(SSLSocket sSLSocket) {
        if (this.a) {
            String[] strArr = this.f9119d;
            if (strArr == null || k.c0.c.s(k.c0.c.f8881f, strArr, sSLSocket.getEnabledProtocols())) {
                String[] strArr2 = this.c;
                return strArr2 == null || k.c0.c.s(g.b, strArr2, sSLSocket.getEnabledCipherSuites());
            }
            return false;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            if (obj == this) {
                return true;
            }
            i iVar = (i) obj;
            boolean z = this.a;
            if (z != iVar.a) {
                return false;
            }
            return !z || (Arrays.equals(this.c, iVar.c) && Arrays.equals(this.f9119d, iVar.f9119d) && this.b == iVar.b);
        }
        return false;
    }

    public int hashCode() {
        if (this.a) {
            return ((((527 + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.f9119d)) * 31) + (!this.b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        String str;
        List list;
        if (this.a) {
            String[] strArr = this.c;
            List list2 = null;
            String str2 = "[all enabled]";
            if (strArr != null) {
                if (strArr != null) {
                    ArrayList arrayList = new ArrayList(strArr.length);
                    for (String str3 : strArr) {
                        arrayList.add(g.a(str3));
                    }
                    list = Collections.unmodifiableList(arrayList);
                } else {
                    list = null;
                }
                str = list.toString();
            } else {
                str = "[all enabled]";
            }
            String[] strArr2 = this.f9119d;
            if (strArr2 != null) {
                if (strArr2 != null) {
                    ArrayList arrayList2 = new ArrayList(strArr2.length);
                    for (String str4 : strArr2) {
                        arrayList2.add(TlsVersion.forJavaName(str4));
                    }
                    list2 = Collections.unmodifiableList(arrayList2);
                }
                str2 = list2.toString();
            }
            StringBuilder F = f.a.b.a.a.F("ConnectionSpec(cipherSuites=", str, ", tlsVersions=", str2, ", supportsTlsExtensions=");
            F.append(this.b);
            F.append(")");
            return F.toString();
        }
        return "ConnectionSpec()";
    }

    /* compiled from: ConnectionSpec.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public boolean a;
        public String[] b;
        public String[] c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f9120d;

        public a(boolean z) {
            this.a = z;
        }

        public a a(String... strArr) {
            if (this.a) {
                if (strArr.length != 0) {
                    this.b = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a b(String... strArr) {
            if (this.a) {
                if (strArr.length != 0) {
                    this.c = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a c(TlsVersion... tlsVersionArr) {
            if (this.a) {
                String[] strArr = new String[tlsVersionArr.length];
                for (int i2 = 0; i2 < tlsVersionArr.length; i2++) {
                    strArr[i2] = tlsVersionArr[i2].javaName;
                }
                b(strArr);
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a(i iVar) {
            this.a = iVar.a;
            this.b = iVar.c;
            this.c = iVar.f9119d;
            this.f9120d = iVar.b;
        }
    }
}
