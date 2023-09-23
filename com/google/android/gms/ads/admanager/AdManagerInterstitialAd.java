package com.google.android.gms.ads.admanager;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbjm;
import com.google.android.gms.internal.ads.zzbrb;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzcex;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class AdManagerInterstitialAd extends InterstitialAd {
    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, final AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        Preconditions.checkNotNull(adManagerInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbhy.zzc(context);
        if (((Boolean) zzbjm.zzf.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbhy.zziq)).booleanValue()) {
                zzcex.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new zzbrb(context2, str2).zza(adManagerAdRequest2.zza(), adManagerInterstitialAdLoadCallback);
                        } catch (IllegalStateException e2) {
                            zzbyx.zza(context2).zzd(e2, "AdManagerInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbrb(context, str).zza(adManagerAdRequest.zza(), adManagerInterstitialAdLoadCallback);
    }

    public abstract AppEventListener getAppEventListener();

    public abstract void setAppEventListener(AppEventListener appEventListener);
}
