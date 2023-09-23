package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfyz {
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        long zzb = zzb(bArr, 0, 0);
        long zzb2 = zzb(bArr, 3, 2) & 67108611;
        long zzb3 = zzb(bArr, 6, 4) & 67092735;
        long zzb4 = zzb(bArr, 9, 6) & 66076671;
        long zzb5 = zzb(bArr, 12, 8) & 1048575;
        long j2 = zzb2 * 5;
        long j3 = zzb3 * 5;
        long j4 = zzb4 * 5;
        long j5 = zzb5 * 5;
        int i2 = 17;
        byte[] bArr3 = new byte[17];
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        int i3 = 0;
        while (true) {
            int length = bArr2.length;
            if (i3 < length) {
                int min = Math.min(16, length - i3);
                System.arraycopy(bArr2, i3, bArr3, 0, min);
                bArr3[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr3, min + 1, i2, (byte) 0);
                }
                long zzb6 = j10 + zzb(bArr3, 0, 0);
                long zzb7 = j7 + zzb(bArr3, 3, 2);
                long zzb8 = j6 + zzb(bArr3, 6, 4);
                long zzb9 = j8 + zzb(bArr3, 9, 6);
                long zzb10 = j9 + (zzb(bArr3, 12, 8) | (bArr3[16] << 24));
                long j11 = (zzb10 * j2) + (zzb9 * j3) + (zzb8 * j4) + (zzb7 * j5) + (zzb6 * zzb);
                long j12 = (zzb10 * j3) + (zzb9 * j4) + (zzb8 * j5) + (zzb7 * zzb) + (zzb6 * zzb2) + (j11 >> 26);
                long j13 = (zzb10 * j4) + (zzb9 * j5) + (zzb8 * zzb) + (zzb7 * zzb2) + (zzb6 * zzb3) + (j12 >> 26);
                long j14 = (zzb10 * j5) + (zzb9 * zzb) + (zzb8 * zzb2) + (zzb7 * zzb3) + (zzb6 * zzb4) + (j13 >> 26);
                long j15 = zzb9 * zzb2;
                long j16 = zzb10 * zzb;
                long j17 = j16 + j15 + (zzb8 * zzb3) + (zzb7 * zzb4) + (zzb6 * zzb5) + (j14 >> 26);
                long j18 = ((j17 >> 26) * 5) + (j11 & 67108863);
                j10 = j18 & 67108863;
                j7 = (j12 & 67108863) + (j18 >> 26);
                i3 += 16;
                j9 = j17 & 67108863;
                j8 = j14 & 67108863;
                j6 = j13 & 67108863;
                i2 = 17;
            } else {
                long j19 = j6 + (j7 >> 26);
                long j20 = j19 & 67108863;
                long j21 = j8 + (j19 >> 26);
                long j22 = j21 & 67108863;
                long j23 = j9 + (j21 >> 26);
                long j24 = j23 & 67108863;
                long j25 = ((j23 >> 26) * 5) + j10;
                long j26 = j25 & 67108863;
                long j27 = (j7 & 67108863) + (j25 >> 26);
                long j28 = j26 + 5;
                long j29 = (j28 >> 26) + j27;
                long j30 = j20 + (j29 >> 26);
                long j31 = j22 + (j30 >> 26);
                long j32 = (j24 + (j31 >> 26)) - 67108864;
                long j33 = j32 >> 63;
                long j34 = ~j33;
                long j35 = (j29 & 67108863 & j34) | (j27 & j33);
                long j36 = (j20 & j33) | (j30 & 67108863 & j34);
                long j37 = (j22 & j33) | (j31 & 67108863 & j34);
                long zzc = (((j26 & j33) | (j28 & 67108863 & j34) | (j35 << 26)) & 4294967295L) + zzc(bArr, 16);
                long zzc2 = (((j35 >> 6) | (j36 << 20)) & 4294967295L) + zzc(bArr, 20) + (zzc >> 32);
                long zzc3 = (((j36 >> 12) | (j37 << 14)) & 4294967295L) + zzc(bArr, 24) + (zzc2 >> 32);
                long zzc4 = zzc(bArr, 28);
                byte[] bArr4 = new byte[16];
                zzd(bArr4, zzc & 4294967295L, 0);
                zzd(bArr4, zzc2 & 4294967295L, 4);
                zzd(bArr4, zzc3 & 4294967295L, 8);
                zzd(bArr4, ((((((j32 & j34) | (j24 & j33)) << 8) | (j37 >> 18)) & 4294967295L) + zzc4 + (zzc3 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
        }
    }

    private static long zzb(byte[] bArr, int i2, int i3) {
        return (zzc(bArr, i2) >> i3) & 67108863;
    }

    private static long zzc(byte[] bArr, int i2) {
        return (((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16)) & 4294967295L;
    }

    private static void zzd(byte[] bArr, long j2, int i2) {
        int i3 = 0;
        while (i3 < 4) {
            bArr[i2 + i3] = (byte) (255 & j2);
            i3++;
            j2 >>= 8;
        }
    }
}
