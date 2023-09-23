package g.a;

import g.a.d;

/* compiled from: ForwardingClientCall.java */
/* loaded from: classes2.dex */
public abstract class s<ReqT, RespT> extends n0<ReqT, RespT> {

    /* compiled from: ForwardingClientCall.java */
    /* loaded from: classes2.dex */
    public static abstract class a<ReqT, RespT> extends s<ReqT, RespT> {
        public final d<ReqT, RespT> a;

        public a(d<ReqT, RespT> dVar) {
            this.a = dVar;
        }
    }

    @Override // g.a.d
    public void d(ReqT reqt) {
        ((a) this).a.d(reqt);
    }

    @Override // g.a.d
    public void e(d.a<RespT> aVar, i0 i0Var) {
        ((a) this).a.e(aVar, i0Var);
    }
}
