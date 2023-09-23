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
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcbm extends RewardedAd {
    private final String zza;
    private final zzcbd zzb;
    private final Context zzc;
    private final zzcbv zzd = new zzcbv();
    private OnAdMetadataChangedListener zze;
    private OnPaidEventListener zzf;
    private FullScreenContentCallback zzg;

    public zzcbm(Context context, String str) {
        this.zzc = context.getApplicationContext();
        this.zza = str;
        this.zzb = com.google.android.gms.ads.internal.client.zzaw.zza().zzp(context, str, new zzbtw());
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
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

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final String getAdUnitId() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
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

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final RewardItem getRewardItem() {
        try {
            zzcbd zzcbdVar = this.zzb;
            zzcba zzd = zzcbdVar != null ? zzcbdVar.zzd() : null;
            return zzd == null ? RewardItem.DEFAULT_REWARD : new zzcbn(zzd);
        } catch (RemoteException e2) {
            zzcfi.zzl("#007 Could not call remote method.", e2);
            return RewardItem.DEFAULT_REWARD;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.zzg = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
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

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.zze = onAdMetadataChangedListener;
            zzcbd zzcbdVar = this.zzb;
            if (zzcbdVar != null) {
                zzcbdVar.zzi(new com.google.android.gms.ads.internal.client.zzey(onAdMetadataChangedListener));
            }
        } catch (RemoteException e2) {
            zzcfi.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzf = onPaidEventListener;
            zzcbd zzcbdVar = this.zzb;
            if (zzcbdVar != null) {
                zzcbdVar.zzj(new com.google.android.gms.ads.internal.client.zzez(onPaidEventListener));
            }
        } catch (RemoteException e2) {
            zzcfi.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                zzcbd zzcbdVar = this.zzb;
                if (zzcbdVar != null) {
                    zzcbdVar.zzl(new zzcbr(serverSideVerificationOptions));
                }
            } catch (RemoteException e2) {
                zzcfi.zzl("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.zzd.zzc(onUserEarnedRewardListener);
        if (activity == null) {
            zzcfi.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
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

    public final void zza(com.google.android.gms.ads.internal.client.zzdr zzdrVar, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            zzcbd zzcbdVar = this.zzb;
            if (zzcbdVar != null) {
                zzcbdVar.zzf(com.google.android.gms.ads.internal.client.zzp.zza.zza(this.zzc, zzdrVar), new zzcbq(rewardedAdLoadCallback, this));
            }
        } catch (RemoteException e2) {
            zzcfi.zzl("#007 Could not call remote method.", e2);
        }
    }
}
