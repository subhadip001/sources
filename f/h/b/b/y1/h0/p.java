package f.h.b.b.y1.h0;

import f.h.b.b.g2.b0;

/* compiled from: TrackSampleTable.java */
/* loaded from: classes.dex */
public final class p {
    public final m a;
    public final int b;
    public final long[] c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f4843d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4844e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f4845f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f4846g;

    /* renamed from: h  reason: collision with root package name */
    public final long f4847h;

    public p(m mVar, long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2, long j2) {
        f.h.b.b.e2.j.c(iArr.length == jArr2.length);
        f.h.b.b.e2.j.c(jArr.length == jArr2.length);
        f.h.b.b.e2.j.c(iArr2.length == jArr2.length);
        this.a = mVar;
        this.c = jArr;
        this.f4843d = iArr;
        this.f4844e = i2;
        this.f4845f = jArr2;
        this.f4846g = iArr2;
        this.f4847h = j2;
        this.b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j2) {
        for (int e2 = b0.e(this.f4845f, j2, true, false); e2 >= 0; e2--) {
            if ((this.f4846g[e2] & 1) != 0) {
                return e2;
            }
        }
        return -1;
    }

    public int b(long j2) {
        for (int b = b0.b(this.f4845f, j2, true, false); b < this.f4845f.length; b++) {
            if ((this.f4846g[b] & 1) != 0) {
                return b;
            }
        }
        return -1;
    }
}
