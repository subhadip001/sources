package f.f.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.video_converter.video_compressor.R;
import java.util.ArrayList;

/* compiled from: PromoAppRecyclerAdapter.java */
/* loaded from: classes.dex */
public class h extends RecyclerView.e<b> {
    public a a;
    public ArrayList<f> b = new ArrayList<>();

    /* compiled from: PromoAppRecyclerAdapter.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: PromoAppRecyclerAdapter.java */
    /* loaded from: classes.dex */
    public class b extends RecyclerView.a0 {
        public TextView a;
        public TextView b;
        public TextView c;

        /* renamed from: d  reason: collision with root package name */
        public ImageView f3624d;

        /* renamed from: e  reason: collision with root package name */
        public View f3625e;

        public b(h hVar, View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.tvAppTitle);
            this.b = (TextView) view.findViewById(R.id.tvAppRating);
            this.c = (TextView) view.findViewById(R.id.tvAppDownload);
            this.f3624d = (ImageView) view.findViewById(R.id.ivAppIcon);
            this.f3625e = view.findViewById(R.id.acDynamicPromoAppsLay);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int getItemCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void onBindViewHolder(b bVar, int i2) {
        b bVar2 = bVar;
        f fVar = this.b.get(i2);
        bVar2.a.setText(fVar.f3616f);
        f.e.a.b.e(bVar2.f3624d).e(fVar.f3618h).B(f.e.a.b.e(bVar2.f3624d).a().z("file:///android_asset/loading_gif.gif")).y(bVar2.f3624d);
        bVar2.b.setText(fVar.f3621k);
        bVar2.c.setText(fVar.f3620j);
        bVar2.f3625e.setOnClickListener(new g(this, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return new b(this, f.a.b.a.a.T(viewGroup, R.layout.promo_app_recycler, viewGroup, false));
    }
}
