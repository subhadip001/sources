package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbxe {
    private final NativeCustomFormatAd.OnCustomFormatAdLoadedListener zza;
    private final NativeCustomFormatAd.OnCustomClickListener zzb;
    private NativeCustomFormatAd zzc;

    public zzbxe(NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomFormatAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    public final synchronized NativeCustomFormatAd zzf(zzblu zzbluVar) {
        NativeCustomFormatAd nativeCustomFormatAd = this.zzc;
        if (nativeCustomFormatAd != null) {
            return nativeCustomFormatAd;
        }
        zzbxf zzbxfVar = new zzbxf(zzbluVar);
        this.zzc = zzbxfVar;
        return zzbxfVar;
    }

    public final zzbme zza() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbxb(this, null);
    }

    public final zzbmh zzb() {
        return new zzbxd(this, null);
    }
}
