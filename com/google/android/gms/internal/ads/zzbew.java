package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbew extends zzgko implements zzglz {
    private static final zzbew zzb;
    private int zze;
    private int zzf;
    private zzbgl zzg;
    private String zzh = "";
    private String zzi = "";

    static {
        zzbew zzbewVar = new zzbew();
        zzb = zzbewVar;
        zzgko.zzaN(zzbew.class, zzbewVar);
    }

    private zzbew() {
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
                    return new zzbeu(null);
                }
                return new zzbew();
            }
            return zzgko.zzaM(zzb, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005ဌ\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zze", "zzf", zzbev.zza, "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
