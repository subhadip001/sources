package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzta implements zztr {
    public final /* synthetic */ zztd zza;
    private final int zzb;

    public zzta(zztd zztdVar, int i2) {
        this.zza = zztdVar;
        this.zzb = i2;
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final int zza(zzja zzjaVar, zzgc zzgcVar, int i2) {
        return this.zza.zzg(this.zzb, zzjaVar, zzgcVar, i2);
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final int zzb(long j2) {
        return this.zza.zzi(this.zzb, j2);
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final void zzd() {
        this.zza.zzF(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final boolean zze() {
        return this.zza.zzM(this.zzb);
    }
}
