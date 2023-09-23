package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzggc extends zzgko implements zzglz {
    private static final zzggc zzb;
    private int zze;
    private zzggf zzf;

    static {
        zzggc zzggcVar = new zzggc();
        zzb = zzggcVar;
        zzgko.zzaN(zzggc.class, zzggcVar);
    }

    private zzggc() {
    }

    public static zzggb zzc() {
        return (zzggb) zzb.zzaw();
    }

    public static zzggc zze(zzgjg zzgjgVar, zzgka zzgkaVar) {
        return (zzggc) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    public static /* synthetic */ void zzh(zzggc zzggcVar, zzggf zzggfVar) {
        zzggfVar.getClass();
        zzggcVar.zzf = zzggfVar;
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
                    return new zzggb(null);
                }
                return new zzggc();
            }
            return zzgko.zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzggf zzf() {
        zzggf zzggfVar = this.zzf;
        return zzggfVar == null ? zzggf.zzc() : zzggfVar;
    }
}
