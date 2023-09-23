package f.h.b.c.c;

import android.animation.TypeEvaluator;

/* compiled from: ArgbEvaluatorCompat.java */
/* loaded from: classes.dex */
public class b implements TypeEvaluator<Integer> {
    public static final b a = new b();

    @Override // android.animation.TypeEvaluator
    public Integer evaluate(float f2, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f3 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = num2.intValue();
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float a2 = f.a.b.a.a.a(((intValue2 >> 24) & 255) / 255.0f, f3, f2, f3);
        float a3 = f.a.b.a.a.a(pow4, pow, f2, pow);
        float a4 = f.a.b.a.a.a((float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d), pow2, f2, pow2);
        float a5 = f.a.b.a.a.a((float) Math.pow((intValue2 & 255) / 255.0f, 2.2d), pow3, f2, pow3);
        int round = Math.round(((float) Math.pow(a3, 0.45454545454545453d)) * 255.0f) << 16;
        return Integer.valueOf(Math.round(((float) Math.pow(a5, 0.45454545454545453d)) * 255.0f) | round | (Math.round(a2 * 255.0f) << 24) | (Math.round(((float) Math.pow(a4, 0.45454545454545453d)) * 255.0f) << 8));
    }
}
