package f.h.b.b;

import android.content.Context;
import android.os.PowerManager;

/* compiled from: WakeLockManager.java */
/* loaded from: classes.dex */
public final class r1 {
    public final PowerManager a;
    public PowerManager.WakeLock b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4478d;

    public r1(Context context) {
        this.a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    public final void a() {
        PowerManager.WakeLock wakeLock = this.b;
        if (wakeLock == null) {
            return;
        }
        if (this.c && this.f4478d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
