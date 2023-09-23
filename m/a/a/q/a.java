package m.a.a.q;

import android.util.Log;
import java.util.logging.Level;
import m.a.a.f;

/* compiled from: AndroidLogger.java */
/* loaded from: classes2.dex */
public class a implements f {
    public static final boolean a;

    static {
        boolean z;
        try {
            Class.forName("android.util.Log");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
    }

    public a(String str) {
    }

    @Override // m.a.a.f
    public void a(Level level, String str) {
        if (level != Level.OFF) {
            Log.println(c(level), "EventBus", str);
        }
    }

    @Override // m.a.a.f
    public void b(Level level, String str, Throwable th) {
        if (level != Level.OFF) {
            int c = c(level);
            StringBuilder D = f.a.b.a.a.D(str, "\n");
            D.append(Log.getStackTraceString(th));
            Log.println(c, "EventBus", D.toString());
        }
    }

    public final int c(Level level) {
        int intValue = level.intValue();
        if (intValue < 800) {
            return intValue < 500 ? 2 : 3;
        } else if (intValue < 900) {
            return 4;
        } else {
            return intValue < 1000 ? 5 : 6;
        }
    }
}
