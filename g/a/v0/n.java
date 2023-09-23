package g.a.v0;

/* compiled from: CallTracer.java */
/* loaded from: classes2.dex */
public final class n {
    public final u2 a;
    public final l1 b = f.n.a.n.i.m();
    public final l1 c = f.n.a.n.i.m();

    /* renamed from: d  reason: collision with root package name */
    public final l1 f7869d = f.n.a.n.i.m();

    /* compiled from: CallTracer.java */
    /* loaded from: classes2.dex */
    public interface a {
        n a();
    }

    public n(u2 u2Var) {
        this.a = u2Var;
    }

    public void a(boolean z) {
        if (z) {
            this.c.add(1L);
        } else {
            this.f7869d.add(1L);
        }
    }
}
