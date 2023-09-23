package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzahy implements zzzv {
    private final zzahv zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzahy(zzahv zzahvVar, int i2, long j2, long j3) {
        this.zza = zzahvVar;
        this.zzb = i2;
        this.zzc = j2;
        long j4 = (j3 - j2) / zzahvVar.zzd;
        this.zzd = j4;
        this.zze = zza(j4);
    }

    private final long zza(long j2) {
        return zzeg.zzw(j2 * this.zzb, 1000000L, this.zza.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final long zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzt zzg(long j2) {
        long zzr = zzeg.zzr((this.zza.zzc * j2) / (this.zzb * 1000000), 0L, this.zzd - 1);
        long j3 = this.zzc;
        int i2 = this.zza.zzd;
        long zza = zza(zzr);
        zzzw zzzwVar = new zzzw(zza, (i2 * zzr) + j3);
        if (zza < j2 && zzr != this.zzd - 1) {
            long j4 = zzr + 1;
            return new zzzt(zzzwVar, new zzzw(zza(j4), (j4 * this.zza.zzd) + this.zzc));
        }
        return new zzzt(zzzwVar, zzzwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final boolean zzh() {
        return true;
    }
}
