package f.n.a.v.s;

import android.database.DataSetObservable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.screens.common.Event;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* compiled from: VidCompInputScreenView.java */
/* loaded from: classes2.dex */
public class c0 extends f.n.a.v.c.d.a<i> {
    public View A;
    public RecyclerView B;
    public g C;

    /* renamed from: h  reason: collision with root package name */
    public FrameLayout f7418h;

    /* renamed from: i  reason: collision with root package name */
    public TextView f7419i;

    /* renamed from: j  reason: collision with root package name */
    public TextView f7420j;

    /* renamed from: k  reason: collision with root package name */
    public TextView f7421k;

    /* renamed from: l  reason: collision with root package name */
    public Button f7422l;

    /* renamed from: m  reason: collision with root package name */
    public Button f7423m;
    public Spinner n;
    public Spinner o;
    public TextView p;
    public LinearLayout q;
    public LinearLayout r;
    public TextView s;
    public LinearLayout t;
    public ConstraintLayout u;
    public ConstraintLayout v;
    public ConstraintLayout w;
    public f.n.a.v.t.j.a x;
    public FrameLayout y;
    public TextView z;

    /* compiled from: VidCompInputScreenView.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Event f7424f;

        public a(Event event) {
            this.f7424f = event;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c0 c0Var = c0.this;
            Event event = this.f7424f;
            for (i iVar : c0Var.c()) {
                int ordinal = event.ordinal();
                if (ordinal == 8) {
                    iVar.d();
                } else if (ordinal == 53) {
                    iVar.m();
                } else if (ordinal == 59) {
                    iVar.e();
                } else if (ordinal == 22) {
                    iVar.i();
                } else if (ordinal == 23) {
                    iVar.l();
                }
            }
        }
    }

    public c0(LayoutInflater layoutInflater, ViewGroup viewGroup, FragmentManager fragmentManager) {
        this.f7131f = layoutInflater.inflate(R.layout.layout_vid_comp_input_screen, viewGroup, false);
        new DataSetObservable();
        new ArrayList();
        new ArrayList();
        this.f7418h = (FrameLayout) a(R.id.simpleOptionsContainer);
        this.y = (FrameLayout) a(R.id.fragment_container);
        TextView textView = (TextView) a(R.id.tv_file_name);
        TextView textView2 = (TextView) a(R.id.tv_video_resolution);
        TextView textView3 = (TextView) a(R.id.tv_file_size);
        this.f7419i = (TextView) a(R.id.tv_estimated_size);
        this.f7420j = (TextView) a(R.id.tv_size_hint_msg);
        this.o = (Spinner) a(R.id.spinner_format);
        this.n = (Spinner) a(R.id.spinner_format_single);
        this.p = (TextView) a(R.id.spinner_codec);
        this.f7421k = (TextView) a(R.id.speed_tv);
        ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.input_file_details_container_main);
        this.f7422l = (Button) a(R.id.btn_compress);
        this.f7423m = (Button) a(R.id.btnPreview);
        this.q = (LinearLayout) a(R.id.indeterminate_progress_indicator);
        this.s = (TextView) a(R.id.pbText);
        this.z = (TextView) a(R.id.progresCountTv);
        ImageView imageView = (ImageView) a(R.id.videoThumb);
        this.A = a(R.id.trimCard);
        this.v = (ConstraintLayout) a(R.id.view_format_container_single);
        this.w = (ConstraintLayout) a(R.id.view_format_container_batch);
        this.t = (LinearLayout) a(R.id.fab_btn_container);
        this.u = (ConstraintLayout) a(R.id.estimated_size_container);
        int nextInt = new Random().nextInt(10);
        f.a.b.a.a.N("getRandAdPosition: ", nextInt, "TAGTAG");
        this.r = (LinearLayout) a(nextInt < 5 ? R.id.ad_holder : R.id.ad_holder_top);
        g(this.f7422l, Event.ON_COMPRESS_BTN_CLICKED);
        g(this.f7421k, Event.ON_CHANGE_SPEED_CLICKED);
        g(this.p, Event.ON_CHANGE_CODEC_CLICKED);
        g(this.f7423m, Event.PREVIEW_BUTTON_CLICKED);
        g(this.A, Event.FILE_LIST_EXPAND);
        f.n.a.v.t.j.a aVar = new f.n.a.v.t.j.a(b());
        this.x = aVar;
        this.o.setAdapter((SpinnerAdapter) aVar);
        this.o.setOnItemSelectedListener(new a0(this));
        this.n.setAdapter((SpinnerAdapter) this.x);
        this.n.setOnItemSelectedListener(new b0(this));
        this.B = (RecyclerView) a(R.id.fileListSpinner);
        g gVar = new g();
        this.C = gVar;
        this.B.setAdapter(gVar);
        this.C.b = new y(this);
        this.B.setOnTouchListener(new z(this));
        try {
            this.n.setDescendantFocusability(131072);
            this.w.setDescendantFocusability(131072);
        } catch (Exception unused) {
        }
    }

    public void d(List<f.n.a.m.c.a> list) {
        g gVar = this.C;
        gVar.a = list;
        gVar.notifyDataSetChanged();
        try {
            int size = list.size() - 1;
            Log.d("TAG", "bindInputFileListItems: " + size);
            this.B.q0(size);
        } catch (Exception unused) {
        }
    }

    public f.n.a.v.c.a e(e.p.c.n nVar) {
        try {
            return (f.n.a.v.c.a) nVar.H().H(R.id.simpleOptionsContainer);
        } catch (Exception unused) {
            return null;
        }
    }

    public void f(int i2) {
        f.a.b.a.a.N("scrollFileListSpinner: called", i2, "TAG");
        try {
            this.B.o0(i2, 0);
            if (this.B.canScrollHorizontally(i2)) {
                return;
            }
            for (i iVar : c()) {
                iVar.j();
            }
        } catch (Exception unused) {
        }
    }

    public final void g(View view, Event event) {
        view.setOnClickListener(new a(event));
    }
}
