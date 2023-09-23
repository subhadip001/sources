package j.a;

import i.j.f;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes2.dex */
public final class v extends i.l.b.j implements i.l.a.p<i.j.f, f.a, i.j.f> {

    /* renamed from: g  reason: collision with root package name */
    public static final v f8785g = new v();

    public v() {
        super(2);
    }

    @Override // i.l.a.p
    public i.j.f k(i.j.f fVar, f.a aVar) {
        i.j.f fVar2 = fVar;
        f.a aVar2 = aVar;
        if (aVar2 instanceof u) {
            return fVar2.plus(((u) aVar2).F());
        }
        return fVar2.plus(aVar2);
    }
}
