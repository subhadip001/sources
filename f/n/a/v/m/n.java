package f.n.a.v.m;

import android.app.ProgressDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.screens.common.Event;

/* compiled from: ProcessingScreenView.java */
/* loaded from: classes2.dex */
public class n extends f.n.a.v.c.d.a<g> {
    public ImageView A;
    public ImageView B;
    public ImageView C;
    public Button D;
    public Button E;
    public ConstraintLayout F;
    public ImageView G;
    public TextView H;
    public FrameLayout I;
    public Button J;
    public LinearLayout K;
    public ProgressDialog L;

    /* renamed from: h  reason: collision with root package name */
    public ConstraintLayout f7315h;

    /* renamed from: i  reason: collision with root package name */
    public Button f7316i;

    /* renamed from: j  reason: collision with root package name */
    public TextView f7317j;

    /* renamed from: k  reason: collision with root package name */
    public TextView f7318k;

    /* renamed from: l  reason: collision with root package name */
    public TextView f7319l;

    /* renamed from: m  reason: collision with root package name */
    public TextView f7320m;
    public ProgressBar n;
    public TextView o;
    public ConstraintLayout p;
    public TextView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public ImageView w;
    public ImageView x;
    public ImageView y;
    public ImageView z;

    /* compiled from: ProcessingScreenView.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Event f7321f;

        public a(Event event) {
            this.f7321f = event;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n nVar = n.this;
            Event event = this.f7321f;
            for (g gVar : nVar.c()) {
                int ordinal = event.ordinal();
                if (ordinal == 38) {
                    gVar.o();
                } else if (ordinal != 52) {
                    switch (ordinal) {
                        case 24:
                            gVar.n();
                            continue;
                        case 25:
                            gVar.m();
                            continue;
                        case 26:
                            gVar.l();
                            continue;
                        case 27:
                            gVar.d();
                            continue;
                        case 28:
                            gVar.h();
                            continue;
                        case 29:
                            gVar.f();
                            continue;
                        default:
                            switch (ordinal) {
                                case 56:
                                    gVar.g();
                                    continue;
                                case 57:
                                    gVar.c();
                                    nVar.J.setEnabled(false);
                                    nVar.J.setText(nVar.b().getResources().getString(R.string.reported));
                                    continue;
                                case 58:
                                    gVar.i();
                                    continue;
                                default:
                                    continue;
                            }
                    }
                } else {
                    gVar.k();
                }
            }
        }
    }

    public n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f7131f = layoutInflater.inflate(R.layout.layout_processing_screen, viewGroup, false);
        this.f7315h = (ConstraintLayout) a(R.id.progress_container);
        this.f7316i = (Button) a(R.id.btn_stop);
        this.f7317j = (TextView) a(R.id.tv_progress_hint);
        this.f7318k = (TextView) a(R.id.tv_progress_message);
        this.f7319l = (TextView) a(R.id.tv_size_progress);
        this.f7320m = (TextView) a(R.id.tv_duration_progress);
        this.n = (ProgressBar) a(R.id.progress_bar);
        this.p = (ConstraintLayout) a(R.id.success_components_container);
        this.q = (TextView) a(R.id.tv_success_message);
        this.r = (TextView) a(R.id.tv_output_file_path);
        this.s = (TextView) a(R.id.tv_size_original);
        this.t = (TextView) a(R.id.tv_original_resolution);
        this.u = (TextView) a(R.id.tv_size_compressed);
        this.v = (TextView) a(R.id.tv_compressed_resolution);
        this.w = (ImageView) a(R.id.iv_check);
        this.x = (ImageView) a(R.id.ib_play);
        this.y = (ImageView) a(R.id.ib_share);
        this.z = (ImageView) a(R.id.ib_done);
        this.A = (ImageView) a(R.id.ib_delete);
        this.F = (ConstraintLayout) a(R.id.fail_components_container);
        this.G = (ImageView) a(R.id.iv_cross);
        this.H = (TextView) a(R.id.tv_fail_message);
        this.D = (Button) a(R.id.btn_dismiss);
        TextView textView = (TextView) a(R.id.enable_bg_processing);
        this.o = textView;
        textView.getPaint().setUnderlineText(true);
        this.B = (ImageView) a(R.id.ib_compare);
        this.E = (Button) a(R.id.btn_delet_original);
        this.C = (ImageView) a(R.id.ib_location);
        this.I = (FrameLayout) a(R.id.fragment_container);
        LinearLayout linearLayout = (LinearLayout) a(R.id.adLoadinView);
        this.J = (Button) a(R.id.btn_report_issue);
        this.K = (LinearLayout) a(R.id.adFrameLayoutHolder);
        d(this.J, Event.REPORT_ISSUE_CLICKED);
        d(this.f7316i, Event.ON_STOP_BTN_CLICKED);
        d(this.x, Event.ON_PLAY_BTN_CLICKED);
        d(this.y, Event.ON_SHARE_BTN_CLICKED);
        d(this.z, Event.ON_DONE_BTN_CLICKED);
        d(this.D, Event.ON_DISMISS_BTN_CLICKED);
        d(this.o, Event.ON_ENABLE_BG_PROCESS_CLICKED);
        d(this.A, Event.DELETE_BUTTON_CLICKED);
        d(this.E, Event.DELETE_ORIGINAL_FILE);
        d(this.B, Event.COMPARE_OUTPUT);
        d(this.C, Event.ON_BATCH_ITEM_LOCATION_BTN_CLICKED);
    }

    public final void d(View view, Event event) {
        view.setOnClickListener(new a(event));
    }
}
