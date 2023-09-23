package k;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import k.r;
import okhttp3.Protocol;

/* compiled from: Address.java */
/* loaded from: classes2.dex */
public final class a {
    public final r a;
    public final m b;
    public final SocketFactory c;

    /* renamed from: d  reason: collision with root package name */
    public final b f8846d;

    /* renamed from: e  reason: collision with root package name */
    public final List<Protocol> f8847e;

    /* renamed from: f  reason: collision with root package name */
    public final List<i> f8848f;

    /* renamed from: g  reason: collision with root package name */
    public final ProxySelector f8849g;

    /* renamed from: h  reason: collision with root package name */
    public final Proxy f8850h;

    /* renamed from: i  reason: collision with root package name */
    public final SSLSocketFactory f8851i;

    /* renamed from: j  reason: collision with root package name */
    public final HostnameVerifier f8852j;

    /* renamed from: k  reason: collision with root package name */
    public final f f8853k;

    public a(String str, int i2, m mVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f fVar, b bVar, Proxy proxy, List<Protocol> list, List<i> list2, ProxySelector proxySelector) {
        r.a aVar = new r.a();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            aVar.a = "http";
        } else if (str2.equalsIgnoreCase("https")) {
            aVar.a = "https";
        } else {
            throw new IllegalArgumentException(f.a.b.a.a.p("unexpected scheme: ", str2));
        }
        Objects.requireNonNull(str, "host == null");
        String b = k.c0.c.b(r.j(str, 0, str.length(), false));
        if (b != null) {
            aVar.f9140d = b;
            if (i2 > 0 && i2 <= 65535) {
                aVar.f9141e = i2;
                this.a = aVar.a();
                Objects.requireNonNull(mVar, "dns == null");
                this.b = mVar;
                Objects.requireNonNull(socketFactory, "socketFactory == null");
                this.c = socketFactory;
                Objects.requireNonNull(bVar, "proxyAuthenticator == null");
                this.f8846d = bVar;
                Objects.requireNonNull(list, "protocols == null");
                this.f8847e = k.c0.c.n(list);
                Objects.requireNonNull(list2, "connectionSpecs == null");
                this.f8848f = k.c0.c.n(list2);
                Objects.requireNonNull(proxySelector, "proxySelector == null");
                this.f8849g = proxySelector;
                this.f8850h = null;
                this.f8851i = sSLSocketFactory;
                this.f8852j = hostnameVerifier;
                this.f8853k = fVar;
                return;
            }
            throw new IllegalArgumentException(f.a.b.a.a.i("unexpected port: ", i2));
        }
        throw new IllegalArgumentException(f.a.b.a.a.p("unexpected host: ", str));
    }

    public boolean a(a aVar) {
        return this.b.equals(aVar.b) && this.f8846d.equals(aVar.f8846d) && this.f8847e.equals(aVar.f8847e) && this.f8848f.equals(aVar.f8848f) && this.f8849g.equals(aVar.f8849g) && k.c0.c.k(this.f8850h, aVar.f8850h) && k.c0.c.k(this.f8851i, aVar.f8851i) && k.c0.c.k(this.f8852j, aVar.f8852j) && k.c0.c.k(this.f8853k, aVar.f8853k) && this.a.f9135e == aVar.a.f9135e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.a.equals(aVar.a) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.f8846d.hashCode();
        int hashCode3 = this.f8847e.hashCode();
        int hashCode4 = (this.f8849g.hashCode() + ((this.f8848f.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Proxy proxy = this.f8850h;
        int hashCode5 = (hashCode4 + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f8851i;
        int hashCode6 = (hashCode5 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f8852j;
        int hashCode7 = (hashCode6 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        f fVar = this.f8853k;
        return hashCode7 + (fVar != null ? fVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("Address{");
        A.append(this.a.f9134d);
        A.append(":");
        A.append(this.a.f9135e);
        if (this.f8850h != null) {
            A.append(", proxy=");
            A.append(this.f8850h);
        } else {
            A.append(", proxySelector=");
            A.append(this.f8849g);
        }
        A.append("}");
        return A.toString();
    }
}
