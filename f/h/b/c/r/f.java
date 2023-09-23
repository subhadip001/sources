package f.h.b.c.r;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes.dex */
public class f implements TypeEvaluator<Float> {
    public FloatEvaluator a = new FloatEvaluator();

    public f(e eVar) {
    }

    @Override // android.animation.TypeEvaluator
    public Float evaluate(float f2, Float f3, Float f4) {
        float floatValue = this.a.evaluate(f2, (Number) f3, (Number) f4).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
