package f.h.b.b.c2.t;

import f.h.b.b.c2.c;
import f.h.b.b.c2.f;
import f.h.b.b.e2.j;
import java.util.Collections;
import java.util.List;

/* compiled from: Tx3gSubtitle.java */
/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: g  reason: collision with root package name */
    public static final b f4058g = new b();

    /* renamed from: f  reason: collision with root package name */
    public final List<c> f4059f;

    public b(c cVar) {
        this.f4059f = Collections.singletonList(cVar);
    }

    @Override // f.h.b.b.c2.f
    public int a(long j2) {
        return j2 < 0 ? 0 : -1;
    }

    @Override // f.h.b.b.c2.f
    public long d(int i2) {
        j.c(i2 == 0);
        return 0L;
    }

    @Override // f.h.b.b.c2.f
    public List<c> f(long j2) {
        return j2 >= 0 ? this.f4059f : Collections.emptyList();
    }

    @Override // f.h.b.b.c2.f
    public int g() {
        return 1;
    }

    public b() {
        this.f4059f = Collections.emptyList();
    }
}
