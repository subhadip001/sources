package f.n.a.v.q;

import android.os.Handler;
import android.view.View;
import com.video_converter.video_compressor.screens.common.Event;

/* compiled from: SimpleOptionsScreenView.java */
/* loaded from: classes2.dex */
public class i implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ o f7399f;

    public i(o oVar) {
        this.f7399f = oVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        final o oVar = this.f7399f;
        if (oVar.r) {
            return;
        }
        oVar.r = true;
        new Handler().postDelayed(new Runnable() { // from class: f.n.a.v.q.a
            @Override // java.lang.Runnable
            public final void run() {
                o.this.r = false;
            }
        }, 1000L);
        if (!this.f7399f.p.isChecked()) {
            this.f7399f.p.setChecked(true);
        }
        o.d(this.f7399f, Event.ON_SET_CUSTOM_SIZE_CLICKED);
    }
}
