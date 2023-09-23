package f.h.b.b.y1;

import f.h.b.b.g2.b0;
import f.h.b.b.y1.t;

/* compiled from: IndexSeekMap.java */
/* loaded from: classes.dex */
public final class r implements t {
    public final long[] a;
    public final long[] b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5109d;

    public r(long[] jArr, long[] jArr2, long j2) {
        f.h.b.b.e2.j.c(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.f5109d = z;
        if (z && jArr2[0] > 0) {
            int i2 = length + 1;
            long[] jArr3 = new long[i2];
            this.a = jArr3;
            long[] jArr4 = new long[i2];
            this.b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.a = jArr;
            this.b = jArr2;
        }
        this.c = j2;
    }

    @Override // f.h.b.b.y1.t
    public boolean c() {
        return this.f5109d;
    }

    @Override // f.h.b.b.y1.t
    public t.a h(long j2) {
        if (!this.f5109d) {
            return new t.a(u.c);
        }
        int e2 = b0.e(this.b, j2, true, true);
        long[] jArr = this.b;
        long j3 = jArr[e2];
        long[] jArr2 = this.a;
        u uVar = new u(j3, jArr2[e2]);
        if (j3 != j2 && e2 != jArr.length - 1) {
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
