package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbgf extends zzgko implements zzglz {
    private static final zzbgf zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbgf zzbgfVar = new zzbgf();
        zzb = zzbgfVar;
        zzgko.zzaN(zzbgf.class, zzbgfVar);
    }

    private zzbgf() {
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
                    return new zzbge(null);
                }
                return new zzbgf();
            }
            return zzgko.zzaM(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
