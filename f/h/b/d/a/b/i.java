package f.h.b.d.a.b;

import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class i extends f.h.b.d.a.e.g {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f.h.b.d.a.i.m f5631g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ r f5632h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar, f.h.b.d.a.i.m mVar, f.h.b.d.a.i.m mVar2) {
        super(mVar);
        this.f5632h = rVar;
        this.f5631g = mVar2;
    }

    @Override // f.h.b.d.a.e.g
    public final void a() {
        try {
            r rVar = this.f5632h;
            ((f.h.b.d.a.e.i0) rVar.f5689e.n).k(rVar.a, r.f(), new n(this.f5632h, this.f5631g));
        } catch (RemoteException e2) {
            r.f5686g.c(e2, "keepAlive", new Object[0]);
        }
    }
}
