package e.p.c;

import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import e.p.c.l0;

/* compiled from: FragmentAnim.java */
/* loaded from: classes.dex */
public class p implements Animation.AnimationListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ Fragment b;
    public final /* synthetic */ l0.a c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e.i.f.b f2763d;

    /* compiled from: FragmentAnim.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (p.this.b.getAnimatingAway() != null) {
                p.this.b.setAnimatingAway(null);
                p pVar = p.this;
                ((FragmentManager.d) pVar.c).a(pVar.b, pVar.f2763d);
            }
        }
    }

    public p(ViewGroup viewGroup, Fragment fragment, l0.a aVar, e.i.f.b bVar) {
        this.a = viewGroup;
        this.b = fragment;
        this.c = aVar;
        this.f2763d = bVar;
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
