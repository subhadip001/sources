package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzflt extends zzgko implements zzglz {
    private static final zzflt zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";
    private zzflp zzi;

    static {
        zzflt zzfltVar = new zzflt();
        zzb = zzfltVar;
        zzgko.zzaN(zzflt.class, zzfltVar);
    }

    private zzflt() {
    }

    public static zzflr zza() {
        return (zzflr) zzb.zzaw();
    }

    public static /* synthetic */ zzflt zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzflt zzfltVar, String str) {
        str.getClass();
        zzfltVar.zze |= 2;
        zzfltVar.zzg = str;
    }

    public static /* synthetic */ void zze(zzflt zzfltVar, zzflp zzflpVar) {
        zzflpVar.getClass();
        zzfltVar.zzi = zzflpVar;
        zzfltVar.zze |= 8;
    }

    public static /* synthetic */ void zzf(zzflt zzfltVar, int i2) {
        zzfltVar.zzf = 1;
        zzfltVar.zze = 1 | zzfltVar.zze;
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
                    return new zzflr(null);
                }
                return new zzflt();
            }
            return zzgko.zzaM(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", zzfls.zza, "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
