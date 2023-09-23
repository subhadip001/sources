package f.h.b.c.m;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: CircularRevealCompat.java */
/* loaded from: classes.dex */
public class a extends AnimatorListenerAdapter {
    public final /* synthetic */ c a;

    public a(c cVar) {
        this.a = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.a.b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.a.a();
    }
}
