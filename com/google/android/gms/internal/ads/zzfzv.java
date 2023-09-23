package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfzv {
    public static void zza(zzgdu zzgduVar) {
        zzgho.zze(zzc(zzgduVar.zzf().zzg()));
        zzb(zzgduVar.zzf().zzh());
        if (zzgduVar.zzi() != 2) {
            zzfxi.zzc(zzgduVar.zza().zze());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    public static String zzb(int i2) {
        int i3 = i2 - 2;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 == 5) {
                            return "HmacSha224";
                        }
                        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(zzgeh.zza(i2))));
                    }
                    return "HmacSha512";
                }
                return "HmacSha256";
            }
            return "HmacSha384";
        }
        return "HmacSha1";
    }

    public static int zzc(int i2) {
        int i3 = i2 - 2;
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 == 4) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(zzgef.zza(i2))));
            }
            return 2;
        }
        return 1;
    }

    public static int zzd(int i2) {
        int i3 = i2 - 2;
        int i4 = 1;
        if (i3 != 1) {
            i4 = 2;
            if (i3 != 2) {
                if (i3 == 3) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(zzgdl.zza(i2))));
            }
        }
        return i4;
    }
}
