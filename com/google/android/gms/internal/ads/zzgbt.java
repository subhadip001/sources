package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgbt extends zzgko implements zzglz {
    private static final zzgbt zzb;
    private zzgbz zze;
    private zzgen zzf;

    static {
        zzgbt zzgbtVar = new zzgbt();
        zzb = zzgbtVar;
        zzgko.zzaN(zzgbt.class, zzgbtVar);
    }

    private zzgbt() {
    }

    public static zzgbs zza() {
        return (zzgbs) zzb.zzaw();
    }

    public static zzgbt zzd(zzgjg zzgjgVar, zzgka zzgkaVar) {
        return (zzgbt) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    public static /* synthetic */ void zzg(zzgbt zzgbtVar, zzgbz zzgbzVar) {
        zzgbzVar.getClass();
        zzgbtVar.zze = zzgbzVar;
    }

    public static /* synthetic */ void zzh(zzgbt zzgbtVar, zzgen zzgenVar) {
        zzgenVar.getClass();
        zzgbtVar.zzf = zzgenVar;
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
                    return new zzgbs(null);
                }
                return new zzgbt();
            }
            return zzgko.zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgbz zze() {
        zzgbz zzgbzVar = this.zze;
        return zzgbzVar == null ? zzgbz.zze() : zzgbzVar;
    }

    public final zzgen zzf() {
        zzgen zzgenVar = this.zzf;
        return zzgenVar == null ? zzgen.zze() : zzgenVar;
    }
}
