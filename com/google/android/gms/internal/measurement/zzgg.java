package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class zzgg extends zzkf implements zzln {
    private static final zzgg zza;
    private int zzd;
    private int zze = 1;
    private zzkm zzf = zzkf.zzbE();

    static {
        zzgg zzggVar = new zzgg();
        zza = zzggVar;
        zzkf.zzbL(zzgg.class, zzggVar);
    }

    private zzgg() {
    }

    public static zzge zza() {
        return (zzge) zza.zzbx();
    }

    public static /* synthetic */ void zzc(zzgg zzggVar, zzfv zzfvVar) {
        zzfvVar.getClass();
        zzkm zzkmVar = zzggVar.zzf;
        if (!zzkmVar.zzc()) {
            zzggVar.zzf = zzkf.zzbF(zzkmVar);
        }
        zzggVar.zzf.add(zzfvVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzkf
    public final Object zzl(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzge(null);
                }
                return new zzgg();
            }
            return zzkf.zzbI(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzd", "zze", zzgf.zza, "zzf", zzfv.class});
        }
        return (byte) 1;
    }
}
