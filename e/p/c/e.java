package e.p.c;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import e.p.c.b;

/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: classes.dex */
public class e implements Animation.AnimationListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ b.C0053b c;

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            eVar.a.endViewTransition(eVar.b);
            e.this.c.a();
        }
    }

    public e(b bVar, ViewGroup viewGroup, View view, b.C0053b c0053b) {
        this.a = viewGroup;
        this.b = view;
        this.c = c0053b;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.a.post(new a());
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
