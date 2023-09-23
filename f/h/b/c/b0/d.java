package f.h.b.c.b0;

import android.animation.ValueAnimator;

/* compiled from: ClearTextEndIconDelegate.java */
/* loaded from: classes.dex */
public class d implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ a a;

    public d(a aVar) {
        this.a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
