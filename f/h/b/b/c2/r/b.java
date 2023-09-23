package f.h.b.b.c2.r;

import f.h.b.b.c2.c;
import f.h.b.b.c2.f;
import f.h.b.b.e2.j;
import f.h.b.b.g2.b0;
import java.util.Collections;
import java.util.List;

/* compiled from: SubripSubtitle.java */
/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: f  reason: collision with root package name */
    public final c[] f4024f;

    /* renamed from: g  reason: collision with root package name */
    public final long[] f4025g;

    public b(c[] cVarArr, long[] jArr) {
        this.f4024f = cVarArr;
        this.f4025g = jArr;
    }

    @Override // f.h.b.b.c2.f
    public int a(long j2) {
        int b = b0.b(this.f4025g, j2, false, false);
        if (b < this.f4025g.length) {
            return b;
        }
        return -1;
    }

    @Override // f.h.b.b.c2.f
    public long d(int i2) {
        j.c(i2 >= 0);
        j.c(i2 < this.f4025g.length);
        return this.f4025g[i2];
    }

    @Override // f.h.b.b.c2.f
    public List<c> f(long j2) {
        int e2 = b0.e(this.f4025g, j2, true, false);
        if (e2 != -1) {
            c[] cVarArr = this.f4024f;
            if (cVarArr[e2] != c.p) {
                return Collections.singletonList(cVarArr[e2]);
            }
        }
        return Collections.emptyList();
    }

    @Override // f.h.b.b.c2.f
    public int g() {
        return this.f4025g.length;
    }
}
