package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaff {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzdy zzg = new zzdy(255);

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzyt zzytVar, boolean z) {
        zza();
        this.zzg.zzC(27);
        if (zzyw.zzc(zzytVar, this.zzg.zzH(), 0, 27, z) && this.zzg.zzs() == 1332176723) {
            if (this.zzg.zzk() != 0) {
                if (z) {
                    return false;
                }
                throw zzbp.zzc("unsupported bit stream revision");
            }
            this.zza = this.zzg.zzk();
            this.zzb = this.zzg.zzp();
            this.zzg.zzq();
            this.zzg.zzq();
            this.zzg.zzq();
            int zzk = this.zzg.zzk();
            this.zzc = zzk;
            this.zzd = zzk + 27;
            this.zzg.zzC(zzk);
            if (zzyw.zzc(zzytVar, this.zzg.zzH(), 0, this.zzc, z)) {
                for (int i2 = 0; i2 < this.zzc; i2++) {
                    this.zzf[i2] = this.zzg.zzk();
                    this.zze += this.zzf[i2];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(zzyt zzytVar, long j2) {
        int i2;
        zzcw.zzd(zzytVar.zzf() == zzytVar.zze());
        this.zzg.zzC(4);
        while (true) {
            i2 = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
            if ((i2 == 0 || zzytVar.zzf() + 4 < j2) && zzyw.zzc(zzytVar, this.zzg.zzH(), 0, 4, true)) {
                this.zzg.zzF(0);
                if (this.zzg.zzs() != 1332176723) {
                    ((zzym) zzytVar).zzo(1, false);
                } else {
                    zzytVar.zzj();
                    return true;
                }
            }
        }
        do {
            if (i2 != 0 && zzytVar.zzf() >= j2) {
                break;
            }
        } while (zzytVar.zzc(1) != -1);
        return false;
    }
}
