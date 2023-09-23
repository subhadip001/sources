package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzauw implements zzauu {
    private final int zza;
    private final int zzb;
    private final zzazg zzc;

    public zzauw(zzaur zzaurVar) {
        zzazg zzazgVar = zzaurVar.zza;
        this.zzc = zzazgVar;
        zzazgVar.zzv(12);
        this.zza = zzazgVar.zzi();
        this.zzb = zzazgVar.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzauu
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzauu
    public final int zzb() {
        int i2 = this.zza;
        return i2 == 0 ? this.zzc.zzi() : i2;
    }

    @Override // com.google.android.gms.internal.ads.zzauu
    public final boolean zzc() {
        return this.zza != 0;
    }
}
