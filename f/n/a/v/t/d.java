package f.n.a.v.t;

import android.view.View;
import com.video_converter.video_compressor.R;

/* compiled from: VideoCompressorScreenView.java */
/* loaded from: classes2.dex */
public class d implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ h f7467f;

    public d(h hVar) {
        this.f7467f = hVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_hint_rb_large_file /* 2131362945 */:
                this.f7467f.o.check(R.id.rb_large_file);
                return;
            case R.id.tv_hint_rb_medium_file /* 2131362946 */:
                this.f7467f.o.check(R.id.rb_medium_file);
                return;
            case R.id.tv_hint_rb_medium_hq_file /* 2131362947 */:
            default:
                return;
            case R.id.tv_hint_rb_small_file /* 2131362948 */:
                this.f7467f.o.check(R.id.rb_small_file);
                return;
        }
    }
}
