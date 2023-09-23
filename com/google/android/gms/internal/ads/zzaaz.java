package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaaz implements zzzv {
    public final /* synthetic */ zzzv zza;
    public final /* synthetic */ zzaba zzb;

    public zzaaz(zzaba zzabaVar, zzzv zzzvVar) {
        this.zzb = zzabaVar;
        this.zza = zzzvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final long zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzt zzg(long j2) {
        long j3;
        long j4;
        zzzt zzg = this.zza.zzg(j2);
        zzzw zzzwVar = zzg.zza;
        long j5 = zzzwVar.zzb;
        long j6 = zzzwVar.zzc;
        j3 = this.zzb.zzb;
        zzzw zzzwVar2 = new zzzw(j5, j3 + j6);
        zzzw zzzwVar3 = zzg.zzb;
        long j7 = zzzwVar3.zzb;
        long j8 = zzzwVar3.zzc;
        j4 = this.zzb.zzb;
        return new zzzt(zzzwVar2, new zzzw(j7, j4 + j8));
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final boolean zzh() {
        return this.zza.zzh();
    }
}
