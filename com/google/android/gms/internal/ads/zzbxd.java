package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbxd extends zzbmg {
    public final /* synthetic */ zzbxe zza;

    public /* synthetic */ zzbxd(zzbxe zzbxeVar, zzbxc zzbxcVar) {
        this.zza = zzbxeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final void zze(zzblu zzbluVar) {
        NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener;
        NativeCustomFormatAd zzf;
        zzbxe zzbxeVar = this.zza;
        onCustomFormatAdLoadedListener = zzbxeVar.zza;
        zzf = zzbxeVar.zzf(zzbluVar);
        onCustomFormatAdLoadedListener.onCustomFormatAdLoaded(zzf);
    }
}
