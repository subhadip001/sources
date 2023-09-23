package f.h.b.b.h2;

import java.util.Arrays;

/* compiled from: FixedFrameRateEstimator.java */
/* loaded from: classes.dex */
public final class l {
    public boolean c;

    /* renamed from: e  reason: collision with root package name */
    public int f4350e;
    public a a = new a();
    public a b = new a();

    /* renamed from: d  reason: collision with root package name */
    public long f4349d = -9223372036854775807L;

    /* compiled from: FixedFrameRateEstimator.java */
    /* loaded from: classes.dex */
    public static final class a {
        public long a;
        public long b;
        public long c;

        /* renamed from: d  reason: collision with root package name */
        public long f4351d;

        /* renamed from: e  reason: collision with root package name */
        public long f4352e;

        /* renamed from: f  reason: collision with root package name */
        public long f4353f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean[] f4354g = new boolean[15];

        /* renamed from: h  reason: collision with root package name */
        public int f4355h;

        public boolean a() {
            return this.f4351d > 15 && this.f4355h == 0;
        }

        public void b(long j2) {
            long j3 = this.f4351d;
            if (j3 == 0) {
                this.a = j2;
            } else if (j3 == 1) {
                long j4 = j2 - this.a;
                this.b = j4;
                this.f4353f = j4;
                this.f4352e = 1L;
            } else {
                long j5 = j2 - this.c;
                int i2 = (int) (j3 % 15);
                if (Math.abs(j5 - this.b) <= 1000000) {
                    this.f4352e++;
                    this.f4353f += j5;
                    boolean[] zArr = this.f4354g;
                    if (zArr[i2]) {
                        zArr[i2] = false;
                        this.f4355h--;
                    }
                } else {
                    boolean[] zArr2 = this.f4354g;
                    if (!zArr2[i2]) {
                        zArr2[i2] = true;
                        this.f4355h++;
                    }
                }
            }
            this.f4351d++;
            this.c = j2;
        }

        public void c() {
            this.f4351d = 0L;
            this.f4352e = 0L;
            this.f4353f = 0L;
            this.f4355h = 0;
            Arrays.fill(this.f4354g, false);
        }
    }

    public boolean a() {
        return this.a.a();
    }
}
