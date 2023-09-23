package e.p.c;

import android.animation.Animator;
import android.view.animation.Animation;

/* compiled from: FragmentAnim.java */
/* loaded from: classes.dex */
public class r {
    public final Animation a;
    public final Animator b;

    public r(Animation animation) {
        this.a = animation;
        this.b = null;
    }

    public r(Animator animator) {
        this.a = null;
        this.b = animator;
    }
}
