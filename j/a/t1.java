package j.a;

/* compiled from: Unconfined.kt */
/* loaded from: classes2.dex */
public final class t1 extends z {

    /* renamed from: g  reason: collision with root package name */
    public static final t1 f8783g = new t1();

    @Override // j.a.z
    public void d0(i.j.f fVar, Runnable runnable) {
        if (((w1) fVar.get(w1.f8791f)) == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // j.a.z
    public boolean g0(i.j.f fVar) {
        return false;
    }

    @Override // j.a.z
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
