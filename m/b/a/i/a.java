package m.b.a.i;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import i.l.b.i;
import java.io.Serializable;
import m.b.a.j.e;
import org.inverseai.cross_promo.helpers.CrossPromoType;
import org.inverseai.cross_promo.model.CrossPromoProduct;

/* compiled from: InterstitialAdFragment.kt */
/* loaded from: classes2.dex */
public final class a extends Fragment implements e.a {

    /* renamed from: f  reason: collision with root package name */
    public e.a f9310f;

    /* renamed from: g  reason: collision with root package name */
    public e f9311g;

    /* renamed from: h  reason: collision with root package name */
    public CrossPromoType f9312h = CrossPromoType.CROSS_INTERSTITIAL_AD;

    @Override // m.b.a.j.e.a
    public void h() {
        e.a aVar = this.f9310f;
        if (aVar == null) {
            return;
        }
        aVar.h();
    }

    public final e i() {
        if (this.f9311g == null) {
            this.f9311g = new e(this.f9312h);
        }
        e eVar = this.f9311g;
        i.b(eVar);
        return eVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        i.e(context, "context");
        super.onAttach(context);
        this.f9310f = context instanceof e.a ? (e.a) context : null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        String string = arguments.getString("KEY_CROSS_PROMO_TYPE");
        if (string != null) {
            this.f9312h = CrossPromoType.valueOf(string);
            return;
        }
        throw new IllegalArgumentException("Cross Promo Type is not set");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(layoutInflater, "inflater");
        e i2 = i();
        Context context = layoutInflater.getContext();
        i.d(context, "inflater.context");
        Bundle arguments = getArguments();
        Integer valueOf = arguments == null ? null : Integer.valueOf(arguments.getInt("KEY_LAYOUT_ID"));
        if (valueOf != null) {
            return i2.a(context, valueOf.intValue());
        }
        throw new IllegalArgumentException("InterstitialAdFragment must be initialized with a LayoutId");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        i();
        this.f9311g = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        e.a aVar = this.f9310f;
        if (aVar == null) {
            return;
        }
        aVar.h();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        e i2 = i();
        i.e(this, "closeAdListener");
        i2.s = this;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        i().s = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        boolean z = arguments == null ? true : arguments.getBoolean("KEY_CAN_CLOSE", true);
        Bundle arguments2 = getArguments();
        boolean z2 = arguments2 != null ? arguments2.getBoolean("KEY_CAN_SHOW_AD_ATTR", true) : true;
        Bundle arguments3 = getArguments();
        Serializable serializable = arguments3 == null ? null : arguments3.getSerializable("KEY_CROSS_PROMO_PRODUCT");
        CrossPromoProduct crossPromoProduct = serializable instanceof CrossPromoProduct ? (CrossPromoProduct) serializable : null;
        if (crossPromoProduct != null) {
            i().b(view, crossPromoProduct, z, z2);
            return;
        }
        throw new IllegalArgumentException("InterstitialAdFragment must be initialized with CrossPromoProduct");
    }
}
