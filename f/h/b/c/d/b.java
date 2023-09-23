package f.h.b.c.d;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: AppBarLayout.java */
/* loaded from: classes.dex */
public class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ f.h.b.c.y.g a;
    public final /* synthetic */ AppBarLayout b;

    public b(AppBarLayout appBarLayout, f.h.b.c.y.g gVar) {
        this.b = appBarLayout;
        this.a = gVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.a.q(floatValue);
        Drawable drawable = this.b.v;
        if (drawable instanceof f.h.b.c.y.g) {
            ((f.h.b.c.y.g) drawable).q(floatValue);
        }
        for (AppBarLayout.d dVar : this.b.t) {
            dVar.a(floatValue, this.a.z);
        }
    }
}
