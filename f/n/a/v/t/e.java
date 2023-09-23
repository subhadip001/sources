package f.n.a.v.t;

import android.view.View;
import com.video_converter.video_compressor.screens.common.Event;

/* compiled from: VideoCompressorScreenView.java */
/* loaded from: classes2.dex */
public class e implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Event f7468f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ h f7469g;

    public e(h hVar, Event event) {
        this.f7469g = hVar;
        this.f7468f = event;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        h.d(this.f7469g, this.f7468f);
    }
}
