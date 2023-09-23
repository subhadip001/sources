package f.h.b.b.d2;

import f.h.b.b.g2.b0;
import f.h.b.b.l1;

/* compiled from: TrackSelectorResult.java */
/* loaded from: classes.dex */
public final class m {
    public final int a;
    public final l1[] b;
    public final g[] c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f4102d;

    public m(l1[] l1VarArr, g[] gVarArr, Object obj) {
        this.b = l1VarArr;
        this.c = (g[]) gVarArr.clone();
        this.f4102d = obj;
        this.a = l1VarArr.length;
    }

    public boolean a(m mVar, int i2) {
        return mVar != null && b0.a(this.b[i2], mVar.b[i2]) && b0.a(this.c[i2], mVar.c[i2]);
    }

    public boolean b(int i2) {
        return this.b[i2] != null;
    }
}
