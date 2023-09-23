package com.video_converter.video_compressor.screens.batchProcessingScreen;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.video_converter.video_compressor.constants.User;
import com.video_converter.video_compressor.services.BatchProcessingService;
import e.s.t;
import f.n.a.c.e;
import f.n.a.l.b;
import f.n.a.v.b.h;
import f.n.a.v.b.i;
import f.n.a.v.b.j;
import f.n.a.v.b.n;
import f.n.a.v.c.c;
import f.n.a.v.c.e.a;
import f.n.a.z.d;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class BatchScreenActivity extends a {
    public n w;
    public j x;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.x.v();
    }

    @Override // f.n.a.v.c.e.a, e.p.c.n, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FirebaseCrashlytics.getInstance().setCustomKey("CURRENT_ACTIVITY", "BatchScreenActivity");
        FirebaseCrashlytics.getInstance().setCustomKey("IS_SUBSCRIBED_USER", User.a());
        c h2 = P().h();
        this.w = new n(h2.a, null, h2);
        f.n.a.h.d.c P = P();
        final j jVar = new j(P.b, P.a(), P.g(), P.f(), P.b(), P.d());
        this.x = jVar;
        n nVar = this.w;
        jVar.f7102g = nVar;
        jVar.f7104i.a = nVar;
        jVar.f7107l = jVar.f7101f.getIntent().getBooleanExtra("FROM_NOTIFICATION_KEY", false);
        jVar.G = new f.n.a.n.c(jVar.f7101f);
        User.a.e(jVar.f7101f, new t() { // from class: f.n.a.v.b.d
            @Override // e.s.t
            public final void a(Object obj) {
                j jVar2 = j.this;
                User.Type type = (User.Type) obj;
                Objects.requireNonNull(jVar2);
                if (User.a()) {
                    jVar2.f7102g.A.setVisibility(8);
                }
            }
        });
        b.c().d(jVar.f7101f).f6543h.e(jVar.f7101f, new t() { // from class: f.n.a.v.b.c
            @Override // e.s.t
            public final void a(Object obj) {
                j jVar2 = j.this;
                List<f.j.b.c.a> list = (List) obj;
                Objects.requireNonNull(jVar2);
                if (list == null) {
                    return;
                }
                jVar2.G.c(list, jVar2.o);
            }
        });
        if (jVar.f7101f.getIntent().getBooleanExtra("START_BATCH_PROCESS", false) && !jVar.f7103h.c) {
            jVar.r();
        }
        if (!jVar.f7107l) {
            jVar.t();
        }
        if (!User.a() && !e.a && f.n.a.u.a.e().a()) {
            MobileAds.initialize(jVar.f7101f.getApplicationContext(), new h(jVar));
        }
        if (!User.a()) {
            jVar.B.postDelayed(new i(jVar), 250L);
        }
        f.n.a.u.a.e().k(jVar.f7101f);
        setContentView(this.w.f7131f);
        d.a(this, "BatchScreenActivity");
    }

    @Override // e.p.c.n, android.app.Activity
    public void onPause() {
        super.onPause();
        j jVar = this.x;
        jVar.F = true;
        jVar.C = false;
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.x.G.c = Boolean.valueOf(bundle.getBoolean("deep_link_handled"));
    }

    @Override // e.p.c.n, android.app.Activity
    public void onResume() {
        super.onResume();
        j jVar = this.x;
        jVar.F = false;
        jVar.C = true;
        jVar.G.a();
        d.a(this, "BatchScreenActivity");
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("deep_link_handled", this.x.G.c.booleanValue());
    }

    @Override // e.b.c.k, e.p.c.n, android.app.Activity
    public void onStart() {
        super.onStart();
        j jVar = this.x;
        jVar.f7102g.f7130g.add(jVar);
        jVar.f7101f.bindService(new Intent(jVar.f7101f, BatchProcessingService.class), jVar, 1);
        jVar.q.j(jVar);
        ((NotificationManager) jVar.f7101f.getSystemService("notification")).cancel(222);
    }

    @Override // f.n.a.v.c.e.a, e.b.c.k, e.p.c.n, android.app.Activity
    public void onStop() {
        super.onStop();
        j jVar = this.x;
        BatchProcessingService batchProcessingService = jVar.f7106k;
        if (batchProcessingService != null) {
            batchProcessingService.A.remove(jVar);
        }
        if (jVar.f7106k != null) {
            jVar.f7101f.unbindService(jVar);
        }
        jVar.q.l(jVar);
        ((NotificationManager) jVar.f7101f.getSystemService("notification")).cancel(222);
    }
}
