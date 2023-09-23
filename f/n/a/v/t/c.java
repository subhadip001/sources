package f.n.a.v.t;

import android.widget.RadioGroup;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.screens.common.Event;

/* compiled from: VideoCompressorScreenView.java */
/* loaded from: classes2.dex */
public class c implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ h a;

    public c(h hVar) {
        this.a = hVar;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i2) {
        switch (radioGroup.getCheckedRadioButtonId()) {
            case R.id.rb_custom_resolutions /* 2131362616 */:
                h.d(this.a, Event.ON_RESOLUTION_RB_SELECTED);
                return;
            case R.id.rb_high_quality_file /* 2131362617 */:
            case R.id.rb_medium_hq_file /* 2131362621 */:
            default:
                return;
            case R.id.rb_large_file /* 2131362618 */:
                h.d(this.a, Event.ON_LARGE_FILE_RB_SELECTED);
                return;
            case R.id.rb_lossy_file /* 2131362619 */:
                h.d(this.a, Event.ON_LOSSY_FILE_RB_SELECTED);
                return;
            case R.id.rb_medium_file /* 2131362620 */:
                h.d(this.a, Event.ON_MEDIUM_FILE_RB_SELECTED);
                return;
            case R.id.rb_small_file /* 2131362622 */:
                h.d(this.a, Event.ON_SMALL_FILE_RB_SELECTED);
                return;
        }
    }
}
