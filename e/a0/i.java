package e.a0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: Transition.java */
/* loaded from: classes.dex */
public class i extends AnimatorListenerAdapter {
    public final /* synthetic */ e.f.a a;
    public final /* synthetic */ h b;

    public i(h hVar, e.f.a aVar) {
        this.b = hVar;
        this.a = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.a.remove(animator);
        this.b.r.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.b.r.add(animator);
    }
}
