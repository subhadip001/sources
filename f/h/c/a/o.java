package f.h.c.a;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: Stopwatch.java */
/* loaded from: classes.dex */
public final class o {
    public boolean a;
    public long b;

    /* compiled from: Stopwatch.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public long a(TimeUnit timeUnit) {
        long j2 = 0;
        if (this.a) {
            int i2 = j.a;
            j2 = 0 + (System.nanoTime() - this.b);
        }
        return timeUnit.convert(j2, TimeUnit.NANOSECONDS);
    }

    public o b() {
        this.a = false;
        return this;
    }

    public o c() {
        f.h.b.c.a.C(!this.a, "This stopwatch is already running.");
        this.a = true;
        int i2 = j.a;
        this.b = System.nanoTime();
        return this;
    }

    public String toString() {
        long j2;
        String str;
        if (this.a) {
            int i2 = j.a;
            j2 = (System.nanoTime() - this.b) + 0;
        } else {
            j2 = 0;
        }
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(j2, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(j2, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(j2, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(j2, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(j2, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(j2, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        double convert = j2 / timeUnit2.convert(1L, timeUnit);
        int i3 = j.a;
        String format = String.format(Locale.ROOT, "%.4g", Double.valueOf(convert));
        switch (a.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG;
                break;
            default:
                throw new AssertionError();
        }
        return f.a.b.a.a.g(str.length() + f.a.b.a.a.x(format, 1), format, " ", str);
    }
}
