package f.h.b.b.y1.k0;

import f.h.b.b.g2.b0;
import f.h.b.b.y1.t;
import f.h.b.b.y1.u;

/* compiled from: WavSeekMap.java */
/* loaded from: classes.dex */
public final class e implements t {
    public final c a;
    public final int b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final long f5098d;

    /* renamed from: e  reason: collision with root package name */
    public final long f5099e;

    public e(c cVar, int i2, long j2, long j3) {
        this.a = cVar;
        this.b = i2;
        this.c = j2;
        long j4 = (j3 - j2) / cVar.f5095d;
        this.f5098d = j4;
        this.f5099e = b(j4);
    }

    public final long b(long j2) {
        return b0.E(j2 * this.b, 1000000L, this.a.c);
    }

    @Override // f.h.b.b.y1.t
    public boolean c() {
        return true;
    }

    @Override // f.h.b.b.y1.t
    public t.a h(long j2) {
        long i2 = b0.i((this.a.c * j2) / (this.b * 1000000), 0L, this.f5098d - 1);
        long j3 = (this.a.f5095d * i2) + this.c;
        long b = b(i2);
        u uVar = new u(b, j3);
        if (b < j2 && i2 != this.f5098d - 1) {
            long j4 = i2 + 1;
            return new t.a(uVar, new u(b(j4), (this.a.f5095d * j4) + this.c));
        }
        return new t.a(uVar);
    }

    @Override // f.h.b.b.y1.t
    public long i() {
        return this.f5099e;
    }
}
