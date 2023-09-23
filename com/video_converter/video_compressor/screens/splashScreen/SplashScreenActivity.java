package com.video_converter.video_compressor.screens.splashScreen;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import e.b.c.m;
import f.n.a.v.c.e.a;
import f.n.a.v.r.b;
import f.n.a.v.r.c;
import java.util.Objects;

/* loaded from: classes2.dex */
public class SplashScreenActivity extends a {
    public c w;
    public b x;

    @Override // f.n.a.v.c.e.a, e.p.c.n, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int intValue = ((Integer) f.l.b.c.b(this, Integer.class, "theme_status")).intValue();
        if (intValue == 1) {
            m.z(1);
        } else if (intValue == 2) {
            m.z(2);
        } else {
            m.z(-1);
        }
        super.onCreate(bundle);
        if (!isTaskRoot()) {
            String dataString = getIntent().getDataString();
            if (dataString != null) {
                Intent intent = new Intent(this, SplashScreenActivity.class);
                intent.setFlags(268468224);
                intent.setData(Uri.parse(dataString));
                startActivity(intent);
            }
            finish();
            return;
        }
        this.w = new c(P().h().a, null);
        this.x = new b(P().b);
        setContentView(this.w.f7131f);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.get("target_app_package_name") != null) {
                String string = extras.getString("target_app_package_name");
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + string)));
                finish();
                f.l.b.c.l(this, "last_activity", "");
            }
        }
        b bVar = this.x;
        Objects.requireNonNull(bVar);
        new Handler().postDelayed(new f.n.a.v.r.a(bVar), 1000);
        f.l.b.c.l(this, "last_activity", "");
    }
}
