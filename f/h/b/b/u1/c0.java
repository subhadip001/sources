package f.h.b.b.u1;

import com.google.logging.type.LogSeverity;
import java.util.Arrays;

/* compiled from: Sonic.java */
/* loaded from: classes.dex */
public final class c0 {
    public final int a;
    public final int b;
    public final float c;

    /* renamed from: d  reason: collision with root package name */
    public final float f4529d;

    /* renamed from: e  reason: collision with root package name */
    public final float f4530e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4531f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4532g;

    /* renamed from: h  reason: collision with root package name */
    public final int f4533h;

    /* renamed from: i  reason: collision with root package name */
    public final short[] f4534i;

    /* renamed from: j  reason: collision with root package name */
    public short[] f4535j;

    /* renamed from: k  reason: collision with root package name */
    public int f4536k;

    /* renamed from: l  reason: collision with root package name */
    public short[] f4537l;

    /* renamed from: m  reason: collision with root package name */
    public int f4538m;
    public short[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;

    public c0(int i2, int i3, float f2, float f3, int i4) {
        this.a = i2;
        this.b = i3;
        this.c = f2;
        this.f4529d = f3;
        this.f4530e = i2 / i4;
        this.f4531f = i2 / LogSeverity.WARNING_VALUE;
        int i5 = i2 / 65;
        this.f4532g = i5;
        int i6 = i5 * 2;
        this.f4533h = i6;
        this.f4534i = new short[i6];
        this.f4535j = new short[i6 * i3];
        this.f4537l = new short[i6 * i3];
        this.n = new short[i6 * i3];
    }

    public static void e(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
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

    public final void a(short[] sArr, int i2, int i3) {
        short[] c = c(this.f4537l, this.f4538m, i3);
        this.f4537l = c;
        int i4 = this.b;
        System.arraycopy(sArr, i2 * i4, c, this.f4538m * i4, i4 * i3);
        this.f4538m += i3;
    }

    public final void b(short[] sArr, int i2, int i3) {
        int i4 = this.f4533h / i3;
        int i5 = this.b;
        int i6 = i3 * i5;
        int i7 = i2 * i5;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                i9 += sArr[(i8 * i6) + i7 + i10];
            }
            this.f4534i[i8] = (short) (i9 / i6);
        }
    }

    public final short[] c(short[] sArr, int i2, int i3) {
        int length = sArr.length;
        int i4 = this.b;
        int i5 = length / i4;
        return i2 + i3 <= i5 ? sArr : Arrays.copyOf(sArr, (((i5 * 3) / 2) + i3) * i4);
    }

    public final int d(short[] sArr, int i2, int i3, int i4) {
        int i5 = i2 * this.b;
        int i6 = 1;
        int i7 = 255;
        int i8 = 0;
        int i9 = 0;
        while (i3 <= i4) {
            int i10 = 0;
            for (int i11 = 0; i11 < i3; i11++) {
                i10 += Math.abs(sArr[i5 + i11] - sArr[(i5 + i3) + i11]);
            }
            if (i10 * i8 < i6 * i3) {
                i8 = i3;
                i6 = i10;
            }
            if (i10 * i7 > i9 * i3) {
                i7 = i3;
                i9 = i10;
            }
            i3++;
        }
        this.u = i6 / i8;
        this.v = i9 / i7;
        return i8;
    }

