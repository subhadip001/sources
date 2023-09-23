package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbed extends zzgko implements zzglz {
    private static final zzbed zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        zzbed zzbedVar = new zzbed();
        zzb = zzbedVar;
        zzgko.zzaN(zzbed.class, zzbedVar);
    }

    private zzbed() {
    }

    public static zzbec zza() {
        return (zzbec) zzb.zzaw();
    }

    public static zzbed zzd() {
        return zzb;
    }

    public static /* synthetic */ void zze(zzbed zzbedVar, boolean z) {
        zzbedVar.zze |= 1;
        zzbedVar.zzf = z;
    }

    public static /* synthetic */ void zzf(zzbed zzbedVar, int i2) {
        zzbedVar.zze |= 2;
        zzbedVar.zzg = i2;
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
                    return new zzbec(null);
                }
                return new zzbed();
            }
            return zzgko.zzaM(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
