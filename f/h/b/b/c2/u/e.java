package f.h.b.b.c2.u;

import java.util.Collections;
import java.util.List;

/* compiled from: Mp4WebvttSubtitle.java */
/* loaded from: classes.dex */
public final class e implements f.h.b.b.c2.f {

    /* renamed from: f  reason: collision with root package name */
    public final List<f.h.b.b.c2.c> f4062f;

    public e(List<f.h.b.b.c2.c> list) {
        this.f4062f = Collections.unmodifiableList(list);
    }

    @Override // f.h.b.b.c2.f
    public int a(long j2) {
        return j2 < 0 ? 0 : -1;
    }

    @Override // f.h.b.b.c2.f
    public long d(int i2) {
        f.h.b.b.e2.j.c(i2 == 0);
        return 0L;
    }

    @Override // f.h.b.b.c2.f
    public List<f.h.b.b.c2.c> f(long j2) {
        return j2 >= 0 ? this.f4062f : Collections.emptyList();
    }

    @Override // f.h.b.b.c2.f
    public int g() {
        return 1;
    }
}
