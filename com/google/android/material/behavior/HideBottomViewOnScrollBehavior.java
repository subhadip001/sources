package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public int a;
    public int b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public ViewPropertyAnimator f1071d;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f1071d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.a = 0;
        this.b = 2;
        this.c = 0;
    }

    public final void B(V v, int i2, long j2, TimeInterpolator timeInterpolator) {
        this.f1071d = v.animate().translationY(i2).setInterpolator(timeInterpolator).setDuration(j2).setListener(new a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, int i2) {
        this.a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void r(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (i3 > 0) {
            if (this.b == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f1071d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.b = 1;
            B(v, this.a + this.c, 175L, f.h.b.c.c.a.c);
        } else if (i3 < 0) {
            if (this.b == 2) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator2 = this.f1071d;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                v.clearAnimation();
            }
            this.b = 2;
            B(v, 0, 225L, f.h.b.c.c.a.f5223d);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean x(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
        return i2 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.b = 2;
        this.c = 0;
    }
}
