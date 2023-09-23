package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
@Deprecated
/* loaded from: classes.dex */
public interface MediationInterstitialListener {
    void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter);

    void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter);

    @Deprecated
    void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i2);

    void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, AdError adError);

    void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter);

    void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter);

    void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter);
}
