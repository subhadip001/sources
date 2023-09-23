package g.a.y0;

import g.a.d;
import g.a.e;
import g.a.i0;
import g.a.s;
import io.grpc.MethodDescriptor;

/* compiled from: MetadataUtils.java */
/* loaded from: classes2.dex */
public final class d implements e {
    public final i0 a;

    /* compiled from: MetadataUtils.java */
    /* loaded from: classes2.dex */
    public final class a<ReqT, RespT> extends s.a<ReqT, RespT> {
        public a(g.a.d<ReqT, RespT> dVar) {
            super(dVar);
        }

        @Override // g.a.s, g.a.d
        public void e(d.a<RespT> aVar, i0 i0Var) {
            i0Var.f(d.this.a);
            this.a.e(aVar, i0Var);
        }
    }

    public d(i0 i0Var) {
        f.h.b.c.a.x(i0Var, "extraHeaders");
        this.a = i0Var;
    }

    @Override // g.a.e
    public <ReqT, RespT> g.a.d<ReqT, RespT> a(MethodDescriptor<ReqT, RespT> methodDescriptor, g.a.b bVar, g.a.c cVar) {
        return new a(cVar.h(methodDescriptor, bVar));
    }
}
