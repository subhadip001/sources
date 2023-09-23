package f.h.b.b.g2;

/* compiled from: TimestampAdjuster.java */
/* loaded from: classes.dex */
public final class a0 {
    public long a;
    public long b;
    public volatile long c = -9223372036854775807L;

    public a0(long j2) {
        d(j2);
    }

    public long a(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.c != -9223372036854775807L) {
            this.c = j2;
        } else {
            long j3 = this.a;
            if (j3 != Long.MAX_VALUE) {
                this.b = j3 - j2;
            }
            synchronized (this) {
                this.c = j2;
                notifyAll();
            }
        }
        return j2 + this.b;
    }

    public long b(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.c != -9223372036854775807L) {
            long j3 = (this.c * 90000) / 1000000;
            long j4 = (4294967296L + j3) / 8589934592L;
            long j5 = ((j4 - 1) * 8589934592L) + j2;
            long j6 = (j4 * 8589934592L) + j2;
            j2 = Math.abs(j5 - j3) < Math.abs(j6 - j3) ? j5 : j6;
        }
        return a((j2 * 1000000) / 90000);
    }

    public long c() {
        if (this.a == Long.MAX_VALUE) {
            return 0L;
        }
        if (this.c == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.b;
    }

    public synchronized void d(long j2) {
        f.h.b.b.e2.j.g(this.c == -9223372036854775807L);
        this.a = j2;
    }
}
