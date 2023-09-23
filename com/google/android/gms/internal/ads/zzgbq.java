package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgbq extends zzgko implements zzglz {
    private static final zzgbq zzb;
    private int zze;
    private zzgbw zzf;
    private zzgek zzg;

    static {
        zzgbq zzgbqVar = new zzgbq();
        zzb = zzgbqVar;
        zzgko.zzaN(zzgbq.class, zzgbqVar);
    }

    private zzgbq() {
    }

    public static zzgbp zzc() {
        return (zzgbp) zzb.zzaw();
    }

    public static zzgbq zze(zzgjg zzgjgVar, zzgka zzgkaVar) {
        return (zzgbq) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    public static /* synthetic */ void zzi(zzgbq zzgbqVar, zzgbw zzgbwVar) {
        zzgbwVar.getClass();
        zzgbqVar.zzf = zzgbwVar;
    }

    public static /* synthetic */ void zzj(zzgbq zzgbqVar, zzgek zzgekVar) {
        zzgekVar.getClass();
        zzgbqVar.zzg = zzgekVar;
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
                    return new zzgbp(null);
                }
                return new zzgbq();
            }
            return zzgko.zzaM(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgbw zzf() {
        zzgbw zzgbwVar = this.zzf;
        return zzgbwVar == null ? zzgbw.zze() : zzgbwVar;
    }

    public final zzgek zzg() {
        zzgek zzgekVar = this.zzg;
        return zzgekVar == null ? zzgek.zze() : zzgekVar;
    }
}
