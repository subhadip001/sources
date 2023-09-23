package f.n.a.v.l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PreviewScreenView.java */
/* loaded from: classes2.dex */
public class h extends AnimatorListenerAdapter {
    public final /* synthetic */ g a;

    public h(g gVar) {
        this.a = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.t.setVisibility(8);
    }
}
