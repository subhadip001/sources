package g.a;

import g.a.a;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: EquivalentAddressGroup.java */
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: d  reason: collision with root package name */
    public static final a.c<String> f7559d = new a.c<>("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");
    public final List<SocketAddress> a;
    public final a b;
    public final int c;

    public r(List<SocketAddress> list, a aVar) {
        f.h.b.c.a.m(!list.isEmpty(), "addrs is empty");
        List<SocketAddress> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.a = unmodifiableList;
        f.h.b.c.a.x(aVar, "attrs");
        this.b = aVar;
        this.c = unmodifiableList.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.a.size() != rVar.a.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.a.size(); i2++) {
                if (!this.a.get(i2).equals(rVar.a.get(i2))) {
                    return false;
                }
            }
            return this.b.equals(rVar.b);
        }
        return false;
    }

    public int hashCode() {
        return this.c;
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("[");
        A.append(this.a);
        A.append("/");
        A.append(this.b);
        A.append("]");
        return A.toString();
    }
}
