package f.n.a.z;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: SaleBannerDialogEventTracker.java */
/* loaded from: classes2.dex */
public class c {
    public static c a;
    public static final Object b = new Object();

    public static c a() {
        c cVar;
        synchronized (b) {
            if (a == null) {
                a = new c();
            }
            cVar = a;
        }
        return cVar;
    }

    public void b(Context context, String str, String str2) {
        FirebaseAnalytics.getInstance(context).logEvent("sale_banner_dialog_events", f.a.b.a.a.S("engagement", f.a.b.a.a.q(str, "-", str2)));
    }
}
