package f.n.a.v.i;

import android.view.View;
import com.video_converter.video_compressor.screens.common.Event;

/* compiled from: IntermediateSelectionScreenView.java */
/* loaded from: classes2.dex */
public class c implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Event f7240f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ d f7241g;

    public c(d dVar, Event event) {
        this.f7241g = dVar;
        this.f7240f = event;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        d dVar = this.f7241g;
        Event event = this.f7240f;
        for (a aVar : dVar.c()) {
            if (event.ordinal() == 40) {
                aVar.a();
            }
        }
    }
}
