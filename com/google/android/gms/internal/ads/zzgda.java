package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgda extends zzgko implements zzglz {
    private static final zzgda zzb;
    private int zze;
    private zzgjg zzf = zzgjg.zzb;

    static {
        zzgda zzgdaVar = new zzgda();
        zzb = zzgdaVar;
        zzgko.zzaN(zzgda.class, zzgdaVar);
    }

    private zzgda() {
    }

    public static zzgcz zzc() {
        return (zzgcz) zzb.zzaw();
    }

    public static zzgda zze(zzgjg zzgjgVar, zzgka zzgkaVar) {
        return (zzgda) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
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
                    return new zzgcz(null);
                }
                return new zzgda();
            }
            return zzgko.zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgjg zzf() {
        return this.zzf;
    }
}
