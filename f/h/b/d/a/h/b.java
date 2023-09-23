package f.h.b.d.a.h;

import android.content.Context;
import android.os.Process;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class b {
    static {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String sb2 = sb.toString();
        if ("SplitInstallInfoProvider".length() != 0) {
            sb2.concat("SplitInstallInfoProvider");
        } else {
            new String(sb2);
        }
    }

    public b(Context context) {
        context.getPackageName();
    }
}
