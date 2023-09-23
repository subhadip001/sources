package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzzk implements zzzv {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final boolean zzd;

    public zzzk(long[] jArr, long[] jArr2, long j2) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzcw.zzd(length == length2);
        boolean z = length2 > 0;
        this.zzd = z;
        if (!z || jArr2[0] <= 0) {
            this.zza = jArr;
            this.zzb = jArr2;
        } else {
            int i2 = length2 + 1;
            long[] jArr3 = new long[i2];
            this.zza = jArr3;
            long[] jArr4 = new long[i2];
            this.zzb = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.zzc = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzt zzg(long j2) {
        if (!this.zzd) {
            zzzw zzzwVar = zzzw.zza;
            return new zzzt(zzzwVar, zzzwVar);
        }
        int zzd = zzeg.zzd(this.zzb, j2, true, true);
        zzzw zzzwVar2 = new zzzw(this.zzb[zzd], this.zza[zzd]);
        if (zzzwVar2.zzb != j2) {
            long[] jArr = this.zzb;
            if (zzd != jArr.length - 1) {
                int i2 = zzd + 1;
                return new zzzt(zzzwVar2, new zzzw(jArr[i2], this.zza[i2]));
            }
        }
        return new zzzt(zzzwVar2, zzzwVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final boolean zzh() {
        return this.zzd;
    }
}
