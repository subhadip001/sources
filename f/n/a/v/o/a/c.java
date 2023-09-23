package f.n.a.v.o.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.screens.videoCompressorScreen.spinnerListItem.Item;

/* compiled from: ListItemView.java */
/* loaded from: classes2.dex */
public class c extends f.n.a.v.c.d.a<f.n.a.v.o.a.a> {

    /* renamed from: h  reason: collision with root package name */
    public AppCompatTextView f7358h;

    /* renamed from: i  reason: collision with root package name */
    public AppCompatTextView f7359i;

    /* renamed from: j  reason: collision with root package name */
    public AppCompatTextView f7360j;

    /* renamed from: k  reason: collision with root package name */
    public ImageView f7361k;

    /* renamed from: l  reason: collision with root package name */
    public Item f7362l;

    /* compiled from: ListItemView.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            for (f.n.a.v.o.a.a aVar : c.this.c()) {
                aVar.a(c.this.f7362l);
            }
        }
    }

    public c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f7131f = layoutInflater.inflate(R.layout.layout_list_item, viewGroup, false);
        this.f7358h = (AppCompatTextView) a(R.id.tv_primary_text);
        this.f7359i = (AppCompatTextView) a(R.id.tv_secondary_text);
        this.f7360j = (AppCompatTextView) a(R.id.tv_super_script_text);
        this.f7361k = (ImageView) a(R.id.iv_check);
        this.f7131f.setOnClickListener(new a());
    }
}
