package e.a0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import e.i.j.z;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Fade.java */
/* loaded from: classes.dex */
public class c extends a0 {

    /* compiled from: Fade.java */
    /* loaded from: classes.dex */
    public class a extends k {
        public final /* synthetic */ View a;

        public a(c cVar, View view) {
            this.a = view;
        }

        @Override // e.a0.h.d
        public void c(h hVar) {
            View view = this.a;
            y yVar = s.a;
            yVar.e(view, 1.0f);
            yVar.a(this.a);
            hVar.v(this);
        }
    }

    /* compiled from: Fade.java */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter {
        public final View a;
        public boolean b = false;

        public b(View view) {
            this.a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            s.a.e(this.a, 1.0f);
            if (this.b) {
                this.a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            View view = this.a;
            AtomicInteger atomicInteger = e.i.j.z.a;
            if (z.d.h(view) && this.a.getLayerType() == 0) {
                this.b = true;
                this.a.setLayerType(2, null);
            }
        }
    }

    public c(int i2) {
        if ((i2 & (-4)) == 0) {
            this.C = i2;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // e.a0.a0
    public Animator J(ViewGroup viewGroup, View view, p pVar, p pVar2) {
        s.a.c(view);
        Float f2 = (Float) pVar.a.get("android:fade:transitionAlpha");
        return K(view, f2 != null ? f2.floatValue() : 1.0f, 0.0f);
    }

    public final Animator K(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        s.a.e(view, f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, s.b, f3);
        ofFloat.addListener(new b(view));
        a(new a(this, view));
        return ofFloat;
    }

    @Override // e.a0.h
    public void g(p pVar) {
        H(pVar);
        pVar.a.put("android:fade:transitionAlpha", Float.valueOf(s.a(pVar.b)));
    }

    public c() {
    }
}
