package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbdz extends zzgko implements zzglz {
    private static final zzbdz zzb;
    private int zze;
    private int zzf;
    private zzbed zzg;
    private zzbef zzh;

    static {
        zzbdz zzbdzVar = new zzbdz();
        zzb = zzbdzVar;
        zzgko.zzaN(zzbdz.class, zzbdzVar);
    }

    private zzbdz() {
    }

    public static zzbdy zza() {
        return (zzbdy) zzb.zzaw();
    }

    public static /* synthetic */ void zzd(zzbdz zzbdzVar, zzbed zzbedVar) {
        zzbedVar.getClass();
        zzbdzVar.zzg = zzbedVar;
        zzbdzVar.zze |= 2;
    }

    public static /* synthetic */ void zze(zzbdz zzbdzVar, zzbef zzbefVar) {
        zzbefVar.getClass();
        zzbdzVar.zzh = zzbefVar;
        zzbdzVar.zze |= 4;
    }

    public static /* synthetic */ void zzf(zzbdz zzbdzVar, int i2) {
        zzbdzVar.zzf = 1;
        zzbdzVar.zze = 1 | zzbdzVar.zze;
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
                    return new zzbdy(null);
                }
                return new zzbdz();
            }
            return zzgko.zzaM(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", zzbeb.zza, "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
