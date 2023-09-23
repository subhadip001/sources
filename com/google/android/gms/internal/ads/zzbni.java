package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbni extends zzbmn {
    private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener zza;

    public zzbni(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.zza = onUnifiedNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbmo
    public final void zze(zzbmx zzbmxVar) {
        this.zza.onUnifiedNativeAdLoaded(new zzbmy(zzbmxVar));
    }
}
