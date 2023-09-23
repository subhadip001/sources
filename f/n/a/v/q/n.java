package f.n.a.v.q;

import android.widget.SeekBar;
import com.video_converter.video_compressor.screens.common.Event;

/* compiled from: SimpleOptionsScreenView.java */
/* loaded from: classes2.dex */
public class n implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ Event a;
    public final /* synthetic */ o b;

    public n(o oVar, Event event) {
        this.b = oVar;
        this.a = event;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
        o oVar = this.b;
        Event event = this.a;
        for (b bVar : oVar.c()) {
            int ordinal = event.ordinal();
            if (ordinal == 11) {
                bVar.k(i2, z);
            } else if (ordinal == 12) {
                bVar.g(i2, z);
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}
