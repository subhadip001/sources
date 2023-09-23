package f.h.b.c.b0;

import android.animation.ValueAnimator;

/* compiled from: DropdownMenuEndIconDelegate.java */
/* loaded from: classes.dex */
public class k implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ h a;

    public k(h hVar) {
        this.a = hVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
