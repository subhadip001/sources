package org.inverseai.cross_promo.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.video_converter.video_compressor.R;
import e.b.c.k;
import e.p.c.a;
import i.i.b;
import i.l.b.i;
import i.m.c;
import java.util.ArrayList;
import java.util.List;
import m.b.a.j.e;
import m.b.a.j.f;
import org.inverseai.cross_promo.helpers.CrossPromoType;
import org.inverseai.cross_promo.model.CrossPromoProduct;

/* compiled from: InterstitialAdActivity.kt */
/* loaded from: classes2.dex */
public final class InterstitialAdActivity extends k implements e.a {
    public final List<Integer> t = b.c(Integer.valueOf((int) R.layout.cross_interstitial_ad_1), Integer.valueOf((int) R.layout.cross_interstitial_ad_2), Integer.valueOf((int) R.layout.cross_interstitial_ad_3), Integer.valueOf((int) R.layout.cross_interstitial_ad_4), Integer.valueOf((int) R.layout.cross_interstitial_ad_5));

    @Override // m.b.a.j.e.a
    public void h() {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("KEY_AD_TYPE", CrossPromoType.CROSS_INTERSTITIAL_AD.name());
        setResult(-1, intent.putExtra("KEY_EXTRA_DATA", bundle));
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        h();
    }

    @Override // e.p.c.n, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.layout_interstitial_ad_activity);
        Log.d("InterstitialAdActivity", "onCreate: ");
        if (H().I("interstitial") == null) {
            a aVar = new a(H());
            m.b.a.i.a aVar2 = new m.b.a.i.a();
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("KEY_CAN_CLOSE", true);
            c.a aVar3 = c.f8653f;
            bundle2.putInt("KEY_LAYOUT_ID", this.t.get(aVar3.b(this.t.size())).intValue());
            bundle2.putString("KEY_CROSS_PROMO_TYPE", CrossPromoType.CROSS_INTERSTITIAL_AD.name());
            Context applicationContext = getApplicationContext();
            i.d(applicationContext, "applicationContext");
            ArrayList<CrossPromoProduct> a = f.a(applicationContext);
            if (a.size() != 0) {
                CrossPromoProduct crossPromoProduct = a.get(aVar3.b(a.size()));
                i.d(crossPromoProduct, "products[index]");
                bundle2.putSerializable("KEY_CROSS_PROMO_PRODUCT", crossPromoProduct);
                aVar2.setArguments(bundle2);
                aVar.g(R.id.ad_holder_bottom, aVar2, "interstitial", 1);
                aVar.e();
                return;
            }
            throw new IllegalStateException("No products found in assets");
        }
    }
}
