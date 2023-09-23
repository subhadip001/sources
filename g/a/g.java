package g.a;

import io.grpc.MethodDescriptor;
import java.util.List;

/* compiled from: ClientInterceptors.java */
/* loaded from: classes2.dex */
public class g {

    /* compiled from: ClientInterceptors.java */
    /* loaded from: classes2.dex */
    public static class a extends c {
        public final c a;
        public final e b;

        public a(c cVar, e eVar, f fVar) {
            this.a = cVar;
            f.h.b.c.a.x(eVar, "interceptor");
            this.b = eVar;
        }

        @Override // g.a.c
        public String a() {
            return this.a.a();
        }

        @Override // g.a.c
        public <ReqT, RespT> d<ReqT, RespT> h(MethodDescriptor<ReqT, RespT> methodDescriptor, b bVar) {
            return this.b.a(methodDescriptor, bVar, this.a);
        }
    }

    public static c a(c cVar, List<? extends e> list) {
        f.h.b.c.a.x(cVar, "channel");
        for (e eVar : list) {
            cVar = new a(cVar, eVar, null);
        }
        return cVar;
    }
}
