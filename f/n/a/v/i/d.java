package f.n.a.v.i;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.screens.common.Event;
import e.i.j.h;
import e.u.b.k;
import e.u.b.o;
import java.util.ArrayList;
import java.util.List;

/* compiled from: IntermediateSelectionScreenView.java */
/* loaded from: classes2.dex */
public class d extends f.n.a.v.c.d.a<a> {

    /* renamed from: h  reason: collision with root package name */
    public RecyclerView f7242h;

    /* renamed from: i  reason: collision with root package name */
    public f.n.a.v.t.i.b f7243i;

    /* renamed from: j  reason: collision with root package name */
    public LinearLayout f7244j;

    /* renamed from: k  reason: collision with root package name */
    public TextView f7245k;

    /* renamed from: l  reason: collision with root package name */
    public Button f7246l;

    public d(LayoutInflater layoutInflater, ViewGroup viewGroup, f.n.a.v.c.c cVar) {
        this.f7131f = layoutInflater.inflate(R.layout.layout_intermediate_file_selection, viewGroup, false);
        this.f7242h = (RecyclerView) a(R.id.rv_input_files);
        this.f7246l = (Button) a(R.id.selectionActionBtn);
        this.f7244j = (LinearLayout) a(R.id.indeterminate_progress_indicator);
        this.f7245k = (TextView) a(R.id.pbText);
        this.f7246l.setOnClickListener(new c(this, Event.ON_CONFIRM_BTN_CLICKED));
        this.f7243i = new f.n.a.v.t.i.b(cVar);
        this.f7242h.setLayoutManager(new LinearLayoutManager(b()));
        this.f7242h.setAdapter(this.f7243i);
        this.f7242h.setItemAnimator(new k());
        o oVar = new o(new f.n.a.v.t.a.c(this.f7243i));
        RecyclerView recyclerView = this.f7242h;
        RecyclerView recyclerView2 = oVar.r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.h0(oVar);
            RecyclerView recyclerView3 = oVar.r;
            RecyclerView.q qVar = oVar.A;
            recyclerView3.u.remove(qVar);
            if (recyclerView3.v == qVar) {
                recyclerView3.v = null;
            }
            List<RecyclerView.o> list = oVar.r.H;
            if (list != null) {
                list.remove(oVar);
            }
            for (int size = oVar.p.size() - 1; size >= 0; size--) {
                oVar.f2904m.a(oVar.r, oVar.p.get(0).f2909e);
            }
            oVar.p.clear();
            oVar.w = null;
            oVar.x = -1;
            VelocityTracker velocityTracker = oVar.t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                oVar.t = null;
            }
            o.e eVar = oVar.z;
            if (eVar != null) {
                eVar.f2906f = false;
                oVar.z = null;
            }
            if (oVar.y != null) {
                oVar.y = null;
            }
        }
        oVar.r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            oVar.f2897f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            oVar.f2898g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            oVar.q = ViewConfiguration.get(oVar.r.getContext()).getScaledTouchSlop();
            oVar.r.g(oVar);
            oVar.r.u.add(oVar.A);
            RecyclerView recyclerView4 = oVar.r;
            if (recyclerView4.H == null) {
                recyclerView4.H = new ArrayList();
            }
            recyclerView4.H.add(oVar);
            oVar.z = new o.e();
            oVar.y = new h(oVar.r.getContext(), oVar.z);
        }
    }
}
