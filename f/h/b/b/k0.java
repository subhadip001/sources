package f.h.b.b;

/* compiled from: DefaultLivePlaybackSpeedControl.java */
/* loaded from: classes.dex */
public final class k0 implements t0 {
    public final long a;
    public final long b;
    public final float c;

    /* renamed from: j  reason: collision with root package name */
    public float f4392j;

    /* renamed from: k  reason: collision with root package name */
    public float f4393k;

    /* renamed from: d  reason: collision with root package name */
    public long f4386d = -9223372036854775807L;

    /* renamed from: e  reason: collision with root package name */
    public long f4387e = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    public long f4389g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    public long f4390h = -9223372036854775807L;

    /* renamed from: l  reason: collision with root package name */
    public float f4394l = 1.0f;

    /* renamed from: m  reason: collision with root package name */
    public long f4395m = -9223372036854775807L;

    /* renamed from: f  reason: collision with root package name */
    public long f4388f = -9223372036854775807L;

    /* renamed from: i  reason: collision with root package name */
    public long f4391i = -9223372036854775807L;
    public long n = -9223372036854775807L;
    public long o = -9223372036854775807L;

    public k0(float f2, float f3, long j2, float f4, long j3, long j4, float f5, a aVar) {
        this.a = j3;
        this.b = j4;
        this.c = f5;
        this.f4393k = f2;
        this.f4392j = f3;
    }

    public final void a() {
        long j2 = this.f4386d;
        if (j2 != -9223372036854775807L) {
            long j3 = this.f4387e;
            if (j3 != -9223372036854775807L) {
                j2 = j3;
            }
            long j4 = this.f4389g;
            if (j4 != -9223372036854775807L && j2 < j4) {
                j2 = j4;
            }
            long j5 = this.f4390h;
            if (j5 != -9223372036854775807L && j2 > j5) {
                j2 = j5;
            }
        } else {
            j2 = -9223372036854775807L;
        }
        if (this.f4388f == j2) {
            return;
        }
        this.f4388f = j2;
        this.f4391i = j2;
        this.n = -9223372036854775807L;
        this.o = -9223372036854775807L;
        this.f4395m = -9223372036854775807L;
    }
}
