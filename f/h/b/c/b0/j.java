package f.h.b.c.b0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: DropdownMenuEndIconDelegate.java */
/* loaded from: classes.dex */
public class j extends AnimatorListenerAdapter {
    public final /* synthetic */ h a;

    public j(h hVar) {
        this.a = hVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        h hVar = this.a;
        hVar.c.setChecked(hVar.f5179m);
        this.a.s.start();
    }
}
