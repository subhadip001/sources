package f.h.b.b.y1.g0;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import f.h.b.b.e2.j;
import f.h.b.b.g2.b0;
import f.h.b.b.y1.t;
import f.h.b.b.y1.u;

/* compiled from: XingSeeker.java */
/* loaded from: classes.dex */
public final class i implements g {
    public final long a;
    public final int b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4782d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4783e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f4784f;

    public i(long j2, int i2, long j3, long j4, long[] jArr) {
        this.a = j2;
        this.b = i2;
        this.c = j3;
        this.f4784f = jArr;
        this.f4782d = j4;
        this.f4783e = j4 != -1 ? j2 + j4 : -1L;
    }

    @Override // f.h.b.b.y1.g0.g
    public long a() {
        return this.f4783e;
    }

    @Override // f.h.b.b.y1.t
    public boolean c() {
        return this.f4784f != null;
    }

    @Override // f.h.b.b.y1.g0.g
    public long d(long j2) {
        long j3 = j2 - this.a;
        if (!c() || j3 <= this.b) {
            return 0L;
        }
        long[] jArr = this.f4784f;
        j.i(jArr);
        double d2 = (j3 * 256.0d) / this.f4782d;
        int e2 = b0.e(jArr, (long) d2, true, true);
        long j4 = this.c;
        long j5 = (e2 * j4) / 100;
        long j6 = jArr[e2];
        int i2 = e2 + 1;
        long j7 = (j4 * i2) / 100;
        long j8 = e2 == 99 ? 256L : jArr[i2];
        return Math.round((j6 == j8 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (d2 - j6) / (j8 - j6)) * (j7 - j5)) + j5;
    }

    @Override // f.h.b.b.y1.t
    public t.a h(long j2) {
        long[] jArr;
        if (!c()) {
            return new t.a(new u(0L, this.a + this.b));
        }
        long i2 = b0.i(j2, 0L, this.c);
        double d2 = (i2 * 100.0d) / this.c;
        double d3 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (d2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            if (d2 >= 100.0d) {
                d3 = 256.0d;
            } else {
                int i3 = (int) d2;
                long[] jArr2 = this.f4784f;
                j.i(jArr2);
                double d4 = jArr2[i3];
                d3 = d4 + (((i3 == 99 ? 256.0d : jArr[i3 + 1]) - d4) * (d2 - i3));
            }
        }
        return new t.a(new u(i2, this.a + b0.i(Math.round((d3 / 256.0d) * this.f4782d), this.b, this.f4782d - 1)));
    }

    @Override // f.h.b.b.y1.t
    public long i() {
        return this.c;
    }
}
