package f.h.b.b.b2;

import android.net.Uri;
import f.h.b.b.q1;
import f.h.b.b.u0;
import java.util.Collections;
import java.util.Objects;

/* compiled from: SinglePeriodTimeline.java */
/* loaded from: classes.dex */
public final class j0 extends q1 {

    /* renamed from: g  reason: collision with root package name */
    public static final Object f3871g = new Object();
    public final long b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3872d;

    /* renamed from: e  reason: collision with root package name */
    public final u0 f3873e;

    /* renamed from: f  reason: collision with root package name */
    public final u0.e f3874f;

    static {
        Collections.emptyList();
        Collections.emptyMap();
        Collections.emptyList();
        Collections.emptyList();
        Uri uri = Uri.EMPTY;
        f.h.b.b.e2.j.g(true);
    }

    public j0(long j2, boolean z, boolean z2, boolean z3, Object obj, u0 u0Var) {
        u0.e eVar = z3 ? u0Var.c : null;
        this.b = j2;
        this.c = j2;
        this.f3872d = z;
        Objects.requireNonNull(u0Var);
        this.f3873e = u0Var;
        this.f3874f = eVar;
    }

    @Override // f.h.b.b.q1
    public int b(Object obj) {
        return f3871g.equals(obj) ? 0 : -1;
    }

    @Override // f.h.b.b.q1
    public q1.b g(int i2, q1.b bVar, boolean z) {
        f.h.b.b.e2.j.f(i2, 0, 1);
        Object obj = z ? f3871g : null;
        long j2 = this.b;
        Objects.requireNonNull(bVar);
        f.h.b.b.b2.k0.a aVar = f.h.b.b.b2.k0.a.f3875g;
        bVar.a = null;
        bVar.b = obj;
        bVar.c = 0;
        bVar.f4465d = j2;
        bVar.f4466e = 0L;
        bVar.f4467f = aVar;
        return bVar;
    }

    @Override // f.h.b.b.q1
    public int i() {
        return 1;
    }

    @Override // f.h.b.b.q1
    public Object m(int i2) {
        f.h.b.b.e2.j.f(i2, 0, 1);
        return f3871g;
    }

    @Override // f.h.b.b.q1
    public q1.c o(int i2, q1.c cVar, long j2) {
        f.h.b.b.e2.j.f(i2, 0, 1);
        cVar.d(q1.c.r, this.f3873e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f3872d, false, this.f3874f, 0L, this.c, 0, 0, 0L);
        return cVar;
    }

    @Override // f.h.b.b.q1
    public int p() {
        return 1;
    }
}
