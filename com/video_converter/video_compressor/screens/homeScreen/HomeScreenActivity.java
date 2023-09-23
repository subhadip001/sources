package com.video_converter.video_compressor.screens.homeScreen;

import android.content.Intent;
import android.os.Bundle;
import f.n.a.v.c.e.a;
import f.n.a.v.g.b;
import f.n.a.v.h.e;
import f.n.a.v.h.j;
import f.n.a.z.d;
import java.util.Objects;

/* loaded from: classes2.dex */
public class HomeScreenActivity extends a {
    public j w;
    public e x;

    @Override // e.p.c.n, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        e eVar = this.x;
        Objects.requireNonNull(eVar);
        if (i2 != 112 || i3 == -1) {
            return;
        }
        eVar.q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e3, code lost:
        if ((r9 % r8) != 0) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ea  */
    @Override // f.n.a.v.c.e.a, e.p.c.n, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.video_converter.video_compressor.screens.homeScreen.HomeScreenActivity.onCreate(android.os.Bundle):void");
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

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.x.f7215m.c = Boolean.valueOf(bundle.getBoolean("deep_link_handled"));
    }

    @Override // e.p.c.n, android.app.Activity
    public void onResume() {
        super.onResume();
        e eVar = this.x;
        if (eVar.f7208f) {
            eVar.u();
        } else {
            eVar.q();
            eVar.f7215m.a();
        }
        d.a(this, "HomeScreenActivity");
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("deep_link_handled", this.x.f7215m.c.booleanValue());
    }

    @Override // e.b.c.k, e.p.c.n, android.app.Activity
    public void onStart() {
        super.onStart();
        e eVar = this.x;
        eVar.a.f7130g.add(eVar);
        b bVar = eVar.f7207e;
        bVar.a = eVar.f7206d;
        bVar.b();
    }

    @Override // f.n.a.v.c.e.a, e.b.c.k, e.p.c.n, android.app.Activity
    public void onStop() {
        super.onStop();
        e eVar = this.x;
        eVar.a.f7130g.remove(eVar);
        b bVar = eVar.f7207e;
        bVar.a.f7130g.remove(bVar);
    }
}
