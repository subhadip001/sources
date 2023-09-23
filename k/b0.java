package k;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Objects;

/* compiled from: Route.java */
/* loaded from: classes2.dex */
public final class b0 {
    public final a a;
    public final Proxy b;
    public final InetSocketAddress c;

    public b0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        Objects.requireNonNull(aVar, "address == null");
        Objects.requireNonNull(inetSocketAddress, "inetSocketAddress == null");
        this.a = aVar;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public boolean a() {
        return this.a.f8851i != null && this.b.type() == Proxy.Type.HTTP;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (b0Var.a.equals(this.a) && b0Var.b.equals(this.b) && b0Var.c.equals(this.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("Route{");
        A.append(this.c);
        A.append("}");
        return A.toString();
    }
}
