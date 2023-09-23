package f.n.a.v.t;

import android.widget.SeekBar;
import com.video_converter.video_compressor.screens.common.Event;

/* compiled from: VideoCompressorScreenView.java */
/* loaded from: classes2.dex */
public class g implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ Event a;
    public final /* synthetic */ h b;

    public g(h hVar, Event event) {
        this.b = hVar;
        this.a = event;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
        h hVar = this.b;
        Event event = this.a;
        for (b bVar : hVar.c()) {
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
