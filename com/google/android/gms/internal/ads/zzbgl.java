package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbgl extends zzgko implements zzglz {
    private static final zzbgl zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzbgl zzbglVar = new zzbgl();
        zzb = zzbglVar;
        zzgko.zzaN(zzbgl.class, zzbglVar);
    }

    private zzbgl() {
    }

    public static zzbgk zza() {
        return (zzbgk) zzb.zzaw();
    }

    public static /* synthetic */ void zzd(zzbgl zzbglVar, int i2) {
        zzbglVar.zze |= 1;
        zzbglVar.zzf = i2;
    }

    public static /* synthetic */ void zze(zzbgl zzbglVar, int i2) {
        zzbglVar.zze |= 2;
        zzbglVar.zzg = i2;
    }

    public static /* synthetic */ void zzf(zzbgl zzbglVar, int i2) {
        zzbglVar.zze |= 4;
        zzbglVar.zzh = i2;
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
                    return new zzbgk(null);
                }
                return new zzbgl();
            }
            return zzgko.zzaM(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
