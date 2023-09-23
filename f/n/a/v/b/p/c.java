package f.n.a.v.b.p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.screens.common.Event;
import f.n.a.v.b.p.b;

/* compiled from: BatchItemViewImpl.java */
/* loaded from: classes2.dex */
public class c extends f.n.a.v.c.d.a<b.a> implements b {
    public TextView A;
    public TextView B;
    public TextView C;
    public Button D;
    public ConstraintLayout E;
    public ConstraintLayout F;
    public LinearLayout G;

    /* renamed from: h  reason: collision with root package name */
    public f.n.a.d.a f7122h;

    /* renamed from: i  reason: collision with root package name */
    public ImageButton f7123i;

    /* renamed from: j  reason: collision with root package name */
    public ImageButton f7124j;

    /* renamed from: k  reason: collision with root package name */
    public ImageButton f7125k;

    /* renamed from: l  reason: collision with root package name */
    public ImageButton f7126l;

    /* renamed from: m  reason: collision with root package name */
    public ImageButton f7127m;
    public ImageButton n;
    public Button o;
    public TextView p;
    public TextView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public TextView x;
    public View y;
    public View z;

    /* compiled from: BatchItemViewImpl.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Event f7128f;

        public a(Event event) {
            this.f7128f = event;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c cVar = c.this;
            Event event = this.f7128f;
            for (b.a aVar : cVar.c()) {
                int ordinal = event.ordinal();
                if (ordinal == 52) {
                    aVar.i(cVar.f7122h);
                } else if (ordinal == 56) {
                    aVar.d(cVar.f7122h);
                } else if (ordinal != 57) {
                    switch (ordinal) {
                        case 34:
                            aVar.g(cVar.f7122h);
                            continue;
                        case 35:
                            aVar.l(cVar.f7122h);
                            continue;
                        case 36:
                            aVar.j(cVar.f7122h);
                            continue;
                        case 37:
                            aVar.k(cVar.f7122h);
                            continue;
                        case 38:
                            aVar.m(cVar.f7122h);
                            continue;
                    }
                } else {
                    aVar.c();
                    cVar.D.setEnabled(false);
                    cVar.D.setText(cVar.b().getResources().getString(R.string.reported));
                }
            }
        }
    }

    public c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f7131f = layoutInflater.inflate(R.layout.layout_batch_item, viewGroup, false);
        this.y = a(R.id.success_control_panel);
        this.f7123i = (ImageButton) a(R.id.ib_remove);
        this.f7124j = (ImageButton) a(R.id.ib_play);
        this.f7125k = (ImageButton) a(R.id.ib_share);
        this.f7126l = (ImageButton) a(R.id.ib_delete);
        this.f7127m = (ImageButton) a(R.id.ib_location);
        this.o = (Button) a(R.id.btn_delet_original);
        this.n = (ImageButton) a(R.id.ib_compare);
        this.C = (TextView) a(R.id.tv_outputFormat);
        this.B = (TextView) a(R.id.output_format_hint);
        this.D = (Button) a(R.id.reportIssueBtn);
        this.F = (ConstraintLayout) a(R.id.reportBtnContainer);
        d(this.D, Event.REPORT_ISSUE_CLICKED);
        d(this.f7123i, Event.ON_BATCH_ITEM_REMOVE_BTN_CLICKED);
        d(this.f7124j, Event.ON_BATCH_ITEM_PLAY_BTN_CLICKED);
        d(this.f7125k, Event.ON_BATCH_ITEM_SHARE_BTN_CLICKED);
        d(this.f7126l, Event.ON_BATCH_ITEM_DELETE_BTN_CLICKED);
        d(this.f7127m, Event.ON_BATCH_ITEM_LOCATION_BTN_CLICKED);
        d(this.n, Event.COMPARE_OUTPUT);
        d(this.o, Event.DELETE_ORIGINAL_FILE);
        this.p = (TextView) a(R.id.tv_status);
        this.q = (TextView) a(R.id.tv_file_name);
        this.r = (TextView) a(R.id.tv_original_resolution);
        this.s = (TextView) a(R.id.tv_size_original);
        this.t = (TextView) a(R.id.tv_size_compressed);
        this.u = (TextView) a(R.id.tv_compressed_resolution);
        this.x = (TextView) a(R.id.tv_profile);
        TextView textView = (TextView) a(R.id.tv_output_file_path);
        this.v = (TextView) a(R.id.tv_fail_message);
        this.w = (TextView) a(R.id.tv_compression_percentage);
        this.z = a(R.id.view_compression_percentage_container);
        this.A = (TextView) a(R.id.tv_compression_percentage_hint);
        this.E = (ConstraintLayout) a(R.id.result_container);
        this.G = (LinearLayout) a(R.id.batch_ad_holder);
    }

    public final void d(View view, Event event) {
        view.setOnClickListener(new a(event));
    }
}
