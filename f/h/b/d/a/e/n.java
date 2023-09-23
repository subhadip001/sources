package f.h.b.d.a.e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class n extends g {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ IBinder f5796g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ p f5797h;

    public n(p pVar, IBinder iBinder) {
        this.f5797h = pVar;
        this.f5796g = iBinder;
    }

    @Override // f.h.b.d.a.e.g
    public final void a() {
        q qVar = this.f5797h.f5799f;
        qVar.n = (IInterface) qVar.f5805i.a(this.f5796g);
        q qVar2 = this.f5797h.f5799f;
        qVar2.b.d("linkToDeath", new Object[0]);
        try {
            qVar2.n.asBinder().linkToDeath(qVar2.f5807k, 0);
        } catch (RemoteException e2) {
            qVar2.b.c(e2, "linkToDeath failed", new Object[0]);
        }
        q qVar3 = this.f5797h.f5799f;
        qVar3.f5803g = false;
        for (Runnable runnable : qVar3.f5800d) {
            runnable.run();
        }
        this.f5797h.f5799f.f5800d.clear();
    }
}
