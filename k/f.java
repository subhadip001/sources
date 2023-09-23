package k;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: CertificatePinner.java */
/* loaded from: classes2.dex */
public final class f {
    public static final f c = new f(new LinkedHashSet(new ArrayList()), null);
    public final Set<a> a;
    public final k.c0.l.c b;

    /* compiled from: CertificatePinner.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public boolean equals(Object obj) {
            if (obj instanceof a) {
                Objects.requireNonNull((a) obj);
                throw null;
            }
            return false;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            new StringBuilder().append((String) null);
            throw null;
        }
    }

    public f(Set<a> set, k.c0.l.c cVar) {
        this.a = set;
        this.b = cVar;
    }

    public static String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder A = f.a.b.a.a.A("sha256/");
            A.append(l.i.m(((X509Certificate) certificate).getPublicKey().getEncoded()).i("SHA-256").a());
            return A.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    public void a(String str, List<Certificate> list) {
        List emptyList = Collections.emptyList();
        Iterator<a> it = this.a.iterator();
        if (!it.hasNext()) {
            if (emptyList.isEmpty()) {
                return;
            }
            k.c0.l.c cVar = this.b;
            if (cVar != null) {
                list = cVar.a(list, str);
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i2);
                if (emptyList.size() > 0) {
                    Objects.requireNonNull((a) emptyList.get(0));
                    throw null;
                }
            }
            StringBuilder D = f.a.b.a.a.D("Certificate pinning failure!", "\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
                D.append("\n    ");
                D.append(b(x509Certificate2));
                D.append(": ");
                D.append(x509Certificate2.getSubjectDN().getName());
            }
            D.append("\n  Pinned certificates for ");
            D.append(str);
            D.append(":");
            int size3 = emptyList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                D.append("\n    ");
                D.append((a) emptyList.get(i4));
            }
            throw new SSLPeerUnverifiedException(D.toString());
        }
        Objects.requireNonNull(it.next());
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (k.c0.c.k(this.b, fVar.b) && this.a.equals(fVar.a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        k.c0.l.c cVar = this.b;
        return this.a.hashCode() + ((cVar != null ? cVar.hashCode() : 0) * 31);
    }
}
