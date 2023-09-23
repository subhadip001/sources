package f.n.a.v.l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import com.google.android.exoplayer2.ui.PlayerView;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.screens.common.Event;

/* compiled from: PreviewScreenView.java */
/* loaded from: classes2.dex */
public class g extends f.n.a.v.c.d.a<f> implements Object {
    public TextView A;
    public TextView B;
    public TextView C;

    /* renamed from: h  reason: collision with root package name */
    public PlayerView f7288h;

    /* renamed from: i  reason: collision with root package name */
    public PlayerView f7289i;

    /* renamed from: j  reason: collision with root package name */
    public RelativeLayout f7290j;

    /* renamed from: k  reason: collision with root package name */
    public Button f7291k;

    /* renamed from: l  reason: collision with root package name */
    public Button f7292l;

    /* renamed from: m  reason: collision with root package name */
    public TextView f7293m;
    public TextView n;
    public Button o;
    public Button p;
    public TextView q;
    public LinearLayout r;
    public ProgressBar s;
    public RelativeLayout t;
    public ImageButton u;
    public DefaultTimeBar v;
    public DefaultTimeBar w;
    public ImageButton x;
    public ImageButton y;
    public TextView z;

    /* compiled from: PreviewScreenView.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Event f7294f;

        public a(Event event) {
            this.f7294f = event;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g gVar = g.this;
            Event event = this.f7294f;
            for (f fVar : gVar.c()) {
                int ordinal = event.ordinal();
                if (ordinal == 32) {
                    fVar.d();
                } else if (ordinal == 41) {
                    fVar.a();
                } else if (ordinal == 54) {
                    fVar.c();
                } else if (ordinal == 55) {
                    fVar.b();
                }
            }
        }
    }

    public g(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f7131f = layoutInflater.inflate(R.layout.layout_preview_screen, viewGroup, false);
        PlayerView playerView = (PlayerView) a(R.id.playerTop);
        this.f7288h = playerView;
        this.v = (DefaultTimeBar) playerView.findViewById(R.id.exo_progress);
        ImageButton imageButton = (ImageButton) this.f7288h.findViewById(R.id.exo_play);
        ImageButton imageButton2 = (ImageButton) this.f7288h.findViewById(R.id.exo_pause);
        PlayerView playerView2 = (PlayerView) a(R.id.playerBottom);
        this.f7289i = playerView2;
        this.w = (DefaultTimeBar) playerView2.findViewById(R.id.exo_progress);
        this.x = (ImageButton) this.f7289i.findViewById(R.id.exo_play);
        this.y = (ImageButton) this.f7289i.findViewById(R.id.exo_pause);
        this.r = (LinearLayout) a(R.id.canceling_layout);
        this.f7290j = (RelativeLayout) a(R.id.loadingView);
        this.f7293m = (TextView) a(R.id.title);
        this.q = (TextView) a(R.id.subtitle);
        this.n = (TextView) a(R.id.progressTv);
        this.s = (ProgressBar) a(R.id.progressBar);
        this.f7291k = (Button) a(R.id.okButton);
        this.f7292l = (Button) a(R.id.cancelBtn);
        this.t = (RelativeLayout) a(R.id.loadingView);
        ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.containerMain);
        CardView cardView = (CardView) a(R.id.previewContainer);
        CardView cardView2 = (CardView) a(R.id.originalContainer);
        this.u = (ImageButton) a(R.id.closeBtn);
        this.z = (TextView) a(R.id.originalSize);
        this.o = (Button) a(R.id.topPLayBtn);
        this.p = (Button) a(R.id.bottomPlayBtn);
        this.A = (TextView) a(R.id.previewSize);
        this.B = (TextView) a(R.id.previewHint);
        this.C = (TextView) a(R.id.savedHint);
        d(this.f7292l, Event.ON_CANCEL_BTN_CLICKED);
        d(this.u, Event.ON_CLOSE_BTN_CLICKED);
        d(this.o, Event.PLAY_TOP_VIDEO);
        d(this.p, Event.PLAY_BOTTOM_VIDEO);
    }

    public final void d(View view, Event event) {
        view.setOnClickListener(new a(event));
    }

    public void onClick(View view) {
    }
}
