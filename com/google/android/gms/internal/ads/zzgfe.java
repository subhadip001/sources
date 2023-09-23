package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgfe extends zzgko implements zzglz {
    private static final zzgfe zzb;
    private int zze;
    private zzgey zzf;
    private zzgjg zzg = zzgjg.zzb;

    static {
        zzgfe zzgfeVar = new zzgfe();
        zzb = zzgfeVar;
        zzgko.zzaN(zzgfe.class, zzgfeVar);
    }

    private zzgfe() {
    }

    public static zzgfd zzd() {
        return (zzgfd) zzb.zzaw();
    }

    public static zzgfe zzf() {
        return zzb;
    }

    public static zzgfe zzg(zzgjg zzgjgVar, zzgka zzgkaVar) {
        return (zzgfe) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    public static /* synthetic */ void zzj(zzgfe zzgfeVar, zzgey zzgeyVar) {
        zzgeyVar.getClass();
        zzgfeVar.zzf = zzgeyVar;
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
                    return new zzgfd(null);
                }
                return new zzgfe();
            }
            return zzgko.zzaM(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgey zzc() {
        zzgey zzgeyVar = this.zzf;
        return zzgeyVar == null ? zzgey.zzd() : zzgeyVar;
    }

    public final zzgjg zzh() {
        return this.zzg;
    }

    public final boolean zzl() {
        return this.zzf != null;
    }
}
