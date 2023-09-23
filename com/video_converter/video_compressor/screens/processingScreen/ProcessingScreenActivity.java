package com.video_converter.video_compressor.screens.processingScreen;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.constants.User;
import com.video_converter.video_compressor.model.ProcessingInfo;
import com.video_converter.video_compressor.services.FFService;
import e.s.t;
import f.n.a.c.e;
import f.n.a.h.d.c;
import f.n.a.l.b;
import f.n.a.v.c.e.a;
import f.n.a.v.m.h;
import f.n.a.v.m.i;
import f.n.a.v.m.j;
import f.n.a.v.m.l;
import f.n.a.v.m.n;
import f.n.a.z.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class ProcessingScreenActivity extends a {
    public n w;
    public j x;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        j jVar = this.x;
        if (jVar.f7301f.H().J() > 0) {
            FragmentManager H = jVar.f7301f.H();
            H.A(new FragmentManager.m(null, -1, 1), false);
        } else if (jVar.z) {
            jVar.d();
        } else if (jVar.r) {
            if (!jVar.H && f.n.a.v.a.j.b(jVar.f7301f) && !f.n.a.u.a.e().c()) {
                jVar.H = true;
                f.n.a.v.a.j.q(jVar.f7301f);
            } else if (!User.a() && !f.n.a.u.a.e().c()) {
                jVar.f7301f.setResult(-1);
                jVar.f7301f.finish();
            } else if (User.a()) {
                jVar.f7301f.setResult(-1);
                jVar.f7301f.finish();
            }
        }
    }

    @Override // f.n.a.v.c.e.a, e.p.c.n, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FirebaseCrashlytics.getInstance().setCustomKey("CURRENT_ACTIVITY", "ProcessingScreenActivity");
        FirebaseCrashlytics.getInstance().setCustomKey("IS_SUBSCRIBED_USER", User.a());
        this.w = new n(P().h().a, null);
        c P = P();
        j jVar = new j(P.b, P.g(), P.f(), P.a.a(), P.d(), P.e(), P.b());
        this.x = jVar;
        n nVar = this.w;
        jVar.f7304i = nVar;
        jVar.f7306k.a = nVar;
        setContentView(nVar.f7131f);
        final j jVar2 = this.x;
        jVar2.p = jVar2.f7301f.getIntent().getBooleanExtra("FROM_NOTIFICATION_KEY", false);
        StringBuilder A = f.a.b.a.a.A("onCreate: ");
        A.append(jVar2.p);
        Log.d("ProcessingScreen", A.toString());
        jVar2.G = new f.n.a.n.c(jVar2.f7301f);
        if (!jVar2.p) {
            ProcessingInfo processingInfo = (ProcessingInfo) jVar2.f7301f.getIntent().getSerializableExtra("PROCESSING_INFO_KEY");
            jVar2.f7303h = processingInfo;
            f.n.a.g.c a = jVar2.n.a(processingInfo);
            jVar2.f7305j = a;
            a.a(null, new h(jVar2));
        }
        if (!User.a() && !e.a && f.n.a.u.a.e().a()) {
            MobileAds.initialize(jVar2.f7301f.getApplicationContext(), new i(jVar2));
        }
        if (!User.a()) {
            jVar2.s.post(new l(jVar2));
        }
        boolean z = true;
        jVar2.f7304i.f7318k.setSelected(true);
        e.p.c.n nVar2 = jVar2.f7301f;
        if (Build.VERSION.SDK_INT >= 23 && ((PowerManager) nVar2.getSystemService("power")).isIgnoringBatteryOptimizations(nVar2.getPackageName())) {
            z = false;
        }
        if (z) {
            jVar2.f7304i.o.setVisibility(0);
        }
        f.n.a.u.a.e().k(jVar2.f7301f);
        e.p.c.a aVar = new e.p.c.a(jVar2.f7301f.H());
        aVar.h(R.id.promoAppFragContainer, f.f.a.e.i((ArrayList) f.n.a.u.a.e().g(), User.a()), null);
        aVar.d();
        b.c().d(jVar2.f7301f).f6543h.e(jVar2.f7301f, new t() { // from class: f.n.a.v.m.a
            @Override // e.s.t
            public final void a(Object obj) {
                j jVar3 = j.this;
                List<f.j.b.c.a> list = (List) obj;
                Objects.requireNonNull(jVar3);
                if (list == null) {
                    return;
                }
                jVar3.G.c(list, jVar3.u);
            }
        });
        d.a(this, "ProcessingScreenActivity");
    }

    @Override // f.n.a.v.c.e.a, e.b.c.k, e.p.c.n, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // e.p.c.n, android.app.Activity
    public void onPause() {
        super.onPause();
        this.x.E = false;
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        try {
            this.x.r(bundle);
        } catch (Exception unused) {
        }
    }

    @Override // e.p.c.n, android.app.Activity
    public void onResume() {
        super.onResume();
        j jVar = this.x;
        jVar.E = true;
        jVar.G.a();
        d.a(this, "ProcessingScreenActivity");
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        j jVar = this.x;
        bundle.putBoolean("res_shown", jVar.r);
        bundle.putBoolean("compress_ongoing", jVar.q);
        bundle.putBoolean("full_screen_ad_shown", jVar.A);
        bundle.putBoolean("delete_original_file", jVar.z);
        bundle.putBoolean("deep_link_handled", jVar.G.c.booleanValue());
        Log.d("TESTCRASH", "onSaveInstanceState " + jVar.r + " " + jVar.q + " " + jVar.A);
    }

    @Override // e.b.c.k, e.p.c.n, android.app.Activity
    public void onStart() {
        super.onStart();
        j jVar = this.x;
        Objects.requireNonNull(jVar);
        jVar.f7301f.bindService(new Intent(jVar.f7301f, FFService.class), jVar, 1);
        jVar.f7304i.f7130g.add(jVar);
        ((NotificationManager) jVar.f7301f.getSystemService("notification")).cancel(222);
        if (User.a()) {
            jVar.f7306k.b.findViewById(R.id.container_native_ad_holder).setVisibility(8);
        }
        m.a.a.c.b().j(jVar);
    }

    @Override // f.n.a.v.c.e.a, e.b.c.k, e.p.c.n, android.app.Activity
    public void onStop() {
        super.onStop();
        j jVar = this.x;
        FFService fFService = jVar.o;
        if (fFService != null) {
            fFService.f1408m = null;
        }
        if (fFService != null) {
            jVar.f7301f.unbindService(jVar);
        }
        jVar.f7304i.f7130g.remove(jVar);
        ((NotificationManager) jVar.f7301f.getSystemService("notification")).cancel(222);
        m.a.a.c.b().l(jVar);
    }
}
