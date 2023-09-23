package g.a;

import io.grpc.ConnectivityState;
import io.grpc.Status;

/* compiled from: ConnectivityStateInfo.java */
/* loaded from: classes2.dex */
public final class l {
    public final ConnectivityState a;
    public final Status b;

    public l(ConnectivityState connectivityState, Status status) {
        f.h.b.c.a.x(connectivityState, "state is null");
        this.a = connectivityState;
        f.h.b.c.a.x(status, "status is null");
        this.b = status;
    }

    public static l a(ConnectivityState connectivityState) {
        f.h.b.c.a.m(connectivityState != ConnectivityState.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new l(connectivityState, Status.f8685f);
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            return this.a.equals(lVar.a) && this.b.equals(lVar.b);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public String toString() {
        if (this.b.f()) {
            return this.a.toString();
        }
        return this.a + "(" + this.b + ")";
    }
}
