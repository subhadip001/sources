package f.h.b.b.y1;

import f.h.b.b.g2.b0;
import f.h.b.b.y1.t;

/* compiled from: ConstantBitrateSeekMap.java */
/* loaded from: classes.dex */
public class d implements t {
    public final long a;
    public final long b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4708d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4709e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4710f;

    public d(long j2, long j3, int i2, int i3) {
        this.a = j2;
        this.b = j3;
        this.c = i3 == -1 ? 1 : i3;
        this.f4709e = i2;
        if (j2 == -1) {
            this.f4708d = -1L;
            this.f4710f = -9223372036854775807L;
            return;
        }
        this.f4708d = j2 - j3;
        this.f4710f = e(j2, j3, i2);
    }

    public static long e(long j2, long j3, int i2) {
        return ((Math.max(0L, j2 - j3) * 8) * 1000000) / i2;
    }

    public long b(long j2) {
        return e(j2, this.b, this.f4709e);
    }

    @Override // f.h.b.b.y1.t
    public boolean c() {
        return this.f4708d != -1;
    }

    @Override // f.h.b.b.y1.t
    public t.a h(long j2) {
        long j3 = this.f4708d;
        if (j3 == -1) {
            return new t.a(new u(0L, this.b));
        }
        long j4 = this.c;
        long i2 = this.b + b0.i((((this.f4709e * j2) / 8000000) / j4) * j4, 0L, j3 - j4);
        long b = b(i2);
        u uVar = new u(b, i2);
        if (b < j2) {
            int i3 = this.c;
            if (i3 + i2 < this.a) {
                long j5 = i2 + i3;
                return new t.a(uVar, new u(b(j5), j5));
            }
        }
        return new t.a(uVar);
    }

    @Override // f.h.b.b.y1.t
    public long i() {
        return this.f4710f;
    }
}
