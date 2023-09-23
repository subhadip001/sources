package g.a;

import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: Deadline.java */
/* loaded from: classes2.dex */
public final class n implements Comparable<n> {

    /* renamed from: i  reason: collision with root package name */
    public static final b f7550i = new b(null);

    /* renamed from: j  reason: collision with root package name */
    public static final long f7551j;

    /* renamed from: k  reason: collision with root package name */
    public static final long f7552k;

    /* renamed from: l  reason: collision with root package name */
    public static final long f7553l;

    /* renamed from: f  reason: collision with root package name */
    public final c f7554f;

    /* renamed from: g  reason: collision with root package name */
    public final long f7555g;

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f7556h;

    /* compiled from: Deadline.java */
    /* loaded from: classes2.dex */
    public static class b extends c {
        public b() {
        }

        public b(a aVar) {
        }
    }

    /* compiled from: Deadline.java */
    /* loaded from: classes2.dex */
    public static abstract class c {
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f7551j = nanos;
        f7552k = -nanos;
        f7553l = TimeUnit.SECONDS.toNanos(1L);
    }

    public n(c cVar, long j2, boolean z) {
        Objects.requireNonNull((b) cVar);
        long nanoTime = System.nanoTime();
        this.f7554f = cVar;
        long min = Math.min(f7551j, Math.max(f7552k, j2));
        this.f7555g = nanoTime + min;
        this.f7556h = z && min <= 0;
    }

    public final void a(n nVar) {
        if (this.f7554f == nVar.f7554f) {
            return;
        }
        StringBuilder A = f.a.b.a.a.A("Tickers (");
        A.append(this.f7554f);
        A.append(" and ");
        A.append(nVar.f7554f);
        A.append(") don't match. Custom Ticker should only be used in tests!");
        throw new AssertionError(A.toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: d */
    public int compareTo(n nVar) {
        a(nVar);
        int i2 = ((this.f7555g - nVar.f7555g) > 0L ? 1 : ((this.f7555g - nVar.f7555g) == 0L ? 0 : -1));
        if (i2 < 0) {
            return -1;
        }
        return i2 > 0 ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            c cVar = this.f7554f;
            if (cVar != null ? cVar == nVar.f7554f : nVar.f7554f == null) {
                return this.f7555g == nVar.f7555g;
            }
            return false;
        }
        return false;
    }

    public boolean f() {
        if (!this.f7556h) {
            long j2 = this.f7555g;
            Objects.requireNonNull((b) this.f7554f);
            if (j2 - System.nanoTime() > 0) {
                return false;
            }
            this.f7556h = true;
        }
        return true;
    }

    public long g(TimeUnit timeUnit) {
        Objects.requireNonNull((b) this.f7554f);
        long nanoTime = System.nanoTime();
        if (!this.f7556h && this.f7555g - nanoTime <= 0) {
            this.f7556h = true;
        }
        return timeUnit.convert(this.f7555g - nanoTime, TimeUnit.NANOSECONDS);
    }

    public int hashCode() {
        return Arrays.asList(this.f7554f, Long.valueOf(this.f7555g)).hashCode();
    }

    public String toString() {
        long g2 = g(TimeUnit.NANOSECONDS);
        long abs = Math.abs(g2);
        long j2 = f7553l;
        long j3 = abs / j2;
        long abs2 = Math.abs(g2) % j2;
        StringBuilder sb = new StringBuilder();
        if (g2 < 0) {
            sb.append('-');
        }
        sb.append(j3);
        if (abs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        }
        sb.append("s from now");
        if (this.f7554f != f7550i) {
            StringBuilder A = f.a.b.a.a.A(" (ticker=");
            A.append(this.f7554f);
            A.append(")");
            sb.append(A.toString());
        }
        return sb.toString();
    }
}
