package e.g0.t.t;

import android.content.Context;
import android.os.PowerManager;
import java.util.WeakHashMap;

/* compiled from: WakeLocks.java */
/* loaded from: classes.dex */
public class m {
    public static final String a = e.g0.k.e("WakeLocks");
    public static final WeakHashMap<PowerManager.WakeLock, String> b = new WeakHashMap<>();

    public static PowerManager.WakeLock a(Context context, String str) {
        String p = f.a.b.a.a.p("WorkManager: ", str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, p);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, p);
        }
        return newWakeLock;
    }
}
