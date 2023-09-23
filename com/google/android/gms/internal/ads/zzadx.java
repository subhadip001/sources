package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzadx {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzdy zzf;
    private final zzdy zzg;
    private int zzh;
    private int zzi;

    public zzadx(zzdy zzdyVar, zzdy zzdyVar2, boolean z) {
        this.zzg = zzdyVar;
        this.zzf = zzdyVar2;
        this.zze = z;
        zzdyVar2.zzF(12);
        this.zza = zzdyVar2.zzn();
        zzdyVar.zzF(12);
        this.zzi = zzdyVar.zzn();
        zzyw.zzb(zzdyVar.zze() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int i2 = this.zzb + 1;
        this.zzb = i2;
        if (i2 == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzt() : this.zzf.zzs();
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzn();
            this.zzg.zzG(4);
            int i3 = this.zzi - 1;
            this.zzi = i3;
            this.zzh = i3 > 0 ? (-1) + this.zzg.zzn() : -1;
        }
        return true;
    }
}
