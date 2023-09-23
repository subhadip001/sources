package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgcx extends zzgko implements zzglz {
    private static final zzgcx zzb;
    private int zze;
    private int zzf;

    static {
        zzgcx zzgcxVar = new zzgcx();
        zzb = zzgcxVar;
        zzgko.zzaN(zzgcx.class, zzgcxVar);
    }

    private zzgcx() {
    }

    public static zzgcw zzc() {
        return (zzgcw) zzb.zzaw();
    }

    public static zzgcx zze(zzgjg zzgjgVar, zzgka zzgkaVar) {
        return (zzgcx) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    public final int zza() {
        return this.zze;
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
                    return new zzgcw(null);
                }
                return new zzgcx();
            }
            return zzgko.zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
        }
        return (byte) 1;
    }
}
