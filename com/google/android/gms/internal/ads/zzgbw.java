package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgbw extends zzgko implements zzglz {
    private static final zzgbw zzb;
    private int zze;
    private zzgcc zzf;
    private zzgjg zzg = zzgjg.zzb;

    static {
        zzgbw zzgbwVar = new zzgbw();
        zzb = zzgbwVar;
        zzgko.zzaN(zzgbw.class, zzgbwVar);
    }

    private zzgbw() {
    }

    public static zzgbv zzc() {
        return (zzgbv) zzb.zzaw();
    }

    public static zzgbw zze() {
        return zzb;
    }

    public static zzgbw zzf(zzgjg zzgjgVar, zzgka zzgkaVar) {
        return (zzgbw) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    public static /* synthetic */ void zzj(zzgbw zzgbwVar, zzgcc zzgccVar) {
        zzgccVar.getClass();
        zzgbwVar.zzf = zzgccVar;
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
                    return new zzgbv(null);
                }
                return new zzgbw();
            }
            return zzgko.zzaM(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgcc zzg() {
        zzgcc zzgccVar = this.zzf;
        return zzgccVar == null ? zzgcc.zze() : zzgccVar;
    }

    public final zzgjg zzh() {
        return this.zzg;
    }
}
