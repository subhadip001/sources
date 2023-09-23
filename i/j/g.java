package i.j;

import i.j.e;
import i.j.f;
import i.l.a.p;
import i.l.b.i;
import i.l.b.j;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes2.dex */
public final class g extends j implements p<f, f.a, f> {

    /* renamed from: g  reason: collision with root package name */
    public static final g f8622g = new g();

    public g() {
        super(2);
    }

    @Override // i.l.a.p
    public f k(f fVar, f.a aVar) {
        c cVar;
        f fVar2 = fVar;
        f.a aVar2 = aVar;
        i.e(fVar2, "acc");
        i.e(aVar2, "element");
        f minusKey = fVar2.minusKey(aVar2.getKey());
        h hVar = h.f8623f;
        if (minusKey == hVar) {
            return aVar2;
        }
        int i2 = e.c;
        e.a aVar3 = e.a.f8621f;
        e eVar = (e) minusKey.get(aVar3);
        if (eVar == null) {
            cVar = new c(minusKey, aVar2);
        } else {
            f minusKey2 = minusKey.minusKey(aVar3);
            if (minusKey2 == hVar) {
                return new c(aVar2, eVar);
            }
            cVar = new c(new c(minusKey2, aVar2), eVar);
        }
        return cVar;
    }
}
