package e.u.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import e.u.b.k;
import java.util.Objects;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public class j extends AnimatorListenerAdapter {
    public final /* synthetic */ k.a a;
    public final /* synthetic */ ViewPropertyAnimator b;
    public final /* synthetic */ View c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f2862d;

    public j(k kVar, k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2862d = kVar;
        this.a = aVar;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        this.c.setTranslationX(0.0f);
        this.c.setTranslationY(0.0f);
        this.f2862d.c(this.a.b);
        this.f2862d.r.remove(this.a.b);
        this.f2862d.k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        k kVar = this.f2862d;
        RecyclerView.a0 a0Var = this.a.b;
        Objects.requireNonNull(kVar);
    }
}
