package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzads implements zzadr {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;

    private zzads(long[] jArr, long[] jArr2, long j2, long j3) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j2;
        this.zzd = j3;
    }

    public static zzads zza(long j2, long j3, zzzl zzzlVar, zzdy zzdyVar) {
        int zzk;
        zzdyVar.zzG(10);
        int zze = zzdyVar.zze();
        if (zze <= 0) {
            return null;
        }
        int i2 = zzzlVar.zzd;
        long zzw = zzeg.zzw(zze, (i2 >= 32000 ? 1152 : 576) * 1000000, i2);
        int zzo = zzdyVar.zzo();
        int zzo2 = zzdyVar.zzo();
        int zzo3 = zzdyVar.zzo();
        zzdyVar.zzG(2);
        long j4 = j3 + zzzlVar.zzc;
        long[] jArr = new long[zzo];
        long[] jArr2 = new long[zzo];
        int i3 = 0;
        long j5 = j3;
        while (i3 < zzo) {
            int i4 = zzo2;
            long j6 = j4;
            jArr[i3] = (i3 * zzw) / zzo;
            jArr2[i3] = Math.max(j5, j6);
            if (zzo3 == 1) {
                zzk = zzdyVar.zzk();
            } else if (zzo3 == 2) {
                zzk = zzdyVar.zzo();
            } else if (zzo3 == 3) {
                zzk = zzdyVar.zzm();
            } else if (zzo3 != 4) {
                return null;
            } else {
                zzk = zzdyVar.zzn();
            }
            j5 += zzk * i4;
            i3++;
            j4 = j6;
            zzo2 = i4;
        }
        if (j2 != -1 && j2 != j5) {
            Log.w("VbriSeeker", "VBRI data size mismatch: " + j2 + ", " + j5);
        }
        return new zzads(jArr, jArr2, zzw, j5);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final long zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final long zzc(long j2) {
        return this.zza[zzeg.zzd(this.zzb, j2, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzt zzg(long j2) {
        int zzd = zzeg.zzd(this.zza, j2, true, true);
        zzzw zzzwVar = new zzzw(this.zza[zzd], this.zzb[zzd]);
        if (zzzwVar.zzb < j2) {
            long[] jArr = this.zza;
            if (zzd != jArr.length - 1) {
                int i2 = zzd + 1;
                return new zzzt(zzzwVar, new zzzw(jArr[i2], this.zzb[i2]));
            }
        }
        return new zzzt(zzzwVar, zzzwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final boolean zzh() {
        return true;
    }
}
