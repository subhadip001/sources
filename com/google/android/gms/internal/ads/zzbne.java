package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbne extends zzbmg {
    public final /* synthetic */ zzbnf zza;

    public /* synthetic */ zzbne(zzbnf zzbnfVar, zzbnd zzbndVar) {
        this.zza = zzbnfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final void zze(zzblu zzbluVar) {
        NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener;
        NativeCustomTemplateAd zzf;
        zzbnf zzbnfVar = this.zza;
        onCustomTemplateAdLoadedListener = zzbnfVar.zza;
        zzf = zzbnfVar.zzf(zzbluVar);
        onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded(zzf);
    }
}
