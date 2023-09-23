package g.a.v0;

import g.a.h;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: StatsTraceContext.java */
/* loaded from: classes2.dex */
public final class r2 {
    public static final r2 c = new r2(new g.a.s0[0]);
    public final g.a.s0[] a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public r2(g.a.s0[] s0VarArr) {
        this.a = s0VarArr;
    }

    public static r2 b(g.a.b bVar, g.a.a aVar, g.a.i0 i0Var) {
        List<h.a> list = bVar.f7529f;
        if (list.isEmpty()) {
            return c;
        }
        h.b.a transportAttrs = new h.b.a().setTransportAttrs(aVar);
        Objects.requireNonNull(transportAttrs);
        f.h.b.c.a.x(bVar, "callOptions cannot be null");
        transportAttrs.a = bVar;
        h.b bVar2 = new h.b(bVar, 0, false);
        int size = list.size();
        g.a.s0[] s0VarArr = new g.a.s0[size];
        for (int i2 = 0; i2 < size; i2++) {
            s0VarArr[i2] = list.get(i2).a(bVar2, i0Var);
        }
        return new r2(s0VarArr);
    }

    public void a(long j2) {
        for (g.a.s0 s0Var : this.a) {
            Objects.requireNonNull(s0Var);
        }
    }
}
