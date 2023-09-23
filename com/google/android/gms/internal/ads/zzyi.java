package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzyi {
    public final zzyc zza;
    public final zzyh zzb;
    public zzye zzc;
    private final int zzd;

    public zzyi(zzyf zzyfVar, zzyh zzyhVar, long j2, long j3, long j4, long j5, long j6, long j7, int i2) {
        this.zzb = zzyhVar;
        this.zzd = i2;
        this.zza = new zzyc(zzyfVar, j2, 0L, j4, j5, j6, j7);
    }

    public static final int zzf(zzyt zzytVar, long j2, zzzs zzzsVar) {
        if (j2 == zzytVar.zzf()) {
            return 0;
        }
        zzzsVar.zza = j2;
        return 1;
    }

    public static final boolean zzg(zzyt zzytVar, long j2) {
        long zzf = j2 - zzytVar.zzf();
        if (zzf < 0 || zzf > 262144) {
            return false;
        }
        ((zzym) zzytVar).zzo((int) zzf, false);
        return true;
    }

    public final int zza(zzyt zzytVar, zzzs zzzsVar) {
        long j2;
        long j3;
        long j4;
        long j5;
        int i2;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        while (true) {
            zzye zzyeVar = this.zzc;
            zzcw.zzb(zzyeVar);
            j2 = zzyeVar.zzf;
            j3 = zzyeVar.zzg;
            j4 = zzyeVar.zzh;
            if (j3 - j2 <= this.zzd) {
                zzc(false, j2);
                return zzf(zzytVar, j2, zzzsVar);
            } else if (!zzg(zzytVar, j4)) {
                return zzf(zzytVar, j4, zzzsVar);
            } else {
                zzytVar.zzj();
                zzyh zzyhVar = this.zzb;
                j5 = zzyeVar.zzb;
                zzyg zza = zzyhVar.zza(zzytVar, j5);
                i2 = zza.zzb;
                if (i2 == -3) {
                    zzc(false, j4);
                    return zzf(zzytVar, j4, zzzsVar);
                } else if (i2 == -2) {
                    j11 = zza.zzc;
                    j12 = zza.zzd;
                    zzye.zzh(zzyeVar, j11, j12);
                } else if (i2 != -1) {
                    j6 = zza.zzd;
                    zzg(zzytVar, j6);
                    j7 = zza.zzd;
                    zzc(true, j7);
                    j8 = zza.zzd;
                    return zzf(zzytVar, j8, zzzsVar);
                } else {
                    j9 = zza.zzc;
                    j10 = zza.zzd;
                    zzye.zzg(zzyeVar, j9, j10);
                }
            }
        }
    }

    public final zzzv zzb() {
        return this.zza;
    }

    public final void zzc(boolean z, long j2) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j2) {
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        zzye zzyeVar = this.zzc;
        if (zzyeVar != null) {
            j7 = zzyeVar.zza;
            if (j7 == j2) {
                return;
            }
        }
        long zzf = this.zza.zzf(j2);
        zzyc zzycVar = this.zza;
        j3 = zzycVar.zzc;
        j4 = zzycVar.zzd;
        j5 = zzycVar.zze;
        j6 = zzycVar.zzf;
        this.zzc = new zzye(j2, zzf, 0L, j3, j4, j5, j6);
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}
