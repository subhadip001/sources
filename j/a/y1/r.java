package j.a.y1;

/* compiled from: Scopes.kt */
/* loaded from: classes2.dex */
public class r<T> extends j.a.a<T> implements i.j.j.a.d {

    /* renamed from: h  reason: collision with root package name */
    public final i.j.d<T> f8821h;

    /* JADX WARN: Multi-variable type inference failed */
    public r(i.j.f fVar, i.j.d<? super T> dVar) {
        super(fVar, true, true);
        this.f8821h = dVar;
    }

    @Override // j.a.g1
    public final boolean E() {
        return true;
    }

    @Override // j.a.a
    public void Z(Object obj) {
        i.j.d<T> dVar = this.f8821h;
        dVar.h(f.n.a.n.i.P(obj, dVar));
    }

    @Override // j.a.g1
    public void c(Object obj) {
        f.b(f.n.a.n.i.A(this.f8821h), f.n.a.n.i.P(obj, this.f8821h), null, 2);
    }

    @Override // i.j.j.a.d
    public final i.j.j.a.d e() {
        i.j.d<T> dVar = this.f8821h;
        if (dVar instanceof i.j.j.a.d) {
            return (i.j.j.a.d) dVar;
        }
        return null;
    }
}
