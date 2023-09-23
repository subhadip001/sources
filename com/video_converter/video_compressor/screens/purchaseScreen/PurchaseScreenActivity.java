package com.video_converter.video_compressor.screens.purchaseScreen;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import f.n.a.h.d.c;
import f.n.a.l.b;
import f.n.a.v.c.e.a;
import f.n.a.v.n.g;
import f.n.a.v.n.p;
import f.n.a.z.d;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes2.dex */
public class PurchaseScreenActivity extends a {
    public p w;
    public g x;
    public ArrayList<String> y = new ArrayList<>();

    @Override // f.n.a.v.c.e.a, e.p.c.n, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.y = extras.getStringArrayList("KEY_PRODUCT_IDS");
        }
        this.w = new p(P().h().a, null);
        c P = P();
        g gVar = new g(P.b, P.b(), P.c(), this.y);
        this.x = gVar;
        gVar.b = this.w;
        b.c().d(gVar.a).h();
        setContentView(this.w.f7131f);
        d.a(this, "PurchaseScreenActivity");
        f.n.a.z.b.a().a = false;
        Objects.requireNonNull(f.n.a.z.b.a());
        f.l.b.c.k(this, "purchase_screen_visit_count", ((Integer) f.l.b.c.b(this, Integer.class, "purchase_screen_visit_count")).intValue() + 1);
        f.n.a.z.b a = f.n.a.z.b.a();
        Objects.requireNonNull(a);
        Bundle bundle2 = new Bundle();
        bundle2.putString("impression", a.b);
        FirebaseAnalytics.getInstance(this).logEvent("purchase_screen_events", bundle2);
    }

    @Override // f.n.a.v.c.e.a, e.b.c.k, e.p.c.n, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Objects.requireNonNull(this.x);
    }

    @Override // e.p.c.n, android.app.Activity
    public void onPause() {
        super.onPause();
        Objects.requireNonNull(this.x);
    }

    @Override // e.p.c.n, android.app.Activity
    public void onResume() {
        super.onResume();
        Objects.requireNonNull(this.x);
        d.a(this, "PurchaseScreenActivity");
    }

    @Override // e.b.c.k, e.p.c.n, android.app.Activity
    public void onStart() {
        super.onStart();
        g gVar = this.x;
        gVar.b.f7130g.add(gVar);
    }

    @Override // f.n.a.v.c.e.a, e.b.c.k, e.p.c.n, android.app.Activity
    public void onStop() {
        super.onStop();
        g gVar = this.x;
        gVar.b.f7130g.remove(gVar);
    }
}
