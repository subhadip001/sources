package com.video_converter.video_compressor.screens.vidCompInputScreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import com.arthenica.ffmpegkit.usecase.FFmpegKitUseCase;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.adControllers.AdLoader;
import com.video_converter.video_compressor.constants.CompressionProfile;
import com.video_converter.video_compressor.constants.User;
import com.video_converter.video_compressor.model.MediaFile;
import e.p.c.n;
import e.s.t;
import f.n.a.n.d;
import f.n.a.v.c.b;
import f.n.a.v.c.c;
import f.n.a.v.c.e.a;
import f.n.a.v.q.e;
import f.n.a.v.s.c0;
import f.n.a.v.s.h;
import f.n.a.v.s.j;
import f.n.a.v.s.l;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes2.dex */
public class VidCompInputScreenActivity extends a implements e.a {
    public c0 w;
    public j x;

    @Override // e.p.c.n, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        this.x.F(i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onBackPressed() {
        /*
            r4 = this;
            java.lang.String r0 = "TAG"
            java.lang.String r1 = "onBackPressed: fra3g"
            android.util.Log.d(r0, r1)
            f.n.a.v.s.j r0 = r4.x
            java.util.Objects.requireNonNull(r0)
            f.n.a.m.b r1 = r0.s     // Catch: java.lang.Exception -> L50
            boolean r2 = r1.f7015h     // Catch: java.lang.Exception -> L50
            if (r2 == 0) goto L15
            r1.b()     // Catch: java.lang.Exception -> L50
        L15:
            androidx.fragment.app.FragmentManager r1 = r0.C()     // Catch: java.lang.Exception -> L50
            r2 = 2131362286(0x7f0a01ee, float:1.8344348E38)
            androidx.fragment.app.Fragment r1 = r1.H(r2)     // Catch: java.lang.Exception -> L50
            if (r1 == 0) goto L50
            boolean r2 = r1 instanceof f.n.a.v.u.e     // Catch: java.lang.Exception -> L50
            r3 = 0
            if (r2 == 0) goto L2f
            f.n.a.v.u.e r1 = (f.n.a.v.u.e) r1     // Catch: java.lang.Exception -> L50
            f.n.a.v.u.f r0 = r1.f7490h     // Catch: java.lang.Exception -> L50
            r0.a()     // Catch: java.lang.Exception -> L50
            goto L51
        L2f:
            boolean r2 = r1 instanceof f.n.a.v.l.a     // Catch: java.lang.Exception -> L50
            if (r2 == 0) goto L48
            f.n.a.v.l.a r1 = (f.n.a.v.l.a) r1     // Catch: java.lang.Exception -> L50
            f.n.a.v.l.e r0 = r1.f7275h     // Catch: java.lang.Exception -> L50
            boolean r1 = r0.f7287m     // Catch: java.lang.Exception -> L50
            if (r1 != 0) goto L51
            f.n.a.r.b r1 = r0.f7278d     // Catch: java.lang.Exception -> L50
            r1.c()     // Catch: java.lang.Exception -> L50
            e.p.c.n r0 = r0.a     // Catch: java.lang.Exception -> L50
            java.lang.String r1 = "VidCompInputScreenActivity"
            f.n.a.z.d.a(r0, r1)     // Catch: java.lang.Exception -> L50
            goto L51
        L48:
            androidx.fragment.app.FragmentManager r0 = r0.C()     // Catch: java.lang.Exception -> L50
            r0.Y()     // Catch: java.lang.Exception -> L50
            goto L51
        L50:
            r3 = 1
        L51:
            if (r3 == 0) goto L56
            r4.finish()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.video_converter.video_compressor.screens.vidCompInputScreen.VidCompInputScreenActivity.onBackPressed():void");
    }

    @Override // f.n.a.v.c.e.a, e.p.c.n, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FirebaseCrashlytics.getInstance().setCustomKey("CURRENT_ACTIVITY", "VidCompInputScreenActivity");
        FirebaseCrashlytics.getInstance().setCustomKey("IS_SUBSCRIBED_USER", User.a());
        c h2 = P().h();
        this.w = new c0(h2.a, null, H());
        f.n.a.h.d.c P = P();
        n nVar = P.b;
        b g2 = P.g();
        f.n.a.k.a b = P.b();
        f.n.a.h.b e2 = P.e();
        f.n.a.h.c f2 = P.f();
        c h3 = P.h();
        f.n.a.h.d.b bVar = P.a;
        if (bVar.f6947f == null) {
            bVar.f6947f = new f.n.a.s.c(bVar.b());
        }
        f.n.a.h.d.b bVar2 = P.a;
        if (bVar2.a == null) {
            bVar2.a = FFmpegKitUseCase.getInstance();
        }
        f.n.a.m.b bVar3 = new f.n.a.m.b(bVar2.a);
        f.n.a.d.b a = P.a();
        f.n.a.v.g.b bVar4 = new f.n.a.v.g.b(P.b, P.a());
        d c = P.c();
        if (P.f6952h == null) {
            P.f6952h = new f.n.a.h.d.a(P.b);
        }
        final j jVar = new j(nVar, g2, b, e2, f2, h3, bVar3, a, bVar4, c, P.f6952h);
        this.x = jVar;
        c0 c0Var = this.w;
        jVar.a = c0Var;
        jVar.b.b = c0Var;
        Objects.requireNonNull(jVar);
        User.a.e(jVar.o, new t() { // from class: f.n.a.v.s.e
            @Override // e.s.t
            public final void a(Object obj) {
                j jVar2 = j.this;
                User.Type type = (User.Type) obj;
                jVar2.I();
                if (User.a()) {
                    jVar2.a.r.setVisibility(8);
                }
            }
        });
        new Handler();
        jVar.a.f7423m.setVisibility(8);
        if (jVar.A() == null) {
            jVar.f7435i = true;
            jVar.b.c();
            h hVar = jVar.b;
            hVar.b.s.setText(jVar.o.getString(R.string.please_wait));
            f.n.a.x.e e3 = jVar.f7436j.e();
            e3.c = jVar;
            e3.a.f6940f.add(e3);
            e3.a.f(f.n.a.i.b.f6954d);
        } else {
            ArrayList<MediaFile> arrayList = new ArrayList<>();
            arrayList.add(jVar.A());
            jVar.r(arrayList);
            jVar.b.c();
            f.n.a.n.e eVar = jVar.f7430d;
            jVar.q = eVar.b(eVar.a(String.valueOf(jVar.A().f1372j)));
            jVar.I();
            jVar.H();
        }
        h hVar2 = jVar.b;
        View view = jVar.f7438l.f7131f;
        hVar2.b.t.removeAllViews();
        hVar2.b.t.addView(view);
        if (!User.a()) {
            try {
                jVar.a.r.setVisibility(0);
                n nVar2 = jVar.o;
                AdLoader adLoader = new AdLoader(nVar2, jVar.a.r, nVar2);
                jVar.P = adLoader;
                try {
                    adLoader.c();
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        jVar.u = jVar.v.b();
        f.n.a.u.a.e().k(jVar.o);
        new Handler().post(new l(jVar));
        j jVar2 = this.x;
        Intent intent = getIntent();
        Objects.requireNonNull(jVar2);
        if (intent != null) {
            jVar2.N = intent.getBooleanExtra("rewarded_for_batch_file", false);
        }
        setContentView(this.w.f7131f);
        f.n.a.z.d.a(this, "VidCompInputScreenActivity");
        this.x.Q = this.v;
    }

    @Override // f.n.a.v.c.e.a, e.b.c.k, e.p.c.n, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        f.l.b.c.j(this.x.o, String.class, "rret_sfrdf", null);
        try {
            Log.d("VidCompInputScreenL", "onDestroy: deleting files");
            f.n.a.v.a.e.a(f.n.a.i.b.f6956f);
        } catch (Exception e2) {
            StringBuilder A = f.a.b.a.a.A("onDestroy: ");
            A.append(e2.getMessage());
            Log.d("VidCompInputScreenL", A.toString());
        }
    }

    @Override // e.p.c.n, android.app.Activity
    public void onPause() {
        super.onPause();
        this.x.S.removeCallbacksAndMessages(null);
    }

    @Override // e.p.c.n, android.app.Activity
    public void onResume() {
        super.onResume();
        Objects.requireNonNull(this.x);
        f.n.a.z.d.a(this, "VidCompInputScreenActivity");
    }

    @Override // e.b.c.k, e.p.c.n, android.app.Activity
    public void onStart() {
        super.onStart();
        j jVar = this.x;
        jVar.a.f7130g.add(jVar);
        jVar.f7432f.j(jVar);
        f.n.a.v.g.b bVar = jVar.f7439m;
        bVar.a = jVar.f7438l;
        bVar.b();
    }

    @Override // f.n.a.v.c.e.a, e.b.c.k, e.p.c.n, android.app.Activity
    public void onStop() {
        super.onStop();
        j jVar = this.x;
        jVar.a.f7130g.remove(jVar);
        jVar.f7432f.l(jVar);
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Objects.requireNonNull(this.x);
    }

    @Override // f.n.a.v.q.e.a
    public void v(CompressionProfile compressionProfile) {
        j jVar = this.x;
        if (compressionProfile == CompressionProfile.FIXED_SIZE_COMPRESSION) {
            jVar.a.f7423m.setVisibility(8);
        } else if (jVar.f7435i) {
        } else {
            jVar.a.f7423m.setVisibility(0);
        }
    }
}
