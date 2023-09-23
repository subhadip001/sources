package f.h.b.c.s;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* compiled from: StateListAnimator.java */
/* loaded from: classes.dex */
public final class n {
    public final ArrayList<b> a = new ArrayList<>();
    public b b = null;
    public ValueAnimator c = null;

    /* renamed from: d  reason: collision with root package name */
    public final Animator.AnimatorListener f5429d = new a();

    /* compiled from: StateListAnimator.java */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            n nVar = n.this;
            if (nVar.c == animator) {
                nVar.c = null;
            }
        }
    }

    /* compiled from: StateListAnimator.java */
    /* loaded from: classes.dex */
    public static class b {
        public final int[] a;
        public final ValueAnimator b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.a = iArr;
            this.b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f5429d);
        this.a.add(bVar);
    }
}
