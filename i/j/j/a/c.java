package i.j.j.a;

import i.j.e;
import i.j.f;
import i.l.b.i;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes2.dex */
public abstract class c extends a {

    /* renamed from: g  reason: collision with root package name */
    public final i.j.f f8636g;

    /* renamed from: h  reason: collision with root package name */
    public transient i.j.d<Object> f8637h;

    public c(i.j.d<Object> dVar, i.j.f fVar) {
        super(dVar);
        this.f8636g = fVar;
    }

    @Override // i.j.d
    public i.j.f getContext() {
        i.j.f fVar = this.f8636g;
        i.b(fVar);
        return fVar;
    }

    @Override // i.j.j.a.a
    public void m() {
        i.j.d<?> dVar = this.f8637h;
        if (dVar != null && dVar != this) {
            i.j.f fVar = this.f8636g;
            i.b(fVar);
            int i2 = i.j.e.c;
            f.a aVar = fVar.get(e.a.f8621f);
            i.b(aVar);
            ((i.j.e) aVar).f(dVar);
        }
        this.f8637h = b.f8635f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i.j.d<Object> dVar) {
        super(dVar);
        i.j.f context = dVar != null ? dVar.getContext() : null;
        this.f8636g = context;
    }
}
