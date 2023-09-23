package f.e.a.r;

import android.os.SystemClock;

/* compiled from: LogTime.java */
/* loaded from: classes.dex */
public final class h {
    public static final double a = 1.0d / Math.pow(10.0d, 6.0d);
    public static final /* synthetic */ int b = 0;

    public static double a(long j2) {
        return (SystemClock.elapsedRealtimeNanos() - j2) * a;
    }
}
