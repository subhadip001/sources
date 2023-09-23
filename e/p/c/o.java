package e.p.c;

import android.view.View;
import androidx.fragment.app.Fragment;
import e.i.f.b;

/* compiled from: FragmentAnim.java */
/* loaded from: classes.dex */
public class o implements b.a {
    public final /* synthetic */ Fragment a;

    public o(Fragment fragment) {
        this.a = fragment;
    }

    @Override // e.i.f.b.a
    public void a() {
        if (this.a.getAnimatingAway() != null) {
            View animatingAway = this.a.getAnimatingAway();
            this.a.setAnimatingAway(null);
            animatingAway.clearAnimation();
        }
        this.a.setAnimator(null);
    }
}
