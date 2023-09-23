package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgek extends zzgko implements zzglz {
    private static final zzgek zzb;
    private int zze;
    private zzgeq zzf;
    private zzgjg zzg = zzgjg.zzb;

    static {
        zzgek zzgekVar = new zzgek();
        zzb = zzgekVar;
        zzgko.zzaN(zzgek.class, zzgekVar);
    }

    private zzgek() {
    }

    public static zzgej zzc() {
        return (zzgej) zzb.zzaw();
    }

    public static zzgek zze() {
        return zzb;
    }

    public static zzgek zzf(zzgjg zzgjgVar, zzgka zzgkaVar) {
        return (zzgek) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    public static /* synthetic */ void zzj(zzgek zzgekVar, zzgeq zzgeqVar) {
        zzgeqVar.getClass();
        zzgekVar.zzf = zzgeqVar;
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
                    return new zzgej(null);
                }
                return new zzgek();
            }
            return zzgko.zzaM(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgeq zzg() {
        zzgeq zzgeqVar = this.zzf;
        return zzgeqVar == null ? zzgeq.zze() : zzgeqVar;
    }

    public final zzgjg zzh() {
        return this.zzg;
    }
}
