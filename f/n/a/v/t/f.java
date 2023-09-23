package f.n.a.v.t;

import android.widget.CompoundButton;
import com.video_converter.video_compressor.screens.common.Event;

/* compiled from: VideoCompressorScreenView.java */
/* loaded from: classes2.dex */
public class f implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ Event a;
    public final /* synthetic */ h b;

    public f(h hVar, Event event) {
        this.b = hVar;
        this.a = event;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        h hVar = this.b;
        Event event = this.a;
        for (b bVar : hVar.c()) {
            int ordinal = event.ordinal();
            if (ordinal == 9) {
                bVar.l(z);
            } else if (ordinal == 10) {
                bVar.m(z);
            }
        }
    }
}
