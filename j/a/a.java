package j.a;

import j.a.c1;

/* compiled from: AbstractCoroutine.kt */
/* loaded from: classes2.dex */
public abstract class a<T> extends g1 implements c1, i.j.d<T>, c0 {

    /* renamed from: g  reason: collision with root package name */
    public final i.j.f f8728g;

    public a(i.j.f fVar, boolean z, boolean z2) {
        super(z2);
        if (z) {
            D((c1) fVar.get(c1.a.f8738f));
        }
        this.f8728g = fVar.plus(this);
    }

    @Override // j.a.g1
    public final void B(Throwable th) {
        f.n.a.n.i.y(this.f8728g, th);
    }

    @Override // j.a.g1
    public String H() {
        return super.H();
    }

    @Override // j.a.g1
    public final void L(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            Throwable th = rVar.a;
            rVar.a();
            a0();
            return;
        }
        b0();
    }

    public void Z(Object obj) {
        c(obj);
    }

    @Override // j.a.g1, j.a.c1
    public boolean a() {
        return super.a();
    }

    public void a0() {
    }

    public void b0() {
    }

    @Override // i.j.d
    public final i.j.f getContext() {
        return this.f8728g;
    }

    @Override // i.j.d
    public final void h(Object obj) {
        Object G = G(f.n.a.n.i.g0(obj, null));
        if (G == h1.b) {
            return;
        }
        Z(G);
    }

    @Override // j.a.g1
    public String m() {
        return getClass().getSimpleName() + " was cancelled";
    }

    @Override // j.a.c0
    public i.j.f p() {
        return this.f8728g;
    }
}
