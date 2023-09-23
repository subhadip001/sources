package f.h.b.d.a.c;

import android.os.Bundle;
import android.os.Process;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public class a {
    public static final Map a;

    static {
        new HashSet(Arrays.asList("app_update", "review"));
        new HashSet(Arrays.asList("native", "unity"));
        a = new HashMap();
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String sb2 = sb.toString();
        if ("PlayCoreVersion".length() != 0) {
            sb2.concat("PlayCoreVersion");
        } else {
            new String(sb2);
        }
    }

    public static Bundle a(String str) {
        Map map;
        Bundle bundle = new Bundle();
        synchronized (a.class) {
            Map map2 = a;
            if (!map2.containsKey(str)) {
                HashMap hashMap = new HashMap();
                hashMap.put("java", 11003);
                map2.put(str, hashMap);
            }
            map = (Map) map2.get(str);
        }
        bundle.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
        if (map.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
        }
        if (map.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
        }
        return bundle;
    }
}
