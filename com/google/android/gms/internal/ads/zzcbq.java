package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcbq extends zzcbj {
    private final RewardedAdLoadCallback zza;
    private final RewardedAd zzb;

    public zzcbq(RewardedAdLoadCallback rewardedAdLoadCallback, RewardedAd rewardedAd) {
        this.zza = rewardedAdLoadCallback;
        this.zzb = rewardedAd;
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zze(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzg() {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.zza;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onAdLoaded(this.zzb);
        }
    }
}
