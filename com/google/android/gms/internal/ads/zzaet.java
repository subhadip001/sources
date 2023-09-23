package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaet {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final zzad zzf;
    public final int zzg;
    public final long[] zzh;
    public final long[] zzi;
    public final int zzj;
    private final zzaeu[] zzk;

    public zzaet(int i2, int i3, long j2, long j3, long j4, zzad zzadVar, int i4, zzaeu[] zzaeuVarArr, int i5, long[] jArr, long[] jArr2) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4;
        this.zzf = zzadVar;
        this.zzg = i4;
        this.zzk = zzaeuVarArr;
        this.zzj = i5;
        this.zzh = jArr;
        this.zzi = jArr2;
    }

    public final zzaeu zza(int i2) {
        zzaeu[] zzaeuVarArr = this.zzk;
        if (zzaeuVarArr == null) {
            return null;
        }
        return zzaeuVarArr[i2];
    }
}
