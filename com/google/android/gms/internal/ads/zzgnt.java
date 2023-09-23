package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgnt {
    public static /* bridge */ /* synthetic */ void zza(byte b, byte b2, byte b3, byte b4, char[] cArr, int i2) {
        if (!zzg(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !zzg(b3) && !zzg(b4)) {
                int i3 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i2] = (char) ((i3 >>> 10) + 55232);
                cArr[i2 + 1] = (char) ((i3 & 1023) + 56320);
                return;
            }
        }
        throw zzgla.zzd();
    }

    public static /* bridge */ /* synthetic */ void zzb(byte b, byte b2, byte b3, char[] cArr, int i2) {
        if (!zzg(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!zzg(b3)) {
                cArr[i2] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw zzgla.zzd();
    }

    public static /* bridge */ /* synthetic */ void zzc(byte b, byte b2, char[] cArr, int i2) {
        if (b >= -62 && !zzg(b2)) {
            cArr[i2] = (char) (((b & 31) << 6) | (b2 & 63));
            return;
        }
        throw zzgla.zzd();
    }

    public static /* bridge */ /* synthetic */ boolean zzd(byte b) {
        return b >= 0;
    }

    public static /* bridge */ /* synthetic */ boolean zze(byte b) {
        return b < -16;
    }

    public static /* bridge */ /* synthetic */ boolean zzf(byte b) {
        return b < -32;
    }

    private static boolean zzg(byte b) {
        return b > -65;
    }
}
