package f.n.a.v.g;

import android.app.Activity;
import android.content.Intent;
import com.video_converter.video_compressor.screens.batchProcessingScreen.BatchScreenActivity;

/* compiled from: FloatingBtnContainerController.java */
/* loaded from: classes2.dex */
public class b implements a {
    public d a;
    public f.n.a.d.b b;
    public Activity c;

    public b(Activity activity, f.n.a.d.b bVar) {
        this.c = activity;
        this.b = bVar;
    }

    @Override // f.n.a.v.g.a
    public void a() {
        this.c.startActivity(new Intent(this.c, BatchScreenActivity.class));
    }

    public void b() {
        this.a.f7130g.add(this);
        int c = this.b.c();
        if (c > 0) {
            this.a.f7203h.p();
            this.a.f7204i.setVisibility(0);
            this.a.f7204i.setText(String.valueOf(c));
            return;
        }
        this.a.f7203h.i();
        this.a.f7204i.setVisibility(8);
    }
}
