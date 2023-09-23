package g.a.v0;

import io.grpc.Status;

/* compiled from: ManagedClientTransport.java */
/* loaded from: classes2.dex */
public interface u1 extends w {

    /* compiled from: ManagedClientTransport.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(Status status);

        void b();

        void c();

        void d(boolean z);
    }

    void b(Status status);

    void c(Status status);

    Runnable d(a aVar);
}
