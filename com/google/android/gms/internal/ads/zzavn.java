package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzavn {
    public final int zza;
    public final long[] zzb;
    public final int[] zzc;
    public final int zzd;
    public final long[] zze;
    public final int[] zzf;

    public zzavn(long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2) {
        int length = jArr2.length;
        zzayy.zzc(iArr.length == length);
        int length2 = jArr.length;
        zzayy.zzc(length2 == length);
        zzayy.zzc(iArr2.length == length);
        this.zzb = jArr;
        this.zzc = iArr;
        this.zzd = i2;
        this.zze = jArr2;
        this.zzf = iArr2;
        this.zza = length2;
    }

    public final int zza(long j2) {
        for (int zzc = zzazn.zzc(this.zze, j2, true, false); zzc >= 0; zzc--) {
            if ((this.zzf[zzc] & 1) != 0) {
                return zzc;
            }
        }
        return -1;
    }

    public final int zzb(long j2) {
        for (int zzb = zzazn.zzb(this.zze, j2, true, false); zzb < this.zze.length; zzb++) {
            if ((this.zzf[zzb] & 1) != 0) {
                return zzb;
            }
        }
        return -1;
    }
}
