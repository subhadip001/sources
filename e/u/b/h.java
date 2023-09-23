package e.u.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public class h extends AnimatorListenerAdapter {
    public final /* synthetic */ RecyclerView.a0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2858d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2859e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ k f2860f;

    public h(k kVar, RecyclerView.a0 a0Var, int i2, View view, int i3, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2860f = kVar;
        this.a = a0Var;
        this.b = i2;
        this.c = view;
        this.f2858d = i3;
        this.f2859e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        if (this.b != 0) {
            this.c.setTranslationX(0.0f);
        }
        if (this.f2858d != 0) {
            this.c.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f2859e.setListener(null);
        this.f2860f.c(this.a);
        this.f2860f.p.remove(this.a);
        this.f2860f.k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f2860f);
    }
}
