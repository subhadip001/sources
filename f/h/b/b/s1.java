package f.h.b.b;

import android.content.Context;
import android.net.wifi.WifiManager;

/* compiled from: WifiLockManager.java */
/* loaded from: classes.dex */
public final class s1 {
    public final WifiManager a;
    public WifiManager.WifiLock b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4479d;

    public s1(Context context) {
        this.a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    public final void a() {
        WifiManager.WifiLock wifiLock = this.b;
        if (wifiLock == null) {
            return;
        }
        if (this.c && this.f4479d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
