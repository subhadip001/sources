package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgdd extends zzgko implements zzglz {
    private static final zzgdd zzb;
    private int zze;
    private int zzf;

    static {
        zzgdd zzgddVar = new zzgdd();
        zzb = zzgddVar;
        zzgko.zzaN(zzgdd.class, zzgddVar);
    }

    private zzgdd() {
    }

    public static zzgdc zzc() {
        return (zzgdc) zzb.zzaw();
    }

    public static zzgdd zze(zzgjg zzgjgVar, zzgka zzgkaVar) {
        return (zzgdd) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
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
                    return new zzgdc(null);
                }
                return new zzgdd();
            }
            return zzgko.zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
