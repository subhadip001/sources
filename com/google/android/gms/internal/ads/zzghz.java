package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzghz {
    private static final int[] zza = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] zzb = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] zzc = {67108863, 33554431};
    private static final int[] zzd = {26, 25};

    public static void zza(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        zzb(jArr4, jArr2, jArr3);
        zzc(jArr4, jArr);
    }

    public static void zzb(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        jArr[1] = (jArr2[1] * jArr3[0]) + (jArr2[0] * jArr3[1]);
        long j2 = jArr2[1];
        jArr[2] = (jArr2[2] * jArr3[0]) + (jArr2[0] * jArr3[2]) + ((j2 + j2) * jArr3[1]);
        jArr[3] = (jArr2[3] * jArr3[0]) + (jArr2[0] * jArr3[3]) + (jArr2[2] * jArr3[1]) + (jArr2[1] * jArr3[2]);
        long j3 = jArr2[2];
        long j4 = jArr3[2];
        long j5 = (jArr2[3] * jArr3[1]) + (jArr2[1] * jArr3[3]);
        jArr[4] = (jArr2[4] * jArr3[0]) + (jArr2[0] * jArr3[4]) + j5 + j5 + (j3 * j4);
        jArr[5] = (jArr2[5] * jArr3[0]) + (jArr2[0] * jArr3[5]) + (jArr2[4] * jArr3[1]) + (jArr2[1] * jArr3[4]) + (jArr2[3] * jArr3[2]) + (jArr2[2] * jArr3[3]);
        long j6 = (jArr2[5] * jArr3[1]) + (jArr2[1] * jArr3[5]) + (jArr2[3] * jArr3[3]);
        jArr[6] = (jArr2[6] * jArr3[0]) + (jArr2[0] * jArr3[6]) + (jArr2[4] * jArr3[2]) + (jArr2[2] * jArr3[4]) + j6 + j6;
        jArr[7] = (jArr2[7] * jArr3[0]) + (jArr2[0] * jArr3[7]) + (jArr2[6] * jArr3[1]) + (jArr2[1] * jArr3[6]) + (jArr2[5] * jArr3[2]) + (jArr2[2] * jArr3[5]) + (jArr2[4] * jArr3[3]) + (jArr2[3] * jArr3[4]);
        long j7 = jArr2[4];
        long j8 = jArr3[4];
        long j9 = (jArr2[7] * jArr3[1]) + (jArr2[1] * jArr3[7]) + (jArr2[5] * jArr3[3]) + (jArr2[3] * jArr3[5]);
        long j10 = j9 + j9 + (j7 * j8);
        jArr[8] = (jArr2[8] * jArr3[0]) + (jArr2[0] * jArr3[8]) + (jArr2[6] * jArr3[2]) + (jArr2[2] * jArr3[6]) + j10;
        jArr[9] = (jArr2[9] * jArr3[0]) + (jArr2[0] * jArr3[9]) + (jArr2[8] * jArr3[1]) + (jArr2[1] * jArr3[8]) + (jArr2[7] * jArr3[2]) + (jArr2[2] * jArr3[7]) + (jArr2[6] * jArr3[3]) + (jArr2[3] * jArr3[6]) + (jArr2[5] * jArr3[4]) + (jArr2[4] * jArr3[5]);
        long j11 = (jArr2[9] * jArr3[1]) + (jArr2[1] * jArr3[9]) + (jArr2[7] * jArr3[3]) + (jArr2[3] * jArr3[7]) + (jArr2[5] * jArr3[5]);
        jArr[10] = (jArr2[8] * jArr3[2]) + (jArr2[2] * jArr3[8]) + (jArr2[6] * jArr3[4]) + (jArr2[4] * jArr3[6]) + j11 + j11;
        jArr[11] = (jArr2[9] * jArr3[2]) + (jArr2[2] * jArr3[9]) + (jArr2[8] * jArr3[3]) + (jArr2[3] * jArr3[8]) + (jArr2[7] * jArr3[4]) + (jArr2[4] * jArr3[7]) + (jArr2[6] * jArr3[5]) + (jArr2[5] * jArr3[6]);
        long j12 = jArr2[6];
        long j13 = jArr3[6];
        long j14 = (jArr2[9] * jArr3[3]) + (jArr2[3] * jArr3[9]) + (jArr2[7] * jArr3[5]) + (jArr2[5] * jArr3[7]);
        long j15 = j14 + j14 + (j12 * j13);
        jArr[12] = (jArr2[8] * jArr3[4]) + (jArr2[4] * jArr3[8]) + j15;
        jArr[13] = (jArr2[9] * jArr3[4]) + (jArr2[4] * jArr3[9]) + (jArr2[8] * jArr3[5]) + (jArr2[5] * jArr3[8]) + (jArr2[7] * jArr3[6]) + (jArr2[6] * jArr3[7]);
        long j16 = (jArr2[9] * jArr3[5]) + (jArr2[5] * jArr3[9]) + (jArr2[7] * jArr3[7]);
        jArr[14] = (jArr2[8] * jArr3[6]) + (jArr2[6] * jArr3[8]) + j16 + j16;
        jArr[15] = (jArr2[9] * jArr3[6]) + (jArr2[6] * jArr3[9]) + (jArr2[8] * jArr3[7]) + (jArr2[7] * jArr3[8]);
        long j17 = jArr2[8] * jArr3[8];
        long j18 = (jArr2[9] * jArr3[7]) + (jArr2[7] * jArr3[9]);
        jArr[16] = j18 + j18 + j17;
        jArr[17] = (jArr2[9] * jArr3[8]) + (jArr2[8] * jArr3[9]);
        long j19 = jArr2[9];
        jArr[18] = (j19 + j19) * jArr3[9];
    }

    public static void zzc(long[] jArr, long[] jArr2) {
        zze(jArr);
        zzd(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void zzd(long[] jArr) {
        jArr[10] = 0;
        int i2 = 0;
        while (i2 < 10) {
            long j2 = jArr[i2];
            long j3 = j2 / 67108864;
            jArr[i2] = j2 - (j3 << 26);
            int i3 = i2 + 1;
            long j4 = jArr[i3] + j3;
            jArr[i3] = j4;
            long j5 = j4 / 33554432;
            jArr[i3] = j4 - (j5 << 25);
            i2 += 2;
            jArr[i2] = jArr[i2] + j5;
        }
        long j6 = jArr[0] + (jArr[10] << 4);
        jArr[0] = j6;
        long j7 = jArr[10];
        long j8 = j7 + j7 + j6;
        jArr[0] = j8;
        jArr[0] = j8 + jArr[10];
        jArr[10] = 0;
        long j9 = jArr[0];
        long j10 = j9 / 67108864;
        jArr[0] = j9 - (j10 << 26);
        jArr[1] = jArr[1] + j10;
    }

    public static void zze(long[] jArr) {
        long j2 = jArr[8] + (jArr[18] << 4);
        jArr[8] = j2;
        long j3 = jArr[18];
        long j4 = j3 + j3 + j2;
        jArr[8] = j4;
        jArr[8] = j4 + jArr[18];
        long j5 = jArr[7] + (jArr[17] << 4);
        jArr[7] = j5;
        long j6 = jArr[17];
        long j7 = j6 + j6 + j5;
        jArr[7] = j7;
        jArr[7] = j7 + jArr[17];
        long j8 = jArr[6] + (jArr[16] << 4);
        jArr[6] = j8;
        long j9 = jArr[16];
        long j10 = j9 + j9 + j8;
        jArr[6] = j10;
        jArr[6] = j10 + jArr[16];
        long j11 = jArr[5] + (jArr[15] << 4);
        jArr[5] = j11;
        long j12 = jArr[15];
        long j13 = j12 + j12 + j11;
        jArr[5] = j13;
        jArr[5] = j13 + jArr[15];
        long j14 = jArr[4] + (jArr[14] << 4);
        jArr[4] = j14;
        long j15 = jArr[14];
        long j16 = j15 + j15 + j14;
        jArr[4] = j16;
        jArr[4] = j16 + jArr[14];
        long j17 = jArr[3] + (jArr[13] << 4);
        jArr[3] = j17;
        long j18 = jArr[13];
        long j19 = j18 + j18 + j17;
        jArr[3] = j19;
        jArr[3] = j19 + jArr[13];
        long j20 = jArr[2] + (jArr[12] << 4);
        jArr[2] = j20;
        long j21 = jArr[12];
        long j22 = j21 + j21 + j20;
        jArr[2] = j22;
        jArr[2] = j22 + jArr[12];
        long j23 = jArr[1] + (jArr[11] << 4);
        jArr[1] = j23;
        long j24 = jArr[11];
        long j25 = j24 + j24 + j23;
        jArr[1] = j25;
        jArr[1] = j25 + jArr[11];
        long j26 = jArr[0] + (jArr[10] << 4);
        jArr[0] = j26;
        long j27 = jArr[10];
        long j28 = j27 + j27 + j26;
        jArr[0] = j28;
        jArr[0] = j28 + jArr[10];
    }

    public static void zzf(long[] jArr, long[] jArr2, long j2) {
        for (int i2 = 0; i2 < 10; i2++) {
            jArr[i2] = jArr2[i2] * j2;
        }
    }

    public static void zzg(long[] jArr, long[] jArr2) {
        long j2 = jArr2[0];
        long j3 = jArr2[0];
        long j4 = jArr2[1];
        long j5 = (jArr2[0] * jArr2[2]) + (j4 * j4);
        long j6 = (jArr2[0] * jArr2[3]) + (jArr2[1] * jArr2[2]);
        long j7 = jArr2[2];
        long j8 = jArr2[1];
        long j9 = jArr2[3];
        long j10 = jArr2[0];
        long j11 = j8 * 4 * j9;
        long j12 = (j10 + j10) * jArr2[4];
        long j13 = (jArr2[0] * jArr2[5]) + (jArr2[1] * jArr2[4]) + (jArr2[2] * jArr2[3]);
        long j14 = jArr2[3];
        long j15 = jArr2[2];
        long j16 = jArr2[4];
        long j17 = jArr2[0];
        long j18 = jArr2[6];
        long j19 = jArr2[1];
        long j20 = (j19 + j19) * jArr2[5];
        long j21 = j20 + (j17 * j18) + (j15 * j16) + (j14 * j14);
        long j22 = (jArr2[0] * jArr2[7]) + (jArr2[1] * jArr2[6]) + (jArr2[2] * jArr2[5]) + (jArr2[3] * jArr2[4]);
        long j23 = jArr2[4];
        long j24 = jArr2[2];
        long j25 = jArr2[6];
        long j26 = jArr2[0];
        long j27 = jArr2[8];
        long j28 = (jArr2[3] * jArr2[5]) + (jArr2[1] * jArr2[7]);
        long j29 = j28 + j28 + (j26 * j27) + (j24 * j25);
        long j30 = j29 + j29;
        long j31 = (jArr2[0] * jArr2[9]) + (jArr2[1] * jArr2[8]) + (jArr2[2] * jArr2[7]) + (jArr2[3] * jArr2[6]) + (jArr2[4] * jArr2[5]);
        long j32 = jArr2[5];
        long j33 = jArr2[4];
        long j34 = jArr2[6];
        long j35 = jArr2[2];
        long j36 = jArr2[8];
        long j37 = (jArr2[1] * jArr2[9]) + (jArr2[3] * jArr2[7]);
        long j38 = j37 + j37;
        long j39 = j38 + (j35 * j36) + (j33 * j34) + (j32 * j32);
        long j40 = (jArr2[2] * jArr2[9]) + (jArr2[3] * jArr2[8]) + (jArr2[4] * jArr2[7]) + (jArr2[5] * jArr2[6]);
        long j41 = jArr2[6];
        long j42 = jArr2[4];
        long j43 = jArr2[8];
        long j44 = (jArr2[3] * jArr2[9]) + (jArr2[5] * jArr2[7]);
        long j45 = j44 + j44 + (j42 * j43);
        long j46 = (jArr2[4] * jArr2[9]) + (jArr2[5] * jArr2[8]) + (jArr2[6] * jArr2[7]);
        long j47 = jArr2[7];
        long j48 = jArr2[6];
        long j49 = jArr2[8];
        long j50 = jArr2[5];
        long j51 = ((j50 + j50) * jArr2[9]) + (j48 * j49) + (j47 * j47);
        long j52 = (jArr2[6] * jArr2[9]) + (jArr2[7] * jArr2[8]);
        long j53 = jArr2[8];
        long j54 = jArr2[7] * 4 * jArr2[9];
        long j55 = jArr2[8];
        long j56 = jArr2[9];
        zzc(new long[]{j2 * j2, (j3 + j3) * jArr2[1], j5 + j5, j6 + j6, j12 + j11 + (j7 * j7), j13 + j13, j21 + j21, j22 + j22, j30 + (j23 * j23), j31 + j31, j39 + j39, j40 + j40, j45 + j45 + (j41 * j41), j46 + j46, j51 + j51, j52 + j52, j54 + (j53 * j53), (j55 + j55) * jArr2[9], (j56 + j56) * j56}, jArr);
    }

    public static void zzh(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < 10; i2++) {
            jArr[i2] = jArr2[i2] - jArr3[i2];
        }
    }

    public static void zzi(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < 10; i2++) {
            jArr[i2] = jArr2[i2] + jArr3[i2];
        }
    }

    public static byte[] zzj(long[] jArr) {
        int i2;
        long j2;
        long j3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        for (int i9 = 0; i9 < 2; i9++) {
            int i10 = 0;
            while (i10 < 9) {
                long j4 = copyOf[i10];
                copyOf[i10] = j4 + (i8 << i7);
                i10++;
                copyOf[i10] = copyOf[i10] - (-((int) (((j4 >> 31) & j4) >> zzd[i10 & 1])));
            }
            long j5 = copyOf[9];
            int i11 = -((int) (((j5 >> 31) & j5) >> 25));
            copyOf[9] = j5 + (i11 << 25);
            copyOf[0] = copyOf[0] - (i11 * 19);
        }
        long j6 = copyOf[0];
        copyOf[0] = j6 + (i2 << 26);
        copyOf[1] = copyOf[1] - (-((int) (((j6 >> 31) & j6) >> 26)));
        for (int i12 = 0; i12 < 2; i12++) {
            int i13 = 0;
            while (i13 < 9) {
                long j7 = copyOf[i13];
                int i14 = zzd[i13 & 1];
                copyOf[i13] = zzc[i6] & j7;
                i13++;
                copyOf[i13] = copyOf[i13] + ((int) (j7 >> i14));
            }
        }
        copyOf[9] = 33554431 & copyOf[9];
        copyOf[0] = copyOf[0] + (((int) (j2 >> 25)) * 19);
        int i15 = ~((((int) j3) - 67108845) >> 31);
        for (int i16 = 1; i16 < 10; i16++) {
            int i17 = ~(((int) copyOf[i16]) ^ zzc[i16 & 1]);
            int i18 = i17 & (i17 << 16);
            int i19 = i18 & (i18 << 8);
            int i20 = i19 & (i19 << 4);
            int i21 = i20 & (i20 << 2);
            i15 &= (i21 & (i21 + i21)) >> 31;
        }
        copyOf[0] = copyOf[0] - (67108845 & i15);
        long j8 = 33554431 & i15;
        copyOf[1] = copyOf[1] - j8;
        for (int i22 = 2; i22 < 10; i22 += 2) {
            copyOf[i22] = copyOf[i22] - (67108863 & i15);
            int i23 = i22 + 1;
            copyOf[i23] = copyOf[i23] - j8;
        }
        for (int i24 = 0; i24 < 10; i24++) {
            copyOf[i24] = copyOf[i24] << zzb[i24];
        }
        byte[] bArr = new byte[32];
        for (int i25 = 0; i25 < 10; i25++) {
            int[] iArr = zza;
            int i26 = iArr[i25];
            byte b = bArr[i26];
            long j9 = copyOf[i25];
            bArr[i26] = (byte) (b | (j9 & 255));
            bArr[iArr[i25] + 1] = (byte) (bArr[i3] | ((j9 >> 8) & 255));
            bArr[iArr[i25] + 2] = (byte) (bArr[i4] | ((j9 >> 16) & 255));
            bArr[iArr[i25] + 3] = (byte) (bArr[i5] | ((j9 >> 24) & 255));
        }
        return bArr;
    }

    public static long[] zzk(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i2 = 0; i2 < 10; i2++) {
            int i3 = zza[i2];
            jArr[i2] = (((((bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8)) | ((bArr[i3 + 2] & 255) << 16)) | ((bArr[i3 + 3] & 255) << 24)) >> zzb[i2]) & zzc[i2 & 1];
        }
        return jArr;
    }
}
