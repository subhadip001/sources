package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbhe extends zzgko implements zzglz {
    private static final zzbhe zzb;
    private int zze;
    private int zzf = 1000;
    private zzbgs zzg;

    static {
        zzbhe zzbheVar = new zzbhe();
        zzb = zzbheVar;
        zzgko.zzaN(zzbhe.class, zzbheVar);
    }

    private zzbhe() {
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
                    return new zzbhd(null);
                }
                return new zzbhe();
            }
            return zzgko.zzaM(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", zzbey.zza, "zzg"});
        }
        return (byte) 1;
    }
}
