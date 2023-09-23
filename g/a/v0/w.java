package g.a.v0;

import io.grpc.MethodDescriptor;
import java.util.concurrent.Executor;

/* compiled from: ClientTransport.java */
/* loaded from: classes2.dex */
public interface w extends g.a.x<Object> {

    /* compiled from: ClientTransport.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(Throwable th);

        void b(long j2);
    }

    void f(a aVar, Executor executor);

    v g(MethodDescriptor<?, ?> methodDescriptor, g.a.i0 i0Var, g.a.b bVar);
}
