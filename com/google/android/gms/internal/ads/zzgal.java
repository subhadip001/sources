package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgal {
    public static final byte[] zza = zzc(1, 0);
    public static final byte[] zzb = zzc(2, 32);
    public static final byte[] zzc = zzc(2, 1);
    public static final byte[] zzd = zzc(2, 1);
    public static final byte[] zze = zzc(2, 2);
    public static final byte[] zzf = zzc(2, 3);
    public static final byte[] zzg = new byte[0];
    private static final byte[] zzh = "KEM".getBytes(StandardCharsets.UTF_8);
    private static final byte[] zzi = "HPKE".getBytes(StandardCharsets.UTF_8);
    private static final byte[] zzj = "HPKE-v1".getBytes(StandardCharsets.UTF_8);

    public static void zza(zzgey zzgeyVar) {
        if (zzgeyVar.zzg() != 2 && zzgeyVar.zzg() != 1) {
            String str = "UNRECOGNIZED";
            if (zzgeyVar.zzf() != 2 && zzgeyVar.zzf() != 1) {
                if (zzgeyVar.zze() == 2 || zzgeyVar.zze() == 1) {
                    int zze2 = zzgeyVar.zze();
                    if (zze2 == 2) {
                        str = "AEAD_UNKNOWN";
                    } else if (zze2 == 3) {
                        str = "AES_128_GCM";
                    } else if (zze2 == 4) {
                        str = "AES_256_GCM";
                    } else if (zze2 == 5) {
                        str = "CHACHA20_POLY1305";
                    }
                    throw new GeneralSecurityException("Invalid AEAD param: ".concat(str));
                }
                return;
            }
            int zzf2 = zzgeyVar.zzf();
            if (zzf2 == 2) {
                str = "KDF_UNKNOWN";
            } else if (zzf2 == 3) {
                str = "HKDF_SHA256";
            }
            throw new GeneralSecurityException("Invalid KDF param: ".concat(str));
        }
        throw new GeneralSecurityException("Invalid KEM param: ".concat(zzges.zza(zzgeyVar.zzg())));
    }

    public static byte[] zzb(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return zzghf.zzc(zzi, bArr, bArr2, bArr3);
    }

    public static byte[] zzc(int i2, int i3) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) ((i3 >> (((i2 - i4) - 1) * 8)) & 255);
        }
        return bArr;
    }

    public static byte[] zzd(byte[] bArr) {
        return zzghf.zzc(zzh, bArr);
    }

    public static byte[] zze(String str, byte[] bArr, byte[] bArr2) {
        return zzghf.zzc(zzj, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }

    public static byte[] zzf(String str, byte[] bArr, byte[] bArr2, int i2) {
        return zzghf.zzc(zzc(2, i2), zzj, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }
}
