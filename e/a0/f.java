package e.a0;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* compiled from: RectEvaluator.java */
/* loaded from: classes.dex */
public class f implements TypeEvaluator<Rect> {
    @Override // android.animation.TypeEvaluator
    public Rect evaluate(float f2, Rect rect, Rect rect2) {
        Rect rect3 = rect;
        Rect rect4 = rect2;
        int i2 = rect3.left;
        int i3 = i2 + ((int) ((rect4.left - i2) * f2));
        int i4 = rect3.top;
        int i5 = i4 + ((int) ((rect4.top - i4) * f2));
        int i6 = rect3.right;
        int i7 = rect3.bottom;
        return new Rect(i3, i5, i6 + ((int) ((rect4.right - i6) * f2)), i7 + ((int) ((rect4.bottom - i7) * f2)));
    }
}
