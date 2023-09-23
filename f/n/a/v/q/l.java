package f.n.a.v.q;

import android.widget.RadioGroup;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.screens.common.Event;

/* compiled from: SimpleOptionsScreenView.java */
/* loaded from: classes2.dex */
public class l implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ o a;

    public l(o oVar) {
        this.a = oVar;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i2) {
        int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
        if (checkedRadioButtonId != R.id.fixedSizeRb) {
            switch (checkedRadioButtonId) {
                case R.id.rb_custom_options /* 2131362615 */:
                    o.d(this.a, Event.ON_CUSTOM_RB_SELECTED);
                    return;
                case R.id.rb_custom_resolutions /* 2131362616 */:
                    o.d(this.a, Event.ON_RESOLUTION_RB_SELECTED);
                    return;
                case R.id.rb_high_quality_file /* 2131362617 */:
                    o.d(this.a, Event.ON_HIGH_QUALITY_FILE_RB_SELECTED);
                    return;
                case R.id.rb_large_file /* 2131362618 */:
                    o.d(this.a, Event.ON_LARGE_FILE_RB_SELECTED);
                    return;
                case R.id.rb_lossy_file /* 2131362619 */:
                    o.d(this.a, Event.ON_LOSSY_FILE_RB_SELECTED);
                    return;
                case R.id.rb_medium_file /* 2131362620 */:
                    o.d(this.a, Event.ON_MEDIUM_FILE_RB_SELECTED);
                    return;
                case R.id.rb_medium_hq_file /* 2131362621 */:
                    o.d(this.a, Event.ON_MEDIUM_HQ_FILE_RB_SELECTED);
                    return;
                case R.id.rb_small_file /* 2131362622 */:
                    o.d(this.a, Event.ON_SMALL_FILE_RB_SELECTED);
                    return;
                case R.id.rb_small_hq_file /* 2131362623 */:
                    o.d(this.a, Event.ON_SMALL_HQ_FILE_RB_SELECTED);
                    return;
                default:
                    return;
            }
        }
        o.d(this.a, Event.FIXED_SIZE_RB_SELECTED);
    }
}
