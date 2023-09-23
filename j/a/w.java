package j.a;

import i.j.f;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes2.dex */
public final class w extends i.l.b.j implements i.l.a.p<i.j.f, f.a, i.j.f> {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ i.l.b.n<i.j.f> f8788g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ boolean f8789h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(i.l.b.n<i.j.f> nVar, boolean z) {
        super(2);
        this.f8788g = nVar;
        this.f8789h = z;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [i.j.f, T] */
    @Override // i.l.a.p
    public i.j.f k(i.j.f fVar, f.a aVar) {
        i.j.f fVar2 = fVar;
        f.a aVar2 = aVar;
        if (aVar2 instanceof u) {
            f.a aVar3 = this.f8788g.f8651f.get(aVar2.getKey());
            if (aVar3 == null) {
                u uVar = (u) aVar2;
                if (this.f8789h) {
                    uVar = uVar.F();
                }
                return fVar2.plus(uVar);
            }
            i.l.b.n<i.j.f> nVar = this.f8788g;
            nVar.f8651f = nVar.f8651f.minusKey(aVar2.getKey());
            return fVar2.plus(((u) aVar2).l(aVar3));
        }
        return fVar2.plus(aVar2);
    }
}
