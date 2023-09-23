package f.n.a.z;

import android.app.Activity;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: UserSessionStatistics.java */
/* loaded from: classes2.dex */
public class d {
    public static String a = "";

    public static void a(Activity activity, String str) {
        String b = b(a);
        String b2 = b(str);
        if (b != b2 && b != "NULL") {
            String q = f.a.b.a.a.q(b, "_", b2);
            Log.d("UserSessionStatistics", "addToStatistics: " + q);
            a = str;
            FirebaseAnalytics.getInstance(activity).logEvent("screen_nodes", f.a.b.a.a.S("screen_edge", q));
            return;
        }
        a = str;
    }

    public static String b(String str) {
        return str == "SplashScreenActivity" ? "SSA" : str == "HomeScreenActivity" ? "HSA" : str == "MediaPickerActivity" ? "MPA" : str == "VidCompInputScreenActivity" ? "VCISA" : str == "ProcessingScreenActivity" ? "PSA" : str == "BatchScreenActivity" ? "BSA" : str == "PurchaseScreenActivity" ? "PRSA" : str == "OutputsActivity" ? "OSA" : str == "VideoTrimFragment" ? "VTF" : str == "PreviewFragment" ? "PRF" : "NULL";
    }
}
