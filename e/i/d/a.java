package e.i.d;

import android.graphics.Color;

/* compiled from: ColorUtils.java */
/* loaded from: classes.dex */
public final class a {
    public static final ThreadLocal<double[]> a = new ThreadLocal<>();

    public static int a(double d2, double d3, double d4) {
        double d5 = (((-0.4986d) * d4) + (((-1.5372d) * d3) + (3.2406d * d2))) / 100.0d;
        double d6 = ((0.0415d * d4) + ((1.8758d * d3) + ((-0.9689d) * d2))) / 100.0d;
        double d7 = ((1.057d * d4) + (((-0.204d) * d3) + (0.0557d * d2))) / 100.0d;
        return Color.rgb(d((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d), 0, 255), d((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d), 0, 255), d((int) Math.round((d7 > 0.0031308d ? (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d : d7 * 12.92d) * 255.0d), 0, 255));
    }

    public static int b(int i2, int i3) {
        int alpha = Color.alpha(i3);
        int alpha2 = Color.alpha(i2);
        int i4 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i4, c(Color.red(i2), alpha2, Color.red(i3), alpha, i4), c(Color.green(i2), alpha2, Color.green(i3), alpha, i4), c(Color.blue(i2), alpha2, Color.blue(i3), alpha, i4));
    }

    public static int c(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            return 0;
        }
        return (((255 - i3) * (i4 * i5)) + ((i2 * 255) * i3)) / (i6 * 255);
    }

    public static int d(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    public static int e(int i2, int i3) {
        if (i3 < 0 || i3 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i2 & 16777215) | (i3 << 24);
    }
}
