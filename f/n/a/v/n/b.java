package f.n.a.v.n;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.video_converter.video_compressor.R;
import java.util.ArrayList;

/* compiled from: PremiumFeatureRecyclerAdapter.java */
/* loaded from: classes2.dex */
public class b extends RecyclerView.e<a> {
    public Context a;
    public ArrayList<f.n.a.o.e> b;

    /* compiled from: PremiumFeatureRecyclerAdapter.java */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.a0 {
        public ImageView a;
        public TextView b;

        public a(b bVar, View view) {
            super(view);
            this.a = (ImageView) view.findViewById(R.id.ivItemImg);
            this.b = (TextView) view.findViewById(R.id.tvItemName);
            this.a.setClipToOutline(true);
        }
    }

    public b(Context context, ArrayList<f.n.a.o.e> arrayList) {
        this.b = new ArrayList<>();
        this.a = context;
        this.b = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int getItemCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void onBindViewHolder(a aVar, int i2) {
        a aVar2 = aVar;
        f.n.a.o.e eVar = this.b.get(i2);
        f.e.a.b.e(aVar2.a).d(Integer.valueOf(eVar.b)).y(aVar2.a);
        aVar2.b.setText(eVar.a);
        aVar2.b.setTextColor(this.a.getResources().getColor(R.color.purchase_screen_text));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return new a(this, f.a.b.a.a.T(viewGroup, R.layout.premium_items_list_v_two_recycler, viewGroup, false));
    }
}
