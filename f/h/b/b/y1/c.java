package f.h.b.b.y1;

import f.h.b.b.g2.b0;
import f.h.b.b.y1.t;
import java.util.Arrays;

/* compiled from: ChunkIndex.java */
/* loaded from: classes.dex */
public final class c implements t {
    public final int a;
    public final int[] b;
    public final long[] c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f4695d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f4696e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4697f;

    public c(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.f4695d = jArr2;
        this.f4696e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            this.f4697f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f4697f = 0L;
        }
    }

    @Override // f.h.b.b.y1.t
    public boolean c() {
        return true;
    }

    @Override // f.h.b.b.y1.t
    public t.a h(long j2) {
        int e2 = b0.e(this.f4696e, j2, true, true);
        long[] jArr = this.f4696e;
        long j3 = jArr[e2];
        long[] jArr2 = this.c;
        u uVar = new u(j3, jArr2[e2]);
        if (j3 < j2 && e2 != this.a - 1) {
            int i2 = e2 + 1;
            return new t.a(uVar, new u(jArr[i2], jArr2[i2]));
        }
        return new t.a(uVar);
    }

    @Override // f.h.b.b.y1.t
    public long i() {
        return this.f4697f;
    }

    public String toString() {
        int i2 = this.a;
        String arrays = Arrays.toString(this.b);
        String arrays2 = Arrays.toString(this.c);
        String arrays3 = Arrays.toString(this.f4696e);
        String arrays4 = Arrays.toString(this.f4695d);
        StringBuilder sb = new StringBuilder(f.a.b.a.a.x(arrays4, f.a.b.a.a.x(arrays3, f.a.b.a.a.x(arrays2, f.a.b.a.a.x(arrays, 71)))));
        sb.append("ChunkIndex(length=");
        sb.append(i2);
        sb.append(", sizes=");
        sb.append(arrays);
        f.a.b.a.a.R(sb, ", offsets=", arrays2, ", timeUs=", arrays3);
        return f.a.b.a.a.v(sb, ", durationsUs=", arrays4, ")");
    }
}
