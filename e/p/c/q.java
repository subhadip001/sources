package e.p.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import e.p.c.l0;

/* compiled from: FragmentAnim.java */
/* loaded from: classes.dex */
public class q extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Fragment c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ l0.a f2767d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ e.i.f.b f2768e;

    public q(ViewGroup viewGroup, View view, Fragment fragment, l0.a aVar, e.i.f.b bVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = fragment;
        this.f2767d = aVar;
        this.f2768e = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.a.endViewTransition(this.b);
        Animator animator2 = this.c.getAnimator();
        this.c.setAnimator(null);
        if (animator2 == null || this.a.indexOfChild(this.b) >= 0) {
            return;
        }
        ((FragmentManager.d) this.f2767d).a(this.c, this.f2768e);
    }
}
