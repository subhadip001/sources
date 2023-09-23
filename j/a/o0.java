package j.a;

/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public final class o0 implements x0 {

    /* renamed from: f  reason: collision with root package name */
    public final boolean f8768f;

    public o0(boolean z) {
        this.f8768f = z;
    }

    @Override // j.a.x0
    public boolean a() {
        return this.f8768f;
    }

    @Override // j.a.x0
    public k1 e() {
        return null;
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("Empty{");
        A.append(this.f8768f ? "Active" : "New");
        A.append('}');
        return A.toString();
    }
}
