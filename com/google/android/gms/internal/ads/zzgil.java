package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgil {
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            long[] jArr = new long[11];
            byte[] copyOf = Arrays.copyOf(bArr, 32);
            copyOf[0] = (byte) (copyOf[0] & 248);
            int i2 = copyOf[31] & Byte.MAX_VALUE;
            copyOf[31] = (byte) i2;
            copyOf[31] = (byte) (i2 | 64);
            if (bArr2.length == 32) {
                byte[] copyOf2 = Arrays.copyOf(bArr2, 32);
                copyOf2[31] = (byte) (copyOf2[31] & Byte.MAX_VALUE);
                for (int i3 = 0; i3 < 7; i3++) {
                    byte[][] bArr3 = zzghh.zza;
                    if (zzghf.zzb(bArr3[i3], copyOf2)) {
                        throw new InvalidKeyException("Banned public key: ".concat(zzgia.zza(bArr3[i3])));
                    }
                }
                long[] zzk = zzghz.zzk(copyOf2);
                long[] jArr2 = new long[19];
                long[] jArr3 = new long[19];
                jArr3[0] = 1;
                long[] jArr4 = new long[19];
                jArr4[0] = 1;
                long[] jArr5 = new long[19];
                long[] jArr6 = new long[19];
                long[] jArr7 = new long[19];
                jArr7[0] = 1;
                long[] jArr8 = new long[19];
                long[] jArr9 = new long[19];
                jArr9[0] = 1;
                System.arraycopy(zzk, 0, jArr2, 0, 10);
                int i4 = 0;
                for (int i5 = 32; i4 < i5; i5 = 32) {
                    int i6 = copyOf[(32 - i4) - 1] & 255;
                    int i7 = 0;
                    while (i7 < 8) {
                        int i8 = (i6 >> (7 - i7)) & 1;
                        zzghh.zza(jArr4, jArr2, i8);
                        zzghh.zza(jArr5, jArr3, i8);
                        byte[] bArr4 = copyOf;
                        long[] copyOf3 = Arrays.copyOf(jArr4, 10);
                        int i9 = i6;
                        long[] jArr10 = new long[19];
                        long[] jArr11 = jArr;
                        long[] jArr12 = new long[19];
                        int i10 = i4;
                        long[] jArr13 = new long[19];
                        int i11 = i7;
                        long[] jArr14 = new long[19];
                        long[] jArr15 = new long[19];
                        long[] jArr16 = jArr9;
                        long[] jArr17 = new long[19];
                        long[] jArr18 = new long[19];
                        zzghz.zzi(jArr4, jArr4, jArr5);
                        zzghz.zzh(jArr5, copyOf3, jArr5);
                        long[] copyOf4 = Arrays.copyOf(jArr2, 10);
                        zzghz.zzi(jArr2, jArr2, jArr3);
                        zzghz.zzh(jArr3, copyOf4, jArr3);
                        zzghz.zzb(jArr14, jArr2, jArr5);
                        zzghz.zzb(jArr15, jArr4, jArr3);
                        zzghz.zze(jArr14);
                        zzghz.zzd(jArr14);
                        zzghz.zze(jArr15);
                        zzghz.zzd(jArr15);
                        long[] jArr19 = jArr2;
                        System.arraycopy(jArr14, 0, copyOf4, 0, 10);
                        zzghz.zzi(jArr14, jArr14, jArr15);
                        zzghz.zzh(jArr15, copyOf4, jArr15);
                        zzghz.zzg(jArr18, jArr14);
                        zzghz.zzg(jArr17, jArr15);
                        zzghz.zzb(jArr15, jArr17, zzk);
                        zzghz.zze(jArr15);
                        zzghz.zzd(jArr15);
                        System.arraycopy(jArr18, 0, jArr6, 0, 10);
                        System.arraycopy(jArr15, 0, jArr7, 0, 10);
                        zzghz.zzg(jArr12, jArr4);
                        zzghz.zzg(jArr13, jArr5);
                        zzghz.zzb(jArr8, jArr12, jArr13);
                        zzghz.zze(jArr8);
                        zzghz.zzd(jArr8);
                        zzghz.zzh(jArr13, jArr12, jArr13);
                        Arrays.fill(jArr10, 10, 18, 0L);
                        zzghz.zzf(jArr10, jArr13, 121665L);
                        zzghz.zzd(jArr10);
                        zzghz.zzi(jArr10, jArr10, jArr12);
                        zzghz.zzb(jArr16, jArr13, jArr10);
                        zzghz.zze(jArr16);
                        zzghz.zzd(jArr16);
                        zzghh.zza(jArr8, jArr6, i8);
                        zzghh.zza(jArr16, jArr7, i8);
                        i7 = i11 + 1;
                        jArr9 = jArr5;
                        jArr2 = jArr6;
                        i6 = i9;
                        jArr = jArr11;
                        i4 = i10;
                        jArr6 = jArr19;
                        jArr5 = jArr16;
                        copyOf = bArr4;
                        long[] jArr20 = jArr4;
                        jArr4 = jArr8;
                        jArr8 = jArr20;
                        long[] jArr21 = jArr7;
                        jArr7 = jArr3;
                        jArr3 = jArr21;
                    }
                    i4++;
                    copyOf = copyOf;
                }
                long[] jArr22 = jArr;
                long[] jArr23 = new long[10];
                long[] jArr24 = new long[10];
                long[] jArr25 = new long[10];
                long[] jArr26 = new long[10];
                long[] jArr27 = new long[10];
                long[] jArr28 = new long[10];
                long[] jArr29 = new long[10];
                long[] jArr30 = new long[10];
                long[] jArr31 = new long[10];
                long[] jArr32 = new long[10];
                long[] jArr33 = jArr2;
                long[] jArr34 = new long[10];
                zzghz.zzg(jArr24, jArr5);
                zzghz.zzg(jArr34, jArr24);
                zzghz.zzg(jArr32, jArr34);
                zzghz.zza(jArr25, jArr32, jArr5);
                zzghz.zza(jArr26, jArr25, jArr24);
                zzghz.zzg(jArr32, jArr26);
                zzghz.zza(jArr27, jArr32, jArr25);
                zzghz.zzg(jArr32, jArr27);
                zzghz.zzg(jArr34, jArr32);
                zzghz.zzg(jArr32, jArr34);
                zzghz.zzg(jArr34, jArr32);
                zzghz.zzg(jArr32, jArr34);
                zzghz.zza(jArr28, jArr32, jArr27);
                zzghz.zzg(jArr32, jArr28);
                zzghz.zzg(jArr34, jArr32);
                for (int i12 = 2; i12 < 10; i12 += 2) {
                    zzghz.zzg(jArr32, jArr34);
                    zzghz.zzg(jArr34, jArr32);
                }
                zzghz.zza(jArr29, jArr34, jArr28);
                zzghz.zzg(jArr32, jArr29);
                zzghz.zzg(jArr34, jArr32);
                for (int i13 = 2; i13 < 20; i13 += 2) {
                    zzghz.zzg(jArr32, jArr34);
                    zzghz.zzg(jArr34, jArr32);
                }
                zzghz.zza(jArr32, jArr34, jArr29);
                zzghz.zzg(jArr34, jArr32);
                zzghz.zzg(jArr32, jArr34);
                for (int i14 = 2; i14 < 10; i14 += 2) {
                    zzghz.zzg(jArr34, jArr32);
                    zzghz.zzg(jArr32, jArr34);
                }
                zzghz.zza(jArr30, jArr32, jArr28);
                zzghz.zzg(jArr32, jArr30);
                zzghz.zzg(jArr34, jArr32);
                for (int i15 = 2; i15 < 50; i15 += 2) {
                    zzghz.zzg(jArr32, jArr34);
                    zzghz.zzg(jArr34, jArr32);
                }
                zzghz.zza(jArr31, jArr34, jArr30);
                zzghz.zzg(jArr34, jArr31);
                zzghz.zzg(jArr32, jArr34);
                for (int i16 = 2; i16 < 100; i16 += 2) {
                    zzghz.zzg(jArr34, jArr32);
                    zzghz.zzg(jArr32, jArr34);
                }
                zzghz.zza(jArr34, jArr32, jArr31);
                zzghz.zzg(jArr32, jArr34);
                zzghz.zzg(jArr34, jArr32);
                for (int i17 = 2; i17 < 50; i17 += 2) {
                    zzghz.zzg(jArr32, jArr34);
                    zzghz.zzg(jArr34, jArr32);
                }
                zzghz.zza(jArr32, jArr34, jArr30);
                zzghz.zzg(jArr34, jArr32);
                zzghz.zzg(jArr32, jArr34);
                zzghz.zzg(jArr34, jArr32);
                zzghz.zzg(jArr32, jArr34);
                zzghz.zzg(jArr34, jArr32);
                zzghz.zza(jArr23, jArr34, jArr26);
                zzghz.zza(jArr22, jArr4, jArr23);
                long[] jArr35 = new long[10];
                long[] jArr36 = new long[10];
                long[] jArr37 = new long[11];
                long[] jArr38 = new long[11];
                long[] jArr39 = new long[11];
                zzghz.zza(jArr35, zzk, jArr22);
                zzghz.zzi(jArr36, zzk, jArr22);
                long[] jArr40 = new long[10];
                jArr40[0] = 486662;
                zzghz.zzi(jArr38, jArr36, jArr40);
                zzghz.zza(jArr38, jArr38, jArr3);
                zzghz.zzi(jArr38, jArr38, jArr33);
                zzghz.zza(jArr38, jArr38, jArr35);
                zzghz.zza(jArr38, jArr38, jArr33);
                zzghz.zzf(jArr37, jArr38, 4L);
                zzghz.zzd(jArr37);
                zzghz.zza(jArr38, jArr35, jArr3);
                zzghz.zzh(jArr38, jArr38, jArr3);
                zzghz.zza(jArr39, jArr36, jArr33);
                zzghz.zzi(jArr38, jArr38, jArr39);
                zzghz.zzg(jArr38, jArr38);
                if (zzghf.zzb(zzghz.zzj(jArr37), zzghz.zzj(jArr38))) {
                    return zzghz.zzj(jArr22);
                }
                throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(zzgia.zza(bArr2)));
            }
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    public static byte[] zzb() {
        byte[] zza = zzgii.zza(32);
        zza[0] = (byte) (zza[0] | 7);
        int i2 = zza[31] & 63;
        zza[31] = (byte) i2;
        zza[31] = (byte) (i2 | 128);
        return zza;
    }

    public static byte[] zzc(byte[] bArr) {
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            bArr2[0] = 9;
            return zza(bArr, bArr2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }
}
