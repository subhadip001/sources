package f.n.a.v.n;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.video_converter.video_compressor.R;
import java.util.ArrayList;
import java.util.Timer;

/* compiled from: PurchaseScreenView.java */
/* loaded from: classes2.dex */
public class p extends f.n.a.v.c.d.a<f> {

    /* renamed from: h  reason: collision with root package name */
    public ViewPager2 f7352h;

    /* renamed from: i  reason: collision with root package name */
    public TabLayout f7353i;

    /* renamed from: j  reason: collision with root package name */
    public RecyclerView f7354j;

    /* renamed from: k  reason: collision with root package name */
    public b f7355k;

    /* renamed from: l  reason: collision with root package name */
    public c f7356l;

    /* renamed from: m  reason: collision with root package name */
    public TextView f7357m;
    public TextView n;
    public ImageButton o;
    public Button p;
    public Button q;
    public View r;
    public View s;

    public p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f7131f = layoutInflater.inflate(R.layout.activity_purchase_screen_version_three, viewGroup, false);
        this.f7352h = (ViewPager2) a(R.id.vpViewPager);
        this.f7353i = (TabLayout) a(R.id.tabLayout);
        RecyclerView recyclerView = (RecyclerView) a(R.id.rvPremiumOptionList);
        this.f7354j = recyclerView;
        b();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.f7357m = (TextView) a(R.id.btnPurchase);
        this.n = (TextView) a(R.id.tvDetailsCancelInfo);
        this.o = (ImageButton) a(R.id.ibBack);
        this.p = (Button) a(R.id.btnPurchase);
        this.q = (Button) a(R.id.btnRetry);
        this.s = a(R.id.llLoadingPanel);
        this.r = a(R.id.acPurchaseSectionLay);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new f.n.a.o.e(b().getString(R.string.multiple_files), R.drawable.img_new_multiple_files_png, R.drawable.ic_new_multiple_files));
        arrayList.add(new f.n.a.o.e(b().getString(R.string.any_format), R.drawable.img_new_many_format_png, R.drawable.ic_new_any_format));
        arrayList.add(new f.n.a.o.e(b().getString(R.string.batch_processing), R.drawable.img_new_batch_processing_png, R.drawable.ic_new_any_format));
        arrayList.add(new f.n.a.o.e(b().getString(R.string.instant_preview), R.drawable.img_new_instant_preview_png, R.drawable.ic_new_instant_preview));
        this.f7355k = new b(b(), arrayList);
        c cVar = new c(b());
        this.f7356l = cVar;
        cVar.c = new m(this);
        this.f7354j.setAdapter(cVar);
        this.f7352h.setAdapter(this.f7355k);
        new f.h.b.c.a0.f(this.f7353i, this.f7352h, new n(this)).a();
        new Timer().schedule(new o(this, this.f7355k.getItemCount()), 1500L, 1500L);
        this.o.setOnClickListener(new h(this));
        this.n.setOnClickListener(new i(this));
        this.p.setOnClickListener(new j(this));
        this.q.setOnClickListener(new k(this));
        this.f7353i.setOnTabSelectedListener((TabLayout.d) new l(this));
    }

    public void d(String str) {
        this.f7357m.setVisibility(0);
        this.f7357m.setText(str);
    }
}
