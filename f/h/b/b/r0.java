package f.h.b.b;

import android.os.Build;
import java.util.HashSet;

/* compiled from: ExoPlayerLibraryInfo.java */
/* loaded from: classes.dex */
public final class r0 {
    public static final HashSet<String> a;
    public static String b;

    static {
        String.valueOf(Build.VERSION.RELEASE).length();
        a = new HashSet<>();
        b = "goog.exo.core";
    }

    public static synchronized void a(String str) {
        synchronized (r0.class) {
            if (a.add(str)) {
                String str2 = b;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + str.length());
                sb.append(str2);
                sb.append(", ");
                sb.append(str);
                b = sb.toString();
            }
        }
    }
}
