package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzzp {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        zzcw.zzf(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            zze(zArr);
            return i2 - 3;
        } else if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            zze(zArr);
            return i2 - 2;
        } else if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            zze(zArr);
            return i2 - 1;
        } else {
            int i5 = i3 - 1;
            int i6 = i2 + 2;
            while (i6 < i5) {
                byte b = bArr[i6];
                if ((b & 254) == 0) {
                    int i7 = i6 - 2;
                    if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b == 1) {
                        zze(zArr);
                        return i7;
                    }
                    i6 = i7;
                }
                i6 += 3;
            }
            zArr[0] = i4 <= 2 ? !(i4 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i5] == 1;
            zArr[1] = i4 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i3 + (-2)] == 0 && bArr[i5] == 0;
            zArr[2] = bArr[i5] == 0;
            return i3;
        }
    }

    public static int zzb(byte[] bArr, int i2) {
        int i3;
        synchronized (zzc) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    if (i4 >= i2 - 2) {
                        i4 = i2;
                        break;
                    }
                    try {
                        if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 3) {
                            break;
                        }
                        i4++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i4 < i2) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i5) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = zzd[i8] - i6;
                System.arraycopy(bArr, i6, bArr, i7, i9);
                int i10 = i7 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i7 = i11 + 1;
                bArr[i11] = 0;
                i6 += i9 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i7, i3 - i7);
        }
        return i3;
    }

    public static zzzn zzc(byte[] bArr, int i2, int i3) {
        zzzr zzzrVar = new zzzr(bArr, 4, i3);
        int zzc2 = zzzrVar.zzc();
        int zzc3 = zzzrVar.zzc();
        zzzrVar.zzd();
        return new zzzn(zzc2, zzc3, zzzrVar.zzf());
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzzo zzd(byte[] r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzp.zzd(byte[], int, int):com.google.android.gms.internal.ads.zzzo");
    }

    public static void zze(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
