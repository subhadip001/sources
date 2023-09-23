package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbca extends zzbch {
    private final AppOpenAd.AppOpenAdLoadCallback zza;
    private final String zzb;

    public zzbca(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.zza = appOpenAdLoadCallback;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbci
    public final void zzb(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbci
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbci
    public final void zzd(zzbcf zzbcfVar) {
        if (this.zza != null) {
            this.zza.onAdLoaded(new zzbcb(zzbcfVar, this.zzb));
        }
    }
}
