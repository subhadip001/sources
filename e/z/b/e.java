package e.z.b;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: SwipeRefreshLayout.java */
/* loaded from: classes.dex */
public class e extends Animation {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f3035f;

    public e(SwipeRefreshLayout swipeRefreshLayout) {
        this.f3035f = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f2, Transformation transformation) {
        this.f3035f.setAnimationProgress(f2);
    }
}
