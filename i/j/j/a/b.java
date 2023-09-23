package i.j.j.a;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes2.dex */
public final class b implements i.j.d<Object> {

    /* renamed from: f  reason: collision with root package name */
    public static final b f8635f = new b();

    @Override // i.j.d
    public i.j.f getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // i.j.d
    public void h(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
