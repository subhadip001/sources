package f.n.a.v.r;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.video_converter.video_compressor.screens.homeScreen.HomeScreenActivity;

/* compiled from: SplashScreenController.java */
/* loaded from: classes2.dex */
public class b {
    public Activity a;

    public b(Activity activity) {
        this.a = activity;
        if (!activity.isTaskRoot()) {
            activity.finish();
        } else {
            f.n.a.u.a.e().k(activity);
        }
    }

    public final void a(Uri uri) {
        Intent intent = new Intent(this.a, HomeScreenActivity.class);
        if (uri != null) {
            intent.putExtra("deep_link_uri", uri.toString());
        }
        this.a.startActivity(intent);
        this.a.finish();
    }
}
