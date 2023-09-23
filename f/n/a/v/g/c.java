package f.n.a.v.g;

import android.view.View;
import com.video_converter.video_compressor.screens.common.Event;

/* compiled from: FloatingBtnContainerView.java */
/* loaded from: classes2.dex */
public class c implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Event f7201f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ d f7202g;

    public c(d dVar, Event event) {
        this.f7202g = dVar;
        this.f7201f = event;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        d dVar = this.f7202g;
        Event event = this.f7201f;
        for (a aVar : dVar.c()) {
            if (event.ordinal() == 39) {
                aVar.a();
            }
        }
    }
}
