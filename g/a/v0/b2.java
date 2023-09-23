package g.a.v0;

import com.google.firebase.analytics.FirebaseAnalytics;
import g.a.c0;
import io.grpc.MethodDescriptor;
import java.util.Arrays;

/* compiled from: PickSubchannelArgsImpl.java */
/* loaded from: classes2.dex */
public final class b2 extends c0.f {
    public final g.a.b a;
    public final g.a.i0 b;
    public final MethodDescriptor<?, ?> c;

    public b2(MethodDescriptor<?, ?> methodDescriptor, g.a.i0 i0Var, g.a.b bVar) {
        f.h.b.c.a.x(methodDescriptor, FirebaseAnalytics.Param.METHOD);
        this.c = methodDescriptor;
        f.h.b.c.a.x(i0Var, "headers");
        this.b = i0Var;
        f.h.b.c.a.x(bVar, "callOptions");
        this.a = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b2.class != obj.getClass()) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return f.h.b.c.a.i0(this.a, b2Var.a) && f.h.b.c.a.i0(this.b, b2Var.b) && f.h.b.c.a.i0(this.c, b2Var.c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        StringBuilder A = f.a.b.a.a.A("[method=");
        A.append(this.c);
        A.append(" headers=");
        A.append(this.b);
        A.append(" callOptions=");
        A.append(this.a);
        A.append("]");
        return A.toString();
    }
}
