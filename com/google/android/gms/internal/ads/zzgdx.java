package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgdx extends zzgko implements zzglz {
    private static final zzgdx zzb;
    private int zze;
    private zzgea zzf;
    private zzgjg zzg = zzgjg.zzb;

    static {
        zzgdx zzgdxVar = new zzgdx();
        zzb = zzgdxVar;
        zzgko.zzaN(zzgdx.class, zzgdxVar);
    }

    private zzgdx() {
    }

    public static zzgdw zzc() {
        return (zzgdw) zzb.zzaw();
    }

    public static zzgdx zze(zzgjg zzgjgVar, zzgka zzgkaVar) {
        return (zzgdx) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    public static /* synthetic */ void zzi(zzgdx zzgdxVar, zzgea zzgeaVar) {
        zzgeaVar.getClass();
        zzgdxVar.zzf = zzgeaVar;
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
                    return new zzgdw(null);
                }
                return new zzgdx();
            }
            return zzgko.zzaM(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgea zzf() {
        zzgea zzgeaVar = this.zzf;
        return zzgeaVar == null ? zzgea.zzf() : zzgeaVar;
    }

    public final zzgjg zzg() {
        return this.zzg;
    }
}
