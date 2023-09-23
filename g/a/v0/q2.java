package g.a.v0;

import g.a.v0.t2;
import g.a.v0.v1;
import io.grpc.internal.GrpcUtil;
import java.io.Closeable;

/* compiled from: SquelchLateMessagesAvailableDeframerListener.java */
/* loaded from: classes2.dex */
public final class q2 extends p0 {
    public final v1.b a;
    public boolean b;

    public q2(v1.b bVar) {
        this.a = bVar;
    }

    @Override // g.a.v0.v1.b
    public void a(t2.a aVar) {
        if (this.b) {
            if (aVar instanceof Closeable) {
                GrpcUtil.b((Closeable) aVar);
                return;
            }
            return;
        }
        this.a.a(aVar);
    }

    @Override // g.a.v0.v1.b
    public void b(boolean z) {
        this.b = true;
        this.a.b(z);
    }

    @Override // g.a.v0.v1.b
    public void d(Throwable th) {
        this.b = true;
        this.a.d(th);
    }
}
