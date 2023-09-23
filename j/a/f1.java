package j.a;

/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public abstract class f1 extends t implements m0, x0 {

    /* renamed from: i  reason: collision with root package name */
    public g1 f8742i;

    @Override // j.a.x0
    public boolean a() {
        return true;
    }

    @Override // j.a.m0
    public void dispose() {
        Object z;
        g1 q = q();
        do {
            z = q.z();
            if (!(z instanceof f1)) {
                if (!(z instanceof x0) || ((x0) z).e() == null) {
                    return;
                }
                o();
                return;
            } else if (z != this) {
                return;
            }
        } while (!g1.f8743f.compareAndSet(q, z, h1.f8754g));
    }

    @Override // j.a.x0
    public k1 e() {
        return null;
    }

    public final g1 q() {
        g1 g1Var = this.f8742i;
        if (g1Var != null) {
            return g1Var;
        }
        i.l.b.i.h("job");
        throw null;
    }

    @Override // j.a.y1.j
    public String toString() {
        return getClass().getSimpleName() + '@' + e0.b(this) + "[job@" + e0.b(q()) + ']';
    }
}
