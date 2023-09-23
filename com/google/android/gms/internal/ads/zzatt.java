package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzatt implements zzauc {
    public final int[] zza;
    public final long[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    private final long zze;

    public zzatt(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zza = iArr;
        this.zzb = jArr;
        this.zzc = jArr2;
        this.zzd = jArr3;
        int length = iArr.length;
        if (length <= 0) {
            this.zze = 0L;
            return;
        }
        int i2 = length - 1;
        this.zze = jArr2[i2] + jArr3[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzauc
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzauc
    public final long zzb(long j2) {
        return this.zzb[zzazn.zzc(this.zzd, j2, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzauc
    public final boolean zzc() {
        return true;
    }
}
