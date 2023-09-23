package f.h.b.d.a.e;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class o extends g {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ p f5798g;

    public o(p pVar) {
        this.f5798g = pVar;
    }

    @Override // f.h.b.d.a.e.g
    public final void a() {
        q qVar = this.f5798g.f5799f;
        qVar.b.d("unlinkToDeath", new Object[0]);
        qVar.n.asBinder().unlinkToDeath(qVar.f5807k, 0);
        q qVar2 = this.f5798g.f5799f;
        qVar2.n = null;
        qVar2.f5803g = false;
    }
}
