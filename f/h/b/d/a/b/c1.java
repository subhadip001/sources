package f.h.b.d.a.b;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class c1 {
    public final Map a = new HashMap();

    public final synchronized void a(String str) {
        this.a.put(str, Double.valueOf((double) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
    }
}
