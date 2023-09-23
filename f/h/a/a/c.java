package f.h.a.a;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
@VisibleForTesting
/* loaded from: classes.dex */
public final class c extends InterstitialAdLoadCallback {
    @VisibleForTesting
    public final AbstractAdViewAdapter a;
    @VisibleForTesting
    public final MediationInterstitialListener b;

    public c(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.a = abstractAdViewAdapter;
        this.b = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.b.onAdFailedToLoad(this.a, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(InterstitialAd interstitialAd) {
        InterstitialAd interstitialAd2 = interstitialAd;
        AbstractAdViewAdapter abstractAdViewAdapter = this.a;
        abstractAdViewAdapter.mInterstitialAd = interstitialAd2;
        interstitialAd2.setFullScreenContentCallback(new d(abstractAdViewAdapter, this.b));
        this.b.onAdLoaded(this.a);
    }
}
