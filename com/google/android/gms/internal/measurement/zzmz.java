package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class zzmz {
    public static /* bridge */ /* synthetic */ void zza(byte b, byte b2, byte b3, byte b4, char[] cArr, int i2) {
        if (!zze(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !zze(b3) && !zze(b4)) {
                int i3 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i2] = (char) ((i3 >>> 10) + 55232);
                cArr[i2 + 1] = (char) ((i3 & 1023) + 56320);
                return;
            }
        }
        throw zzkp.zzc();
    }

    public static /* bridge */ /* synthetic */ void zzb(byte b, byte b2, byte b3, char[] cArr, int i2) {
        if (!zze(b2)) {
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
            if (!zze(b3)) {
                cArr[i2] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw zzkp.zzc();
    }

    public static /* bridge */ /* synthetic */ void zzc(byte b, byte b2, char[] cArr, int i2) {
        if (b >= -62 && !zze(b2)) {
            cArr[i2] = (char) (((b & 31) << 6) | (b2 & 63));
            return;
        }
        throw zzkp.zzc();
    }

    public static /* bridge */ /* synthetic */ boolean zzd(byte b) {
        return b >= 0;
    }

    private static boolean zze(byte b) {
        return b > -65;
    }
}
