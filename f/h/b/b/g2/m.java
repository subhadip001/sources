package f.h.b.b.g2;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* compiled from: Log.java */
/* loaded from: classes.dex */
public final class m {
    public static String a(String str, Throwable th) {
        boolean z;
        String replace;
        if (th == null) {
            replace = null;
        } else {
            Throwable th2 = th;
            while (true) {
                if (th2 == null) {
                    z = false;
                    break;
                } else if (th2 instanceof UnknownHostException) {
                    z = true;
                    break;
                } else {
                    th2 = th2.getCause();
                }
            }
            replace = z ? "UnknownHostException (no network)" : Log.getStackTraceString(th).trim().replace("\t", "    ");
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        String valueOf = String.valueOf(str);
        String replace2 = replace.replace("\n", "\n  ");
        StringBuilder sb = new StringBuilder(String.valueOf(replace2).length() + valueOf.length() + 4);
        sb.append(valueOf);
        sb.append("\n  ");
        sb.append(replace2);
        sb.append('\n');
        return sb.toString();
    }

    public static void b(String str, String str2, Throwable th) {
        Log.e(str, a(str2, th));
    }

    public static void c(String str, String str2, Throwable th) {
        Log.w(str, a(str2, th));
    }
}
