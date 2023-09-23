package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzadt implements zzadr {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long[] zzf;

    private zzadt(long j2, int i2, long j3, long j4, long[] jArr) {
        this.zza = j2;
        this.zzb = i2;
        this.zzc = j3;
        this.zzf = jArr;
        this.zzd = j4;
        this.zze = j4 != -1 ? j2 + j4 : -1L;
    }

    public static zzadt zza(long j2, long j3, zzzl zzzlVar, zzdy zzdyVar) {
        int zzn;
        int i2 = zzzlVar.zzg;
        int i3 = zzzlVar.zzd;
        int zze = zzdyVar.zze();
        if ((zze & 1) != 1 || (zzn = zzdyVar.zzn()) == 0) {
            return null;
        }
        long zzw = zzeg.zzw(zzn, i2 * 1000000, i3);
        if ((zze & 6) != 6) {
            return new zzadt(j3, zzzlVar.zzc, zzw, -1L, null);
        }
        long zzs = zzdyVar.zzs();
        long[] jArr = new long[100];
        for (int i4 = 0; i4 < 100; i4++) {
            jArr[i4] = zzdyVar.zzk();
        }
        if (j2 != -1) {
            long j4 = j3 + zzs;
            if (j2 != j4) {
                Log.w("XingSeeker", "XING data size mismatch: " + j2 + ", " + j4);
            }
        }
        return new zzadt(j3, zzzlVar.zzc, zzw, zzs, jArr);
    }

    private final long zzd(int i2) {
        return (this.zzc * i2) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final long zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final long zzc(long j2) {
        long j3 = j2 - this.zza;
        if (!zzh() || j3 <= this.zzb) {
            return 0L;
        }
        long[] jArr = (long[]) zzcw.zzb(this.zzf);
        double d2 = (j3 * 256.0d) / this.zzd;
        int zzd = zzeg.zzd(jArr, (long) d2, true, true);
        long zzd2 = zzd(zzd);
        long j4 = jArr[zzd];
        int i2 = zzd + 1;
        long zzd3 = zzd(i2);
        long j5 = zzd == 99 ? 256L : jArr[i2];
        return Math.round((j4 == j5 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (d2 - j4) / (j5 - j4)) * (zzd3 - zzd2)) + zzd2;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzt zzg(long j2) {
        long[] jArr;
        if (!zzh()) {
            zzzw zzzwVar = new zzzw(0L, this.zza + this.zzb);
            return new zzzt(zzzwVar, zzzwVar);
        }
        long zzr = zzeg.zzr(j2, 0L, this.zzc);
        double d2 = (zzr * 100.0d) / this.zzc;
        double d3 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (d2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            if (d2 >= 100.0d) {
                d3 = 256.0d;
            } else {
                int i2 = (int) d2;
                double d4 = ((long[]) zzcw.zzb(this.zzf))[i2];
                d3 = d4 + (((i2 == 99 ? 256.0d : jArr[i2 + 1]) - d4) * (d2 - i2));
            }
        }
        zzzw zzzwVar2 = new zzzw(zzr, this.zza + zzeg.zzr(Math.round((d3 / 256.0d) * this.zzd), this.zzb, this.zzd - 1));
        return new zzzt(zzzwVar2, zzzwVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final boolean zzh() {
        return this.zzf != null;
    }
}
