package e.i.j;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: ViewPropertyAnimatorCompat.java */
/* loaded from: classes.dex */
public final class b0 {
    public WeakReference<View> a;
    public int b = -1;

    /* compiled from: ViewPropertyAnimatorCompat.java */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ c0 a;
        public final /* synthetic */ View b;

        public a(b0 b0Var, c0 c0Var, View view) {
            this.a = c0Var;
            this.b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a.a(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.b(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.c(this.b);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat.java */
    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ e0 a;
        public final /* synthetic */ View b;

        public b(b0 b0Var, e0 e0Var, View view) {
            this.a = e0Var;
            this.b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((View) e.b.c.y.this.f1530d.getParent()).invalidate();
        }
    }

    public b0(View view) {
        this.a = new WeakReference<>(view);
    }

    public b0 a(float f2) {
        View view = this.a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    public void b() {
        View view = this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public b0 c(long j2) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
        return this;
    }

    public b0 d(c0 c0Var) {
        View view = this.a.get();
        if (view != null) {
            e(view, c0Var);
        }
        return this;
    }

    public final void e(View view, c0 c0Var) {
        if (c0Var != null) {
            view.animate().setListener(new a(this, c0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public b0 f(e0 e0Var) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setUpdateListener(e0Var != null ? new b(this, e0Var, view) : null);
        }
        return this;
    }

    public b0 g(float f2) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }
}
