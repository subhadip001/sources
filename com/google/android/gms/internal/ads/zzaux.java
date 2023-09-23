package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaux implements zzauu {
    private final zzazg zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzaux(zzaur zzaurVar) {
        zzazg zzazgVar = zzaurVar.zza;
        this.zza = zzazgVar;
        zzazgVar.zzv(12);
        this.zzc = zzazgVar.zzi() & 255;
        this.zzb = zzazgVar.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzauu
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzauu
    public final int zzb() {
        int i2 = this.zzc;
        if (i2 == 8) {
            return this.zza.zzg();
        }
        if (i2 == 16) {
            return this.zza.zzj();
        }
        int i3 = this.zzd;
        this.zzd = i3 + 1;
        if (i3 % 2 == 0) {
            int zzg = this.zza.zzg();
            this.zze = zzg;
            return (zzg & 240) >> 4;
        }
        return this.zze & 15;
    }

    @Override // com.google.android.gms.internal.ads.zzauu
    public final boolean zzc() {
        return false;
    }
}
