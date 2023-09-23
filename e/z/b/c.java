package e.z.b;

import android.animation.Animator;
import e.z.b.d;

/* compiled from: CircularProgressDrawable.java */
/* loaded from: classes.dex */
public class c implements Animator.AnimatorListener {
    public final /* synthetic */ d.a a;
    public final /* synthetic */ d b;

    public c(d dVar, d.a aVar) {
        this.b = dVar;
        this.a = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        this.b.a(1.0f, this.a, true);
        d.a aVar = this.a;
        aVar.f3032k = aVar.f3026e;
        aVar.f3033l = aVar.f3027f;
        aVar.f3034m = aVar.f3028g;
        aVar.a((aVar.f3031j + 1) % aVar.f3030i.length);
        d dVar = this.b;
        if (dVar.f3024k) {
            dVar.f3024k = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.a.b(false);
            return;
        }
        dVar.f3023j += 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.b.f3023j = 0.0f;
    }
}
