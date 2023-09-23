package f.h.b.b.c2.m;

import f.h.b.b.e2.j;
import java.util.Collections;
import java.util.List;

/* compiled from: CeaSubtitle.java */
/* loaded from: classes.dex */
public final class f implements f.h.b.b.c2.f {

    /* renamed from: f  reason: collision with root package name */
    public final List<f.h.b.b.c2.c> f3980f;

    public f(List<f.h.b.b.c2.c> list) {
        this.f3980f = list;
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
    public List<f.h.b.b.c2.c> f(long j2) {
        return j2 >= 0 ? this.f3980f : Collections.emptyList();
    }

    @Override // f.h.b.b.c2.f
    public int g() {
        return 1;
    }
}
