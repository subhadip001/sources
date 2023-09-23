package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbgu extends zzgko implements zzglz {
    private static final zzbgu zzb;
    private int zze;
    private zzbgl zzf;
    private int zzg = 1000;
    private zzbgs zzh;
    private zzbgj zzi;

    static {
        zzbgu zzbguVar = new zzbgu();
        zzb = zzbguVar;
        zzgko.zzaN(zzbgu.class, zzbguVar);
    }

    private zzbgu() {
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
                    return new zzbgt(null);
                }
                return new zzbgu();
            }
            return zzgko.zzaM(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", "zzg", zzbey.zza, "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
