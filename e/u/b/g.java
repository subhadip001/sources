package e.u.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public class g extends AnimatorListenerAdapter {
    public final /* synthetic */ RecyclerView.a0 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ViewPropertyAnimator c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f2857d;

    public g(k kVar, RecyclerView.a0 a0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2857d = kVar;
        this.a = a0Var;
        this.b = view;
        this.c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.c.setListener(null);
        this.f2857d.c(this.a);
        this.f2857d.o.remove(this.a);
        this.f2857d.k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f2857d);
    }
}
