package f.n.a.v.t;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.screens.common.Event;
import f.n.a.v.c.d.a;
import java.util.Random;

/* compiled from: VideoCompressorScreenView.java */
/* loaded from: classes2.dex */
public class h extends a<b> {

    /* renamed from: h  reason: collision with root package name */
    public CheckBox f7470h;

    /* renamed from: i  reason: collision with root package name */
    public CheckBox f7471i;

    /* renamed from: j  reason: collision with root package name */
    public Spinner f7472j;

    /* renamed from: k  reason: collision with root package name */
    public Spinner f7473k;

    /* renamed from: l  reason: collision with root package name */
    public SeekBar f7474l;

    /* renamed from: m  reason: collision with root package name */
    public SeekBar f7475m;
    public Button n;
    public RadioGroup o;
    public TextView p;
    public TextView q;
    public TextView r;

    public h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f7131f = layoutInflater.inflate(R.layout.layout_video_compressor, viewGroup, false);
        Log.d("Ariful", "VideoCompressorScreenView: layout_video_compressor");
        TextView textView = (TextView) a(R.id.tv_file_name);
        TextView textView2 = (TextView) a(R.id.tv_file_duration);
        TextView textView3 = (TextView) a(R.id.tv_video_resolution);
        TextView textView4 = (TextView) a(R.id.tv_file_size);
        TextView textView5 = (TextView) a(R.id.tv_estimated_size);
        TextView textView6 = (TextView) a(R.id.tv_sb_resolution);
        TextView textView7 = (TextView) a(R.id.tv_sb_bitrate);
        TextView textView8 = (TextView) a(R.id.tv_resolution_percentage);
        TextView textView9 = (TextView) a(R.id.tv_bitrate_percentage);
        TextView textView10 = (TextView) a(R.id.tv_size_hint_msg);
        ImageView imageView = (ImageView) a(R.id.iv_thumbnail);
        this.f7470h = (CheckBox) a(R.id.cb_custom);
        this.f7471i = (CheckBox) a(R.id.cb_high_quality);
        this.f7472j = (Spinner) a(R.id.spinner_resolution);
        this.f7473k = (Spinner) a(R.id.spinner_format);
        this.f7474l = (SeekBar) a(R.id.sb_resolution);
        this.f7475m = (SeekBar) a(R.id.sb_bitrate);
        this.n = (Button) a(R.id.btn_compress);
        ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.resolution_bitrate_seek_bar_container);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) a(R.id.estimated_size_container);
        ConstraintLayout constraintLayout3 = (ConstraintLayout) a(R.id.input_files_list_container);
        ConstraintLayout constraintLayout4 = (ConstraintLayout) a(R.id.input_file_details_container_main);
        LinearLayout linearLayout = (LinearLayout) a(R.id.indeterminate_progress_indicator);
        TextView textView11 = (TextView) a(R.id.pbText);
        LinearLayout linearLayout2 = (LinearLayout) a(new Random().nextInt(10) < 5 ? R.id.ad_holder : R.id.ad_holder_top);
        LinearLayout linearLayout3 = (LinearLayout) a(R.id.fab_btn_container);
        this.o = (RadioGroup) a(R.id.rg_compression_profiles);
        this.p = (TextView) a(R.id.tv_hint_rb_small_file);
        this.q = (TextView) a(R.id.tv_hint_rb_medium_file);
        this.r = (TextView) a(R.id.tv_hint_rb_large_file);
        ScrollView scrollView = (ScrollView) a(R.id.scroll_view_tweak_components);
        this.n.setOnClickListener(new e(this, Event.ON_COMPRESS_BTN_CLICKED));
        this.f7470h.setOnCheckedChangeListener(new f(this, Event.CUSTOM_CHECKBOX_CHANGED));
        this.f7471i.setOnCheckedChangeListener(new f(this, Event.HIGH_QUALITY_CHECKBOX_CHANGED));
        this.f7474l.setOnSeekBarChangeListener(new g(this, Event.ON_RESOLUTION_SEEK_BAR_CHANGED));
        this.f7475m.setOnSeekBarChangeListener(new g(this, Event.ON_BITRATE_SEEK_BAR_CHANGED));
        this.o.setOnCheckedChangeListener(new c(this));
        d dVar = new d(this);
        this.p.setOnClickListener(dVar);
        this.q.setOnClickListener(dVar);
        this.r.setOnClickListener(dVar);
        throw null;
    }

    public static void d(h hVar, Event event) {
        for (b bVar : hVar.c()) {
            int ordinal = event.ordinal();
            if (ordinal != 8) {
                switch (ordinal) {
                    case 13:
                        bVar.j();
                        continue;
                    case 14:
                        bVar.a();
                        continue;
                    case 15:
                        bVar.i();
                        continue;
                    case 16:
                        bVar.f();
                        continue;
                    case 17:
                        bVar.b();
                        continue;
                    case 18:
                        bVar.c();
                        continue;
                    case 19:
                        bVar.h();
                        continue;
                    case 20:
                        bVar.e();
                        continue;
                }
            } else {
                bVar.d();
            }
        }
    }
}
