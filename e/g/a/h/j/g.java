package e.g.a.h.j;

import e.g.a.h.j.f;

/* compiled from: DimensionDependency.java */
/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f2086m;

    public g(o oVar) {
        super(oVar);
        if (oVar instanceof k) {
            this.f2070e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f2070e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // e.g.a.h.j.f
    public void c(int i2) {
        if (this.f2075j) {
            return;
        }
        this.f2075j = true;
        this.f2072g = i2;
        for (d dVar : this.f2076k) {
            dVar.a(dVar);
        }
    }
}
