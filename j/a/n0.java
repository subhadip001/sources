package j.a;

/* compiled from: CancellableContinuation.kt */
/* loaded from: classes2.dex */
public final class n0 extends f {

    /* renamed from: f  reason: collision with root package name */
    public final m0 f8767f;

    public n0(m0 m0Var) {
        this.f8767f = m0Var;
    }

    @Override // j.a.g
    public void a(Throwable th) {
        this.f8767f.dispose();
    }

    @Override // i.l.a.l
    public i.h b(Throwable th) {
        this.f8767f.dispose();
        return i.h.a;
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("DisposeOnCancel[");
        A.append(this.f8767f);
        A.append(']');
        return A.toString();
    }
}
