package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgdu extends zzgko implements zzglz {
    private static final zzgdu zzb;
    private zzged zze;
    private zzgdo zzf;
    private int zzg;

    static {
        zzgdu zzgduVar = new zzgdu();
        zzb = zzgduVar;
        zzgko.zzaN(zzgdu.class, zzgduVar);
    }

    private zzgdu() {
    }

    public static zzgdt zzc() {
        return (zzgdt) zzb.zzaw();
    }

    public static zzgdu zze() {
        return zzb;
    }

    public static /* synthetic */ void zzg(zzgdu zzgduVar, zzged zzgedVar) {
        zzgedVar.getClass();
        zzgduVar.zze = zzgedVar;
    }

    public static /* synthetic */ void zzh(zzgdu zzgduVar, zzgdo zzgdoVar) {
        zzgdoVar.getClass();
        zzgduVar.zzf = zzgdoVar;
    }

    public final zzgdo zza() {
        zzgdo zzgdoVar = this.zzf;
        return zzgdoVar == null ? zzgdo.zzd() : zzgdoVar;
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
                    return new zzgdt(null);
                }
                return new zzgdu();
            }
            return zzgko.zzaM(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzged zzf() {
        zzged zzgedVar = this.zze;
        return zzgedVar == null ? zzged.zzd() : zzgedVar;
    }

    public final int zzi() {
        int i2 = this.zzg;
        int i3 = 3;
        if (i2 == 0) {
            i3 = 2;
        } else if (i2 != 1) {
            i3 = i2 != 2 ? i2 != 3 ? 0 : 5 : 4;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }
}
