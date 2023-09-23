package f.n.a.v.u;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ui.PlayerView;
import com.video_converter.video_compressor.R;
import f.n.a.v.u.c;

/* compiled from: VideoTrimFragmentView.java */
/* loaded from: classes2.dex */
public class i extends f.n.a.v.c.d.a<d> implements Object, c.a {

    /* renamed from: h  reason: collision with root package name */
    public RecyclerView f7504h;

    /* renamed from: i  reason: collision with root package name */
    public c f7505i;

    /* renamed from: j  reason: collision with root package name */
    public ImageButton f7506j;

    /* renamed from: k  reason: collision with root package name */
    public ImageView f7507k;

    /* renamed from: l  reason: collision with root package name */
    public TextView f7508l;

    /* renamed from: m  reason: collision with root package name */
    public TextView f7509m;
    public TextView n;
    public TextView o;
    public TextView p;
    public TextView q;
    public TextView r;
    public PlayerView s;
    public f.b.a.b t;

    public i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f7131f = layoutInflater.inflate(R.layout.video_trim_fragment, viewGroup, false);
        this.f7504h = (RecyclerView) a(R.id.recyclerView);
        this.f7506j = (ImageButton) a(R.id.up_button);
        this.f7507k = (ImageView) a(R.id.iv_done);
        this.f7505i = new c(b());
        this.s = (PlayerView) a(R.id.view_player);
        this.f7508l = (TextView) a(R.id.playErrorHint);
        this.f7509m = (TextView) a(R.id.startTimePicker);
        this.n = (TextView) a(R.id.endTimePicker);
        this.o = (TextView) a(R.id.tvPlaytime);
        this.p = (TextView) a(R.id.tvTrimMode);
        this.q = (TextView) a(R.id.tvCutMode);
        this.r = (TextView) a(R.id.tvTotalDuration);
        this.f7505i.c = this;
        this.f7504h.g(new a(24));
        this.f7504h.setAdapter(this.f7505i);
        this.f7507k.setOnClickListener(this);
        this.f7506j.setOnClickListener(this);
        this.f7509m.setOnClickListener(this);
        this.n.setOnClickListener(this);
        this.p.setOnClickListener(this);
        this.q.setOnClickListener(this);
        FrameLayout frameLayout = (FrameLayout) a(R.id.timeline_container);
        f.b.a.b bVar = new f.b.a.b(b());
        this.t = bVar;
        bVar.setMinProgressDiff(0.1f);
        f.b.a.b bVar2 = this.t;
        bVar2.setTimelineHeight(f.b.a.a.a(50.0f));
        frameLayout.removeAllViews();
        frameLayout.addView(bVar2);
        this.t.setClipToOutline(true);
        this.t.setBackgroundResource(R.drawable.timeline_background);
        this.t.setTrimTimeDif(100L);
        this.t.setCutTimeDif(100L);
        this.t.setDelegate(new h(this));
    }

    public static String d(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    StringBuilder sb = new StringBuilder(str);
                    while (true) {
                        if (sb.charAt(0) != '0' && sb.charAt(0) != ':') {
                            break;
                        }
                        sb.deleteCharAt(0);
                    }
                    sb.deleteCharAt(sb.length() - 1);
                    sb.deleteCharAt(sb.length() - 1);
                    if (sb.charAt(0) == '.') {
                        sb.insert(0, '0');
                    }
                    str = sb.toString();
                    return str;
                }
            } catch (Exception unused) {
            }
        }
        return str;
    }

    public void e(String str) {
        this.n.setText(d(str));
        TextView textView = this.n;
        textView.setPaintFlags(textView.getPaintFlags() | 8);
    }

    public void f(float f2, float f3) {
        f.b.a.b bVar = this.t;
        bVar.f3095g = f2 / 100.0f;
        bVar.f3096h = f3 / 100.0f;
    }

    public void g(String str) {
        this.f7509m.setText(d(str));
        TextView textView = this.f7509m;
        textView.setPaintFlags(textView.getPaintFlags() | 8);
    }

    public void h(String str) {
        this.r.setText(d(str));
    }

    public void onClick(View view) {
        for (d dVar : c()) {
            switch (view.getId()) {
                case R.id.endTimePicker /* 2131362189 */:
                    dVar.i();
                    break;
                case R.id.iv_done /* 2131362398 */:
                    dVar.d();
                    break;
                case R.id.startTimePicker /* 2131362760 */:
                    dVar.j();
                    break;
                case R.id.tvCutMode /* 2131362889 */:
                    dVar.f(2, true);
                    break;
                case R.id.tvTrimMode /* 2131362913 */:
                    dVar.f(1, true);
                    break;
                case R.id.up_button /* 2131362997 */:
                    dVar.a();
                    break;
            }
        }
    }
}
