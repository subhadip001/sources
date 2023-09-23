package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcbw extends zzcbj {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzcbx zzb;

    public zzcbw(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzcbx zzcbxVar) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzcbxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zze(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzg() {
        zzcbx zzcbxVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback == null || (zzcbxVar = this.zzb) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onAdLoaded(zzcbxVar);
    }
}
