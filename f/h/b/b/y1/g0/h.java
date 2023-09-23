package f.h.b.b.y1.g0;

import f.h.b.b.g2.b0;
import f.h.b.b.y1.t;
import f.h.b.b.y1.u;

/* compiled from: VbriSeeker.java */
/* loaded from: classes.dex */
public final class h implements g {
    public final long[] a;
    public final long[] b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4781d;

    public h(long[] jArr, long[] jArr2, long j2, long j3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j2;
        this.f4781d = j3;
    }

    @Override // f.h.b.b.y1.g0.g
    public long a() {
        return this.f4781d;
    }

    @Override // f.h.b.b.y1.t
    public boolean c() {
        return true;
    }

    @Override // f.h.b.b.y1.g0.g
    public long d(long j2) {
        return this.a[b0.e(this.b, j2, true, true)];
    }

    @Override // f.h.b.b.y1.t
    public t.a h(long j2) {
        int e2 = b0.e(this.a, j2, true, true);
        long[] jArr = this.a;
        long j3 = jArr[e2];
        long[] jArr2 = this.b;
        u uVar = new u(j3, jArr2[e2]);
        if (j3 < j2 && e2 != jArr.length - 1) {
            int i2 = e2 + 1;
            return new t.a(uVar, new u(jArr[i2], jArr2[i2]));
        }
        return new t.a(uVar);
    }

    @Override // f.h.b.b.y1.t
    public long i() {
        return this.c;
    }
}
