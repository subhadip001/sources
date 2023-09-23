package f.n.a.v.c.e;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.LinearLayout;
import com.video_converter.video_compressor.adControllers.RewardedAdManager;
import e.b.c.k;
import f.n.a.n.f;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: BaseActivity.java */
/* loaded from: classes2.dex */
public class a extends k {
    public f.n.a.h.d.c t;
    public LinearLayout u;
    public RewardedAdManager v;

    public f.n.a.h.d.c P() {
        if (this.t == null) {
            this.t = new f.n.a.h.d.c(f.n.a.h.d.b.c(), this);
        }
        return this.t;
    }

    @Override // e.b.c.k, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        try {
            String string = PreferenceManager.getDefaultSharedPreferences(context).getString("LOCALE", null);
            if (string != null) {
                super.attachBaseContext(c.a(context, string));
            } else {
                super.attachBaseContext(context);
            }
        } catch (Exception unused) {
            super.attachBaseContext(context);
        }
    }

    @Override // e.p.c.n, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context baseContext = getBaseContext();
        String a = f.a(baseContext, Locale.getDefault().getLanguage());
        if (!Arrays.asList(f.b).contains(a)) {
            a = "en";
        }
        f.b(baseContext, a);
        RewardedAdManager rewardedAdManager = new RewardedAdManager();
        this.v = rewardedAdManager;
        rewardedAdManager.n(this, null, this);
    }

    @Override // e.b.c.k, e.p.c.n, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.v.p(this);
    }

    @Override // e.b.c.k, e.p.c.n, android.app.Activity
    public void onStop() {
        super.onStop();
    }
}
