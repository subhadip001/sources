package com.video_converter.video_compressor.screens.intermediateSelectionScreen;

import android.os.Bundle;
import com.video_converter.video_compressor.R;
import e.p.c.n;
import f.n.a.v.c.c;
import f.n.a.v.c.e.a;
import f.n.a.v.i.b;
import f.n.a.v.i.d;
import f.n.a.x.e;

/* loaded from: classes2.dex */
public class IntermediateFileSelectionActivity extends a {
    public d w;
    public b x;

    @Override // f.n.a.v.c.e.a, e.p.c.n, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c h2 = P().h();
        this.w = new d(h2.a, null, h2);
        f.n.a.h.d.c P = P();
        n nVar = P.b;
        f.n.a.h.c f2 = P.f();
        if (P.f6951g == null) {
            P.f6951g = new f.n.a.h.d.d(P.b);
        }
        b bVar = new b(nVar, f2, P.f6951g, P.b());
        this.x = bVar;
        d dVar = this.w;
        bVar.b = dVar;
        dVar.f7244j.setVisibility(0);
        bVar.b.f7245k.setText(bVar.a.getString(R.string.please_wait));
        e e2 = bVar.c.e();
        e2.c = bVar;
        e2.a.f6940f.add(e2);
        e2.a.f(f.n.a.i.b.f6954d);
        f.n.a.u.a.e().k(bVar.a);
        setContentView(this.w.f7131f);
    }

    @Override // e.b.c.k, e.p.c.n, android.app.Activity
    public void onStart() {
        super.onStart();
        b bVar = this.x;
        bVar.b.f7130g.add(bVar);
        bVar.f7238g.j(bVar);
    }

    @Override // f.n.a.v.c.e.a, e.b.c.k, e.p.c.n, android.app.Activity
    public void onStop() {
        super.onStop();
        b bVar = this.x;
        bVar.b.f7130g.remove(bVar);
        bVar.f7238g.l(bVar);
    }
}
