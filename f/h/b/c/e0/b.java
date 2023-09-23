package f.h.b.c.e0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import com.google.android.material.transformation.FabTransformationBehavior;

/* compiled from: FabTransformationBehavior.java */
/* loaded from: classes.dex */
public class b extends AnimatorListenerAdapter {
    public final /* synthetic */ f.h.b.c.m.c a;
    public final /* synthetic */ Drawable b;

    public b(FabTransformationBehavior fabTransformationBehavior, f.h.b.c.m.c cVar, Drawable drawable) {
        this.a = cVar;
        this.b = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.a.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.a.setCircularRevealOverlayDrawable(this.b);
    }
}
