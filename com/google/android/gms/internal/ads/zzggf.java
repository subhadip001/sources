package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzggf extends zzgko implements zzglz {
    private static final zzggf zzb;
    private String zze = "";

    static {
        zzggf zzggfVar = new zzggf();
        zzb = zzggfVar;
        zzgko.zzaN(zzggf.class, zzggfVar);
    }

    private zzggf() {
    }

    public static zzggf zzc() {
        return zzb;
    }

    public static zzggf zzd(zzgjg zzgjgVar, zzgka zzgkaVar) {
        return (zzggf) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
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
                    return new zzgge(null);
                }
                return new zzggf();
            }
            return zzgko.zzaM(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
        }
        return (byte) 1;
    }

    public final String zze() {
        return this.zze;
    }
}
