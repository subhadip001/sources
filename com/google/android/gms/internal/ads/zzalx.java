package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzalx extends zzgko implements zzglz {
    private static final zzalx zzb;
    private int zze;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;
    private long zzm = -1;

    static {
        zzalx zzalxVar = new zzalx();
        zzb = zzalxVar;
        zzgko.zzaN(zzalx.class, zzalxVar);
    }

    private zzalx() {
    }

    public static zzalw zza() {
        return (zzalw) zzb.zzaw();
    }

    public static /* synthetic */ void zzd(zzalx zzalxVar, long j2) {
        zzalxVar.zze |= 1;
        zzalxVar.zzf = j2;
    }

    public static /* synthetic */ void zze(zzalx zzalxVar, long j2) {
        zzalxVar.zze |= 4;
        zzalxVar.zzh = j2;
    }

    public static /* synthetic */ void zzf(zzalx zzalxVar, long j2) {
        zzalxVar.zze |= 8;
        zzalxVar.zzi = j2;
    }

    public static /* synthetic */ void zzg(zzalx zzalxVar, long j2) {
        zzalxVar.zze |= 16;
        zzalxVar.zzj = j2;
    }

    public static /* synthetic */ void zzh(zzalx zzalxVar, long j2) {
        zzalxVar.zze |= 32;
        zzalxVar.zzk = j2;
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
                    return new zzalw(null);
                }
                return new zzalx();
            }
            return zzgko.zzaM(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        return (byte) 1;
    }
}
