package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgbh extends zzgko implements zzglz {
    private static final zzgbh zzb;
    private int zze;
    private zzgjg zzf = zzgjg.zzb;
    private zzgbn zzg;

    static {
        zzgbh zzgbhVar = new zzgbh();
        zzb = zzgbhVar;
        zzgko.zzaN(zzgbh.class, zzgbhVar);
    }

    private zzgbh() {
    }

    public static zzgbg zzc() {
        return (zzgbg) zzb.zzaw();
    }

    public static zzgbh zze(zzgjg zzgjgVar, zzgka zzgkaVar) {
        return (zzgbh) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    public static /* synthetic */ void zzj(zzgbh zzgbhVar, zzgbn zzgbnVar) {
        zzgbnVar.getClass();
        zzgbhVar.zzg = zzgbnVar;
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
                    return new zzgbg(null);
                }
                return new zzgbh();
            }
            return zzgko.zzaM(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgbn zzf() {
        zzgbn zzgbnVar = this.zzg;
        return zzgbnVar == null ? zzgbn.zze() : zzgbnVar;
    }

    public final zzgjg zzg() {
        return this.zzf;
    }
}
