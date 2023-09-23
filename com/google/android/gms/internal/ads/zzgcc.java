package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgcc extends zzgko implements zzglz {
    private static final zzgcc zzb;
    private int zze;

    static {
        zzgcc zzgccVar = new zzgcc();
        zzb = zzgccVar;
        zzgko.zzaN(zzgcc.class, zzgccVar);
    }

    private zzgcc() {
    }

    public static zzgcb zzc() {
        return (zzgcb) zzb.zzaw();
    }

    public static zzgcc zze() {
        return zzb;
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
                    return new zzgcb(null);
                }
                return new zzgcc();
            }
            return zzgko.zzaM(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}
