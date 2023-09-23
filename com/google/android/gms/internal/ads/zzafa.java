package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzafa implements zzafg {
    private final zzzf zza;
    private final zzze zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzafa(zzzf zzzfVar, zzze zzzeVar) {
        this.zza = zzzfVar;
        this.zzb = zzzeVar;
    }

    public final void zza(long j2) {
        this.zzc = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    public final long zzd(zzyt zzytVar) {
        long j2 = this.zzd;
        if (j2 >= 0) {
            this.zzd = -1L;
            return -(j2 + 2);
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    public final zzzv zze() {
        zzcw.zzf(this.zzc != -1);
        return new zzzd(this.zza, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    public final void zzg(long j2) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzeg.zzd(jArr, j2, true, true)];
    }
}
