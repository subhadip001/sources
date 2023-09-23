package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbef extends zzgko implements zzglz {
    private static final zzbef zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        zzbef zzbefVar = new zzbef();
        zzb = zzbefVar;
        zzgko.zzaN(zzbef.class, zzbefVar);
    }

    private zzbef() {
    }

    public static zzbee zza() {
        return (zzbee) zzb.zzaw();
    }

    public static /* synthetic */ void zzd(zzbef zzbefVar, boolean z) {
        zzbefVar.zze |= 1;
        zzbefVar.zzf = z;
    }

    public static /* synthetic */ void zze(zzbef zzbefVar, boolean z) {
        zzbefVar.zze |= 2;
        zzbefVar.zzg = z;
    }

    public static /* synthetic */ void zzf(zzbef zzbefVar, int i2) {
        zzbefVar.zze |= 4;
        zzbefVar.zzh = i2;
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
                    return new zzbee(null);
                }
                return new zzbef();
            }
            return zzgko.zzaM(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
