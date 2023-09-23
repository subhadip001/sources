package e.u.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public class f extends AnimatorListenerAdapter {
    public final /* synthetic */ RecyclerView.a0 a;
    public final /* synthetic */ ViewPropertyAnimator b;
    public final /* synthetic */ View c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f2856d;

    public f(k kVar, RecyclerView.a0 a0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2856d = kVar;
        this.a = a0Var;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        this.f2856d.c(this.a);
        this.f2856d.q.remove(this.a);
        this.f2856d.k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f2856d);
    }
}
