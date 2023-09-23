package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzagv {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzee zza = new zzee(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzdy zzb = new zzdy();

    public static long zzc(zzdy zzdyVar) {
        int zzc = zzdyVar.zzc();
        if (zzdyVar.zza() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzdyVar.zzB(bArr, 0, 9);
        zzdyVar.zzF(zzc);
        if ((bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            long j2 = bArr[0];
            byte b = bArr[1];
            long j3 = bArr[2];
            return ((bArr[3] & 255) << 5) | ((j2 & 3) << 28) | (((56 & j2) >> 3) << 30) | ((b & 255) << 20) | (((j3 & 248) >> 3) << 15) | ((j3 & 3) << 13) | ((bArr[4] & 248) >> 3);
        }
        return -9223372036854775807L;
    }

    private final int zzf(zzyt zzytVar) {
        zzdy zzdyVar = this.zzb;
        byte[] bArr = zzeg.zzf;
        int length = bArr.length;
        zzdyVar.zzD(bArr, 0);
        this.zzc = true;
        zzytVar.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }

    public final int zza(zzyt zzytVar, zzzs zzzsVar) {
        long j2 = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzytVar.zzd();
            int min = (int) Math.min((long) FirebaseInAppMessagingDisplay.DISMISS_THRESHOLD_MILLIS, zzd);
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
            int zzd2 = zzdyVar.zzd() - 4;
            while (true) {
                if (zzd2 < zzc) {
                    break;
                }
                if (zzg(zzdyVar.zzH(), zzd2) == 442) {
                    zzdyVar.zzF(zzd2 + 4);
                    long zzc2 = zzc(zzdyVar);
                    if (zzc2 != -9223372036854775807L) {
                        j2 = zzc2;
                        break;
                    }
                }
                zzd2--;
            }
            this.zzg = j2;
            this.zze = true;
            return 0;
        } else if (this.zzg == -9223372036854775807L) {
            zzf(zzytVar);
            return 0;
        } else if (this.zzd) {
            long j4 = this.zzf;
            if (j4 == -9223372036854775807L) {
                zzf(zzytVar);
                return 0;
            }
            long zzb = this.zza.zzb(this.zzg) - this.zza.zzb(j4);
            this.zzh = zzb;
            if (zzb < 0) {
                Log.w("PsDurationReader", "Invalid duration: " + zzb + ". Using TIME_UNSET instead.");
                this.zzh = -9223372036854775807L;
            }
            zzf(zzytVar);
            return 0;
        } else {
            int min2 = (int) Math.min((long) FirebaseInAppMessagingDisplay.DISMISS_THRESHOLD_MILLIS, zzytVar.zzd());
            if (zzytVar.zzf() != 0) {
                zzzsVar.zza = 0L;
                return 1;
            }
            this.zzb.zzC(min2);
            zzytVar.zzj();
            ((zzym) zzytVar).zzm(this.zzb.zzH(), 0, min2, false);
            zzdy zzdyVar2 = this.zzb;
            int zzc3 = zzdyVar2.zzc();
            int zzd3 = zzdyVar2.zzd();
            while (true) {
                if (zzc3 >= zzd3 - 3) {
                    break;
                }
                if (zzg(zzdyVar2.zzH(), zzc3) == 442) {
                    zzdyVar2.zzF(zzc3 + 4);
                    long zzc4 = zzc(zzdyVar2);
                    if (zzc4 != -9223372036854775807L) {
                        j2 = zzc4;
                        break;
                    }
                }
                zzc3++;
            }
            this.zzf = j2;
            this.zzd = true;
            return 0;
        }
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzee zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
