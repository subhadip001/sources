package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzald extends zzgko implements zzglz {
    private static final zzald zzb;
    private int zze;
    private int zzf = 2;

    static {
        zzald zzaldVar = new zzald();
        zzb = zzaldVar;
        zzgko.zzaN(zzald.class, zzaldVar);
    }

    private zzald() {
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
                    return new zzalc(null);
                }
                return new zzald();
            }
            return zzgko.zzaM(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zze", "zzf", zzale.zza});
        }
        return (byte) 1;
    }
}
