package g.a.v0;

import g.a.d;
import g.a.v0.q;
import io.grpc.Status;
import java.util.Objects;

/* compiled from: ClientCallImpl.java */
/* loaded from: classes2.dex */
public final class u extends b0 {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Status f7933g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ g.a.i0 f7934h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ q.b f7935i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(q.b bVar, g.b.b bVar2, Status status, g.a.i0 i0Var) {
        super(q.this.f7882f);
        this.f7935i = bVar;
        this.f7933g = status;
        this.f7934h = i0Var;
    }

    @Override // g.a.v0.b0
    public void a() {
        g.b.d dVar = q.this.b;
        g.b.a aVar = g.b.c.a;
        Objects.requireNonNull(aVar);
        Objects.requireNonNull(aVar);
        try {
            b();
            g.b.d dVar2 = q.this.b;
            Objects.requireNonNull(aVar);
        } catch (Throwable th) {
            g.b.d dVar3 = q.this.b;
            Objects.requireNonNull(g.b.c.a);
            throw th;
        }
    }

    public final void b() {
        Status status = this.f7933g;
        g.a.i0 i0Var = this.f7934h;
        Status status2 = this.f7935i.b;
        if (status2 != null) {
            i0Var = new g.a.i0();
            status = status2;
        }
        q.this.f7886j = true;
        try {
            q.b bVar = this.f7935i;
            q qVar = q.this;
            d.a<RespT> aVar = bVar.a;
            if (!qVar.u) {
                qVar.u = true;
                aVar.a(status, i0Var);
            }
        } finally {
            q.this.h();
            q.this.f7881e.a(status.f());
        }
    }
}
