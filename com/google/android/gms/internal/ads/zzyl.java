package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzyl implements zzzv {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzyl(long j2, long j3, int i2, int i3, boolean z) {
        long zzb;
        this.zza = j2;
        this.zzb = j3;
        this.zzc = i3 == -1 ? 1 : i3;
        this.zze = i2;
        if (j2 == -1) {
            this.zzd = -1L;
            zzb = -9223372036854775807L;
        } else {
            this.zzd = j2 - j3;
            zzb = zzb(j2, j3, i2);
        }
        this.zzf = zzb;
    }

    private static long zzb(long j2, long j3, int i2) {
        return (Math.max(0L, j2 - j3) * 8000000) / i2;
    }

    public final long zza(long j2) {
        return zzb(j2, this.zzb, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final long zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzt zzg(long j2) {
        long j3 = this.zzd;
        int i2 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
        if (i2 != 0) {
            int i3 = this.zze;
            long j4 = this.zzc;
            long j5 = (((i3 * j2) / 8000000) / j4) * j4;
            if (i2 != 0) {
                j5 = Math.min(j5, j3 - j4);
            }
            long max = this.zzb + Math.max(j5, 0L);
            long zza = zza(max);
            zzzw zzzwVar = new zzzw(zza, max);
            if (this.zzd != -1 && zza < j2) {
                long j6 = max + this.zzc;
                if (j6 < this.zza) {
                    return new zzzt(zzzwVar, new zzzw(zza(j6), j6));
                }
            }
            return new zzzt(zzzwVar, zzzwVar);
        }
        zzzw zzzwVar2 = new zzzw(0L, this.zzb);
        return new zzzt(zzzwVar2, zzzwVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final boolean zzh() {
        return this.zzd != -1;
    }
}
