package f.h.b.b;

import java.util.Objects;

/* compiled from: DefaultMediaClock.java */
/* loaded from: classes.dex */
public final class m0 implements f.h.b.b.g2.o {

    /* renamed from: f  reason: collision with root package name */
    public final f.h.b.b.g2.w f4402f;

    /* renamed from: g  reason: collision with root package name */
    public final a f4403g;

    /* renamed from: h  reason: collision with root package name */
    public j1 f4404h;

    /* renamed from: i  reason: collision with root package name */
    public f.h.b.b.g2.o f4405i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4406j = true;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4407k;

    /* compiled from: DefaultMediaClock.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public m0(a aVar, f.h.b.b.g2.f fVar) {
        this.f4403g = aVar;
        this.f4402f = new f.h.b.b.g2.w(fVar);
    }

    @Override // f.h.b.b.g2.o
    public c1 c() {
        f.h.b.b.g2.o oVar = this.f4405i;
        if (oVar != null) {
            return oVar.c();
        }
        return this.f4402f.f4311j;
    }

    @Override // f.h.b.b.g2.o
    public void h(c1 c1Var) {
        f.h.b.b.g2.o oVar = this.f4405i;
        if (oVar != null) {
            oVar.h(c1Var);
            c1Var = this.f4405i.c();
        }
        this.f4402f.h(c1Var);
    }

    @Override // f.h.b.b.g2.o
    public long m() {
        if (this.f4406j) {
            return this.f4402f.m();
        }
        f.h.b.b.g2.o oVar = this.f4405i;
        Objects.requireNonNull(oVar);
        return oVar.m();
    }
}
