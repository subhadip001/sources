package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdvr implements zzden, zzddg, zzdbv {
    private final zzdwb zza;
    private final zzdwl zzb;

    public zzdvr(zzdwb zzdwbVar, zzdwl zzdwlVar) {
        this.zza = zzdwbVar;
        this.zzb = zzdwlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zza.zza().put("action", "ftl");
        this.zza.zza().put("ftl", String.valueOf(zzeVar.zza));
        this.zza.zza().put("ed", zzeVar.zzc);
        this.zzb.zze(this.zza.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzb(zzfbs zzfbsVar) {
        this.zza.zzb(zzfbsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzbE(zzbzu zzbzuVar) {
        this.zza.zzc(zzbzuVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddg
    public final void zzn() {
        this.zza.zza().put("action", "loaded");
        this.zzb.zze(this.zza.zza());
    }
}
