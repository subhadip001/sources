package f.n.a.v.e;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.constants.User;
import java.util.ArrayList;

/* compiled from: AudioOptionRecyclerAdapter.java */
/* loaded from: classes2.dex */
public class b extends RecyclerView.e<C0185b> {
    public ArrayList<f.n.a.o.h> a = new ArrayList<>();
    public a b;
    public Boolean c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f7156d;

    /* compiled from: AudioOptionRecyclerAdapter.java */
    /* loaded from: classes2.dex */
    public interface a {
        void onItemClicked(ArrayList<f.n.a.o.h> arrayList, int i2);
    }

    /* compiled from: AudioOptionRecyclerAdapter.java */
    /* renamed from: f.n.a.v.e.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0185b extends RecyclerView.a0 {
        public TextView a;
        public TextView b;
        public LinearLayout c;

        /* renamed from: d  reason: collision with root package name */
        public ImageView f7157d;

        public C0185b(b bVar, View view) {
            super(view);
            this.c = (LinearLayout) view.findViewById(R.id.itemRecyclerLay);
            this.a = (TextView) view.findViewById(R.id.tvItemTitle);
            this.f7157d = (ImageView) view.findViewById(R.id.imgStatus);
            this.b = (TextView) view.findViewById(R.id.tvIsPro);
        }
    }

    public b(Boolean bool) {
        this.c = bool;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void onBindViewHolder(C0185b c0185b, int i2) {
        C0185b c0185b2 = c0185b;
        f.n.a.o.h hVar = this.a.get(i2);
        f.a.b.a.a.N("onBindViewHolder: ", i2, "CheckBatch");
        c0185b2.a.setText(hVar.f7058f);
        if (!hVar.f7061i) {
            c0185b2.b.setVisibility(8);
        }
        if (this.c.booleanValue()) {
            c0185b2.f7157d.setImageResource(R.drawable.ic_check);
            if (hVar.f7062j) {
                c0185b2.f7157d.setVisibility(0);
            } else {
                c0185b2.f7157d.setVisibility(4);
            }
        } else if (hVar.f7062j) {
            c0185b2.f7157d.setImageResource(R.drawable.ic_outline_check_box_24);
        } else {
            c0185b2.f7157d.setImageResource(R.drawable.ic_baseline_check_box_outline_blank_24);
        }
        if (this.f7156d.booleanValue() || User.a()) {
            c0185b2.b.setVisibility(8);
        }
        c0185b2.c.setOnClickListener(new f.n.a.v.e.a(this, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public C0185b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return new C0185b(this, f.a.b.a.a.T(viewGroup, R.layout.item_stream_recycler, viewGroup, false));
    }
}
