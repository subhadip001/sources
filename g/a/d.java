package g.a;

import io.grpc.Status;

/* compiled from: ClientCall.java */
/* loaded from: classes2.dex */
public abstract class d<ReqT, RespT> {

    /* compiled from: ClientCall.java */
    /* loaded from: classes2.dex */
    public static abstract class a<T> {
        public abstract void a(Status status, i0 i0Var);

        public abstract void b(i0 i0Var);

        public abstract void c(T t);

        public void d() {
        }
    }

    public abstract void a(String str, Throwable th);

    public abstract void b();

    public abstract void c(int i2);

    public abstract void d(ReqT reqt);

    public abstract void e(a<RespT> aVar, i0 i0Var);
}
