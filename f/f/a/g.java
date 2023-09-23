package f.f.a;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import f.c.a.a.i;
import f.f.a.h;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

/* compiled from: PromoAppRecyclerAdapter.java */
/* loaded from: classes.dex */
public class g implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3622f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ h f3623g;

    public g(h hVar, int i2) {
        this.f3623g = hVar;
        this.f3622f = i2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        String str2;
        h hVar = this.f3623g;
        h.a aVar = hVar.a;
        ArrayList<f> arrayList = hVar.b;
        int i2 = this.f3622f;
        a aVar2 = (a) aVar;
        Objects.requireNonNull(aVar2);
        Log.d("TAG", "onItemClicked: clalled ");
        try {
            i.K(aVar2.a.f3610f.get(i2).f3617g, aVar2.a.getContext());
            FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(aVar2.a.getActivity());
            if (aVar2.a.f3610f.get(i2).f3616f == null) {
                str2 = "refer_null";
            } else {
                str2 = "refer_" + str.toLowerCase(Locale.US).replaceAll("[^a-zA-Z0-9]", "_");
            }
            firebaseAnalytics.logEvent(str2, new Bundle());
            i.I(aVar2.a.getActivity(), aVar2.a.f3610f.get(i2).f3617g, false);
        } catch (Exception unused) {
        }
    }
}