    public final void f() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.f4538m;
        float f2 = this.c;
        float f3 = this.f4529d;
        float f4 = f2 / f3;
        float f5 = this.f4530e * f3;
        double d2 = f4;
        float f6 = 1.0f;
        int i10 = 1;
        if (d2 <= 1.00001d && d2 >= 0.99999d) {
            a(this.f4535j, 0, this.f4536k);
            this.f4536k = 0;
        } else {
            int i11 = this.f4536k;
            if (i11 >= this.f4533h) {
                int i12 = 0;
                while (true) {
                    int i13 = this.r;
                    if (i13 > 0) {
                        int min = Math.min(this.f4533h, i13);
                        a(this.f4535j, i12, min);
                        this.r -= min;
                        i12 += min;
                    } else {
                        short[] sArr = this.f4535j;
                        int i14 = this.a;
                        int i15 = i14 > 4000 ? i14 / 4000 : 1;
                        if (this.b == i10 && i15 == i10) {
                            i2 = d(sArr, i12, this.f4531f, this.f4532g);
                        } else {
                            b(sArr, i12, i15);
                            int d3 = d(this.f4534i, 0, this.f4531f / i15, this.f4532g / i15);
                            if (i15 != i10) {
                                int i16 = d3 * i15;
                                int i17 = i15 * 4;
                                int i18 = i16 - i17;
                                int i19 = i16 + i17;
                                int i20 = this.f4531f;
                                if (i18 < i20) {
                                    i18 = i20;
                                }
                                int i21 = this.f4532g;
                                if (i19 > i21) {
                                    i19 = i21;
                                }
                                if (this.b == i10) {
                                    i2 = d(sArr, i12, i18, i19);
                                } else {
                                    b(sArr, i12, i10);
                                    i2 = d(this.f4534i, 0, i18, i19);
                                }
                            } else {
                                i2 = d3;
                            }
                        }
                        int i22 = this.u;
                        int i23 = i22 != 0 && this.s != 0 && this.v <= i22 * 3 && i22 * 2 > this.t * 3 ? this.s : i2;
                        this.t = i22;
                        this.s = i2;
                        if (d2 > 1.0d) {
                            short[] sArr2 = this.f4535j;
                            if (f4 >= 2.0f) {
                                i4 = (int) (i23 / (f4 - f6));
                            } else {
                                this.r = (int) (((2.0f - f4) * i23) / (f4 - f6));
                                i4 = i23;
                            }
                            short[] c = c(this.f4537l, this.f4538m, i4);
                            this.f4537l = c;
                            int i24 = i4;
                            e(i4, this.b, c, this.f4538m, sArr2, i12, sArr2, i12 + i23);
                            this.f4538m += i24;
                            i12 = i23 + i24 + i12;
                        } else {
                            int i25 = i23;
                            short[] sArr3 = this.f4535j;
                            if (f4 < 0.5f) {
                                i3 = (int) ((i25 * f4) / (f6 - f4));
                            } else {
                                this.r = (int) ((((2.0f * f4) - f6) * i25) / (f6 - f4));
                                i3 = i25;
                            }
                            int i26 = i25 + i3;
                            short[] c2 = c(this.f4537l, this.f4538m, i26);
                            this.f4537l = c2;
                            int i27 = this.b;
                            System.arraycopy(sArr3, i12 * i27, c2, this.f4538m * i27, i27 * i25);
                            e(i3, this.b, this.f4537l, this.f4538m + i25, sArr3, i12 + i25, sArr3, i12);
                            this.f4538m += i26;
                            i12 += i3;
                        }
                    }
                    if (this.f4533h + i12 > i11) {
                        break;
                    }
                    f6 = 1.0f;
                    i10 = 1;
                }
                int i28 = this.f4536k - i12;
                short[] sArr4 = this.f4535j;
                int i29 = this.b;
                System.arraycopy(sArr4, i12 * i29, sArr4, 0, i29 * i28);
                this.f4536k = i28;
            }
            f6 = 1.0f;
        }
        if (f5 == f6 || this.f4538m == i9) {
            return;
        }
        int i30 = this.a;
        int i31 = (int) (i30 / f5);
        while (true) {
            if (i31 <= 16384 && i30 <= 16384) {
                break;
            }
            i31 /= 2;
            i30 /= 2;
        }
        int i32 = this.f4538m - i9;
        short[] c3 = c(this.n, this.o, i32);
        this.n = c3;
        short[] sArr5 = this.f4537l;
        int i33 = this.b;
        System.arraycopy(sArr5, i9 * i33, c3, this.o * i33, i33 * i32);
        this.f4538m = i9;
        this.o += i32;
        int i34 = 0;
        while (true) {
            i5 = this.o;
            i6 = i5 - 1;
            if (i34 >= i6) {
                break;
            }
            while (true) {
                i7 = this.p + 1;
                int i35 = i7 * i31;
                i8 = this.q;
                if (i35 <= i8 * i30) {
                    break;
                }
                this.f4537l = c(this.f4537l, this.f4538m, 1);
                int i36 = 0;
                while (true) {
                    int i37 = this.b;
                    if (i36 < i37) {
                        short[] sArr6 = this.n;
                        int i38 = (i34 * i37) + i36;
                        short s = sArr6[i38];
                        short s2 = sArr6[i38 + i37];
                        int i39 = this.p;
                        int i40 = i39 * i31;
                        int i41 = (i39 + 1) * i31;
                        int i42 = i41 - (this.q * i30);
                        int i43 = i41 - i40;
                        this.f4537l[(this.f4538m * i37) + i36] = (short) ((((i43 - i42) * s2) + (s * i42)) / i43);
                        i36++;
                    }
                }
                this.q++;
                this.f4538m++;
            }
            this.p = i7;
            if (i7 == i30) {
                this.p = 0;
                f.h.b.b.e2.j.g(i8 == i31);
                this.q = 0;
            }
            i34++;
        }
        if (i6 == 0) {
            return;
        }
        short[] sArr7 = this.n;
        int i44 = this.b;
        System.arraycopy(sArr7, i6 * i44, sArr7, 0, (i5 - i6) * i44);
        this.o -= i6;
    }
}
