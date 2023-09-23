package f.h.b.b.g2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: SystemClock.java */
/* loaded from: classes.dex */
public class x implements f {
    @Override // f.h.b.b.g2.f
    public long a() {
        return SystemClock.uptimeMillis();
    }

    @Override // f.h.b.b.g2.f
    public y b(Looper looper, Handler.Callback callback) {
        return new y(new Handler(looper, callback));
    }

    @Override // f.h.b.b.g2.f
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }
}
