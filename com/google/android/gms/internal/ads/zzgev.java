package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgev extends zzgko implements zzglz {
    private static final zzgev zzb;
    private zzgey zze;

    static {
        zzgev zzgevVar = new zzgev();
        zzb = zzgevVar;
        zzgko.zzaN(zzgev.class, zzgevVar);
    }

    private zzgev() {
    }

    public static zzgeu zza() {
        return (zzgeu) zzb.zzaw();
    }

    public static zzgev zzd(zzgjg zzgjgVar, zzgka zzgkaVar) {
        return (zzgev) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    public static /* synthetic */ void zzf(zzgev zzgevVar, zzgey zzgeyVar) {
        zzgeyVar.getClass();
        zzgevVar.zze = zzgeyVar;
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
                    return new zzgeu(null);
                }
                return new zzgev();
            }
            return zzgko.zzaM(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        }
        return (byte) 1;
    }

    public final zzgey zze() {
        zzgey zzgeyVar = this.zze;
        return zzgeyVar == null ? zzgey.zzd() : zzgeyVar;
    }
}
