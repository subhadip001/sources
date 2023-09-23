package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzamh extends zzgko implements zzglz {
    private static final zzamh zzb;
    private int zze;
    private long zzf;
    private String zzg = "";
    private zzgjg zzh = zzgjg.zzb;

    static {
        zzamh zzamhVar = new zzamh();
        zzb = zzamhVar;
        zzgko.zzaN(zzamh.class, zzamhVar);
    }

    private zzamh() {
    }

    public static zzamh zzd() {
        return zzb;
    }

    public final long zza() {
        return this.zzf;
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
                    return new zzamg(null);
                }
                return new zzamh();
            }
            return zzgko.zzaM(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final boolean zze() {
        return (this.zze & 1) != 0;
    }
}
