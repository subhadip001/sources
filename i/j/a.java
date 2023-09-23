package i.j;

import i.j.f;
import i.l.a.p;
import i.l.b.i;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes2.dex */
public abstract class a implements f.a {
    private final f.b<?> key;

    public a(f.b<?> bVar) {
        i.e(bVar, "key");
        this.key = bVar;
    }

    @Override // i.j.f
    public <R> R fold(R r, p<? super R, ? super f.a, ? extends R> pVar) {
        return (R) f.a.C0222a.a(this, r, pVar);
    }

    @Override // i.j.f.a, i.j.f
    public <E extends f.a> E get(f.b<E> bVar) {
        return (E) f.a.C0222a.b(this, bVar);
    }

    @Override // i.j.f.a
    public f.b<?> getKey() {
        return this.key;
    }

    @Override // i.j.f
    public f minusKey(f.b<?> bVar) {
        return f.a.C0222a.c(this, bVar);
    }

    @Override // i.j.f
    public f plus(f fVar) {
        return f.a.C0222a.d(this, fVar);
    }
}
