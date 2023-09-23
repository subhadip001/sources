package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class zzfv extends zzkf implements zzln {
    private static final zzfv zza;
    private int zzd;
    private String zze = "";
    private long zzf;

    static {
        zzfv zzfvVar = new zzfv();
        zza = zzfvVar;
        zzkf.zzbL(zzfv.class, zzfvVar);
    }

    private zzfv() {
    }

    public static zzfu zza() {
        return (zzfu) zza.zzbx();
    }

    public static /* synthetic */ void zzc(zzfv zzfvVar, String str) {
        str.getClass();
        zzfvVar.zzd |= 1;
        zzfvVar.zze = str;
    }

    public static /* synthetic */ void zzd(zzfv zzfvVar, long j2) {
        zzfvVar.zzd |= 2;
        zzfvVar.zzf = j2;
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
                    return new zzfu(null);
                }
                return new zzfv();
            }
            return zzkf.zzbI(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
