package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzyc implements zzzv {
    private final zzyf zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;

    public zzyc(zzyf zzyfVar, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.zza = zzyfVar;
        this.zzb = j2;
        this.zzc = j4;
        this.zzd = j5;
        this.zze = j6;
        this.zzf = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final long zze() {
        return this.zzb;
    }

    public final long zzf(long j2) {
        return this.zza.zza(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzt zzg(long j2) {
        zzzw zzzwVar = new zzzw(j2, zzye.zzf(this.zza.zza(j2), 0L, this.zzc, this.zzd, this.zze, this.zzf));
        return new zzzt(zzzwVar, zzzwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final boolean zzh() {
        return true;
    }
}
