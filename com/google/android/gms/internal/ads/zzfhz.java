package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfhz extends zzgko implements zzglz {
    private static final zzfhz zzb;
    private zzfhv zze;

    static {
        zzfhz zzfhzVar = new zzfhz();
        zzb = zzfhzVar;
        zzgko.zzaN(zzfhz.class, zzfhzVar);
    }

    private zzfhz() {
    }

    public static zzfhy zza() {
        return (zzfhy) zzb.zzaw();
    }

    public static /* synthetic */ zzfhz zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzfhz zzfhzVar, zzfhv zzfhvVar) {
        zzfhvVar.getClass();
        zzfhzVar.zze = zzfhvVar;
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
                    return new zzfhy(null);
                }
                return new zzfhz();
            }
            return zzgko.zzaM(zzb, "\u0000\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0000\u0000\u0006\t", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}
