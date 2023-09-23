package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzahe {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzee zza = new zzee(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzdy zzb = new zzdy();

    public zzahe(int i2) {
    }

    private final int zze(zzyt zzytVar) {
        zzdy zzdyVar = this.zzb;
        byte[] bArr = zzeg.zzf;
        int length = bArr.length;
        zzdyVar.zzD(bArr, 0);
        this.zzc = true;
        zzytVar.zzj();
        return 0;
    }

    public final int zza(zzyt zzytVar, zzzs zzzsVar, int i2) {
        if (i2 <= 0) {
            zze(zzytVar);
            return 0;
        }
        long j2 = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzytVar.zzd();
            int min = (int) Math.min(112800L, zzd);
            long j3 = zzd - min;
            if (zzytVar.zzf() != j3) {
                zzzsVar.zza = j3;
                return 1;
            }
            this.zzb.zzC(min);
            zzytVar.zzj();
            ((zzym) zzytVar).zzm(this.zzb.zzH(), 0, min, false);
            zzdy zzdyVar = this.zzb;
            int zzc = zzdyVar.zzc();
            int zzd2 = zzdyVar.zzd();
            int i3 = zzd2 - 188;
            while (true) {
                if (i3 < zzc) {
                    break;
                }
                byte[] zzH = zzdyVar.zzH();
                int i4 = -4;
                int i5 = 0;
                while (true) {
                    if (i4 > 4) {
                        break;
                    }
                    int i6 = (i4 * 188) + i3;
                    if (i6 < zzc || i6 >= zzd2 || zzH[i6] != 71) {
                        i5 = 0;
                    } else {
                        i5++;
                        if (i5 == 5) {
                            long zzb = zzaho.zzb(zzdyVar, i3, i2);
                            if (zzb != -9223372036854775807L) {
                                j2 = zzb;
                                break;
                            }
                        }
                    }
                    i4++;
                }
                i3--;
            }
            this.zzg = j2;
            this.zze = true;
            return 0;
        } else if (this.zzg == -9223372036854775807L) {
            zze(zzytVar);
            return 0;
        } else if (this.zzd) {
            long j4 = this.zzf;
            if (j4 == -9223372036854775807L) {
                zze(zzytVar);
                return 0;
            }
            long zzb2 = this.zza.zzb(this.zzg) - this.zza.zzb(j4);
            this.zzh = zzb2;
            if (zzb2 < 0) {
                Log.w("TsDurationReader", "Invalid duration: " + zzb2 + ". Using TIME_UNSET instead.");
                this.zzh = -9223372036854775807L;
            }
            zze(zzytVar);
            return 0;
        } else {
            int min2 = (int) Math.min(112800L, zzytVar.zzd());
            if (zzytVar.zzf() != 0) {
                zzzsVar.zza = 0L;
                return 1;
            }
            this.zzb.zzC(min2);
            zzytVar.zzj();
            ((zzym) zzytVar).zzm(this.zzb.zzH(), 0, min2, false);
            zzdy zzdyVar2 = this.zzb;
            int zzc2 = zzdyVar2.zzc();
            int zzd3 = zzdyVar2.zzd();
            while (true) {
                if (zzc2 >= zzd3) {
                    break;
                }
                if (zzdyVar2.zzH()[zzc2] == 71) {
                    long zzb3 = zzaho.zzb(zzdyVar2, zzc2, i2);
                    if (zzb3 != -9223372036854775807L) {
                        j2 = zzb3;
                        break;
                    }
                }
                zzc2++;
            }
            this.zzf = j2;
            this.zzd = true;
            return 0;
        }
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzee zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
