package com.google.android.gms.ads.rewardedinterstitial;

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
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbjm;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzcbx;
import com.google.android.gms.internal.ads.zzcex;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class RewardedInterstitialAd {
    public static void load(final Context context, final String str, final AdRequest adRequest, final RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        Preconditions.checkNotNull(rewardedInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbhy.zzc(context);
        if (((Boolean) zzbjm.zzi.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbhy.zziq)).booleanValue()) {
                zzcex.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.rewardedinterstitial.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new zzcbx(context2, str2).zza(adRequest2.zza(), rewardedInterstitialAdLoadCallback);
                        } catch (IllegalStateException e2) {
                            zzbyx.zza(context2).zzd(e2, "RewardedInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzcbx(context, str).zza(adRequest.zza(), rewardedInterstitialAdLoadCallback);
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

    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, final RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        Preconditions.checkNotNull(rewardedInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbhy.zzc(context);
        if (((Boolean) zzbjm.zzi.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbhy.zziq)).booleanValue()) {
                zzcex.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.rewardedinterstitial.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new zzcbx(context2, str2).zza(adManagerAdRequest2.zza(), rewardedInterstitialAdLoadCallback);
                        } catch (IllegalStateException e2) {
                            zzbyx.zza(context2).zzd(e2, "RewardedInterstitialAdManager.load");
                        }
                    }
                });
                return;
            }
        }
        new zzcbx(context, str).zza(adManagerAdRequest.zza(), rewardedInterstitialAdLoadCallback);
    }
}
