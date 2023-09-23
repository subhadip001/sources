package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbxg extends zzbmn {
    private final NativeAd.OnNativeAdLoadedListener zza;

    public zzbxg(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbmo
    public final void zze(zzbmx zzbmxVar) {
        this.zza.onNativeAdLoaded(new zzbwz(zzbmxVar));
    }
}
