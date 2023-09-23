package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzecx implements zzden, zzddg, zzdbv {
    private final zzfgn zza;
    private final zzfgo zzb;
    private final zzcev zzc;

    public zzecx(zzfgn zzfgnVar, zzfgo zzfgoVar, zzcev zzcevVar) {
        this.zza = zzfgnVar;
        this.zzb = zzfgoVar;
        this.zzc = zzcevVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfgn zzfgnVar = this.zza;
        zzfgnVar.zza("action", "ftl");
        zzfgnVar.zza("ftl", String.valueOf(zzeVar.zza));
        zzfgnVar.zza("ed", zzeVar.zzc);
        this.zzb.zzb(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzb(zzfbs zzfbsVar) {
        this.zza.zzh(zzfbsVar, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzbE(zzbzu zzbzuVar) {
        this.zza.zzi(zzbzuVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddg
    public final void zzn() {
        zzfgo zzfgoVar = this.zzb;
        zzfgn zzfgnVar = this.zza;
        zzfgnVar.zza("action", "loaded");
        zzfgoVar.zzb(zzfgnVar);
    }
}
