package f.n.a.v.e;

import android.util.Log;
import android.widget.SeekBar;

/* compiled from: FileNameInputBottomSheetView.java */
/* loaded from: classes2.dex */
public class u implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ x a;

    public u(x xVar) {
        this.a = xVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
        for (e eVar : this.a.c()) {
            eVar.c(i2, Boolean.valueOf(z));
            Log.d("TAGTAG", "onProgressChanged: ");
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}
