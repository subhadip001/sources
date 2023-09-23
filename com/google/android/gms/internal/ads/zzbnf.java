package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbnf {
    private final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener zza;
    private final NativeCustomTemplateAd.OnCustomClickListener zzb;
    private NativeCustomTemplateAd zzc;

    public zzbnf(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomTemplateAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    public final synchronized NativeCustomTemplateAd zzf(zzblu zzbluVar) {
        NativeCustomTemplateAd nativeCustomTemplateAd = this.zzc;
        if (nativeCustomTemplateAd != null) {
            return nativeCustomTemplateAd;
        }
        zzblv zzblvVar = new zzblv(zzbluVar);
        this.zzc = zzblvVar;
        return zzblvVar;
    }

    public final zzbme zzd() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbnc(this, null);
    }

    public final zzbmh zze() {
        return new zzbne(this, null);
    }
}
