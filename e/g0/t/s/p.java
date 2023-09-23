package e.g0.t.s;

import androidx.work.BackoffPolicy;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;

/* compiled from: WorkSpec.java */
/* loaded from: classes.dex */
public final class p {
    public String a;
    public WorkInfo$State b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public String f2336d;

    /* renamed from: e  reason: collision with root package name */
    public e.g0.e f2337e;

    /* renamed from: f  reason: collision with root package name */
    public e.g0.e f2338f;

    /* renamed from: g  reason: collision with root package name */
    public long f2339g;

    /* renamed from: h  reason: collision with root package name */
    public long f2340h;

    /* renamed from: i  reason: collision with root package name */
    public long f2341i;

    /* renamed from: j  reason: collision with root package name */
    public e.g0.c f2342j;

    /* renamed from: k  reason: collision with root package name */
    public int f2343k;

    /* renamed from: l  reason: collision with root package name */
    public BackoffPolicy f2344l;

    /* renamed from: m  reason: collision with root package name */
    public long f2345m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public OutOfQuotaPolicy r;

    /* compiled from: WorkSpec.java */
    /* loaded from: classes.dex */
    public static class a {
        public String a;
        public WorkInfo$State b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.b != aVar.b) {
                    return false;
                }
                return this.a.equals(aVar.a);
            }
            return false;
        }

        public int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }
    }

    static {
        e.g0.k.e("WorkSpec");
    }

    public p(String str, String str2) {
        this.b = WorkInfo$State.ENQUEUED;
        e.g0.e eVar = e.g0.e.c;
        this.f2337e = eVar;
        this.f2338f = eVar;
        this.f2342j = e.g0.c.f2195i;
        this.f2344l = BackoffPolicy.EXPONENTIAL;
        this.f2345m = 30000L;
        this.p = -1L;
        this.r = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.a = str;
        this.c = str2;
    }

    public long a() {
        long j2;
        long j3;
        long scalb;
        if (this.b == WorkInfo$State.ENQUEUED && this.f2343k > 0) {
            if (this.f2344l == BackoffPolicy.LINEAR) {
                scalb = this.f2345m * this.f2343k;
            } else {
                scalb = Math.scalb((float) this.f2345m, this.f2343k - 1);
            }
            j3 = this.n;
            j2 = Math.min(18000000L, scalb);
        } else {
            if (c()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j4 = this.n;
                int i2 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
                if (i2 == 0) {
                    j4 = this.f2339g + currentTimeMillis;
                }
                long j5 = this.f2341i;
                long j6 = this.f2340h;
                if (j5 != j6) {
                    return j4 + j6 + (i2 == 0 ? j5 * (-1) : 0L);
                }
                return j4 + (i2 != 0 ? j6 : 0L);
            }
            j2 = this.n;
            if (j2 == 0) {
                j2 = System.currentTimeMillis();
            }
            j3 = this.f2339g;
        }
        return j2 + j3;
    }

    public boolean b() {
        return !e.g0.c.f2195i.equals(this.f2342j);
    }

    public boolean c() {
        return this.f2340h != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f2339g == pVar.f2339g && this.f2340h == pVar.f2340h && this.f2341i == pVar.f2341i && this.f2343k == pVar.f2343k && this.f2345m == pVar.f2345m && this.n == pVar.n && this.o == pVar.o && this.p == pVar.p && this.q == pVar.q && this.a.equals(pVar.a) && this.b == pVar.b && this.c.equals(pVar.c)) {
            String str = this.f2336d;
            if (str == null ? pVar.f2336d == null : str.equals(pVar.f2336d)) {
                return this.f2337e.equals(pVar.f2337e) && this.f2338f.equals(pVar.f2338f) && this.f2342j.equals(pVar.f2342j) && this.f2344l == pVar.f2344l && this.r == pVar.r;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int I = f.a.b.a.a.I(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        String str = this.f2336d;
        int hashCode = str != null ? str.hashCode() : 0;
        int hashCode2 = this.f2337e.hashCode();
        int hashCode3 = this.f2338f.hashCode();
        long j2 = this.f2339g;
        long j3 = this.f2340h;
        long j4 = this.f2341i;
        int hashCode4 = this.f2342j.hashCode();
        int hashCode5 = this.f2344l.hashCode();
        long j5 = this.f2345m;
        long j6 = this.n;
        long j7 = this.o;
        long j8 = this.p;
        return this.r.hashCode() + ((((((((((((hashCode5 + ((((hashCode4 + ((((((((hashCode3 + ((hashCode2 + ((I + hashCode) * 31)) * 31)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31)) * 31) + this.f2343k) * 31)) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (this.q ? 1 : 0)) * 31);
    }

    public String toString() {
        return f.a.b.a.a.u(f.a.b.a.a.A("{WorkSpec: "), this.a, "}");
    }

    public p(p pVar) {
        this.b = WorkInfo$State.ENQUEUED;
        e.g0.e eVar = e.g0.e.c;
        this.f2337e = eVar;
        this.f2338f = eVar;
        this.f2342j = e.g0.c.f2195i;
        this.f2344l = BackoffPolicy.EXPONENTIAL;
        this.f2345m = 30000L;
        this.p = -1L;
        this.r = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.a = pVar.a;
        this.c = pVar.c;
        this.b = pVar.b;
        this.f2336d = pVar.f2336d;
        this.f2337e = new e.g0.e(pVar.f2337e);
        this.f2338f = new e.g0.e(pVar.f2338f);
        this.f2339g = pVar.f2339g;
        this.f2340h = pVar.f2340h;
        this.f2341i = pVar.f2341i;
        this.f2342j = new e.g0.c(pVar.f2342j);
        this.f2343k = pVar.f2343k;
        this.f2344l = pVar.f2344l;
        this.f2345m = pVar.f2345m;
        this.n = pVar.n;
        this.o = pVar.o;
        this.p = pVar.p;
        this.q = pVar.q;
        this.r = pVar.r;
    }
}
