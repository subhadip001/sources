package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzzd implements zzzv {
    private final zzzf zza;
    private final long zzb;

    public zzzd(zzzf zzzfVar, long j2) {
        this.zza = zzzfVar;
        this.zzb = j2;
    }

    private final zzzw zza(long j2, long j3) {
        return new zzzw((j2 * 1000000) / this.zza.zze, this.zzb + j3);
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final long zze() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzt zzg(long j2) {
        zzcw.zzb(this.zza.zzk);
        zzzf zzzfVar = this.zza;
        zzze zzzeVar = zzzfVar.zzk;
        long[] jArr = zzzeVar.zza;
        long[] jArr2 = zzzeVar.zzb;
        int zzd = zzeg.zzd(jArr, zzzfVar.zzb(j2), true, false);
        zzzw zza = zza(zzd == -1 ? 0L : jArr[zzd], zzd != -1 ? jArr2[zzd] : 0L);
        if (zza.zzb != j2 && zzd != jArr.length - 1) {
            int i2 = zzd + 1;
            return new zzzt(zza, zza(jArr[i2], jArr2[i2]));
        }
        return new zzzt(zza, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final boolean zzh() {
        return true;
    }
}
