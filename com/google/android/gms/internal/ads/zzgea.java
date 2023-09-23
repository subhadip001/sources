package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgea extends zzgko implements zzglz {
    private static final zzgea zzb;
    private int zze;
    private zzgdu zzf;
    private zzgjg zzg;
    private zzgjg zzh;

    static {
        zzgea zzgeaVar = new zzgea();
        zzb = zzgeaVar;
        zzgko.zzaN(zzgea.class, zzgeaVar);
    }

    private zzgea() {
        zzgjg zzgjgVar = zzgjg.zzb;
        this.zzg = zzgjgVar;
        this.zzh = zzgjgVar;
    }

    public static zzgdz zzd() {
        return (zzgdz) zzb.zzaw();
    }

    public static zzgea zzf() {
        return zzb;
    }

    public static zzgea zzg(zzgjg zzgjgVar, zzgka zzgkaVar) {
        return (zzgea) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    public static /* synthetic */ void zzk(zzgea zzgeaVar, zzgdu zzgduVar) {
        zzgduVar.getClass();
        zzgeaVar.zzf = zzgduVar;
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
                    return new zzgdz(null);
                }
                return new zzgea();
            }
            return zzgko.zzaM(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final zzgdu zzc() {
        zzgdu zzgduVar = this.zzf;
        return zzgduVar == null ? zzgdu.zze() : zzgduVar;
    }

    public final zzgjg zzh() {
        return this.zzg;
    }

    public final zzgjg zzi() {
        return this.zzh;
    }
}
