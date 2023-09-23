package j.a;

import i.j.f;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes2.dex */
public final class v1 implements f.a, f.b<v1> {

    /* renamed from: f  reason: collision with root package name */
    public static final v1 f8787f = new v1();

    @Override // i.j.f
    public <R> R fold(R r, i.l.a.p<? super R, ? super f.a, ? extends R> pVar) {
        return (R) f.a.C0222a.a(this, r, pVar);
    }

    @Override // i.j.f.a, i.j.f
    public <E extends f.a> E get(f.b<E> bVar) {
        return (E) f.a.C0222a.b(this, bVar);
    }

    @Override // i.j.f.a
    public f.b<?> getKey() {
        return this;
    }

    @Override // i.j.f
    public i.j.f minusKey(f.b<?> bVar) {
        return f.a.C0222a.c(this, bVar);
    }

    @Override // i.j.f
    public i.j.f plus(i.j.f fVar) {
        return f.a.C0222a.d(this, fVar);
    }
}
