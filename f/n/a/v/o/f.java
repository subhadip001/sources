package f.n.a.v.o;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.video_converter.video_compressor.R;
import f.n.a.v.c.d.a;

/* compiled from: SelectableListScreenView.java */
/* loaded from: classes2.dex */
public class f extends a<c> implements Object {

    /* renamed from: h  reason: collision with root package name */
    public AppCompatTextView f7368h;

    /* renamed from: i  reason: collision with root package name */
    public AppCompatTextView f7369i;

    /* renamed from: j  reason: collision with root package name */
    public RecyclerView f7370j;

    /* renamed from: k  reason: collision with root package name */
    public TextView f7371k;

    /* renamed from: l  reason: collision with root package name */
    public f.n.a.v.o.a.b f7372l;

    public f(LayoutInflater layoutInflater, ViewGroup viewGroup, f.n.a.v.c.c cVar) {
        this.f7131f = layoutInflater.inflate(R.layout.layout_selectable_list, viewGroup, false);
        this.f7368h = (AppCompatTextView) a(R.id.tv_title);
        this.f7369i = (AppCompatTextView) a(R.id.tv_subtitle);
        this.f7370j = (RecyclerView) a(R.id.rv_item_list);
        this.f7371k = (TextView) a(R.id.customOptionBtn);
        f.n.a.v.o.a.b bVar = new f.n.a.v.o.a.b(this, cVar);
        this.f7372l = bVar;
        this.f7370j.setAdapter(bVar);
        this.f7370j.setLayoutManager(new LinearLayoutManager(b()));
        this.f7371k.setOnClickListener(new e(this));
    }
}
