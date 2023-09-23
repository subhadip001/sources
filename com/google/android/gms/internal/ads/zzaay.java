package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaay extends zzzg {
    private final long zza;

    public zzaay(zzyt zzytVar, long j2) {
        super(zzytVar);
        zzcw.zzd(zzytVar.zzf() >= j2);
        this.zza = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzzg, com.google.android.gms.internal.ads.zzyt
    public final long zzd() {
        return super.zzd() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzzg, com.google.android.gms.internal.ads.zzyt
    public final long zze() {
        return super.zze() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzzg, com.google.android.gms.internal.ads.zzyt
    public final long zzf() {
        return super.zzf() - this.zza;
    }
}
