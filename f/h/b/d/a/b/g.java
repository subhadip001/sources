package f.h.b.d.a.b;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class g extends f.h.b.d.a.e.g {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f5610g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ f.h.b.d.a.i.m f5611h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ r f5612i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r rVar, f.h.b.d.a.i.m mVar, int i2, f.h.b.d.a.i.m mVar2) {
        super(mVar);
        this.f5612i = rVar;
        this.f5610g = i2;
        this.f5611h = mVar2;
    }

    @Override // f.h.b.d.a.e.g
    public final void a() {
        try {
            r rVar = this.f5612i;
            String str = rVar.a;
            int i2 = this.f5610g;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i2);
            ((f.h.b.d.a.e.i0) rVar.f5688d.n).l(str, bundle, r.f(), new q(this.f5612i, this.f5611h));
        } catch (RemoteException e2) {
            r.f5686g.c(e2, "notifySessionFailed", new Object[0]);
        }
    }
}
