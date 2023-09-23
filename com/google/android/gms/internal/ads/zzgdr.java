package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgdr extends zzgko implements zzglz {
    private static final zzgdr zzb;
    private zzgdu zze;

    static {
        zzgdr zzgdrVar = new zzgdr();
        zzb = zzgdrVar;
        zzgko.zzaN(zzgdr.class, zzgdrVar);
    }

    private zzgdr() {
    }

    public static zzgdq zza() {
        return (zzgdq) zzb.zzaw();
    }

    public static zzgdr zzd(zzgjg zzgjgVar, zzgka zzgkaVar) {
        return (zzgdr) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    public static /* synthetic */ void zzf(zzgdr zzgdrVar, zzgdu zzgduVar) {
        zzgduVar.getClass();
        zzgdrVar.zze = zzgduVar;
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
                    return new zzgdq(null);
                }
                return new zzgdr();
            }
            return zzgko.zzaM(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        }
        return (byte) 1;
    }

    public final zzgdu zze() {
        zzgdu zzgduVar = this.zze;
        return zzgduVar == null ? zzgdu.zze() : zzgduVar;
    }
}
