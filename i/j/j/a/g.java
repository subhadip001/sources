package i.j.j.a;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes2.dex */
public abstract class g extends a {
    public g(i.j.d<Object> dVar) {
        super(dVar);
        if (!(dVar.getContext() == i.j.h.f8623f)) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // i.j.d
    public i.j.f getContext() {
        return i.j.h.f8623f;
    }
}
