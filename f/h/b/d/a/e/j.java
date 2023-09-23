package f.h.b.d.a.e;

import com.google.android.play.core.internal.zzat;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class j extends g {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ g f5793g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ q f5794h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q qVar, f.h.b.d.a.i.m mVar, g gVar) {
        super(mVar);
        this.f5794h = qVar;
        this.f5793g = gVar;
    }

    @Override // f.h.b.d.a.e.g
    public final void a() {
        q qVar = this.f5794h;
        g gVar = this.f5793g;
        if (qVar.n != null || qVar.f5803g) {
            if (qVar.f5803g) {
                qVar.b.d("Waiting to bind to the service.", new Object[0]);
                qVar.f5800d.add(gVar);
                return;
            }
            gVar.run();
            return;
        }
        qVar.b.d("Initiate binding to the service.", new Object[0]);
        qVar.f5800d.add(gVar);
        p pVar = new p(qVar);
        qVar.f5809m = pVar;
        qVar.f5803g = true;
        if (qVar.a.bindService(qVar.f5804h, pVar, 1)) {
            return;
        }
        qVar.b.d("Failed to bind to the service.", new Object[0]);
        qVar.f5803g = false;
        for (g gVar2 : qVar.f5800d) {
            zzat zzatVar = new zzat();
            f.h.b.d.a.i.m mVar = gVar2.f5791f;
            if (mVar != null) {
                mVar.a(zzatVar);
            }
        }
        qVar.f5800d.clear();
    }
}
