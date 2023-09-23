package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzawt implements zzaxk {
    public final /* synthetic */ zzawu zza;
    private final int zzb;

    public zzawt(zzawu zzawuVar, int i2) {
        this.zza = zzawuVar;
        this.zzb = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzaxk
    public final int zzb(zzart zzartVar, zzatn zzatnVar, boolean z) {
        return this.zza.zze(this.zzb, zzartVar, zzatnVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaxk
    public final void zzc() {
        this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzaxk
    public final void zzd(long j2) {
        this.zza.zzy(this.zzb, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaxk
    public final boolean zze() {
        return this.zza.zzA(this.zzb);
    }
}
