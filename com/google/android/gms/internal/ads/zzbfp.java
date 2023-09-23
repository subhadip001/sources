package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbfp extends zzgko implements zzglz {
    private static final zzbfp zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbfp zzbfpVar = new zzbfp();
        zzb = zzbfpVar;
        zzgko.zzaN(zzbfp.class, zzbfpVar);
    }

    private zzbfp() {
    }

    public static zzbfi zza() {
        return (zzbfi) zzb.zzaw();
    }

    public static zzbfp zzd() {
        return zzb;
    }

    public static /* synthetic */ void zzi(zzbfp zzbfpVar, int i2) {
        zzbfpVar.zzf = i2 - 1;
        zzbfpVar.zze |= 1;
    }

    public static /* synthetic */ void zzj(zzbfp zzbfpVar, int i2) {
        zzbfpVar.zzg = i2 - 1;
        zzbfpVar.zze |= 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzbfi(null);
                }
                return new zzbfp();
            }
            return zzgko.zzaM(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", zzbfn.zza, "zzg", zzbfk.zza});
        }
        return (byte) 1;
    }

    public final boolean zze() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzf() {
        return (this.zze & 1) != 0;
    }

    public final int zzg() {
        int zza = zzbfl.zza(this.zzg);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzh() {
        int zza = zzbfo.zza(this.zzf);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }
}
