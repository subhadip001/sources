package f.n.a.y;

import android.content.Context;
import android.os.PowerManager;

/* compiled from: WakeLockUseCase.java */
/* loaded from: classes2.dex */
public class e {
    public PowerManager.WakeLock a;
    public Context b;

    public e(Context context) {
        this.b = context;
    }

    public void a() {
        try {
            if (b().isHeld()) {
                b().release();
            }
            b().acquire();
        } catch (Exception unused) {
        }
    }

    public final PowerManager.WakeLock b() {
        if (this.a == null) {
            this.a = ((PowerManager) this.b.getSystemService("power")).newWakeLock(1, "VIDEO_COMPRESSOR::BATCH_PROCESS_WAKE_LOCK");
        }
        return this.a;
    }
}
