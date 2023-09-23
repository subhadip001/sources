package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzahc implements zzyh {
    private final zzee zza;
    private final zzdy zzb = new zzdy();
    private final int zzc;

    public zzahc(int i2, zzee zzeeVar, int i3) {
        this.zzc = i2;
        this.zza = zzeeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final zzyg zza(zzyt zzytVar, long j2) {
        int zza;
        int zza2;
        long j3;
        long zzf = zzytVar.zzf();
        int min = (int) Math.min(112800L, zzytVar.zzd() - zzf);
        this.zzb.zzC(min);
        ((zzym) zzytVar).zzm(this.zzb.zzH(), 0, min, false);
        zzdy zzdyVar = this.zzb;
        int zzd = zzdyVar.zzd();
        long j4 = -1;
        long j5 = -1;
        long j6 = -9223372036854775807L;
        while (zzdyVar.zza() >= 188 && (zza2 = (zza = zzaho.zza(zzdyVar.zzH(), zzdyVar.zzc(), zzd)) + 188) <= zzd) {
            long zzb = zzaho.zzb(zzdyVar, zza, this.zzc);
            if (zzb != -9223372036854775807L) {
                long zzb2 = this.zza.zzb(zzb);
                if (zzb2 > j2) {
                    if (j6 == -9223372036854775807L) {
                        return zzyg.zzd(zzb2, zzf);
                    }
                    j3 = zzf + j5;
                } else if (100000 + zzb2 > j2) {
                    j3 = zzf + zza;
                } else {
                    j5 = zza;
                    j6 = zzb2;
                }
                return zzyg.zze(j3);
            }
            zzdyVar.zzF(zza2);
            j4 = zza2;
        }
        return j6 != -9223372036854775807L ? zzyg.zzf(j6, zzf + j4) : zzyg.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final void zzb() {
        zzdy zzdyVar = this.zzb;
        byte[] bArr = zzeg.zzf;
        int length = bArr.length;
        zzdyVar.zzD(bArr, 0);
    }
}
