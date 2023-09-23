package f.n.a.k.c;

import android.animation.Animator;

/* compiled from: BaseDialog.java */
/* loaded from: classes2.dex */
public class b implements Animator.AnimatorListener {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ a b;

    public b(a aVar, Runnable runnable) {
        this.b = aVar;
        this.a = runnable;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.b.f6978l = false;
        this.a.run();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }
}
