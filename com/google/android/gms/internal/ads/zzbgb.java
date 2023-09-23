package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbgb extends zzgko implements zzglz {
    private static final zzbgb zzb;
    private int zze;
    private int zzf = 1000;
    private int zzg = 1000;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private zzbgd zzp;

    static {
        zzbgb zzbgbVar = new zzbgb();
        zzb = zzbgbVar;
        zzgko.zzaN(zzbgb.class, zzbgbVar);
    }

    private zzbgb() {
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                zzgks zzgksVar = zzbey.zza;
                return zzgko.zzaM(zzb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zze", "zzf", zzgksVar, "zzg", zzgksVar, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
            } else if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzbga(null);
            } else {
                return new zzbgb();
            }
        }
        return (byte) 1;
    }
}
