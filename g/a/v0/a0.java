package g.a.v0;

import io.grpc.ConnectivityState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: ConnectivityStateManager.java */
/* loaded from: classes2.dex */
public final class a0 {
    public ArrayList<a> a = new ArrayList<>();
    public volatile ConnectivityState b = ConnectivityState.IDLE;

    /* compiled from: ConnectivityStateManager.java */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    public void a(ConnectivityState connectivityState) {
        f.h.b.c.a.x(connectivityState, "newState");
        if (this.b == connectivityState || this.b == ConnectivityState.SHUTDOWN) {
            return;
        }
        this.b = connectivityState;
        if (this.a.isEmpty()) {
            return;
        }
        ArrayList<a> arrayList = this.a;
        this.a = new ArrayList<>();
        Iterator<a> it = arrayList.iterator();
        if (it.hasNext()) {
            Objects.requireNonNull(it.next());
            throw null;
        }
    }
}
