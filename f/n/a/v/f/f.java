package f.n.a.v.f;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.video_converter.video_compressor.R;

/* compiled from: FixedSizeListView.java */
/* loaded from: classes2.dex */
public class f extends f.n.a.v.c.d.a<d> implements Object {

    /* renamed from: h  reason: collision with root package name */
    public RecyclerView f7192h;

    /* renamed from: i  reason: collision with root package name */
    public f.n.a.v.f.g.b f7193i;

    /* renamed from: j  reason: collision with root package name */
    public Button f7194j;

    /* compiled from: FixedSizeListView.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            for (d dVar : f.this.c()) {
                dVar.a();
            }
        }
    }

    public f(LayoutInflater layoutInflater, ViewGroup viewGroup, f.n.a.v.c.c cVar) {
        this.f7131f = layoutInflater.inflate(R.layout.file_size_input_layout, viewGroup, false);
        this.f7192h = (RecyclerView) a(R.id.mediListRv);
        TextView textView = (TextView) a(R.id.titleTv);
        Button button = (Button) a(R.id.doneBtn);
        this.f7194j = button;
        button.setOnClickListener(new a());
        this.f7193i = new f.n.a.v.f.g.b(this, cVar);
        this.f7192h.setLayoutManager(new LinearLayoutManager(b()));
        this.f7192h.setAdapter(this.f7193i);
    }
}
