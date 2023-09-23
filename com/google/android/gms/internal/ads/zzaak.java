package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaak implements zzyh {
    private final zzzf zza;
    private final int zzb;
    private final zzza zzc = new zzza();

    public /* synthetic */ zzaak(zzzf zzzfVar, int i2, zzaaj zzaajVar) {
        this.zza = zzzfVar;
        this.zzb = i2;
    }

    private final long zzc(zzyt zzytVar) {
        while (zzytVar.zze() < zzytVar.zzd() - 6) {
            zzzf zzzfVar = this.zza;
            int i2 = this.zzb;
            zzza zzzaVar = this.zzc;
            long zze = zzytVar.zze();
            byte[] bArr = new byte[2];
            zzym zzymVar = (zzym) zzytVar;
            zzymVar.zzm(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i2) {
                zzytVar.zzj();
                zzymVar.zzl((int) (zze - zzytVar.zzf()), false);
            } else {
                zzdy zzdyVar = new zzdy(16);
                System.arraycopy(bArr, 0, zzdyVar.zzH(), 0, 2);
                zzdyVar.zzE(zzyw.zza(zzytVar, zzdyVar.zzH(), 2, 14));
                zzytVar.zzj();
                zzymVar.zzl((int) (zze - zzytVar.zzf()), false);
                if (zzzb.zzc(zzdyVar, zzzfVar, i2, zzzaVar)) {
                    break;
                }
            }
            zzymVar.zzl(1, false);
        }
        if (zzytVar.zze() >= zzytVar.zzd() - 6) {
            ((zzym) zzytVar).zzl((int) (zzytVar.zzd() - zzytVar.zze()), false);
            return this.zza.zzj;
        }
        return this.zzc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final zzyg zza(zzyt zzytVar, long j2) {
        long zzf = zzytVar.zzf();
        long zzc = zzc(zzytVar);
        long zze = zzytVar.zze();
        ((zzym) zzytVar).zzl(Math.max(6, this.zza.zzc), false);
        long zzc2 = zzc(zzytVar);
        return (zzc > j2 || zzc2 <= j2) ? zzc2 <= j2 ? zzyg.zzf(zzc2, zzytVar.zze()) : zzyg.zzd(zzc, zzf) : zzyg.zze(zze);
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final /* synthetic */ void zzb() {
    }
}
