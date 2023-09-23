package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaut {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzazg zzf;
    private final zzazg zzg;
    private int zzh;
    private int zzi;

    public zzaut(zzazg zzazgVar, zzazg zzazgVar2, boolean z) {
        this.zzg = zzazgVar;
        this.zzf = zzazgVar2;
        this.zze = z;
        zzazgVar2.zzv(12);
        this.zza = zzazgVar2.zzi();
        zzazgVar.zzv(12);
        this.zzi = zzazgVar.zzi();
        zzayy.zzf(zzazgVar.zze() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int i2 = this.zzb + 1;
        this.zzb = i2;
        if (i2 == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzn() : this.zzf.zzm();
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzi();
            this.zzg.zzw(4);
            int i3 = this.zzi - 1;
            this.zzi = i3;
            this.zzh = i3 > 0 ? (-1) + this.zzg.zzi() : -1;
        }
        return true;
    }
}
