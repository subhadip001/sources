package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbep extends zzgko implements zzglz {
    private static final zzbep zzb;
    private int zze;
    private String zzf = "";
    private zzgkx zzg = zzgko.zzaH();
    private int zzh = 1000;
    private int zzi = 1000;
    private int zzj = 1000;

    static {
        zzbep zzbepVar = new zzbep();
        zzb = zzbepVar;
        zzgko.zzaN(zzbep.class, zzbepVar);
    }

    private zzbep() {
    }

    public static zzbep zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzbep zzbepVar, String str) {
        str.getClass();
        zzbepVar.zze |= 1;
        zzbepVar.zzf = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                zzgks zzgksVar = zzbey.zza;
                return zzgko.zzaM(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zze", "zzf", "zzg", zzbel.class, "zzh", zzgksVar, "zzi", zzgksVar, "zzj", zzgksVar});
            } else if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzbeo(null);
            } else {
                return new zzbep();
            }
        }
        return (byte) 1;
    }
}
