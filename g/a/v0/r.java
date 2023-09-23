package g.a.v0;

import g.a.d;
import io.grpc.Status;

/* compiled from: ClientCallImpl.java */
/* loaded from: classes2.dex */
public class r extends b0 {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ d.a f7896g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Status f7897h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ q f7898i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q qVar, d.a aVar, Status status) {
        super(qVar.f7882f);
        this.f7898i = qVar;
        this.f7896g = aVar;
        this.f7897h = status;
    }

    @Override // g.a.v0.b0
    public void a() {
        q qVar = this.f7898i;
        d.a aVar = this.f7896g;
        Status status = this.f7897h;
        g.a.i0 i0Var = new g.a.i0();
        if (qVar.u) {
            return;
        }
        qVar.u = true;
        aVar.a(status, i0Var);
    }
}
