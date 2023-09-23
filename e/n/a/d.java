package e.n.a;

import android.os.Handler;
import android.os.Looper;

/* compiled from: ConcurrencyHelpers.java */
/* loaded from: classes.dex */
public class d {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
