package com.video_converter.video_compressor.screens.settings;

import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import android.widget.TextView;
import com.video_converter.video_compressor.constants.User;
import e.p.c.n;
import f.n.a.n.f;
import f.n.a.v.c.e.a;
import f.n.a.v.p.b;
import f.n.a.v.p.c;
import f.n.a.v.p.d;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public class SettingActivity extends a {
    public d w;
    public c x;

    @Override // f.n.a.v.c.e.a, e.p.c.n, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.w = new d(P().h().a, null);
        c cVar = new c(P().b);
        this.x = cVar;
        d dVar = this.w;
        cVar.a = dVar;
        dVar.f7379l.setChecked(((Integer) f.l.b.c.b(cVar.b, Integer.class, "theme_status")).intValue() == 2);
        setContentView(this.w.f7131f);
        c cVar2 = this.x;
        Objects.requireNonNull(cVar2);
        if (User.a()) {
            return;
        }
        cVar2.f7374d.postDelayed(new b(cVar2), 250L);
    }

    @Override // f.n.a.v.c.e.a, e.b.c.k, e.p.c.n, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // e.p.c.n, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // e.p.c.n, android.app.Activity
    public void onResume() {
        super.onResume();
        Log.d("settinC", "onResume: activity");
        c cVar = this.x;
        Objects.requireNonNull(cVar);
        Log.d("settingC", "checkAndUpdateBgEnabler() called");
        PowerManager powerManager = (PowerManager) cVar.b.getSystemService("power");
        if (Build.VERSION.SDK_INT >= 23) {
            if (powerManager.isIgnoringBatteryOptimizations(cVar.b.getApplicationContext().getPackageName())) {
                cVar.i(false);
                return;
            } else {
                cVar.i(true);
                return;
            }
        }
        cVar.i(true);
    }

    @Override // e.b.c.k, e.p.c.n, android.app.Activity
    public void onStart() {
        super.onStart();
        c cVar = this.x;
        cVar.a.f7130g.add(cVar);
        TextView textView = cVar.a.f7375h;
        n nVar = cVar.b;
        String[] strArr = f.c;
        String a = f.a(nVar, "en");
        f.a = a;
        textView.setText(strArr[Arrays.asList(f.b).indexOf(a)]);
    }

    @Override // f.n.a.v.c.e.a, e.b.c.k, e.p.c.n, android.app.Activity
    public void onStop() {
        super.onStop();
        c cVar = this.x;
        cVar.a.f7130g.remove(cVar);
    }
}
