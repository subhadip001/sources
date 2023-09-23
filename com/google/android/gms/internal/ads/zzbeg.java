package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbeg extends zzgko implements zzglz {
    private static final zzbeg zzb;
    private zzgkx zze = zzgko.zzaH();

    static {
        zzbeg zzbegVar = new zzbeg();
        zzb = zzbegVar;
        zzgko.zzaN(zzbeg.class, zzbegVar);
    }

    private zzbeg() {
    }

    public static zzbea zza() {
        return (zzbea) zzb.zzaw();
    }

    public static /* synthetic */ void zzd(zzbeg zzbegVar, zzbdz zzbdzVar) {
        zzbdzVar.getClass();
        zzgkx zzgkxVar = zzbegVar.zze;
        if (!zzgkxVar.zzc()) {
            zzbegVar.zze = zzgko.zzaI(zzgkxVar);
        }
        zzbegVar.zze.add(zzbdzVar);
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
                    return new zzbea(null);
                }
                return new zzbeg();
            }
            return zzgko.zzaM(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzbdz.class});
        }
        return (byte) 1;
    }
}
