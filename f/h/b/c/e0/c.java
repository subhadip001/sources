package f.h.b.c.e0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.FabTransformationBehavior;
import f.h.b.c.m.c;

/* compiled from: FabTransformationBehavior.java */
/* loaded from: classes.dex */
public class c extends AnimatorListenerAdapter {
    public final /* synthetic */ f.h.b.c.m.c a;

    public c(FabTransformationBehavior fabTransformationBehavior, f.h.b.c.m.c cVar) {
        this.a = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        c.e revealInfo = this.a.getRevealInfo();
        revealInfo.c = Float.MAX_VALUE;
        this.a.setRevealInfo(revealInfo);
    }
}
