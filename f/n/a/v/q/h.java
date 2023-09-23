package f.n.a.v.q;

import android.view.View;
import com.video_converter.video_compressor.screens.common.Event;

/* compiled from: SimpleOptionsScreenView.java */
/* loaded from: classes2.dex */
public class h implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ o f7398f;

    public h(o oVar) {
        this.f7398f = oVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        o.d(this.f7398f, Event.ON_SET_CUSTOM_SIZE_CLICKED);
    }
}
