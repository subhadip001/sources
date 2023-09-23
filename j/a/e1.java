package j.a;

/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public class e1 extends g1 implements c1 {

    /* renamed from: g  reason: collision with root package name */
    public final boolean f8740g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(c1 c1Var) {
        super(true);
        boolean z = true;
        D(c1Var);
        l y = y();
        m mVar = y instanceof m ? (m) y : null;
        if (mVar != null) {
            g1 q = mVar.q();
            while (!q.u()) {
                l y2 = q.y();
                m mVar2 = y2 instanceof m ? (m) y2 : null;
                if (mVar2 != null) {
                    q = mVar2.q();
                }
            }
            this.f8740g = z;
        }
        z = false;
        this.f8740g = z;
    }

    @Override // j.a.g1
    public boolean u() {
        return this.f8740g;
    }

    @Override // j.a.g1
    public boolean w() {
        return true;
    }
}
