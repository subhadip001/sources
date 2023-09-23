package f.h.b.c.h;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import f.h.b.c.y.g;

/* compiled from: BottomSheetBehavior.java */
/* loaded from: classes.dex */
public class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BottomSheetBehavior a;

    public a(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        g gVar = this.a.f1091h;
        if (gVar != null) {
            gVar.s(floatValue);
        }
    }
}
