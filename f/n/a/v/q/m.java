package f.n.a.v.q;

import android.view.View;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.screens.common.Event;

/* compiled from: SimpleOptionsScreenView.java */
/* loaded from: classes2.dex */
public class m implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ o f7402f;

    public m(o oVar) {
        this.f7402f = oVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_hint_rb_high_quality_file /* 2131362944 */:
                this.f7402f.o.check(R.id.rb_high_quality_file);
                o.d(this.f7402f, Event.ON_HIGH_QUALITY_FILE_RB_SELECTED);
                return;
            case R.id.tv_hint_rb_large_file /* 2131362945 */:
                this.f7402f.o.check(R.id.rb_large_file);
                o.d(this.f7402f, Event.ON_LARGE_FILE_RB_SELECTED);
                return;
            case R.id.tv_hint_rb_medium_file /* 2131362946 */:
                this.f7402f.o.check(R.id.rb_medium_file);
                o.d(this.f7402f, Event.ON_MEDIUM_FILE_RB_SELECTED);
                return;
            case R.id.tv_hint_rb_medium_hq_file /* 2131362947 */:
                this.f7402f.o.check(R.id.rb_medium_hq_file);
                o.d(this.f7402f, Event.ON_MEDIUM_HQ_FILE_RB_SELECTED);
                return;
            case R.id.tv_hint_rb_small_file /* 2131362948 */:
                this.f7402f.o.check(R.id.rb_small_file);
                o.d(this.f7402f, Event.ON_SMALL_FILE_RB_SELECTED);
                return;
            case R.id.tv_hint_rb_small_hq_file /* 2131362949 */:
                this.f7402f.o.check(R.id.rb_small_hq_file);
                o.d(this.f7402f, Event.ON_SMALL_FILE_RB_SELECTED);
                return;
            default:
                return;
        }
    }
}
