package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzflp extends zzgko implements zzglz {
    private static final zzgku zzb = new zzflm();
    private static final zzflp zze;
    private int zzf;
    private zzgkt zzg = zzgko.zzaE();
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzflp zzflpVar = new zzflp();
        zze = zzflpVar;
        zzgko.zzaN(zzflp.class, zzflpVar);
    }

    private zzflp() {
    }

    public static zzflo zza() {
        return (zzflo) zze.zzaw();
    }

    public static /* synthetic */ void zzd(zzflp zzflpVar, String str) {
        str.getClass();
        zzflpVar.zzf |= 1;
        zzflpVar.zzh = str;
    }

    public static /* synthetic */ void zze(zzflp zzflpVar, int i2) {
        zzgkt zzgktVar = zzflpVar.zzg;
        if (!zzgktVar.zzc()) {
            zzflpVar.zzg = zzgko.zzaF(zzgktVar);
        }
        zzflpVar.zzg.zzh(2);
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
                        return zze;
                    }
                    return new zzflo(null);
                }
                return new zzflp();
            }
            return zzgko.zzaM(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzf", "zzg", zzfln.zza, "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
