package f.j.a.h;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.inverseai.adhelper.util.AdType;
import f.j.a.h.d;
import i.l.b.i;

/* compiled from: AdmobInterstitialAd.kt */
/* loaded from: classes2.dex */
public final class c extends FullScreenContentCallback {
    public final /* synthetic */ d a;
    public final /* synthetic */ d.a b;

    public c(d dVar, d.a aVar) {
        this.a = dVar;
        this.b = aVar;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdDismissedFullScreenContent() {
        f.j.a.m.a aVar;
        super.onAdDismissedFullScreenContent();
        Context context = this.b.a.get();
        if (context == null || (aVar = this.a.f6488g) == null) {
            return;
        }
        aVar.g(context, AdType.INTERSTITIAL_AD);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdFailedToShowFullScreenContent(AdError adError) {
        f.j.a.m.a aVar;
        i.e(adError, "adError");
        super.onAdFailedToShowFullScreenContent(adError);
        Context context = this.b.a.get();
        if (context == null || (aVar = this.a.f6488g) == null) {
            return;
        }
        aVar.f(context, AdType.INTERSTITIAL_AD);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdShowedFullScreenContent() {
        super.onAdShowedFullScreenContent();
        this.a.f6486e = null;
        Context context = this.b.a.get();
        if (context == null) {
            return;
        }
        d dVar = this.a;
        String str = dVar.c;
        if (str != null) {
            dVar.c(context, str);
        } else {
            i.h("adId");
            throw null;
        }
    }
}
