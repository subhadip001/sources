package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgbz extends zzgko implements zzglz {
    private static final zzgbz zzb;
    private zzgcc zze;
    private int zzf;

    static {
        zzgbz zzgbzVar = new zzgbz();
        zzb = zzgbzVar;
        zzgko.zzaN(zzgbz.class, zzgbzVar);
    }

    private zzgbz() {
    }

    public static zzgby zzc() {
        return (zzgby) zzb.zzaw();
    }

    public static zzgbz zze() {
        return zzb;
    }

    public static zzgbz zzf(zzgjg zzgjgVar, zzgka zzgkaVar) {
        return (zzgbz) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    public static /* synthetic */ void zzh(zzgbz zzgbzVar, zzgcc zzgccVar) {
        zzgccVar.getClass();
        zzgbzVar.zze = zzgccVar;
    }

    public final int zza() {
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
                    return new zzgby(null);
                }
                return new zzgbz();
            }
            return zzgko.zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgcc zzg() {
        zzgcc zzgccVar = this.zze;
        return zzgccVar == null ? zzgcc.zze() : zzgccVar;
    }
}
