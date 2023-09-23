package f.h.b.b.f2;

import f.h.b.b.g2.b0;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* compiled from: BaseDataSource.java */
/* loaded from: classes.dex */
public abstract class e implements i {
    public final boolean a;
    public final ArrayList<t> b = new ArrayList<>(1);
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public j f4205d;

    public e(boolean z) {
        this.a = z;
    }

    @Override // f.h.b.b.f2.i
    public final void d(t tVar) {
        Objects.requireNonNull(tVar);
        if (this.b.contains(tVar)) {
            return;
        }
        this.b.add(tVar);
        this.c++;
    }

    @Override // f.h.b.b.f2.i
    public /* synthetic */ Map k() {
        return h.a(this);
    }

    public final void p(int i2) {
        j jVar = this.f4205d;
        int i3 = b0.a;
        for (int i4 = 0; i4 < this.c; i4++) {
            this.b.get(i4).e(this, jVar, this.a, i2);
        }
    }

    public final void q() {
        j jVar = this.f4205d;
        int i2 = b0.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            this.b.get(i3).a(this, jVar, this.a);
        }
        this.f4205d = null;
    }

    public final void r(j jVar) {
        for (int i2 = 0; i2 < this.c; i2++) {
            this.b.get(i2).g(this, jVar, this.a);
        }
    }

    public final void s(j jVar) {
        this.f4205d = jVar;
        for (int i2 = 0; i2 < this.c; i2++) {
            this.b.get(i2).b(this, jVar, this.a);
        }
    }
}
