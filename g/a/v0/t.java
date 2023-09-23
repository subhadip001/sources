package g.a.v0;

import io.grpc.Status;

/* compiled from: ClientCallImpl.java */
/* loaded from: classes2.dex */
public class t implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Status f7909f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ q f7910g;

    public t(q qVar, Status status) {
        this.f7910g = qVar;
        this.f7909f = status;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7910g.f7885i.j(this.f7909f);
    }
}
