package f.h.b.d.a.c;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class b {
    public final Map a = new HashMap();
    public final AtomicBoolean b = new AtomicBoolean(false);

    public final synchronized boolean a() {
        if (!this.b.get()) {
            synchronized (this) {
                this.a.put("assetOnlyUpdates", Boolean.FALSE);
            }
        }
        Object obj = this.a.get("assetOnlyUpdates");
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }
}
