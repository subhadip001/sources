package com.google.android.gms.internal.ads;

import com.google.logging.type.LogSeverity;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzatg {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final int zze;
    private final short[] zzf;
    private int zzg;
    private short[] zzh;
    private int zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzv;
    private int zzw;
    private int zzx;
    private int zzm = 0;
    private int zzn = 0;
    private int zzu = 0;
    private float zzo = 1.0f;
    private float zzp = 1.0f;

    public zzatg(int i2, int i3) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i2 / LogSeverity.WARNING_VALUE;
        int i4 = i2 / 65;
        this.zzd = i4;
        int i5 = i4 + i4;
        this.zze = i5;
        this.zzf = new short[i5];
        this.zzg = i5;
        int i6 = i3 * i5;
        this.zzh = new short[i6];
        this.zzi = i5;
        this.zzj = new short[i6];
        this.zzk = i5;
        this.zzl = new short[i6];
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
                short s = sArr[i5 + i11];
                short s2 = sArr[i5 + i3 + i11];
                i10 += s >= s2 ? s - s2 : s2 - s;
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
        this.zzw = i6 / i8;
        this.zzx = i9 / i7;
        return i8;
    }

    private final void zzh(short[] sArr, int i2, int i3) {
        zzk(i3);
        int i4 = this.zzb;
        System.arraycopy(sArr, i2 * i4, this.zzj, this.zzr * i4, i4 * i3);
        this.zzr += i3;
    }

    private final void zzi(short[] sArr, int i2, int i3) {
        int i4 = this.zze / i3;
        int i5 = this.zzb;
        int i6 = i3 * i5;
        int i7 = i2 * i5;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                i9 += sArr[(i8 * i6) + i7 + i10];
            }
            this.zzf[i8] = (short) (i9 / i6);
        }
    }

    private final void zzj(int i2) {
        int i3 = this.zzq;
        int i4 = this.zzg;
        if (i3 + i2 > i4) {
            int i5 = (i4 / 2) + i2 + i4;
            this.zzg = i5;
            this.zzh = Arrays.copyOf(this.zzh, i5 * this.zzb);
        }
    }

    private final void zzk(int i2) {
        int i3 = this.zzr;
        int i4 = this.zzi;
        if (i3 + i2 > i4) {
            int i5 = (i4 / 2) + i2 + i4;
            this.zzi = i5;
            this.zzj = Arrays.copyOf(this.zzj, i5 * this.zzb);
        }
    }

    private static void zzl(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
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

    private final void zzm() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = this.zzr;
        float f2 = this.zzo / this.zzp;
        double d2 = f2;
        int i11 = 1;
        if (d2 <= 1.00001d && d2 >= 0.99999d) {
            zzh(this.zzh, 0, this.zzq);
            this.zzq = 0;
        } else {
            int i12 = this.zzq;
            if (i12 >= this.zze) {
                int i13 = 0;
                while (true) {
                    int i14 = this.zzt;
                    if (i14 > 0) {
                        int min = Math.min(this.zze, i14);
                        zzh(this.zzh, i13, min);
                        this.zzt -= min;
                        i13 += min;
                    } else {
                        short[] sArr = this.zzh;
                        int i15 = this.zza;
                        int i16 = i15 > 4000 ? i15 / 4000 : 1;
                        if (this.zzb == i11 && i16 == i11) {
                            i2 = zzg(sArr, i13, this.zzc, this.zzd);
                        } else {
                            zzi(sArr, i13, i16);
                            int zzg = zzg(this.zzf, 0, this.zzc / i16, this.zzd / i16);
                            if (i16 != i11) {
                                int i17 = zzg * i16;
                                int i18 = i16 * 4;
                                int i19 = i17 - i18;
                                int i20 = i17 + i18;
                                int i21 = this.zzc;
                                if (i19 < i21) {
                                    i19 = i21;
                                }
                                int i22 = this.zzd;
                                if (i20 > i22) {
                                    i20 = i22;
                                }
                                if (this.zzb == i11) {
                                    i2 = zzg(sArr, i13, i19, i20);
                                } else {
                                    zzi(sArr, i13, i11);
                                    i2 = zzg(this.zzf, 0, i19, i20);
                                }
                            } else {
                                i2 = zzg;
                            }
                        }
                        int i23 = this.zzw;
                        int i24 = (i23 == 0 || (i5 = this.zzu) == 0 || this.zzx > i23 * 3 || i23 + i23 <= this.zzv * 3) ? i2 : i5;
                        this.zzv = i23;
                        this.zzu = i2;
                        if (d2 > 1.0d) {
                            short[] sArr2 = this.zzh;
                            if (f2 >= 2.0f) {
                                i4 = (int) (i24 / ((-1.0f) + f2));
                            } else {
                                this.zzt = (int) (((2.0f - f2) * i24) / ((-1.0f) + f2));
                                i4 = i24;
                            }
                            zzk(i4);
                            int i25 = i4;
                            zzl(i4, this.zzb, this.zzj, this.zzr, sArr2, i13, sArr2, i13 + i24);
                            this.zzr += i25;
                            i13 = i24 + i25 + i13;
                        } else {
                            int i26 = i24;
                            short[] sArr3 = this.zzh;
                            if (f2 < 0.5f) {
                                i3 = (int) ((i26 * f2) / (1.0f - f2));
                            } else {
                                this.zzt = (int) ((((f2 + f2) - 1.0f) * i26) / (1.0f - f2));
                                i3 = i26;
                            }
                            int i27 = i26 + i3;
                            zzk(i27);
                            int i28 = this.zzb;
                            System.arraycopy(sArr3, i13 * i28, this.zzj, this.zzr * i28, i28 * i26);
                            zzl(i3, this.zzb, this.zzj, this.zzr + i26, sArr3, i26 + i13, sArr3, i13);
                            this.zzr += i27;
                            i13 += i3;
                        }
                    }
                    if (this.zze + i13 > i12) {
                        break;
                    }
                    i11 = 1;
                }
                int i29 = this.zzq - i13;
                short[] sArr4 = this.zzh;
                int i30 = this.zzb;
                System.arraycopy(sArr4, i13 * i30, sArr4, 0, i30 * i29);
                this.zzq = i29;
            }
        }
        float f3 = this.zzp;
        if (f3 == 1.0f || this.zzr == i10) {
            return;
        }
        int i31 = this.zza;
        int i32 = (int) (i31 / f3);
        while (true) {
            if (i32 <= 16384 && i31 <= 16384) {
                break;
            }
            i32 /= 2;
            i31 /= 2;
        }
        int i33 = this.zzr - i10;
        int i34 = this.zzs;
        int i35 = this.zzk;
        if (i34 + i33 > i35) {
            int i36 = (i35 / 2) + i33 + i35;
            this.zzk = i36;
            this.zzl = Arrays.copyOf(this.zzl, i36 * this.zzb);
        }
        short[] sArr5 = this.zzj;
        int i37 = this.zzb;
        System.arraycopy(sArr5, i10 * i37, this.zzl, this.zzs * i37, i37 * i33);
        this.zzr = i10;
        this.zzs += i33;
        int i38 = 0;
        while (true) {
            i6 = this.zzs;
            i7 = i6 - 1;
            if (i38 >= i7) {
                break;
            }
            while (true) {
                i8 = this.zzm + 1;
                i9 = this.zzn;
                if (i8 * i32 <= i9 * i31) {
                    break;
                }
                zzk(1);
                int i39 = 0;
                while (true) {
                    int i40 = this.zzb;
                    if (i39 < i40) {
                        short[] sArr6 = this.zzj;
                        int i41 = this.zzr;
                        short[] sArr7 = this.zzl;
                        int i42 = (i38 * i40) + i39;
                        short s = sArr7[i42];
                        short s2 = sArr7[i42 + i40];
                        int i43 = this.zzn;
                        int i44 = this.zzm;
                        int i45 = (i44 + 1) * i32;
                        int i46 = i45 - (i43 * i31);
                        int i47 = i45 - (i44 * i32);
                        sArr6[(i41 * i40) + i39] = (short) ((((i47 - i46) * s2) + (s * i46)) / i47);
                        i39++;
                    }
                }
                this.zzn++;
                this.zzr++;
            }
            this.zzm = i8;
            if (i8 == i31) {
                this.zzm = 0;
                zzayy.zze(i9 == i32);
                this.zzn = 0;
            }
            i38++;
        }
        if (i7 != 0) {
            short[] sArr8 = this.zzl;
            int i48 = this.zzb;
            System.arraycopy(sArr8, i7 * i48, sArr8, 0, (i6 - i7) * i48);
            this.zzs -= i7;
        }
    }

    public final int zza() {
        return this.zzr;
    }

    public final void zzb(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.zzb, this.zzr);
        shortBuffer.put(this.zzj, 0, this.zzb * min);
        int i2 = this.zzr - min;
        this.zzr = i2;
        short[] sArr = this.zzj;
        int i3 = this.zzb;
        System.arraycopy(sArr, min * i3, sArr, 0, i2 * i3);
    }

    public final void zzc() {
        int i2;
        int i3 = this.zzq;
        float f2 = this.zzo;
        float f3 = this.zzp;
        int i4 = this.zzr + ((int) ((((i3 / (f2 / f3)) + this.zzs) / f3) + 0.5f));
        int i5 = this.zze;
        zzj(i5 + i5 + i3);
        int i6 = 0;
        while (true) {
            int i7 = this.zze;
            i2 = i7 + i7;
            int i8 = this.zzb;
            if (i6 >= i2 * i8) {
                break;
            }
            this.zzh[(i8 * i3) + i6] = 0;
            i6++;
        }
        this.zzq += i2;
        zzm();
        if (this.zzr > i4) {
            this.zzr = i4;
        }
        this.zzq = 0;
        this.zzt = 0;
        this.zzs = 0;
    }

    public final void zzd(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i2 = this.zzb;
        int i3 = remaining / i2;
        int i4 = i2 * i3;
        zzj(i3);
        shortBuffer.get(this.zzh, this.zzq * this.zzb, (i4 + i4) / 2);
        this.zzq += i3;
        zzm();
    }

    public final void zze(float f2) {
        this.zzp = f2;
    }

    public final void zzf(float f2) {
        this.zzo = f2;
    }
}
