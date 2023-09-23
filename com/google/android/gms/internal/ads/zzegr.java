package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzegr implements zzfuw {
    public final /* synthetic */ zzegs zza;

    public zzegr(zzegs zzegsVar) {
        this.zza = zzegsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        zzcwr zzcwrVar;
        zzdbu zzdbuVar;
        zzcwrVar = this.zza.zza;
        com.google.android.gms.ads.internal.client.zze zza = zzcwrVar.zzd().zza(th);
        zzdbuVar = this.zza.zzd;
        zzdbuVar.zza(zza);
        zzfcs.zzb(zza.zza, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final /* synthetic */ void zzb(Object obj) {
        ((zzcvu) obj).zzW();
    }
}
