package f.h.b.d.a.e;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class k extends g {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ q f5795g;

    public k(q qVar) {
        this.f5795g = qVar;
    }

    @Override // f.h.b.d.a.e.g
    public final void a() {
        q qVar = this.f5795g;
        if (qVar.n != null) {
            qVar.b.d("Unbind from service.", new Object[0]);
            q qVar2 = this.f5795g;
            qVar2.a.unbindService(qVar2.f5809m);
            q qVar3 = this.f5795g;
            qVar3.f5803g = false;
            qVar3.n = null;
            qVar3.f5809m = null;
        }
        this.f5795g.d();
    }
}
