package com.google.android.gms.ads.rewarded;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbjm;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzcbm;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class RewardedAd {
    public static void load(final Context context, final String str, final AdRequest adRequest, final RewardedAdLoadCallback rewardedAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        Preconditions.checkNotNull(rewardedAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbhy.zzc(context);
        if (((Boolean) zzbjm.zzi.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbhy.zziq)).booleanValue()) {
                zzcex.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.rewarded.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new zzcbm(context2, str2).zza(adRequest2.zza(), rewardedAdLoadCallback);
                        } catch (IllegalStateException e2) {
                            zzbyx.zza(context2).zzd(e2, "RewardedAd.load");
                        }
                    }
                });
                return;
            }
        }
        zzcfi.zze("Loading on UI thread");
        new zzcbm(context, str).zza(adRequest.zza(), rewardedAdLoadCallback);
    }

    public abstract Bundle getAdMetadata();

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnAdMetadataChangedListener getOnAdMetadataChangedListener();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract RewardItem getRewardItem();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z);

    public abstract void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions);

    public abstract void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener);

    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, final RewardedAdLoadCallback rewardedAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        Preconditions.checkNotNull(rewardedAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbhy.zzc(context);
        if (((Boolean) zzbjm.zzi.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbhy.zziq)).booleanValue()) {
                zzcfi.zze("Loading on background thread");
                zzcex.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.rewarded.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new zzcbm(context2, str2).zza(adManagerAdRequest2.zza(), rewardedAdLoadCallback);
                        } catch (IllegalStateException e2) {
                            zzbyx.zza(context2).zzd(e2, "RewardedAd.loadAdManager");
                        }
                    }
                });
                return;
            }
        }
        zzcfi.zze("Loading on UI thread");
        new zzcbm(context, str).zza(adManagerAdRequest.zza(), rewardedAdLoadCallback);
    }
}
