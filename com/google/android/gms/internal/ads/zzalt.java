package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzalt extends zzgko implements zzglz {
    private static final zzalt zzb;
    private int zze;
    private long zzf = -1;
    private int zzg = 1000;

    static {
        zzalt zzaltVar = new zzalt();
        zzb = zzaltVar;
        zzgko.zzaN(zzalt.class, zzaltVar);
    }

    private zzalt() {
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
                    return new zzals(null);
                }
                return new zzalt();
            }
            return zzgko.zzaM(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", "zzg", zzame.zza});
        }
        return (byte) 1;
    }
}
