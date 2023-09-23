package e.i.c.d;

import android.graphics.Color;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* compiled from: CamColor.java */
/* loaded from: classes.dex */
public class a {
    public final float a;
    public final float b;
    public final float c;

    /* renamed from: d  reason: collision with root package name */
    public final float f2430d;

    /* renamed from: e  reason: collision with root package name */
    public final float f2431e;

    /* renamed from: f  reason: collision with root package name */
    public final float f2432f;

    public a(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.f2430d = f8;
        this.f2431e = f9;
        this.f2432f = f10;
    }

    public static a a(int i2) {
        float pow;
        l lVar = l.f2442k;
        float b = b.b(Color.red(i2));
        float b2 = b.b(Color.green(i2));
        float b3 = b.b(Color.blue(i2));
        float[][] fArr = b.f2433d;
        float[] fArr2 = {(fArr[0][2] * b3) + (fArr[0][1] * b2) + (fArr[0][0] * b), (fArr[1][2] * b3) + (fArr[1][1] * b2) + (fArr[1][0] * b), (b3 * fArr[2][2]) + (b2 * fArr[2][1]) + (b * fArr[2][0])};
        float[][] fArr3 = b.a;
        float f2 = (fArr2[2] * fArr3[0][2]) + (fArr2[1] * fArr3[0][1]) + (fArr2[0] * fArr3[0][0]);
        float f3 = (fArr2[2] * fArr3[1][2]) + (fArr2[1] * fArr3[1][1]) + (fArr2[0] * fArr3[1][0]);
        float f4 = fArr2[0] * fArr3[2][0];
        float f5 = fArr2[2] * fArr3[2][2];
        float[] fArr4 = lVar.f2446g;
        float f6 = fArr4[0] * f2;
        float f7 = fArr4[1] * f3;
        float f8 = fArr4[2] * (f5 + (fArr2[1] * fArr3[2][1]) + f4);
        float pow2 = (float) Math.pow((Math.abs(f6) * lVar.f2447h) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f7) * lVar.f2447h) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((Math.abs(f8) * lVar.f2447h) / 100.0d, 0.42d);
        float signum = ((Math.signum(f6) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f7) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f8) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d2 = signum3;
        float f9 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d2)) / 11.0f;
        float f10 = ((float) ((signum + signum2) - (d2 * 2.0d))) / 9.0f;
        float f11 = signum2 * 20.0f;
        float f12 = ((21.0f * signum3) + ((signum * 20.0f) + f11)) / 20.0f;
        float f13 = (((signum * 40.0f) + f11) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f10, f9)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f14 = atan2;
        float f15 = (3.1415927f * f14) / 180.0f;
        float pow5 = ((float) Math.pow((f13 * lVar.b) / lVar.a, lVar.f2443d * lVar.f2449j)) * 100.0f;
        float sqrt = (lVar.a + 4.0f) * (4.0f / lVar.f2443d) * ((float) Math.sqrt(pow5 / 100.0f)) * lVar.f2448i;
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, lVar.f2445f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f14) < 20.14d ? 360.0f + f14 : f14) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.f2444e) * lVar.c) * ((float) Math.sqrt((f10 * f10) + (f9 * f9)))) / (f12 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        float f16 = pow6 * lVar.f2448i;
        float sqrt2 = ((float) Math.sqrt((pow * lVar.f2443d) / (lVar.a + 4.0f))) * 50.0f;
        float f17 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((0.0228f * f16) + 1.0f)) * 43.85965f;
        double d3 = f15;
        return new a(f14, pow6, pow5, sqrt, f16, sqrt2, f17, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    public static a b(float f2, float f3, float f4) {
        double d2;
        l lVar = l.f2442k;
        float sqrt = (lVar.a + 4.0f) * (4.0f / lVar.f2443d) * ((float) Math.sqrt(f2 / 100.0d));
        float f5 = lVar.f2448i;
        float f6 = sqrt * f5;
        float f7 = f3 * f5;
        float sqrt2 = ((float) Math.sqrt(((f3 / ((float) Math.sqrt(d2))) * lVar.f2443d) / (lVar.a + 4.0f))) * 50.0f;
        float f8 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float log = ((float) Math.log((f7 * 0.0228d) + 1.0d)) * 43.85965f;
        double d3 = (3.1415927f * f4) / 180.0f;
        return new a(f4, f3, f2, f6, f7, sqrt2, f8, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    public int c(l lVar) {
        float f2;
        float f3 = this.b;
        if (f3 != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            double d2 = this.c;
            if (d2 != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                f2 = f3 / ((float) Math.sqrt(d2 / 100.0d));
                float pow = (float) Math.pow(f2 / Math.pow(1.64d - Math.pow(0.29d, lVar.f2445f), 0.73d), 1.1111111111111112d);
                double d3 = (this.a * 3.1415927f) / 180.0f;
                float pow2 = lVar.a * ((float) Math.pow(this.c / 100.0d, (1.0d / lVar.f2443d) / lVar.f2449j));
                float cos = ((float) (Math.cos(2.0d + d3) + 3.8d)) * 0.25f * 3846.1538f * lVar.f2444e * lVar.c;
                float f4 = pow2 / lVar.b;
                float sin = (float) Math.sin(d3);
                float cos2 = (float) Math.cos(d3);
                float f5 = (((0.305f + f4) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (cos * 23.0f)));
                float f6 = cos2 * f5;
                float f7 = f5 * sin;
                float f8 = f4 * 460.0f;
                float f9 = ((288.0f * f7) + ((451.0f * f6) + f8)) / 1403.0f;
                float f10 = ((f8 - (891.0f * f6)) - (261.0f * f7)) / 1403.0f;
                float f11 = ((f8 - (f6 * 220.0f)) - (f7 * 6300.0f)) / 1403.0f;
                float signum = (100.0f / lVar.f2447h) * Math.signum(f9) * ((float) Math.pow((float) Math.max((double) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (Math.abs(f9) * 27.13d) / (400.0d - Math.abs(f9))), 2.380952380952381d));
                float signum2 = (100.0f / lVar.f2447h) * Math.signum(f10) * ((float) Math.pow((float) Math.max((double) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (Math.abs(f10) * 27.13d) / (400.0d - Math.abs(f10))), 2.380952380952381d));
                float signum3 = Math.signum(f11);
                float[] fArr = lVar.f2446g;
                float f12 = signum / fArr[0];
                float f13 = signum2 / fArr[1];
                float pow3 = (((100.0f / lVar.f2447h) * signum3) * ((float) Math.pow((float) Math.max((double) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (Math.abs(f11) * 27.13d) / (400.0d - Math.abs(f11))), 2.380952380952381d))) / fArr[2];
                float[][] fArr2 = b.b;
                float f14 = (fArr2[0][2] * pow3) + (fArr2[0][1] * f13) + (fArr2[0][0] * f12);
                float f15 = (fArr2[1][2] * pow3) + (fArr2[1][1] * f13) + (fArr2[1][0] * f12);
                float f16 = f12 * fArr2[2][0];
                return e.i.d.a.a(f14, f15, (pow3 * fArr2[2][2]) + (f13 * fArr2[2][1]) + f16);
            }
        }
        f2 = 0.0f;
        float pow4 = (float) Math.pow(f2 / Math.pow(1.64d - Math.pow(0.29d, lVar.f2445f), 0.73d), 1.1111111111111112d);
        double d32 = (this.a * 3.1415927f) / 180.0f;
        float pow22 = lVar.a * ((float) Math.pow(this.c / 100.0d, (1.0d / lVar.f2443d) / lVar.f2449j));
        float cos3 = ((float) (Math.cos(2.0d + d32) + 3.8d)) * 0.25f * 3846.1538f * lVar.f2444e * lVar.c;
        float f42 = pow22 / lVar.b;
        float sin2 = (float) Math.sin(d32);
        float cos22 = (float) Math.cos(d32);
        float f52 = (((0.305f + f42) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (((11.0f * pow4) * cos22) + (cos3 * 23.0f)));
        float f62 = cos22 * f52;
        float f72 = f52 * sin2;
        float f82 = f42 * 460.0f;
        float f92 = ((288.0f * f72) + ((451.0f * f62) + f82)) / 1403.0f;
        float f102 = ((f82 - (891.0f * f62)) - (261.0f * f72)) / 1403.0f;
        float f112 = ((f82 - (f62 * 220.0f)) - (f72 * 6300.0f)) / 1403.0f;
        float signum4 = (100.0f / lVar.f2447h) * Math.signum(f92) * ((float) Math.pow((float) Math.max((double) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (Math.abs(f92) * 27.13d) / (400.0d - Math.abs(f92))), 2.380952380952381d));
        float signum22 = (100.0f / lVar.f2447h) * Math.signum(f102) * ((float) Math.pow((float) Math.max((double) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (Math.abs(f102) * 27.13d) / (400.0d - Math.abs(f102))), 2.380952380952381d));
        float signum32 = Math.signum(f112);
        float[] fArr3 = lVar.f2446g;
        float f122 = signum4 / fArr3[0];
        float f132 = signum22 / fArr3[1];
        float pow32 = (((100.0f / lVar.f2447h) * signum32) * ((float) Math.pow((float) Math.max((double) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (Math.abs(f112) * 27.13d) / (400.0d - Math.abs(f112))), 2.380952380952381d))) / fArr3[2];
        float[][] fArr22 = b.b;
        float f142 = (fArr22[0][2] * pow32) + (fArr22[0][1] * f132) + (fArr22[0][0] * f122);
        float f152 = (fArr22[1][2] * pow32) + (fArr22[1][1] * f132) + (fArr22[1][0] * f122);
        float f162 = f122 * fArr22[2][0];
        return e.i.d.a.a(f142, f152, (pow32 * fArr22[2][2]) + (f132 * fArr22[2][1]) + f162);
    }
}
