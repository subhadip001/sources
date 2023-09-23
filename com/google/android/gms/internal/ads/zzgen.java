package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgen extends zzgko implements zzglz {
    private static final zzgen zzb;
    private zzgeq zze;
    private int zzf;
    private int zzg;

    static {
        zzgen zzgenVar = new zzgen();
        zzb = zzgenVar;
        zzgko.zzaN(zzgen.class, zzgenVar);
    }

    private zzgen() {
    }

    public static zzgem zzc() {
        return (zzgem) zzb.zzaw();
    }

    public static zzgen zze() {
        return zzb;
    }

    public static zzgen zzf(zzgjg zzgjgVar, zzgka zzgkaVar) {
        return (zzgen) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    public static /* synthetic */ void zzh(zzgen zzgenVar, zzgeq zzgeqVar) {
        zzgeqVar.getClass();
        zzgenVar.zze = zzgeqVar;
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
                    return new zzgem(null);
                }
                return new zzgen();
            }
            return zzgko.zzaM(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgeq zzg() {
        zzgeq zzgeqVar = this.zze;
        return zzgeqVar == null ? zzgeq.zze() : zzgeqVar;
    }
}
