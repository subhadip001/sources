package com.google.android.gms.internal.ads;

import com.google.logging.type.LogSeverity;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzow {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final short[] zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzm;
    private short[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;

    public zzow(int i2, int i3, float f2, float f3, int i4) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = f2;
        this.zzd = f3;
        this.zze = i2 / i4;
        this.zzf = i2 / LogSeverity.WARNING_VALUE;
        int i5 = i2 / 65;
        this.zzg = i5;
        int i6 = i5 + i5;
        this.zzh = i6;
        this.zzi = new short[i6];
        int i7 = i6 * i3;
        this.zzj = new short[i7];
        this.zzl = new short[i7];
        this.zzn = new short[i7];
    }

    private final int zzg(short[] sArr, int i2, int i3, int i4) {
        int i5 = i2 * this.zzb;
        int i6 = 1;
        int i7 = 255;
        int i8 = 0;
        int i9 = 0;
        while (i3 <= i4) {
            int i10 = 0;
            for (int i11 = 0; i11 < i3; i11++) {
                i10 += Math.abs(sArr[i5 + i11] - sArr[(i5 + i3) + i11]);
            }
            int i12 = i10 * i8;
            int i13 = i6 * i3;
            if (i12 < i13) {
                i6 = i10;
            }
            if (i12 < i13) {
                i8 = i3;
            }
            int i14 = i10 * i7;
            int i15 = i9 * i3;
            if (i14 > i15) {
                i9 = i10;
            }
            if (i14 > i15) {
                i7 = i3;
            }
            i3++;
        }
        this.zzu = i6 / i8;
        this.zzv = i9 / i7;
        return i8;
    }

    private final void zzh(short[] sArr, int i2, int i3) {
        short[] zzl = zzl(this.zzl, this.zzm, i3);
        this.zzl = zzl;
        int i4 = this.zzb;
        System.arraycopy(sArr, i2 * i4, zzl, this.zzm * i4, i4 * i3);
        this.zzm += i3;
    }

    private final void zzi(short[] sArr, int i2, int i3) {
        int i4 = this.zzh / i3;
        int i5 = this.zzb;
        int i6 = i3 * i5;
        int i7 = i2 * i5;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                i9 += sArr[(i8 * i6) + i7 + i10];
            }
            this.zzi[i8] = (short) (i9 / i6);
        }
    }

    private static void zzj(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i4 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i5 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                sArr[i8] = (short) (((sArr3[i9] * i11) + ((i2 - i11) * sArr2[i10])) / i2);
                i8 += i3;
                i10 += i3;
                i9 += i3;
            }
        }
    }

    private final void zzk() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = this.zzm;
        float f2 = this.zzc;
        float f3 = this.zzd;
        float f4 = f2 / f3;
        float f5 = this.zze * f3;
        double d2 = f4;
        float f6 = 1.0f;
        int i11 = 1;
        if (d2 <= 1.00001d && d2 >= 0.99999d) {
            zzh(this.zzj, 0, this.zzk);
            this.zzk = 0;
        } else {
            int i12 = this.zzk;
            if (i12 >= this.zzh) {
                int i13 = 0;
                while (true) {
                    int i14 = this.zzr;
                    if (i14 > 0) {
                        int min = Math.min(this.zzh, i14);
                        zzh(this.zzj, i13, min);
                        this.zzr -= min;
                        i13 += min;
                    } else {
                        short[] sArr = this.zzj;
                        int i15 = this.zza;
                        int i16 = i15 > 4000 ? i15 / 4000 : 1;
                        if (this.zzb == i11 && i16 == i11) {
                            i2 = zzg(sArr, i13, this.zzf, this.zzg);
                        } else {
                            zzi(sArr, i13, i16);
                            int zzg = zzg(this.zzi, 0, this.zzf / i16, this.zzg / i16);
                            if (i16 != i11) {
                                int i17 = zzg * i16;
                                int i18 = i16 * 4;
                                int i19 = i17 - i18;
                                int i20 = i17 + i18;
                                int i21 = this.zzf;
                                if (i19 < i21) {
                                    i19 = i21;
                                }
                                int i22 = this.zzg;
                                if (i20 > i22) {
                                    i20 = i22;
                                }
                                if (this.zzb == i11) {
                                    i2 = zzg(sArr, i13, i19, i20);
                                } else {
                                    zzi(sArr, i13, i11);
                                    i2 = zzg(this.zzi, 0, i19, i20);
                                }
                            } else {
                                i2 = zzg;
                            }
                        }
                        int i23 = this.zzu;
                        int i24 = (i23 == 0 || (i5 = this.zzs) == 0 || this.zzv > i23 * 3 || i23 + i23 <= this.zzt * 3) ? i2 : i5;
                        this.zzt = i23;
                        this.zzs = i2;
                        if (d2 > 1.0d) {
                            short[] sArr2 = this.zzj;
                            if (f4 >= 2.0f) {
                                i4 = (int) (i24 / ((-1.0f) + f4));
                            } else {
                                this.zzr = (int) (((2.0f - f4) * i24) / ((-1.0f) + f4));
                                i4 = i24;
                            }
                            short[] zzl = zzl(this.zzl, this.zzm, i4);
                            this.zzl = zzl;
                            int i25 = i4;
                            zzj(i4, this.zzb, zzl, this.zzm, sArr2, i13, sArr2, i13 + i24);
                            this.zzm += i25;
                            i13 = i24 + i25 + i13;
                        } else {
                            int i26 = i24;
                            short[] sArr3 = this.zzj;
                            if (f4 < 0.5f) {
                                i3 = (int) ((i26 * f4) / (f6 - f4));
                            } else {
                                this.zzr = (int) ((((f4 + f4) - 1.0f) * i26) / (f6 - f4));
                                i3 = i26;
                            }
                            int i27 = i26 + i3;
                            short[] zzl2 = zzl(this.zzl, this.zzm, i27);
                            this.zzl = zzl2;
                            int i28 = this.zzb;
                            System.arraycopy(sArr3, i13 * i28, zzl2, this.zzm * i28, i28 * i26);
                            zzj(i3, this.zzb, this.zzl, this.zzm + i26, sArr3, i13 + i26, sArr3, i13);
                            this.zzm += i27;
                            i13 += i3;
                        }
                    }
                    if (this.zzh + i13 > i12) {
                        break;
                    }
                    f6 = 1.0f;
                    i11 = 1;
                }
                int i29 = this.zzk - i13;
                short[] sArr4 = this.zzj;
                int i30 = this.zzb;
                System.arraycopy(sArr4, i13 * i30, sArr4, 0, i30 * i29);
                this.zzk = i29;
                f6 = 1.0f;
            }
        }
        if (f5 == f6 || this.zzm == i10) {
            return;
        }
        int i31 = this.zza;
        int i32 = (int) (i31 / f5);
        while (true) {
            if (i32 <= 16384 && i31 <= 16384) {
                break;
            }
            i32 /= 2;
            i31 /= 2;
        }
        int i33 = this.zzm - i10;
        short[] zzl3 = zzl(this.zzn, this.zzo, i33);
        this.zzn = zzl3;
        short[] sArr5 = this.zzl;
        int i34 = this.zzb;
        System.arraycopy(sArr5, i10 * i34, zzl3, this.zzo * i34, i34 * i33);
        this.zzm = i10;
        this.zzo += i33;
        int i35 = 0;
        while (true) {
            i6 = this.zzo;
            i7 = i6 - 1;
            if (i35 >= i7) {
                break;
            }
            while (true) {
                i8 = this.zzp + 1;
                i9 = this.zzq;
                if (i8 * i32 <= i9 * i31) {
                    break;
                }
                this.zzl = zzl(this.zzl, this.zzm, 1);
                int i36 = 0;
                while (true) {
                    int i37 = this.zzb;
                    if (i36 < i37) {
                        short[] sArr6 = this.zzl;
                        int i38 = this.zzm;
                        short[] sArr7 = this.zzn;
                        int i39 = (i35 * i37) + i36;
                        short s = sArr7[i39];
                        short s2 = sArr7[i39 + i37];
                        int i40 = this.zzq;
                        int i41 = this.zzp;
                        int i42 = (i41 + 1) * i32;
                        int i43 = i42 - (i40 * i31);
                        int i44 = i42 - (i41 * i32);
                        sArr6[(i38 * i37) + i36] = (short) ((((i44 - i43) * s2) + (s * i43)) / i44);
                        i36++;
                    }
                }
                this.zzq++;
                this.zzm++;
            }
            this.zzp = i8;
            if (i8 == i31) {
                this.zzp = 0;
                zzcw.zzf(i9 == i32);
                this.zzq = 0;
            }
            i35++;
        }
        if (i7 != 0) {
            short[] sArr8 = this.zzn;
            int i45 = this.zzb;
            System.arraycopy(sArr8, i7 * i45, sArr8, 0, (i6 - i7) * i45);
            this.zzo -= i7;
        }
    }

    private final short[] zzl(short[] sArr, int i2, int i3) {
        int length = sArr.length;
        int i4 = this.zzb;
        int i5 = length / i4;
        return i2 + i3 <= i5 ? sArr : Arrays.copyOf(sArr, (((i5 * 3) / 2) + i3) * i4);
    }

    public final int zza() {
        int i2 = this.zzm * this.zzb;
        return i2 + i2;
    }

    public final int zzb() {
        int i2 = this.zzk * this.zzb;
        return i2 + i2;
    }

    public final void zzc() {
        this.zzk = 0;
        this.zzm = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
    }

    public final void zzd(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.zzb, this.zzm);
        shortBuffer.put(this.zzl, 0, this.zzb * min);
        int i2 = this.zzm - min;
        this.zzm = i2;
        short[] sArr = this.zzl;
        int i3 = this.zzb;
        System.arraycopy(sArr, min * i3, sArr, 0, i2 * i3);
    }

    public final void zze() {
        int i2;
        int i3 = this.zzk;
        float f2 = this.zzc;
        float f3 = this.zzd;
        int i4 = this.zzm + ((int) ((((i3 / (f2 / f3)) + this.zzo) / (this.zze * f3)) + 0.5f));
        short[] sArr = this.zzj;
        int i5 = this.zzh;
        this.zzj = zzl(sArr, i3, i5 + i5 + i3);
        int i6 = 0;
        while (true) {
            int i7 = this.zzh;
            i2 = i7 + i7;
            int i8 = this.zzb;
            if (i6 >= i2 * i8) {
                break;
            }
            this.zzj[(i8 * i3) + i6] = 0;
            i6++;
        }
        this.zzk += i2;
        zzk();
        if (this.zzm > i4) {
            this.zzm = i4;
        }
        this.zzk = 0;
        this.zzr = 0;
        this.zzo = 0;
    }

    public final void zzf(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i2 = this.zzb;
        int i3 = remaining / i2;
        int i4 = i2 * i3;
        short[] zzl = zzl(this.zzj, this.zzk, i3);
        this.zzj = zzl;
        shortBuffer.get(zzl, this.zzk * this.zzb, (i4 + i4) / 2);
        this.zzk += i3;
        zzk();
    }
}
