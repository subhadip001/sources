package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgoz extends zzgko implements zzglz {
    private static final zzgoz zzb;
    private int zze;
    private String zzf = "";
    private long zzg;
    private boolean zzh;

    static {
        zzgoz zzgozVar = new zzgoz();
        zzb = zzgozVar;
        zzgko.zzaN(zzgoz.class, zzgozVar);
    }

    private zzgoz() {
    }

    public static zzgoy zza() {
        return (zzgoy) zzb.zzaw();
    }

    public static /* synthetic */ void zzd(zzgoz zzgozVar, String str) {
        zzgozVar.zze |= 1;
        zzgozVar.zzf = str;
    }

    public static /* synthetic */ void zze(zzgoz zzgozVar, long j2) {
        zzgozVar.zze |= 2;
        zzgozVar.zzg = j2;
    }

    public static /* synthetic */ void zzf(zzgoz zzgozVar, boolean z) {
        zzgozVar.zze |= 4;
        zzgozVar.zzh = z;
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
                    return new zzgoy(null);
                }
                return new zzgoz();
            }
            return zzgko.zzaM(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
