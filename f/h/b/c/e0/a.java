package f.h.b.c.e0;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.transformation.FabTransformationBehavior;

/* compiled from: FabTransformationBehavior.java */
/* loaded from: classes.dex */
public class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View a;

    public a(FabTransformationBehavior fabTransformationBehavior, View view) {
        this.a = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.invalidate();
    }
}
