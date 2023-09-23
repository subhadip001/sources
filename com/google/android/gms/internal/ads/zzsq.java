package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzsq implements zztr {
    private final zztr zza;
    private final long zzb;

    public zzsq(zztr zztrVar, long j2) {
        this.zza = zztrVar;
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final int zza(zzja zzjaVar, zzgc zzgcVar, int i2) {
        int zza = this.zza.zza(zzjaVar, zzgcVar, i2);
        if (zza == -4) {
            zzgcVar.zzd = Math.max(0L, zzgcVar.zzd + this.zzb);
            return -4;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final int zzb(long j2) {
        return this.zza.zzb(j2 - this.zzb);
    }

    public final zztr zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final void zzd() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final boolean zze() {
        return this.zza.zze();
    }
}
