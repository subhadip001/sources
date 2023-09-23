package f.h.b.c.g;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: BottomAppBar.java */
/* loaded from: classes.dex */
public class a extends AnimatorListenerAdapter {
    public final /* synthetic */ BottomAppBar a;

    public a(BottomAppBar bottomAppBar) {
        this.a = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        BottomAppBar.x(this.a);
        this.a.a0 = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.a.f0++;
    }
}
