package f.n.a.n;

import android.app.Activity;
import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: FbEventLogger.java */
/* loaded from: classes2.dex */
public class d {
    public Activity a;

    public d(Activity activity) {
        this.a = activity;
    }

    public void a(String str) {
        f.a.b.a.a.M(FirebaseAnalytics.getInstance(this.a), f.a.b.a.a.p("CE_", str));
    }

    public void b(String str) {
        f.a.b.a.a.M(FirebaseAnalytics.getInstance(this.a), f.a.b.a.a.p("CE_", str));
    }
}
