package e.b.c;

/* compiled from: TwilightCalculator.java */
/* loaded from: classes.dex */
public class w {

    /* renamed from: d  reason: collision with root package name */
    public static w f1528d;
    public long a;
    public long b;
    public int c;

    public void a(long j2, double d2, double d3) {
        float f2;
        float f3;
        double d4;
        double d5 = (0.01720197f * (((float) (j2 - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(f3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f3) * 3.4906598739326E-4d) + (Math.sin(d5) * 0.03341960161924362d) + d5 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d5) * 0.0053d) + ((float) Math.round((f2 - 9.0E-4f) - d4)) + 9.0E-4f + ((-d3) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d6 = 0.01745329238474369d * d2;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d6))) / (Math.cos(asin) * Math.cos(d6));
        if (sin3 >= 1.0d) {
            this.c = 1;
            this.a = -1L;
            this.b = -1L;
        } else if (sin3 <= -1.0d) {
            this.c = 0;
            this.a = -1L;
            this.b = -1L;
        } else {
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.b = round;
            if (round < j2 && this.a > j2) {
                this.c = 0;
            } else {
                this.c = 1;
            }
        }
    }
}
