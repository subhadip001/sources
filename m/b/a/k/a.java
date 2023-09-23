package m.b.a.k;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import i.l.b.i;

/* compiled from: DepthPageTransformer.kt */
/* loaded from: classes2.dex */
public final class a implements ViewPager2.g {
    @Override // androidx.viewpager2.widget.ViewPager2.g
    public void a(View view, float f2) {
        i.e(view, "view");
        int width = view.getWidth();
        if (f2 < -1.0f) {
            view.setAlpha(0.0f);
        } else if (f2 <= 0.0f) {
            view.setAlpha(1.0f);
            view.setTranslationX(0.0f);
            view.setTranslationZ(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        } else if (f2 <= 1.0f) {
            float f3 = 1;
            view.setAlpha(f3 - f2);
            view.setTranslationX(width * (-f2));
            view.setTranslationZ(-1.0f);
            float abs = ((f3 - Math.abs(f2)) * 0.25f) + 0.75f;
            view.setScaleX(abs);
            view.setScaleY(abs);
        } else {
            view.setAlpha(0.0f);
        }
    }
}
