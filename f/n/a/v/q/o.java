package f.n.a.v.q;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.screens.common.Event;
import java.util.Locale;

/* compiled from: SimpleOptionsScreenView.java */
/* loaded from: classes2.dex */
public class o extends f.n.a.v.c.d.a<b> {
    public ScrollView A;
    public ConstraintLayout B;
    public RadioButton C;
    public RadioButton D;
    public f.n.a.v.d.g E;

    /* renamed from: h  reason: collision with root package name */
    public TextView f7403h;

    /* renamed from: i  reason: collision with root package name */
    public TextView f7404i;

    /* renamed from: j  reason: collision with root package name */
    public TextView f7405j;

    /* renamed from: k  reason: collision with root package name */
    public TextView f7406k;

    /* renamed from: l  reason: collision with root package name */
    public Spinner f7407l;

    /* renamed from: m  reason: collision with root package name */
    public SeekBar f7408m;
    public SeekBar n;
    public RadioGroup o;
    public RadioButton p;
    public ScrollView q;
    public boolean r = false;
    public TextView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public TextView x;
    public TextView y;
    public f.n.a.v.t.j.a z;

    public o(LayoutInflater layoutInflater, ViewGroup viewGroup, f.n.a.v.c.c cVar) {
        this.f7131f = layoutInflater.inflate(R.layout.layout_simple_options, viewGroup, false);
        this.f7403h = (TextView) a(R.id.tv_sb_resolution);
        this.A = (ScrollView) a(R.id.scroll_view_profiles);
        this.f7404i = (TextView) a(R.id.tv_sb_bitrate);
        this.f7405j = (TextView) a(R.id.tv_resolution_percentage);
        this.f7406k = (TextView) a(R.id.tv_bitrate_percentage);
        this.p = (RadioButton) a(R.id.fixedSizeRb);
        this.f7407l = (Spinner) a(R.id.spinner_resolution);
        this.f7408m = (SeekBar) a(R.id.sb_resolution);
        this.n = (SeekBar) a(R.id.sb_bitrate);
        ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.resolution_bitrate_seek_bar_container);
        this.o = (RadioGroup) a(R.id.rg_compression_profiles);
        this.s = (TextView) a(R.id.tv_hint_rb_small_file);
        this.t = (TextView) a(R.id.tv_hint_rb_medium_file);
        this.u = (TextView) a(R.id.tv_hint_rb_large_file);
        this.v = (TextView) a(R.id.tv_hint_rb_small_hq_file);
        this.w = (TextView) a(R.id.tv_hint_rb_medium_hq_file);
        this.x = (TextView) a(R.id.tv_hint_rb_high_quality_file);
        this.y = (TextView) a(R.id.fixedSizeRbHint);
        this.q = (ScrollView) a(R.id.scroll_view_profiles);
        this.B = (ConstraintLayout) a(R.id.view_custom_options);
        this.C = (RadioButton) a(R.id.rb_custom_options);
        this.D = (RadioButton) a(R.id.rb_lossy_file);
        this.f7408m.setOnSeekBarChangeListener(new n(this, Event.ON_RESOLUTION_SEEK_BAR_CHANGED));
        this.n.setOnSeekBarChangeListener(new n(this, Event.ON_BITRATE_SEEK_BAR_CHANGED));
        this.o.setOnCheckedChangeListener(new l(this));
        m mVar = new m(this);
        this.s.setOnClickListener(mVar);
        this.t.setOnClickListener(mVar);
        this.u.setOnClickListener(mVar);
        this.v.setOnClickListener(mVar);
        this.w.setOnClickListener(mVar);
        this.x.setOnClickListener(mVar);
        this.p.setOnClickListener(new h(this));
        this.y.setOnClickListener(new i(this));
        this.A.setOnTouchListener(new j(this));
        f.n.a.v.t.j.a aVar = new f.n.a.v.t.j.a(b());
        this.z = aVar;
        this.f7407l.setAdapter((SpinnerAdapter) aVar);
        this.f7407l.setOnItemSelectedListener(new k(this));
        this.E = new f.n.a.v.d.g(cVar.a, viewGroup);
        this.p.setText(String.format(Locale.US, b().getResources().getString(R.string.fixed_size_output), ""));
    }

    public static void d(o oVar, Event event) {
        for (b bVar : oVar.c()) {
            bVar.m();
            int ordinal = event.ordinal();
            if (ordinal == 50) {
                bVar.o();
            } else if (ordinal != 51) {
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
                    case 21:
                        bVar.n();
                        continue;
                }
            } else {
                bVar.p();
            }
        }
    }
}
