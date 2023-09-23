package e.i.c.d;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* compiled from: ViewingConditions.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: k  reason: collision with root package name */
    public static final l f2442k;
    public final float a;
    public final float b;
    public final float c;

    /* renamed from: d  reason: collision with root package name */
    public final float f2443d;

    /* renamed from: e  reason: collision with root package name */
    public final float f2444e;

    /* renamed from: f  reason: collision with root package name */
    public final float f2445f;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f2446g;

    /* renamed from: h  reason: collision with root package name */
    public final float f2447h;

    /* renamed from: i  reason: collision with root package name */
    public final float f2448i;

    /* renamed from: j  reason: collision with root package name */
    public final float f2449j;

    static {
        float[] fArr = b.c;
        float c = (float) ((b.c(50.0f) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.a;
        float f2 = (fArr[2] * fArr2[0][2]) + (fArr[1] * fArr2[0][1]) + (fArr[0] * fArr2[0][0]);
        float f3 = (fArr[2] * fArr2[1][2]) + (fArr[1] * fArr2[1][1]) + (fArr[0] * fArr2[1][0]);
        float f4 = (fArr[2] * fArr2[2][2]) + (fArr[1] * fArr2[2][1]) + (fArr[0] * fArr2[2][0]);
        float f5 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-c) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d2 = exp;
        if (d2 > 1.0d) {
            exp = 1.0f;
        } else if (d2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            exp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f2) * exp) + 1.0f) - exp, (((100.0f / f3) * exp) + 1.0f) - exp, (((100.0f / f4) * exp) + 1.0f) - exp};
        float f6 = 1.0f / ((5.0f * c) + 1.0f);
        float f7 = f6 * f6 * f6 * f6;
        float f8 = 1.0f - f7;
        float cbrt = (0.1f * f8 * f8 * ((float) Math.cbrt(c * 5.0d))) + (f7 * c);
        float c2 = b.c(50.0f) / fArr[1];
        double d3 = c2;
        float pow = 0.725f / ((float) Math.pow(d3, 0.2d));
        float[] fArr4 = {(float) Math.pow(((fArr3[0] * cbrt) * f2) / 100.0d, 0.42d), (float) Math.pow(((fArr3[1] * cbrt) * f3) / 100.0d, 0.42d), (float) Math.pow(((fArr3[2] * cbrt) * f4) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        f2442k = new l(c2, ((fArr5[2] * 0.05f) + (fArr5[0] * 2.0f) + fArr5[1]) * pow, pow, pow, f5, 1.0f, fArr3, cbrt, (float) Math.pow(cbrt, 0.25d), ((float) Math.sqrt(d3)) + 1.48f);
    }

    public l(float f2, float f3, float f4, float f5, float f6, float f7, float[] fArr, float f8, float f9, float f10) {
        this.f2445f = f2;
        this.a = f3;
        this.b = f4;
        this.c = f5;
        this.f2443d = f6;
        this.f2444e = f7;
        this.f2446g = fArr;
        this.f2447h = f8;
        this.f2448i = f9;
        this.f2449j = f10;
    }
}
