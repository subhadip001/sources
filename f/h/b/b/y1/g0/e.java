package f.h.b.b.y1.g0;

import android.util.Pair;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import f.h.b.b.g2.b0;
import f.h.b.b.h0;
import f.h.b.b.y1.t;
import f.h.b.b.y1.u;

/* compiled from: MlltSeeker.java */
/* loaded from: classes.dex */
public final class e implements g {
    public final long[] a;
    public final long[] b;
    public final long c;

    public e(long[] jArr, long[] jArr2, long j2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j2 == -9223372036854775807L ? h0.a(jArr2[jArr2.length - 1]) : j2;
    }

    public static Pair<Long, Long> b(long j2, long[] jArr, long[] jArr2) {
        int e2 = b0.e(jArr, j2, true, true);
        long j3 = jArr[e2];
        long j4 = jArr2[e2];
        int i2 = e2 + 1;
        if (i2 == jArr.length) {
            return Pair.create(Long.valueOf(j3), Long.valueOf(j4));
        }
        long j5 = jArr[i2];
        return Pair.create(Long.valueOf(j2), Long.valueOf(((long) ((j5 == j3 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (j2 - j3) / (j5 - j3)) * (jArr2[i2] - j4))) + j4));
    }

    @Override // f.h.b.b.y1.g0.g
    public long a() {
        return -1L;
    }

    @Override // f.h.b.b.y1.t
    public boolean c() {
        return true;
    }

    @Override // f.h.b.b.y1.g0.g
    public long d(long j2) {
        return h0.a(((Long) b(j2, this.a, this.b).second).longValue());
    }

    @Override // f.h.b.b.y1.t
    public t.a h(long j2) {
        Pair<Long, Long> b = b(h0.b(b0.i(j2, 0L, this.c)), this.b, this.a);
        return new t.a(new u(h0.a(((Long) b.first).longValue()), ((Long) b.second).longValue()));
    }

    @Override // f.h.b.b.y1.t
    public long i() {
        return this.c;
    }
}
