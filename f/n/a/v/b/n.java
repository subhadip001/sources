package f.n.a.v.b;

import android.app.ProgressDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.screens.common.Event;
import java.util.Random;

/* compiled from: BatchScreenView.java */
/* loaded from: classes2.dex */
public class n extends f.n.a.v.c.d.a<g> implements Object {
    public LinearLayout A;
    public ProgressDialog B;

    /* renamed from: h  reason: collision with root package name */
    public View f7114h;

    /* renamed from: i  reason: collision with root package name */
    public View f7115i;

    /* renamed from: j  reason: collision with root package name */
    public View f7116j;

    /* renamed from: k  reason: collision with root package name */
    public RecyclerView f7117k;

    /* renamed from: l  reason: collision with root package name */
    public Button f7118l;

    /* renamed from: m  reason: collision with root package name */
    public Button f7119m;
    public View n;
    public ProgressBar o;
    public TextView p;
    public TextView q;
    public Button r;
    public Button s;
    public TextView t;
    public TextView u;
    public ImageView v;
    public TextView w;
    public LinearLayout x;
    public TextView y;
    public f.n.a.v.b.p.a z;

    /* compiled from: BatchScreenView.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Event f7120f;

        public a(Event event) {
            this.f7120f = event;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n nVar = n.this;
            Event event = this.f7120f;
            for (g gVar : nVar.c()) {
                int ordinal = event.ordinal();
                if (ordinal != 62) {
                    switch (ordinal) {
                        case 30:
                            gVar.r();
                            continue;
                        case 31:
                            gVar.k();
                            continue;
                        case 32:
                            gVar.o();
                            continue;
                        case 33:
                            gVar.s();
                            continue;
                    }
                } else {
                    gVar.l();
                }
            }
        }
    }

    public n(LayoutInflater layoutInflater, ViewGroup viewGroup, f.n.a.v.c.c cVar) {
        this.f7131f = layoutInflater.inflate(R.layout.layout_batch_screen, viewGroup, false);
        this.f7114h = a(R.id.view_batch_controller);
        this.f7115i = a(R.id.view_batch_progress);
        this.f7116j = a(R.id.view_batch_result);
        this.f7117k = (RecyclerView) a(R.id.batch_item_list);
        this.f7118l = (Button) a(R.id.btn_start);
        this.f7119m = (Button) a(R.id.btn_clear);
        this.o = (ProgressBar) a(R.id.progress_bar);
        this.p = (TextView) a(R.id.tv_processed_counter);
        this.q = (TextView) a(R.id.tv_file_name);
        this.r = (Button) a(R.id.btn_cancel);
        this.s = (Button) a(R.id.btn_ok);
        this.t = (TextView) a(R.id.tv_success);
        this.u = (TextView) a(R.id.tv_fail);
        this.v = (ImageView) a(R.id.iv_check);
        this.w = (TextView) a(R.id.tv_list_empty_message);
        LinearLayout linearLayout = (LinearLayout) a(R.id.adLoadinView);
        this.n = a(R.id.backBtn);
        this.x = (LinearLayout) a(R.id.indeterminate_progress_indicator);
        this.y = (TextView) a(R.id.pbText);
        this.A = (LinearLayout) a(new Random().nextInt(10) % 2 == 0 ? R.id.ad_holder : R.id.ad_holder_top);
        d(this.f7118l, Event.ON_START_BTN_CLICKED);
        d(this.f7119m, Event.ON_CLEAR_BTN_CLICKED);
        d(this.r, Event.ON_CANCEL_BTN_CLICKED);
        d(this.s, Event.ON_OK_BTN_CLICKED);
        d(this.n, Event.ON_BACK_BTN_CLICKED);
        this.z = new f.n.a.v.b.p.a(this, cVar);
        this.f7117k.setLayoutManager(new o(this, b()));
        this.f7117k.setAdapter(this.z);
    }

    public final void d(View view, Event event) {
        view.setOnClickListener(new a(event));
    }
}
