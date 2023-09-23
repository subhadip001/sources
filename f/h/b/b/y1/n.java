package f.h.b.b.y1;

import f.h.b.b.g2.b0;
import f.h.b.b.y1.o;
import f.h.b.b.y1.t;

/* compiled from: FlacSeekTableSeekMap.java */
/* loaded from: classes.dex */
public final class n implements t {
    public final o a;
    public final long b;

    public n(o oVar, long j2) {
        this.a = oVar;
        this.b = j2;
    }

    public final u b(long j2, long j3) {
        return new u((j2 * 1000000) / this.a.f5101e, this.b + j3);
    }

    @Override // f.h.b.b.y1.t
    public boolean c() {
        return true;
    }

    @Override // f.h.b.b.y1.t
    public t.a h(long j2) {
        f.h.b.b.e2.j.i(this.a.f5107k);
        o oVar = this.a;
        o.a aVar = oVar.f5107k;
        long[] jArr = aVar.a;
        long[] jArr2 = aVar.b;
        int e2 = b0.e(jArr, oVar.g(j2), true, false);
        u b = b(e2 == -1 ? 0L : jArr[e2], e2 != -1 ? jArr2[e2] : 0L);
        if (b.a != j2 && e2 != jArr.length - 1) {
            int i2 = e2 + 1;
            return new t.a(b, b(jArr[i2], jArr2[i2]));
        }
        return new t.a(b);
    }

    @Override // f.h.b.b.y1.t
    public long i() {
        return this.a.d();
    }
}
