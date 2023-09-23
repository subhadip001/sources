package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcbx extends RewardedInterstitialAd {
    private final String zza;
    private final zzcbd zzb;
    private final Context zzc;
    private final zzcbv zzd = new zzcbv();
    private FullScreenContentCallback zze;
    private OnAdMetadataChangedListener zzf;
    private OnPaidEventListener zzg;

    public zzcbx(Context context, String str) {
        this.zza = str;
        this.zzc = context.getApplicationContext();
        this.zzb = com.google.android.gms.ads.internal.client.zzaw.zza().zzp(context, str, new zzbtw());
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final Bundle getAdMetadata() {
        try {
            zzcbd zzcbdVar = this.zzb;
            if (zzcbdVar != null) {
                return zzcbdVar.zzb();
            }
        } catch (RemoteException e2) {
            zzcfi.zzl("#007 Could not call remote method.", e2);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final String getAdUnitId() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdh zzdhVar = null;
        try {
            zzcbd zzcbdVar = this.zzb;
            if (zzcbdVar != null) {
                zzdhVar = zzcbdVar.zzc();
            }
        } catch (RemoteException e2) {
            zzcfi.zzl("#007 Could not call remote method.", e2);
        }
        return ResponseInfo.zzb(zzdhVar);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final RewardItem getRewardItem() {
        try {
            zzcbd zzcbdVar = this.zzb;
            zzcba zzd = zzcbdVar != null ? zzcbdVar.zzd() : null;
            if (zzd != null) {
                return new zzcbn(zzd);
            }
        } catch (RemoteException e2) {
            zzcfi.zzl("#007 Could not call remote method.", e2);
        }
        return RewardItem.DEFAULT_REWARD;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.zze = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setImmersiveMode(boolean z) {
        try {
            zzcbd zzcbdVar = this.zzb;
            if (zzcbdVar != null) {
                zzcbdVar.zzh(z);
            }
        } catch (RemoteException e2) {
            zzcfi.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzf = onAdMetadataChangedListener;
        try {
            zzcbd zzcbdVar = this.zzb;
            if (zzcbdVar != null) {
                zzcbdVar.zzi(new com.google.android.gms.ads.internal.client.zzey(onAdMetadataChangedListener));
            }
        } catch (RemoteException e2) {
            zzcfi.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.zzg = onPaidEventListener;
        try {
            zzcbd zzcbdVar = this.zzb;
            if (zzcbdVar != null) {
                zzcbdVar.zzj(new com.google.android.gms.ads.internal.client.zzez(onPaidEventListener));
            }
        } catch (RemoteException e2) {
            zzcfi.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            zzcbd zzcbdVar = this.zzb;
            if (zzcbdVar != null) {
                zzcbdVar.zzl(new zzcbr(serverSideVerificationOptions));
            }
        } catch (RemoteException e2) {
            zzcfi.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.zzd.zzc(onUserEarnedRewardListener);
        try {
            zzcbd zzcbdVar = this.zzb;
            if (zzcbdVar != null) {
                zzcbdVar.zzk(this.zzd);
                this.zzb.zzm(ObjectWrapper.wrap(activity));
            }
        } catch (RemoteException e2) {
            zzcfi.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzdr zzdrVar, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        try {
            zzcbd zzcbdVar = this.zzb;
            if (zzcbdVar != null) {
                zzcbdVar.zzg(com.google.android.gms.ads.internal.client.zzp.zza.zza(this.zzc, zzdrVar), new zzcbw(rewardedInterstitialAdLoadCallback, this));
            }
        } catch (RemoteException e2) {
            zzcfi.zzl("#007 Could not call remote method.", e2);
        }
    }
}
