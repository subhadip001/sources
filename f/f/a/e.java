package f.f.a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.video_converter.video_compressor.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: CrossPromoFragment.java */
/* loaded from: classes.dex */
public class e extends Fragment {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f3609l = 0;

    /* renamed from: g  reason: collision with root package name */
    public h f3611g;

    /* renamed from: h  reason: collision with root package name */
    public RecyclerView f3612h;

    /* renamed from: i  reason: collision with root package name */
    public View f3613i;

    /* renamed from: j  reason: collision with root package name */
    public View f3614j;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<f> f3610f = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public boolean f3615k = false;

    public static e i(ArrayList<f> arrayList, boolean z) {
        e eVar = new e();
        Bundle bundle = new Bundle();
        bundle.putSerializable("key_promo_list", arrayList);
        bundle.putSerializable("key_allow_delete", Boolean.valueOf(z));
        eVar.setArguments(bundle);
        return eVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_cross_promo, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f3612h = (RecyclerView) view.findViewById(R.id.rvPromoLay);
        h hVar = new h();
        this.f3611g = hVar;
        hVar.a = new a(this);
        this.f3612h.setAdapter(hVar);
        View findViewById = view.findViewById(R.id.ivClose);
        this.f3613i = findViewById;
        findViewById.setOnClickListener(new b(this));
        this.f3614j = view.findViewById(R.id.mainContainer);
        if (getContext().getSharedPreferences("video_compressor_shared_pref", 0).getBoolean("key_hide_recommended_apps", false)) {
            this.f3614j.setVisibility(8);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            try {
                this.f3610f = (ArrayList) arguments.getSerializable("key_promo_list");
                ArrayList<f> arrayList = new ArrayList<>();
                Iterator<f> it = this.f3610f.iterator();
                while (it.hasNext()) {
                    f next = it.next();
                    next.f3619i += getContext().getSharedPreferences("video_compressor_shared_pref", 0).getInt(next.f3617g, 0);
                }
                Collections.sort(this.f3610f, new d(this));
                for (int i2 = 0; i2 < 3; i2++) {
                    arrayList.add(this.f3610f.get(i2));
                }
                h hVar2 = this.f3611g;
                hVar2.b = arrayList;
                hVar2.notifyDataSetChanged();
                boolean z = arguments.getBoolean("key_allow_delete");
                this.f3615k = z;
                if (z) {
                    this.f3613i.setVisibility(0);
                    return;
                }
                this.f3614j.setVisibility(0);
            } catch (Exception unused) {
            }
        }
    }
}
