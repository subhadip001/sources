package m.b.a.e;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import i.l.b.i;
import java.util.ArrayList;
import org.inverseai.cross_promo.helpers.CrossPromoType;
import org.inverseai.cross_promo.model.CrossPromoRewardedAd;

/* compiled from: CrossPromoRewardedAdAdapter.kt */
/* loaded from: classes2.dex */
public final class a extends FragmentStateAdapter {

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<CrossPromoRewardedAd> f9299i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FragmentManager fragmentManager, Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
        i.e(fragmentManager, "fragmentManager");
        i.e(lifecycle, "lifecycle");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int getItemCount() {
        ArrayList<CrossPromoRewardedAd> arrayList = this.f9299i;
        if (arrayList != null) {
            i.b(arrayList);
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public Fragment p(int i2) {
        m.b.a.i.a aVar = new m.b.a.i.a();
        Bundle bundle = new Bundle();
        bundle.putBoolean("KEY_CAN_CLOSE", false);
        bundle.putBoolean("KEY_CAN_SHOW_AD_ATTR", false);
        ArrayList<CrossPromoRewardedAd> arrayList = this.f9299i;
        i.b(arrayList);
        bundle.putInt("KEY_LAYOUT_ID", arrayList.get(i2).getLayoutId());
        bundle.putString("KEY_CROSS_PROMO_TYPE", CrossPromoType.CROSS_REWARDED_AD.name());
        ArrayList<CrossPromoRewardedAd> arrayList2 = this.f9299i;
        i.b(arrayList2);
        bundle.putSerializable("KEY_CROSS_PROMO_PRODUCT", arrayList2.get(i2).getCrossPromoProduct());
        aVar.setArguments(bundle);
        return aVar;
    }
}
